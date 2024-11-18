package net.runelite.client.plugins.paistisuite.api;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.runelite.api.*;
import net.runelite.api.widgets.Widget;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.function.Consumer;

/**
 * A menu entry in a right-click menu.
 */
@Data
@NoArgsConstructor
public class NewMenuEntry implements MenuEntry {

    /**
     * The option text added to the menu. (ie. "Walk here", "Use")
     */
    private String option;
    /**
     * The target of the action. (ie. Item or Actor name)
     * <p>
     * If the option does not apply to any target, this field
     * will be set to empty string.
     */
    private String target;
    /**
     * An identifier value for the target of the action.
     */
    private int identifier;
    /**
     * The action the entry will trigger.
     * {@link MenuAction}
     */
    private MenuAction type;
    /**
     * An additional parameter for the action.
     */
    private int param0;
    /**
     * A second additional parameter for the action.
     */
    private int param1;
    /**
     * If this field is true and you have single mouse button on and this entry is
     * the top entry the right click menu will not be opened when you left click
     * <p>
     * This is used  for shift click
     */
    private boolean forceLeftClick;

    @Setter
    private int itemOp = -1;

    @Setter
    private Widget widget;

    public NewMenuEntry(String option, String target, int identifier, int opcode, int param0, int param1, boolean forceLeftClick) {
        this.option = option;
        this.target = target;
        this.identifier = identifier;
        this.type = MenuAction.of(opcode);
        this.param0 = param0;
        this.param1 = param1;
        this.forceLeftClick = forceLeftClick;
    }

    public NewMenuEntry(String option, String target, int identifier, MenuAction type, int param0, int param1, boolean forceLeftClick) {
        this.option = option;
        this.target = target;
        this.identifier = identifier;
        this.type = type;
        this.param0 = param0;
        this.param1 = param1;
        this.forceLeftClick = forceLeftClick;
    }

    @Override
    public String getOption() {
        return this.option;
    }

    @Override
    public MenuEntry setOption(String option) {
        this.option = option;
        return this;
    }

    @Override
    public String getTarget() {
        return this.target;
    }

    @Override
    public MenuEntry setTarget(String target) {
        this.target = target;
        return this;
    }

    @Override
    public int setItemId() {
        return -1;
    }

    @Override
    public int getIdentifier() {
        return this.identifier;
    }

    @Override
    public MenuEntry setIdentifier(int identifier) {
        this.identifier = identifier;
        return this;
    }

    @Override
    public MenuAction getType() {
        return this.type;
    }

    @Override
    public MenuEntry setType(MenuAction type) {
        this.type = type;
        return this;
    }

    @Override
    public int getParam0() {
        return this.param0;
    }

    @Override
    public MenuEntry setParam0(int param0) {
        this.param0 = param0;
        return this;
    }

    @Override
    public int getParam1() {
        return this.param1;
    }

    @Override
    public MenuEntry setParam1(int param1) {
        this.param1 = param1;
        return this;
    }

    @Override
    public boolean isForceLeftClick() {
        return this.forceLeftClick;
    }

    @Override
    public MenuEntry setForceLeftClick(boolean forceLeftClick) {
        this.forceLeftClick = forceLeftClick;
        return this;
    }

    @Override
    public int getWorldViewId() {
        return 0;
    }

    @Override
    public MenuEntry setWorldViewId(int worldViewId) {
        return null;
    }

    @Override
    public boolean isDeprioritized() {
        return false;
    }

    @Override
    public MenuEntry setDeprioritized(boolean deprioritized) {
        return this;
    }

    @Override
    public MenuEntry onClick(Consumer<MenuEntry> callback) {
        return this;
    }

    @Override
    public Consumer<MenuEntry> onClick() {
        return null;
    }

    @Override
    public boolean isItemOp() {
        return itemOp != -1;
    }

    @Override
    public int getItemOp() {
        return itemOp;
    }

    @Override
    public int getItemId() {
        return -1;
    }

    @Override
    public MenuEntry setItemId(int itemId) {
        return null;
    }

    @Override
    public int getActionParam1() {
        return this.param1;
    }

    @Override
    public MenuAction getMenuAction() {
        return this.type;
    }

    @Nullable
    @Override
    public Widget getWidget() {
        return widget;
    }

    @Override
    public @org.jetbrains.annotations.Nullable NPC getNpc() {
        return null;
    }

    @Override
    public @org.jetbrains.annotations.Nullable Player getPlayer() {
        return null;
    }

    @Override
    public @org.jetbrains.annotations.Nullable Actor getActor() {
        return null;
    }

    @Override
    public @org.jetbrains.annotations.Nullable Menu getSubMenu() {
        return null;
    }

    @Override
    public @NotNull Menu createSubMenu() {
        return null;
    }

    @Override
    public void deleteSubMenu() {

    }
}
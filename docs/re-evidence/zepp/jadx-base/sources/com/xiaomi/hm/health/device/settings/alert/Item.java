package com.xiaomi.hm.health.device.settings.alert;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/Item;", "", "Lcom/xiaomi/hm/health/device/settings/alert/Type;", "component1", "Lcom/xiaomi/hm/health/device/settings/alert/State;", "component2", "Lcom/xiaomi/hm/health/device/settings/alert/ItemAction;", "component3", "type", "state", "action", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/device/settings/alert/Type;", "getType", "()Lcom/xiaomi/hm/health/device/settings/alert/Type;", "b", "Lcom/xiaomi/hm/health/device/settings/alert/State;", "getState", "()Lcom/xiaomi/hm/health/device/settings/alert/State;", "c", "Lcom/xiaomi/hm/health/device/settings/alert/ItemAction;", "getAction", "()Lcom/xiaomi/hm/health/device/settings/alert/ItemAction;", "<init>", "(Lcom/xiaomi/hm/health/device/settings/alert/Type;Lcom/xiaomi/hm/health/device/settings/alert/State;Lcom/xiaomi/hm/health/device/settings/alert/ItemAction;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Item {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Type type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final State state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final ItemAction action;

    public Item(@NotNull Type type, @NotNull State state, @NotNull ItemAction itemAction) {
        this.type = type;
        this.state = state;
        this.action = itemAction;
    }

    public static /* synthetic */ Item copy$default(Item item, Type type, State state, ItemAction itemAction, int i, Object obj) {
        if ((i & 1) != 0) {
            type = item.type;
        }
        if ((i & 2) != 0) {
            state = item.state;
        }
        if ((i & 4) != 0) {
            itemAction = item.action;
        }
        return item.copy(type, state, itemAction);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ItemAction getAction() {
        return this.action;
    }

    @NotNull
    public final Item copy(@NotNull Type type, @NotNull State state, @NotNull ItemAction action) {
        return new Item(type, state, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Item)) {
            return false;
        }
        Item item = (Item) other;
        return Intrinsics.areEqual(this.type, item.type) && Intrinsics.areEqual(this.state, item.state) && Intrinsics.areEqual(this.action, item.action);
    }

    @NotNull
    public final ItemAction getAction() {
        return this.action;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.state.hashCode()) * 31) + this.action.hashCode();
    }

    @NotNull
    public String toString() {
        return "Item(type=" + this.type + ", state=" + this.state + ", action=" + this.action + ")";
    }
}

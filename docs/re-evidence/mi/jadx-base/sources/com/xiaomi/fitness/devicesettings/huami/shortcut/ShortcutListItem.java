package com.xiaomi.fitness.devicesettings.huami.shortcut;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.settingitem.SecondaryScreenItem;
import defpackage.jni;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00010BA\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u000f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJL\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\nR\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b&\u0010\nR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b'\u0010\nR\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\"\u001a\u0004\b\u0016\u0010\r\"\u0004\b(\u0010%R\u0011\u0010*\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b)\u0010\nR\u0011\u0010,\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\nR\u0011\u0010-\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010\r¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "", "", "toggleStatus", "()V", "", "component1", "()Ljava/lang/String;", "", "component2", "()I", "", "component3", "()Z", "component4", "component5", "component6", "name", "targetIndex", "enable", "type", "subType", "isDragging", "copy", "(Ljava/lang/String;IZIIZ)Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "I", "getTargetIndex", "Z", "getEnable", "setEnable", "(Z)V", "getType", "getSubType", "setDragging", "getIcon", "icon", "getDragIconVisibility", "dragIconVisibility", "isAlwaysShown", "<init>", "(Ljava/lang/String;IZIIZ)V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final /* data */ class ShortcutListItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int TYPE_ITEM = 0;
    public static final int TYPE_LABEL = 1;
    private boolean enable;
    private boolean isDragging;

    @NotNull
    private final String name;
    private final int subType;
    private final int targetIndex;
    private final int type;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem$Companion;", "", "<init>", "()V", "TYPE_ITEM", "", "TYPE_LABEL", "valueOf", "Lcom/xiaomi/fitness/devicesettings/huami/shortcut/ShortcutListItem;", "item", "Lcom/xiaomi/fitness/settingitem/settingitem/SecondaryScreenItem;", "getShortcutItemName", "", "type", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getShortcutItemName(int type) {
            if (type == 1) {
                return ResourceExtKt.getString(wzi.D2);
            }
            if (type == 2) {
                return ResourceExtKt.getString(wzi.c2);
            }
            if (type == 3) {
                return ResourceExtKt.getString(wzi.B2);
            }
            if (type == 4) {
                return ResourceExtKt.getString(wzi.I2);
            }
            if (type == 6) {
                return ResourceExtKt.getString(wzi.o2);
            }
            if (type == 21) {
                return ResourceExtKt.getString(wzi.R1);
            }
            if (type == 38) {
                return ResourceExtKt.getString(wzi.y2);
            }
            if (type == 49) {
                return ResourceExtKt.getString(wzi.J2);
            }
            if (type == 51) {
                return ResourceExtKt.getString(wzi.G1);
            }
            if (type == 67) {
                return ResourceExtKt.getString(wzi.Y1);
            }
            if (type == 25) {
                return ResourceExtKt.getString(wzi.q2);
            }
            if (type == 26) {
                return ResourceExtKt.getString(wzi.L2);
            }
            if (type == 35) {
                return ResourceExtKt.getString(wzi.A2);
            }
            if (type == 36) {
                return ResourceExtKt.getString(wzi.p2);
            }
            if (type == 56) {
                return ResourceExtKt.getString(wzi.u2);
            }
            if (type == 57) {
                return ResourceExtKt.getString(wzi.p);
            }
            switch (type) {
                case 8:
                    return ResourceExtKt.getString(wzi.P1);
                case 9:
                    return ResourceExtKt.getString(wzi.C1);
                case 10:
                    return ResourceExtKt.getString(wzi.t2);
                case 11:
                    return ResourceExtKt.getString(wzi.l2);
                case 12:
                    return ResourceExtKt.getString(wzi.E2);
                case 13:
                    return ResourceExtKt.getString(wzi.L1);
                case 14:
                    return ResourceExtKt.getString(wzi.X1);
                case 15:
                    return ResourceExtKt.getString(wzi.s2);
                case 16:
                    return ResourceExtKt.getString(wzi.I1);
                case 17:
                    return ResourceExtKt.getString(wzi.E1);
                case 18:
                    return ResourceExtKt.getString(wzi.F1);
                default:
                    switch (type) {
                        case 28:
                            return ResourceExtKt.getString(wzi.v2);
                        case 29:
                            return ResourceExtKt.getString(wzi.W1);
                        case 30:
                            return ResourceExtKt.getString(wzi.M7);
                        case 31:
                            return ResourceExtKt.getString(wzi.H2);
                        case 32:
                            return ResourceExtKt.getString(wzi.H1);
                        default:
                            Logger.e("getShortcutItemName unknown type:" + type, new Object[0]);
                            return "";
                    }
            }
        }

        @NotNull
        public final ShortcutListItem valueOf(@NotNull SecondaryScreenItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new ShortcutListItem(getShortcutItemName(item.getType()), item.getIndex(), item.isEnable(), 0, item.getType(), false, 32, null);
        }
    }

    public ShortcutListItem(@NotNull String name, int i, boolean z, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.targetIndex = i;
        this.enable = z;
        this.type = i2;
        this.subType = i3;
        this.isDragging = z2;
    }

    public static /* synthetic */ ShortcutListItem copy$default(ShortcutListItem shortcutListItem, String str, int i, boolean z, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = shortcutListItem.name;
        }
        if ((i4 & 2) != 0) {
            i = shortcutListItem.targetIndex;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z = shortcutListItem.enable;
        }
        boolean z3 = z;
        if ((i4 & 8) != 0) {
            i2 = shortcutListItem.type;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = shortcutListItem.subType;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            z2 = shortcutListItem.isDragging;
        }
        return shortcutListItem.copy(str, i5, z3, i6, i7, z2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTargetIndex() {
        return this.targetIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    @NotNull
    public final ShortcutListItem copy(@NotNull String name, int targetIndex, boolean enable, int type, int subType, boolean isDragging) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ShortcutListItem(name, targetIndex, enable, type, subType, isDragging);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutListItem)) {
            return false;
        }
        ShortcutListItem shortcutListItem = (ShortcutListItem) other;
        return Intrinsics.areEqual(this.name, shortcutListItem.name) && this.targetIndex == shortcutListItem.targetIndex && this.enable == shortcutListItem.enable && this.type == shortcutListItem.type && this.subType == shortcutListItem.subType && this.isDragging == shortcutListItem.isDragging;
    }

    public final int getDragIconVisibility() {
        return (this.isDragging || this.enable) ? 0 : 4;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getIcon() {
        if (isAlwaysShown()) {
            return jni.d1;
        }
        return (this.isDragging || this.enable) ? jni.c1 : jni.a1;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getSubType() {
        return this.subType;
    }

    public final int getTargetIndex() {
        return this.targetIndex;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + Integer.hashCode(this.targetIndex)) * 31) + Boolean.hashCode(this.enable)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.subType)) * 31) + Boolean.hashCode(this.isDragging);
    }

    public final boolean isAlwaysShown() {
        return this.subType == 18;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final void setDragging(boolean z) {
        this.isDragging = z;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    @NotNull
    public String toString() {
        return "ShortcutListItem(name=" + this.name + ", targetIndex=" + this.targetIndex + ", enable=" + this.enable + ", type=" + this.type + ", subType=" + this.subType + ", isDragging=" + this.isDragging + ")";
    }

    public final void toggleStatus() {
        this.enable = !this.enable;
    }

    public /* synthetic */ ShortcutListItem(String str, int i, boolean z, int i2, int i3, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? true : z, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) == 0 ? i3 : -1, (i4 & 32) == 0 ? z2 : false);
    }
}

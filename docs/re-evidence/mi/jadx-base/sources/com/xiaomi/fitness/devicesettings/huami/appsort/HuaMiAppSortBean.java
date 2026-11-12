package com.xiaomi.fitness.devicesettings.huami.appsort;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.settingitem.AppSortItem;
import defpackage.jni;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0013\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0011\u0010\u001a\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortBean;", "", "type", "", "name", "", "<init>", "(ILjava/lang/String;)V", "appItem", "Lcom/xiaomi/fitness/settingitem/settingitem/AppSortItem;", "(ILcom/xiaomi/fitness/settingitem/settingitem/AppSortItem;)V", "getType", "()I", "setType", "(I)V", "getAppItem", "()Lcom/xiaomi/fitness/settingitem/settingitem/AppSortItem;", "setAppItem", "(Lcom/xiaomi/fitness/settingitem/settingitem/AppSortItem;)V", "getName", "()Ljava/lang/String;", "isAlwaysShown", "", "()Z", "iconRes", "getIconRes", "swipeIconVisible", "getSwipeIconVisible", "equals", "other", "hashCode", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiAppSortBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int ITEM_TYPE_DATA = 1;
    public static final int ITEM_TYPE_HIDE_DATA = 3;
    public static final int ITEM_TYPE_HIDE_LABEL = 0;
    public static final int ITEM_TYPE_MORE_LABEL = 2;

    @NotNull
    private AppSortItem appItem;

    @Nullable
    private final String name;
    private int type;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/appsort/HuaMiAppSortBean$Companion;", "", "<init>", "()V", "ITEM_TYPE_HIDE_LABEL", "", "ITEM_TYPE_DATA", "ITEM_TYPE_MORE_LABEL", "ITEM_TYPE_HIDE_DATA", "getNameByType", "", "type", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getNameByType(int type) {
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
            if (type == 56) {
                return ResourceExtKt.getString(wzi.u2);
            }
            if (type == 57) {
                return ResourceExtKt.getString(wzi.p);
            }
            switch (type) {
                case 6:
                    return ResourceExtKt.getString(wzi.o2);
                case 7:
                    return ResourceExtKt.getString(wzi.X);
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
                case 19:
                    return ResourceExtKt.getString(wzi.b0);
                case 20:
                    return ResourceExtKt.getString(wzi.C2);
                case 21:
                    return ResourceExtKt.getString(wzi.R1);
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
                            Logger.d("unknown type:" + type, new Object[0]);
                            return "unknown type";
                    }
            }
        }
    }

    public HuaMiAppSortBean(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = i;
        AppSortItem appSortItem = new AppSortItem();
        this.appItem = appSortItem;
        appSortItem.setEnable(i == 2);
        this.name = name;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(HuaMiAppSortBean.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.devicesettings.huami.appsort.HuaMiAppSortBean");
        HuaMiAppSortBean huaMiAppSortBean = (HuaMiAppSortBean) other;
        return this.type == huaMiAppSortBean.type && Intrinsics.areEqual(this.appItem, huaMiAppSortBean.appItem) && Intrinsics.areEqual(this.name, huaMiAppSortBean.name);
    }

    @NotNull
    public final AppSortItem getAppItem() {
        return this.appItem;
    }

    public final int getIconRes() {
        if (isAlwaysShown()) {
            return jni.d1;
        }
        return this.appItem.getEnable() ? jni.c1 : jni.a1;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getSwipeIconVisible() {
        if (this.appItem.getType() == 18) {
            return false;
        }
        return this.appItem.getEnable();
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.type * 31) + this.appItem.hashCode()) * 31;
        String str = this.name;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isAlwaysShown() {
        return this.appItem.getType() == 18 || this.appItem.getType() == 7 || this.appItem.getType() == 19;
    }

    public final void setAppItem(@NotNull AppSortItem appSortItem) {
        Intrinsics.checkNotNullParameter(appSortItem, "<set-?>");
        this.appItem = appSortItem;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public HuaMiAppSortBean(int i, @NotNull AppSortItem appItem) {
        Intrinsics.checkNotNullParameter(appItem, "appItem");
        this.type = i;
        this.appItem = appItem;
        this.name = INSTANCE.getNameByType(appItem.getType());
    }
}

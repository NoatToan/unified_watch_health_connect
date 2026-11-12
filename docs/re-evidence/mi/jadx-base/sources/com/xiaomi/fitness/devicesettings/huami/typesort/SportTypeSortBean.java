package com.xiaomi.fitness.devicesettings.huami.typesort;

import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.hm.health.bt.profile.sport.SportTypeItem;
import defpackage.jni;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u001fH\u0002J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\"\u001a\u00020\u0003H\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u0011\u0010\u0019\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/typesort/SportTypeSortBean;", "", "type", "", "sportTypeSort", "Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;", "isPangu", "", "<init>", "(ILcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;Z)V", "name", "", "getName", "()Ljava/lang/String;", "getType", "()I", "setType", "(I)V", "getSportTypeSort", "()Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;", "setSportTypeSort", "(Lcom/xiaomi/hm/health/bt/profile/sport/SportTypeItem;)V", "targetIndex", "getTargetIndex", "setTargetIndex", "iconRes", "getIconRes", "swipeIconVisible", "getSwipeIconVisible", "()Z", "getNamePair", "Lkotlin/Pair;", "equals", "other", "hashCode", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTypeSortBean {
    public static final int ITEM_TYPE_DATA = 1;
    public static final int ITEM_TYPE_HIDE_DATA = 3;
    public static final int ITEM_TYPE_HIDE_LABEL = 0;
    public static final int ITEM_TYPE_SHOW_LABEL = 2;

    @NotNull
    private final String name;

    @NotNull
    private SportTypeItem sportTypeSort;
    private int targetIndex;
    private int type;

    public SportTypeSortBean(int i, @NotNull SportTypeItem sportTypeSort, boolean z) {
        Intrinsics.checkNotNullParameter(sportTypeSort, "sportTypeSort");
        this.type = i;
        this.sportTypeSort = sportTypeSort;
        Pair<String, Integer> namePair = getNamePair();
        this.name = namePair.getFirst();
        if (z) {
            this.targetIndex = namePair.getSecond().intValue();
        }
    }

    private final Pair<String, Integer> getNamePair() {
        switch (this.sportTypeSort.getType()) {
            case 1:
                return new Pair<>(ResourceExtKt.getString(wzi.id), 1);
            case 6:
                return new Pair<>(ResourceExtKt.getString(wzi.fc), 3);
            case 8:
                return new Pair<>(ResourceExtKt.getString(wzi.hd), 2);
            case 9:
                return new Pair<>(ResourceExtKt.getString(wzi.Cb), 4);
            case 10:
                return new Pair<>(ResourceExtKt.getString(wzi.Bb), 5);
            case 12:
                return new Pair<>(ResourceExtKt.getString(wzi.Lb), 7);
            case 14:
                return new Pair<>(ResourceExtKt.getString(wzi.Kd), 8);
            case 15:
                return new Pair<>(ResourceExtKt.getString(wzi.Ld), 31);
            case 16:
                return new Pair<>(ResourceExtKt.getString(wzi.Vb), 11);
            case 21:
                return new Pair<>(ResourceExtKt.getString(wzi.dd), 10);
            case 23:
                return new Pair<>(ResourceExtKt.getString(wzi.fd), 6);
            case 24:
                return new Pair<>(ResourceExtKt.getString(wzi.Rb), 13);
            case 45:
                return new Pair<>(ResourceExtKt.getString(wzi.qd), 30);
            case 49:
                return new Pair<>(ResourceExtKt.getString(wzi.jc), 15);
            case 50:
                return new Pair<>(ResourceExtKt.getString(wzi.vb), 16);
            case 53:
                return new Pair<>(ResourceExtKt.getString(wzi.Hd), 17);
            case 58:
                return new Pair<>(ResourceExtKt.getString(wzi.Ed), 18);
            case 59:
                return new Pair<>(ResourceExtKt.getString(wzi.dc), 14);
            case 60:
                return new Pair<>(ResourceExtKt.getString(wzi.fe), 9);
            case 61:
                return new Pair<>(ResourceExtKt.getString(wzi.Vc), 19);
            case 74:
                return new Pair<>(ResourceExtKt.getString(wzi.Fd), 28);
            case 76:
                return new Pair<>(ResourceExtKt.getString(wzi.Db), 12);
            case 77:
                return new Pair<>(ResourceExtKt.getString(wzi.ge), 29);
            case 78:
                return new Pair<>(ResourceExtKt.getString(wzi.xb), 24);
            case 80:
                return new Pair<>(ResourceExtKt.getString(wzi.nb), 25);
            case 85:
                return new Pair<>(ResourceExtKt.getString(wzi.db), 20);
            case 88:
                return new Pair<>(ResourceExtKt.getString(wzi.Wd), 21);
            case 89:
                return new Pair<>(ResourceExtKt.getString(wzi.Wc), 22);
            case 92:
                return new Pair<>(ResourceExtKt.getString(wzi.Ya), 23);
            case 97:
                return new Pair<>(ResourceExtKt.getString(wzi.ob), 26);
            case 104:
                return new Pair<>(ResourceExtKt.getString(wzi.Xb), 27);
            default:
                int i = this.type;
                if (i == 0) {
                    return new Pair<>(ResourceExtKt.getString(wzi.a1), -1);
                }
                if (i == 2) {
                    return new Pair<>(ResourceExtKt.getString(wzi.b1), 0);
                }
                Logger.e("unknown item:" + i + " " + this.sportTypeSort.getType(), new Object[0]);
                return new Pair<>("unknown item", -1);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SportTypeSortBean.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.devicesettings.huami.typesort.SportTypeSortBean");
        SportTypeSortBean sportTypeSortBean = (SportTypeSortBean) other;
        return Intrinsics.areEqual(this.name, sportTypeSortBean.name) && this.type == sportTypeSortBean.type && Intrinsics.areEqual(this.sportTypeSort, sportTypeSortBean.sportTypeSort) && this.targetIndex == sportTypeSortBean.targetIndex;
    }

    public final int getIconRes() {
        return this.sportTypeSort.visible() ? jni.c1 : jni.a1;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final SportTypeItem getSportTypeSort() {
        return this.sportTypeSort;
    }

    public final boolean getSwipeIconVisible() {
        return this.sportTypeSort.visible();
    }

    public final int getTargetIndex() {
        return this.targetIndex;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.type) * 31) + this.sportTypeSort.hashCode()) * 31) + this.targetIndex;
    }

    public final void setSportTypeSort(@NotNull SportTypeItem sportTypeItem) {
        Intrinsics.checkNotNullParameter(sportTypeItem, "<set-?>");
        this.sportTypeSort = sportTypeItem;
    }

    public final void setTargetIndex(int i) {
        this.targetIndex = i;
    }

    public final void setType(int i) {
        this.type = i;
    }
}

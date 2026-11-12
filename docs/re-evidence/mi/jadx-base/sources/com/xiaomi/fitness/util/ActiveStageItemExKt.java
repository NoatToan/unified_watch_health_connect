package com.xiaomi.fitness.util;

import android.app.Application;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.c0j;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002¨\u0006\u0007"}, d2 = {"getModeName", "", "Lcom/xiaomi/fit/fitness/export/data/item/ActiveStageItem;", "isCreateStepMode", "", "getImgResource", "", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ActiveStageItemExKt {
    public static final int getImgResource(@NotNull ActiveStageItem activeStageItem) {
        Intrinsics.checkNotNullParameter(activeStageItem, "<this>");
        switch (activeStageItem.getType()) {
            case 1:
                return pni.p;
            case 2:
                return pni.q;
            case 3:
                return pni.t;
            case 4:
                return pni.n;
            case 5:
                return pni.t;
            case 6:
                return pni.s;
            case 7:
                return pni.f30563r;
            default:
                return -1;
        }
    }

    @Nullable
    public static final String getModeName(@NotNull ActiveStageItem activeStageItem) {
        Intrinsics.checkNotNullParameter(activeStageItem, "<this>");
        Application app = AppUtil.getApp();
        switch (activeStageItem.getType()) {
            case 1:
                return app.getString(c0j.y);
            case 2:
                return app.getString(c0j.z);
            case 3:
                return app.getString(c0j.A);
            case 4:
                return app.getString(c0j.x);
            case 5:
                return app.getString(c0j.C);
            case 6:
                return app.getString(c0j.B);
            case 7:
                return app.getString(c0j.w);
            default:
                return "";
        }
    }

    public static final boolean isCreateStepMode(@NotNull ActiveStageItem activeStageItem) {
        Intrinsics.checkNotNullParameter(activeStageItem, "<this>");
        return activeStageItem.getType() == 5 || activeStageItem.getType() == 3 || activeStageItem.getType() == 6 || activeStageItem.getType() == 2 || activeStageItem.getType() == 7 || activeStageItem.getType() == 1 || activeStageItem.getType() == 4;
    }
}

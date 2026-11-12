package com.xiaomi.hm.health.ui.unit;

import com.xiaomi.hm.health.bt.profile.usernew.WeightUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"", "weightUnit", "Lcom/xiaomi/hm/health/bt/profile/usernew/WeightUnit;", "toBleWeightUnit", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class UnitFunctionsKt {
    @Nullable
    public static final WeightUnit toBleWeightUnit(int i) {
        if (i == 0) {
            return WeightUnit.KG;
        }
        if (i == 1) {
            return WeightUnit.YB;
        }
        if (i == 16) {
            return WeightUnit.SJ;
        }
        if (i != 17) {
            return null;
        }
        return WeightUnit.ST;
    }
}

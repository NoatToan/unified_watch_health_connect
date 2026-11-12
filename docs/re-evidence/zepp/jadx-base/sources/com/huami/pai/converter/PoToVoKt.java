package com.huami.pai.converter;

import com.huami.pai.db.po.FitnessAge;
import com.huami.pai.vo.FitnessAgeVo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/huami/pai/db/po/FitnessAge;", "Lcom/huami/pai/vo/FitnessAgeVo;", "toFitnessAgeVo", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class PoToVoKt {
    @NotNull
    public static final FitnessAgeVo toFitnessAgeVo(@NotNull FitnessAge fitnessAge) {
        return new FitnessAgeVo(fitnessAge.getDate().getTime(), fitnessAge.getAge(), fitnessAge.getVo2max(), Intrinsics.areEqual(fitnessAge.getSource(), "PREDICTION"));
    }
}

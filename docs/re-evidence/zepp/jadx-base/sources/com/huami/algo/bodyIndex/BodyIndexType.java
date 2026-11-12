package com.huami.algo.bodyIndex;

import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/huami/algo/bodyIndex/BodyIndexType;", "", "", "indexName", "Ljava/lang/String;", "getIndexName", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", StatEvent.BF_OPERATION_BMI_TYPE, "IMPEDANCE", "BODY_FAT", "MUSCLE", "BODY_SHAPE_TYPE", "MOISTURE", "BASAL_METABOLISM", "VISCERAL_FAT", "BONE_MASS", "SCORE", "MA", "PMR", "SBW", "SKELETAL_MUSCLE", "SUBCUTANEOUS_FAT", "body-index_release"}, k = 1, mv = {1, 5, 1})
public enum BodyIndexType {
    BMI("bmi"),
    IMPEDANCE(ParamKey.impedance),
    BODY_FAT(BFConstant.TYPE_BODY_FAT_AD),
    MUSCLE("muscle"),
    BODY_SHAPE_TYPE("body_shape_type"),
    MOISTURE("moisture"),
    BASAL_METABOLISM("basal_metabolism"),
    VISCERAL_FAT("visceral_fat"),
    BONE_MASS("bone_mass"),
    SCORE("score"),
    MA("ma"),
    PMR("pmr"),
    SBW("sbw"),
    SKELETAL_MUSCLE("skeletal_muscle"),
    SUBCUTANEOUS_FAT("subcutaneous_fat");


    @NotNull
    private final String indexName;

    BodyIndexType(String str) {
        this.indexName = str;
    }

    @NotNull
    public final String getIndexName() {
        return this.indexName;
    }
}

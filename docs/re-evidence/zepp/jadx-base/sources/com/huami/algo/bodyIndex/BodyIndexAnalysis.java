package com.huami.algo.bodyIndex;

import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JD\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H&JL\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H&J@\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H&JH\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H&J(\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0002H&¨\u0006\u0017"}, d2 = {"Lcom/huami/algo/bodyIndex/BodyIndexAnalysis;", "", "", "weightKg", "height", "", "sex", "age", ParamKey.impedance, "peopleType", "", "Lcom/huami/algo/bodyIndex/BodyIndexType;", "analysis", "source", "analysisBmrStandardValue", "loseWeightInKg", "currentWeightInKg", "Lcom/huami/algo/bodyIndex/LoseWeightSportType;", "sportType", "loseWeightPlan", "gender", "weightInKg", "idealWeight", "body-index_release"}, k = 1, mv = {1, 5, 1})
public interface BodyIndexAnalysis {
    @NotNull
    Map<BodyIndexType, Object> analysis(float weightKg, float height, int sex, int age, float impedance, int peopleType);

    @NotNull
    Map<BodyIndexType, Object> analysis(int source, float weightKg, float height, int sex, int age, float impedance, int peopleType);

    float analysisBmrStandardValue(int source, float weightKg, float height, int sex, int age, float impedance, int peopleType);

    float idealWeight(int height, int gender, int age, float weightInKg);

    float loseWeightPlan(float loseWeightInKg, float currentWeightInKg, float height, int sex, int age, float impedance, int peopleType, @NotNull LoseWeightSportType sportType);
}

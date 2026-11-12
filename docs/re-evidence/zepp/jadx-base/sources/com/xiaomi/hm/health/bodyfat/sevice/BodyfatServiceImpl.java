package com.xiaomi.hm.health.bodyfat.sevice;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.Transformations;
import com.huami.health.bodymeasurements.bodyfat_service.BMI;
import com.huami.health.bodymeasurements.bodyfat_service.BalanceEntry;
import com.huami.health.bodymeasurements.bodyfat_service.BmiDetailInfoEntry;
import com.huami.health.bodymeasurements.bodyfat_service.BodyScore;
import com.huami.health.bodymeasurements.bodyfat_service.BodyfatService;
import com.huami.health.bodymeasurements.bodyfat_service.Weight;
import com.huami.health.bodymeasurements.bodyfat_service.WeightUnit;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoRepository;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.model.FigureSource;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.OneFootUtils;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016J\u0010\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0016J\u0010\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\nH\u0016J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/sevice/BodyfatServiceImpl;", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyfatService;", "Lcom/huami/health/bodymeasurements/bodyfat_service/WeightUnit;", "b", "", "ofmt", "", "values", "", "a", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/health/bodymeasurements/bodyfat_service/BMI;", "loadLatestBMI", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyScore;", "loadLatestBodyScore", "Lcom/huami/health/bodymeasurements/bodyfat_service/Weight;", "loadLatestWeight", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/health/bodymeasurements/bodyfat_service/BmiDetailInfoEntry;", "loadLatestBmiDetailInfo", "Lcom/huami/health/bodymeasurements/bodyfat_service/BalanceEntry;", "loadBalanceInfo", "", "", "loadBalanceLevel", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyfatServiceImpl implements BodyfatService {
    private static final int a = 1;
    private static final float b = 0.1f;

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(float ofmt, float[] values) {
        if (ofmt <= values[1] - 0.1f && values[0] <= ofmt) {
            return 0;
        }
        if (ofmt <= values[2] - 0.1f && values[1] <= ofmt) {
            return 1;
        }
        if (ofmt <= values[3] - 0.1f && values[2] <= ofmt) {
            return 2;
        }
        if (ofmt <= values[4] - 0.1f && values[3] <= ofmt) {
            return 3;
        }
        return ofmt <= values[5] - 0.1f && values[4] <= ofmt ? 4 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeightUnit b() {
        int weightUnit = BFCallback.getUnitManager().getWeightUnit();
        if (weightUnit == 0) {
            return WeightUnit.KG;
        }
        if (weightUnit == 1) {
            return WeightUnit.YB;
        }
        if (weightUnit == 2) {
            return WeightUnit.GRAM;
        }
        if (weightUnit == 3) {
            return WeightUnit.OUNCE;
        }
        if (weightUnit != 16) {
            return weightUnit != 17 ? WeightUnit.KG : WeightUnit.ST;
        }
        return WeightUnit.SJ;
    }

    @Override // com.huami.health.bodymeasurements.bodyfat_service.BodyfatService
    @NotNull
    public Flow<BalanceEntry> loadBalanceInfo(@NotNull final Context context) {
        return FlowLiveDataConversions.asFlow(Transformations.map(WeightInfoRepository.INSTANCE.getInstance().getOftInfosLiveData(BFCallback.getHMLoginManager().getValidUid()), new Function<List<? extends WeightInfos>, BalanceEntry>() { // from class: com.xiaomi.hm.health.bodyfat.sevice.BodyfatServiceImpl$loadBalanceInfo$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final BalanceEntry apply(List<? extends WeightInfos> list) {
                WeightInfos weightInfos;
                UserInfos info;
                List<? extends WeightInfos> list2 = list;
                if (list2 == null || list2.isEmpty() || CollectionsKt.last((List) list2) == null || (weightInfos = (WeightInfos) CollectionsKt.last((List) list2)) == null || (info = UserInfoManager.getManager().getInfo(BFCallback.getHMLoginManager().getValidUid())) == null || info.getBirthday() == null || info.getBirthday() == null) {
                    return null;
                }
                int age = Birthday.fromStr(info.getBirthday()).getAge();
                if (age < 20 || age > 69) {
                    return new BalanceEntry(0L, "", "", "", 0, false);
                }
                int iA = this.a.a(weightInfos.getOfmt().floatValue(), OneFootUtils.getMaxTimeArray(age, info.getGender().intValue()));
                return new BalanceEntry(weightInfos.getTimestamp().longValue(), String.valueOf(weightInfos.getOfmt()), context.getResources().getString(R.string.unit_sec), HMWeightUtils.getOneFootFigureLables(context)[iA], iA, true);
            }
        }));
    }

    @Override // com.huami.health.bodymeasurements.bodyfat_service.BodyfatService
    @NotNull
    public List<String> loadBalanceLevel(@NotNull Context context) {
        return ArraysKt___ArraysKt.toList(HMWeightUtils.getOneFootFigureLables(context));
    }

    @Override // com.huami.health.bodymeasurements.bodyfat_service.BodyfatService
    @NotNull
    public Flow<BMI> loadLatestBMI() {
        return FlowLiveDataConversions.asFlow(Transformations.map(WeightInfoManager.getManager().getLatestInfosByLiveData(BFCallback.getHMLoginManager().getValidUid(), 1), new Function<List<WeightInfos>, BMI>() { // from class: com.xiaomi.hm.health.bodyfat.sevice.BodyfatServiceImpl$loadLatestBMI$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final BMI apply(List<WeightInfos> list) {
                List<WeightInfos> list2 = list;
                if (list2 == null || list2.isEmpty() || CollectionsKt.first((List) list2) == null) {
                    return null;
                }
                WeightInfos weightInfos = (WeightInfos) CollectionsKt.first((List) list2);
                return new BMI(weightInfos.getTimestamp().longValue(), HMWeightUtils.getShowBmi(weightInfos, UserInfoManager.getManager().getInfo(BFCallback.getHMLoginManager().getValidUid())));
            }
        }));
    }

    @Override // com.huami.health.bodymeasurements.bodyfat_service.BodyfatService
    @NotNull
    public Flow<BmiDetailInfoEntry> loadLatestBmiDetailInfo(@NotNull final Context context) {
        return FlowLiveDataConversions.asFlow(Transformations.map(WeightInfoManager.getManager().getLatestInfosByLiveData(BFCallback.getHMLoginManager().getValidUid(), 1), new Function<List<WeightInfos>, BmiDetailInfoEntry>() { // from class: com.xiaomi.hm.health.bodyfat.sevice.BodyfatServiceImpl$loadLatestBmiDetailInfo$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final BmiDetailInfoEntry apply(List<WeightInfos> list) {
                List<WeightInfos> list2 = list;
                if (list2 == null || list2.isEmpty() || CollectionsKt.first((List) list2) == null) {
                    return null;
                }
                WeightInfos weightInfos = (WeightInfos) CollectionsKt.first((List) list2);
                Float bmi = weightInfos.getBmi();
                UserInfos info = UserInfoManager.getManager().getInfo(BFCallback.getHMLoginManager().getValidUid());
                if (info == null || info.getBirthday() == null) {
                    return null;
                }
                Integer height = weightInfos.getHeight();
                if (height == null) {
                    height = info.getHeight();
                }
                Integer gender = info.getGender();
                int iIntValue = gender == null ? -1 : gender.intValue();
                if (bmi == null && height != null && height.intValue() > 0 && weightInfos.getWeight() != null && weightInfos.getWeight().floatValue() > 0.0f) {
                    bmi = Float.valueOf(HMWeightUtils.calcuBMI(height.intValue(), weightInfos.getWeight().floatValue()));
                }
                Float f = bmi;
                int weightAge = BodyParamsUtils.getWeightAge(weightInfos.getTimestamp().longValue(), info.getBirthday());
                int i = 0;
                boolean zCanAnalyzeBmi = BodyParamsUtils.canAnalyzeBmi(weightAge, height == null ? 0 : height.intValue());
                if (f == null || weightInfos.getWeight() == null || Intrinsics.areEqual(f, 0.0f)) {
                    return null;
                }
                int weightUnit = BFCallback.getUnitManager().getWeightUnit();
                FigureSource weightFigureSource = HMWeightUtils.getWeightFigureSource(context, Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.CHINESE.getLanguage()), iIntValue, weightAge, height.intValue(), weightUnit);
                if (!zCanAnalyzeBmi || weightFigureSource == null) {
                    return new BmiDetailInfoEntry(weightInfos.getTimestamp().longValue(), HMWeightUtils.getWeightValueStringForDisplay(weightInfos.getWeight().floatValue(), weightUnit), this.b(), f, new Pair(0, 0), new Pair(0, 0), "", "", zCanAnalyzeBmi);
                }
                float fConvertFromKg = HMWeightUtils.convertFromKg(weightInfos.getWeight().floatValue(), BFCallback.getUnitManager().getWeightUnit());
                float[] values = weightFigureSource.getValues();
                int length = values.length - 1;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i + 1;
                        if (i != values.length - 1) {
                            if (fConvertFromKg >= values[i] && fConvertFromKg < values[i3]) {
                                break;
                            }
                        } else {
                            i2 = i;
                        }
                        if (i3 > length) {
                            i = i2;
                            break;
                        }
                        i = i3;
                    }
                }
                return new BmiDetailInfoEntry(weightInfos.getTimestamp().longValue(), HMWeightUtils.getWeightValueStringForDisplay(weightInfos.getWeight().floatValue(), weightUnit), this.b(), f, new Pair(Integer.valueOf(weightFigureSource.getLabels().length), Integer.valueOf(i + 1)), HMWeightUtils.getBmiLevelPositionPair(context, f.floatValue(), weightAge, iIntValue), i > weightFigureSource.getLabels().length + (-1) ? weightFigureSource.getLabels()[weightFigureSource.getLabels().length - 1] : weightFigureSource.getLabels()[i], HMWeightUtils.getBmiLevel(context, f.floatValue(), weightAge, iIntValue), zCanAnalyzeBmi);
            }
        }));
    }

    @Override // com.huami.health.bodymeasurements.bodyfat_service.BodyfatService
    @NotNull
    public Flow<BodyScore> loadLatestBodyScore() {
        return FlowLiveDataConversions.asFlow(Transformations.map(WeightInfoManager.getManager().getLatestBodyScoreInfosByLiveData(BFCallback.getHMLoginManager().getValidUid(), 1), new Function<List<WeightInfos>, BodyScore>() { // from class: com.xiaomi.hm.health.bodyfat.sevice.BodyfatServiceImpl$loadLatestBodyScore$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final BodyScore apply(List<WeightInfos> list) {
                List<WeightInfos> list2 = list;
                if (list2 == null || list2.isEmpty() || CollectionsKt.first((List) list2) == null) {
                    return null;
                }
                WeightInfos weightInfos = (WeightInfos) CollectionsKt.first((List) list2);
                return new BodyScore(weightInfos.getTimestamp().longValue(), weightInfos.getScore().intValue());
            }
        }));
    }

    @Override // com.huami.health.bodymeasurements.bodyfat_service.BodyfatService
    @NotNull
    public Flow<Weight> loadLatestWeight() {
        return FlowLiveDataConversions.asFlow(Transformations.map(WeightInfoManager.getManager().getLatestInfosByLiveData(BFCallback.getHMLoginManager().getValidUid(), 1), new Function<List<WeightInfos>, Weight>() { // from class: com.xiaomi.hm.health.bodyfat.sevice.BodyfatServiceImpl$loadLatestWeight$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Weight apply(List<WeightInfos> list) {
                List<WeightInfos> list2 = list;
                if (list2 == null || list2.isEmpty() || CollectionsKt.first((List) list2) == null) {
                    return null;
                }
                WeightInfos weightInfos = (WeightInfos) CollectionsKt.first((List) list2);
                return new Weight(weightInfos.getTimestamp().longValue(), HMWeightUtils.getWeightValueStringForDisplay(weightInfos.getWeight().floatValue(), BFCallback.getUnitManager().getWeightUnit()), this.a.b());
            }
        }));
    }
}

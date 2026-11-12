package com.xiaomi.fitness.heartrate.ui;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import cn.miao.health.bean.AnalyzeInfo;
import cn.miao.health.bean.HeartInfo;
import cn.miao.health.bean.MiaoHealthBaseInfo;
import cn.miao.health.bean.MiaoHealthHeartInfo;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.bxf;
import defpackage.d0j;
import defpackage.ywf;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.ShortCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J \u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J(\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/ReportViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "evaluatingInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/heartrate/ui/EvaluatingInfo;", "getEvaluatingInfo", "()Landroidx/lifecycle/MutableLiveData;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "handleEvaluationReport", "rhr", "", "time", "", "statusType", "convertActivityHrm", "info", "Lcn/miao/health/bean/AnalyzeInfo;", "convertRestingHrm", "hrmRange", "", "createHeartInfo", "Lcn/miao/health/bean/HeartInfo;", "convertCommonHrm", "get3LevelEvaluationInfo", "name", "", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReportViewModel extends AbsViewModel {

    @NotNull
    private static final int[] RANGE_COMMON = {60, 100};

    @NotNull
    private static final int[] RANGE_RESTING = {55, 80};

    @NotNull
    private static final String UNKNOWN_USER = "unknown_user";

    @NotNull
    private final MutableLiveData<EvaluatingInfo> evaluatingInfo = new MutableLiveData<>();

    /* JADX INFO: Access modifiers changed from: private */
    public final EvaluatingInfo convertActivityHrm(int statusType, AnalyzeInfo info) {
        ValueData valueData;
        String string = ResourceExtKt.getString(d0j.o);
        float age = (int) (207 - (UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getAge() * 0.7f));
        int i = (int) (0.57f * age);
        int i2 = (int) (0.64f * age);
        int i3 = (int) (0.77f * age);
        int i4 = (int) (age * 0.96f);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ValueData[]{new ValueData(ResourceExtKt.getString(d0j.a0), 0, Integer.valueOf(i)), new ValueData(ResourceExtKt.getString(d0j.Z), Integer.valueOf(i), Integer.valueOf(i2)), new ValueData(ResourceExtKt.getString(d0j.b0), Integer.valueOf(i2), Integer.valueOf(i3)), new ValueData(ResourceExtKt.getString(d0j.X), Integer.valueOf(i3), Integer.valueOf(i4)), new ValueData(ResourceExtKt.getString(d0j.Y), Integer.valueOf(i4), Short.valueOf(ShortCompanionObject.MAX_VALUE))});
        int analyzeMapping = info.getAnalyzeMapping();
        switch (analyzeMapping) {
            case 220:
                valueData = (ValueData) listListOf.get(0);
                break;
            case 221:
                valueData = (ValueData) listListOf.get(1);
                break;
            case 222:
                valueData = (ValueData) listListOf.get(2);
                break;
            case SportReportBaseParser.ReportType.targetValueNumber /* 223 */:
                valueData = (ValueData) listListOf.get(3);
                break;
            case SportReportBaseParser.ReportType.avgFreq /* 224 */:
                valueData = (ValueData) listListOf.get(4);
                break;
            default:
                throw new IllegalStateException("illegal Miao Code :" + analyzeMapping);
        }
        EvaluatingInfo evaluatingInfo = new EvaluatingInfo(statusType, valueData, string, (List<ValueData>) listListOf, (List<ValueData>) CollectionsKt__CollectionsJVMKt.listOf(listListOf.get(1)));
        evaluatingInfo.setDescription(ResourceExtKt.getString(d0j.S));
        return evaluatingInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EvaluatingInfo convertCommonHrm(int statusType, AnalyzeInfo info, int[] hrmRange) {
        return get3LevelEvaluationInfo(hrmRange, info, statusType, ResourceExtKt.getString(d0j.o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EvaluatingInfo convertRestingHrm(int statusType, AnalyzeInfo info, int[] hrmRange) {
        return get3LevelEvaluationInfo(hrmRange, info, statusType, ResourceExtKt.getString(d0j.R));
    }

    private final HeartInfo createHeartInfo(int rhr, long time, int statusType) {
        HeartInfo heartInfo = new HeartInfo();
        Integer numValueOf = null;
        int age = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getAge();
        heartInfo.setAge(Integer.valueOf(age));
        heartInfo.setHeartRate(Integer.valueOf(rhr));
        heartInfo.setMeasureTime(TimeUtils.formatDate(TimeUtils.NEW_FORMAT, Long.valueOf(time)));
        heartInfo.setHeartRateResting(null);
        if (statusType == 0) {
            heartInfo.setHeartRateResting(Integer.valueOf(rhr));
        } else if (statusType == 2) {
            heartInfo.setSportHeartRate(Integer.valueOf(rhr));
            if (14 <= age && age < 18) {
                numValueOf = Integer.valueOf((int) (216.6f - (age * 0.84f)));
            } else if (age >= 18) {
                numValueOf = Integer.valueOf((int) (207.0f - (age * 0.7f)));
            }
            heartInfo.setHeartRateMax(numValueOf);
        }
        heartInfo.setUserId(DeviceUtil.INSTANCE.getDeviceID(ApplicationExtKt.getApplication()));
        heartInfo.setConventionHeartRate(Integer.valueOf(rhr));
        return heartInfo;
    }

    private final EvaluatingInfo get3LevelEvaluationInfo(int[] hrmRange, AnalyzeInfo info, int statusType, String name) {
        ValueData valueData;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ValueData[]{new ValueData(ResourceExtKt.getString(d0j.W), 0, Integer.valueOf(hrmRange[0])), new ValueData(ResourceExtKt.getString(d0j.V), Integer.valueOf(hrmRange[0]), Integer.valueOf(hrmRange[1])), new ValueData(ResourceExtKt.getString(d0j.U), Integer.valueOf(hrmRange[0]), Short.valueOf(ShortCompanionObject.MAX_VALUE))});
        int analyzeMapping = info.getAnalyzeMapping();
        switch (analyzeMapping) {
            case 200:
                valueData = (ValueData) listListOf.get(0);
                break;
            case 201:
                valueData = (ValueData) listListOf.get(1);
                break;
            case 202:
                valueData = (ValueData) listListOf.get(2);
                break;
            default:
                throw new IllegalStateException("illegal Miao Code :" + analyzeMapping);
        }
        EvaluatingInfo evaluatingInfo = new EvaluatingInfo(statusType, valueData, name, (List<ValueData>) listListOf, (List<ValueData>) CollectionsKt__CollectionsJVMKt.listOf(listListOf.get(1)));
        evaluatingInfo.setDescription(ResourceExtKt.getString(d0j.S));
        return evaluatingInfo;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<EvaluatingInfo> getEvaluatingInfo() {
        return this.evaluatingInfo;
    }

    public final void handleEvaluationReport(int rhr, long time, final int statusType) {
        bxf.d().a(createHeartInfo(rhr, time, statusType), new ywf() { // from class: com.xiaomi.fitness.heartrate.ui.ReportViewModel.handleEvaluationReport.1
            @Override // defpackage.ywf
            public void onError(int p0, String p1) {
                Logger.e("ReportViewModel", "onError: code=" + p0 + ":" + p1);
                if (p1 != null && p1.length() != 0) {
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), p1);
                }
                ReportViewModel.this.getEvaluatingInfo().setValue(null);
            }

            @Override // defpackage.ywf
            public void onResponse(MiaoHealthBaseInfo info) {
                if (!(info instanceof MiaoHealthHeartInfo)) {
                    ReportViewModel.this.getEvaluatingInfo().setValue(null);
                    return;
                }
                MiaoHealthHeartInfo miaoHealthHeartInfo = (MiaoHealthHeartInfo) info;
                AnalyzeInfo hrrEvaluation = miaoHealthHeartInfo.getHrrEvaluation();
                AnalyzeInfo conventionHeart = miaoHealthHeartInfo.getConventionHeart();
                EvaluatingInfo evaluatingInfoConvertCommonHrm = conventionHeart != null ? ReportViewModel.this.convertCommonHrm(statusType, conventionHeart, ReportViewModel.RANGE_COMMON) : null;
                if (hrrEvaluation != null) {
                    evaluatingInfoConvertCommonHrm = ReportViewModel.this.convertRestingHrm(statusType, hrrEvaluation, ReportViewModel.RANGE_RESTING);
                }
                AnalyzeInfo sportHeartEvaluation = miaoHealthHeartInfo.getSportHeartEvaluation();
                if (sportHeartEvaluation != null) {
                    evaluatingInfoConvertCommonHrm = ReportViewModel.this.convertActivityHrm(statusType, sportHeartEvaluation);
                }
                ReportViewModel.this.getEvaluatingInfo().setValue(evaluatingInfoConvertCommonHrm);
            }
        });
    }
}

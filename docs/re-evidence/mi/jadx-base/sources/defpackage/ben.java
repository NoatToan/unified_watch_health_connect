package defpackage;

import android.app.Application;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.SportRecordExKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.detail.data.SportFeedbackModel;
import com.xiaomi.fitness.summary.recycler.SportBehaviorModel;
import com.xiaomi.fitness.util.SportRecordPreference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ben {
    public static SportFeedbackModel a(SportFeedbackModel sportFeedbackModel) {
        List<SportFeedbackModel> listC = c();
        for (int i = 0; i < listC.size(); i++) {
            SportFeedbackModel sportFeedbackModel2 = listC.get(i);
            if (sportFeedbackModel.getTimestamp() == sportFeedbackModel2.getTimestamp()) {
                return sportFeedbackModel2;
            }
        }
        return null;
    }

    public static List<SportBehaviorModel> b(SportBasicReport sportBasicReport) {
        ArrayList arrayList = new ArrayList();
        Application app = AppUtil.getApp();
        if (sportBasicReport == null) {
            return arrayList;
        }
        if (sportBasicReport.getTrainEffect() != null) {
            arrayList.add(new SportBehaviorModel(1, sportBasicReport.getTrainEffect().floatValue(), SportRecordExKt.getTrainEffectLevel(sportBasicReport), 0, 2));
        }
        if (sportBasicReport.getAnaerobicTrainEffect() != null) {
            arrayList.add(new SportBehaviorModel(1, sportBasicReport.getAnaerobicTrainEffect().floatValue(), SportRecordExKt.getAnaerobicTrainEffectLevel(sportBasicReport), 1, 2));
        }
        if (sportBasicReport.getDivingCNS() != null) {
            arrayList.add(new SportBehaviorModel(1, sportBasicReport.getDivingCNS().intValue(), SportRecordExKt.getAnaerobicTrainEffectLevel(sportBasicReport), 2, 2));
        }
        if (sportBasicReport.getDivingOTU() != null) {
            arrayList.add(new SportBehaviorModel(1, sportBasicReport.getDivingOTU().intValue(), SportRecordExKt.getTrainEffectLevel(sportBasicReport), 3, 2));
        }
        if (sportBasicReport.getPeekTrainingEffect() != null && sportBasicReport.getPeekTrainingEffect().floatValue() > 0.0f) {
            SportBehaviorModel sportBehaviorModel = new SportBehaviorModel(1, sportBasicReport.getPeekTrainingEffect().floatValue(), SportRecordExKt.getPeekTrainEffectLevel(sportBasicReport), 5, 2);
            Logger.i("SportDataUtils", "getPeekTrainEffectLevel level = " + sportBehaviorModel.c + " score + " + sportBehaviorModel.f13233b);
            arrayList.add(sportBehaviorModel);
        }
        if (sportBasicReport.getNoFlyDuration() != null && sportBasicReport.getNoFlyDuration().intValue() > 0 && sportBasicReport.getExitTime() != null) {
            SportBehaviorModel sportBehaviorModel2 = new SportBehaviorModel(4, AppUtil.getApp().getString(j1j.e4, TimeUtils.formatDate(app.getString(j1j.g), Long.valueOf((sportBasicReport.getExitTime().longValue() + ((long) sportBasicReport.getNoFlyDuration().intValue())) * 1000))), "", AppUtil.getApp().getString(j1j.d4), 1, 0);
            sportBehaviorModel2.d = 4;
            arrayList.add(sportBehaviorModel2);
        }
        if (sportBasicReport.getVo2max() != null && sportBasicReport.getVo2max().intValue() != 0) {
            arrayList.add(new SportBehaviorModel(0, sportBasicReport.getVo2max().toString(), app.getString(j1j.B9), AppUtil.getApp().getString(j1j.Da), 1, sportBasicReport.getVo2maxLevel() != null ? sportBasicReport.getVo2maxLevel().intValue() : 0));
        }
        if (sportBasicReport.getTrainingLoad() != null && sportBasicReport.getTrainingLoad().intValue() != 0) {
            arrayList.add(new SportBehaviorModel(0, sportBasicReport.getTrainingLoad().toString(), app.getString(j1j.za), app.getString(j1j.ya), 1, sportBasicReport.getTrainingLoadLevel() != null ? sportBasicReport.getTrainingLoadLevel().intValue() : 0));
        }
        if (sportBasicReport.getRecoveryTime() != null && sportBasicReport.getRecoveryTime().intValue() != 0) {
            arrayList.add(new SportBehaviorModel(0, sportBasicReport.getRecoveryTime().toString(), app.getResources().getQuantityString(byi.L, sportBasicReport.getRecoveryTime().intValue()), AppUtil.getApp().getString(j1j.m6), 1, -1));
        }
        if (sportBasicReport.getVitality() != null && sportBasicReport.getVitality().intValue() != 0) {
            arrayList.add(new SportBehaviorModel(0, app.getString(j1j.G8, sportBasicReport.getVitality()), "", AppUtil.getApp().getString(j1j.H8), 1, -1));
        }
        if (sportBasicReport.getTrainingPressure() != null && sportBasicReport.getTrainingPressure().intValue() != 0) {
            arrayList.add(new SportBehaviorModel(0, sportBasicReport.getTrainingPressure().toString(), "", AppUtil.getApp().getString(j1j.v9), 1, -1));
        }
        if (sportBasicReport.getLactateThresholdHeartRate() != null && sportBasicReport.getLactateThresholdHeartRate().intValue() > 0) {
            SportBehaviorModel sportBehaviorModel3 = new SportBehaviorModel(0, sportBasicReport.getLactateThresholdHeartRate().toString(), AppUtil.getApp().getResources().getQuantityString(byi.M, sportBasicReport.getLactateThresholdHeartRate().intValue()), AppUtil.getApp().getString(j1j.h5), 1, -1);
            sportBehaviorModel3.i = 1;
            arrayList.add(sportBehaviorModel3);
        }
        if (sportBasicReport.getLactateThresholdPace() != null && sportBasicReport.getLactateThresholdPace().intValue() > 0) {
            SportBehaviorModel sportBehaviorModel4 = new SportBehaviorModel(0, TimeDateUtil.getSportPaceStrWithSecDef(sportBasicReport.getLactateThresholdPace().intValue()), AppUtil.getApp().getResources().getQuantityString(byi.N, sportBasicReport.getLactateThresholdPace().intValue()), AppUtil.getApp().getString(j1j.i5), 1, -1);
            sportBehaviorModel4.i = 1;
            arrayList.add(sportBehaviorModel4);
        }
        return arrayList;
    }

    public static List<SportFeedbackModel> c() {
        List<SportFeedbackModel> feedBackList = SportRecordPreference.INSTANCE.getFeedBackList();
        return feedBackList == null ? new ArrayList() : feedBackList;
    }

    public static void d(SportFeedbackModel sportFeedbackModel) {
        List<SportFeedbackModel> listC = c();
        if (listC.size() < 100) {
            listC.add(sportFeedbackModel);
        } else {
            listC.set(0, sportFeedbackModel);
        }
        SportRecordPreference.INSTANCE.putFeedBackList(listC);
    }
}

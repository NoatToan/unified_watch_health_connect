package defpackage;

import android.os.Bundle;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class jed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f38466a = new Object();
    private static jed e;

    private jed() {
    }

    public static jed e() {
        jed jedVar;
        synchronized (f38466a) {
            if (e == null) {
                e = new jed();
            }
            jedVar = e;
        }
        return jedVar;
    }

    public void c(final MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("Track_VoiceGuideAfterSport", "handleAfterSport motionPathSimplify is null.");
            return;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
        executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: jed.5
            @Override // java.lang.Runnable
            public void run() {
                int iIntValue;
                long jRequestTotalTime = motionPathSimplify.requestTotalTime();
                float fRequestTotalDistance = (float) (((double) motionPathSimplify.requestTotalDistance()) * 0.001d);
                String[] strArr = new String[0];
                Map<String, Integer> mapRequestSportData = motionPathSimplify.requestSportData();
                if (mapRequestSportData == null || !mapRequestSportData.containsKey("recovery_time") || mapRequestSportData.get("recovery_time") == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = mapRequestSportData.get("recovery_time").intValue() / 60;
                    LogUtil.a("Track_VoiceGuideAfterSport", "handleAfterSport recoverTime = ", Integer.valueOf(iIntValue));
                }
                if (mapRequestSportData != null && mapRequestSportData.containsKey("etraining_effect") && mapRequestSportData.get("etraining_effect") != null) {
                    double dFloor = Math.floor(((double) mapRequestSportData.get("etraining_effect").intValue()) * 0.1d);
                    if (dFloor > 0.0d) {
                        strArr = new String[]{jed.this.c((int) dFloor)};
                    }
                }
                jed.this.a(strArr, jRequestTotalTime, fRequestTotalDistance, iIntValue);
                HashMap map = new HashMap(10);
                if (iIntValue > 0) {
                    map.put("type", 12);
                }
                map.put("click", 1);
                map.put("type", 11);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
            }
        });
        executorServiceNewFixedThreadPool.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(int i) {
        if (i == 1) {
            return "L152";
        }
        if (i == 2) {
            return "L153";
        }
        if (i == 3) {
            return "L154";
        }
        if (i == 4) {
            return "L155";
        }
        if (i == 5) {
            return "L156";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String[] strArr, float f, float f2, int i) {
        Bundle bundle = new Bundle();
        try {
            bundle.putString("voiceType", "sportSmartCoach");
            bundle.putStringArray("beforeSportFirstVoicePath", strArr);
            bundle.putFloat("sectionLower", f);
            bundle.putFloat("sectionUpper", f2);
            bundle.putInt("sportDuration", i);
            jem.a(new jbc(32, bundle));
        } catch (NumberFormatException unused) {
            LogUtil.e("Track_VoiceGuideAfterSport", "voiceConstructorPlay numberFormatException");
        }
    }
}

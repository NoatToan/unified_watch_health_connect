package com.huawei.healthcloud.plugintrack.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.router.Guidepost;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.motiontrack.api.MotionTrackPretreatmentService;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import defpackage.ive;
import defpackage.ivv;
import defpackage.lmf;
import defpackage.qrs;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MotionTrackPretreatmentServiceImpl implements MotionTrackPretreatmentService {
    @Override // com.huawei.health.motiontrack.api.MotionTrackPretreatmentService
    public int getSportType(int i) {
        if (i == 1) {
            return 257;
        }
        if (i == 2) {
            return 258;
        }
        if (i == 3) {
            return 259;
        }
        if (i != 4) {
            return i != 283 ? 0 : 283;
        }
        return 264;
    }

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    @Override // com.huawei.health.motiontrack.api.MotionTrackPretreatmentService
    public int getTargetType(String str) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 109) {
            if (iHashCode != 115) {
                if (iHashCode != 3426) {
                    if (iHashCode == 98254 && str.equals("cal")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("km")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("s")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(FitRunPlayAudio.OPPORTUNITY_M)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return 1;
        }
        if (b2 == 1) {
            return 0;
        }
        if (b2 != 2) {
            return b2 != 3 ? -1 : 2;
        }
        return 1;
    }

    private void a(Map<String, String> map) {
        String str = map.get("startTime");
        String str2 = map.get("endTime");
        String str3 = map.get("bigSportType");
        String str4 = map.get("fitness_type");
        long jF = qrs.d(str) ? qrs.f(str) : -1L;
        long jF2 = qrs.d(str2) ? qrs.f(str2) : -1L;
        if (jF <= 0 || jF2 <= 0) {
            ReleaseLogUtil.a("MotionTrackPretreatmentServiceImpl", "gotoMergeTrackSportDetail param invalid");
        } else {
            ivv.c(jF, jF2, qrs.d(str3) ? qrs.a(str3) : -1, qrs.d(str4) ? new int[]{qrs.a(str4)} : null);
        }
    }

    private void b(Context context, Map<String, String> map) {
        int sportType = 0;
        try {
            String str = map.get(BleConstants.SPORT_TYPE);
            sportType = TextUtils.isEmpty(str) ? 0 : getSportType(Integer.parseInt(str));
            String str2 = map.get(WorkoutRecord.Extend.COURSE_TARGET_TYPE);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                float f = Float.parseFloat(map.get(WorkoutRecord.Extend.COURSE_TARGET_VALUE));
                if (CommonUtils.j(map.get(ArkUIXConstants.FROM_TYPE)) == 1) {
                    d(context);
                    b(context);
                }
                if (f == 5000.0f) {
                    a(context);
                }
                int targetType = getTargetType(str2);
                String str3 = map.get("pathId");
                if (TextUtils.isEmpty(str3)) {
                    str3 = null;
                }
                ive.c().e(0, sportType, targetType, f / 1000.0f, str3, null, context.getApplicationContext());
                return;
            }
        } catch (NumberFormatException e) {
            LogUtil.e("MotionTrackPretreatmentServiceImpl", "goToSportTrack param is illegal, NumberFormatException: ", e.getMessage());
        } catch (Exception e2) {
            LogUtil.e("MotionTrackPretreatmentServiceImpl", "goToSportTrack is Exception: ", LogAnonymous.b(e2));
        }
        a(context, sportType);
    }

    private void a(Context context, int i) {
        AppRouter.c("/home/main").a(BleConstants.SPORT_TYPE, i).a("mLaunchSource", i == 0 ? 2 : 7).e("isToSportTab", true).b(context);
    }

    @Override // com.huawei.haf.router.facade.service.PretreatmentService
    public boolean onPretreatment(Context context, Guidepost guidepost) {
        int iG = ive.c().getAdapter() != null ? ive.c().g() : 0;
        if (iG != 1 && iG != 2) {
            Uri uriO = guidepost.o();
            if (uriO == null || TextUtils.isEmpty(uriO.getQuery()) || LoginInit.getInstance(context).isBrowseMode() || !AuthorizationUtils.c(context)) {
                a(context, 0);
            } else if (uriO.getQuery().contains("bigSportType")) {
                a(AppRouterUtils.a(uriO));
            } else {
                b(context, AppRouterUtils.a(uriO));
            }
        }
        return false;
    }

    private void d(Context context) {
        if (context == null) {
            LogUtil.j("MotionTrackPretreatmentServiceImpl", "doBiClickFromStepNotification context is null");
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("type", 2);
        map.put("jumpTo", 2);
        lmf.d().c(context, AnalyticsValue.HEALTH_PLUGIN_DAEMON_STEPS_NOTIFICATION_2080001.value(), map, 0);
    }

    private void a(Context context) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", 3);
        lmf.d().c(context, AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
    }

    private void b(Context context) {
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("from", 4);
        lmf.d().c(context, AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
    }
}

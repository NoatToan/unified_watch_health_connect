package com.huawei.hwsmartinteractmgr.smarter;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.ContentWeightWeekly;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import defpackage.nkb;
import defpackage.nkf;
import defpackage.nss;
import defpackage.nsv;
import defpackage.nsy;
import defpackage.ntc;
import defpackage.ntf;
import defpackage.nth;
import defpackage.ntl;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class WeightSmarterHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nsv f17726a;
    private Context e;

    public WeightSmarterHelper(Context context) {
        this.e = context;
        this.f17726a = nsv.e(context);
    }

    public void c(double d2) {
        LogUtil.a("SMART_WeightSmarterHelper", "saveDataToUserInfo");
        final float f = (float) d2;
        ntl.d(this.e, new IBaseResponseCallback() { // from class: com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 0) {
                    return;
                }
                HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper.2.4
                    @Override // com.huawei.hihealth.data.listener.HiCommonListener
                    public void onSuccess(int i2, Object obj2) {
                        LogUtil.a("SMART_WeightSmarterHelper", "fetchUserData Success ");
                        if (obj2 instanceof List) {
                            List list = (List) obj2;
                            if (list.isEmpty()) {
                                return;
                            }
                            LogUtil.a("SMART_WeightSmarterHelper", "fetchUserData Success not null ");
                            HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                            hiUserInfo.setWeight(f);
                            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("callSetUserdata", "WeightSmartHelper");
                            HiHealthManager.d(WeightSmarterHelper.this.e).setUserData(hiUserInfo, new HiCommonListener() { // from class: com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper.2.4.4
                                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                                public void onSuccess(int i3, Object obj3) {
                                    LogUtil.a("SMART_WeightSmarterHelper", "save setUserData isSuccess ");
                                }

                                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                                public void onFailure(int i3, Object obj3) {
                                    LogUtil.a("SMART_WeightSmarterHelper", "save setUserData failure ");
                                }
                            });
                        }
                    }

                    @Override // com.huawei.hihealth.data.listener.HiCommonListener
                    public void onFailure(int i2, Object obj2) {
                        LogUtil.a("SMART_WeightSmarterHelper", "fetchUserData Failure ");
                    }
                });
            }
        });
    }

    private void c(Context context, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        nkf.a().e(context, jCurrentTimeMillis - (((long) i) * 86400000), jCurrentTimeMillis, 0, new IBaseResponseCallback() { // from class: com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (!(obj instanceof List)) {
                    commonUiBaseResponse.onResponse(100001, null);
                } else if (((List) obj).isEmpty()) {
                    commonUiBaseResponse.onResponse(100001, null);
                } else {
                    commonUiBaseResponse.onResponse(0, null);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    public void d(final double d2, long j) {
        String strE = SharedPreferenceManager.e(this.e, Integer.toString(10006), "health_last_up_cloud_weight_goal_time");
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        LogUtil.a("SMART_WeightSmarterHelper", "judgeUploadAchieveWeight timeInterval = ", Long.valueOf(jCurrentTimeMillis), "lastUpCloudGoalTimeStr = ", strE);
        final boolean z = false;
        if (jCurrentTimeMillis < 604800000) {
            if (TextUtils.isEmpty(strE)) {
                z = true;
            } else {
                try {
                    if (Long.parseLong(strE) < HiDateUtil.s(System.currentTimeMillis())[0]) {
                        z = true;
                    }
                } catch (NumberFormatException e) {
                    LogUtil.e("SMART_WeightSmarterHelper", "judgeUploadAchieveWeight NumberFormatException = ", e.getMessage());
                }
            }
        }
        LogUtil.a("SMART_WeightSmarterHelper", "judgeUploadAchieveWeight isUpTimeResultOk = ", Boolean.valueOf(z));
        nkb.d().e(this.e, new IBaseResponseCallback() { // from class: com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof Double) {
                    double dDoubleValue = ((Double) obj).doubleValue();
                    if (!z || d2 > dDoubleValue) {
                        return;
                    }
                    WeightSmarterHelper.this.c();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("SMART_WeightSmarterHelper", "upLoadWeightGoalToCloud ");
        HashMap map = new HashMap(3);
        map.put("scenarioId", "101");
        map.put("date", HiDateUtil.y(System.currentTimeMillis()));
        ntc ntcVarC = ntc.c();
        ntcVarC.e(2, new ntf(2));
        ntcVarC.e(2, map, new d());
    }

    class d extends SmartHttpCallback {
        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
        public boolean shouldTrigger(Object obj) {
            return obj != null;
        }

        private d() {
        }

        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
        public boolean isHandleResponse(int i, Object obj) {
            LogUtil.a("SMART_WeightSmarterHelper", "upLoadWeightGoalToCloud errCode = ", Integer.valueOf(i));
            boolean z = i == 0;
            if (z) {
                SharedPreferenceManager.e(WeightSmarterHelper.this.e, Integer.toString(10006), "health_last_up_cloud_weight_goal_time", String.valueOf(System.currentTimeMillis()), new StorageParams());
            }
            return z;
        }

        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
        public void goTrigger(Object obj) {
            LogUtil.a("SMART_WeightSmarterHelper", "upLoadWeightGoalToCloud goTrigger");
        }
    }

    public void c(long[] jArr, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("SMART_WeightSmarterHelper", "getPeriodWeightData");
        final double[] dArr = new double[2];
        if (jArr == null || jArr.length != 2) {
            return;
        }
        nkf.a().e(this.e, jArr[0], jArr[1], 0, new IBaseResponseCallback() { // from class: com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                if (commonUiBaseResponse2 == null) {
                    return;
                }
                if (obj instanceof List) {
                    List list = (List) obj;
                    LogUtil.d("SMART_WeightSmarterHelper", "getPeriodWeightData data = ", list);
                    if (list.isEmpty()) {
                        commonUiBaseResponse.onResponse(100001, null);
                        return;
                    }
                    double d2 = ((HiHealthData) list.get(list.size() - 1)).getDouble("bodyWeight");
                    double d3 = ((HiHealthData) list.get(0)).getDouble("bodyWeight");
                    double[] dArr2 = dArr;
                    dArr2[0] = d2;
                    dArr2[1] = d3;
                    commonUiBaseResponse.onResponse(0, dArr2);
                    return;
                }
                commonUiBaseResponse2.onResponse(100001, null);
            }
        });
    }

    private void e(long[] jArr, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("SMART_WeightSmarterHelper", "getAchieveGoalFromCloud ");
        HashMap map = new HashMap(3);
        map.put("scenarioId", "101");
        if (jArr == null || jArr.length != 2) {
            return;
        }
        map.put(Constants.START_DATE, HiDateUtil.y(jArr[0]));
        map.put("endDate", HiDateUtil.y(jArr[1]));
        ntc ntcVarC = ntc.c();
        ntcVarC.e(3, new nth(3));
        ntcVarC.e(3, map, new SmartHttpCallback<Long>() { // from class: com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public boolean isHandleResponse(int i, Long l) {
                LogUtil.a("SMART_WeightSmarterHelper", "getAchieveGoalFromCloud errCode = ", Integer.valueOf(i));
                return i == 0;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public boolean shouldTrigger(Long l) {
                LogUtil.a("SMART_WeightSmarterHelper", "getAchieveGoalFromCloud integer = ", l);
                return l != null;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void goTrigger(Long l) {
                CommonUiBaseResponse commonUiBaseResponse2 = commonUiBaseResponse;
                if (commonUiBaseResponse2 != null) {
                    commonUiBaseResponse2.onResponse(0, l);
                }
            }
        });
    }

    public void a(final long[] jArr, double[] dArr, double d2) {
        double dAbs;
        LogUtil.a("SMART_WeightSmarterHelper", "generateWeightWeeklyMsg");
        if (jArr == null || dArr == null || dArr.length <= 1) {
            return;
        }
        LogUtil.d("SMART_WeightSmarterHelper", "generateWeightWeeklyMsg datas = ", Arrays.toString(dArr));
        int i = 0;
        if (Math.abs(dArr[0] - dArr[1]) < 0.05d) {
            dAbs = 0.0d;
        } else {
            double d3 = dArr[0];
            double d4 = dArr[1];
            if (d3 > d4) {
                dAbs = Math.abs(d3 - d4);
                i = 1;
            } else {
                dAbs = Math.abs(d3 - d4);
                i = 2;
            }
        }
        final double d5 = dAbs;
        if (dArr[1] <= d2) {
            i = 3;
        }
        final int i2 = i;
        LogUtil.a("SMART_WeightSmarterHelper", "generateWeightWeeklyMsg finalWeekUpDown = ", Integer.valueOf(i2));
        e(jArr, new CommonUiBaseResponse() { // from class: com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper.6
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i3, Object obj) {
                if (i3 != 0 || obj == null) {
                    return;
                }
                long jLongValue = ((Long) obj).longValue();
                LogUtil.a("SMART_WeightSmarterHelper", "save result = ", Integer.valueOf(WeightSmarterHelper.this.b("health_weight_weekly_start_time_key", String.valueOf(jArr[0]))), Integer.valueOf(WeightSmarterHelper.this.b("health_weight_weekly_end_time_key", String.valueOf(jArr[1]))), Integer.valueOf(WeightSmarterHelper.this.b("health_weight_weekly_data_change_key", String.valueOf(d5))), Integer.valueOf(WeightSmarterHelper.this.b("health_weight_weekly_up_down_key", String.valueOf(i2))), Integer.valueOf(WeightSmarterHelper.this.b("health_weight_weekly_reach_num_key", String.valueOf(jLongValue))));
                WeightSmarterHelper.this.e(i2, d5, jLongValue, jArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(String str, String str2) {
        return SharedPreferenceManager.e(this.e, Integer.toString(10006), str, str2, new StorageParams(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, double d2, long j, long[] jArr) {
        String strE = SharedPreferenceManager.e(this.e, Integer.toString(10021), "recommend_weight_weekly_report");
        LogUtil.a("SMART_WeightSmarterHelper", "generateWeightWeeklyMsg weightWeeklyReport = ", strE);
        if ("1".equals(strE)) {
            return;
        }
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(20007);
        smartMsgDbObject.setMsgSrc(2);
        smartMsgDbObject.setMsgContentType(5);
        ContentWeightWeekly contentWeightWeekly = new ContentWeightWeekly(i, d2, j);
        contentWeightWeekly.setTimePeriod(0, jArr[0]);
        contentWeightWeekly.setTimePeriod(1, jArr[1]);
        String strE2 = HiJsonUtil.e(contentWeightWeekly, ContentWeightWeekly.class);
        smartMsgDbObject.setMsgContent(strE2);
        smartMsgDbObject.setShowMethod(SmartMsgConstant.SHOW_METHOD_SMART_CARD_HI_BOARD);
        smartMsgDbObject.setShowTime(SmartMsgConstant.DEFAULT_SHOW_TIME);
        smartMsgDbObject.setStatus(1);
        smartMsgDbObject.setMessagePriority(ntl.d(30001, "ai-weight-007"));
        SmartMsgDbObject smartMsgDbObjectA = this.f17726a.a(20007);
        if (smartMsgDbObjectA == null) {
            this.f17726a.e(smartMsgDbObject);
            return;
        }
        long updateTime = smartMsgDbObjectA.getUpdateTime();
        LogUtil.a("SMART_WeightSmarterHelper", "generateWeightWeeklyMsg createTime = ", new Date(updateTime));
        if (System.currentTimeMillis() - updateTime >= 604800000) {
            this.f17726a.d(20007);
            this.f17726a.e(smartMsgDbObject);
        } else {
            if (smartMsgDbObjectA.getMsgContent().equals(strE2)) {
                return;
            }
            LogUtil.a("SMART_WeightSmarterHelper", "generateWeightWeeklyMsg updateMessage");
            smartMsgDbObjectA.setMsgContent(strE2);
            this.f17726a.b(smartMsgDbObjectA.getId(), smartMsgDbObjectA);
        }
    }

    public static boolean[] c(List<String> list, List<String> list2) {
        boolean z;
        boolean z2;
        if (list == null || list.isEmpty()) {
            z = false;
            z2 = false;
        } else {
            if (list.contains("bmi_l3") || list.contains("bmi_l4") || list.contains("bmi_l5")) {
                z2 = true;
            } else {
                LogUtil.a("SMART_WeightSmarterHelper", "checkOnLabelChange isBmiLabelChanged = false");
                z2 = false;
            }
            z = list.contains("SportFitness_0") || list.contains("SportFitness_1");
        }
        if (list2 != null && !list2.isEmpty()) {
            if (list2.contains("bmi_l3") || list2.contains("bmi_l4") || list2.contains("bmi_l5")) {
                z2 = true;
            } else {
                LogUtil.a("SMART_WeightSmarterHelper", "checkOnLabelChange isBmiLabelChanged = false");
            }
            if (list2.contains("SportFitness_0") || list2.contains("SportFitness_1")) {
                z = true;
            }
        }
        return new boolean[]{z2, z};
    }

    public static boolean c(Context context) {
        return context != null && ntl.a(context, "HDK_WEIGHT") > 0;
    }

    public void a(CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.d("SMART_WeightSmarterHelper", "judgeSuggestWeightVideo isExerciseTimes = ", Boolean.valueOf(nss.e()));
        LogUtil.a("SMART_WeightSmarterHelper", "judgeSuggestWeightVideo reduceFatVideo = ", SharedPreferenceManager.e(this.e, Integer.toString(10021), "recommend_reduce_fat_video"), "isRuleOpen = ", Boolean.valueOf(ntl.a(30001, "ai-weight-006")));
        if (commonUiBaseResponse != null) {
            commonUiBaseResponse.onResponse(100001, null);
        }
    }

    public void c(String str, final CommonUiBaseResponse commonUiBaseResponse) {
        if (TextUtils.isEmpty(str) || commonUiBaseResponse == null) {
            LogUtil.a("SMART_WeightSmarterHelper", "checkWeightCommon ruleConstants=", str, " or callback == null");
            return;
        }
        LogUtil.a("SMART_WeightSmarterHelper", "checkWeightCommon ruleConstants=", str);
        boolean zA = nsy.a(this.e).a(4);
        LogUtil.d("SMART_WeightSmarterHelper", "checkWeightCommon isFollowWeight=", Boolean.valueOf(zA));
        if (zA) {
            commonUiBaseResponse.onResponse(0, null);
            return;
        }
        boolean zG = nss.g();
        LogUtil.d("SMART_WeightSmarterHelper", "checkWeightCommon isOutBmi = ", Boolean.valueOf(zG));
        if (zG) {
            commonUiBaseResponse.onResponse(0, null);
            return;
        }
        try {
            int i = Integer.parseInt(ntl.c(30001, str, "recently_num_days_have_data"));
            LogUtil.a("SMART_WeightSmarterHelper", "checkWeightCommon days = ", Integer.valueOf(i));
            c(this.e, i, new CommonUiBaseResponse() { // from class: com.huawei.hwsmartinteractmgr.smarter.WeightSmarterHelper.7
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i2, Object obj) {
                    LogUtil.a("SMART_WeightSmarterHelper", "checkWeightCommon hasWeightData errCode = ", Integer.valueOf(i2));
                    if (i2 == 0) {
                        commonUiBaseResponse.onResponse(0, null);
                    } else {
                        commonUiBaseResponse.onResponse(100001, null);
                    }
                }
            });
        } catch (NumberFormatException e) {
            LogUtil.e("SMART_WeightSmarterHelper", "checkWeightCommon NumberFormatException = ", e.getMessage());
        }
    }
}

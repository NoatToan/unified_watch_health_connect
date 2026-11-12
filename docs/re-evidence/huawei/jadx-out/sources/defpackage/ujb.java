package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.sleep.sleepviewdata.SleepViewConstants;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.ResultUtils;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.pluginsleeplabel.SleepLabelApi;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepTotalData;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes19.dex */
public class ujb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f50215a = {44101, 44102, 44103, 44104, 44105, 44106, 44201, 44205, 44202, 44207, 44204, 44203, 44208, 44107, 44108, 44110, 44235, 44236, 44111, 44112, 44113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f50216b = {"core_sleep_dream_key", "core_sleep_deep_key", "core_sleep_shallow_key", "core_sleep_wake_key", "core_sleep_sum_key", "core_sleep_deep_count_key", "core_sleep_fall_time_key", "core_sleep_go_bed_time_key", "core_sleep_wake_up_time_key", "core_sleep_efficiency_key", "core_sleep_latency_key", "core_sleep_score_key", "core_sleep_snore_freq_key", "core_sleep_wake_count_key", "core_sleep_noon_sleep_count_key", "sleep_device_category_key", "sleep_version", "core_sleep_stable_key_aasm", "core_sleep_rem_key_aasm", "core_sleep_deep_key_aasm", "core_sleep_shallow_key_aasm"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50217c;
    private Context d;

    /* JADX INFO: Access modifiers changed from: private */
    public int e(int i) {
        if (i != 13) {
            return i != 59 ? 0 : 2;
        }
        return 1;
    }

    private ujb(Context context) {
        if (context == null) {
            LogUtil.j("SleepAdviceMgr", "SleepAdviceMgr context null");
        } else {
            this.d = context.getApplicationContext();
        }
    }

    public static ujb b(Context context) {
        return new ujb(context);
    }

    public void c(Date date, int i, int i2, CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("SleepAdviceMgr", "enter getSleepAdvice() ");
        e();
        e(date, i, i2, commonUiBaseResponse);
        LogUtil.a("SleepAdviceMgr", "leave getSleepAdvice()");
    }

    public void e(Date date, Date date2, int i, CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("SleepAdviceMgr", "enter getSleepAdvice() ");
        e();
        b(date, date2, i, commonUiBaseResponse);
        LogUtil.a("SleepAdviceMgr", "leave getSleepAdvice()");
    }

    private void b(Date date, Date date2, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("SleepAdviceMgr", "enter getSleepAdviceFromLib() ");
        long jM = ltb.m(date2) * 1000;
        long jM2 = ltb.m(date) * 1000;
        LogUtil.a("SleepAdviceMgr", "startTime = ", Long.valueOf(jM2), " endTime = ", Long.valueOf(jM));
        d(jM2, jM, 30, i, new IBaseResponseCallback() { // from class: ujc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f50226b.c(commonUiBaseResponse, i2, obj);
            }
        });
    }

    private void e(Date date, int i, int i2, final CommonUiBaseResponse commonUiBaseResponse) {
        LogUtil.a("SleepAdviceMgr", "enter getSleepAdviceFromLib() ");
        long jM = ltb.m(date) * 1000;
        long j = jM - (((long) i) * 86400000);
        LogUtil.a("SleepAdviceMgr", "startTime = ", Long.valueOf(j), " endTime = ", Long.valueOf(jM));
        e(j, jM, i, i2, new IBaseResponseCallback() { // from class: ujf
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i3, Object obj) {
                this.f50230b.b(commonUiBaseResponse, i3, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void c(int i, Object obj, CommonUiBaseResponse commonUiBaseResponse) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            ReleaseLogUtil.d("R_SleepAdviceMgr", "suggestResponseOnLib to enter");
            LogUtil.a("SleepAdviceMgr", "getSleepAdviceFromLib contentValue = ", str);
            String sleepAdviceOriginalInterface = ((SleepLabelApi) Services.b("SleepLabelAlgorithm", SleepLabelApi.class)).getSleepAdviceOriginalInterface(null, str);
            LogUtil.a("SleepAdviceMgr", "getSleepAdviceFromLib ret = ", sleepAdviceOriginalInterface);
            if (TextUtils.isEmpty(sleepAdviceOriginalInterface)) {
                LogUtil.j("SleepAdviceMgr", "strAdvice is Empty");
                commonUiBaseResponse.onResponse(100001, null);
                return;
            }
            CoreSleepTotalData coreSleepTotalData = (CoreSleepTotalData) new Gson().fromJson(sleepAdviceOriginalInterface, CoreSleepTotalData.class);
            if (coreSleepTotalData == null || coreSleepTotalData.getAdNum0() == 0 || coreSleepTotalData.getAdNum1() == 0) {
                LogUtil.j("SleepAdviceMgr", "strAdvice is Empty");
                commonUiBaseResponse.onResponse(100001, null);
                return;
            } else {
                commonUiBaseResponse.onResponse(0, coreSleepTotalData);
                return;
            }
        }
        commonUiBaseResponse.onResponse(i, null);
    }

    private void d(long j, long j2, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        long j3 = j - (((long) i) * 86400000);
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j3);
        hiAggregateOption.setEndTime(j2);
        LogUtil.a("SleepAdviceMgr", "getCoreSleepDataFromStorage optionStartTime time =  ", Long.valueOf(j3), " end time = ", Long.valueOf(j2));
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(f50216b);
        hiAggregateOption.setType(f50215a);
        hiAggregateOption.setReadType(0);
        c(j, i, i2, iBaseResponseCallback, hiAggregateOption);
    }

    private void c(final long j, final int i, final int i2, final IBaseResponseCallback iBaseResponseCallback, HiAggregateOption hiAggregateOption) {
        HiHealthManager.d(this.d).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: ujb.3
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                if (!ujb.this.d(list, i, j)) {
                    JSONObject jSONObjectC = ujb.this.c(list, 2, j, i2, iBaseResponseCallback);
                    if (jSONObjectC == null) {
                        return;
                    }
                    iBaseResponseCallback.a(0, jSONObjectC.toString());
                    return;
                }
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    private void e(long j, final long j2, final int i, final int i2, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SleepAdviceMgr", "getCoreSleepDataFromStorage start time =  ", Long.valueOf(j), " end time = ", Long.valueOf(j2));
        HiHealthManager.d(this.d).aggregateHiHealthData(b(j, j2), new HiAggregateListener() { // from class: ujb.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i3, List<HiHealthData> list, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i3, int i4) {
                if (ujb.this.d(list, i, j2)) {
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                ujb ujbVar = ujb.this;
                JSONObject jSONObjectC = ujbVar.c(list, ujbVar.e(i), j2, i2, iBaseResponseCallback);
                if (jSONObjectC == null) {
                    return;
                }
                iBaseResponseCallback.a(0, jSONObjectC.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(List<HiHealthData> list, int i, long j) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("SleepAdviceMgr", "on success() sumList = null");
            return true;
        }
        if (i != 7 || d(list, j)) {
            return false;
        }
        LogUtil.j("SleepAdviceMgr", "currentDay score = 0, return");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject c(List<HiHealthData> list, int i, long j, int i2, IBaseResponseCallback iBaseResponseCallback) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("type", i);
            jSONObject.put("currTime", d(j));
            int i3 = 0;
            int i4 = 0;
            while (i4 < list.size()) {
                HiHealthData hiHealthData = list.get(i4);
                if (hiHealthData == null) {
                    Object[] objArr = new Object[2];
                    objArr[i3] = "getJsonObject data is null, i = ";
                    objArr[1] = Integer.valueOf(i4);
                    LogUtil.j("SleepAdviceMgr", objArr);
                } else {
                    long j2 = (long) hiHealthData.getDouble("core_sleep_fall_time_key");
                    long j3 = (long) hiHealthData.getDouble("core_sleep_wake_up_time_key");
                    int i5 = hiHealthData.getInt("core_sleep_shallow_key");
                    int i6 = hiHealthData.getInt("core_sleep_deep_key");
                    int i7 = hiHealthData.getInt("core_sleep_dream_key");
                    float f = hiHealthData.getFloat("core_sleep_sum_key");
                    if (gwc.e(hiHealthData)) {
                        i5 = hiHealthData.getInt("core_sleep_shallow_key_aasm");
                        i6 = hiHealthData.getInt("core_sleep_deep_key_aasm");
                        i7 = hiHealthData.getInt("core_sleep_rem_key_aasm");
                    }
                    if (gwc.e(hiHealthData, null) == SleepViewConstants.SleepTypeEnum.SCIENCE) {
                        if (f <= 0.0f) {
                            LogUtil.j("SleepAdviceMgr", "getJsonObject sleepSumTime <= 0");
                        } else if ((i5 > 0 || i6 > 0 || i7 > 0) && (i == 2 || i5 <= 0 || i6 != 0 || i7 != 0)) {
                            jSONArray.put(c(list, i4, d(i6, i5, f), j2, j3));
                        }
                    }
                }
                i4++;
                i3 = 0;
            }
            int i8 = i3;
            if (jSONArray.isNull(i8)) {
                iBaseResponseCallback.a(-1, null);
                return null;
            }
            jSONObject.put("sleepInfoArr", jSONArray);
            jSONObject2.put("sex", this.f50217c);
            jSONObject.put("registerInfo", jSONObject2);
            jSONObject.put("identifier", i2 == 5 ? 1 : i8);
            return jSONObject;
        } catch (JSONException e) {
            LogUtil.e("SleepAdviceMgr", "getCoreSleepDataFromStorage JSONException ", e.getMessage());
            return jSONObject;
        }
    }

    private int d(int i, int i2, float f) {
        return ((Integer) ResultUtils.c(Integer.valueOf((100 - Math.round((i2 / f) * 100.0f)) - Math.round((i / f) * 100.0f)))).intValue();
    }

    private JSONObject c(List<HiHealthData> list, int i, int i2, long j, long j2) throws JSONException {
        boolean z = list.get(i).getInt("sleep_version") == 5;
        JSONObject jSONObject = new JSONObject();
        String timeZone = list.get(i).getTimeZone();
        jSONObject.put("rdi", list.get(i).getInt("core_sleep_snore_freq_key"));
        if (i2 != 0) {
            jSONObject.put(z ? "remAasmScale" : "remScale", i2);
        }
        jSONObject.put("allSleepTime", list.get(i).getInt("core_sleep_sum_key"));
        jSONObject.put("awakeTime", list.get(i).getDouble("core_sleep_wake_key"));
        jSONObject.put("deepSleepPartCnt", list.get(i).getInt("core_sleep_deep_count_key"));
        jSONObject.put(z ? "deepAasmSleepTime" : "deepSleepTime", list.get(i).getInt(z ? "core_sleep_deep_key_aasm" : "core_sleep_deep_key"));
        jSONObject.put("efficiency", list.get(i).getInt("core_sleep_efficiency_key"));
        jSONObject.put("fallAsleepTime", a(j, timeZone));
        jSONObject.put("latency", list.get(i).getInt("core_sleep_latency_key"));
        jSONObject.put(JsUtil.SCORE, list.get(i).getInt("core_sleep_score_key"));
        jSONObject.put("time", a(list.get(i).getStartTime(), timeZone));
        jSONObject.put("wakeUpTime", a(j2, timeZone));
        jSONObject.put("awakeCnt", list.get(i).getInt("core_sleep_wake_count_key"));
        jSONObject.put("snoreCnt", list.get(i).getInt("core_sleep_snore_freq_key"));
        if (z) {
            jSONObject.put("steadySleepScale", list.get(i).getInt("core_sleep_stable_key_aasm"));
        }
        return jSONObject;
    }

    private HiAggregateOption b(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(f50216b);
        hiAggregateOption.setType(f50215a);
        hiAggregateOption.setReadType(0);
        return hiAggregateOption;
    }

    private boolean d(List<HiHealthData> list, long j) {
        for (HiHealthData hiHealthData : list) {
            if (HiDateUtil.d(hiHealthData.getStartTime()) == HiDateUtil.d(j) && hiHealthData.getInt("core_sleep_score_key") > 0) {
                return true;
            }
        }
        return false;
    }

    private void e() {
        LogUtil.a("SleepAdviceMgr", "enter getUserInfo");
        HiHealthNativeApi.a(this.d).fetchUserData(new HiCommonListener() { // from class: ujb.2
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (obj == null) {
                    LogUtil.j("SleepAdviceMgr", "getUserInfo data is null");
                    return;
                }
                List list = (List) obj;
                if (list.size() > 0) {
                    HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                    ujb.this.f50217c = hiUserInfo.getGender();
                    if (ujb.this.f50217c == 1) {
                        ujb.this.f50217c = 0;
                    } else {
                        ujb.this.f50217c = 1;
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.a("SleepAdviceMgr", "get user info errCode = ", Integer.valueOf(i), " errMsg = ", obj);
            }
        });
    }

    private long d(long j) {
        return j + ((long) (d(HiDateUtil.c((String) null)) * 60.0f * 60.0f * 1000.0f));
    }

    private long a(long j, String str) {
        return j + ((long) (d(str) * 60.0f * 60.0f * 1000.0f));
    }

    private float d(String str) {
        int i = 1;
        if (str.contains(Marker.ANY_NON_NULL_MARKER)) {
            str = str.substring(1);
        } else if (str.contains(Constants.LINK)) {
            str = str.substring(1);
            i = -1;
        } else {
            LogUtil.j("SleepAdviceMgr", "time format is not ok. ", str);
        }
        int iN = CommonUtil.n(this.d, str);
        return ((iN / 100.0f) + ((iN % 100) / 60.0f)) * i;
    }
}

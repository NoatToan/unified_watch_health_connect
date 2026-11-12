package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.hwuserlabelmgr.manager.UpdateTrackDataListener;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class fmf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static UpdateTrackDataListener f34250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile List<Integer> f34251c;
    private static final Object e = new Object();

    public static void d(final Context context) {
        LogUtil.a("UserLabelHelper", "saveThirtyDaysTrackDataToOdmf enter");
        lsy.a(new Runnable() { // from class: fmf.5
            @Override // java.lang.Runnable
            public void run() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                HiDataReadOption hiDataReadOption = new HiDataReadOption();
                hiDataReadOption.setStartTime(jCurrentTimeMillis - 2592000000L);
                hiDataReadOption.setEndTime(jCurrentTimeMillis2);
                hiDataReadOption.setType(new int[]{30002});
                HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: fmf.5.3
                    @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                    public void onResult(Object obj, int i, int i2) {
                        if (i != 0 || obj == null) {
                            return;
                        }
                        SparseArray sparseArray = (SparseArray) obj;
                        if (!(sparseArray.get(30002) instanceof List)) {
                            LogUtil.j("UserLabelHelper", "saveThirtyDaysTrackDataToOdmf is not list");
                            return;
                        }
                        List list = (List) sparseArray.get(30002);
                        if (list == null) {
                            return;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            fmf.b(context, (HiHealthData) it.next());
                        }
                    }

                    @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                    public void onResultIntent(int i, Object obj, int i2, int i3) {
                        LogUtil.d("UserLabelHelper", "saveThirtyDaysTrackDataToOdmf onResultIntent");
                    }
                });
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("user label last modify time", 0).edit();
                editorEdit.putLong("user label last modify time", System.currentTimeMillis());
                editorEdit.commit();
            }
        });
    }

    public static void b(final Context context, HiHealthData hiHealthData) {
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(startTime, endTime);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: fmf.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                HiHealthData hiHealthData2;
                if (obj instanceof SparseArray) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() > 0) {
                        Object obj2 = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                        if (obj2 instanceof List) {
                            List list = (List) obj2;
                            if (njy.e(list) || (hiHealthData2 = (HiHealthData) list.get(0)) == null) {
                                return;
                            }
                            MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
                            String strA = fmf.a(context, hiHealthData2, gcn.c().readTemporaryMotionPath(context, ((HealthDataMgrApi) Services.b("HWHealthDataMgr", HealthDataMgrApi.class)).convertHiDataToTrackData(hiHealthData2, motionPathSimplify)), motionPathSimplify);
                            if (strA == null) {
                                return;
                            }
                            fmb.b().b(strA);
                            return;
                        }
                        return;
                    }
                    LogUtil.a("UserLabelHelper", "map.size() == 0");
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.d("UserLabelHelper", "saveTrackDataToOdmf onResultIntent");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(Context context, HiHealthData hiHealthData, MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        if (motionPath == null || motionPathSimplify == null || context == null || hiHealthData == null) {
            LogUtil.a("UserLabelHelper", "createTrackDataToJson null");
            return null;
        }
        int iRequestSportType = motionPathSimplify.requestSportType();
        String strL = HiDateUtil.l(hiHealthData.getStartTime());
        String string = hiHealthData.getString("device_uniquecode");
        long jRequestTotalTime = motionPathSimplify.requestTotalTime() / 1000;
        double dCeil = Math.ceil(((double) motionPathSimplify.requestTotalCalories()) / 1000.0d);
        String strC = c(motionPath);
        String strD = d(hiHealthData);
        LogUtil.a("UserLabelHelper", "sportSpeedDistribution = ", strD);
        String strA = a(motionPath, (int) jRequestTotalTime, motionPathSimplify.getExtendDataString("isTrustHeartRate"), iRequestSportType);
        LogUtil.a("UserLabelHelper", "heartDistribution = ", strA);
        boolean z = motionPathSimplify.requestDuplicated() == 0;
        int iRequestAbnormalTrack = motionPathSimplify.requestAbnormalTrack();
        LogUtil.a("UserLabelHelper", "abnormalTrack = ", Integer.valueOf(iRequestAbnormalTrack));
        boolean z2 = iRequestAbnormalTrack != 0 ? false : z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("SportType", iRequestSportType);
            jSONObject.put("SportStartTime", strL);
            jSONObject.put(DeviceInfo.TAG_DEVICE_ID, string);
            jSONObject.put("SportStartGPS", strC);
            jSONObject.put("SportDuration", jRequestTotalTime);
            jSONObject.put("HeartDistribution", strA);
            jSONObject.put("SportSpeedDistribution", strD);
            jSONObject.put("HeatQuantity", dCeil);
            jSONObject.put("isValid", z2);
            return jSONObject.toString();
        } catch (JSONException unused) {
            LogUtil.e("UserLabelHelper", "createTrackDataToJson JSONException");
            return null;
        }
    }

    public static void b(Context context) {
        LogUtil.a("UserLabelHelper", "subscribeTrackDataChanged");
        if (context == null) {
            LogUtil.a("UserLabelHelper", "subscribeTrackDataChanged, context = null");
            return;
        }
        synchronized (e) {
            if (f34251c == null) {
                f34251c = new ArrayList(1);
                f34251c.add(4);
                f34250b = new UpdateTrackDataListener(context);
                HiHealthNativeApi.a(context.getApplicationContext()).subscribeHiHealthData(f34251c, f34250b);
            }
        }
    }

    public static void a(Context context) {
        LogUtil.a("UserLabelHelper", "unSubscribeTrackData");
        if (context == null) {
            LogUtil.a("UserLabelHelper", "unSubscribeTrackData, context = null");
            return;
        }
        synchronized (e) {
            if (f34251c != null) {
                HiHealthNativeApi.a(context.getApplicationContext()).unSubscribeHiHealthData(f34250b.b(), new e("UserLabelHelper", "unSubscribeTrackData, isSuccess:"));
                f34251c = null;
            }
        }
    }

    private static String c(MotionPath motionPath) {
        if (motionPath == null) {
            return null;
        }
        Map<Long, double[]> mapRequestLbsDataMap = motionPath.requestLbsDataMap();
        if (mapRequestLbsDataMap == null || mapRequestLbsDataMap.size() == 0) {
            LogUtil.a("UserLabelHelper", "getSportStartGps No GPS");
            return null;
        }
        double[] dArr = mapRequestLbsDataMap.get(0L);
        if (dArr == null || dArr.length < 2) {
            return null;
        }
        double d = dArr[0];
        double d2 = dArr[1];
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(String.valueOf(d2));
        jSONArray.put(String.valueOf(d));
        return jSONArray.toString();
    }

    private static String d(HiHealthData hiHealthData) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (hiHealthData == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int i7 = 0;
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(hiHealthData.getMetaData()).get("paceMap").toString());
            Iterator<String> itKeys = jSONObject.keys();
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            while (itKeys.hasNext()) {
                try {
                    if (itKeys.next() instanceof String) {
                        double d = jSONObject.getDouble(itKeys.next());
                        if (d < 300.0d) {
                            i7++;
                        } else if (d < 360.0d) {
                            i2++;
                        } else if (d < 420.0d) {
                            i3++;
                        } else if (d < 480.0d) {
                            i4++;
                        } else if (d < 540.0d) {
                            i5++;
                        } else {
                            i6++;
                        }
                    }
                } catch (JSONException unused) {
                    i = i7;
                    i7 = i6;
                    LogUtil.e("UserLabelHelper", "getSportSpeedDistribution JSONException");
                    i6 = i7;
                    i7 = i;
                }
            }
        } catch (JSONException unused2) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        jSONArray.put(i7);
        jSONArray.put(i2);
        jSONArray.put(i3);
        jSONArray.put(i4);
        jSONArray.put(i5);
        jSONArray.put(i6);
        return jSONArray.toString();
    }

    private static String a(MotionPath motionPath, int i, String str, int i2) {
        if (motionPath == null) {
            return null;
        }
        ArrayList<HeartRateData> arrayListRequestHeartRateList = motionPath.requestHeartRateList();
        if (njy.e(arrayListRequestHeartRateList)) {
            return null;
        }
        int[] iArrE = gzz.e(arrayListRequestHeartRateList, 100, i, str, ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getLocalUserInfo(), gcn.c().getHeartPostureType(i2));
        if (iArrE == null || iArrE.length < 5) {
            return null;
        }
        int i3 = iArrE[0];
        int i4 = iArrE[1];
        int i5 = iArrE[2];
        int i6 = iArrE[3];
        int i7 = iArrE[4];
        int i8 = i3 + i4 + i5 + i6 + i7;
        if (i8 >= i) {
            i = i8;
        }
        if (i == 0) {
            return null;
        }
        int i9 = (i3 * 100) / i;
        int i10 = (i4 * 100) / i;
        int i11 = (i5 * 100) / i;
        int i12 = (i6 * 100) / i;
        int i13 = (i7 * 100) / i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(i13);
        jSONArray.put(i12);
        jSONArray.put(i11);
        jSONArray.put(i10);
        jSONArray.put(i9);
        jSONArray.put(((((100 - i9) - i10) - i11) - i12) - i13);
        return jSONArray.toString();
    }

    static class e implements HiUnSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f34255c;
        private String d;

        e(String str, String str2) {
            this.f34255c = str;
            this.d = str2;
        }

        @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
        public void onResult(boolean z) {
            LogUtil.a(this.f34255c, this.d, Boolean.valueOf(z));
        }
    }
}

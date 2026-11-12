package com.huawei.coresleepresult;

import android.text.TextUtils;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.ciq;
import defpackage.cir;
import defpackage.ciu;
import defpackage.civ;
import defpackage.npr;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public class HwCoreSleepDataProvider {
    private static volatile boolean d = false;
    private int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5412b = 30;

    private native String GetSleepResult(byte[] bArr, byte[] bArr2, int i);

    private native void SetUserInfo(int i, int i2);

    private static void a() {
        if (d) {
            return;
        }
        try {
            System.loadLibrary("DetailSleepJni");
            d = true;
            LogUtil.a("HwCoreSleepDataProvider", "load detail sleep jni lib success");
        } catch (UnsatisfiedLinkError e) {
            LogUtil.e("HwCoreSleepDataProvider", "load detail sleep jni lib fail:", e.getMessage());
            ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "load detail sleep jni lib fail.");
        }
    }

    public void e(ArrayList<byte[]> arrayList, ArrayList<byte[]> arrayList2, IBaseResponseCallback iBaseResponseCallback) {
        String strGetSleepResult;
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "enter getCoreSleepProcessResult");
        if (arrayList2 == null || arrayList2.isEmpty()) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(100001, null);
            }
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "leave getCoreSleepProcessResult strStatusContent size is empty");
            return;
        }
        int iA = a(c((String) null));
        byte[] bArrB = b(arrayList2);
        if (bArrB == null || bArrB.length == 0) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(100001, null);
            }
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "leave getCoreSleepProcessResult status size is empty");
            return;
        }
        a();
        try {
            try {
                npr.a(32);
                if (arrayList == null || arrayList.isEmpty()) {
                    LogUtil.a("HwCoreSleepDataProvider", "parseByteList 2");
                    strGetSleepResult = GetSleepResult(bArrB, new byte[0], iA);
                } else {
                    LogUtil.a("HwCoreSleepDataProvider", "parseByteList 1");
                    byte[] bArrB2 = b(arrayList);
                    d();
                    SetUserInfo(this.f5412b, this.e);
                    strGetSleepResult = GetSleepResult(bArrB, bArrB2, iA);
                }
            } catch (UnsatisfiedLinkError unused) {
                ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "getCoreSleepProcessResult UnsatisfiedLinkError");
                strGetSleepResult = "";
            }
            npr.d(32);
            if (!CommonUtil.bu()) {
                LogUtil.a("HwCoreSleepDataProvider", "getCoreSleepProcessResult, result:", strGetSleepResult);
            } else {
                e(strGetSleepResult);
            }
            a(strGetSleepResult, iBaseResponseCallback);
            LogUtil.a("HwCoreSleepDataProvider", "leave getCoreSleepProcessResult");
        } catch (Throwable th) {
            npr.d(32);
            throw th;
        }
    }

    private void e(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "getCoreSleepProcessResult, result: no result back.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("statusInDayArr")) {
                jSONObject.remove("statusInDayArr");
            }
            ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "getCoreSleepProcessResult, result:", jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e("HwCoreSleepDataProvider", "getCoreSleepProcessResult, result: result is error, not json");
        }
    }

    private void a(String str, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "enter parseSleepData");
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("errCode");
            cir cirVar = new cir();
            if (i == 0) {
                cirVar = e(jSONObject);
            } else {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "calculate fail code : ", Integer.valueOf(i));
            }
            LogUtil.d("HwCoreSleepDataProvider", "data:", cirVar);
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(i, cirVar);
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "sleepResult is error.");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(100001, null);
            }
        }
    }

    private cir e(JSONObject jSONObject) {
        cir cirVar = new cir();
        ArrayList<ciq> arrayList = new ArrayList<>(16);
        ArrayList<civ> arrayList2 = new ArrayList<>(16);
        ArrayList<ciu> arrayList3 = new ArrayList<>(16);
        try {
            if (jSONObject.has("statusInMinuteArr")) {
                c(jSONObject, arrayList2);
            }
            if (jSONObject.has("statusInDayArr")) {
                b(jSONObject, arrayList);
            }
            if (jSONObject.has("errCodeArr")) {
                d(jSONObject, arrayList3);
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.a("BTSYNC_CoreSleep_HwCoreSleepDataProvider", "processResultData fail.");
        }
        cirVar.e(arrayList);
        cirVar.a(arrayList2);
        cirVar.d(arrayList3);
        return cirVar;
    }

    private void d(JSONObject jSONObject, ArrayList<ciu> arrayList) throws JSONException {
        LogUtil.a("HwCoreSleepDataProvider", "has errCodeArray");
        JSONArray jSONArray = jSONObject.getJSONArray("errCodeArr");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            ciu ciuVar = new ciu();
            ciuVar.d(jSONArray.getJSONObject(i).getLong("startTime"));
            ciuVar.a(jSONArray.getJSONObject(i).getLong("endTime"));
            ciuVar.b(jSONArray.getJSONObject(i).getInt("errCode"));
            arrayList.add(ciuVar);
        }
    }

    private void c(JSONObject jSONObject, ArrayList<civ> arrayList) throws JSONException {
        LogUtil.a("HwCoreSleepDataProvider", "has statusInMinuteArray");
        JSONArray jSONArray = jSONObject.getJSONArray("statusInMinuteArr");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            civ civVar = new civ();
            civVar.b(jSONArray.getJSONObject(i).getLong("startTime"));
            civVar.c(jSONArray.getJSONObject(i).getLong("endTime"));
            String string = jSONArray.getJSONObject(i).getString("status");
            if (!string.isEmpty()) {
                civVar.c(string);
            }
            arrayList.add(civVar);
        }
    }

    private void b(JSONObject jSONObject, ArrayList<ciq> arrayList) throws JSONException {
        LogUtil.a("HwCoreSleepDataProvider", "has statusInDayArray");
        JSONArray jSONArray = jSONObject.getJSONArray("statusInDayArr");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            ciq ciqVar = new ciq();
            float f = (float) jSONArray.getJSONObject(i).getDouble("validData");
            ciqVar.c(f);
            if (f == 1.0f) {
                ciqVar.e(jSONArray.getJSONObject(i).getLong("startTime"));
                ciqVar.b(jSONArray.getJSONObject(i).getLong("fallAsleepTime"));
                ciqVar.c(jSONArray.getJSONObject(i).getLong("wakeUpTime"));
                arrayList.add(ciqVar);
            } else {
                ciqVar.e(jSONArray.getJSONObject(i).getLong("startTime"));
                ciqVar.b(jSONArray.getJSONObject(i).getLong("fallAsleepTime"));
                ciqVar.c(jSONArray.getJSONObject(i).getLong("wakeUpTime"));
                ciqVar.e(jSONArray.getJSONObject(i).getInt("sleepScore"));
                ciqVar.a(jSONArray.getJSONObject(i).getInt("sleepLatency"));
                ciqVar.d(jSONArray.getJSONObject(i).getLong("goBedTime"));
                ciqVar.d(jSONArray.getJSONObject(i).getInt("sleepEfficiency"));
                ciqVar.c(jSONArray.getJSONObject(i).getInt("snoreFreq"));
                ciqVar.b(jSONArray.getJSONObject(i).getInt("deepSleepPartCnt"));
                arrayList.add(ciqVar);
            }
        }
    }

    private byte[] b(ArrayList<byte[]> arrayList) {
        Iterator<byte[]> it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public String c(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return new SimpleDateFormat("Z").format(Calendar.getInstance().getTime());
    }

    private int a(String str) {
        int i = 1;
        if (str.contains(Marker.ANY_NON_NULL_MARKER)) {
            LogUtil.a("HwCoreSleepDataProvider", Marker.ANY_NON_NULL_MARKER);
            str = str.substring(1);
        } else if (str.contains(Constants.LINK)) {
            LogUtil.a("HwCoreSleepDataProvider", Constants.LINK);
            str = str.substring(1);
            i = -1;
        } else {
            LogUtil.j("HwCoreSleepDataProvider", "do not need parse input time");
        }
        return CommonUtil.n(BaseApplication.getContext(), str) * i;
    }

    private void d() {
        LogUtil.a("HwCoreSleepDataProvider", "enter getUserInfo");
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: com.huawei.coresleepresult.HwCoreSleepDataProvider.5
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
                    HwCoreSleepDataProvider.this.e = hiUserInfo.getGender();
                    if (HwCoreSleepDataProvider.this.e == 1) {
                        HwCoreSleepDataProvider.this.e = 0;
                    } else {
                        HwCoreSleepDataProvider.this.e = 1;
                    }
                    HwCoreSleepDataProvider.this.f5412b = hiUserInfo.getAge();
                    if (HwCoreSleepDataProvider.this.f5412b <= 0 || HwCoreSleepDataProvider.this.f5412b > 130) {
                        HwCoreSleepDataProvider.this.f5412b = 30;
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("HwCoreSleepDataProvider", "get user info errorCode:", Integer.valueOf(i), ",errorMessage:", obj);
            }
        });
    }
}

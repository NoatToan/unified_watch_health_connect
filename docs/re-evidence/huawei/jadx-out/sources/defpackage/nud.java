package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Message;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hihealth.device.open.IHealthDeviceCallback;
import com.huawei.hihealth.device.open.MeasureController;
import com.huawei.hihealth.device.open.MeasureKit;
import com.huawei.hihealth.device.open.data.MeasureRecord;
import com.huawei.hihealth.device.open.data.MeasureResult;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwstressmgr.interfaces.StressWearAppInterface;
import com.huawei.operation.jsoperation.JsUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f43728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ComponentName f43729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioManager f43730c;
    private AudioManager.OnAudioFocusChangeListener d;
    private int e;
    private boolean f;
    private boolean g;
    private String h;
    private boolean i;
    private boolean j;
    private long k;
    private JSONObject l;
    private List<Integer> m;
    private IBaseResponseCallback n;
    private List<Integer> o;
    private IBaseResponseCallback p;
    private IBaseResponseCallback q;
    private StressWearAppInterface r;
    private ExtendHandler s;
    private String t;

    class e extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(int i) {
        return i == 2 || i == 3 || i == 5 || i == 6 || i == 10 || i == 11 || i == 13 || i == 14;
    }

    private boolean e(int i) {
        return i == 1 || i == 4 || i == 12 || i == 8 || i == 9;
    }

    private nud() {
        this.e = 5;
        this.f = false;
        this.m = new ArrayList(16);
        this.o = new ArrayList(16);
        this.l = new JSONObject();
        this.h = "";
        this.t = "";
        this.j = false;
        this.n = new IBaseResponseCallback() { // from class: nud.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("Opera_StressService", "stressFunctionCallback errorCode: ", Integer.valueOf(i), " objData: ", obj);
            }
        };
        this.q = new IBaseResponseCallback() { // from class: nud.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj != null) {
                    LogUtil.a("Opera_StressService", "mStressWearCallback stress is not null errCode is ", Integer.valueOf(i));
                    nud.this.d(i, obj);
                } else if (i != 100000) {
                    LogUtil.a("Opera_StressService", "failed to open or close stress");
                }
            }
        };
        this.s = HandlerCenter.b(new d(this), "stress_error_handler");
    }

    public static nud c() {
        return b.f43737c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, Object obj) {
        if (i != 100000) {
            LogUtil.a("Opera_StressService", "failed to open or close stress, errCode=", Integer.valueOf(i));
            return;
        }
        try {
            LogUtil.a("Opera_StressService", "mStressWearCallback get callback ");
            if (obj instanceof String) {
                d(new JSONObject((String) obj));
            }
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "mStressWearCallback JSONException");
        }
    }

    private void b() {
        this.j = true;
        if (this.f43728a != null) {
            BaseApplication.getContext().unregisterReceiver(this.f43728a);
            this.f43728a = null;
        }
    }

    private void d(JSONObject jSONObject) {
        LogUtil.a("Opera_StressService", "handleWearCallback() enter");
        if (jSONObject == null) {
            LogUtil.e("Opera_StressService", "handleWearCallback() jsonObject is null.");
            return;
        }
        LogUtil.a("Opera_StressService", "handleWearCallback() jsonObject: ", jSONObject.toString(), ", mIsWaitingFor2ndCallback is: ", Boolean.valueOf(this.f));
        this.l = jSONObject;
        int iOptInt = jSONObject.optInt("type");
        if (b(this.l)) {
            if (this.p != null) {
                LogUtil.a("Opera_StressService", " isSuccessfulResultCallback send to h5 type ", Integer.valueOf(iOptInt));
                this.p.a(0, this.l.toString());
                if (d(iOptInt)) {
                    this.p = null;
                }
            }
        } else if (this.p != null) {
            LogUtil.a("Opera_StressService", "send to h5 + type ", Integer.valueOf(iOptInt));
            this.p.a(0, jSONObject.toString());
            if (d(iOptInt)) {
                this.p = null;
            }
        }
        this.f = false;
        this.l = new JSONObject();
        a(10005);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    private boolean b(JSONObject jSONObject) {
        boolean z;
        LogUtil.a("Opera_StressService", "isSuccessfulResultCallback enter.");
        try {
            int i = jSONObject.getInt("type");
            LogUtil.a("Opera_StressService", "isSuccessfulResultCallback type: ", Integer.valueOf(i));
            switch (i) {
                case 1:
                case 3:
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                    if (jSONObject.getInt("result_code") != 0) {
                        z = false;
                    }
                    LogUtil.a("Opera_StressService", "isSuccessfulResultCallback isSuccess:", Boolean.valueOf(z));
                    return z;
                case 2:
                case 5:
                case 10:
                case 13:
                    if (jSONObject.getInt("flag") == 1) {
                        break;
                    } else {
                        z = false;
                    }
                    LogUtil.a("Opera_StressService", "isSuccessfulResultCallback isSuccess:", Boolean.valueOf(z));
                    return z;
                case 7:
                    if (jSONObject.getInt("calibration_flag") == 0) {
                        break;
                    } else {
                        z = false;
                    }
                    LogUtil.a("Opera_StressService", "isSuccessfulResultCallback isSuccess:", Boolean.valueOf(z));
                    return z;
                default:
                    Object[] objArr = new Object[1];
                    objArr[0] = "isSuccessfulResultCallback() error type.";
                    LogUtil.a("Opera_StressService", objArr);
                    z = false;
                    LogUtil.a("Opera_StressService", "isSuccessfulResultCallback isSuccess:", Boolean.valueOf(z));
                    return z;
            }
            z = true;
            LogUtil.a("Opera_StressService", "isSuccessfulResultCallback isSuccess:", Boolean.valueOf(z));
            return z;
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "isSuccessfulResultCallback() JSONException");
            return false;
        }
    }

    public void c(StressWearAppInterface stressWearAppInterface) {
        LogUtil.a("Opera_StressService", "registerStressCallback() enter");
        this.r = stressWearAppInterface;
    }

    private void b(int i) {
        LogUtil.a("Opera_StressService", "updateStressStatus() enter, type: ", Integer.valueOf(i), " status: ", Integer.valueOf(this.e));
        switch (i) {
            case 1:
                this.e = 1;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
            case 10:
            case 11:
            case 13:
            case 14:
                this.e = 5;
                break;
            case 4:
                this.e = 4;
                break;
            case 7:
            case 8:
            default:
                LogUtil.a("Opera_StressService", "updateStressStatus() is default");
                break;
            case 9:
                this.e = 2;
                break;
            case 12:
                this.e = 3;
                break;
        }
        LogUtil.a("Opera_StressService", "updateStressStatus() new control status: ", Integer.valueOf(this.e));
    }

    private void c(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "openStress()");
        this.k = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 1);
            jSONObject.put("max_duration", i);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "openStress JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        e(1, i);
    }

    private void g(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "closeStress()");
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.k) / 1000;
        try {
            jSONObject.put("type", 2);
            jSONObject.put("duration", jCurrentTimeMillis);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "closeStress JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        a(10001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "abortStress()");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 3);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "abortStress JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        a(10001);
    }

    private void c(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "openCalibration()");
        this.k = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 4);
            jSONObject.put(JsUtil.SCORE, i2);
            jSONObject.put("max_duration", i);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "openCalibration JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        e(4, i);
    }

    private void f(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "closeCalibration()");
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.k) / 1000;
        try {
            jSONObject.put("type", 5);
            jSONObject.put("duration", jCurrentTimeMillis);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "closeCalibration JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        a(10004);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "abortCalibration()");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 6);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "abortCalibration JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        a(10004);
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "checkCalibration()");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 7);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "checkCalibration JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "resetCalibration()");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 8);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "resetCalibration JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
    }

    private void e(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "openRelax()");
        this.k = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 9);
            jSONObject.put("max_duration", i);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "openRelax JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        e(9, i);
    }

    private void j(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "closeRelax()");
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.k) / 1000;
        try {
            jSONObject.put("type", 10);
            jSONObject.put("duration", jCurrentTimeMillis);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "closeRelax JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        a(10002);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "abortRelax()");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 11);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "abortRelax JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        a(10002);
    }

    private void d(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "openGame()");
        this.k = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 12);
            jSONObject.put("max_duration", i);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "openGame JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        e(12, i);
    }

    private void b(int i, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "closeGame()");
        JSONObject jSONObject = new JSONObject();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.k) / 1000;
        try {
            jSONObject.put("type", 13);
            jSONObject.put("duration", jCurrentTimeMillis);
            jSONObject.put(JsUtil.SCORE, i);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "closeGame JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        a(10003);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "abortGame()");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 14);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "abortGame JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
        a(10003);
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "checkConnected() enter.");
        this.j = false;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 15);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "checkConnected JSONException");
        }
        b(jSONObject, iBaseResponseCallback);
    }

    private void b(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "switchStressFunctionStatus enter");
        if (this.f43728a == null && !this.j) {
            this.f43728a = new c();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PHONE_STATE");
            intentFilter.addAction("android.intent.action.NEW_OUTGOING_CALL");
            BaseApplication.getContext().registerReceiver(this.f43728a, intentFilter);
        }
        try {
            jSONObject.put("productId", this.h);
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "switchStressFunctionStatus JSONException");
        }
        StressWearAppInterface stressWearAppInterface = this.r;
        if (stressWearAppInterface == null) {
            LogUtil.e("Opera_StressService", "switchStressFunctionStatus mStressWearAppInterface is null.");
            return;
        }
        boolean deviceSupportStressReport = stressWearAppInterface.getDeviceSupportStressReport();
        LogUtil.a("Opera_StressService", "isSupportStressReport:", Boolean.valueOf(deviceSupportStressReport), " mProductId ", this.h);
        this.p = iBaseResponseCallback;
        int iOptInt = jSONObject.optInt("type");
        b(jSONObject, iOptInt);
        b(iOptInt);
    }

    private void b(JSONObject jSONObject, int i) {
        ArrayList<ContentValues> arrayListE = drw.e().e(HealthDevice.HealthDeviceKind.HDK_HEART_RATE);
        if (njy.e(arrayListE)) {
            this.r.setStressMeasureStatus(jSONObject, this.q);
            return;
        }
        if (i == 15) {
            String asString = "";
            this.h = "";
            String asString2 = "";
            for (ContentValues contentValues : arrayListE) {
                if (dxm.aa(contentValues.getAsString("productId"))) {
                    asString = contentValues.getAsString("productId");
                    asString2 = contentValues.getAsString("uniqueId");
                }
            }
            if (dxm.aa(asString)) {
                d(jSONObject, asString, asString2);
                a();
                return;
            } else {
                this.r.setStressMeasureStatus(jSONObject, this.q);
                return;
            }
        }
        boolean zAa = dxm.aa(this.h);
        if (e(i)) {
            if (zAa) {
                b(this.h, this.t, i);
            }
            this.r.setStressMeasureStatus(jSONObject, this.q);
        } else {
            if (!d(i)) {
                this.r.setStressMeasureStatus(jSONObject, this.q);
                return;
            }
            if (zAa) {
                try {
                    jSONObject.put("rri", i());
                } catch (JSONException unused) {
                    LogUtil.e("Opera_StressService", "determineDeviceTypes JSONException");
                }
                this.r.setStressMeasureStatus(jSONObject, this.q);
                e();
                return;
            }
            this.r.setStressMeasureStatus(jSONObject, this.q);
        }
    }

    private void d(final JSONObject jSONObject, final String str, final String str2) {
        com.huawei.hihealth.device.open.HealthDevice healthDeviceE = dmp.d().e(str, str2);
        MeasureKit measureKitB = dnf.e().b("54C9739F-CA5C-4347-9F00-75B9DDF2C649");
        if (measureKitB == null) {
            this.r.setStressMeasureStatus(jSONObject, this.q);
            return;
        }
        MeasureController measureController = measureKitB.getMeasureController();
        if (measureController != null && healthDeviceE != null) {
            measureController.prepare(healthDeviceE, new IHealthDeviceCallback() { // from class: nud.3
                @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
                public void onDataChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, MeasureResult measureResult) {
                }

                @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
                public void onFailed(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i) {
                }

                @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
                public void onProgressChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, MeasureRecord measureRecord) {
                }

                @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
                public void onStatusChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i) {
                    LogUtil.a("Opera_StressService", "prepare heartRateData onStatusChanged: ", Integer.valueOf(i));
                    nud.this.a(i, str, str2, jSONObject);
                }
            }, dxm.b());
        } else {
            this.r.setStressMeasureStatus(jSONObject, this.q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, String str2, JSONObject jSONObject) {
        if (i != 0 && i != 8 && i != 16) {
            if (i == 2) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", 15);
                    jSONObject2.put("result_code", 0);
                    this.h = str;
                    this.t = str2;
                    this.q.a(100000, jSONObject2.toString());
                    return;
                } catch (JSONException unused) {
                    LogUtil.e("Opera_StressService", "switchStatus JSONException");
                    return;
                }
            }
            if (i != 3 && i != 12 && i != 13) {
                LogUtil.a("Opera_StressService", "prepare onStatusChanged status default.");
                return;
            }
        }
        this.r.setStressMeasureStatus(jSONObject, this.q);
    }

    private void b(String str, String str2, final int i) {
        this.m.clear();
        this.o.clear();
        this.i = true;
        this.g = false;
        this.s.sendEmptyMessage(2, 10000L);
        drw.e().a(str, str2, new IHealthDeviceCallback() { // from class: nud.4
            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onFailed(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i2) {
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onProgressChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, MeasureRecord measureRecord) {
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onDataChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, MeasureResult measureResult) {
                nud.this.c(i);
                if (eqv.d().e(measureResult) instanceof enb) {
                    enb enbVar = (enb) eqv.d().e(measureResult);
                    LogUtil.a("Opera_StressService", "heartRateData");
                    if (enbVar != null) {
                        LogUtil.d("Opera_StressService", "heartRateData:", Integer.valueOf(enbVar.getHeartRate()));
                        nud.this.a(measureResult.getRecords().get(0).getValueList("RRI_SQI_RESULT"));
                    }
                }
            }

            @Override // com.huawei.hihealth.device.open.IHealthDeviceCallback
            public void onStatusChanged(com.huawei.hihealth.device.open.HealthDevice healthDevice, int i2) {
                LogUtil.a("Opera_StressService", "heartRateData_onStatusChanged: ", Integer.valueOf(i2));
                if (i2 == 14) {
                    nud.this.c(i);
                } else if (i2 == 3 || i2 == 8) {
                    nud nudVar = nud.this;
                    nudVar.a(nudVar.p, false);
                } else {
                    LogUtil.a("Opera_StressService", "openHeartRate onStatusChange unknow.");
                }
            }
        }, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<Number> arrayList) {
        if (arrayList != null) {
            LogUtil.d("Opera_StressService", "rri toString: ", b(arrayList));
        }
        if (arrayList != null) {
            if (arrayList.get(0).intValue() != 0) {
                int i = 0;
                for (int i2 = 0; i2 < 14; i2++) {
                    int iIntValue = arrayList.get(i2).intValue();
                    if (iIntValue != 0) {
                        i++;
                        this.o.add(Integer.valueOf(iIntValue));
                    }
                }
                for (int i3 = 0; i3 < i; i3++) {
                    this.m.add(Integer.valueOf(arrayList.get(i3 + 14).intValue()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (this.g) {
            return;
        }
        this.g = true;
        this.s.removeMessages(2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("result_code", 0);
            this.q.a(100000, jSONObject.toString());
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "sendToServer JSONException");
        }
    }

    private String a(List<Integer> list) {
        StringBuffer stringBuffer = new StringBuffer(16);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(String.valueOf(it.next()));
            stringBuffer.append(",");
        }
        if (stringBuffer.toString().contains(",")) {
            stringBuffer.deleteCharAt(stringBuffer.lastIndexOf(","));
        }
        return stringBuffer.toString();
    }

    private String b(List<Number> list) {
        StringBuffer stringBuffer = new StringBuffer(16);
        Iterator<Number> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(String.valueOf(it.next().intValue()));
            stringBuffer.append(",");
        }
        if (stringBuffer.toString().contains(",")) {
            stringBuffer.deleteCharAt(stringBuffer.lastIndexOf(","));
        }
        return stringBuffer.toString();
    }

    private void e(int i, long j) {
        LogUtil.a("Opera_StressService", "startStressTimeOutWaiting(), enter.");
        long j2 = j + 8;
        if (this.s != null) {
            LogUtil.a("Opera_StressService", "startStressTimeOutWaiting(), open type is: ", Integer.valueOf(i), " timeout: ", Long.valueOf(j2));
            if (i == 1) {
                this.s.sendEmptyMessage(10001, j2 * 1000);
                return;
            }
            if (i == 4) {
                this.s.sendEmptyMessage(10004, j2 * 1000);
                return;
            }
            if (i == 9) {
                this.s.sendEmptyMessage(10002, j2 * 1000);
                return;
            } else if (i == 12) {
                this.s.sendEmptyMessage(10003, j2 * 1000);
                return;
            } else {
                LogUtil.a("Opera_StressService", "startStressTimeOutWaiting() unknown type.");
                return;
            }
        }
        LogUtil.e("Opera_StressService", "startStressTimeOutWaiting() mStressErrorHandler is null");
    }

    private void a(int i) {
        LogUtil.a("Opera_StressService", "cancelStressTimeOutWaiting() time out type: ", Integer.valueOf(i));
        ExtendHandler extendHandler = this.s;
        if (extendHandler != null) {
            extendHandler.removeMessages(10001);
            this.s.removeMessages(10002);
            this.s.removeMessages(10003);
            this.s.removeMessages(10004);
            this.s.removeMessages(10005);
            this.s.removeMessages(i);
            return;
        }
        LogUtil.e("Opera_StressService", "cancelStressTimeOutWaiting() mStressErrorHandler is null");
    }

    public void e(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "stressControl() enter. type: ", Integer.valueOf(i), ", duration: ", Integer.valueOf(i2));
        if (i2 < 0 || i2 > 90) {
            LogUtil.e("Opera_StressService", "stressControl() invalid parameter");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(1001, null);
                return;
            }
            return;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.e("Opera_StressService", "stressControl() callback is null.");
            return;
        }
        if (i == 1) {
            c(i2, iBaseResponseCallback);
            return;
        }
        if (i == 2) {
            g(iBaseResponseCallback);
        } else if (i == 3) {
            i(iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(1001, null);
        }
    }

    public void b(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "relaxControl() enter. type: ", Integer.valueOf(i), ", duration:", Integer.valueOf(i2));
        if (i2 < 0 || i2 > 3600) {
            LogUtil.e("Opera_StressService", "relaxControl() invalid parameter");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(1001, null);
                return;
            }
            return;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.e("Opera_StressService", "relaxControl() callback is null.");
            return;
        }
        if (i == 1) {
            e(i2, iBaseResponseCallback);
            return;
        }
        if (i == 2) {
            j(iBaseResponseCallback);
        } else if (i == 3) {
            h(iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(1001, null);
        }
    }

    public void e(int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "gameControl() enter. type: ", Integer.valueOf(i), ",duration: ", Integer.valueOf(i2), ",score: ", Integer.valueOf(i3));
        if (i2 < 0 || i2 > 3600 || i3 < 0) {
            LogUtil.e("Opera_StressService", "gameControl() invalid parameter");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(1001, null);
                return;
            }
            return;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.e("Opera_StressService", "gameControl() callback is null.");
            return;
        }
        if (i == 1) {
            d(i2, iBaseResponseCallback);
            return;
        }
        if (i == 2) {
            b(i3, iBaseResponseCallback);
        } else if (i == 3) {
            b(iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(1001, null);
        }
    }

    public void d(int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Opera_StressService", "calibrationControl() enter. type: ", Integer.valueOf(i), ",duration: ", Integer.valueOf(i2), ",score: ", Integer.valueOf(i3));
        if (i2 < 0 || i2 > 90 || i3 < 0) {
            LogUtil.e("Opera_StressService", "calibrationControl() invalid parameter");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(1001, null);
                return;
            }
            return;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.e("Opera_StressService", "calibrationControl() callback is null.");
            return;
        }
        if (i == 1) {
            c(i2, i3, iBaseResponseCallback);
            return;
        }
        if (i == 2) {
            f(iBaseResponseCallback);
        } else if (i == 3) {
            e(iBaseResponseCallback);
        } else {
            iBaseResponseCallback.a(1001, null);
        }
    }

    public void a(IBaseResponseCallback iBaseResponseCallback, boolean z) {
        LogUtil.a("Opera_StressService", "abort() enter.");
        this.i = z;
        if (iBaseResponseCallback == null) {
            LogUtil.a("Opera_StressService", "abort() callback is null. aborted by user clicking X isFromHeartKanban == " + z);
            if (!z) {
                drw.e().b(this.h, this.t);
            }
            d();
            b();
        }
        LogUtil.a("Opera_StressService", "current stress scene is: ", Integer.valueOf(this.e));
        int i = this.e;
        if (i == 1) {
            i(iBaseResponseCallback);
            return;
        }
        if (i == 2) {
            h(iBaseResponseCallback);
            return;
        }
        if (i == 3) {
            b(iBaseResponseCallback);
            return;
        }
        if (i == 4) {
            e(iBaseResponseCallback);
        } else if (i == 5) {
            LogUtil.a("Opera_StressService", "abort() called when state is idle.");
        } else {
            LogUtil.a("Opera_StressService", "state error.");
        }
    }

    private void e() {
        if (this.i) {
            return;
        }
        drw.e().d(this.h, this.t);
    }

    private JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("listtime", a(this.o));
            jSONObject.put("listrri", a(this.m));
            jSONObject.put("productId", this.h);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("Opera_StressService", "getRriJson JSONException");
            return jSONObject;
        }
    }

    public int a() {
        if (this.f43730c == null) {
            this.f43730c = (AudioManager) BaseApplication.getContext().getSystemService("audio");
            this.f43729b = new ComponentName(BaseApplication.getContext().getPackageName(), e.class.getName());
        }
        this.f43730c.registerMediaButtonEventReceiver(this.f43729b);
        if (this.d == null) {
            this.d = new AudioManager.OnAudioFocusChangeListener() { // from class: nud.1
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public void onAudioFocusChange(int i) {
                }
            };
        }
        return this.f43730c.requestAudioFocus(this.d, 3, 2);
    }

    public void d() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
        AudioManager audioManager = this.f43730c;
        if (audioManager != null && (onAudioFocusChangeListener = this.d) != null) {
            audioManager.abandonAudioFocus(onAudioFocusChangeListener);
        }
        AudioManager audioManager2 = this.f43730c;
        if (audioManager2 != null) {
            audioManager2.unregisterMediaButtonEventReceiver(this.f43729b);
        }
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final nud f43737c = new nud();
    }

    static class d extends BaseHandlerCallback<nud> {
        d(nud nudVar) {
            super(nudVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(nud nudVar, Message message) {
            LogUtil.e("Opera_StressService", "mStressErrorHandler, error is: ", Integer.valueOf(message.what));
            switch (message.what) {
                case 10001:
                    nudVar.i(nudVar.n);
                    return true;
                case 10002:
                    nudVar.h(nudVar.n);
                    return true;
                case 10003:
                    nudVar.b(nudVar.n);
                    return true;
                case 10004:
                    nudVar.e(nudVar.n);
                    return true;
                case 10005:
                    LogUtil.e("Opera_StressService", "mStressErrorHandler, last received json to sent to H5 is: ", nudVar.l.toString());
                    if (nudVar.p != null) {
                        LogUtil.a("Opera_StressService", "send to h5");
                        nudVar.p.a(0, nudVar.l.toString());
                        if (nudVar.d(nudVar.l.optInt("type"))) {
                            nudVar.p = null;
                        }
                    }
                    nudVar.f = false;
                    nudVar.l = new JSONObject();
                    return true;
                default:
                    LogUtil.e("Opera_StressService", "mStressErrorHandler, unknown error code");
                    return false;
            }
        }
    }

    class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("Opera_StressService", "onReceive intent is null");
                return;
            }
            LogUtil.a("Opera_StressService", "onReceive action = ", intent.getAction());
            if (nud.this.e == 1 || nud.this.e == 4) {
                return;
            }
            nud nudVar = nud.this;
            nudVar.a(nudVar.p, false);
        }
    }
}

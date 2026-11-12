package com.huawei.hwservicesmgr.remote;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.mit;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes38.dex */
public class HwStressDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HwStressDataProvider f17699a = null;
    private static volatile boolean d = false;
    private static final Object e = new Object();
    private int f;
    private IBaseResponseCallback i;
    private int l;
    private int n;
    private int o;
    private int s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f17700b = new float[18];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f17701c = new float[10];
    private int j = 0;
    private int g = 0;
    private float h = 0.0f;
    private float m = 100.0f;
    private float k = 0.0f;

    private boolean b(int i, int i2, int i3) {
        return i >= 0 && i2 >= 0 && i3 >= 0;
    }

    private static native float[] getRelaxResultFromAlgorithm(int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2);

    private static native float[] getStressResultFromAlgorithm(float[] fArr, int i, int i2, int[] iArr, int[] iArr2);

    private HwStressDataProvider() {
    }

    public static HwStressDataProvider c() {
        HwStressDataProvider hwStressDataProvider;
        synchronized (e) {
            if (f17699a == null) {
                f17699a = new HwStressDataProvider();
            }
            hwStressDataProvider = f17699a;
        }
        return hwStressDataProvider;
    }

    private static void d() {
        if (d) {
            LogUtil.j("HwStressDataProvider", "loadSo() so file is loaded");
            return;
        }
        try {
            System.loadLibrary("DetailStressJni");
            LogUtil.a("HwStressDataProvider", "load detail stress jni success");
        } catch (UnsatisfiedLinkError unused) {
            LogUtil.e("HwStressDataProvider", "load detail stress jni UnsatisfiedLinkError");
        }
    }

    public void d(int i, JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwStressDataProvider", "getStressResult(), enter getStressResult()");
        this.s = i;
        LogUtil.a("HwStressDataProvider", "getStressResult(), type:", Integer.valueOf(i));
        this.i = iBaseResponseCallback;
        if (i == 1) {
            LogUtil.a("HwStressDataProvider", "getStressResult(), enter STRESS_OPEN");
            i(jSONObject);
            return;
        }
        if (i == 2) {
            LogUtil.a("HwStressDataProvider", "getStressResult(), enter STRESS_CLOSE");
            e(jSONObject);
            return;
        }
        if (i == 4) {
            LogUtil.a("HwStressDataProvider", "getStressResult(), enter STRESS_CALIBRATION_OPEN");
            d(jSONObject);
            return;
        }
        if (i == 5) {
            LogUtil.a("HwStressDataProvider", "getStressResult(), enter STRESS_CALIBRATION_CLOSE");
            b(jSONObject);
            return;
        }
        switch (i) {
            case 8:
                LogUtil.a("HwStressDataProvider", "getStressResult(), enter STRESS_CALIBRATION_RESET");
                e();
                break;
            case 9:
                LogUtil.a("HwStressDataProvider", "getStressResult(), enter RELAX_OPEN");
                a(jSONObject);
                break;
            case 10:
                LogUtil.a("HwStressDataProvider", "getStressResult(), enter RELAX_CLOSE");
                c(jSONObject);
                break;
            default:
                LogUtil.j("HwStressDataProvider", "getStressResult(), enter default type");
                break;
        }
    }

    public void e(final int[] iArr, final int[] iArr2) {
        LogUtil.a("HwStressDataProvider", "processRrData(), enter processRrData()");
        if (iArr == null || iArr2 == null || iArr.length == 0 || iArr2.length == 0) {
            LogUtil.j("HwStressDataProvider", "processRrData(), rrData is null");
            a(100);
            return;
        }
        final int length = iArr.length;
        LogUtil.a("HwStressDataProvider", "processRrData(), rrLength:", Integer.valueOf(length), ", rrData[0]:", Integer.valueOf(iArr[0]), ", rrData[rrLength-1]:", Integer.valueOf(iArr[length - 1]));
        mit.b("HwStressDataProvider", new Runnable() { // from class: com.huawei.hwservicesmgr.remote.HwStressDataProvider.3
            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < length; i++) {
                    LogUtil.a("HwStressDataProvider", "processRrData(), rrData[", Integer.valueOf(i), "]:", Integer.valueOf(iArr[i]), ", timestamp[", Integer.valueOf(i), "]:", Integer.valueOf(iArr2[i]));
                }
                int i2 = HwStressDataProvider.this.s;
                if (i2 == 2) {
                    LogUtil.a("HwStressDataProvider", "processRrData(), enter STRESS_CLOSE");
                    HwStressDataProvider.this.d(length, iArr, iArr2);
                } else if (i2 == 5) {
                    LogUtil.a("HwStressDataProvider", "processRrData(), enter STRESS_CALIBRATION_CLOSE");
                    HwStressDataProvider.this.a(length, iArr, iArr2);
                } else if (i2 == 10) {
                    LogUtil.a("HwStressDataProvider", "processRrData(), enter RELAX_CLOSE");
                    HwStressDataProvider.this.b(length, iArr, iArr2);
                } else {
                    LogUtil.j("HwStressDataProvider", "processRrData(), enter default type");
                }
            }
        });
    }

    private void c(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("HwStressDataProvider", "relaxClosePreProcess(), value is null");
            return;
        }
        try {
            int i = jSONObject.getInt("duration");
            this.o = i;
            LogUtil.a("HwStressDataProvider", "relaxClosePreProcess(), mSignalTime:", Integer.valueOf(i));
        } catch (JSONException unused) {
            LogUtil.e("HwStressDataProvider", "relaxClosePreProcess() JSONException");
        }
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("HwStressDataProvider", "relaxOpenPreProcess(), value is null");
            return;
        }
        try {
            int i = jSONObject.getInt("max_duration");
            this.j = i;
            LogUtil.a("HwStressDataProvider", "relaxOpenPreProcess(), mMaxDuration:", Integer.valueOf(i));
        } catch (JSONException unused) {
            LogUtil.e("HwStressDataProvider", "relaxOpenPreProcess() JSONException");
        }
    }

    private void e() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(25), "calibration_flag");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(25), "calibration_result");
        if (strE != null && !strE.isEmpty()) {
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(25), "calibration_flag");
        }
        if (strE2 != null && !strE2.isEmpty()) {
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(25), "calibration_result");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 8);
            jSONObject.put("result_code", 0);
        } catch (JSONException unused) {
            LogUtil.e("HwStressDataProvider", "stressCalibrationResetPreProcess() JSONException");
        }
        this.i.a(0, jSONObject.toString());
        LogUtil.a("HwStressDataProvider", "stressCalibrationResetPreProcess(), success!");
    }

    private void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                int i = jSONObject.getInt("duration");
                this.o = i;
                LogUtil.a("HwStressDataProvider", "stressCalibrationClosePreProcess(), mSignalTime:", Integer.valueOf(i));
            } catch (JSONException unused) {
                LogUtil.e("HwStressDataProvider", "stressCalibrationClosePreProcess() JSONException");
            }
        }
        for (int i2 = 0; i2 < 16; i2++) {
            this.f17700b[i2] = 0.0f;
        }
        float[] fArr = this.f17700b;
        fArr[16] = this.g;
        fArr[17] = 2.0f;
    }

    private void d(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("HwStressDataProvider", "stressCalibrationOpenPreProcess() value is null");
            return;
        }
        try {
            this.g = jSONObject.getInt(JsUtil.SCORE);
            int i = jSONObject.getInt("max_duration");
            this.j = i;
            LogUtil.a("HwStressDataProvider", "stressCalibrationOpenPreProcess(), mCalibrationScore:", Integer.valueOf(this.g), ", mMaxDuration:", Integer.valueOf(i));
        } catch (JSONException unused) {
            LogUtil.e("HwStressDataProvider", "stressCalibrationOpenPreProcess() JSONException");
        }
    }

    private void e(JSONObject jSONObject) {
        int i = 0;
        if (jSONObject != null) {
            try {
                int i2 = jSONObject.getInt("duration");
                this.o = i2;
                LogUtil.a("HwStressDataProvider", "stressClosePreProcess(), mSignalTime:", Integer.valueOf(i2));
            } catch (JSONException unused) {
                LogUtil.e("HwStressDataProvider", "stressClosePreProcess() JSONException");
            }
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(25), "calibration_result");
        if (strE == null || strE.isEmpty()) {
            while (i < 14) {
                this.f17700b[i] = 0.0f;
                LogUtil.a("HwStressDataProvider", "stressClosePreProcess(), mCalibrationDataArray:", String.valueOf(0.0f));
                i++;
            }
        } else {
            String strReplace = strE.replace("[", "").replace("]", "");
            LogUtil.a("HwStressDataProvider", "stressClosePreProcess(), calibrationResultString:", strReplace);
            String[] strArrSplit = strReplace.split(",");
            if (strArrSplit.length >= 10) {
                while (i < 10) {
                    try {
                        this.f17700b[i] = Float.parseFloat(strArrSplit[i]);
                    } catch (NumberFormatException unused2) {
                        LogUtil.e("HwStressDataProvider", "stressClosePreProcess() NumberFormatException");
                    }
                    i++;
                }
            }
            for (int i3 = 10; i3 < 14; i3++) {
                this.f17700b[i3] = 0.0f;
            }
        }
        b();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004d A[Catch: NumberFormatException -> 0x0063, TryCatch #0 {NumberFormatException -> 0x0063, blocks: (B:4:0x002f, B:6:0x0035, B:9:0x0040, B:11:0x0046, B:14:0x0051, B:16:0x0057, B:17:0x005e, B:12:0x004d, B:7:0x003c), top: B:22:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005e A[Catch: NumberFormatException -> 0x0063, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0063, blocks: (B:4:0x002f, B:6:0x0035, B:9:0x0040, B:11:0x0046, B:14:0x0051, B:16:0x0057, B:17:0x005e, B:12:0x004d, B:7:0x003c), top: B:22:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x003c A[Catch: NumberFormatException -> 0x0063, TryCatch #0 {NumberFormatException -> 0x0063, blocks: (B:4:0x002f, B:6:0x0035, B:9:0x0040, B:11:0x0046, B:14:0x0051, B:16:0x0057, B:17:0x005e, B:12:0x004d, B:7:0x003c), top: B:22:0x002f }] */
    private void b() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(25), "real_calib_score");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(25), "max_score");
        String strE3 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(25), "min_score");
        if (strE != null) {
            try {
                if (!strE.isEmpty()) {
                    this.k = Float.parseFloat(strE);
                } else {
                    this.k = 0.0f;
                }
                if (strE2 == null && !strE2.isEmpty()) {
                    this.h = Float.parseFloat(strE2);
                } else {
                    this.h = 0.0f;
                }
                if (strE3 == null && !strE3.isEmpty()) {
                    this.m = Float.parseFloat(strE3);
                } else {
                    this.m = 100.0f;
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("HwStressDataProvider", "stressClosePreProcess() NumberFormatException");
            }
        } else {
            this.k = 0.0f;
            if (strE2 == null) {
                this.h = 0.0f;
            } else {
                this.h = 0.0f;
            }
            if (strE3 == null) {
                this.m = 100.0f;
            } else {
                this.m = 100.0f;
            }
        }
        float[] fArr = this.f17700b;
        fArr[14] = this.h;
        fArr[15] = this.m;
        fArr[16] = this.k;
        fArr[17] = 0.0f;
    }

    private void i(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("HwStressDataProvider", "stressOpenPreProcess() value is null");
            return;
        }
        try {
            int i = jSONObject.getInt("max_duration");
            this.j = i;
            LogUtil.a("HwStressDataProvider", "stressOpenPreProcess(), mMaxDuration:", Integer.valueOf(i));
        } catch (JSONException unused) {
            LogUtil.e("HwStressDataProvider", "stressOpenPreProcess() JSONException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int[] iArr, int[] iArr2) {
        if (b(this.f, this.n, this.l) && e(this.o, i, iArr, iArr2)) {
            d();
            float[] relaxResultFromAlgorithm = getRelaxResultFromAlgorithm(this.f, this.n, this.l, this.o, i, iArr, iArr2);
            if (relaxResultFromAlgorithm != null && relaxResultFromAlgorithm.length == 23) {
                LogUtil.a("HwStressDataProvider", "relaxCloseProcessNew(), resultFromAlgorithm.length :", Integer.valueOf(relaxResultFromAlgorithm.length));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", 10);
                    jSONObject.put("flag", relaxResultFromAlgorithm[20]);
                    jSONObject.put("grade", relaxResultFromAlgorithm[14]);
                    LogUtil.a("HwStressDataProvider", "relaxCloseProcessNew(), type, flag, grade :", 10, ",", Float.valueOf(relaxResultFromAlgorithm[20]), ",", Float.valueOf(relaxResultFromAlgorithm[14]));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("bar_count", relaxResultFromAlgorithm[8]);
                    jSONObject2.put("codex_1", relaxResultFromAlgorithm[9]);
                    jSONObject2.put("codex_2", relaxResultFromAlgorithm[10]);
                    jSONObject2.put("codex_3", relaxResultFromAlgorithm[11]);
                    jSONObject2.put("codex_4", relaxResultFromAlgorithm[12]);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject2);
                    jSONObject.put("bar_codex", jSONArray);
                    IBaseResponseCallback iBaseResponseCallback = this.i;
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(0, jSONObject.toString());
                    }
                } catch (JSONException unused) {
                    LogUtil.e("HwStressDataProvider", "relaxCloseProcessNew() JSONException");
                }
                int length = relaxResultFromAlgorithm.length;
                for (int i2 = 0; i2 < length; i2++) {
                    LogUtil.a("HwStressDataProvider", "relaxCloseProcessNew(), relaxResultFromAlgorithm[", Integer.valueOf(i2), "]:,", Float.valueOf(relaxResultFromAlgorithm[i2]));
                }
                return;
            }
            LogUtil.j("HwStressDataProvider", "relaxCloseProcessNew(), resultFromAlgorithm is null!");
            a(101);
            return;
        }
        LogUtil.j("HwStressDataProvider", "relaxCloseProcessNew invalid relaxParam!");
        a(100);
    }

    private boolean e(int i, int i2, int[] iArr, int[] iArr2) {
        return i >= 0 && i2 >= 0 && iArr.length == iArr2.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int[] iArr, int[] iArr2) {
        float[] stressResultFromAlgorithm;
        if (b(this.f17700b, this.o, i, iArr, iArr2)) {
            d();
            try {
                stressResultFromAlgorithm = getStressResultFromAlgorithm(this.f17700b, this.o, i, iArr, iArr2);
            } catch (UnsatisfiedLinkError unused) {
                LogUtil.e("HwStressDataProvider", "stressCalibrationCloseProcess load detail stress jni UnsatisfiedLinkError");
                stressResultFromAlgorithm = null;
            }
            if (stressResultFromAlgorithm != null && stressResultFromAlgorithm.length == 19) {
                LogUtil.a("HwStressDataProvider", "stressCalibrationCloseProcess(), resultFromAlgorithm.length :", Integer.valueOf(stressResultFromAlgorithm.length));
                c(stressResultFromAlgorithm);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", 5);
                    jSONObject.put("flag", stressResultFromAlgorithm[18]);
                    jSONObject.put(JsUtil.SCORE, stressResultFromAlgorithm[15]);
                    jSONObject.put("grade", stressResultFromAlgorithm[16]);
                    LogUtil.a("HwStressDataProvider", "stressCalibrationCloseProcess(), type, flag, score, grade :", 5, ",", Float.valueOf(stressResultFromAlgorithm[18]), ",", Float.valueOf(stressResultFromAlgorithm[15]), ",", Float.valueOf(stressResultFromAlgorithm[16]));
                    IBaseResponseCallback iBaseResponseCallback = this.i;
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(0, jSONObject.toString());
                    }
                } catch (JSONException unused2) {
                    LogUtil.e("HwStressDataProvider", "stressCalibrationCloseProcess() JSONException");
                }
                int length = stressResultFromAlgorithm.length;
                for (int i2 = 0; i2 < length; i2++) {
                    LogUtil.a("HwStressDataProvider", "stressCalibrationCloseProcess(), stressCalibrationResultFromAlgorithm[", Integer.valueOf(i2), "]:", Float.valueOf(stressResultFromAlgorithm[i2]));
                }
                return;
            }
            LogUtil.j("HwStressDataProvider", "stressCalibrationCloseProcess(), resultFromAlgorithm is null!");
            a(101);
            return;
        }
        LogUtil.j("HwStressDataProvider", "stressCalibrationCloseProcess invalid stressCalibrationParam!");
        a(100);
    }

    private void c(float[] fArr) {
        System.arraycopy(fArr, 0, this.f17701c, 0, 10);
        if (((int) fArr[18]) == 1) {
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(25), "calibration_flag", String.valueOf(0), new StorageParams(0));
        }
        this.k = fArr[14];
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(25), "calibration_result", Arrays.toString(this.f17701c), new StorageParams(0));
        Context context = BaseApplication.getContext();
        float f = this.k;
        SharedPreferenceManager.e(context, String.valueOf(25), "real_calib_score", String.valueOf(f), new StorageParams(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int[] iArr, int[] iArr2) {
        if (b(this.f17700b, this.o, i, iArr, iArr2)) {
            d();
            float[] stressResultFromAlgorithm = getStressResultFromAlgorithm(this.f17700b, this.o, i, iArr, iArr2);
            if (stressResultFromAlgorithm != null && stressResultFromAlgorithm.length == 19) {
                LogUtil.a("HwStressDataProvider", "stressCloseProcess(), resultFromAlgorithm.length :", Integer.valueOf(stressResultFromAlgorithm.length));
                e(stressResultFromAlgorithm);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", 2);
                    jSONObject.put("flag", stressResultFromAlgorithm[18]);
                    jSONObject.put(JsUtil.SCORE, stressResultFromAlgorithm[15]);
                    jSONObject.put("grade", stressResultFromAlgorithm[16]);
                    LogUtil.a("HwStressDataProvider", "stressCloseProcess(), type, flag, score, grade :", 2, ",", Float.valueOf(stressResultFromAlgorithm[18]), ",", Float.valueOf(stressResultFromAlgorithm[15]), ",", Float.valueOf(stressResultFromAlgorithm[16]));
                    IBaseResponseCallback iBaseResponseCallback = this.i;
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(0, jSONObject.toString());
                    }
                } catch (JSONException unused) {
                    LogUtil.e("HwStressDataProvider", "stressCloseProcess JSONException");
                }
                int length = stressResultFromAlgorithm.length;
                for (int i2 = 0; i2 < length; i2++) {
                    LogUtil.a("HwStressDataProvider", "stressCloseProcess(), StressResultFromAlgorithm[", Integer.valueOf(i2), "]:", Float.valueOf(stressResultFromAlgorithm[i2]));
                }
                return;
            }
            LogUtil.j("HwStressDataProvider", "stressCloseProcess(), resultFromAlgorithm is null!");
            a(101);
            return;
        }
        LogUtil.j("HwStressDataProvider", "stressCloseProcess() invalid stressParam!");
        a(100);
    }

    private void e(float[] fArr) {
        if (((int) fArr[18]) == 1) {
            LogUtil.a("HwStressDataProvider", "stressCloseProcess(), Stress Algorithm Success!");
            float f = this.h;
            float f2 = fArr[14];
            if (f < f2) {
                this.h = f2;
                Context context = BaseApplication.getContext();
                float f3 = this.h;
                SharedPreferenceManager.e(context, String.valueOf(25), "max_score", String.valueOf(f3), new StorageParams(0));
            }
            float f4 = this.m;
            float f5 = fArr[14];
            if (f4 > f5) {
                this.m = f5;
                Context context2 = BaseApplication.getContext();
                float f6 = this.m;
                SharedPreferenceManager.e(context2, String.valueOf(25), "min_score", String.valueOf(f6), new StorageParams(0));
            }
        }
    }

    private void a(int i) {
        LogUtil.a("HwStressDataProvider", "invalidCallbackProcess(), errorFlagCode:", Integer.valueOf(i), ", type:", Integer.valueOf(this.s));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.s);
            int i2 = this.s;
            if (i2 == 2 || i2 == 5) {
                jSONObject.put("flag", 0);
                jSONObject.put(JsUtil.SCORE, 0);
                jSONObject.put("grade", 0);
            } else if (i2 == 10) {
                jSONObject.put("flag", 0);
                jSONObject.put("grade", 0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("bar_count", 0);
                jSONObject2.put("codex_1", 0);
                jSONObject2.put("codex_2", 0);
                jSONObject2.put("codex_3", 0);
                jSONObject2.put("codex_4", 0);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject2);
                jSONObject.put("bar_codex", jSONArray);
            } else {
                LogUtil.j("HwStressDataProvider", "invalidCallbackProcess() default type");
            }
            if (this.i != null) {
                LogUtil.a("HwStressDataProvider", "invalidCallbackProcess(),", jSONObject.toString());
                this.i.a(0, jSONObject.toString());
            }
        } catch (JSONException unused) {
            LogUtil.e("HwStressDataProvider", "invalidCallbackProcess() JSONException");
        }
    }

    private boolean b(float[] fArr, int i, int i2, int[] iArr, int[] iArr2) {
        return fArr.length == 18 && i >= 0 && i2 >= 0 && iArr.length == iArr2.length;
    }
}

package com.huawei.hms.findnetwork.sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import com.huawei.android.fsm.HwFoldScreenManagerEx;
import com.huawei.android.os.BuildEx;
import com.huawei.hms.findnetwork.comm.request.bean.DeviceDetail;
import com.huawei.hms.findnetwork.comm.request.bean.UltrasoundSettings;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.ultrasound.entity.MeasureResult;
import com.huawei.hms.findnetwork.ultrasound.entity.UltrasoundMeasureParam;
import com.huawei.hms.findnetwork.util.CachedThreadPool;
import com.huawei.hms.findnetwork.util.HmsFindSDKLog;
import com.huawei.hms.findnetwork.util.PermissionUtil;
import com.huawei.hms.findnetwork.util.ScheduleThreadPool;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.ultrasoniclibrary.ultrasoundcore.classfun.FreqParam;
import defpackage.yss;
import defpackage.ysy;
import defpackage.yta;
import defpackage.ytj;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes33.dex */
public class V {
    public static volatile V B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13220b;
    public SensorManager h;
    public SensorEventListener i;
    public float[] j;
    public float[] k;
    public long q;
    public Object r;
    public volatile T t;
    public String u;
    public String v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f13219a = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13221c = 0;
    public long d = -1;
    public float e = -100.0f;
    public float f = 0.0f;
    public int g = 2;
    public final ReentrantLock p = new ReentrantLock();
    public long s = -1;
    public int w = 0;
    public int x = 0;
    public final AtomicReference y = new AtomicReference();
    public final AtomicInteger z = new AtomicInteger(0);
    public final Runnable A = new a();
    public final CopyOnWriteArrayList l = new CopyOnWriteArrayList();
    public final LinkedList m = new LinkedList();
    public final LinkedList n = new LinkedList();
    public final LinkedList o = new LinkedList();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            String str;
            if (V.this.f13219a.get() == 2 && V.this.t != null) {
                if (V.this.l.isEmpty()) {
                    HmsFindSDKLog.i("UltrasoundMeasureManager", "calculate byte array is null, continue.");
                    V.this.z.getAndIncrement();
                    if (V.this.z.get() >= 10) {
                        V.this.z.set(0);
                        V.this.t.a(-3, "can not get record block within3000ms");
                        return;
                    }
                    return;
                }
                V.this.z.set(0);
                UltrasoundMeasureParam ultrasoundMeasureParam = (UltrasoundMeasureParam) V.this.l.remove(0);
                HmsFindSDKLog.d("UltrasoundMeasureManager", "param beginRecordTime is: " + ultrasoundMeasureParam.getBeginRecordTime());
                HmsFindSDKLog.d("UltrasoundMeasureManager", "param mTagStatus is: " + V.this.f13221c);
                HmsFindSDKLog.d("UltrasoundMeasureManager", "param mTagId is: " + V.this.u);
                HmsFindSDKLog.d("UltrasoundMeasureManager", "param mAccelerationLinkedList is: " + Arrays.toString(V.this.n.toArray()));
                HmsFindSDKLog.d("UltrasoundMeasureManager", "param mOrientationFloatLinkedList is: " + Arrays.toString(V.this.m.toArray()));
                HmsFindSDKLog.d("UltrasoundMeasureManager", "param mUltrasoundTxTime: " + V.this.d);
                HmsFindSDKLog.d("UltrasoundMeasureManager", "param mTemperature: " + V.this.e);
                HmsFindSDKLog.d("UltrasoundMeasureManager", "param mAlpha: " + V.this.g);
                FreqParam freqParam = (FreqParam) V.this.y.get();
                try {
                    yta ytaVarD = yss.c().d(new ysy.b().b(ultrasoundMeasureParam.getRecordByteArray()).d(V.this.f13221c).c(V.this.u).c(V.this.n).e(V.this.o).d(V.this.m).e(ultrasoundMeasureParam.getBeginRecordTime()).c(ultrasoundMeasureParam.getUltrasoundTxTime()).c(V.this.e).e(V.this.g).d(freqParam).d());
                    if (ytaVarD == null) {
                        t = V.this.t;
                        str = "positioning result is null";
                    } else {
                        FreqParam freqParamC = ytaVarD.c();
                        if (freqParamC != null) {
                            HmsFindSDKLog.d("UltrasoundMeasureManager", "freqParam.action*" + freqParam.getActionFlag() + ":" + freqParamC.getActionFlag());
                            if (V.this.a(freqParamC, freqParam)) {
                                V.this.t.a(freqParamC);
                                V.this.y.set(freqParamC);
                            } else if (freqParam.getActionFlag() == 2) {
                                freqParam.setActionFlag(freqParamC.getActionFlag());
                            }
                        }
                        float[] fArr = ytaVarD.e;
                        if (fArr != null) {
                            MeasureResult measureResult = new MeasureResult(ytaVarD.f53835b, fArr);
                            HmsFindSDKLog.i("UltrasoundMeasureManager", "measure result is: " + measureResult);
                            V.this.t.a(measureResult);
                            return;
                        }
                        t = V.this.t;
                        str = "positioning result value is null";
                    }
                    t.a(-2, str);
                } catch (Exception e) {
                    HmsFindSDKLog.e("UltrasoundMeasureManager", "measure result error: " + e.getMessage());
                    V.this.t.a(-2, e.getMessage() + ", exception is:" + e);
                }
            }
        }
    }

    public class b implements SensorEventListener {
        public b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            V v;
            float[] fArr;
            if (V.this.f13219a.get() != 2) {
                HmsFindSDKLog.w("UltrasoundMeasureManager", "ultrasound is not running.");
                return;
            }
            float[] fArr2 = sensorEvent.values;
            if (fArr2 == null || fArr2.length < 3) {
                HmsFindSDKLog.w("UltrasoundMeasureManager", "get event values failed.");
                return;
            }
            V.this.p.lock();
            try {
                int type = sensorEvent.sensor.getType();
                int i = 0;
                if (type == 4) {
                    if (V.this.o.size() < 9) {
                        V.this.k = new float[3];
                    } else {
                        V v2 = V.this;
                        v2.k = (float[]) v2.o.removeFirst();
                    }
                    float[] fArr3 = sensorEvent.values;
                    float[] fArr4 = V.this.k;
                    System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
                    V v3 = V.this;
                    v3.o.add(v3.k);
                } else if (type == 10) {
                    if (V.this.n.size() < 9) {
                        V.this.k = new float[3];
                    } else {
                        V v4 = V.this;
                        v4.k = (float[]) v4.n.removeFirst();
                    }
                    float[] fArr5 = sensorEvent.values;
                    float[] fArr6 = V.this.k;
                    System.arraycopy(fArr5, 0, fArr6, 0, fArr6.length);
                    V v5 = V.this;
                    v5.n.add(v5.k);
                } else if (type == 11) {
                    SensorManager.getRotationMatrixFromVector(V.this.j, sensorEvent.values);
                    if (V.this.m.size() < 9) {
                        V.this.k = new float[3];
                    } else {
                        V v6 = V.this;
                        v6.k = (float[]) v6.m.removeFirst();
                    }
                    V v7 = V.this;
                    SensorManager.getOrientation(v7.j, v7.k);
                    while (true) {
                        v = V.this;
                        fArr = v.k;
                        if (i >= fArr.length) {
                            break;
                        }
                        fArr[i] = (float) Math.toDegrees(fArr[i]);
                        i++;
                    }
                    v.m.add(fArr);
                }
            } finally {
                V.this.p.unlock();
            }
        }
    }

    public final byte[] a(byte[] bArr, boolean z) {
        byte[] bArr2 = this.f13220b;
        if (bArr2 == null) {
            bArr2 = new byte[bArr.length * (z ? 3 : 4)];
            this.f13220b = bArr2;
        }
        System.arraycopy(bArr2, bArr.length, bArr2, 0, bArr2.length - bArr.length);
        System.arraycopy(bArr, 0, bArr2, bArr2.length - bArr.length, bArr.length);
        return bArr2;
    }

    public final void b() {
        HmsFindSDKLog.i("UltrasoundMeasureManager", "initSensor begin.");
        b bVar = new b();
        this.i = bVar;
        SensorManager sensorManager = this.h;
        sensorManager.registerListener(bVar, sensorManager.getDefaultSensor(11), 2);
        SensorManager sensorManager2 = this.h;
        sensorManager2.registerListener(this.i, sensorManager2.getDefaultSensor(10), 2);
        SensorManager sensorManager3 = this.h;
        sensorManager3.registerListener(this.i, sensorManager3.getDefaultSensor(4), 2);
        HmsFindSDKLog.i("UltrasoundMeasureManager", "initSensor end.");
    }

    public boolean c() {
        return this.f13219a.get() == 2;
    }

    public final void d() {
        this.f13219a.set(1);
        this.f13221c = 0;
        this.d = -1L;
        this.e = -100.0f;
        this.f = 0.0f;
        this.g = 2;
        SensorManager sensorManager = this.h;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.i);
            this.h = null;
        }
        this.z.set(0);
        this.f13220b = null;
        this.i = null;
        this.l.clear();
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.s = -1L;
        this.q = 0L;
        this.j = null;
        this.k = null;
        HmsFindSDKLog.i("UltrasoundMeasureManager", "resetAllResource status is: " + this.f13219a.get());
        try {
            Object obj = this.r;
            if (obj instanceof HwFoldScreenManagerEx.FoldableStateListener) {
                HwFoldScreenManagerEx.unregisterFoldableState((HwFoldScreenManagerEx.FoldableStateListener) obj);
                HmsFindSDKLog.i("UltrasoundMeasureManager", "unregister fold state listener success.");
            }
        } catch (NoClassDefFoundError | NullPointerException e) {
            HmsFindSDKLog.e("UltrasoundMeasureManager", "can not unregister fold listener, error message: " + e.getMessage());
        }
        this.r = null;
    }

    public void e() {
        if (this.f13219a.compareAndSet(2, 1)) {
            d();
            return;
        }
        HmsFindSDKLog.w("UltrasoundMeasureManager", "stopUltrasoundMeasuring error, ultrasound state is: " + this.f13219a.get());
    }

    public final int a(FreqParam freqParam) {
        return freqParam.getInterval() + 50;
    }

    public void b(String str) {
        UltrasoundSettings ultrasoundSettings = (UltrasoundSettings) JsonUtils.json2Object(str, UltrasoundSettings.class);
        if (ultrasoundSettings == null) {
            HmsFindSDKLog.w("UltrasoundMeasureManager", "json convert failed, so return");
            return;
        }
        if (!c()) {
            HmsFindSDKLog.w("UltrasoundMeasureManager", "refresh settings failed, please start measure first");
            return;
        }
        this.d = ultrasoundSettings.getUltrasoundTxTime();
        this.f13221c = ultrasoundSettings.getTagStatus();
        this.e = ultrasoundSettings.getTemperature();
        this.g = ultrasoundSettings.getAlpha();
    }

    public final int a(Context context) {
        int foldableState;
        try {
            boolean zCheckAppHavePermission = PermissionUtil.checkAppHavePermission(context, context.getPackageName(), new String[]{"com.huawei.permission.MANAGE_FOLD_SCREEN"});
            if (BuildEx.VERSION.EMUI_SDK_INT < 19 || !zCheckAppHavePermission || !HwFoldScreenManagerEx.isFoldable() || (foldableState = HwFoldScreenManagerEx.getFoldableState()) < 0 || foldableState > 3) {
                return -1;
            }
            return foldableState;
        } catch (NoClassDefFoundError e) {
            HmsFindSDKLog.e("UltrasoundMeasureManager", "not a collapsible or buildEx phone ,error message: " + e.getMessage());
            return -1;
        }
    }

    public static V a() {
        if (B == null) {
            synchronized (V.class) {
                if (B == null) {
                    B = new V();
                }
            }
        }
        return B;
    }

    public final void a(UltrasoundSettings ultrasoundSettings) {
        this.j = new float[9];
        this.s = ultrasoundSettings.getStartUltrasoundMeasuringTime();
        HmsFindSDKLog.i("UltrasoundMeasureManager", "start record time is: " + this.s);
        this.f13221c = ultrasoundSettings.getTagStatus();
        this.e = ultrasoundSettings.getTemperature();
        this.f = ultrasoundSettings.getTimeBias();
        HmsFindSDKLog.i("UltrasoundMeasureManager", "time bias is: " + this.f);
        this.g = ultrasoundSettings.getAlpha();
        this.d = ultrasoundSettings.getUltrasoundTxTime();
        HmsFindSDKLog.i("UltrasoundMeasureManager", "ultrasound txTime is: " + this.d);
    }

    public final FreqParam a(Context context, String str, int i, int i2) {
        HmsFindSDKLog.i("UltrasoundMeasureManager", "initUltrasonicEngine:prod." + str + " seq." + i + " foldState." + i2);
        yss yssVarC = yss.c();
        if (i2 == -1) {
            i2 = 0;
        }
        return yssVarC.b(new ytj(str, i, i2), context);
    }

    public final /* synthetic */ void a(int i, Context context) {
        if (this.f13219a.get() != 2) {
            HmsFindSDKLog.w("UltrasoundMeasureManager", "onStateChange, ultrasound is not running.");
            return;
        }
        HmsFindSDKLog.i("UltrasoundMeasureManager", "onStateChange, current fold state is: " + i);
        a(context, this.v, this.w, i);
    }

    public final /* synthetic */ void a(Context context, Bundle bundle) {
        a(context, new SafeBundle(bundle).getInt("fold_state"));
    }

    public void a(String str) {
        HmsFindSDKLog.i("UltrasoundMeasureManager", "onFreqParamAdjustedResult " + str);
        FreqParam freqParam = (FreqParam) JsonUtils.json2Object(str, FreqParam.class);
        if (freqParam == null) {
            HmsFindSDKLog.w("UltrasoundMeasureManager", "json convert failed, so return");
            return;
        }
        if (this.f13219a.get() != 2) {
            HmsFindSDKLog.w("UltrasoundMeasureManager", "refresh settings failed, please start measure first");
            return;
        }
        if (freqParam.getActionFlag() == 2) {
            HmsFindSDKLog.i("UltrasoundMeasureManager", "onFreqParamAdjustedResult.freq " + freqParam.getInitFreq() + " success ACK");
        }
        this.y.set(freqParam);
        this.x = a(freqParam);
    }

    public final void a(final Context context, final int i) {
        CachedThreadPool.getInstance().execSeqTask("UltrasoundMeasureManager", new Runnable() { // from class: com.huawei.hms.findnetwork.sdk.V$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i, context);
            }
        }, new String[0]);
    }

    public void a(int i, byte[] bArr) {
        if (this.f13219a.get() != 2) {
            HmsFindSDKLog.w("UltrasoundMeasureManager", "set record block failed, ultrasound is not running.");
            return;
        }
        if (bArr.length == 0) {
            HmsFindSDKLog.w("UltrasoundMeasureManager", "block length is 0.");
            return;
        }
        long j = this.q;
        if (j != 0 && j >= i) {
            HmsFindSDKLog.w("UltrasoundMeasureManager", "set record block, mSerialNumber = " + this.q + ", serialNumber = " + i + ", block sequence error");
            return;
        }
        if (this.l.size() >= 20 && ((UltrasoundMeasureParam) this.l.remove(0)) != null) {
            HmsFindSDKLog.i("UltrasoundMeasureManager", "reach MAX_BLOCKING_QUEUE_SIZE, remove oldest");
        }
        HmsFindSDKLog.i("UltrasoundMeasureManager", "serialNumber." + i + " block.length =" + bArr.length);
        this.q = (long) i;
        int i2 = this.x;
        boolean z = i2 == 300;
        int length = bArr.length + ((int) ((bArr.length / 7.5f) * 2.0f));
        if (!z) {
            length += bArr.length;
        }
        byte[] bArr2 = new byte[length];
        byte[] bArrA = a(bArr, z);
        System.arraycopy(bArrA, bArrA.length - length, bArr2, 0, length);
        HmsFindSDKLog.i("UltrasoundMeasureManager", "#audioInterval= " + i2 + " targetAudio.length= " + length);
        UltrasoundMeasureParam ultrasoundMeasureParam = new UltrasoundMeasureParam();
        ultrasoundMeasureParam.setRecordByteArray(bArr2);
        long j2 = this.s;
        if (j2 != -1) {
            j2 += ((this.q * 300) - 80) * 1000;
            if (!z) {
                j2 -= 300000;
            }
        }
        ultrasoundMeasureParam.setBeginRecordTime(j2);
        ultrasoundMeasureParam.setUltrasoundTxTime(this.d);
        this.l.add(ultrasoundMeasureParam);
        ScheduleThreadPool.getInstance().scheduleTask(this.A, 0L, TimeUnit.MILLISECONDS);
    }

    public final boolean a(FreqParam freqParam, FreqParam freqParam2) {
        if (freqParam.getActionFlag() == 1) {
            return freqParam2 == null || freqParam2.getInitFreq() != freqParam.getInitFreq();
        }
        return false;
    }

    public void a(final Context context, DeviceDetail deviceDetail, UltrasoundSettings ultrasoundSettings, T t) {
        if (this.f13219a.get() == 2) {
            t.a(-1, "ultrasound measure is running");
            return;
        }
        if (context == null) {
            this.f13219a.set(1);
            t.a(-1, "hmsContext is null");
            return;
        }
        if (ultrasoundSettings == null) {
            this.f13219a.set(1);
            t.a(-1, "json convert failed");
            return;
        }
        d();
        try {
            boolean zCheckAppHavePermission = PermissionUtil.checkAppHavePermission(context, context.getPackageName(), new String[]{"com.huawei.permission.MANAGE_FOLD_SCREEN"});
            if (BuildEx.VERSION.EMUI_SDK_INT >= 19 && zCheckAppHavePermission && HwFoldScreenManagerEx.isFoldable()) {
                HwFoldScreenManagerEx.FoldableStateListener foldableStateListener = new HwFoldScreenManagerEx.FoldableStateListener() { // from class: com.huawei.hms.findnetwork.sdk.V$$ExternalSyntheticLambda1
                    public final void onStateChange(Bundle bundle) {
                        this.f$0.a(context, bundle);
                    }
                };
                HwFoldScreenManagerEx.registerFoldableState(foldableStateListener, 1);
                this.r = foldableStateListener;
            }
        } catch (NoClassDefFoundError e) {
            HmsFindSDKLog.e("UltrasoundMeasureManager", "not a fold or buildEx phone, error message: " + e.getMessage());
        }
        Object systemService = context.getSystemService("sensor");
        if (!(systemService instanceof SensorManager)) {
            this.f13219a.set(1);
            t.a(-1, "can not get sensor manager");
            return;
        }
        this.t = t;
        this.u = deviceDetail.getSn();
        this.v = deviceDetail.getProductId();
        this.w = deviceDetail.getSequence();
        this.h = (SensorManager) systemService;
        a(ultrasoundSettings);
        b();
        FreqParam freqParamA = a(context, this.v, this.w, a(context));
        this.x = a(freqParamA);
        this.y.set(freqParamA);
        this.f13219a.set(2);
        t.a(0, JsonUtils.object2Json(freqParamA));
    }
}

package com.sogou.map.loc;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
final class d2 {
    private static String s = "";
    private final l0 a;
    public final r1 b;
    public final p1 c;
    public final f1 d;
    public final m1 e;
    private String h;
    private String i;
    private String j;
    private SensorManager n;
    private Sensor o;
    public float p;
    private final f2 f = new f2((byte) 0);
    private d k = d.SG;
    private byte l = 0;
    private boolean m = false;
    private boolean q = false;
    private final SensorEventListener r = new e2(this);
    private final byte[] g = r();

    public d2(l0 l0Var) {
        this.n = null;
        this.o = null;
        this.a = l0Var;
        this.b = new r1(l0Var);
        this.c = new p1(l0Var);
        this.d = new f1(l0Var);
        this.e = new m1(l0Var.d());
        try {
            PackageInfo packageInfo = l0Var.d().getPackageManager().getPackageInfo(l0Var.d().getPackageName(), 0);
            this.h = packageInfo.versionName;
            this.i = packageInfo.packageName;
        } catch (Exception unused) {
        }
        SensorManager sensorManagerX = j0.x(l0Var.d());
        this.n = sensorManagerX;
        if (sensorManagerX != null) {
            this.o = sensorManagerX.getDefaultSensor(6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float a(float f) {
        try {
            if (Build.VERSION.SDK_INT >= 9) {
                return SensorManager.getAltitude(1013.25f, f);
            }
        } catch (Throwable unused) {
            r0.b("android sdk Version low : no such mothed");
        }
        return 0.0f;
    }

    private byte[] r() {
        try {
            SharedPreferences sharedPreferences = this.a.d().getSharedPreferences("SGLocSDK", 0);
            String string = sharedPreferences.getString("SDKUUID", "");
            if (string == null || "".equals(string)) {
                string = UUID.randomUUID().toString();
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("SDKUUID", string);
                editorEdit.commit();
            }
            r0.b("getUUID: " + string);
            String strReplaceAll = string.replaceAll("[-]", "");
            int length = strReplaceAll.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) Integer.parseInt(strReplaceAll.substring(i2, i2 + 2), 16);
            }
            return bArr;
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public final synchronized void d() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.b.g();
        this.c.g();
        this.d.g();
        this.e.b();
    }

    public final void e(byte b) {
        this.l = b;
    }

    public final void f(d dVar) {
        this.k = dVar;
    }

    public final void g(String str) {
        this.j = str;
    }

    public final synchronized void i() {
        if (this.m) {
            this.m = false;
            this.b.p();
            this.c.j();
            this.d.n();
            this.e.e();
        }
    }

    public final synchronized void k() {
        Sensor sensor = this.o;
        if (sensor == null) {
            r0.b("phone has no pressure sensor");
            return;
        }
        if (!this.q) {
            try {
                this.n.registerListener(this.r, sensor, 3, this.a.b());
                r0.b("registerListener mPressure Sensor");
                this.q = true;
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized void n() {
        if (this.o == null) {
            return;
        }
        if (this.q) {
            try {
                this.n.unregisterListener(this.r);
                r0.b("unregisterListener mPressure Sensor");
                this.q = false;
            } catch (Exception unused) {
            }
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class cz5 {
    public static final float u;
    public static cz5 v;
    public az5 n;
    public az5 o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14885r;
    public float s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14882a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public boolean f14883b = false;
    public int c = 160;
    public int d = 160;
    public int e = 160;
    public float f = 1.0f;
    public double g = 0.0d;
    public double h = 0.0d;
    public float i = 1.0f;
    public double j = 0.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14884k = 0;
    public Display l = null;
    public DisplayMetrics m = null;
    public final Point p = new Point();
    public final Point q = new Point();
    public boolean t = true;

    static {
        u = TextUtils.equals(Build.DEVICE, "zizhan") ? 0.85f : 0.8f;
        v = null;
    }

    public static cz5 h() {
        if (v == null) {
            v = new cz5();
        }
        return v;
    }

    public final void A(Display display) {
        this.p.set(0, 0);
        Display.Mode[] supportedModes = display.getSupportedModes();
        for (int i = 0; i < supportedModes.length; i++) {
            Display.Mode mode = supportedModes[i];
            if (qr5.c()) {
                qr5.d("\tupdatePhysicalSizeFromDisplay mode" + i + " " + mode);
            }
            this.p.x = Math.max(mode.getPhysicalWidth(), this.p.x);
            this.p.y = Math.max(mode.getPhysicalHeight(), this.p.y);
        }
        if (qr5.c()) {
            qr5.d("\tupdatePhysicalSizeFromDisplay mPhysicalScreenSize " + this.p);
        }
    }

    public final void B(int i, double d) {
        az5 az5Var = this.n;
        if (az5Var == null) {
            return;
        }
        az5 az5Var2 = this.o;
        az5Var2.f17211a = az5Var.f17211a;
        az5Var2.f17212b = az5Var.f17212b;
        az5Var2.c = i;
        az5Var2.d = i;
        float f = i / 160.0f;
        az5Var2.e = f;
        az5Var2.g = (float) (((double) az5Var.g) * d);
        az5Var2.f = f * az5Var.g;
    }

    public final float a(float f) {
        return Math.max(1.0f, Math.min((f / 9.3f) * 1.06f, 1.15f));
    }

    public final float b(float f) {
        return Math.min(1.0f, f / 2.8f);
    }

    public final float c(Context context) {
        float f = 1.0f;
        if (b63.f && p56.c(context)) {
            if (qr5.c()) {
                qr5.d("in flip external screen delta: 1.0f");
            }
            return 1.0f;
        }
        int i = this.c;
        if (qr5.c()) {
            qr5.d("default dpi: " + i);
        }
        if (Build.VERSION.SDK_INT >= 28 && Process.isIsolated()) {
            return 1.0f;
        }
        if (i != -1) {
            f = this.f;
            if (qr5.c()) {
                qr5.d("accessibility dpi: " + this.d + ", delta: " + f);
            }
        }
        return f;
    }

    public final float d() {
        if (dxk.b()) {
            return qr5.a();
        }
        return 0.0f;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        az5 az5Var = this.n;
        return SystemProperties.getInt("ro.sf.lcd_density", az5Var != null ? az5Var.d : -1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x004c, please report this as an issue */
    public final double g(Context context) {
        double d;
        float fB;
        double d2 = this.j;
        if (d2 > 0.0d) {
            this.g = d2;
            return d2;
        }
        if (!efm.d()) {
            d = 1.0d;
            if (b63.d) {
                if (!"cetus".contentEquals(Build.DEVICE)) {
                    fB = b(this.s);
                }
            } else if (b63.f3843b) {
                fB = a(this.f14885r);
            } else if (!b63.c) {
                fB = b(this.s);
            }
            if (qr5.c()) {
                qr5.d("getDeviceScale " + d);
            }
            this.g = d;
            return d;
        }
        fB = efm.b(context);
        d = fB;
        if (qr5.c()) {
            qr5.d("getDeviceScale " + d);
        }
        this.g = d;
        return d;
    }

    public az5 i() {
        return this.n;
    }

    public az5 j() {
        return this.o;
    }

    public void k(Context context) {
        this.o = new az5(context.getResources().getConfiguration());
        qr5.d("DensityConfigManager init");
        t(context, context.getResources().getConfiguration());
    }

    public boolean l() {
        return this.t;
    }

    public boolean m() {
        if (this.f14883b || pwk.c() < 14) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 35 && !this.f14882a;
    }

    public boolean n(int i) {
        return i == this.d || i == this.e;
    }

    @Deprecated
    public void o(boolean z) {
        this.f14883b = z;
    }

    @Deprecated
    public void p(boolean z) {
        this.f14882a = z;
    }

    public void q(float f) {
        this.j = f;
    }

    public void r(int i) {
        this.f14884k = i;
    }

    public boolean s(Context context, Configuration configuration) {
        if (this.o == null) {
            return false;
        }
        qr5.d("tryUpdateConfig newConfig " + configuration + " context " + context);
        az5 az5Var = this.n;
        if (az5Var == null) {
            t(context, configuration);
            return true;
        }
        if (configuration.screenWidthDp == az5Var.f17211a && configuration.screenHeightDp == az5Var.f17212b && configuration.densityDpi == az5Var.d && configuration.fontScale == az5Var.g) {
            qr5.d("tryUpdateConfig failed");
            return false;
        }
        t(context, configuration);
        return true;
    }

    public void t(Context context, Configuration configuration) {
        if (this.o == null) {
            return;
        }
        u(context);
        DisplayMetrics displayMetrics = this.m;
        if (this.n == null && displayMetrics != null) {
            this.n = new az5(displayMetrics);
        }
        boolean zN = n(configuration.densityDpi);
        boolean z = this.l.getDisplayId() == 0;
        if (!zN) {
            if (qr5.c()) {
                qr5.d(" <- DensityConfigManager updateConfig return: newConfig may has been modified by autodensity newConfig.densityDpi=" + configuration.densityDpi + " accessibilityDpi=" + this.d + " forcedDpi=" + this.e);
                Display displayF = dz5.f(context);
                if (!z || displayF.getDisplayId() == 0) {
                    return;
                }
                qr5.d("DensityConfigManager warning! Current config may not be of the real display!! defaultDisplayMetrics:" + displayMetrics + " display.name " + displayF.getName());
                return;
            }
            return;
        }
        if (qr5.c()) {
            qr5.d("DensityConfigManager updateConfig " + configuration + " context " + context);
        }
        int i = context.getResources().getDisplayMetrics().densityDpi;
        x(displayMetrics);
        if (qr5.c()) {
            qr5.d("DensityConfigManager updateConfig newConfig.densityDpi=" + configuration.densityDpi + " defaultDpi=" + this.c + " forceDpi=" + this.e + " accessibilityDpi=" + this.d);
        }
        if (z) {
            y(configuration);
        }
        tc8.v(this.n);
        if (z) {
            double dZ = z(context);
            double dW = w(context);
            double d = (b63.c ? 211.0d : (dZ * 1.1398963928222656d) * dW) / ((double) this.d);
            az5 az5Var = this.n;
            if (az5Var != null) {
                int iRound = (int) Math.round(((double) az5Var.d) * d);
                if (qr5.c()) {
                    qr5.d("DensityConfigManager updateConfig deviceScale:" + dW + " scale:" + d);
                }
                B(iRound, d);
            }
        }
        if (qr5.c()) {
            qr5.d("Config changed. Raw config(" + this.n + ")\n\tTargetConfig(" + this.o + ")");
        }
    }

    public final void u(Context context) {
        Display displayF = dz5.f(context);
        if (qr5.c()) {
            qr5.d("DensityConfigManager updateDeviceDisplayInfo context.display: " + displayF + " context: " + context);
        }
        if (displayF.getDisplayId() != 0) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            displayF = displayManager != null ? displayManager.getDisplay(0) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        }
        this.l = displayF;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.m = displayMetrics;
        displayF.getRealMetrics(displayMetrics);
        v(context, displayF, this.m);
        if (qr5.c()) {
            qr5.d("DensityConfigManager updateDeviceDisplayInfo defaultDisplay-displayMetrics " + this.m + " defaultDisplay " + displayF);
            if (this.l != null) {
                qr5.d("DensityConfigManager updateDeviceDisplayInfo display " + this.l.getName() + " id " + this.l.getDisplayId());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x011b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0133, please report this as an issue */
    public final void v(Context context, Display display, DisplayMetrics displayMetrics) {
        int iA;
        A(display);
        if (qr5.c()) {
            qr5.d("\tupdateDeviceDisplayInfo context.densityDpi " + context.getResources().getConfiguration().densityDpi);
        }
        int iF = f();
        if (iF == -1) {
            iF = displayMetrics.densityDpi;
            StringBuilder sb = new StringBuilder();
            sb.append("warning!! can not get default dpi!! use defaultDisplayMetrics.densityDpi instead of it: ");
            sb.append(iF);
        }
        if (qr5.c()) {
            qr5.d("\tupdateDeviceDisplayInfo getDeviceDefaultDpi " + iF);
        }
        this.c = iF;
        this.f = 1.0f;
        Point point = this.q;
        Point point2 = this.p;
        point.set(point2.x, point2.y);
        if (dz5.j()) {
            String str = SystemProperties.get("persist.sys.miui_resolution", null);
            qr5.d("screenResolution: " + str);
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split(",");
                this.q.set(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
            }
            Point point3 = this.q;
            int i = point3.y;
            Point point4 = this.p;
            if (i != point4.y) {
                this.c = (iF * point3.x) / point4.x;
            }
        }
        if (qr5.c()) {
            qr5.d("\tupdateDeviceDisplayInfo getDeviceDefaultDisplayDpi " + displayMetrics.densityDpi);
        }
        if (!b63.f || !p56.c(context)) {
            try {
                int i2 = Settings.System.getInt(context.getContentResolver(), "key_screen_zoom_level", 1);
                if (i2 > 1) {
                    this.f = 1.05f;
                } else if (i2 < 1) {
                    this.f = u;
                } else {
                    this.f = 1.0f;
                }
                iA = cl8.a(context.getContentResolver(), "display_density_forced");
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\tgetAccessibilityDpi Exception: ");
                sb2.append(e);
                iA = -1;
            }
            if (iA == -1) {
                iA = this.c;
            }
            this.e = iA;
            this.d = (int) Math.floor(this.c * this.f);
            if (qr5.c()) {
                qr5.d("\tupdateDisplayInfo currentDefaultDpi=" + this.c + " mCurrentForcedDpi=" + this.e + " mCurrentAccessibilityDpi=" + this.d + " delta=" + this.f + " logicSize=" + this.q + " physicalSize=" + this.p);
            }
        }
        this.f = 1.0f;
        iA = -1;
        if (iA == -1) {
            iA = this.c;
        }
        this.e = iA;
        this.d = (int) Math.floor(this.c * this.f);
        if (qr5.c()) {
            qr5.d("\tupdateDisplayInfo currentDefaultDpi=" + this.c + " mCurrentForcedDpi=" + this.e + " mCurrentAccessibilityDpi=" + this.d + " delta=" + this.f + " logicSize=" + this.q + " physicalSize=" + this.p);
        }
    }

    public final double w(Context context) {
        double d = d();
        if (d < 0.0d) {
            this.t = false;
        } else {
            this.t = true;
        }
        if (d <= 0.0d) {
            d = g(context);
        }
        return d * ((double) c(context));
    }

    public final void x(DisplayMetrics displayMetrics) {
        az5 az5Var = this.n;
        if (az5Var == null || displayMetrics == null) {
            return;
        }
        float f = displayMetrics.density;
        az5Var.e = f;
        float f2 = displayMetrics.scaledDensity;
        az5Var.f = f2;
        az5Var.d = displayMetrics.densityDpi;
        az5Var.g = f2 / f;
        az5Var.f17211a = (int) ((displayMetrics.widthPixels / f) + 0.5f);
        az5Var.f17212b = (int) ((displayMetrics.heightPixels / f) + 0.5f);
    }

    public final void y(Configuration configuration) {
        this.n = new az5(configuration);
    }

    public final double z(Context context) {
        int i = this.f14884k;
        if (i > 0) {
            this.h = i;
            return i;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (qr5.c()) {
            qr5.d("physical size: " + this.p + " cur size: " + this.q + ", display xdpi: " + displayMetrics.xdpi + ", ydpi: " + displayMetrics.ydpi);
        }
        float fMax = Math.max(displayMetrics.xdpi, displayMetrics.ydpi);
        float fMin = Math.min(displayMetrics.xdpi, displayMetrics.ydpi);
        Point point = this.p;
        float fMax2 = Math.max(point.x, point.y);
        Point point2 = this.p;
        float fMin2 = Math.min(point2.x, point2.y);
        Point point3 = this.q;
        float fMax3 = Math.max(point3.x, point3.y);
        Point point4 = this.q;
        float fMin3 = Math.min(point4.x, point4.y);
        if (m()) {
            fMax2 = fMax3;
            fMin2 = fMin3;
        }
        float f = fMax2 / fMax;
        float f2 = fMin2 / fMin;
        this.f14885r = Math.max(f2, f);
        this.s = Math.min(f2, f);
        float fSqrt = (float) Math.sqrt(Math.pow(f, 2.0d) + Math.pow(f2, 2.0d));
        this.i = fSqrt;
        double dSqrt = Math.sqrt(Math.pow(fMax3, 2.0d) + Math.pow(fMin3, 2.0d)) / ((double) fSqrt);
        if (b63.f && fMax3 / displayMetrics.density <= 640.0f && efm.c()) {
            dSqrt = efm.a(context, false);
        }
        this.h = dSqrt;
        if (qr5.c()) {
            qr5.d("Screen inches : " + fSqrt + ", ppi:" + dSqrt + ", physicalX:" + f + " physicalY:" + f2 + ", logicalX:" + this.q.x + " logicalY:" + this.q.y + ",min size inches: " + (Math.min(f2, f) / 2.8f));
        }
        return dSqrt;
    }
}

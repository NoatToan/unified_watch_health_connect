package com.huawei.uikit.hwcolumnsystem.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.xdy;
import defpackage.xdz;
import defpackage.xec;
import defpackage.xef;
import defpackage.xeg;
import defpackage.xft;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes20.dex */
public class HwColumnSystem {
    private static final String e = "HwColumnSystem";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer[]> f29343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29345c;
    private bqmxo d;
    private int f;
    private float g;
    private akxao h;
    private int i;
    private xef j;
    private boolean k;
    private Context l;
    private boolean m;
    private boolean n;
    private String[] o;
    private int s;

    public HwColumnSystem(Context context) {
        this(context, -1);
    }

    private void a(int i, boolean z) {
        int iB;
        int iB2;
        String[] strArr = this.o;
        if (strArr == null) {
            return;
        }
        Pair<Integer, String> pairA = this.d.a(i, strArr, this.g);
        this.f = ((Integer) pairA.first).intValue();
        String str = (String) pairA.second;
        if (z) {
            i = c(i, this.g);
        }
        Matcher matcher = Pattern.compile("^c(\\d+)m(\\d+)g(\\d+)").matcher(str);
        if (matcher.find() && matcher.groupCount() == 3) {
            int i2 = 0;
            try {
                iB = b(Integer.parseInt(matcher.group(2)), this.g);
                try {
                    iB2 = b(Integer.parseInt(matcher.group(3)), this.g);
                    try {
                        i2 = Integer.parseInt(matcher.group(1));
                    } catch (NumberFormatException unused) {
                        Log.e(e, "Set column system input error");
                    }
                } catch (NumberFormatException unused2) {
                    iB2 = 0;
                }
            } catch (NumberFormatException unused3) {
                iB = 0;
                iB2 = 0;
            }
            if (this.j == null) {
                this.j = new xef();
            }
            this.j.b(iB);
            this.j.a(iB2);
            this.j.d(i2);
            this.j.e(i2);
            this.f29345c = i;
            t();
        }
    }

    private int b(int i, float f) {
        return (int) ((i * f) + 0.5f);
    }

    private int c(int i, float f) {
        if (d() == 19) {
            return i;
        }
        Rect rectB = xdz.b();
        if (this.n || this.s != i) {
            this.k = c(this.l);
            this.s = i;
        }
        if (this.k) {
            return (rectB.left > 0 || rectB.right > 0) ? (b(this.l.getResources().getConfiguration().screenWidthDp, f) - rectB.left) - rectB.right : i;
        }
        return i;
    }

    private void k() {
        s();
        HwColumnSplitManager hwColumnSplitManagerE = HwColumnSplitManager.e();
        Activity activityE = hwColumnSplitManagerE.e(this.l);
        if (hwColumnSplitManagerE.d(activityE) && hwColumnSplitManagerE.b(activityE) && Float.compare(this.g, 0.0f) != 0) {
            int i = activityE.getWindow().getAttributes().width;
            this.f29345c = i;
            float f = this.g;
            c(i / f, f);
            Log.d(e, "split mode, mWidthPixel: " + this.f29345c);
        } else {
            if (Build.VERSION.SDK_INT > 28) {
                this.f29345c = c(this.f29345c, this.g);
            }
            m();
            Log.d(e, "normal mode, mWidthPixel: " + this.f29345c);
        }
        t();
    }

    private void l() {
        switch (this.f29344b) {
            case -1:
            case 0:
                this.j = this.d.g();
                break;
            case 1:
            case 2:
            case 17:
            case 18:
                h();
                break;
            case 3:
                this.j = this.d.e();
                break;
            case 4:
                this.j = this.d.b();
                break;
            case 5:
                this.j = this.d.n();
                break;
            case 6:
            case 7:
                p();
                break;
            case 8:
            case 9:
                a();
                break;
            case 10:
                this.j = this.d.k();
                break;
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                n();
                break;
            case 12:
            case 20:
            case 21:
                o();
                break;
            case 19:
                this.j = this.d.a();
                break;
        }
    }

    private void m() {
        if (this.l == null) {
            return;
        }
        this.f = this.d.o();
        l();
    }

    private void n() {
        this.j = this.d.g();
    }

    private void o() {
        int i = this.f29344b;
        if (i == 12) {
            this.j = this.d.a(this.f, this.f29345c, this.i);
            return;
        }
        if (i == 20) {
            this.j = this.d.c(this.f, this.f29345c, this.i);
        } else if (i != 21) {
            n();
        } else {
            this.j = this.d.d(this.f, this.f29345c, this.i);
        }
    }

    private void p() {
        int i = this.f29344b;
        if (i == 6) {
            this.j = this.d.m();
        } else if (i != 7) {
            n();
        } else {
            this.j = this.d.j();
        }
    }

    private void s() {
        DisplayMetrics displayMetrics = this.l.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        this.f29345c = i;
        this.i = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        this.g = f;
        bqmxo bqmxoVar = this.d;
        if (bqmxoVar != null) {
            bqmxoVar.b(i, f);
        }
    }

    private void t() {
        if (this.h == null) {
            this.h = new xdy();
        }
        this.h.b(this.f29344b);
        this.h.a(this.f29345c, this.i, this.g, this.d instanceof xec);
        xef xefVar = this.j;
        if (xefVar != null) {
            this.h.a(xefVar, this.f, this.d instanceof xec);
        }
    }

    public float a(int i) {
        if (i <= 0) {
            return 0.0f;
        }
        return this.h.a(i);
    }

    public void a(boolean z) {
        this.n = z;
    }

    public int b() {
        xef xefVar = this.j;
        if (xefVar != null) {
            return xefVar.b();
        }
        return 0;
    }

    public int b(Context context) {
        String[] strArr;
        if (context == null) {
            return g();
        }
        this.l = context;
        if (this.m && (strArr = this.o) != null && strArr.length == 3) {
            s();
            a(this.f29345c, Build.VERSION.SDK_INT > 28);
        } else {
            k();
        }
        return g();
    }

    public int c() {
        xef xefVar = this.j;
        if (xefVar != null) {
            return xefVar.c();
        }
        return 0;
    }

    public int d() {
        int i = this.f29344b;
        if (i != 12) {
            return i;
        }
        bqmxo bqmxoVar = this.d;
        return bqmxoVar instanceof xec ? bqmxoVar.b(this.f29345c, this.i, this.f) : i;
    }

    public void d(int i) {
        this.f29344b = i;
        if (this.l == null) {
            return;
        }
        k();
    }

    public int e() {
        return this.h.c();
    }

    public float f() {
        return a(1);
    }

    public int i() {
        return this.h.d();
    }

    public int j() {
        return this.f;
    }

    public HwColumnSystem(Context context, int i) {
        this.f29343a = new ArrayList();
        this.f29344b = -1;
        this.j = new xef();
        this.f = 4;
        this.n = true;
        this.f29344b = i;
        this.l = context;
        this.m = false;
        a(context);
        k();
    }

    public int g() {
        return this.h.b();
    }

    public void d(int i, boolean z) {
        this.f29344b = i;
        if (this.l != null && z) {
            k();
        }
    }

    public int a(Context context, boolean z) {
        String[] strArr;
        if (context == null) {
            return g();
        }
        this.l = context;
        if (this.m && (strArr = this.o) != null && strArr.length == 3) {
            s();
            a(this.f29345c, Build.VERSION.SDK_INT > 28);
        } else if (z) {
            k();
        }
        return g();
    }

    private boolean c(Context context) {
        WindowManager windowManager;
        int rotation = (context == null || (windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)) == null) ? 0 : windowManager.getDefaultDisplay().getRotation();
        return rotation == 0 || rotation == 2;
    }

    private void h() {
        int i = this.f29344b;
        if (i == 1) {
            this.j = this.d.c();
            return;
        }
        if (i == 2) {
            this.j = this.d.h();
            return;
        }
        if (i == 17) {
            this.j = this.d.d();
        } else if (i != 18) {
            n();
        } else {
            this.j = this.d.f();
        }
    }

    public int d(Context context, int i, int i2, float f) {
        String[] strArr;
        if (context != null && i > 0 && f >= 0.0f && !b(f, 0.0f)) {
            this.l = context;
            this.f29345c = i;
            this.i = i2;
            this.g = f;
            if (this.m && (strArr = this.o) != null && strArr.length == 3) {
                a(i, false);
            } else {
                c(i / f, f);
                t();
            }
            return g();
        }
        Log.w(e, "width and density should not below to zero!");
        return g();
    }

    private boolean b(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-6f;
    }

    private void a(Context context) {
        this.d = xft.c(context) == 4 ? new xeg(context) : new xec(context);
    }

    private void d(int i, int i2, float f) {
        if (!this.d.b(i)) {
            i = 0;
        }
        this.j = this.d.a(this.f, new Pair<>(Integer.valueOf(this.f29345c), Integer.valueOf(this.i)), i, i2, f);
    }

    private void c(float f, float f2) {
        Pair<Integer, Integer> pairA = this.d.a(f);
        this.f = ((Integer) pairA.first).intValue();
        d(this.f29344b, ((Integer) pairA.second).intValue(), f2);
    }

    private void a() {
        int i = this.f29344b;
        if (i == 8) {
            this.j = this.d.l();
        } else if (i != 9) {
            n();
        } else {
            this.j = this.d.i();
        }
    }
}

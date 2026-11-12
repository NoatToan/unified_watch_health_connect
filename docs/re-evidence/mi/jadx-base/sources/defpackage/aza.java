package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 30)
public class aza {
    public static boolean o = false;
    public static int[] p;
    public static int[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f3601r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3602a;
    public final Display c;
    public final Window d;
    public int h;
    public RecyclerView m;
    public hvf n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f3603b = false;
    public boolean e = false;
    public int f = 0;
    public long g = -1;
    public long i = 0;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3604k = 0;
    public int l = -1;

    public aza(RecyclerView recyclerView) {
        this.m = recyclerView;
        Activity activityD = d(recyclerView.getContext());
        Display display = activityD != null ? activityD.getDisplay() : null;
        this.c = display;
        Window window = activityD != null ? activityD.getWindow() : null;
        this.d = window;
        this.f3602a = (!e() || display == null || window == null) ? false : true;
        if (display == null || window == null) {
            return;
        }
        if (evf.d()) {
            hvf hvfVar = new hvf();
            this.n = hvfVar;
            if (!hvfVar.f(recyclerView)) {
                this.n = null;
            }
        }
        int[] iArr = p;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        this.h = iArr[0];
    }

    public static Activity d(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static boolean e() {
        boolean z = false;
        if (o) {
            return (p == null || q == null) ? false : true;
        }
        try {
            try {
                String str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.vendor.display.dynamic_refresh_rate");
                if (str == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("dynamic params is ");
                    sb.append((p == null || q == null) ? false : true);
                    o = true;
                    return false;
                }
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("dynamic params is ");
                    sb2.append((p == null || q == null) ? false : true);
                    o = true;
                    return false;
                }
                String[] strArrSplit2 = strArrSplit[0].split(",");
                String[] strArrSplit3 = strArrSplit[1].split(",");
                if (strArrSplit3.length != strArrSplit2.length - 1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("dynamic params is ");
                    sb3.append((p == null || q == null) ? false : true);
                    o = true;
                    return false;
                }
                p = new int[strArrSplit2.length];
                for (int i = 0; i < strArrSplit2.length; i++) {
                    p[i] = Integer.parseInt(strArrSplit2[i]);
                }
                q = new int[strArrSplit3.length];
                for (int i2 = 0; i2 < strArrSplit3.length; i2++) {
                    q[i2] = Integer.parseInt(strArrSplit3[i2]);
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("dynamic params is ");
                if (p != null && q != null) {
                    z = true;
                }
                sb4.append(z);
                o = true;
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("dynamic params is ");
                sb5.append((p == null || q == null) ? false : true);
                o = true;
                p = null;
                q = null;
                return false;
            }
        } catch (Throwable th) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("dynamic params is ");
            if (p != null && q != null) {
                z = true;
            }
            sb6.append(z);
            o = true;
            throw th;
        }
    }

    public final int a(int i) {
        int[] iArr = p;
        int i2 = iArr[iArr.length - 1];
        if (!this.e || this.j) {
            return -1;
        }
        if (i == 0) {
            return i2;
        }
        if (this.f == 0) {
            this.i = 0L;
            this.g = System.currentTimeMillis();
        }
        int i3 = this.f + 1;
        this.f = i3;
        this.i += (long) i;
        if (i3 < 3) {
            return -1;
        }
        int iAbs = Math.abs(Math.round(this.i / ((System.currentTimeMillis() - this.g) / 1000.0f)));
        this.f = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = q;
            if (i4 >= iArr2.length) {
                break;
            }
            if (iAbs > iArr2[i4]) {
                i2 = p[i4];
                break;
            }
            i4++;
        }
        int i5 = this.h;
        if (i2 >= i5) {
            int[] iArr3 = p;
            if (i5 != iArr3[iArr3.length - 1] || i2 != iArr3[0]) {
                return -1;
            }
        }
        this.h = i2;
        return i2;
    }

    public void b(int i, int i2, int i3, int i4) {
        int iA;
        hvf hvfVar = this.n;
        if (hvfVar != null) {
            hvfVar.e(i3, i4, i, i2);
            return;
        }
        if (this.f3602a) {
            if ((i == 0 && i2 == 0) || this.f3603b || (iA = a(Math.max(Math.abs(i), Math.abs(i2)))) == -1) {
                return;
            }
            h(iA, false);
        }
    }

    public final void c() {
        if (!evf.d() || !evf.b().c()) {
            this.n = null;
            return;
        }
        if (this.n == null) {
            hvf hvfVar = new hvf();
            this.n = hvfVar;
            if (hvfVar.f(this.m)) {
                return;
            }
            this.n = null;
        }
    }

    public void f(boolean z) {
        hvf hvfVar = this.n;
        if (hvfVar != null) {
            hvfVar.i(z);
        } else if (this.f3602a) {
            this.e = z;
            this.j = true;
            h(p[0], false);
        }
    }

    public void g(RecyclerView recyclerView, int i) {
        hvf hvfVar = this.n;
        if (hvfVar != null) {
            hvfVar.j(recyclerView, i);
            return;
        }
        if (this.f3602a) {
            if (this.j || this.f3603b || this.f3604k != 2) {
                this.f3604k = i;
                return;
            }
            this.f3604k = i;
            if ((recyclerView.canScrollVertically(-1) && recyclerView.canScrollVertically(1)) || (recyclerView.canScrollHorizontally(-1) && recyclerView.canScrollVertically(1))) {
                int[] iArr = p;
                h(iArr[iArr.length - 1], false);
            }
        }
    }

    public final void h(int i, boolean z) {
        Display.Mode[] supportedModes = this.c.getSupportedModes();
        WindowManager.LayoutParams attributes = this.d.getAttributes();
        if (i == this.l || supportedModes == null) {
            return;
        }
        this.l = i;
        for (Display.Mode mode : supportedModes) {
            if (Math.abs(mode.getRefreshRate() - i) <= 1.0f) {
                if (z || hashCode() == f3601r || mode.getRefreshRate() > this.l) {
                    f3601r = hashCode();
                    StringBuilder sb = new StringBuilder();
                    sb.append(f3601r);
                    sb.append(" set Refresh rate to: ");
                    sb.append(i);
                    sb.append(", mode is: ");
                    sb.append(mode.getModeId());
                    attributes.preferredDisplayModeId = mode.getModeId();
                    this.d.setAttributes(attributes);
                    return;
                }
                return;
            }
        }
    }

    public void i(MotionEvent motionEvent) {
        c();
        hvf hvfVar = this.n;
        if (hvfVar != null) {
            hvfVar.k(motionEvent);
            return;
        }
        if (this.f3602a) {
            if (motionEvent.getActionMasked() != 0) {
                if (motionEvent.getActionMasked() == 1) {
                    this.f3603b = false;
                    return;
                }
                return;
            }
            this.f3603b = true;
            int i = p[0];
            this.h = i;
            this.f = 0;
            h(i, true);
            this.e = true;
            this.j = false;
        }
    }
}

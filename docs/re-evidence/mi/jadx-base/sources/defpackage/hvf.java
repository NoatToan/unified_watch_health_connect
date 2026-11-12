package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import androidx.annotation.RequiresApi;
import miuix.core.util.SystemProperties;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 30)
public class hvf {
    public static final boolean o = Boolean.parseBoolean(SystemProperties.get("persist.mimotion.debug", "false"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f20511a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f20512b = null;
    public int[] c = null;
    public int[] d = null;
    public int[] e = null;
    public volatile boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int i = 0;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20513k;
    public Handler l;
    public float m;
    public Context n;

    public final void c(float f) {
        if (this.f20512b == null) {
            this.f20512b = new int[this.c.length];
        }
        if (f == this.m) {
            return;
        }
        this.m = f;
        int i = 0;
        while (true) {
            int[] iArr = this.f20512b;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = (int) (this.c[i] * f);
            i++;
        }
    }

    public int d(int i) {
        int[] iArr = this.f20511a;
        int i2 = iArr[iArr.length - 1];
        if (!this.h || this.g) {
            return this.f20513k;
        }
        if (i == 0) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f20512b;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i > iArr2[i3]) {
                i2 = this.f20511a[i3];
                break;
            }
            i3++;
        }
        int i4 = this.f20513k;
        if (i2 >= i4) {
            int[] iArr3 = this.f20511a;
            if (i4 != iArr3[iArr3.length - 1] || i2 != iArr3[0]) {
                return i2;
            }
        }
        this.f20513k = i2;
        return i2;
    }

    public void e(int i, int i2, int i3, int i4) {
        if (o) {
            StringBuilder sb = new StringBuilder();
            sb.append("calculateSpeed---> velocityX:");
            sb.append(i);
            sb.append(" velocityY:");
            sb.append(i2);
            sb.append(" isTouch:");
            sb.append(this.f);
        }
        final int iD = !this.f ? d(Math.max(Math.abs(i), Math.abs(i2))) : this.f20511a[0];
        this.l.post(new Runnable() { // from class: gvf
            @Override // java.lang.Runnable
            public final void run() {
                this.f19367a.g(iD);
            }
        });
    }

    public boolean f(RecyclerView recyclerView) {
        this.j = recyclerView.getContext().getPackageName();
        this.n = recyclerView.getContext();
        if (!evf.b().c()) {
            return false;
        }
        this.f20511a = new int[]{120, 60, 40, 30, 24, 0};
        int[] iArrB = dvf.a().b();
        this.c = iArrB;
        if (iArrB == null) {
            this.c = new int[]{135, 35, 15, 5, 1, 0};
        }
        c(this.n.getResources().getDisplayMetrics().density);
        if (o) {
            for (int i = 0; i < this.f20512b.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("RefreshRateSpeedLimits[");
                sb.append(i);
                sb.append("] = ");
                sb.append(this.f20512b[i]);
            }
        }
        this.d = new int[]{120, 60, 40, 30, 24};
        this.e = new int[]{480, 95, 48, 10, 0};
        Handler handler = recyclerView.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        this.l = handler;
        return true;
    }

    public final /* synthetic */ void g(int i) {
        evf.b().e(this, i);
    }

    public final /* synthetic */ void h() {
        this.f = false;
    }

    public void i(boolean z) {
        this.h = z;
        this.g = true;
        evf.b().e(this, this.f20511a[0]);
    }

    public void j(RecyclerView recyclerView, int i) {
        if (this.g || this.f || this.i != 2) {
            this.i = i;
        } else {
            this.i = i;
        }
    }

    public void k(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            if (motionEvent.getActionMasked() == 1) {
                this.l.postDelayed(new Runnable() { // from class: fvf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18286a.h();
                    }
                }, 800L);
                return;
            }
            return;
        }
        this.f = true;
        int i = this.f20513k;
        int i2 = this.f20511a[0];
        if (i != i2) {
            this.f20513k = i2;
            evf.b().e(this, this.f20511a[0]);
        }
        this.h = true;
        this.g = false;
        c(this.n.getResources().getDisplayMetrics().density);
    }
}

package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public class e implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f10440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10441b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10442c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10443d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10444e = null;

    public e(y yVar) {
        this.f10440a = yVar;
    }

    @Override // androidx.recyclerview.widget.y
    public final void a(int i14, int i15) {
        int i16;
        if (this.f10441b == 2 && (i16 = this.f10442c) >= i14 && i16 <= i14 + i15) {
            this.f10443d += i15;
            this.f10442c = i14;
        } else {
            e();
            this.f10442c = i14;
            this.f10443d = i15;
            this.f10441b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.y
    @SuppressLint({"UnknownNullness"})
    public final void b(int i14, int i15, Object obj) {
        int i16;
        int i17;
        int i18;
        if (this.f10441b == 3 && i14 <= (i17 = this.f10443d + (i16 = this.f10442c)) && (i18 = i14 + i15) >= i16 && this.f10444e == obj) {
            this.f10442c = Math.min(i14, i16);
            this.f10443d = Math.max(i17, i18) - this.f10442c;
            return;
        }
        e();
        this.f10442c = i14;
        this.f10443d = i15;
        this.f10444e = obj;
        this.f10441b = 3;
    }

    @Override // androidx.recyclerview.widget.y
    public final void c(int i14, int i15) {
        int i16;
        if (this.f10441b == 1 && i14 >= (i16 = this.f10442c)) {
            int i17 = this.f10443d;
            if (i14 <= i16 + i17) {
                this.f10443d = i17 + i15;
                this.f10442c = Math.min(i14, i16);
                return;
            }
        }
        e();
        this.f10442c = i14;
        this.f10443d = i15;
        this.f10441b = 1;
    }

    @Override // androidx.recyclerview.widget.y
    public final void d(int i14, int i15) {
        e();
        this.f10440a.d(i14, i15);
    }

    public final void e() {
        int i14 = this.f10441b;
        if (i14 == 0) {
            return;
        }
        y yVar = this.f10440a;
        if (i14 == 1) {
            yVar.c(this.f10442c, this.f10443d);
        } else if (i14 == 2) {
            yVar.a(this.f10442c, this.f10443d);
        } else if (i14 == 3) {
            yVar.b(this.f10442c, this.f10443d, this.f10444e);
        }
        this.f10444e = null;
        this.f10441b = 0;
    }
}

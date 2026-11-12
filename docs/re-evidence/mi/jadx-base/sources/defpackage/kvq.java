package defpackage;

import android.view.View;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes5.dex */
public class kvq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f24350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24351b;
    public int c;
    public int d;
    public int e;
    public boolean f = true;
    public boolean g = true;

    public kvq(View view) {
        this.f24350a = view;
    }

    public void a() {
        View view = this.f24350a;
        c.b0(view, this.d - (view.getTop() - this.f24351b));
        View view2 = this.f24350a;
        c.a0(view2, this.e - (view2.getLeft() - this.c));
    }

    public int b() {
        return this.f24351b;
    }

    public int c() {
        return this.d;
    }

    public void d() {
        this.f24351b = this.f24350a.getTop();
        this.c = this.f24350a.getLeft();
    }

    public boolean e(int i) {
        if (!this.g || this.e == i) {
            return false;
        }
        this.e = i;
        a();
        return true;
    }

    public boolean f(int i) {
        if (!this.f || this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}

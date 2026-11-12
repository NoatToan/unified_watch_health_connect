package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class usk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36091b;
    public View c;
    public int d;

    public usk(int i) {
        this.f36090a = i;
    }

    public int a() {
        return this.d;
    }

    public View b() {
        return this.c;
    }

    public int c() {
        return this.f36090a;
    }

    public void d(fhl fhlVar) {
        int i = fhlVar.c & 7;
        View view = this.c;
        if (view != null) {
            view.setVisibility(this.f36091b < i ? 0 : 8);
        }
    }

    public void e(int i) {
        this.d = i;
    }

    public void f(View view) {
        this.c = view;
    }

    public usk(int i, int i2) {
        this.f36090a = i;
        this.f36091b = i2;
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class hjg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20130b;

    public hjg(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f20129a | this.f20130b;
    }

    public void b(View view, View view2, int i) {
        c(view, view2, i, 0);
    }

    public void c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f20130b = i;
        } else {
            this.f20129a = i;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i) {
        if (i == 1) {
            this.f20130b = 0;
        } else {
            this.f20129a = 0;
        }
    }
}

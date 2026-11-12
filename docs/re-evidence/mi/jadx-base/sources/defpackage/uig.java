package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class uig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f35792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35793b;
    public boolean c;
    public float d;
    public boolean e;

    public uig(View view) {
        this.f35792a = view;
        this.f35793b = view.getVisibility();
        this.d = view.getAlpha();
    }

    public void a(boolean z, float f) {
        this.e = z;
        if (z) {
            this.f35792a.setAlpha(f);
        } else {
            this.f35792a.setAlpha(this.d);
        }
    }

    public void b(boolean z, int i) {
        this.c = z;
        if (z) {
            this.f35792a.setVisibility(i);
        } else {
            this.f35792a.setVisibility(this.f35793b);
        }
    }
}

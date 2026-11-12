package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class y7h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f39892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39893b;

    public interface a {
        void a(int i, View view);
    }

    public y7h(a aVar, int i) {
        this.f39892a = aVar;
        this.f39893b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f39892a.a(this.f39893b, view);
    }
}

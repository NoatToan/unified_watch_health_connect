package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class x7h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f38785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38786b;

    public interface a {
        void a(int i, View view);
    }

    public x7h(a aVar, int i) {
        this.f38785a = aVar;
        this.f38786b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f38785a.a(this.f38786b, view);
    }
}

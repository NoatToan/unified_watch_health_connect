package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class z7h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f40984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40985b;

    public interface a {
        void a(int i, View view);
    }

    public z7h(a aVar, int i) {
        this.f40984a = aVar;
        this.f40985b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f40984a.a(this.f40985b, view);
    }
}

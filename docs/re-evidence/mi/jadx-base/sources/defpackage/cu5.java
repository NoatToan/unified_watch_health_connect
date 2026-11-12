package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class cu5 implements af4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final af4.a f14718b;

    public cu5(Context context, af4.a aVar) {
        this.f14717a = context.getApplicationContext();
        this.f14718b = aVar;
    }

    public final void h() {
        vem.a(this.f14717a).d(this.f14718b);
    }

    public final void i() {
        vem.a(this.f14717a).e(this.f14718b);
    }

    @Override // defpackage.mfe
    public void onDestroy() {
    }

    @Override // defpackage.mfe
    public void onStart() {
        h();
    }

    @Override // defpackage.mfe
    public void onStop() {
        i();
    }
}

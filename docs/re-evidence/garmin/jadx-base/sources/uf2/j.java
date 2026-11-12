package uf2;

import android.os.CountDownTimer;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luf2/j;", "Landroid/os/CountDownTimer;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f170410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.p0 f170411b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, p005kotlin.jvm.internal.p0 p0Var) {
        super(10000000L, 1000L);
        this.f170410a = kVar;
        this.f170411b = p0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        double d14 = this.f170411b.f105807a;
        k kVar = this.f170410a;
        kVar.v(d14);
        kVar.f170500a.d(new sf2.c.l(rf2.e.d.f152473b));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j8) {
        p005kotlin.jvm.internal.p0 p0Var = this.f170411b;
        this.f170410a.v(p0Var.f105807a);
        p0Var.f105807a++;
    }
}

package bd0;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes8.dex */
public class i0 extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f17579a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, long j8, long j14) {
        super(j8, j14);
        this.f17579a = j0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f17579a.f17582b.a();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j8) {
    }
}

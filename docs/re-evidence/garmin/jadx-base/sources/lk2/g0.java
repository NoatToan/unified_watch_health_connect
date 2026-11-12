package lk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.TransferTaskImpl", f = "TransferTask.kt", l = {281, 292, 313}, m = "transfer")
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f113220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.q f113221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f113222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f113223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(c0 c0Var, t13.d<? super g0> dVar) {
        super(dVar);
        this.f113223d = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113222c = obj;
        this.f113224e |= Integer.MIN_VALUE;
        return c0.d(this.f113223d, null, null, this);
    }
}

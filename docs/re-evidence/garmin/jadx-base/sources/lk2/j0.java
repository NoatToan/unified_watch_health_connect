package lk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.TransferTaskImpl", f = "TransferTask.kt", l = {180, 186}, m = "updatePriority")
public final class j0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f113253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f113255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f113256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113257e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(c0 c0Var, t13.d<? super j0> dVar) {
        super(dVar);
        this.f113256d = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113255c = obj;
        this.f113257e |= Integer.MIN_VALUE;
        return this.f113256d.a(0, this);
    }
}

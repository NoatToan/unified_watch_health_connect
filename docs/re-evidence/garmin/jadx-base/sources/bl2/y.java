package bl2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;
import pk2.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.ReadActiveTransfer", f = "ReadActiveTransfer.kt", l = {288}, m = "uploadFile")
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f18744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f0 f18745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dz2.b f18746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f18747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f18748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f18749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f18750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r rVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f18750g = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18749f = obj;
        this.f18751h |= Integer.MIN_VALUE;
        return r.q(this.f18750g, null, null, this);
    }
}

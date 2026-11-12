package bl2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.tasks.AbstractActiveTransfer", f = "AbstractActiveTransfer.kt", l = {228, 244}, m = "execute")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f18631c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18630b = obj;
        this.f18632d |= Integer.MIN_VALUE;
        return b.a(this.f18631c, this);
    }
}

package ok2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager", f = "CoreTransferManager.kt", l = {916}, m = "queueTransferWithConnection$file_transfer_core_release")
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f132788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk2.i f132789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f132790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f132791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f132792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f132793f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g gVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f132792e = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132791d = obj;
        this.f132793f |= Integer.MIN_VALUE;
        return this.f132792e.G(null, false, this);
    }
}

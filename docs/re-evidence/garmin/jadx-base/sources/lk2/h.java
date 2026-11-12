package lk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferManager", f = "FileTransferManager.kt", l = {530}, m = "sendTransferStatusResponse")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.device.filetransfer.a f113225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f113226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f113227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.a f113228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.garmin.device.filetransfer.a aVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f113228d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113227c = obj;
        this.f113229e |= Integer.MIN_VALUE;
        com.garmin.device.filetransfer.a.C1024a c1024a = com.garmin.device.filetransfer.a.f50723m;
        return this.f113228d.l(null, null, null, this);
    }
}

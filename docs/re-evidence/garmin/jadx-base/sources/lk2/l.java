package lk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferProtoRequests", f = "FileTransferProtoRequests.kt", l = {574}, m = "sendChecksumRequest")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.device.filetransfer.b f113263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f113264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.b f113265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113266d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.garmin.device.filetransfer.b bVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f113265c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113264b = obj;
        this.f113266d |= Integer.MIN_VALUE;
        return this.f113265c.c(null, this);
    }
}

package lk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferProtoRequests", f = "FileTransferProtoRequests.kt", l = {485}, m = "sendPriorityUpdateRequest")
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f113283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.b f113284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.garmin.device.filetransfer.b bVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f113284b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113283a = obj;
        this.f113285c |= Integer.MIN_VALUE;
        return this.f113284b.g(0, 0, this);
    }
}

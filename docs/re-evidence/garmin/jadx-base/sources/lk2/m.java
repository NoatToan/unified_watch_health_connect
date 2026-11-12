package lk2;

import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferProtoRequests", f = "FileTransferProtoRequests.kt", l = {521}, m = "sendDeleteRequest")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.device.filetransfer.b f113267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UUID f113268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f113269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.b f113270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.garmin.device.filetransfer.b bVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f113270d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113269c = obj;
        this.f113271e |= Integer.MIN_VALUE;
        com.garmin.device.filetransfer.b.a aVar = com.garmin.device.filetransfer.b.f50754c;
        return this.f113270d.d(null, null, this);
    }
}

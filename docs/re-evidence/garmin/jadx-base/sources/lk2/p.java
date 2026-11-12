package lk2;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferProtoRequests", f = "FileTransferProtoRequests.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "sendModifyFlagsRequest")
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.device.filetransfer.b f113279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f113280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.b f113281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.garmin.device.filetransfer.b bVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f113281c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113280b = obj;
        this.f113282d |= Integer.MIN_VALUE;
        com.garmin.device.filetransfer.b.a aVar = com.garmin.device.filetransfer.b.f50754c;
        return this.f113281c.f(null, null, null, this);
    }
}

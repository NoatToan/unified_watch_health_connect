package lk2;

import com.google.android.gms.wallet.WalletConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferProtoRequests", f = "FileTransferProtoRequests.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "sendWriteRequest")
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.device.filetransfer.b f113295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f113296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f113297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.b f113298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.garmin.device.filetransfer.b bVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f113298d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113297c = obj;
        this.f113299e |= Integer.MIN_VALUE;
        com.garmin.device.filetransfer.b.a aVar = com.garmin.device.filetransfer.b.f50754c;
        return this.f113298d.j(null, null, 0, 0L, null, false, this);
    }
}

package lk2;

import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferManager", f = "FileTransferManager.kt", l = {503, 504}, m = "cancelTransfer")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.device.filetransfer.a f113181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UUID f113182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f113183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f113184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.a f113185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113186f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.garmin.device.filetransfer.a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f113185e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113184d = obj;
        this.f113186f |= Integer.MIN_VALUE;
        return this.f113185e.a(null, this);
    }
}

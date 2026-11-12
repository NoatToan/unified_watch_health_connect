package gl2;

import ok2.g0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.gc.upload.ConnectUploadAgent", f = "ConnectUploadAgent.kt", l = {463, 478}, m = "requestNewDeviceFiles$suspendImpl")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f77951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f77952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g0 f77953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f77954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f77955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f77955e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f77954d = obj;
        this.f77956f |= Integer.MIN_VALUE;
        return a.H(this.f77955e, null, null, this);
    }
}

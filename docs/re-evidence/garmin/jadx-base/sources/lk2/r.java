package lk2;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferProtoRequests", f = "FileTransferProtoRequests.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "sendReadRequest")
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.device.filetransfer.b f113286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f113287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f113288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.b f113289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.garmin.device.filetransfer.b bVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f113289d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113288c = obj;
        this.f113290e |= Integer.MIN_VALUE;
        return this.f113289d.h(null, 0, null, 0L, null, false, this);
    }
}

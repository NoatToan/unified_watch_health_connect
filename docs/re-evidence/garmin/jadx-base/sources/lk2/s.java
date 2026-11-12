package lk2;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.FileTransferProtoRequests", f = "FileTransferProtoRequests.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "sendRequest")
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f113291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f113292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.device.filetransfer.b f113293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.garmin.device.filetransfer.b bVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f113293c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113292b = obj;
        this.f113294d |= Integer.MIN_VALUE;
        com.garmin.device.filetransfer.b.a aVar = com.garmin.device.filetransfer.b.f50754c;
        return this.f113293c.i(null, null, this);
    }
}

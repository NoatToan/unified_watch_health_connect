package ys2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.file.write.SendFileToDeviceTask", f = "SendFileToDeviceTask.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS, 198}, m = "sendUploadFileRequest")
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f199240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f199241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f199242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f199243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f199242c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199241b = obj;
        this.f199243d |= Integer.MIN_VALUE;
        return this.f199242c.d(0, this);
    }
}

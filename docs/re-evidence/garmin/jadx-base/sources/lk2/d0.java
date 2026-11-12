package lk2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.TransferTaskImpl", f = "TransferTask.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 141}, m = "await")
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c0 f113187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Exception f113188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f113189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f113190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, t13.d<? super d0> dVar) {
        super(dVar);
        this.f113190d = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f113189c = obj;
        this.f113191e |= Integer.MIN_VALUE;
        return this.f113190d.f(this);
    }
}

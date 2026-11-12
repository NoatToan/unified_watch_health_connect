package zn2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewDeviceDataManager", f = "NewDeviceDataManager.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "hasUnprocessedCommits", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f205722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l lVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f205722b = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205721a = obj;
        this.f205723c |= Integer.MIN_VALUE;
        return this.f205722b.e(this);
    }
}

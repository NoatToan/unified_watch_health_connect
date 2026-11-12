package id0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.FamilyAccountsDelegateImpl", f = "FamilyAccountsDelegateDI.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS, 146}, m = "hasChildIncompleteConsents", v = 2)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f92964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f92965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f92966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f92967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f92968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f92969f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(v0 v0Var, t13.d<? super w0> dVar) {
        super(dVar);
        this.f92968e = v0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92967d = obj;
        this.f92969f |= Integer.MIN_VALUE;
        return this.f92968e.e(0L, this);
    }
}

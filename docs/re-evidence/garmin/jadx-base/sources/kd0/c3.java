package kd0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GroupDelegateImpl", f = "GroupDelegateImpl.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "getReversedGeocodeStateCityPair", v = 2)
public final class c3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3 f104015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var, t13.d<? super c3> dVar) {
        super(dVar);
        this.f104015b = d3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104014a = obj;
        this.f104016c |= Integer.MIN_VALUE;
        return this.f104015b.t(0.0d, 0.0d, this);
    }
}

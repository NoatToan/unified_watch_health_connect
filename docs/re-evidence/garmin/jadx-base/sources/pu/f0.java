package pu;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationCaller", f = "PostUserAuthenticationCaller.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "fetchUserLocation", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f141066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f141067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(n nVar, t13.d<? super f0> dVar) {
        super(dVar);
        this.f141067b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141066a = obj;
        this.f141068c |= Integer.MIN_VALUE;
        return n.d(this.f141067b, this);
    }
}

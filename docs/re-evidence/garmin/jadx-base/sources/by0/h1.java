package by0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "getPolylines", v = 2)
public final class h1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j0 f21867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f21868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f21870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2 f21871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21872g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(g2 g2Var, t13.d<? super h1> dVar) {
        super(dVar);
        this.f21871f = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21870e = obj;
        this.f21872g |= Integer.MIN_VALUE;
        return this.f21871f.l(null, null, this);
    }
}

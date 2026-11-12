package f32;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.view.summary.data.DetailsSafeResultRequester", f = "DetailsSafeResultRequester.kt", l = {9}, m = "requestDetails$suspendImpl", v = 2)
public final class f<DetailsData> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f68664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g<DetailsData> f68665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g<DetailsData> gVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f68665b = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f68664a = obj;
        this.f68666c |= Integer.MIN_VALUE;
        return g.b(this.f68665b, null, this);
    }
}

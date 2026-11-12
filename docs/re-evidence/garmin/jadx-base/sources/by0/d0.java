package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataSource", f = "MultiDayActivityDataSource.kt", l = {384}, m = "getTrainingLoadData", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f21756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a aVar, t13.d<? super d0> dVar) {
        super(dVar);
        this.f21756b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21755a = obj;
        this.f21757c |= Integer.MIN_VALUE;
        return this.f21756b.r(null, null, null, this);
    }
}

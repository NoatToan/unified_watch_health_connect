package id0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.LiveActivityAppDI$module$1$7$1", f = "LiveActivityAppDI.kt", l = {143}, m = "isManualStartDevice", v = 2)
public final class j2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2.c f92806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(f2.c cVar, t13.d<? super j2> dVar) {
        super(dVar);
        this.f92806b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92805a = obj;
        this.f92807c |= Integer.MIN_VALUE;
        return this.f92806b.d(0L, this);
    }
}

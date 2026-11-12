package rk0;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.details.TrackedActivitiesDataSource", f = "TrackedActivitiesDataSource.kt", l = {25}, m = "load", v = 2)
public final class y0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f153322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f153323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f153324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f153325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f153326e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(x0 x0Var, t13.d<? super y0> dVar) {
        super(dVar);
        this.f153325d = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f153324c = obj;
        this.f153326e |= Integer.MIN_VALUE;
        return this.f153325d.e(null, this);
    }
}

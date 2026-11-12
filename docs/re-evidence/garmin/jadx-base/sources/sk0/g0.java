package sk0;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.CollectionListDataSource", f = "CollectionListDataSource.kt", l = {25}, m = "load", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f159667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f159668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f159669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f159670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var, t13.d<? super g0> dVar) {
        super(dVar);
        this.f159670d = f0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f159669c = obj;
        this.f159671e |= Integer.MIN_VALUE;
        return this.f159670d.e(null, this);
    }
}

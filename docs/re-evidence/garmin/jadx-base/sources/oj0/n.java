package oj0;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository", f = "GCPlusRepository.kt", l = {318, 98, 127}, m = "fetchGCPlusPaywallContent", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f132326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.a f132327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f132328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f132329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f132330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f132331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f132332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f132333h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f fVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f132332g = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132331f = obj;
        this.f132333h |= Integer.MIN_VALUE;
        return this.f132332g.i(null, this);
    }
}

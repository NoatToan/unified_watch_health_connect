package oj0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository", f = "GCPlusRepository.kt", l = {318, 329, 340}, m = "removeCachedContentfulContent", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f132355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f132356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f132357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f132358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f fVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f132357c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132356b = obj;
        this.f132358d |= Integer.MIN_VALUE;
        return this.f132357c.a(this);
    }
}

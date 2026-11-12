package com.garmin.subscriptions.retrofit;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lyx2/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.subscriptions.retrofit.SubscriptionGatewayRetrofitManager$getSubscriptions$response$1", f = "SubscriptionGatewayRetrofitManager.kt", l = {202}, m = "invokeSuspend")
public final class k extends v13.i implements l<t13.d<? super a0<yx2.g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.a f52718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f52719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f52720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f52721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g.a aVar, String str, boolean z14, boolean z15, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f52718b = aVar;
        this.f52719c = str;
        this.f52720d = z14;
        this.f52721e = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f52718b, this.f52719c, this.f52720d, this.f52721e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<yx2.g>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52717a;
        if (i14 == 0) {
            r.b(obj);
            this.f52717a = 1;
            Object objB = this.f52718b.b(this.f52719c, this.f52720d, this.f52721e, this);
            return objB == aVar ? aVar : objB;
        }
        if (i14 == 1) {
            r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

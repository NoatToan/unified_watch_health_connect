package com.garmin.feature.garminpay.providers.gpay.pushprovisioning;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity$bailOutWithCardRemoval$1", f = "PushProvMainActivity.kt", l = {533}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PushProvMainActivity f51182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f51183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.a f51184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PushProvMainActivity pushProvMainActivity, boolean z14, c.a aVar, d<? super a> dVar) {
        super(2, dVar);
        this.f51182b = pushProvMainActivity;
        this.f51183c = z14;
        this.f51184d = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f51182b, this.f51183c, this.f51184d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f51181a;
        PushProvMainActivity pushProvMainActivity = this.f51182b;
        if (i14 == 0) {
            r.b(obj);
            this.f51181a = 1;
            if (PushProvMainActivity.da(pushProvMainActivity, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        c cVar = c.f51190a;
        ho2.e eVar = new ho2.e(pushProvMainActivity, this.f51184d, 1);
        cVar.getClass();
        c.b(pushProvMainActivity, this.f51183c, eVar);
        return Unit.INSTANCE;
    }
}

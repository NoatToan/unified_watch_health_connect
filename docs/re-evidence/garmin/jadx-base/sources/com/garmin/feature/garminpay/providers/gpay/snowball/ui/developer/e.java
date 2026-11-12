package com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer;

import e23.p;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import po2.k;
import po2.l;
import po2.r;
import po2.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/developer/e;", "Lpo2/l;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f51319a = new r();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.developer.SnowballUIReviewActivity$StartFromTCPresenterFactory$create$1$onMVPReady$1", f = "SnowballUIReviewActivity.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.garmin.feature.garminpay.providers.gpay.snowball.ui.a f51320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51321b;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            com.garmin.feature.garminpay.providers.gpay.snowball.ui.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51321b;
            if (i14 == 0) {
                o13.r.b(obj);
                e eVar = e.this;
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.a aVar3 = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) eVar.f51319a.getView();
                k kVar = (k) eVar.f51319a.f0();
                this.f51320a = aVar3;
                this.f51321b = 1;
                obj = kVar.v(this);
                if (obj == aVar2) {
                    return aVar2;
                }
                aVar = aVar3;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = this.f51320a;
                o13.r.b(obj);
            }
            aVar.N2((String) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // po2.l
    public final void B(String str) {
        str.getClass();
        this.f51319a.B(str);
    }

    @Override // po2.l
    public final void C() {
        this.f51319a.C();
    }

    @Override // po2.l
    public final void H() {
        this.f51319a.H();
    }

    @Override // sy2.d
    public final void M(sy2.e eVar) {
        r rVar = this.f51319a;
        rVar.getClass();
        rVar.f161298b = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) eVar;
    }

    @Override // po2.l
    public final void T() {
        this.f51319a.T();
    }

    @Override // po2.l
    public final void V(s sVar) {
        this.f51319a.V(sVar);
    }

    @Override // po2.l
    public final void a() {
        this.f51319a.a();
    }

    @Override // sy2.d
    public final void a0() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) this.f51319a.getView()).getF51231i(), null, new a(null), 3);
    }

    @Override // po2.l
    public final void d(lo2.c cVar) {
        cVar.getClass();
        this.f51319a.d(cVar);
    }

    @Override // sy2.d
    public final void e(sy2.c cVar) {
        r rVar = this.f51319a;
        rVar.getClass();
        rVar.f161297a = (k) cVar;
    }

    @Override // po2.l
    public final void f() {
        this.f51319a.f();
    }

    @Override // sy2.d
    public final sy2.e getView() {
        return (com.garmin.feature.garminpay.providers.gpay.snowball.ui.a) this.f51319a.getView();
    }

    @Override // po2.l
    public final void s(fo2.i iVar) {
        iVar.getClass();
        this.f51319a.s(iVar);
    }

    @Override // po2.l
    public final void z() {
        this.f51319a.z();
    }
}

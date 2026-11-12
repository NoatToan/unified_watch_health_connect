package bo2;

import android.os.Bundle;
import b21.s4;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lpi2/h;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$deviceDisconnectionEventFlow$1", f = "AlipayAppletInstallationViewModel.kt", l = {268}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<t<? super pi2.h>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f19268c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"bo2/j$a", "Lxf0/b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends xf0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f19269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t<pi2.h> f19270b;

        /* JADX INFO: renamed from: bo2.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$deviceDisconnectionEventFlow$1$listener$1$deviceDisconnected$1", f = "AlipayAppletInstallationViewModel.kt", l = {262}, m = "invokeSuspend", v = 2)
        public static final class C0279a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f19271a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t<pi2.h> f19272b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ pi2.h f19273c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0279a(t<? super pi2.h> tVar, pi2.h hVar, t13.d<? super C0279a> dVar) {
                super(2, dVar);
                this.f19272b = tVar;
                this.f19273c = hVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0279a(this.f19272b, this.f19273c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0279a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f19271a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f19271a = 1;
                    if (this.f19272b.h(this.f19273c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j8, t<? super pi2.h> tVar) {
            this.f19269a = j8;
            this.f19270b = tVar;
        }

        @Override // xf0.b
        public final void deviceDisconnected(pi2.h hVar) {
            hVar.getClass();
            Bundle eventData = hVar.getEventData();
            Long lValueOf = eventData != null ? Long.valueOf(eventData.getLong("GCM_extra_device_connected_unit_id")) : null;
            e.f19250d.f19254a.a().info("deviceDisconnected - ESN " + lValueOf);
            if (lValueOf == null) {
                return;
            }
            if (this.f19269a == lValueOf.longValue()) {
                t<pi2.h> tVar = this.f19270b;
                gl.b.I(tVar, null, new C0279a(tVar, hVar, null), 3);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j8, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f19268c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f19268c, dVar);
        jVar.f19267b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(t<? super pi2.h> tVar, t13.d<? super Unit> dVar) {
        return ((j) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        t tVar = (t) this.f19267b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19266a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f19268c, tVar);
            e.f19250d.f19254a.a().info("register device disconnect event listener");
            oi2.a.f132270a.getClass();
            oi2.a.C2513a.b(aVar2);
            s4 s4Var = new s4(aVar2, 20);
            this.f19267b = null;
            this.f19266a = 1;
            if (q53.r.a(tVar, s4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

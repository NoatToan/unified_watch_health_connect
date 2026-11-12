package nw0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehavioursViewModel$saveBehaviours$1", f = "LifestyleLoggingEditBehavioursViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f128119c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv0/h;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Ltv0/h;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingEditBehavioursViewModel$saveBehaviours$1$1", f = "LifestyleLoggingEditBehavioursViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<tv0.h, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f128120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r f128121b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f128121b = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f128121b, dVar);
            aVar.f128120a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(tv0.h hVar, t13.d<? super Unit> dVar) {
            return ((a) create(hVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            tv0.h hVar = (tv0.h) this.f128120a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean z14 = hVar instanceof tv0.h.c;
            r rVar = this.f128121b;
            if (z14) {
                tv0.h.c cVar = (tv0.h.c) hVar;
                List<pv0.d> list = cVar.f166559a;
                rVar.f128109j = list;
                p2 p2Var = rVar.f128107h;
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, list));
                boolean z15 = cVar.f166560b;
                p2 p2Var2 = rVar.f128105f;
                do {
                    value4 = p2Var2.getValue();
                } while (!p2Var2.b(value4, d.a((d) value4, null, new h0.b(z15), null, false, false, false, false, 125)));
            } else if (hVar instanceof tv0.h.a) {
                tv0.h.a aVar2 = (tv0.h.a) hVar;
                rVar.f128109j = aVar2.f166557b;
                p2 p2Var3 = rVar.f128107h;
                do {
                    value2 = p2Var3.getValue();
                } while (!p2Var3.b(value2, aVar2.f166556a));
                r.y4(rVar);
            } else {
                if (!(hVar instanceof tv0.h.b)) {
                    u0.r();
                    return null;
                }
                p2 p2Var4 = rVar.f128105f;
                do {
                    value = p2Var4.getValue();
                } while (!p2Var4.b(value, d.a((d) value, null, h0.c.f128044a, null, false, false, false, false, 125)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f128119c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f128119c, dVar);
        uVar.f128118b = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128117a;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean zA = az0.b.a();
            r rVar = this.f128119c;
            if (zA) {
                r53.i iVarG = tv0.i.g(rVar.f128102c, (List) rVar.f128107h.getValue(), rVar.f128109j, null, null, 12);
                a aVar2 = new a(rVar, null);
                this.f128118b = null;
                this.f128117a = 1;
                if (r53.s.k(iVarG, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "LifestyleLoggingEditBehavioursViewModel", "Failed to save behaviours: no network connection");
                r.y4(rVar);
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

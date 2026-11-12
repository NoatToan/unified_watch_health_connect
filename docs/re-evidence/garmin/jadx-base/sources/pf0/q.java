package pf0;

import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailViewModel$loadEcgSummary$1", f = "EcgDetailViewModel.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<gf0.b>> f137518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f137519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f137520d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailViewModel$loadEcgSummary$1$1", f = "EcgDetailViewModel.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0<g3<gf0.b>> f137522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f137523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f137524d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0<g3<gf0.b>> y0Var, r rVar, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f137522b = y0Var;
            this.f137523c = rVar;
            this.f137524d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f137522b, this.f137523c, this.f137524d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g3<gf0.b> g3VarA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137521a;
            r rVar = this.f137523c;
            y0<g3<gf0.b>> y0Var = this.f137522b;
            if (i14 == 0) {
                o13.r.b(obj);
                y0Var.j(g3.a.c(g3.f35298f));
                ff0.l lVar = rVar.f137525a;
                this.f137521a = 1;
                obj = lVar.b(this.f137524d, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                gf0.b bVar = (gf0.b) ((v2.b) v2Var).f47386a;
                rVar.f137526b = bVar;
                ge1.b.T(v1.a(rVar), null, null, new p(bVar, rVar, null), 3);
                g3.f35298f.getClass();
                g3VarA = g3.a.d(bVar);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
            }
            y0Var.j(g3VarA);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y0<g3<gf0.b>> y0Var, r rVar, String str, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f137518b = y0Var;
        this.f137519c = rVar;
        this.f137520d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f137518b, this.f137519c, this.f137520d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137517a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f137518b, this.f137519c, this.f137520d, null);
            this.f137517a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
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

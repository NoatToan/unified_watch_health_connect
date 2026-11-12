package pf0;

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
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailViewModel$deleteActivity$1", f = "EcgDetailViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<g3<Unit>> f137503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f137504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f137505d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailViewModel$deleteActivity$1$1", f = "EcgDetailViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0<g3<Unit>> f137507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f137508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f137509d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y0<g3<Unit>> y0Var, r rVar, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f137507b = y0Var;
            this.f137508c = rVar;
            this.f137509d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f137507b, this.f137508c, this.f137509d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            g3<Unit> g3VarA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137506a;
            y0<g3<Unit>> y0Var = this.f137507b;
            if (i14 == 0) {
                o13.r.b(obj);
                y0Var.j(g3.a.c(g3.f35298f));
                ff0.l lVar = this.f137508c.f137525a;
                this.f137506a = 1;
                obj = lVar.a(this.f137509d, this);
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
                g3.f35298f.getClass();
                g3VarA = g3.a.d(null);
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
    public o(y0<g3<Unit>> y0Var, r rVar, String str, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f137503b = y0Var;
        this.f137504c = rVar;
        this.f137505d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f137503b, this.f137504c, this.f137505d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137502a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f137503b, this.f137504c, this.f137505d, null);
            this.f137502a = 1;
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

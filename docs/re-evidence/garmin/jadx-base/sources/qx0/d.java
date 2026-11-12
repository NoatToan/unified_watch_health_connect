package qx0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.c2;
import r53.j;
import r53.k2;
import r53.s;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqx0/d;", "Landroidx/lifecycle/u1;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f148407a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lqx0/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2.screen.init.MctInitViewModel$initialState$1", f = "MctInitViewModel.kt", l = {16, 16}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<j<? super e>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j f148408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f148409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f148410c;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = d.this.new a(dVar);
            aVar.f148410c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(j<? super e> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            j jVar = (j) this.f148410c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f148409b;
            if (i14 != 0) {
                if (i14 == 1) {
                    jVar = this.f148408a;
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            this.f148410c = null;
            this.f148408a = jVar;
            this.f148409b = 1;
            d dVar = d.this;
            dVar.getClass();
            x53.c cVar = s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new c(dVar, null), this);
            if (obj != aVar) {
            }
            return aVar;
            this.f148410c = null;
            this.f148408a = null;
            this.f148409b = 2;
        }
    }

    public d() {
        c2 c2Var = new c2(new a(null));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f148407a = s.K(c2Var, aVarA, k2.a.f150706c, null);
    }
}

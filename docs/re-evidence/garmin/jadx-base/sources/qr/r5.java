package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$initGearEventCollector$1", f = "ActivityDetailsViewModel.kt", l = {3527}, m = "invokeSuspend", v = 2)
public final class r5 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146471b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f146472a;

        public a(t tVar) {
            this.f146472a = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            for (c80.t tVar : (List) obj) {
                if (!(tVar instanceof c80.t.a)) {
                    boolean zG = p005kotlin.jvm.internal.s.g(tVar, c80.t.b.f25587a);
                    t tVar2 = this.f146472a;
                    if (zG) {
                        nr.w0.d0 d0Var = nr.w0.d0.f127427a;
                        int i14 = t.A2;
                        tVar2.E4(d0Var);
                        t.C4(tVar2, tVar);
                    } else {
                        if (!p005kotlin.jvm.internal.s.g(tVar, c80.t.c.f25588a)) {
                            lc.u0.r();
                            return null;
                        }
                        tVar2.D4();
                        t.C4(tVar2, tVar);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(t tVar, t13.d<? super r5> dVar) {
        super(2, dVar);
        this.f146471b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r5(this.f146471b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146470a;
        if (i14 == 0) {
            o13.r.b(obj);
            t tVar = this.f146471b;
            r53.z1<List<c80.t>> z1Var = tVar.f146562u2.f25297c;
            a aVar2 = new a(tVar);
            this.f146470a = 1;
            if (z1Var.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}

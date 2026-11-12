package r42;

import androidx.lifecycle.y0;
import c83.a0;
import e23.p;
import fw.m;
import o13.r;
import o53.b0;
import o53.i0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.AddWeightViewModel$addWeight$1", f = "AddWeightViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<m<Boolean>> f150317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f150318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l42.i f150319d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lc83/a0;", "", "<anonymous>", "(Lo53/b0;)Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.weighttracker.presentation.addweight.AddWeightViewModel$addWeight$1$response$1", f = "AddWeightViewModel.kt", l = {73}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f150320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f150321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l42.i f150322c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, l42.i iVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f150321b = dVar;
            this.f150322c = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f150321b, this.f150322c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super a0<Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f150320a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            this.f150321b.f150323a.getClass();
            l42.i iVar = this.f150322c;
            iVar.getClass();
            ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class, null, null, 6, null)).k(com.garmin.android.apps.connectmobile.googlehealthconnect.b.c.ON_MANUAL_WEIGHT_ENTRY, true);
            i0<a0<Unit>> i0VarA = m42.b.a.a(m42.b.f116608a).a(iVar);
            this.f150320a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y0<m<Boolean>> y0Var, d dVar, l42.i iVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f150317b = y0Var;
        this.f150318c = dVar;
        this.f150319d = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f150317b, this.f150318c, this.f150319d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150316a;
        y0<m<Boolean>> y0Var = this.f150317b;
        try {
            if (i14 == 0) {
                r.b(obj);
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(this.f150318c, this.f150319d, null);
                this.f150316a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            y0Var.j(m.a.g(m.f73767e, Boolean.valueOf(((a0) obj).f25745a.isSuccessful()), 1));
        } catch (Throwable th3) {
            m.f73767e.getClass();
            y0Var.j(m.a.a(null, th3));
        }
        return Unit.INSTANCE;
    }
}

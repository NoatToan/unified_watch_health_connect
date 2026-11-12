package cq0;

import androidx.lifecycle.t0;
import java.util.Locale;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Ls92/g;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsViewModel$fetchConsentText$1", f = "IncidentDetectionTermsViewModel.kt", l = {19, 22}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<t0<s92.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f55162b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ls92/g;", "<anonymous>", "(Lo53/b0;)Ls92/g;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsViewModel$fetchConsentText$1$consentTextDTO$1", f = "IncidentDetectionTermsViewModel.kt", l = {20}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super s92.g>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55163a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super s92.g> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55163a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p92.o oVar = p92.o.f136619a;
            q92.w wVar = q92.w.DI_CONNECT_IDTERMS;
            this.f55163a = 1;
            Object objE = oVar.e(wVar, Locale.getDefault(), this);
            return objE == aVar ? aVar : objE;
        }
    }

    public n(t13.d<? super n> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(dVar);
        nVar.f55162b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(t0<s92.g> t0Var, t13.d<? super Unit> dVar) {
        return ((n) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r0.emit((s92.g) r7, r6) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f55162b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55161a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(null);
        this.f55162b = t0Var;
        this.f55161a = 1;
        obj = ge1.b.e0(bVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f55162b = null;
        this.f55161a = 2;
    }
}

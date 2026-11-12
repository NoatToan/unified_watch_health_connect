package x11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b11.v;
import b63.o;
import b63.u;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import g01.x;
import g01.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import v01.n1;
import v01.p0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx11/g;", "Landroidx/lifecycle/u1;", "Lb63/u;", "dateTime", "Lb11/m;", "mealViewNavArgs", "Li53/c;", "Lb11/v;", "confirmedItems", "Lv01/p0;", "getMealsUseCase", "Lv01/n1;", "logFoodUseCase", "Ls01/f;", "nutritionSettingsConfigProvider", "<init>", "(Lb63/u;Lb11/m;Li53/c;Lv01/p0;Lv01/n1;Ls01/f;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f188413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b11.m f188414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<v> f188415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f188416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f188417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s01.f f188418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f188419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f188420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f188421i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lx11/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.viewmodel.ImageRecognitionConfirmationViewModel$uiState$1", f = "ImageRecognitionConfirmationViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<r53.j<? super f>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f188422a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super f> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f188422a;
            if (i14 == 0) {
                r.b(obj);
                this.f188422a = 1;
                if (g.x4(g.this, this) == aVar) {
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

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(u uVar, b11.m mVar, i53.c<? extends v> cVar, p0 p0Var, n1 n1Var, s01.f fVar) {
        uVar.getClass();
        mVar.getClass();
        cVar.getClass();
        p0Var.getClass();
        n1Var.getClass();
        fVar.getClass();
        this.f188413a = uVar;
        this.f188414b = mVar;
        this.f188415c = cVar;
        this.f188416d = p0Var;
        this.f188417e = n1Var;
        this.f188418f = fVar;
        p2 p2VarA = q2.a(new f(uVar.c(), null, null, cVar, false, null, false, Boolean.valueOf(mVar.f14338a), 118, null));
        this.f188419g = p2VarA;
        r53.v vVar = new r53.v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f188420h = s.K(vVar, aVarA, k2.a.f150706c, new f(uVar.c(), null, null, cVar, true, null, false, null, 230, null));
        this.f188421i = j0.f134944a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final Object x4(g gVar, v13.c cVar) {
        h hVar;
        Object value;
        Object value2;
        ?? arrayList;
        Object value3;
        f fVar;
        b11.l lVar;
        ?? N0;
        b11.m mVar = gVar.f188414b;
        p2 p2Var = gVar.f188419g;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f188426c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f188426c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(gVar, cVar);
            }
        } else {
            hVar = new h(gVar, cVar);
        }
        Object objA = hVar.f188424a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f188426c;
        if (i15 == 0) {
            r.b(objA);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, f.a((f) value, null, null, null, true, null, false, 239)));
            p0 p0Var = gVar.f188416d;
            o oVarB = gVar.f188413a.b();
            hVar.f188426c = 1;
            objA = p0.a(p0Var, oVarB, true, hVar, 4);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            List<x> list = ((z) ((v2.b) v2Var).f47386a).f74294a;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b11.l lVarB = ((x) it.next()).b();
                    if (lVarB != null) {
                        arrayList.add(lVarB);
                    }
                }
            } else {
                arrayList = j0.f134944a;
            }
            gVar.f188421i = arrayList;
            do {
                value3 = p2Var.getValue();
                fVar = (f) value3;
                b11.l lVarL = zf.b.L(gVar.f188421i, mVar.f14338a, fVar.f188405a, mVar.f14339b, gVar.f188418f.a());
                if (lVarL == null) {
                    lVarL = (b11.l) h0.d0(gVar.f188421i);
                }
                lVar = lVarL;
                boolean z14 = mVar.f14338a;
                ?? r14 = gVar.f188421i;
                N0 = r14;
                if (!z14) {
                    N0 = h0.N0(r14, new i());
                }
            } while (!p2Var.b(value3, f.a(fVar, null, lVar, N0, false, null, false, 233)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ImageRecognitionConfirmationViewModel", "getMealWindows: error retrieving meal windows");
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, f.a((f) value2, null, null, null, false, null, false, 239)));
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx11/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

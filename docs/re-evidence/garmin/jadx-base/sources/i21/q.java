package i21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.l0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.viewmodel.NutritionReportsViewModel$onLegacyBulkEditFood$1", f = "NutritionReportsViewModel.kt", l = {490}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f87347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f87348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i01.a f87349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b63.o f87350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<b63.o> f87351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<b11.i> f87352g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87353a;

        static {
            int[] iArr = new int[i01.a.values().length];
            try {
                iArr[i01.a.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i01.a.MOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87353a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(d dVar, i01.a aVar, b63.o oVar, List<b63.o> list, List<? extends b11.i> list2, t13.d<? super q> dVar2) {
        super(2, dVar2);
        this.f87348c = dVar;
        this.f87349d = aVar;
        this.f87350e = oVar;
        this.f87351f = list;
        this.f87352g = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f87348c, this.f87349d, this.f87350e, this.f87351f, this.f87352g, dVar);
        qVar.f87347b = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE0;
        Object value;
        c cVar;
        b bVar;
        Object value2;
        b0 b0Var = (b0) this.f87347b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f87346a;
        d dVar = this.f87348c;
        if (i14 == 0) {
            o13.r.b(obj);
            v01.b bVar2 = dVar.f87275g;
            this.f87347b = b0Var;
            this.f87346a = 1;
            objE0 = ge1.b.e0(bVar2.f174217b, new v01.a(this.f87352g, this.f87349d, this.f87350e, this.f87351f, null, null, bVar2, null), this);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objE0 = obj;
        }
        v2 v2Var = (v2) objE0;
        if (v2Var instanceof v2.a) {
            a2 a2Var = a2.NUTRITION;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Failed to bulk edit foods. exception=");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "NutritionReportsViewModel", strD);
            p2 p2Var = dVar.f87285q;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, c.a((c) value2, new i21.a(b.a.f87240b, null, 2, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194302)));
        } else {
            if (!(v2Var instanceof v2.b)) {
                u0.r();
                return null;
            }
            dVar.Q4(h0.b1(h0.f1(h0.D0(this.f87351f, this.f87350e))));
            dVar.f87287t.setValue(l0.f134950a);
            p2 p2Var2 = dVar.f87285q;
            do {
                value = p2Var2.getValue();
                cVar = (c) value;
                int i15 = a.f87353a[this.f87349d.ordinal()];
                if (i15 == 1) {
                    bVar = b.C1730b.f87241b;
                } else {
                    if (i15 != 2) {
                        u0.r();
                        return null;
                    }
                    bVar = b.d.f87243b;
                }
            } while (!p2Var2.b(value, c.a(cVar, new i21.a(bVar, null, 2, null), null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194302)));
        }
        return Unit.INSTANCE;
    }
}

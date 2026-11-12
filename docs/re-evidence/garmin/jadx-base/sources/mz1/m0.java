package mz1;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$getActivities$1", f = "EventDetailsViewModel.kt", l = {850, 863}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.y0 f121837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g3.a f121838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f121839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f121840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f121841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f121842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LocalDate f121843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ LocalDate f121844h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(e0 e0Var, String str, String str2, LocalDate localDate, LocalDate localDate2, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f121840d = e0Var;
        this.f121841e = str;
        this.f121842f = str2;
        this.f121843g = localDate;
        this.f121844h = localDate2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m0(this.f121840d, this.f121841e, this.f121842f, this.f121843g, this.f121844h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        m0 m0Var;
        androidx.lifecycle.y0 y0Var;
        g3.a aVar;
        List list;
        g3.a aVar2;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121839c;
        e0 e0Var = this.f121840d;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = e0.K1;
            ((androidx.lifecycle.y0) e0Var.f121682d1.getValue()).j(g3.a.c(g3.f35298f));
            hg0.b bVarB4 = e0Var.B4();
            String string = this.f121843g.toString();
            string.getClass();
            String string2 = this.f121844h.toString();
            string2.getClass();
            this.f121839c = 1;
            m0Var = this;
            obj = hg0.b.a(bVarB4, this.f121841e, this.f121842f, string, string2, 5, m0Var);
            if (obj != aVar3) {
            }
            return aVar3;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            m0Var = this;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar2 = this.f121838b;
            y0Var = this.f121837a;
            o13.r.b(obj);
        }
        list = (List) obj;
        aVar = aVar2;
        aVar.getClass();
        y0Var.j(g3.a.d(list));
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            e0Var.I1 = 0;
            y0Var = (androidx.lifecycle.y0) e0Var.f121682d1.getValue();
            aVar = g3.f35298f;
            if (e0Var.z5()) {
                List list2 = (List) ((v2.b) v2Var).f47386a;
                m0Var.f121837a = y0Var;
                m0Var.f121838b = aVar;
                m0Var.f121839c = 2;
                obj = e0.Y4(e0Var, list2, this);
                if (obj != aVar3) {
                    aVar2 = aVar;
                    list = (List) obj;
                    aVar = aVar2;
                }
                return aVar3;
            }
            list = (List) ((v2.b) v2Var).f47386a;
            aVar.getClass();
            y0Var.j(g3.a.d(list));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            int i16 = e0.K1;
            ((androidx.lifecycle.y0) e0Var.f121682d1.getValue()).j(g3.a.a(g3.f35298f, ((v2.a) v2Var).f47385c, null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}

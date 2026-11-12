package u21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.m1;
import r53.p2;
import v01.c2;
import v01.d2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkd1/c;", "Lq01/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lkd1/c;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupViewModel$setUpReminders$2", f = "NutritionSetupViewModel.kt", l = {481}, m = "invokeSuspend", v = 2)
public final class d1 extends v13.i implements e23.p<kd1.c<? extends q01.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f167931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f167932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f167933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l01.k f167934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(u0 u0Var, l01.k kVar, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f167933c = u0Var;
        this.f167934d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d1 d1Var = new d1(this.f167933c, this.f167934d, dVar);
        d1Var.f167932b = obj;
        return d1Var;
    }

    @Override // e23.p
    public final Object invoke(kd1.c<? extends q01.g> cVar, t13.d<? super Unit> dVar) {
        return ((d1) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        kd1.c cVar = (kd1.c) this.f167932b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f167931a;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean z14 = cVar instanceof kd1.c.b;
            u0 u0Var = this.f167933c;
            if (z14) {
                p2 p2Var = u0Var.f168164o;
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, s21.a0.a((s21.a0) value3, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, null, false, false, null, null, null, null, 0, -83886081, 3)));
            } else if (cVar instanceof kd1.c.a) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "NutritionSetupViewModel", "Failed to load nutrition reminders");
                p2 p2Var2 = u0Var.f168164o;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, s21.a0.a((s21.a0) value2, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, s21.y.REMINDERS, false, false, null, null, null, null, 0, -83886081, 3)));
            } else {
                if (!(cVar instanceof kd1.c.C1998c)) {
                    lc.u0.r();
                    return null;
                }
                q01.g gVar = (q01.g) ((kd1.c.C1998c) cVar).f104499a;
                qd1.b bVar = gVar != null ? gVar.f142020a : null;
                if (bVar != null) {
                    List<qd1.a> list = bVar.f144479a;
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((qd1.a) it.next()).f144476b);
                    }
                    String str = "Successfully loaded " + arrayList + " nutrition reminders";
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var2, "NutritionSetupViewModel", str);
                    this.f167932b = null;
                    this.f167931a = 1;
                    int i15 = u0.f168149q;
                    u0Var.getClass();
                    i2.a.b(a2Var2, "NutritionSetupViewModel", "Saving nutrition reminders");
                    d2 d2Var = u0Var.f168155f;
                    pd1.a aVar3 = pd1.a.GCNT;
                    d2Var.getClass();
                    aVar3.getClass();
                    Object objK = r53.s.k(new m1(d2Var.f174309a.a(aVar3, bVar, new uu.o(d2Var)), new c2(d2Var, null)), new b1(u0Var, this.f167934d, null), this);
                    if (objK != u13.a.COROUTINE_SUSPENDED) {
                        objK = Unit.INSTANCE;
                    }
                    if (objK == obj2) {
                        return obj2;
                    }
                } else {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var3, "NutritionSetupViewModel", "Failed to load nutrition reminders, reminders are null");
                    p2 p2Var3 = u0Var.f168164o;
                    do {
                        value = p2Var3.getValue();
                    } while (!p2Var3.b(value, s21.a0.a((s21.a0) value, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, s21.y.REMINDERS, false, false, null, null, null, null, 0, -83886081, 3)));
                }
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

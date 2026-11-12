package e21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import q01.g;
import q01.j;
import r53.p2;
import v01.b1;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reminders.viewmodel.NutritionRemindersViewModel$loadReminders$1", f = "NutritionRemindersViewModel.kt", l = {54, 54}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e21.a f62627c;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkd1/c;", "Lq01/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lkd1/c;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reminders.viewmodel.NutritionRemindersViewModel$loadReminders$1$2", f = "NutritionRemindersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<kd1.c<? extends g>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f62628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e21.a f62629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f62630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e21.a aVar, b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f62629b = aVar;
            this.f62630c = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f62629b, this.f62630c, dVar);
            aVar.f62628a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(kd1.c<? extends g> cVar, t13.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p2 p2Var;
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            kd1.c cVar = (kd1.c) this.f62628a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z14 = cVar instanceof kd1.c.b;
            e21.a aVar2 = this.f62629b;
            if (z14) {
                p2 p2Var2 = aVar2.f62611d;
                do {
                    value5 = p2Var2.getValue();
                } while (!p2Var2.b(value5, e21.a.d.a((e21.a.d) value5, g3.a.c(g3.f35298f), null, null, 6)));
            } else if (cVar instanceof kd1.c.a) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var, "NutritionRemindersViewModel", "Failed to load nutrition reminders");
                p2 p2Var3 = aVar2.f62611d;
                do {
                    value4 = p2Var3.getValue();
                } while (!p2Var3.b(value4, e21.a.d.a((e21.a.d) value4, g3.a.a(g3.f35298f, null, null, null, null, 15), null, null, 6)));
            } else {
                if (!(cVar instanceof kd1.c.C1998c)) {
                    u0.r();
                    return null;
                }
                g gVar = (g) ((kd1.c.C1998c) cVar).f104499a;
                qd1.b bVar = gVar != null ? gVar.f142020a : null;
                if (gVar == null || bVar == null) {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.f(a2Var2, "NutritionRemindersViewModel", "Failed to load nutrition reminders, reminders are null or empty");
                    p2Var = aVar2.f62611d;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, e21.a.d.a((e21.a.d) value, g3.a.a(g3.f35298f, null, null, null, null, 15), null, null, 6)));
                } else {
                    List<qd1.a> list = bVar.f144479a;
                    if (list.isEmpty()) {
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.f(a2Var3, "NutritionRemindersViewModel", "Failed to load nutrition reminders, reminders are null or empty");
                        p2Var = aVar2.f62611d;
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, e21.a.d.a((e21.a.d) value, g3.a.a(g3.f35298f, null, null, null, null, 15), null, null, 6)));
                    } else {
                        ArrayList arrayList = new ArrayList(y.r(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((qd1.a) it.next()).f144476b);
                        }
                        i2.a aVar6 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar6.getClass();
                        i2.a.b(a2Var4, "NutritionRemindersViewModel", "Successfully loaded " + arrayList + " nutrition reminders");
                        Map<String, j> map = gVar.f142021b;
                        aVar2.f62613f = bVar;
                        p2 p2Var4 = aVar2.f62611d;
                        aVar2.f62614g = bVar;
                        aVar2.f62615h = map;
                        do {
                            value2 = p2Var4.getValue();
                        } while (!p2Var4.b(value2, e21.a.d.a((e21.a.d) value2, null, null, aVar2.x4(list), 3)));
                        do {
                            value3 = p2Var4.getValue();
                        } while (!p2Var4.b(value3, e21.a.d.a((e21.a.d) value3, g3.a.e(g3.f35298f), null, null, 6)));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e21.a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f62627c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f62627c, dVar);
        bVar.f62626b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r53.s.k((r53.i) r15, r2, r14) == r1) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        b0 b0Var = (b0) this.f62626b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62625a;
        e21.a aVar2 = this.f62627c;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                a aVar3 = new a(aVar2, b0Var, null);
                this.f62626b = null;
                this.f62625a = 2;
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
        e23.a<Boolean> aVar4 = aVar2.f62610c;
        p2 p2Var = aVar2.f62611d;
        if (aVar4.invoke().booleanValue()) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, e21.a.d.a((e21.a.d) value2, g3.a.c(g3.f35298f), null, null, 6)));
            i2.a aVar5 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var, "NutritionRemindersViewModel", "Loading nutrition reminders");
            b1 b1Var = aVar2.f62608a;
            pd1.a aVar6 = pd1.a.GCNT;
            this.f62626b = b0Var;
            this.f62625a = 1;
            obj = b1Var.a(aVar6, this);
            if (obj != aVar) {
                a aVar7 = new a(aVar2, b0Var, null);
                this.f62626b = null;
                this.f62625a = 2;
            }
            return aVar;
        }
        i2.a aVar8 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar8.getClass();
        i2.a.b(a2Var2, "NutritionRemindersViewModel", "Failed to get nutrition reminders, no network connection");
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, e21.a.d.a((e21.a.d) value, g3.a.a(g3.f35298f, null, null, null, null, 15), null, null, 6)));
        return Unit.INSTANCE;
    }
}

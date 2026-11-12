package e21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import kd1.g;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.m1;
import r53.p2;
import r53.s;
import uu.o;
import v01.c2;
import v01.d2;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reminders.viewmodel.NutritionRemindersViewModel$saveReminders$1", f = "NutritionRemindersViewModel.kt", l = {101}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e21.a f62633c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkd1/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lkd1/g;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reminders.viewmodel.NutritionRemindersViewModel$saveReminders$1$2", f = "NutritionRemindersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<g, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f62634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e21.a f62635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f62636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e21.a aVar, b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f62635b = aVar;
            this.f62636c = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f62635b, this.f62636c, dVar);
            aVar.f62634a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(g gVar, t13.d<? super Unit> dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            g gVar = (g) this.f62634a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z14 = gVar instanceof g.b;
            e21.a aVar2 = this.f62635b;
            if (z14) {
                p2 p2Var = aVar2.f62611d;
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, e21.a.d.a((e21.a.d) value3, null, d.c.f62639a, null, 5)));
            } else if (gVar instanceof g.a) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var, "NutritionRemindersViewModel", "Failed to save nutrition reminders");
                p2 p2Var2 = aVar2.f62611d;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, e21.a.d.a((e21.a.d) value2, null, d.a.f62637a, null, 5)));
            } else {
                if (!(gVar instanceof g.c)) {
                    u0.r();
                    return null;
                }
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var2, "NutritionRemindersViewModel", "Successfully saved nutrition reminders");
                p2 p2Var3 = aVar2.f62611d;
                do {
                    value = p2Var3.getValue();
                } while (!p2Var3.b(value, e21.a.d.a((e21.a.d) value, null, d.b.f62638a, null, 5)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e21.a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f62633c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f62633c, dVar);
        cVar.f62632b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        b0 b0Var = (b0) this.f62632b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62631a;
        if (i14 == 0) {
            r.b(obj);
            e21.a aVar2 = this.f62633c;
            e23.a<Boolean> aVar3 = aVar2.f62610c;
            p2 p2Var = aVar2.f62611d;
            if (aVar3.invoke().booleanValue()) {
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, e21.a.d.a((e21.a.d) value2, null, d.c.f62639a, null, 5)));
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var, "NutritionRemindersViewModel", "Saving nutrition reminders");
                qd1.b bVar = aVar2.f62613f;
                if (bVar == null || bVar.equals(aVar2.f62614g)) {
                    i2.a.b(a2Var, "NutritionRemindersViewModel", "Ignoring save, no changes to nutrition reminders");
                    do {
                        value3 = p2Var.getValue();
                    } while (!p2Var.b(value3, e21.a.d.a((e21.a.d) value3, null, d.b.f62638a, null, 5)));
                } else {
                    d2 d2Var = aVar2.f62609b;
                    pd1.a aVar5 = pd1.a.GCNT;
                    d2Var.getClass();
                    aVar5.getClass();
                    m1 m1Var = new m1(d2Var.f174309a.a(aVar5, bVar, new o(d2Var)), new c2(d2Var, null));
                    a aVar6 = new a(aVar2, b0Var, null);
                    this.f62632b = null;
                    this.f62631a = 1;
                    if (s.k(m1Var, aVar6, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                i2.a aVar7 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar7.getClass();
                i2.a.b(a2Var2, "NutritionRemindersViewModel", "Failed to save nutrition reminders, no network connection");
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, e21.a.d.a((e21.a.d) value, null, d.a.f62637a, null, 5)));
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}

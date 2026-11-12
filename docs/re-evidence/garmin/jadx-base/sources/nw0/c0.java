package nw0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.m1;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingRemindersViewModel$saveReminders$1", f = "LifestyleLoggingRemindersViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f128005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f128007c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkd1/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lkd1/g;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingRemindersViewModel$saveReminders$1$1", f = "LifestyleLoggingRemindersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<kd1.g, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f128008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a0 f128009b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f128009b = a0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f128009b, dVar);
            aVar.f128008a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(kd1.g gVar, t13.d<? super Unit> dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            kd1.g gVar = (kd1.g) this.f128008a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean zG = p005kotlin.jvm.internal.s.g(gVar, kd1.g.b.f104508a);
            a0 a0Var = this.f128009b;
            if (zG) {
                p2 p2Var = a0Var.f127987c;
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, g0.a((g0) value3, null, i0.c.f128050a, 1)));
            } else if (p005kotlin.jvm.internal.s.g(gVar, kd1.g.a.f104507a)) {
                p2 p2Var2 = a0Var.f127987c;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, g0.a((g0) value2, null, i0.a.f128048a, 1)));
            } else {
                if (!(gVar instanceof kd1.g.c)) {
                    u0.r();
                    return null;
                }
                a0Var.f127990f = true;
                p2 p2Var3 = a0Var.f127987c;
                do {
                    value = p2Var3.getValue();
                } while (!p2Var3.b(value, g0.a((g0) value, null, i0.b.f128049a, 1)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, t13.d<? super c0> dVar) {
        super(2, dVar);
        this.f128007c = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c0 c0Var = new c0(this.f128007c, dVar);
        c0Var.f128006b = obj;
        return c0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128005a;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean zA = az0.b.a();
            a0 a0Var = this.f128007c;
            if (zA) {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LifestyleLoggingRemindersViewModel", "Saving reminders");
                rd1.a aVar2 = (rd1.a) a0Var.f127991g.getValue();
                if (p005kotlin.jvm.internal.s.g(aVar2, a0Var.f127989e)) {
                    i2.a.b(a2Var, "LifestyleLoggingRemindersViewModel", "No changes to reminders, skipping save");
                    p2 p2Var = a0Var.f127987c;
                    do {
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, g0.a((g0) value2, null, i0.b.f128049a, 1)));
                } else {
                    m1 m1VarA = a0Var.f127986b.a(aVar2);
                    a aVar3 = new a(a0Var, null);
                    this.f128006b = null;
                    this.f128005a = 1;
                    if (r53.s.k(m1VarA, aVar3, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                a2 a2Var2 = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "LifestyleLoggingRemindersViewModel", "Failed to save reminders: no network connection");
                p2 p2Var2 = a0Var.f127987c;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, g0.a((g0) value, null, i0.a.f128048a, 1)));
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

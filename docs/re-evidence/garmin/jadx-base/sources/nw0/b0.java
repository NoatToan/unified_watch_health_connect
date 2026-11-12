package nw0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import l72.b1;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingRemindersViewModel$getReminders$1", f = "LifestyleLoggingRemindersViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f127995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f127996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f127997c;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkd1/c;", "Lrd1/a;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "<anonymous>", "(Lkd1/c;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingRemindersViewModel$getReminders$1$1", f = "LifestyleLoggingRemindersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<kd1.c<? extends rd1.a>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f127998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a0 f127999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f128000c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, o53.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f127999b = a0Var;
            this.f128000c = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f127999b, this.f128000c, dVar);
            aVar.f127998a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(kd1.c<? extends rd1.a> cVar, t13.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            rd1.a aVar;
            Object value2;
            Object value3;
            kd1.c cVar = (kd1.c) this.f127998a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            boolean zG = p005kotlin.jvm.internal.s.g(cVar, kd1.c.b.f104498a);
            a0 a0Var = this.f127999b;
            if (zG) {
                p2 p2Var = a0Var.f127987c;
                do {
                    value3 = p2Var.getValue();
                } while (!p2Var.b(value3, g0.a((g0) value3, f0.c.f128024a, null, 2)));
            } else if (p005kotlin.jvm.internal.s.g(cVar, kd1.c.a.f104497a)) {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "LifestyleLoggingRemindersViewModel", "Failed to load reminders");
                a0.x4(a0Var);
            } else {
                if (!(cVar instanceof kd1.c.C1998c)) {
                    u0.r();
                    return null;
                }
                rd1.a aVar3 = (rd1.a) ((kd1.c.C1998c) cVar).f104499a;
                if (aVar3 != null) {
                    a0Var.f127989e = aVar3;
                    p2 p2Var2 = a0Var.f127991g;
                    do {
                        value = p2Var2.getValue();
                        aVar = (rd1.a) value;
                    } while (!p2Var2.b(value, rd1.a.a(aVar3, qd1.a.a(aVar3.f152032a, false, aVar.f152032a.f144476b, null, 13), qd1.a.a(aVar3.f152033b, false, aVar.f152033b.f144476b, null, 13), 12)));
                    p2 p2Var3 = a0Var.f127987c;
                    do {
                        value2 = p2Var3.getValue();
                    } while (!p2Var3.b(value2, g0.a((g0) value2, f0.b.f128023a, null, 2)));
                } else {
                    a2 a2Var2 = a2.LIFESTYLE_LOGGING;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var2, "LifestyleLoggingRemindersViewModel", "Failed to load reminders: reminders are null");
                    a0.x4(a0Var);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a0 a0Var, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f127997c = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f127997c, dVar);
        b0Var.f127996b = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f127996b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f127995a;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean zA = az0.b.a();
            a0 a0Var = this.f127997c;
            if (zA) {
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LifestyleLoggingRemindersViewModel", "Loading reminders");
                md1.b bVar = a0Var.f127985a.f166543a;
                pd1.a aVar2 = pd1.a.LIFESTYLE_LOGGING;
                bVar.getClass();
                aVar2.getClass();
                ld1.a aVar3 = bVar.f117920a;
                md1.d dVar = new md1.d(aVar3.f112027a.a(aVar2, new b1(aVar3, 19)), bVar);
                a aVar4 = new a(a0Var, b0Var, null);
                this.f127996b = null;
                this.f127995a = 1;
                if (r53.s.k(dVar, aVar4, this) == aVar) {
                    return aVar;
                }
            } else {
                a2 a2Var2 = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "LifestyleLoggingRemindersViewModel", "Failed to load reminders: no network connection");
                a0.x4(a0Var);
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

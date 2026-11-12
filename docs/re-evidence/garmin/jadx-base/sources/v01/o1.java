package v01;

import android.content.Context;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lv01/o1;", "", "Lzd0/j1;", "subscriptionProvider", "<init>", "(Lzd0/j1;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zd0.j1 f174497a;

    static {
        new a(null);
    }

    public o1(zd0.j1 j1Var) {
        j1Var.getClass();
        this.f174497a = j1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Context context, v13.c cVar) {
        p1 p1Var;
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i14 = p1Var.f174505d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p1Var.f174505d = i14 - Integer.MIN_VALUE;
            } else {
                p1Var = new p1(this, cVar);
            }
        } else {
            p1Var = new p1(this, cVar);
        }
        Object objL = p1Var.f174503b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p1Var.f174505d;
        if (i15 == 0) {
            o13.r.b(objL);
            c80.q qVar = c80.q.NUTRITION;
            p1Var.f174502a = context;
            p1Var.f174505d = 1;
            objL = this.f174497a.l(qVar, p1Var);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = p1Var.f174502a;
            o13.r.b(objL);
        }
        if (!((Boolean) objL).booleanValue()) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionConsiderUnschedulingLocalRemindersUseCase", "User no longer has the nutrition feature. Clearing nutrition reminders.");
            t01.a aVar2 = new t01.a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            pd1.c cVarG = aVar2.g();
            if (cVarG == null) {
                i2.a.b(a2Var, "NutritionConsiderUnschedulingLocalRemindersUseCase", "No current nutrition reminders found, nothing to clear.");
                return Unit.INSTANCE;
            }
            i2.a.b(a2Var, "NutritionConsiderUnschedulingLocalRemindersUseCase", "Current nutrition reminders before clear: " + cVarG.f() + ".");
            aVar2.a(context, cVarG);
            aVar2.m(new pd1.c(pd1.a.GCNT.f137376a, null, null, 6, null));
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv01/o1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

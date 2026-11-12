package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.BloodPressureRemindersActivity;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lj31/j;", "Lj31/z0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements z0 {
    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // j31.z0
    public final Object c(long j8, v13.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f96897c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f96897c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objC = kVar.f96895a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f96897c;
        try {
            if (i15 == 0) {
                o13.r.b(objC);
                int i16 = o13.q.f128596b;
                sd1.b bVar = new sd1.b(null, pd1.a.BLOOD_PRESSURE);
                bVar.b(new sd1.c(bVar));
                o53.r<pd1.c> rVarK = bVar.k();
                kVar.f96897c = 1;
                objC = ((o53.s) rVarK).C(kVar);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objC);
            }
            int i17 = o13.q.f128596b;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            new o13.q.b(th3);
        }
        return Unit.INSTANCE;
    }

    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        context.startActivity(new Intent(context, (Class<?>) BloodPressureRemindersActivity.class));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj31/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

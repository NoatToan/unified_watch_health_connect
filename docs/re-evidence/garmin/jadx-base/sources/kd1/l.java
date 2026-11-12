package kd1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkd1/l;", "", "", "Lnd1/b;", "reminderUpdaters", "<init>", "([Lnd1/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd1.b[] f104520a;

    static {
        new a(null);
    }

    public l(nd1.b... bVarArr) {
        bVarArr.getClass();
        this.f104520a = bVarArr;
    }

    public final void a(pd1.a aVar, nd1.c cVar) {
        nd1.b bVar;
        cVar.getClass();
        nd1.b[] bVarArr = this.f104520a;
        int length = bVarArr.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArr[i14];
            if (bVar.f125403a == aVar) {
                break;
            } else {
                i14++;
            }
        }
        if (bVar != null) {
            bVar.c(cVar);
            return;
        }
        a2 a2Var = a2.USER_REMINDERS;
        String strN = fb1.c.n("No updater found for reminder type: ", aVar.f137376a);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "UpdateRemindersByTypeUseCase", strN);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd1/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

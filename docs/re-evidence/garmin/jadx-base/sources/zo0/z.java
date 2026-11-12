package zo0;

import android.content.Context;
import android.content.res.Resources;
import c22.s1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import l70.j0;
import l70.k0;
import l70.l0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.s0;
import r22.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzo0/z;", "Lzo0/p;", "Lzo0/q;", "navigator", "Lf12/l;", "userSettings", "Ll70/k0;", "serverMaintenanceRepository", "<init>", "(Lzo0/q;Lf12/l;Ll70/k0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f206208d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f206210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f206211c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.ScheduledServerMaintenanceDialogHandler", f = "ScheduledServerMaintenanceDialogHandler.kt", l = {27}, m = "requestDialogData", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f206212a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f206214c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f206212a = obj;
            this.f206214c |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ z(q qVar, f12.l lVar, k0 k0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            f12.l.f68084a.getClass();
            lVar = f12.l.a.a();
        }
        if ((i14 & 4) != 0) {
            Resources resourcesU5 = qVar.u5();
            s1 s1Var = s1.f23251a;
            Context context = qVar.getContext();
            s1Var.getClass();
            k0Var = new l0(resourcesU5, s1.e(context));
        }
        this(qVar, lVar, k0Var);
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.C3845n)) {
            return null;
        }
        a2 a2Var = a2.DEVICES;
        n.C3845n c3845n = (n.C3845n) nVar;
        String strN = fb1.c.n("Create dialog with message: ", c3845n.f206191a);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ScheduledServerMaintenanceDialogHandler", strN);
        s0.a aVar = s0.f149856f;
        q qVar = this.f206209a;
        String string = qVar.u5().getString(R.string.title_system_maintenance);
        String str = c3845n.f206191a;
        String string2 = qVar.u5().getString(R.string.lbl_ok);
        string2.getClass();
        return s0.a.a(aVar, string, str, string2, null, null, null, 120);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zo0.p
    public final Object c(t13.d<? super n> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f206214c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f206214c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objB = bVar.f206212a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f206214c;
        if (i15 == 0) {
            o13.r.b(objB);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "ScheduledServerMaintenanceDialogHandler", "requestDialogData");
            j0 j0Var = j0.BEFORE_MAINTENANCE;
            yw2.h hVar = new yw2.h(this, 16);
            bVar.f206214c = 1;
            objB = this.f206211c.b(j0Var, hVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        String str = (String) objB;
        if (str != null) {
            return new n.C3845n(str);
        }
        return null;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        this.f206210b.h2(DateTime.now().getMillis(), "scheduled_maintenance_dialog_shown");
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lzo0/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "NOTIFY_SCHEDULED_MAINTENANCE_HOURS", "I", "DIALOG_SHOWN_TIMESTAMP", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public z(q qVar, f12.l lVar, k0 k0Var) {
        qVar.getClass();
        lVar.getClass();
        k0Var.getClass();
        this.f206209a = qVar;
        this.f206210b = lVar;
        this.f206211c = k0Var;
    }
}

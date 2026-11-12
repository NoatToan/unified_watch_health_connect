package zo0;

import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r22.m0;
import r22.v0;
import zd0.j1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lzo0/a0;", "Lzo0/p;", "Lzo0/r;", "Lzo0/q;", "navigator", "Lzd0/j1;", "subscriptionProvider", "La80/b;", "subscriptionPreferences", "<init>", "(Lzo0/q;Lzd0/j1;La80/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 implements p, r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f206082d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f206084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a80.b f206085c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.SubscriptionAllSetDialogHandler", f = "SubscriptionAllSetDialogHandler.kt", l = {31, 34}, m = "requestDialogData", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f206086a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f206088c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f206086a = obj;
            this.f206088c |= Integer.MIN_VALUE;
            return a0.this.c(this);
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ a0(q qVar, j1 j1Var, a80.b bVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(qVar, (i14 & 2) != 0 ? (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null) : j1Var, (i14 & 4) != 0 ? (a80.b) KoinJavaComponent.get$default(a80.b.class, null, null, 6, null) : bVar);
    }

    @Override // zo0.r
    public final m0 a(n nVar) {
        nVar.getClass();
        if (!(nVar instanceof n.o) || ((n.o) nVar).f206192a) {
            return null;
        }
        a2 a2Var = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SubscriptionAllSetDialogHandler", "Creating secondary dialog because notifications weren't enabled.");
        Resources resourcesU5 = this.f206083a.u5();
        return m0.a.c(m0.f149759e, resourcesU5.getString(R.string.get_notified_about_your_subscription), resourcesU5.getString(R.string.allow_push_notifications_in_garmin_connect), R.string.go_to_settings, new xp0.d(this, 28), R.string.not_now_lbl, null, 224);
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        if (!(nVar instanceof n.o)) {
            return null;
        }
        a2 a2Var = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SubscriptionAllSetDialogHandler", "Creating dialog");
        Resources resourcesU5 = this.f206083a.u5();
        return m0.a.d(m0.f149759e, R.drawable.gcplus_large_blue_icon, resourcesU5.getString(R.string.youre_all_set), resourcesU5.getString(R.string.enjoy_garmin_connect_plus), R.string.lbl_close, new do1.l(6), 0, null, null, 2016);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r6 == r1) goto L25;
     */
    @Override // zo0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t13.d<? super n> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f206088c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f206088c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objI = bVar.f206086a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f206088c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objI);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objI);
            }
            return new n.o(((Boolean) objI).booleanValue() && z6.a0.a(this.f206083a.getContext()).f202582b.areNotificationsEnabled());
        }
        o13.r.b(objI);
        if (!this.f206085c.f().isAfter(DateTime.now())) {
            return null;
        }
        bVar.f206088c = 1;
        objI = this.f206084b.i(bVar);
        if (objI != aVar) {
        }
        return aVar;
        if (!(objI instanceof c80.s.a)) {
            return null;
        }
        bVar.f206088c = 2;
        objI = wj0.d.a(bVar);
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        if (nVar instanceof n.o) {
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            this.f206085c.k(dateTimeNow);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/a0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public a0(q qVar, j1 j1Var, a80.b bVar) {
        qVar.getClass();
        j1Var.getClass();
        bVar.getClass();
        this.f206083a = qVar;
        this.f206084b = j1Var;
        this.f206085c = bVar;
    }
}

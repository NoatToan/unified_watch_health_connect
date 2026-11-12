package ri1;

import android.app.Application;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o53.c2;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import pc0.n0;
import r53.b2;
import r53.k2;
import r53.m1;
import r53.p2;
import r53.q2;
import ui1.b1;
import ui1.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lri1/s;", "Landroidx/lifecycle/u1;", "", "deviceId", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "directActivationCapableDevice", "Lui1/l;", "inReachSubscriptionRepo", "Lb31/f;", "onboardingChecksRepository", "Lzd0/i;", "getDeviceConnectionState", "Ll80/b;", "gdiDelegate", "Lpc0/n0;", "inReachSubscriptionPreferences", "<init>", "(JLandroid/app/Application;ZLui1/l;Lb31/f;Lzd0/i;Ll80/b;Lpc0/n0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends u1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f152886m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f152888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ui1.l f152890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b31.f f152891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l80.b f152892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f152893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f152894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f152895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q53.b f152896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r53.e f152897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c2 f152898l;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "notification", "Lcom/garmin/proto/generated/GDIInReachMessaging$ActivationStatusNotification;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachSubscriptionManagerViewModel$subscribeToActivationStatusNotifications$1", f = "InReachSubscriptionManagerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<GDIInReachMessaging.ActivationStatusNotification, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f152899a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = s.this.new b(dVar);
            bVar.f152899a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(GDIInReachMessaging.ActivationStatusNotification activationStatusNotification, t13.d<? super Unit> dVar) {
            return ((b) create(activationStatusNotification, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            GDIInReachMessaging.ActivationStatusNotification activationStatusNotification = (GDIInReachMessaging.ActivationStatusNotification) this.f152899a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            String str = "activationStatusNotifications emitted: " + activationStatusNotification.getActivationStatus();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "InReachSubscriptionManagerViewModel", str);
            int i14 = s.f152886m;
            s sVar = s.this;
            sVar.getClass();
            i2.a.b(a2Var, "InReachSubscriptionManagerViewModel", "Received activation status notification: " + activationStatusNotification.getActivationStatus());
            if (activationStatusNotification.getActivationStatus() == GDIInReachMessaging.ActivationStatus.ACTIVE) {
                p2 p2Var = sVar.f152894h;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, si1.k.b((si1.k) value, false, false, null, false, false, false, false, false, si1.e.ACTIVE, 895)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/proto/generated/GDIInReachMessaging$ActivationStatusNotification;", "", "exception", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachSubscriptionManagerViewModel$subscribeToActivationStatusNotifications$2", f = "InReachSubscriptionManagerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.q<r53.j<? super GDIInReachMessaging.ActivationStatusNotification>, Throwable, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ r53.j f152901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Throwable f152902b;

        public c(t13.d<? super c> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(r53.j<? super GDIInReachMessaging.ActivationStatusNotification> jVar, Throwable th3, t13.d<? super Unit> dVar) {
            c cVar = new c(dVar);
            cVar.f152901a = jVar;
            cVar.f152902b = th3;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = this.f152902b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            String strN = fb1.c.n("Exception collecting activationStatusNotifications: ", th3.getMessage());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "InReachSubscriptionManagerViewModel", strN);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lsi1/k;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachSubscriptionManagerViewModel$subscriptionViewState$1", f = "InReachSubscriptionManagerViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<r53.j<? super si1.k>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152903a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return s.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super si1.k> jVar, t13.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152903a;
            if (i14 == 0) {
                o13.r.b(obj);
                s sVar = s.this;
                ui1.l lVar = sVar.f152890d;
                long j8 = sVar.f152887a;
                this.f152903a = 1;
                lVar.getClass();
                ui1.e eVarB = ui1.l.b(j8, "messagingSubscribeRequest");
                if ((eVarB == null ? null : eVarB.l(this)) == aVar) {
                    return aVar;
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

    static {
        new a(null);
    }

    public s(long j8, Application application, boolean z14, ui1.l lVar, b31.f fVar, zd0.i iVar, l80.b bVar, n0 n0Var) {
        application.getClass();
        lVar.getClass();
        fVar.getClass();
        iVar.getClass();
        bVar.getClass();
        n0Var.getClass();
        this.f152887a = j8;
        this.f152888b = application;
        this.f152889c = z14;
        this.f152890d = lVar;
        this.f152891e = fVar;
        this.f152892f = bVar;
        this.f152893g = n0Var;
        p2 p2VarA = q2.a(new si1.k(false, false, j8, false, null, false, hk0.p.k(j8), false, false, false, null, 1952, null));
        this.f152894h = p2VarA;
        r53.v vVar = new r53.v(new d(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f152895i = r53.s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
        q53.b bVarA = q53.l.a(-2, 6, null);
        this.f152896j = bVarA;
        this.f152897k = r53.s.F(bVarA);
        z4();
        r53.s.C(new r53.w(new m1(r53.s.f(new zd0.j(Long.valueOf(j8), null)), new y(this, null)), new z(null)), v1.a(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final Object x4(s sVar, v13.c cVar) {
        w wVar;
        ?? arrayList;
        Object next;
        sVar.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f152936c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f152936c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(sVar, cVar);
            }
        } else {
            wVar = new w(sVar, cVar);
        }
        Object objB = wVar.f152934a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f152936c;
        if (i15 == 0) {
            o13.r.b(objB);
            wVar.f152936c = 1;
            objB = xx2.b.b(false, wVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        List list = (List) ((xx2.e) objB).f192598a;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (p005kotlin.jvm.internal.s.g(((yx2.c) obj).f200057j, "OUT_INRSMP_C_META_P")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = j0.f134944a;
        }
        Iterator it = ((Iterable) arrayList).iterator();
        while (it.hasNext()) {
            next = it.next();
            List<yx2.d> list2 = ((yx2.c) next).f200068w;
            if (list2 != null && !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    String str = ((yx2.d) it3.next()).f200072c;
                    if (str != null) {
                        long j8 = sVar.f152887a;
                        Long lJ = d53.t.j(str);
                        if (lJ != null && j8 == lJ.longValue()) {
                            return (yx2.c) next;
                        }
                    }
                }
            }
        }
        next = null;
        return (yx2.c) next;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object y4(s sVar, v13.c cVar) {
        x xVar;
        e0 planChange;
        String date;
        List<b1> listA;
        Object next;
        Application application = sVar.f152888b;
        long j8 = sVar.f152887a;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f152939c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f152939c = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(sVar, cVar);
            }
        } else {
            xVar = new x(sVar, cVar);
        }
        Object objD = xVar.f152937a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f152939c;
        if (i15 == 0) {
            o13.r.b(objD);
            ui1.l lVar = sVar.f152890d;
            xVar.f152939c = 1;
            objD = lVar.d(j8, xVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        ui1.j0 j0Var = (ui1.j0) objD;
        if (j0Var == null || (listA = j0Var.a()) == null) {
            planChange = null;
        } else {
            Iterator<T> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((b1) next).getUnitId(), String.valueOf(j8)));
            b1 b1Var = (b1) next;
            if (b1Var != null) {
                planChange = b1Var.getPlanChange();
            } else {
                planChange = null;
            }
        }
        String shortPlanName = planChange != null ? planChange.getShortPlanName() : null;
        DateTime dateTimeK = (planChange == null || (date = planChange.getDate()) == null) ? null : c22.j0.K(date, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        if (shortPlanName == null || dateTimeK == null) {
            return null;
        }
        return application.getString(R.string.msg_suspended_sos_description, shortPlanName, new pi0.a(application).a(dateTimeK, qi0.a.YEAR_MONTH_DAY));
    }

    public final void z4() {
        this.f152890d.getClass();
        ui1.e eVarB = ui1.l.b(this.f152887a, "activationStatusNotifications");
        r53.a2 a2Var = eVarB != null ? eVarB.f171256f : null;
        String strH = com.airbnb.lottie.animation.keyframe.a.h("subscribeToActivationStatusNotifications: handler available=", a2Var != null);
        i2.a aVar = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var2, "InReachSubscriptionManagerViewModel", strH);
        c2 c2Var = this.f152898l;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f152898l = a2Var != null ? r53.s.C(new r53.w(new m1(a2Var, new b(null)), new c(null)), v1.a(this)) : null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lri1/s$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ s(long j8, Application application, boolean z14, ui1.l lVar, b31.f fVar, zd0.i iVar, l80.b bVar, n0 n0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        ui1.l lVarA;
        boolean z15 = (i14 & 4) != 0 ? false : z14;
        if ((i14 & 8) != 0) {
            ui1.l.f171314e.getClass();
            lVarA = ui1.l.a.a();
        } else {
            lVarA = lVar;
        }
        this(j8, application, z15, lVarA, fVar, (i14 & 32) != 0 ? (zd0.i) KoinJavaComponent.get$default(zd0.i.class, null, null, 6, null) : iVar, (i14 & 64) != 0 ? (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null) : bVar, (i14 & 128) != 0 ? (n0) KoinJavaComponent.get$default(n0.class, null, null, 6, null) : n0Var);
    }
}

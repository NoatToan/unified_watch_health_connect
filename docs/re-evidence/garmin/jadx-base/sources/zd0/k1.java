package zd0;

import android.net.Uri;
import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lzd0/k1;", "Lzd0/u;", "Lzd0/t;", "gcPlusSubscriptionEventManager", "Lz70/i0;", "subscriptionRepository", "Lc22/k;", "appConfigurationDelegate", "<init>", "(Lzd0/t;Lz70/i0;Lc22/k;)V", "a", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k1 implements u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f204046d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f204047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z70.i0 f204048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c22.k f204049c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.domain.SubscriptionProviderImpl", f = "SubscriptionProvider.kt", l = {273}, m = "getFeatureStatus", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c80.q f204050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f204051b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f204053d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f204051b = obj;
            this.f204053d |= Integer.MIN_VALUE;
            return k1.this.j(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc80/p;", "<anonymous>", "()Lc80/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.domain.SubscriptionProviderImpl$getFeatureStatus$2", f = "SubscriptionProvider.kt", l = {275}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.l<t13.d<? super c80.p>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204054a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c80.q f204056c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c80.q qVar, t13.d<? super c> dVar) {
            super(1, dVar);
            this.f204056c = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return k1.this.new c(this.f204056c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c80.p> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r4v1, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v2 */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            ?? arrayList;
            List<yx2.c> list;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204054a;
            List listO = null;
            if (i14 == 0) {
                o13.r.b(obj);
                String strD = hb2.h.d(hb2.h.a(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c()));
                this.f204054a = 1;
                cVar = this;
                obj = xx2.b.e(false, null, strD, null, cVar, 47);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                cVar = this;
            }
            yx2.n nVar = (yx2.n) ((xx2.e) obj).f192598a;
            c80.q qVar = cVar.f204056c;
            if (nVar == null || (list = nVar.f200128a) == null) {
                arrayList = p13.j0.f134944a;
            } else {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    List<yx2.h> list2 = ((yx2.c) obj2).f200058k;
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g(((yx2.h) it.next()).f200084a, qVar.f25548a)) {
                                arrayList.add(obj2);
                                break;
                            }
                        }
                    }
                }
            }
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : iterable) {
                if (((yx2.c) obj3).f200064q) {
                    arrayList2.add(obj3);
                }
            }
            if (!arrayList2.isEmpty()) {
                a2 a2Var = a2.SUBSCRIPTIONS;
                String strN = fb1.c.n("getFeatureStatus - auto renewing sub including ", qVar.f25548a);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SubscriptionProviderImpl", strN);
                Iterator it3 = iterable.iterator();
                if (!it3.hasNext()) {
                    c22.t.g();
                    return null;
                }
                Object next = it3.next();
                if (it3.hasNext()) {
                    yx2.c cVar2 = (yx2.c) next;
                    DateTime dateTimeD = cVar2.d();
                    if (dateTimeD == null) {
                        dateTimeD = cVar2.b();
                    }
                    do {
                        Object next2 = it3.next();
                        yx2.c cVar3 = (yx2.c) next2;
                        DateTime dateTimeD2 = cVar3.d();
                        if (dateTimeD2 == null) {
                            dateTimeD2 = cVar3.b();
                        }
                        if (dateTimeD.compareTo(dateTimeD2) < 0) {
                            next = next2;
                            dateTimeD = dateTimeD2;
                        }
                    } while (it3.hasNext());
                }
                yx2.c cVar4 = (yx2.c) next;
                DateTime dateTimeD3 = cVar4.d();
                if (dateTimeD3 == null) {
                    dateTimeD3 = cVar4.b();
                }
                return new c80.p.a(dateTimeD3, true);
            }
            if (!((Collection) arrayList).isEmpty()) {
                a2 a2Var2 = a2.SUBSCRIPTIONS;
                String strN2 = fb1.c.n("getFeatureStatus - expiring subscription including ", qVar.f25548a);
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "SubscriptionProviderImpl", strN2);
                Iterator it4 = iterable.iterator();
                if (!it4.hasNext()) {
                    c22.t.g();
                    return null;
                }
                Object next3 = it4.next();
                if (it4.hasNext()) {
                    DateTime dateTimeB = ((yx2.c) next3).b();
                    do {
                        Object next4 = it4.next();
                        DateTime dateTimeB2 = ((yx2.c) next4).b();
                        if (dateTimeB.compareTo(dateTimeB2) < 0) {
                            next3 = next4;
                            dateTimeB = dateTimeB2;
                        }
                    } while (it4.hasNext());
                }
                return new c80.p.a(((yx2.c) next3).b(), false);
            }
            if (s3.b()) {
                a2 a2Var3 = a2.SUBSCRIPTIONS;
                String strN3 = fb1.c.n("Child account with no active subscription for feature ", qVar.f25548a);
                i2.f36769a.getClass();
                i2.a.k(a2Var3, "SubscriptionProviderImpl", strN3);
                return new c80.p.c(c80.c1.INVALID_USER_ROLE);
            }
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListE = rd2.j.e();
            if (arrayListE != null && !arrayListE.isEmpty()) {
                Iterator it5 = arrayListE.iterator();
                while (it5.hasNext()) {
                    if (((sd2.f) it5.next()).isPaired()) {
                        if (nVar != null) {
                            int i15 = k1.f204046d;
                            k1.this.getClass();
                            listO = k1.o(nVar);
                        }
                        if (listO == null) {
                            a2 a2Var4 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var4, "SubscriptionProviderImpl", "getFeatureStatus - purchasableSubscriptions == null");
                            return new c80.p.c(c80.c1.API_ISSUE);
                        }
                        if (listO.isEmpty()) {
                            a2 a2Var5 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var5, "SubscriptionProviderImpl", "getFeatureStatus - no purchasable subscriptions.");
                            return new c80.p.c(c80.c1.NO_PURCHASABLE_SUBSCRIPTIONS);
                        }
                        a2 a2Var6 = a2.SUBSCRIPTIONS;
                        String strF = v.e0.f(listO.size(), "getFeatureStatus - ", " purchasable subscriptions.");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var6, "SubscriptionProviderImpl", strF);
                        return c80.p.b.f25521a;
                    }
                }
            }
            a2 a2Var7 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.b(a2Var7, "SubscriptionProviderImpl", "getFeatureStatus - no paired device.");
            return new c80.p.c(c80.c1.NO_PAIRED_DEVICE);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((yx2.i) t14).b(), ((yx2.i) t7).b());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.domain.SubscriptionProviderImpl", f = "SubscriptionProvider.kt", l = {250}, m = "hasFeature", v = 2)
    public static final class e extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c80.q f204057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f204058b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f204060d;

        public e(t13.d<? super e> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f204058b = obj;
            this.f204060d |= Integer.MIN_VALUE;
            return k1.this.l(null, this);
        }
    }

    static {
        new a(null);
    }

    public k1(t tVar, z70.i0 i0Var, c22.k kVar) {
        tVar.getClass();
        i0Var.getClass();
        kVar.getClass();
        this.f204047a = tVar;
        this.f204048b = i0Var;
        this.f204049c = kVar;
    }

    public static yx2.c n(yx2.n nVar) {
        List<yx2.c> list = nVar.f200128a;
        Object next = null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(((yx2.c) obj).f200057j, "ConnectPlus")) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                yx2.c cVar = (yx2.c) next;
                DateTime dateTimeD = cVar.d();
                if (dateTimeD == null) {
                    dateTimeD = cVar.b();
                }
                do {
                    Object next2 = it.next();
                    yx2.c cVar2 = (yx2.c) next2;
                    DateTime dateTimeD2 = cVar2.d();
                    if (dateTimeD2 == null) {
                        dateTimeD2 = cVar2.b();
                    }
                    if (dateTimeD.compareTo(dateTimeD2) < 0) {
                        next = next2;
                        dateTimeD = dateTimeD2;
                    }
                } while (it.hasNext());
            }
        }
        return (yx2.c) next;
    }

    public static List o(yx2.n nVar) {
        List<yx2.i> list;
        yx2.j jVar = nVar.f200129b;
        if (jVar != null && (list = jVar.f200105a) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                yx2.i iVar = (yx2.i) obj;
                if (p005kotlin.jvm.internal.s.g(iVar.f200089b, "ConnectPlus") && iVar.b() != null) {
                    arrayList.add(obj);
                }
            }
            List listN0 = p13.h0.N0(arrayList, new d());
            if (listN0 != null) {
                return listN0;
            }
        }
        return p13.j0.f134944a;
    }

    @Override // zd0.j1
    public final void a() {
        a2 a2Var = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SubscriptionProviderImpl", "User signed out");
        by2.d dVar = xx2.b.f192587b;
        if (dVar == null) {
            xx2.b.f192588c.warn("SubscriptionManager is not initialized!");
            return;
        }
        dy2.b bVarF = dVar.f();
        synchronized (bVarF) {
            bVarF.i(bVarF.e());
            bVarF.b(bVarF.e());
        }
        if (dVar.f22254a != null) {
            xx2.b.f192587b = null;
        }
    }

    @Override // zd0.j1
    public final d2<c80.r> b() {
        return this.f204047a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [p13.j0] */
    @Override // zd0.u
    public final boolean c(c80.q qVar) {
        ?? arrayList;
        qVar.getClass();
        if (e()) {
            try {
                List<yx2.h> listC = xx2.b.c();
                if (listC != null) {
                    arrayList = new ArrayList();
                    for (yx2.h hVar : listC) {
                        c80.q.a aVar = c80.q.f25532b;
                        String str = hVar.f200084a;
                        aVar.getClass();
                        c80.q qVarA = c80.q.a.a(str);
                        if (qVarA != null) {
                            arrayList.add(qVarA);
                        }
                    }
                } else {
                    arrayList = p13.j0.f134944a;
                }
            } catch (Exception e4) {
                a2 a2Var = a2.SUBSCRIPTIONS;
                String strH = f3.h(e4, "Failed to get cached features: ", ". Returning empty list.");
                i2.f36769a.getClass();
                i2.a.p(a2Var, "SubscriptionProviderImpl", strH);
                arrayList = p13.j0.f134944a;
            }
        } else {
            arrayList = p13.j0.f134944a;
        }
        boolean zContains = arrayList.contains(qVar);
        a2 a2Var2 = a2.SUBSCRIPTIONS;
        String str2 = "User has " + qVar.f25548a + " = " + zContains;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "SubscriptionProviderImpl", str2);
        return zContains;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // zd0.j1
    public final Object d(v13.c cVar) {
        r1 r1Var;
        f12.b bVar;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f204125d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f204125d = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object objC = r1Var.f204123b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f204125d;
        if (i15 == 0) {
            o13.r.b(objC);
            a2 a2Var = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SubscriptionProviderImpl", "setup");
            f12.b bVar2 = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
            if (bVar2.c()) {
                r1Var.f204122a = bVar2;
                r1Var.f204125d = 1;
                objC = bVar2.C(r1Var);
                if (objC == aVar) {
                    return aVar;
                }
                bVar = bVar2;
            } else {
                i2.a.f(a2Var, "SubscriptionProviderImpl", "User is not signed in. Cannot setup subscription manager.");
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bVar = r1Var.f204122a;
        o13.r.b(objC);
        String str = (String) objC;
        if (str.length() > 0) {
            a2 a2Var2 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SubscriptionProviderImpl", "User is signed in with non-empty user GUID. Setting up subscription manager.");
            s1 s1Var = new s1(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c());
            yx2.a aVar2 = new yx2.a(str, bVar.h(), null);
            by2.d dVar = xx2.b.f192587b;
            if (dVar == null || dVar.f22254a == null) {
                if (dVar != null) {
                    if (dVar != null) {
                        dy2.b bVarF = dVar.f();
                        synchronized (bVarF) {
                            bVarF.i(bVarF.e());
                            bVarF.b(bVarF.e());
                        }
                        if (dVar.f22254a != null) {
                            xx2.b.f192587b = null;
                        }
                    } else {
                        xx2.b.f192588c.warn("SubscriptionManager is not initialized!");
                    }
                }
                xx2.b.f192587b = new by2.d(s1Var, aVar2, null, 4, null);
            } else {
                xx2.b.f192588c.warn("Single user subscription manager already exists");
            }
        } else {
            a2 a2Var3 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "SubscriptionProviderImpl", "User is signed in with empty user GUID. Cannot setup subscription manager.");
        }
        return Unit.INSTANCE;
    }

    @Override // zd0.j1
    public final boolean e() {
        return this.f204049c.c("gcp_enabled");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.j1
    public final Object f(v13.c cVar) {
        p1 p1Var;
        List<yx2.i> list;
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i14 = p1Var.f204113c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p1Var.f204113c = i14 - Integer.MIN_VALUE;
            } else {
                p1Var = new p1(this, cVar);
            }
        } else {
            p1Var = new p1(this, cVar);
        }
        Object objK = p1Var.f204111a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = p1Var.f204113c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objK);
            p1Var.f204113c = 1;
            objK = k(true, p1Var);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        c80.s sVar = (c80.s) objK;
        if (!(sVar instanceof c80.s.b) || ((list = ((c80.s.b) sVar).f25559a) != null && list.isEmpty())) {
            z14 = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((yx2.i) it.next()).f200098k) {
                }
            }
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r8 == r1) goto L24;
     */
    @Override // zd0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(v13.c cVar) {
        q1 q1Var;
        z70.i0 i0Var;
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i14 = q1Var.f204120d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q1Var.f204120d = i14 - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(this, cVar);
            }
        } else {
            q1Var = new q1(this, cVar);
        }
        Object objC = q1Var.f204118b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q1Var.f204120d;
        if (i15 != 0) {
            if (i15 == 1) {
                i0Var = q1Var.f204117a;
                o13.r.b(objC);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objC);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objC);
        a2 a2Var = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SubscriptionProviderImpl", "refreshRoles");
        f12.b bVar = (f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        i0Var = this.f204048b;
        q1Var.f204117a = i0Var;
        q1Var.f204120d = 1;
        objC = bVar.C(q1Var);
        if (objC != aVar) {
        }
        return aVar;
        q1Var.f204117a = null;
        q1Var.f204120d = 2;
        i0Var.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(i0Var, new z70.h0(i0Var, (String) objC, null), q1Var);
        if (objJ != aVar) {
            objJ = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.j1
    public final Comparable h(v13.c cVar) {
        n1 n1Var;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i14 = n1Var.f204086c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n1Var.f204086c = i14 - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(this, cVar);
            }
        } else {
            n1Var = new n1(this, cVar);
        }
        Object objE3 = n1Var.f204084a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n1Var.f204086c;
        if (i15 == 0) {
            o13.r.b(objE3);
            c80.b1.f25306a.getClass();
            Uri uri = Uri.parse("https://" + (c80.b1.a.f25307a[((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().ordinal()] == 1 ? "www.garmin.com" : "www.dev.garmin.com") + "/account/subscriptions");
            cy2.i iVar = (cy2.i) KoinJavaComponent.get$default(cy2.i.class, null, null, 6, null);
            n1Var.f204086c = 1;
            objE3 = iVar.e3(uri, n1Var);
            if (objE3 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE3);
        }
        Uri uri2 = (Uri) objE3;
        a2 a2Var = a2.SUBSCRIPTIONS;
        String strJ = am.j.j(uri2, "SMC auto login url ");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SubscriptionProviderImpl", strJ);
        return uri2;
    }

    @Override // zd0.j1
    public final Object i(v13.c cVar) {
        return k(true, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.j1
    public final Object j(c80.q qVar, t13.d<? super c80.p> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f204053d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f204053d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objP = bVar.f204051b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f204053d;
        try {
            if (i15 == 0) {
                o13.r.b(objP);
                if (!e()) {
                    a2 a2Var = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.k(a2Var, "SubscriptionProviderImpl", "getFeatureStatus - showGCPlus == false");
                    return new c80.p.c(c80.c1.INVALID_USER_ROLE);
                }
                e23.l cVar = new c(qVar, null);
                bVar.f204050a = qVar;
                bVar.f204053d = 1;
                objP = p(cVar, bVar);
                if (objP == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qVar = bVar.f204050a;
                o13.r.b(objP);
            }
            return (c80.p) objP;
        } catch (Exception e4) {
            i2.f36769a.getClass();
            i2.a.f(a2.SUBSCRIPTIONS, "SubscriptionProviderImpl", "Failed to get feature status for feature " + qVar + " with exception " + e4 + ". Returning ineligible.");
            return new c80.p.c(c80.c1.API_ISSUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zd0.u
    public final Object k(boolean z14, v13.c cVar) {
        o1 o1Var;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i14 = o1Var.f204101c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o1Var.f204101c = i14 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, cVar);
            }
        } else {
            o1Var = new o1(this, cVar);
        }
        o1 o1Var2 = o1Var;
        Object objE = o1Var2.f204099a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o1Var2.f204101c;
        try {
            if (i15 == 0) {
                o13.r.b(objE);
                a2 a2Var = a2.SUBSCRIPTIONS;
                String strH = com.airbnb.lottie.animation.keyframe.a.h("getSubscriptionStatus preferCache = ", z14);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SubscriptionProviderImpl", strH);
                if (!e()) {
                    i2.a.k(a2Var, "SubscriptionProviderImpl", "getSubscriptionStatus - showGCPlus == false");
                    return new c80.s.c(c80.c1.INVALID_USER_ROLE);
                }
                Locale localeA = hb2.h.a(((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c());
                xx2.b bVar = xx2.b.f192586a;
                String strD = hb2.h.d(localeA);
                o1Var2.f204101c = 1;
                objE = xx2.b.e(z14, null, strD, null, o1Var2, 45);
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE);
            }
            yx2.n nVar = (yx2.n) ((xx2.e) objE).f192598a;
            yx2.c cVarN = nVar != null ? n(nVar) : null;
            if (cVarN != null) {
                a2 a2Var2 = a2.SUBSCRIPTIONS;
                String str = "Active subscription " + cVarN.f200054g;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "SubscriptionProviderImpl", str);
                return new c80.s.a(cVarN);
            }
            if (s3.b()) {
                a2 a2Var3 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var3, "SubscriptionProviderImpl", "Child account with no active subscription");
                return new c80.s.c(c80.c1.INVALID_USER_ROLE);
            }
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListE = rd2.j.e();
            if (arrayListE != null && !arrayListE.isEmpty()) {
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    if (((sd2.f) it.next()).isPaired()) {
                        List listO = nVar != null ? o(nVar) : null;
                        if (listO == null) {
                            a2 a2Var4 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var4, "SubscriptionProviderImpl", "purchasableSubscriptions == null");
                            return new c80.s.c(c80.c1.API_ISSUE);
                        }
                        if (listO.isEmpty()) {
                            a2 a2Var5 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var5, "SubscriptionProviderImpl", "No purchasable subscriptions");
                            return new c80.s.c(c80.c1.NO_PURCHASABLE_SUBSCRIPTIONS);
                        }
                        a2 a2Var6 = a2.SUBSCRIPTIONS;
                        String str2 = listO.size() + " purchasable subscriptions.";
                        i2.f36769a.getClass();
                        i2.a.b(a2Var6, "SubscriptionProviderImpl", str2);
                        return new c80.s.b(listO);
                    }
                }
            }
            a2 a2Var7 = a2.SUBSCRIPTIONS;
            i2.f36769a.getClass();
            i2.a.b(a2Var7, "SubscriptionProviderImpl", "No paired device.");
            return new c80.s.c(c80.c1.NO_PAIRED_DEVICE);
        } catch (Exception e4) {
            a2 a2Var8 = a2.SUBSCRIPTIONS;
            String strH2 = f3.h(e4, "Failed to get subscription status with exception ", ". Returning ineligible.");
            i2.f36769a.getClass();
            i2.a.f(a2Var8, "SubscriptionProviderImpl", strH2);
            return new c80.s.c(c80.c1.API_ISSUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.j1
    public final Object l(c80.q qVar, t13.d<? super Boolean> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i14 = eVar.f204060d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f204060d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objM = eVar.f204058b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f204060d;
        if (i15 == 0) {
            o13.r.b(objM);
            eVar.f204057a = qVar;
            eVar.f204060d = 1;
            objM = m(eVar);
            if (objM == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qVar = eVar.f204057a;
            o13.r.b(objM);
        }
        boolean zContains = ((List) objM).contains(qVar);
        a2 a2Var = a2.SUBSCRIPTIONS;
        String str = "User has " + qVar.f25548a + " = " + zContains;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SubscriptionProviderImpl", str);
        return Boolean.valueOf(zContains);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.u
    public final Object m(v13.c cVar) {
        l1 l1Var;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i14 = l1Var.f204076c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l1Var.f204076c = i14 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        Object objP = l1Var.f204074a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = l1Var.f204076c;
        try {
            if (i15 == 0) {
                o13.r.b(objP);
                if (!e()) {
                    return p13.j0.f134944a;
                }
                e23.l m1Var = new m1(null);
                l1Var.f204076c = 1;
                objP = p(m1Var, l1Var);
                if (objP == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objP);
            }
            return (List) objP;
        } catch (Exception e4) {
            a2 a2Var = a2.SUBSCRIPTIONS;
            String strH = f3.h(e4, "Failed to get active features with exception ", ". Returning empty list.");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SubscriptionProviderImpl", strH);
            return p13.j0.f134944a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(e23.l lVar, v13.c cVar) {
        t1 t1Var;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i14 = t1Var.f204140d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t1Var.f204140d = i14 - Integer.MIN_VALUE;
            } else {
                t1Var = new t1(this, cVar);
            }
        } else {
            t1Var = new t1(this, cVar);
        }
        Object obj = t1Var.f204138b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = t1Var.f204140d;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                t1Var.f204137a = lVar;
                t1Var.f204140d = 1;
                Object objInvoke = lVar.invoke(t1Var);
                if (objInvoke != obj2) {
                    return objInvoke;
                }
            } else {
                if (i15 == 1) {
                    e23.l lVar2 = t1Var.f204137a;
                    o13.r.b(obj);
                    return obj;
                }
                if (i15 != 2) {
                    if (i15 == 3) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = t1Var.f204137a;
                o13.r.b(obj);
                t1Var.f204137a = null;
                t1Var.f204140d = 3;
                Object objInvoke2 = lVar.invoke(t1Var);
                if (objInvoke2 != obj2) {
                    return objInvoke2;
                }
            }
        } catch (IllegalStateException e4) {
            i2.f36769a.getClass();
            i2.a.p(a2.SUBSCRIPTIONS, "SubscriptionProviderImpl", "Caught IllegalStateException: " + e4 + ". Setting up subscription manager before retrying call.");
            t1Var.f204137a = lVar;
            t1Var.f204140d = 2;
            if (d(t1Var) != obj2) {
            }
        }
        return obj2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lzd0/k1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "GC_PLUS_ENABLED", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

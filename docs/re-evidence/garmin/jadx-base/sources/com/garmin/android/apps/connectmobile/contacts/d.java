package com.garmin.android.apps.connectmobile.contacts;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.proto.generated.GDIInReachMessaging;
import d53.u;
import d53.w;
import e23.p;
import f20.e0;
import f20.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l20.r;
import lc.u0;
import m20.z;
import o53.b0;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import r1.q2;
import re0.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/d;", "Landroidx/lifecycle/u1;", "Lm20/z;", "contactsRepo", "Lre0/o;", "managedAccountRepo", "Lhl/a;", "screenAccessRole", "<init>", "(Lm20/z;Lre0/o;Lhl/a;)V", "a", "b", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f32386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f32387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hl.a f32388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f32389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<l20.a> f32391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0 f32395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<b> f32397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f32398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<g3<r>> f32399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0 f32400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f32401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f32402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f32403r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$getConnectContacts$1", f = "ContactViewModel.kt", l = {118, SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32423a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ll20/r;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$getConnectContacts$1$result$1", f = "ContactViewModel.kt", l = {120, 121}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends r>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f32425a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f32426b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f32426b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f32426b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends r>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
            
                if (r6 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
            
                if (r6 == r0) goto L22;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f32425a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        return (v2) obj;
                    }
                    if (i14 == 2) {
                        o13.r.b(obj);
                        return (v2) obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                d dVar = this.f32426b;
                hl.a aVar2 = dVar.f32388c;
                if (s.g(aVar2, hl.a.c.f84256b)) {
                    z zVar = dVar.f32386a;
                    this.f32425a = 1;
                    obj = zVar.g(this);
                } else {
                    if (!(aVar2 instanceof hl.a.b)) {
                        u0.r();
                        return null;
                    }
                    o oVar = dVar.f32387b;
                    long j8 = ((hl.a.b) dVar.f32388c).f84252b;
                    this.f32425a = 2;
                    obj = oVar.o(j8, this);
                }
                return aVar;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ll20/r;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.ContactViewModel$getConnectContacts$1$updateResult$1", f = "ContactViewModel.kt", l = {154, 159}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends r>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f32427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f32428b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, t13.d<? super b> dVar2) {
                super(2, dVar2);
                this.f32428b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f32428b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends r>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f32427a;
                d dVar = this.f32428b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    List list = dVar.f32391f;
                    if (list == null) {
                        list = j0.f134944a;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (c22.b0.c().equalsIgnoreCase(Locale.US.getCountry())) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(dVar.C4((l20.a) it.next()));
                        }
                    } else if (dVar.f32403r) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(dVar.B4((l20.a) it3.next()));
                        }
                    } else {
                        arrayList.addAll(list);
                    }
                    z zVar = dVar.f32386a;
                    r rVar = new r(new ArrayList(arrayList), null, null, null, null, null, 62, null);
                    this.f32427a = 1;
                    if (zVar.i(rVar, this) != aVar) {
                    }
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        o13.r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                z zVar2 = dVar.f32386a;
                this.f32427a = 2;
                Object objG = zVar2.g(this);
                return objG == aVar ? aVar : objG;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:95:0x01f7  */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x020d, code lost:
        
            if (r2 == r1) goto L101;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE0;
            boolean z14;
            Object objE1;
            String str;
            ArrayList arrayList;
            boolean z15;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f32423a;
            d dVar = d.this;
            if (i14 == 0) {
                o13.r.b(obj);
                dVar.f32399n.j(g3.a.c(g3.f35298f));
                x53.c cVar = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(dVar, null);
                this.f32423a = 1;
                objE0 = ge1.b.e0(bVar, aVar2, this);
                if (objE0 != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objE0 = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objE1 = obj;
            }
            v2 v2Var = (v2) objE1;
            if (v2Var instanceof v2.b) {
                dVar.f32396k = true;
                T t7 = ((v2.b) v2Var).f47386a;
                dVar.f32389d = (r) t7;
                u62.z.h(g3.f35298f, t7, dVar.f32399n);
            } else {
                y0<g3<r>> y0Var = dVar.f32399n;
                g3.a aVar3 = g3.f35298f;
                r rVar = dVar.f32389d;
                aVar3.getClass();
                y0Var.j(g3.a.d(rVar));
            }
            return Unit.INSTANCE;
            v2 v2Var2 = (v2) objE0;
            if (v2Var2 instanceof v2.b) {
                r rVar2 = (r) ((v2.b) v2Var2).f47386a;
                List<l20.a> listF = rVar2.f();
                if (listF == null) {
                    listF = j0.f134944a;
                }
                if (!com.garmin.android.apps.connectmobile.contacts.b.e() && (listF == null || !listF.isEmpty())) {
                    Iterator it = listF.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            List<l20.c> listZ = ((l20.a) it.next()).z();
                            if (listZ != null) {
                                if (!listZ.isEmpty()) {
                                    Iterator<T> it3 = listZ.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            continue;
                                        } else if (!s.g(((l20.c) it3.next()).getIsValid(), Boolean.TRUE)) {
                                        }
                                    }
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(y.r(listF, 10));
                            for (l20.a aVar4 : listF) {
                                List<l20.c> listZ2 = aVar4.z();
                                if (listZ2 != null) {
                                    ArrayList arrayList3 = new ArrayList(y.r(listZ2, 10));
                                    for (l20.c cVar2 : listZ2) {
                                        if (s.g(cVar2.getIsValid(), Boolean.TRUE)) {
                                            z15 = true;
                                        } else {
                                            i.a aVar5 = i.f32732a;
                                            String str2 = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                            aVar5.getClass();
                                            if (i.a.a(str2)) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                        }
                                        arrayList3.add(l20.c.b(cVar2, null, null, null, null, null, null, Boolean.valueOf(z15), null, null, null, 0, 1048319));
                                    }
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = null;
                                }
                                arrayList2.add(l20.a.g(aVar4, null, null, null, null, null, null, null, arrayList, null, 8063));
                            }
                            listF = arrayList2;
                        }
                    }
                }
                dVar.f32391f = listF;
                if (dVar.f32394i) {
                    List<l20.a> list = listF == null ? j0.f134944a : listF;
                    if (c22.b0.c().equalsIgnoreCase(Locale.US.getCountry())) {
                        Iterator<l20.a> it4 = list.iterator();
                        z14 = true;
                        while (it4.hasNext()) {
                            List<l20.c> listZ3 = it4.next().z();
                            if (listZ3 != null) {
                                Iterator<l20.c> it5 = listZ3.iterator();
                                while (it5.hasNext()) {
                                    l20.c next = it5.next();
                                    String str3 = next.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                                    if (str3 != null) {
                                        if (u.y(str3, Marker.ANY_NON_NULL_MARKER, false)) {
                                            str = Marker.ANY_NON_NULL_MARKER;
                                        } else {
                                            String strN = fb1.c.n(Marker.ANY_NON_NULL_MARKER, next.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String());
                                            str = Marker.ANY_NON_NULL_MARKER;
                                            next = l20.c.b(next, null, strN, null, null, null, null, null, null, null, null, 0, 1048573);
                                        }
                                        if (u.y(str3, str, false)) {
                                            continue;
                                        } else if (str3.length() == 10) {
                                            z14 = false;
                                        } else {
                                            int length = str3.length();
                                            if (7 <= length && length < 16) {
                                                e0 e0Var = dVar.f32395j;
                                                if (e0Var == null) {
                                                    s.m("phonePrefixProvider");
                                                    throw null;
                                                }
                                                if (gl1.d.K(next, e0Var)) {
                                                    z14 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        z14 = true;
                    }
                    if (!z14) {
                        x53.c cVar3 = s0.f129406a;
                        x53.b bVar2 = x53.b.f189152a;
                        b bVar3 = new b(dVar, null);
                        this.f32423a = 2;
                        objE1 = ge1.b.e0(bVar2, bVar3, this);
                    }
                }
                y0<g3<r>> y0Var2 = dVar.f32399n;
                g3.a aVar6 = g3.f35298f;
                r rVarB = r.b(rVar2, listF, null, null, 62);
                aVar6.getClass();
                y0Var2.j(g3.a.d(rVarB));
            } else {
                y0<g3<r>> y0Var3 = dVar.f32399n;
                g3.a aVar7 = g3.f35298f;
                r rVar3 = dVar.f32389d;
                aVar7.getClass();
                y0Var3.j(g3.a.d(rVar3));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public d(z zVar, o oVar, hl.a aVar) {
        zVar.getClass();
        oVar.getClass();
        aVar.getClass();
        this.f32386a = zVar;
        this.f32387b = oVar;
        this.f32388c = aVar;
        this.f32391f = j0.f134944a;
        y0<b> y0Var = new y0<>();
        this.f32397l = y0Var;
        this.f32398m = y0Var;
        y0<g3<r>> y0Var2 = new y0<>();
        this.f32399n = y0Var2;
        this.f32400o = y0Var2;
        this.f32403r = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() || ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).n() || ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).y();
    }

    public static void D4(d dVar, List list) {
        y0<b> y0Var = dVar.f32397l;
        if (list == null || list.isEmpty()) {
            y0Var.j(new b(false, false, null, null, null, 0, 0, false, false, false, false, true, false, null, false, false, false, null, null, 522239, null));
            return;
        }
        List<l20.a> list2 = dVar.f32391f;
        boolean z14 = list2 != null && list2.size() >= dVar.f32392g;
        List<l20.a> list3 = dVar.f32391f;
        y0Var.j(new b(z14, false, list, null, null, list3 != null ? list3.size() : dVar.y4().size(), dVar.f32392g, !dVar.y4().isEmpty(), false, false, false, false, false, null, false, false, false, null, null, 524040, null));
    }

    public final void A4() {
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = {j22.a.f96717f};
        bVar.getClass();
        boolean zK = j22.b.k(aVarArr);
        y0<b> y0Var = this.f32397l;
        if (!zK) {
            y0Var.m(new b(false, false, null, null, null, 0, 0, false, false, true, false, false, false, null, false, false, false, null, null, 523775, null));
            return;
        }
        List<l20.a> list = this.f32391f;
        if (list == null || list.size() < this.f32392g) {
            ge1.b.T(v1.a(this), null, null, new t(this, null), 3);
        } else {
            y0Var.m(new b(true, false, null, null, null, 0, 0, false, false, false, false, false, false, null, false, false, false, null, null, 524286, null));
        }
    }

    public final l20.a B4(l20.a aVar) {
        ArrayList arrayList;
        if (!this.f32403r) {
            return aVar;
        }
        List<l20.c> listZ = aVar.z();
        if (listZ != null) {
            arrayList = new ArrayList(y.r(listZ, 10));
            for (l20.c cVarB : listZ) {
                String strConcat = cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                if (strConcat != null) {
                    if (!u.y(strConcat, "+86", false)) {
                        strConcat = u.y(strConcat, "86", false) ? Marker.ANY_NON_NULL_MARKER.concat(strConcat) : "+86".concat(strConcat);
                    }
                    cVarB = l20.c.b(cVarB, null, strConcat, null, null, null, null, null, null, null, null, 0, 1048573);
                }
                arrayList.add(cVarB);
            }
        } else {
            arrayList = null;
        }
        return l20.a.g(aVar, null, null, null, null, null, null, null, arrayList, null, 8063);
    }

    public final l20.a C4(l20.a aVar) {
        ArrayList arrayList;
        if (!c22.b0.c().equalsIgnoreCase(Locale.US.getCountry())) {
            return aVar;
        }
        List<l20.c> listZ = aVar.z();
        if (listZ != null) {
            ArrayList arrayList2 = new ArrayList(y.r(listZ, 10));
            for (l20.c cVarB : listZ) {
                String str = cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                if (str != null) {
                    if (u.y(str, Marker.ANY_NON_NULL_MARKER, false)) {
                        continue;
                    } else {
                        String str2 = cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                        if (str2 == null || str2.length() != 10) {
                            String str3 = cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                            int length = str3 != null ? str3.length() : 0;
                            if (7 <= length && length < 16) {
                                l20.c cVarB2 = l20.c.b(cVarB, null, fb1.c.n(Marker.ANY_NON_NULL_MARKER, cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()), null, null, null, null, null, null, null, null, 0, 1048573);
                                e0 e0Var = this.f32395j;
                                if (e0Var == null) {
                                    s.m("phonePrefixProvider");
                                    throw null;
                                }
                                cVarB = gl1.d.K(cVarB2, e0Var) ? l20.c.b(cVarB, null, fb1.c.n(Marker.ANY_NON_NULL_MARKER, cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()), null, null, null, null, null, null, null, null, 0, 1048573) : cVarB;
                            }
                        } else {
                            cVarB = l20.c.b(cVarB, null, fb1.c.n("+1", cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String()), null, null, null, null, null, null, null, null, 0, 1048573);
                        }
                    }
                }
                arrayList2.add(cVarB);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return l20.a.g(aVar, null, null, null, null, null, null, null, arrayList, null, 8063);
    }

    public final void x4() {
        ge1.b.T(v1.a(this), null, null, new c(null), 3);
    }

    public final ArrayList y4() {
        ArrayList arrayList = this.f32402q;
        if (arrayList == null) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((f20.o) obj).f68411g) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void z4() {
        List<l20.a> list = this.f32391f;
        y0<b> y0Var = this.f32397l;
        if (list == null || list.isEmpty()) {
            y0Var.m(new b(false, false, null, null, null, 0, 0, false, false, false, true, false, false, null, false, false, false, null, null, 523263, null));
            return;
        }
        int i14 = this.f32393h;
        List<l20.a> list2 = this.f32391f;
        List list3 = null;
        if (i14 == 2) {
            if (list2 != null) {
                e0 e0Var = this.f32395j;
                if (e0Var == null) {
                    s.m("phonePrefixProvider");
                    throw null;
                }
                ArrayList arrayList = new ArrayList(y.r(list2, 10));
                for (l20.a aVar : list2) {
                    int iA = com.garmin.android.apps.connectmobile.contacts.b.a(aVar);
                    String contactId = aVar.getContactId();
                    String str = contactId == null ? "" : contactId;
                    l20.g gVarQ = aVar.q();
                    String profileImageUrlSmall = gVarQ != null ? gVarQ.getProfileImageUrlSmall() : null;
                    String firstName = aVar.getFirstName();
                    if (firstName == null) {
                        firstName = "";
                    }
                    String lastName = aVar.getLastName();
                    if (lastName == null) {
                        lastName = "";
                    }
                    String string = w.i0(firstName + StringUtils.SPACE + lastName).toString();
                    l20.g gVarQ2 = aVar.q();
                    String location = gVarQ2 != null ? gVarQ2.getLocation() : null;
                    String str2 = location == null ? "" : location;
                    Boolean isLiveEventSharingDefault = aVar.getIsLiveEventSharingDefault();
                    arrayList.add(new f20.o(0L, str, profileImageUrlSmall, string, str2, true, isLiveEventSharingDefault != null ? isLiveEventSharingDefault.booleanValue() : false, 0, s.g(aVar.getIsLiveTrackDefault(), Boolean.TRUE), false, false, false, iA == 0 || !com.garmin.android.apps.connectmobile.contacts.b.f(aVar, e0Var), aVar.getLocalId(), false, 20097, null));
                }
                list3 = arrayList;
            }
            if (list3 == null) {
                list3 = j0.f134944a;
            }
            y0Var.m(new b(false, false, null, list3, null, 0, 0, false, false, false, false, false, false, null, false, false, false, null, null, 524279, null));
            return;
        }
        if (list2 != null) {
            e0 e0Var2 = this.f32395j;
            if (e0Var2 == null) {
                s.m("phonePrefixProvider");
                throw null;
            }
            boolean z14 = this.f32390e;
            ArrayList<l20.a> arrayList2 = new ArrayList();
            for (Object obj : list2) {
                l20.a aVar2 = (l20.a) obj;
                aVar2.getClass();
                List<l20.c> listR = aVar2.r();
                if (!(!(listR != null ? listR.isEmpty() ^ true : false) && z14)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
            for (l20.a aVar3 : arrayList2) {
                String contactId2 = aVar3.getContactId();
                String str3 = contactId2 == null ? "" : contactId2;
                l20.g gVarQ3 = aVar3.q();
                String profileImageUrlSmall2 = gVarQ3 != null ? gVarQ3.getProfileImageUrlSmall() : null;
                String firstName2 = aVar3.getFirstName();
                if (firstName2 == null) {
                    firstName2 = "";
                }
                String lastName2 = aVar3.getLastName();
                if (lastName2 == null) {
                    lastName2 = "";
                }
                String string2 = w.i0(firstName2 + StringUtils.SPACE + lastName2).toString();
                l20.g gVarQ4 = aVar3.q();
                String location2 = gVarQ4 != null ? gVarQ4.getLocation() : null;
                String str4 = location2 == null ? "" : location2;
                boolean z15 = ge1.b.Q(aVar3) && aVar3.d();
                arrayList3.add(new f20.o(0L, str3, profileImageUrlSmall2, string2, str4, true, ge1.b.Q(aVar3), 0, s.g(aVar3.getIsLiveTrackDefault(), Boolean.TRUE), false, ge1.b.Q(aVar3), aVar3.D(), !s.g(aVar3.getIsSosDefault(), Boolean.FALSE) ? aVar3.d() : aVar3.C(e0Var2), aVar3.getLocalId(), z15, 641, null));
            }
            list3 = arrayList3;
        }
        if (list3 == null) {
            list3 = j0.f134944a;
        }
        y0Var.m(new b(false, false, null, list3, null, 0, 0, false, false, false, false, false, false, null, false, false, false, null, null, 524279, null));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "US_COUNTRY_CODE_PREFIX", "PLUS_CODE_PREFIX", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B×\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/contacts/d$b;", "", "", "maxPhonesReached", "noContactInfo", "", "Lf20/o;", "phoneContactListItems", "connectContactListItems", "changedContact", "", "addedCount", "totalCount", "enableSaveButton", "showNotFoundInSearch", "showContactsReadPermission", "showConnectContactEmpty", "showConnectPhoneEmpty", "performClickEvent", "Ll20/a;", "contactDTO", "createNewContact", "closeContactList", "contactUpdated", "", "deviceNames", "Ll20/r;", "userContactDTO", "<init>", "(ZZLjava/util/List;Ljava/util/List;Lf20/o;IIZZZZZZLl20/a;ZZZLjava/lang/String;Ll20/r;)V", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f32404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f32405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<f20.o> f32406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<f20.o> f32407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f20.o f32408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f32409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f32410g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f32411h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f32412i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f32413j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f32414k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f32415l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f32416m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final l20.a f32417n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f32418o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f32419p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f32420q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final String f32421r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final r f32422s;

        public b(boolean z14, boolean z15, List list, List list2, f20.o oVar, int i14, int i15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, l20.a aVar, boolean z26, boolean z27, boolean z28, String str, r rVar, int i16, j jVar) {
            this((i16 & 1) != 0 ? false : z14, (i16 & 2) != 0 ? false : z15, (i16 & 4) != 0 ? j0.f134944a : list, (i16 & 8) != 0 ? j0.f134944a : list2, (i16 & 16) != 0 ? null : oVar, (i16 & 32) != 0 ? 0 : i14, (i16 & 64) != 0 ? 0 : i15, (i16 & 128) != 0 ? false : z16, (i16 & 256) != 0 ? false : z17, (i16 & 512) != 0 ? false : z18, (i16 & 1024) != 0 ? false : z19, (i16 & 2048) != 0 ? false : z24, (i16 & 4096) != 0 ? false : z25, (i16 & 8192) != 0 ? null : aVar, (i16 & 16384) != 0 ? false : z26, (i16 & 32768) != 0 ? false : z27, (i16 & 65536) != 0 ? false : z28, (i16 & 131072) != 0 ? "" : str, (i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : rVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f32404a == bVar.f32404a && this.f32405b == bVar.f32405b && s.g(this.f32406c, bVar.f32406c) && s.g(this.f32407d, bVar.f32407d) && s.g(this.f32408e, bVar.f32408e) && this.f32409f == bVar.f32409f && this.f32410g == bVar.f32410g && this.f32411h == bVar.f32411h && this.f32412i == bVar.f32412i && this.f32413j == bVar.f32413j && this.f32414k == bVar.f32414k && this.f32415l == bVar.f32415l && this.f32416m == bVar.f32416m && s.g(this.f32417n, bVar.f32417n) && this.f32418o == bVar.f32418o && this.f32419p == bVar.f32419p && this.f32420q == bVar.f32420q && s.g(this.f32421r, bVar.f32421r) && s.g(this.f32422s, bVar.f32422s);
        }

        public final int hashCode() {
            int iB = u0.b(u0.b(q6.f.g(Boolean.hashCode(this.f32404a) * 31, 31, this.f32405b), 31, this.f32406c), 31, this.f32407d);
            f20.o oVar = this.f32408e;
            int iG = q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q2.d(this.f32410g, q2.d(this.f32409f, (iB + (oVar == null ? 0 : oVar.hashCode())) * 31, 31), 31), 31, this.f32411h), 31, this.f32412i), 31, this.f32413j), 31, this.f32414k), 31, this.f32415l), 31, this.f32416m);
            l20.a aVar = this.f32417n;
            int iJ = wr.g.j(q6.f.g(q6.f.g(q6.f.g((iG + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f32418o), 31, this.f32419p), 31, this.f32420q), 31, this.f32421r);
            r rVar = this.f32422s;
            return iJ + (rVar != null ? rVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("UIState(maxPhonesReached=", ", noContactInfo=", ", phoneContactListItems=", this.f32404a, this.f32405b);
            n23.j.z(sbM, this.f32406c, ", connectContactListItems=", this.f32407d, ", changedContact=");
            sbM.append(this.f32408e);
            sbM.append(", addedCount=");
            sbM.append(this.f32409f);
            sbM.append(", totalCount=");
            fb1.c.x(sbM, this.f32410g, ", enableSaveButton=", this.f32411h, ", showNotFoundInSearch=");
            kg.f.q(", showContactsReadPermission=", ", showConnectContactEmpty=", sbM, this.f32412i, this.f32413j);
            kg.f.q(", showConnectPhoneEmpty=", ", performClickEvent=", sbM, this.f32414k, this.f32415l);
            sbM.append(this.f32416m);
            sbM.append(", contactDTO=");
            sbM.append(this.f32417n);
            sbM.append(", createNewContact=");
            kg.f.q(", closeContactList=", ", contactUpdated=", sbM, this.f32418o, this.f32419p);
            fb1.c.w(", deviceNames=", this.f32421r, ", userContactDTO=", sbM, this.f32420q);
            sbM.append(this.f32422s);
            sbM.append(")");
            return sbM.toString();
        }

        public b() {
            this(false, false, null, null, null, 0, 0, false, false, false, false, false, false, null, false, false, false, null, null, 524287, null);
        }

        public b(boolean z14, boolean z15, List<f20.o> list, List<f20.o> list2, f20.o oVar, int i14, int i15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, l20.a aVar, boolean z26, boolean z27, boolean z28, String str, r rVar) {
            list.getClass();
            list2.getClass();
            str.getClass();
            this.f32404a = z14;
            this.f32405b = z15;
            this.f32406c = list;
            this.f32407d = list2;
            this.f32408e = oVar;
            this.f32409f = i14;
            this.f32410g = i15;
            this.f32411h = z16;
            this.f32412i = z17;
            this.f32413j = z18;
            this.f32414k = z19;
            this.f32415l = z24;
            this.f32416m = z25;
            this.f32417n = aVar;
            this.f32418o = z26;
            this.f32419p = z27;
            this.f32420q = z28;
            this.f32421r = str;
            this.f32422s = rVar;
        }
    }
}

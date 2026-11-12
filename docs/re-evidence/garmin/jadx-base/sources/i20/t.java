package i20;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import f20.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m20.z;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Li20/t;", "Landroidx/lifecycle/u1;", "Lm20/z;", "contactsRepo", "Lre0/o;", "managedAccountRepo", "Lhl/a;", "screenAccessRole", "<init>", "(Lm20/z;Lre0/o;Lhl/a;)V", "a", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f87201l = {s0.f105811a.f(new b0(t.class, "wasEmergencyContact", "getWasEmergencyContact()Z", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f87202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re0.o f87203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hl.a f87204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l20.a f87205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l20.a f87206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g23.b f87207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f87208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<g3<l20.a>> f87209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0 f87210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<g3<l20.a>> f87211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0 f87212k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.edit.EditContactViewModel$saveContact$1", f = "EditContactViewModel.kt", l = {192}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87213a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l20.a f87215c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ll20/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.edit.EditContactViewModel$saveContact$1$result$1", f = "EditContactViewModel.kt", l = {196, 198, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends l20.a>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f87216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f87217b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l20.a f87218c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar, l20.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f87217b = tVar;
                this.f87218c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f87217b, this.f87218c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends l20.a>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            
                if (r0 == r6) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
            
                if (r0 == r6) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
            
                if (r0 == r6) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
            
                if (r0 == r6) goto L43;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objQ;
                Object objH;
                Object objH2;
                Object objF;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f87216a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        objF = obj;
                        return (v2) objF;
                    }
                    if (i14 == 2) {
                        o13.r.b(obj);
                        objH2 = obj;
                        return (v2) objH2;
                    }
                    if (i14 == 3) {
                        o13.r.b(obj);
                        objH = obj;
                        return (v2) objH;
                    }
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                    objQ = obj;
                    return (v2) objQ;
                }
                o13.r.b(obj);
                t tVar = this.f87217b;
                hl.a aVar2 = tVar.f87204c;
                hl.a aVar3 = tVar.f87204c;
                boolean zG = p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b);
                l20.a aVar4 = this.f87218c;
                if (zG) {
                    String contactId = tVar.f87206e.getContactId();
                    z zVar = tVar.f87202a;
                    if (contactId == null) {
                        this.f87216a = 1;
                        objF = zVar.f(aVar4, this);
                    } else {
                        this.f87216a = 2;
                        objH2 = zVar.h(aVar4, this);
                    }
                } else {
                    if (!(aVar2 instanceof hl.a.b)) {
                        u0.r();
                        return null;
                    }
                    String contactId2 = tVar.f87206e.getContactId();
                    re0.o oVar = tVar.f87203b;
                    if (contactId2 == null) {
                        long j8 = ((hl.a.b) aVar3).f84252b;
                        this.f87216a = 3;
                        objH = oVar.h(j8, aVar4, this);
                    } else {
                        long j14 = ((hl.a.b) aVar3).f84252b;
                        String contactId3 = aVar4.getContactId();
                        if (contactId3 == null) {
                            contactId3 = "";
                        }
                        this.f87216a = 4;
                        objQ = oVar.q(j14, contactId3, this.f87218c, this);
                    }
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l20.a aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f87215c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return t.this.new b(this.f87215c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87213a;
            t tVar = t.this;
            if (i14 == 0) {
                o13.r.b(obj);
                tVar.f87209h.j(g3.a.c(g3.f35298f));
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a aVar2 = new a(tVar, this.f87215c, null);
                this.f87213a = 1;
                obj = ge1.b.e0(bVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                t.x4(tVar);
                u62.z.h(g3.f35298f, ((v2.b) v2Var).f47386a, tVar.f87209h);
            } else {
                tVar.f87209h.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public t(z zVar, re0.o oVar, hl.a aVar) {
        zVar.getClass();
        oVar.getClass();
        aVar.getClass();
        this.f87202a = zVar;
        this.f87203b = oVar;
        this.f87204c = aVar;
        this.f87205d = new l20.a(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        this.f87206e = new l20.a(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        g23.a.f75578a.getClass();
        this.f87207f = new g23.b();
        y0<g3<l20.a>> y0Var = new y0<>();
        this.f87209h = y0Var;
        this.f87210i = y0Var;
        y0<g3<l20.a>> y0Var2 = new y0<>(g3.a.c(g3.f35298f));
        this.f87211j = y0Var2;
        this.f87212k = y0Var2;
    }

    public static final void x4(t tVar) {
        tVar.getClass();
        f20.z zVar = (f20.z) KoinJavaComponent.get$default(f20.z.class, null, null, 6, null);
        if (ge1.b.Q(tVar.f87206e) || ((Boolean) tVar.f87207f.getValue(tVar, f87201l[0])).booleanValue()) {
            zVar.a();
        }
        zVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0202  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f0  */
    public final void y4() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z14;
        Boolean boolValueOf;
        l20.c cVar;
        Iterator it;
        Object next;
        Object next2;
        List<l20.c> listZ = this.f87206e.z();
        if (listZ != null) {
            ArrayList<l20.c> arrayList3 = new ArrayList();
            for (Object obj : listZ) {
                String str = ((l20.c) obj).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                if (str != null && (!d53.w.J(str))) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
            for (l20.c cVarB : arrayList3) {
                if (cVarB.getContactInfoPk() == null) {
                    cVarB = l20.c.b(cVarB, null, null, Integer.valueOf(l20.m.NONE.f109026a), null, null, null, null, null, com.garmin.android.apps.connectmobile.contacts.model.a.UNCONFIRMED, Boolean.FALSE, 0, 974839);
                    break;
                }
                List<l20.c> listK = this.f87205d.k();
                if (listK == null || !listK.isEmpty()) {
                    for (l20.c cVar2 : listK) {
                        if (p005kotlin.jvm.internal.s.g(cVarB.getContactInfoPk(), cVar2.getContactInfoPk()) && !p005kotlin.jvm.internal.s.g(cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String())) {
                            cVarB = l20.c.b(cVarB, null, null, Integer.valueOf(l20.m.NONE.f109026a), null, null, null, null, null, com.garmin.android.apps.connectmobile.contacts.model.a.UNCONFIRMED, Boolean.FALSE, 0, 974839);
                            break;
                            break;
                        }
                    }
                }
                arrayList4.add(cVarB);
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        List<l20.c> listR = this.f87206e.r();
        if (listR != null) {
            ArrayList<l20.c> arrayList5 = new ArrayList();
            for (Object obj2 : listR) {
                if (nb2.a.a(((l20.c) obj2).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String())) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(p13.y.r(arrayList5, 10));
            for (l20.c cVarB2 : arrayList5) {
                if (cVarB2.getContactInfoPk() == null) {
                    cVarB2 = l20.c.b(cVarB2, null, null, Integer.valueOf(l20.m.NONE.f109026a), null, null, null, null, null, com.garmin.android.apps.connectmobile.contacts.model.a.UNCONFIRMED, Boolean.FALSE, 0, 974839);
                    break;
                }
                List<l20.c> listK2 = this.f87205d.k();
                if (listK2 == null || !listK2.isEmpty()) {
                    for (l20.c cVar3 : listK2) {
                        if (p005kotlin.jvm.internal.s.g(cVarB2.getContactInfoPk(), cVar3.getContactInfoPk()) && !p005kotlin.jvm.internal.s.g(cVarB2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String())) {
                            cVarB2 = l20.c.b(cVarB2, null, null, Integer.valueOf(l20.m.NONE.f109026a), null, null, null, null, null, com.garmin.android.apps.connectmobile.contacts.model.a.UNCONFIRMED, Boolean.FALSE, 0, 974839);
                            break;
                        }
                    }
                }
                arrayList6.add(cVarB2);
            }
            arrayList2 = arrayList6;
        } else {
            arrayList2 = null;
        }
        String contactId = this.f87206e.getContactId();
        String firstName = this.f87206e.getFirstName();
        String lastName = this.f87206e.getLastName();
        boolean zG = p005kotlin.jvm.internal.s.g(this.f87206e.getIsSosDefault(), Boolean.TRUE);
        l20.a aVar = this.f87206e;
        if (zG) {
            List<l20.c> listK3 = aVar.k();
            if (listK3 != null && listK3.isEmpty()) {
                z14 = false;
                break;
            }
            Iterator<T> it3 = listK3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((l20.c) it3.next()).C()) {
                        z14 = true;
                        break;
                    }
                } else {
                    z14 = false;
                    break;
                }
            }
            boolValueOf = Boolean.valueOf(z14);
        } else {
            boolValueOf = aVar.getIsSosDefault();
        }
        Boolean bool = boolValueOf;
        Boolean isEmsContact = this.f87206e.getIsEmsContact();
        if (arrayList2 != null) {
            Iterator it4 = arrayList2.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!((l20.c) next2).g0());
            cVar = (l20.c) next2;
            if (cVar == null) {
                if (arrayList != null) {
                    it = arrayList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((l20.c) next).g0());
                    cVar = (l20.c) next;
                } else {
                    cVar = null;
                }
            }
        } else if (arrayList != null) {
            it = arrayList.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((l20.c) next).g0());
            cVar = (l20.c) next;
        } else {
            cVar = null;
        }
        ge1.b.T(v1.a(this), null, null, new b(new l20.a(contactId, firstName, lastName, bool, Boolean.valueOf(cVar != null), null, arrayList2, arrayList, null, null, null, isEmsContact, null, 5920, null), null), 3);
    }

    public final void z4(l20.a aVar, e0 e0Var) {
        aVar.getClass();
        this.f87206e = aVar;
        this.f87205d = aVar;
        boolean zQ = ge1.b.Q(aVar);
        this.f87207f.setValue(this, f87201l[0], Boolean.valueOf(zQ));
        this.f87208g = e0Var;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li20/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_CONTACT_INFO_LIMIT", "I", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

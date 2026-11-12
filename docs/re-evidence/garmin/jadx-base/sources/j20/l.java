package j20;

import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import gg1.v0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lc.u0;
import m20.q0;
import m20.r0;
import m20.s0;
import m20.t0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$initializeAndGetMessageForContactMethod$1", f = "EmergencyContactViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f96574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.d f96575b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$initializeAndGetMessageForContactMethod$1$1", f = "EmergencyContactViewModel.kt", l = {452, 455, 456, 466, 482}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v2.b f96576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f96577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f96578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.d f96579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Long f96580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f96581f;

        /* JADX INFO: renamed from: j20.l$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1844a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f96582a;

            static {
                int[] iArr = new int[l20.l.values().length];
                try {
                    iArr[l20.l.EMERGENCY_CONTACT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l20.l.LIVETRACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f96582a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.contacts.emergency.d dVar, Long l14, String str, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f96579d = dVar;
            this.f96580e = l14;
            this.f96581f = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f96579d, this.f96580e, this.f96581f, dVar);
            aVar.f96578c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x010b  */
        /* JADX WARN: Code duplicated, block: B:53:0x01bd  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
        
            if (r0 == r7) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
        
            if (r0 == r7) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c2, code lost:
        
            if (r0 == r7) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0175, code lost:
        
            if (r1 == r7) goto L48;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objV;
            Object objA;
            Object objA2;
            v2 v2Var;
            Object objC;
            v2 v2Var2;
            Object objJ;
            b0 b0Var = (b0) this.f96578c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f96577b;
            String str = this.f96581f;
            com.garmin.android.apps.connectmobile.contacts.emergency.d dVar = this.f96579d;
            if (i14 == 0) {
                o13.r.b(obj);
                y0<g3<String>> y0Var = dVar.f32664y;
                hl.a aVar2 = dVar.f32645d;
                y0Var.j(g3.a.c(g3.f35298f));
                boolean zG = p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b);
                Long l14 = this.f96580e;
                if (zG) {
                    m20.z zVar = dVar.T;
                    long jLongValue = l14.longValue();
                    this.f96578c = b0Var;
                    this.f96577b = 1;
                    objA2 = zVar.f116058d.a(jLongValue, this);
                } else {
                    if (!(aVar2 instanceof hl.a.b)) {
                        u0.r();
                        return null;
                    }
                    int i15 = C1844a.f96582a[dVar.f32659r.ordinal()];
                    if (i15 == 1) {
                        re0.o oVar = dVar.X;
                        long j8 = ((hl.a.b) aVar2).f84252b;
                        long jLongValue2 = l14.longValue();
                        this.f96578c = b0Var;
                        this.f96577b = 2;
                        objV = oVar.v(j8, jLongValue2, this);
                    } else {
                        if (i15 != 2) {
                            u0.r();
                            return null;
                        }
                        re0.o oVar2 = dVar.X;
                        long j14 = ((hl.a.b) aVar2).f84252b;
                        long jLongValue3 = l14.longValue();
                        this.f96578c = b0Var;
                        this.f96577b = 3;
                        objA = oVar2.a(j14, jLongValue3, this);
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objA2 = obj;
                v2Var = (v2) objA2;
            } else if (i14 == 2) {
                o13.r.b(obj);
                objV = obj;
                v2Var = (v2) objV;
            } else if (i14 == 3) {
                o13.r.b(obj);
                objA = obj;
                v2Var = (v2) objA;
            } else {
                if (i14 == 4) {
                    o13.r.b(obj);
                    objC = obj;
                    v2Var2 = (v2) objC;
                    if (v2Var2 instanceof v2.b) {
                        v2.b bVar = (v2.b) v2Var2;
                        dVar.f32656o = ((m20.d) bVar.f47386a).getUrl();
                        a2 a2Var = a2.SAFETY_FEATURES;
                        String strM = am.j.m("Got message for SMS number ", str, ". Now retrieving short link.");
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "EmergencyContactViewModel", strM);
                        String str2 = dVar.f32656o;
                        v0.T.getClass();
                        t0 t0Var = new t0(str2, v0.a.b().B, null, null, 12, null);
                        r0.f116017b.getClass();
                        r0 r0Var = new r0((q0) ez0.b.a(ez0.b.f67468a, ez0.c.SHORT_LINK, q0.class, new c83.h.a[0], null, null, null, 120));
                        this.f96578c = b0Var;
                        this.f96576a = bVar;
                        this.f96577b = 5;
                        objJ = f0.J(r0Var, new s0(r0Var, t0Var, null), this);
                    } else {
                        a2 a2Var2 = a2.SAFETY_FEATURES;
                        String strF = b71.i.f("Unable to get message! getContactConsentMessage result is ", v2Var2);
                        i2.f36769a.getClass();
                        i2.a.f(a2Var2, "EmergencyContactViewModel", strF);
                        dVar.f32664y.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    }
                    return Unit.INSTANCE;
                }
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var2 = this.f96576a;
                o13.r.b(obj);
                objJ = obj;
            }
            v2 v2Var3 = (v2) objJ;
            if (v2Var3 instanceof v2.b) {
                String shortURL = ((m20.u0) ((v2.b) v2Var3).f47386a).getShortURL();
                dVar.f32656o = shortURL;
                a2 a2Var3 = a2.SAFETY_FEATURES;
                String strM2 = am.j.m("Got short link: ", shortURL, ".");
                i2.f36769a.getClass();
                i2.a.b(a2Var3, "EmergencyContactViewModel", strM2);
            }
            String strG = tn.k.g(((m20.d) ((v2.b) v2Var2).f47386a).getMessageContent(), dVar.f32656o);
            dVar.f32657p = strG;
            y0<g3<String>> y0Var2 = dVar.f32664y;
            g3.f35298f.getClass();
            y0Var2.j(g3.a.d(strG));
            return Unit.INSTANCE;
            if (v2Var instanceof v2.b) {
                tj1.r rVar = (tj1.r) ((v2.b) v2Var).f47386a;
                dVar.f32655n = rVar.getToken();
                if (!dVar.f32658q) {
                    m20.z zVar2 = dVar.T;
                    Object value = dVar.f32654m.getValue();
                    value.getClass();
                    m20.b bVar2 = new m20.b(hb2.h.d((Locale) value), rVar.getToken());
                    hl.a aVar3 = dVar.f32645d;
                    this.f96578c = b0Var;
                    this.f96577b = 4;
                    objC = zVar2.f116058d.c(bVar2, aVar3, this);
                    if (objC != aVar) {
                        v2Var2 = (v2) objC;
                        if (v2Var2 instanceof v2.b) {
                            v2.b bVar3 = (v2.b) v2Var2;
                            dVar.f32656o = ((m20.d) bVar3.f47386a).getUrl();
                            a2 a2Var4 = a2.SAFETY_FEATURES;
                            String strM3 = am.j.m("Got message for SMS number ", str, ". Now retrieving short link.");
                            i2.f36769a.getClass();
                            i2.a.b(a2Var4, "EmergencyContactViewModel", strM3);
                            String str3 = dVar.f32656o;
                            v0.T.getClass();
                            t0 t0Var2 = new t0(str3, v0.a.b().B, null, null, 12, null);
                            r0.f116017b.getClass();
                            r0 r0Var2 = new r0((q0) ez0.b.a(ez0.b.f67468a, ez0.c.SHORT_LINK, q0.class, new c83.h.a[0], null, null, null, 120));
                            this.f96578c = b0Var;
                            this.f96576a = bVar3;
                            this.f96577b = 5;
                            objJ = f0.J(r0Var2, new s0(r0Var2, t0Var2, null), this);
                        } else {
                            a2 a2Var5 = a2.SAFETY_FEATURES;
                            String strF2 = b71.i.f("Unable to get message! getContactConsentMessage result is ", v2Var2);
                            i2.f36769a.getClass();
                            i2.a.f(a2Var5, "EmergencyContactViewModel", strF2);
                            dVar.f32664y.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        }
                    }
                    return aVar;
                }
                a2 a2Var6 = a2.SAFETY_FEATURES;
                String strM4 = am.j.m("Initialized email ", str, ". No need to get SMS message.");
                i2.f36769a.getClass();
                i2.a.b(a2Var6, "EmergencyContactViewModel", strM4);
                dVar.f32664y.j(g3.a.e(g3.f35298f));
            } else {
                a2 a2Var7 = a2.SAFETY_FEATURES;
                String strF3 = b71.i.f("Unable to initialize emergency contact! initializeEmergencyContact result is ", v2Var);
                i2.f36769a.getClass();
                i2.a.f(a2Var7, "EmergencyContactViewModel", strF3);
                dVar.f32664y.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.garmin.android.apps.connectmobile.contacts.emergency.d dVar, t13.d<? super l> dVar2) {
        super(2, dVar2);
        this.f96575b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f96575b, dVar);
        lVar.f96574a = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:55:0x006f A[SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<l20.c> listR;
        Long l14;
        Iterator<T> it;
        Object next;
        l20.c cVar;
        Object next2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.contacts.emergency.d dVar = this.f96575b;
        l20.c cVar2 = dVar.f32647f;
        if (cVar2 == null) {
            return Unit.INSTANCE;
        }
        String str = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
        List<l20.c> listZ = dVar.f32646e.z();
        if (listZ != null) {
            Iterator<T> it3 = listZ.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!p005kotlin.jvm.internal.s.g(((l20.c) next2).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str));
            l20.c cVar3 = (l20.c) next2;
            if (cVar3 == null || (contactInfoPk = cVar3.getContactInfoPk()) == null) {
                listR = dVar.f32646e.r();
                if (listR != null) {
                    it = listR.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((l20.c) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str));
                    cVar = (l20.c) next;
                    if (cVar != null) {
                        Long contactInfoPk = cVar.getContactInfoPk();
                        l14 = contactInfoPk;
                    }
                }
                l14 = null;
            } else {
                l14 = contactInfoPk;
            }
        } else {
            listR = dVar.f32646e.r();
            if (listR != null) {
                it = listR.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((l20.c) next).getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String(), str));
                cVar = (l20.c) next;
                if (cVar != null) {
                    Long contactInfoPk2 = cVar.getContactInfoPk();
                    l14 = contactInfoPk2;
                }
            }
            l14 = null;
        }
        l20.c cVar4 = dVar.f32647f;
        l20.c cVarB = cVar4 != null ? l20.c.b(cVar4, l14, null, null, null, null, null, null, null, null, null, 0, 1048574) : null;
        dVar.f32647f = cVarB;
        if ((cVarB != null ? cVarB.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String() : null) == null || l14 == null) {
            i2.f36769a.getClass();
            i2.a.f(a2.SAFETY_FEATURES, "EmergencyContactViewModel", "Unable to send SMS! Content = " + str + " && primaryKey = " + l14 + ".");
            dVar.f32664y.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        } else if (dVar.f32655n == null) {
            a2 a2Var = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "EmergencyContactViewModel", "Contact method has content but no initialization token; initializing");
            w9.a aVarA = v1.a(dVar);
            x53.c cVar5 = o53.s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new a(dVar, l14, str, null), 2);
        } else {
            a2 a2Var2 = a2.SAFETY_FEATURES;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "EmergencyContactViewModel", "Contact method has content and initialization token; no need to reinitialize");
        }
        return Unit.INSTANCE;
    }
}

package zo0;

import android.content.Context;
import android.text.format.DateUtils;
import c22.b3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import j31.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r22.m0;
import r22.v0;
import uu.i0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lzo0/d;", "Lzo0/p;", "Lzo0/q;", "navigator", "Lb31/h;", "promptOnboardingRepository", "Lb31/f;", "onboardingChecksRepository", "Lxu/c;", "badgeTranslationsUseCase", "Li31/x;", "ignoreOnboardingPromptUseCase", "Li31/z;", "postponeOnboardingPromptUseCase", "Lf12/b;", "userAccount", "Lf12/l;", "userSettings", "<init>", "(Lzo0/q;Lb31/h;Lb31/f;Lxu/c;Li31/x;Li31/z;Lf12/b;Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f206108j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f206109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.h f206110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b31.f f206111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xu.c f206112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i31.x f206113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i31.z f206114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f12.b f206115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f12.l f206116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m0 f206117i;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f206118a;

        static {
            int[] iArr = new int[d31.d.values().length];
            try {
                iArr[d31.d.PARTNER_CHALLENGE_PROMOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d31.d.LIFESTYLE_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f206118a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.dialogs.AppOnboardingDialogHandler", f = "AppOnboardingDialogHandler.kt", l = {61, 68, 82, 97, 107}, m = "requestDialogData", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f206119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d31.f f206120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d31.d f206121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k31.c f206122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f206123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f206124f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f206126h;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f206124f = obj;
            this.f206126h |= Integer.MIN_VALUE;
            return d.this.c(this);
        }
    }

    static {
        new a(null);
    }

    public d(q qVar, b31.h hVar, b31.f fVar, xu.c cVar, i31.x xVar, i31.z zVar, f12.b bVar, f12.l lVar) {
        qVar.getClass();
        hVar.getClass();
        fVar.getClass();
        cVar.getClass();
        xVar.getClass();
        zVar.getClass();
        bVar.getClass();
        lVar.getClass();
        this.f206109a = qVar;
        this.f206110b = hVar;
        this.f206111c = fVar;
        this.f206112d = cVar;
        this.f206113e = xVar;
        this.f206114f = zVar;
        this.f206115g = bVar;
        this.f206116h = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(d31.f fVar, v13.c cVar) {
        e eVar;
        String str;
        String str2;
        String str3;
        String strN;
        String strN2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f206134f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f206134f = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f206132d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f206134f;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVarB = null;
        if (i15 == 0) {
            o13.r.b(obj);
            d31.e eVar2 = fVar.f57386d;
            String str4 = eVar2 != null ? eVar2.f57378a : null;
            Integer num = eVar2 != null ? eVar2.f57381d : null;
            Integer num2 = eVar2 != null ? eVar2.f57382e : null;
            Long l14 = eVar2 != null ? eVar2.f57379b : null;
            String str5 = eVar2 != null ? eVar2.f57380c : null;
            if (str4 == null || num == null) {
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.f(a2Var, "AppOnboardingDialogHandler", "requestDialogData: missing partner reward metadata");
                return null;
            }
            String strA = i0.a(num, num2, l14);
            String strA2 = b3.a();
            eVar.f206129a = str4;
            eVar.f206130b = str5;
            eVar.f206131c = strA;
            eVar.f206134f = 1;
            Object objA = this.f206112d.a(strA2, "", eVar);
            if (objA == aVar) {
                return aVar;
            }
            str = str5;
            str2 = str4;
            obj = objA;
            str3 = strA;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str6 = eVar.f206131c;
            String str7 = eVar.f206130b;
            String str8 = eVar.f206129a;
            o13.r.b(obj);
            str3 = str6;
            str2 = str8;
            str = str7;
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            a2 a2Var2 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "AppOnboardingDialogHandler", "Get badge translations for PARTNER_CHALLENGE_PROMOTE was successful.");
            gVarB = ((com.garmin.android.apps.connectmobile.badges.service.model.i) ((v2.b) v2Var).f47386a).b(str2);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var3 = a2.ONBOARDING;
            String strG = androidx.room.a0.g(((v2.a) v2Var).f47384b, "Get badge translations for PARTNER_CHALLENGE_PROMOTE failed with response code ");
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "AppOnboardingDialogHandler", strG);
        }
        if (gVarB == null || (strN = gVarB.f30568a) == null) {
            strN = fb1.c.n("Title_", str2);
        }
        String str9 = strN;
        if (gVarB == null || (strN2 = gVarB.f30571d) == null) {
            strN2 = fb1.c.n("Description_", str2);
        }
        return new n.l(str2, str, str9, strN2, str3);
    }

    @Override // zo0.p
    public final v0 b(n nVar) {
        d31.d dVar;
        m0 m0VarD;
        Context context = this.f206109a.getContext();
        boolean z14 = nVar instanceof n.b;
        if (z14) {
            dVar = ((n.b) nVar).f206172a.f102645a;
        } else {
            if (!(nVar instanceof n.l)) {
                return null;
            }
            dVar = d31.d.PARTNER_CHALLENGE_PROMOTE;
        }
        d31.d dVar2 = dVar;
        ty0.a aVar = new ty0.a(dVar2, 13, context, this);
        ew2.c cVar = new ew2.c(dVar2, this, nVar, context, 26);
        if (z14) {
            l22.a aVar2 = new l22.a(context);
            k31.c cVar2 = ((n.b) nVar).f206172a;
            String strC = cVar2.c(aVar2);
            String strB = cVar2.b(aVar2, new Object[0]);
            int i14 = cVar2.f102654j;
            int i15 = cVar2.f102660p;
            int i16 = b.f206118a[cVar2.f102645a.ordinal()] == 2 ? R.drawable.lifestyle_logging_large : 0;
            if (i15 != 0) {
                m0VarD = m0.a.e(m0.f149759e, cVar2.f102660p, strC, strB, i14, aVar, R.string.not_now_lbl, cVar, 128);
            } else {
                m0VarD = i16 != 0 ? m0.a.d(m0.f149759e, i16, strC, strB, i14, aVar, R.string.not_now_lbl, cVar, null, 1920) : m0.a.c(m0.f149759e, strC, strB, i14, aVar, R.string.not_now_lbl, cVar, 192);
            }
            this.f206117i = m0VarD;
            return m0VarD;
        }
        if (!(nVar instanceof n.l)) {
            return null;
        }
        n.l lVar = (n.l) nVar;
        this.f206111c.o(lVar.f206184a);
        m0.a aVar3 = m0.f149759e;
        String str = lVar.f206188e;
        String str2 = lVar.f206186c;
        String str3 = lVar.f206187d;
        ty0.a aVar4 = new ty0.a(dVar2, 14, context, nVar);
        xp0.d dVar3 = new xp0.d(dVar2, 24);
        aVar3.getClass();
        return m0.a.a(aVar3, -1, str, false, str2, null, str3, R.string.challenges_card_footer_text, aVar4, R.string.not_now_lbl, dVar3, false, 17, false, "cache_availability_today", false, 32);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x016f A[EDGE_INSN: B:101:0x016f->B:60:0x016f BREAK  A[LOOP:0: B:52:0x0123->B:103:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[PHI: r1 r6
      0x0068: PHI (r1v16 java.lang.Object) = (r1v13 java.lang.Object), (r1v1 java.lang.Object) binds: [B:49:0x0119, B:22:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0068: PHI (r6v4 long) = (r6v2 long), (r6v13 long) binds: [B:49:0x0119, B:22:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x0181  */
    /* JADX WARN: Code duplicated, block: B:66:0x019a  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01db  */
    /* JADX WARN: Code duplicated, block: B:77:0x01de  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0205  */
    /* JADX WARN: Code duplicated, block: B:87:0x021d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x025e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0275  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fc, code lost:
    
        if (r1 == r2) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ce, code lost:
    
        if (r1.c(0, r8) == r2) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026f, code lost:
    
        if (r1 == r2) goto L94;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:54:0x0129, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0181, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x019a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x021d, please report this as an issue */
    @Override // zo0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t13.d<? super n> dVar) {
        c cVar;
        long jP;
        Object objD;
        long j8;
        Iterator it;
        Object next;
        d31.f fVar;
        d31.d dVar2;
        k31.c cVarA;
        z0 z0VarA;
        int i14;
        b63.o oVarB;
        b63.u uVar;
        e31.a[] aVarArr;
        long userProfilePk;
        d31.c cVar2;
        d31.e eVar;
        String str;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i15 = cVar.f206126h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar.f206126h = i15 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        c cVar3 = cVar;
        Object objA = cVar3.f206124f;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = cVar3.f206126h;
        b31.h hVar = this.f206110b;
        b31.f fVar2 = this.f206111c;
        if (i16 == 0) {
            o13.r.b(objA);
            if (this.f206116h.p2()) {
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "AppOnboardingDialogHandler", "requestDialogData: Developer has disabled onboarding prompts.");
                return null;
            }
            jP = fVar2.p();
            if (DateUtils.isToday(jP)) {
                d31.c cVar4 = d31.c.NOT_STARTED;
                cVar3.f206120b = null;
                cVar3.f206119a = jP;
                cVar3.f206126h = 2;
                objA = hVar.a(cVar4, cVar3);
                if (objA != obj) {
                    j8 = jP;
                    it = ((Iterable) objA).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        d31.f fVar3 = (d31.f) next;
                        i2.f36769a.getClass();
                        i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: Found onboarding item  " + fVar3);
                        b63.l lVarA = b63.a.C0229a.f16171a.a();
                        b63.z.INSTANCE.getClass();
                        oVarB = b63.b.d(lVarA, b63.z.Companion.a()).b();
                        uVar = fVar3.f57385c;
                        if (uVar == null) {
                            break;
                            break;
                        }
                    } while (uVar.b().compareTo(oVarB) > 0);
                    fVar = (d31.f) next;
                    if (fVar != null) {
                        dVar2 = fVar.f57383a;
                        k31.c.f102631r.getClass();
                        cVarA = k31.c.a.a(dVar2, null);
                        if (cVarA == null) {
                            i2.f36769a.getClass();
                            i2.a.f(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: Unsupported onboarding item type: " + dVar2);
                            return null;
                        }
                        i2.f36769a.getClass();
                        i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: Refreshing onboarding state for item: " + dVar2);
                        z0VarA = h31.d.a(dVar2);
                        if (z0VarA != null) {
                            cVar3.f206120b = fVar;
                            cVar3.f206121c = dVar2;
                            cVar3.f206122d = cVarA;
                            cVar3.f206119a = j8;
                            cVar3.f206123e = 0;
                            cVar3.f206126h = 3;
                            int i17 = z0.f96953a;
                        }
                        i14 = 0;
                        if (dVar2 == d31.d.PARTNER_CHALLENGE_PROMOTE) {
                            eVar = fVar.f57386d;
                            if (eVar != null) {
                                str = eVar.f57378a;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                a2 a2Var2 = a2.ONBOARDING;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var2, "AppOnboardingDialogHandler", "requestDialogData: missing partner reward metadata");
                                return null;
                            }
                            if (fVar2.m(str)) {
                                a2 a2Var3 = a2.ONBOARDING;
                                String strConcat = "requestDialogData: Partner challenge onboarding prompt already completed for badgeKey ".concat(str);
                                i2.f36769a.getClass();
                                i2.a.b(a2Var3, "AppOnboardingDialogHandler", strConcat);
                                return null;
                            }
                        } else {
                            aVarArr = (e31.a[]) cVarA.f102647c.toArray(new e31.a[0]);
                            if (fVar2.e((e31.a[]) Arrays.copyOf(aVarArr, aVarArr.length))) {
                                i2.f36769a.getClass();
                                i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: All checks completed for onboarding item " + dVar2);
                                userProfilePk = this.f206115g.getUserProfilePk();
                                cVar2 = d31.c.COMPLETED;
                                cVar3.f206120b = null;
                                cVar3.f206121c = null;
                                cVar3.f206122d = null;
                                cVar3.f206119a = j8;
                                cVar3.f206123e = i14;
                                cVar3.f206126h = 4;
                                if (hVar.b(userProfilePk, dVar2, cVar2, cVar3) != obj) {
                                }
                            }
                        }
                        if (b.f206118a[dVar2.ordinal()] == 1) {
                            return new n.b(cVarA);
                        }
                        cVar3.f206120b = null;
                        cVar3.f206121c = null;
                        cVar3.f206122d = null;
                        cVar3.f206119a = j8;
                        cVar3.f206123e = i14;
                        cVar3.f206126h = 5;
                        objA = a(fVar, cVar3);
                    }
                    return null;
                }
            } else {
                a2 a2Var4 = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "AppOnboardingDialogHandler", "requestDialogData: Fetching onboarding prompt items from server.");
                w13.c cVar5 = k31.c.f102642x1;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : cVar5) {
                    if (((k31.c) obj2).f102646b == d31.b.APP) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((k31.c) it3.next()).f102645a);
                }
                ArrayList arrayListY0 = h0.y0(arrayList2, d31.d.MENSTRUAL_CYCLE_TRACKING);
                cVar3.f206120b = null;
                cVar3.f206119a = jP;
                cVar3.f206126h = 1;
                objD = hVar.d(arrayListY0, cVar3);
            }
            return obj;
        }
        if (i16 == 1) {
            jP = cVar3.f206119a;
            o13.r.b(objA);
            objD = ((o13.q) objA).f128597a;
        } else {
            if (i16 == 2) {
                jP = cVar3.f206119a;
                o13.r.b(objA);
                j8 = jP;
                it = ((Iterable) objA).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    d31.f fVar4 = (d31.f) next;
                    i2.f36769a.getClass();
                    i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: Found onboarding item  " + fVar4);
                    b63.l lVarA2 = b63.a.C0229a.f16171a.a();
                    b63.z.INSTANCE.getClass();
                    oVarB = b63.b.d(lVarA2, b63.z.Companion.a()).b();
                    uVar = fVar4.f57385c;
                    if (uVar == null) {
                        break;
                    }
                } while (uVar.b().compareTo(oVarB) > 0);
                fVar = (d31.f) next;
                if (fVar != null) {
                    dVar2 = fVar.f57383a;
                    k31.c.f102631r.getClass();
                    cVarA = k31.c.a.a(dVar2, null);
                    if (cVarA == null) {
                        i2.f36769a.getClass();
                        i2.a.f(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: Unsupported onboarding item type: " + dVar2);
                        return null;
                    }
                    i2.f36769a.getClass();
                    i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: Refreshing onboarding state for item: " + dVar2);
                    z0VarA = h31.d.a(dVar2);
                    if (z0VarA != null) {
                        cVar3.f206120b = fVar;
                        cVar3.f206121c = dVar2;
                        cVar3.f206122d = cVarA;
                        cVar3.f206119a = j8;
                        cVar3.f206123e = 0;
                        cVar3.f206126h = 3;
                        int i18 = z0.f96953a;
                    }
                    i14 = 0;
                    if (dVar2 == d31.d.PARTNER_CHALLENGE_PROMOTE) {
                        aVarArr = (e31.a[]) cVarA.f102647c.toArray(new e31.a[0]);
                        if (fVar2.e((e31.a[]) Arrays.copyOf(aVarArr, aVarArr.length))) {
                            i2.f36769a.getClass();
                            i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: All checks completed for onboarding item " + dVar2);
                            userProfilePk = this.f206115g.getUserProfilePk();
                            cVar2 = d31.c.COMPLETED;
                            cVar3.f206120b = null;
                            cVar3.f206121c = null;
                            cVar3.f206122d = null;
                            cVar3.f206119a = j8;
                            cVar3.f206123e = i14;
                            cVar3.f206126h = 4;
                            if (hVar.b(userProfilePk, dVar2, cVar2, cVar3) != obj) {
                            }
                        }
                        return obj;
                    }
                    eVar = fVar.f57386d;
                    if (eVar != null) {
                        str = eVar.f57378a;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        a2 a2Var5 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var5, "AppOnboardingDialogHandler", "requestDialogData: missing partner reward metadata");
                        return null;
                    }
                    if (fVar2.m(str)) {
                        a2 a2Var6 = a2.ONBOARDING;
                        String strConcat2 = "requestDialogData: Partner challenge onboarding prompt already completed for badgeKey ".concat(str);
                        i2.f36769a.getClass();
                        i2.a.b(a2Var6, "AppOnboardingDialogHandler", strConcat2);
                        return null;
                    }
                    if (b.f206118a[dVar2.ordinal()] == 1) {
                        return new n.b(cVarA);
                    }
                    cVar3.f206120b = null;
                    cVar3.f206121c = null;
                    cVar3.f206122d = null;
                    cVar3.f206119a = j8;
                    cVar3.f206123e = i14;
                    cVar3.f206126h = 5;
                    objA = a(fVar, cVar3);
                }
                return null;
            }
            if (i16 == 3) {
                i14 = cVar3.f206123e;
                j8 = cVar3.f206119a;
                cVarA = cVar3.f206122d;
                dVar2 = cVar3.f206121c;
                fVar = cVar3.f206120b;
                o13.r.b(objA);
                if (dVar2 == d31.d.PARTNER_CHALLENGE_PROMOTE) {
                    aVarArr = (e31.a[]) cVarA.f102647c.toArray(new e31.a[0]);
                    if (fVar2.e((e31.a[]) Arrays.copyOf(aVarArr, aVarArr.length))) {
                        i2.f36769a.getClass();
                        i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: All checks completed for onboarding item " + dVar2);
                        userProfilePk = this.f206115g.getUserProfilePk();
                        cVar2 = d31.c.COMPLETED;
                        cVar3.f206120b = null;
                        cVar3.f206121c = null;
                        cVar3.f206122d = null;
                        cVar3.f206119a = j8;
                        cVar3.f206123e = i14;
                        cVar3.f206126h = 4;
                        if (hVar.b(userProfilePk, dVar2, cVar2, cVar3) != obj) {
                            return null;
                        }
                    }
                    return obj;
                }
                eVar = fVar.f57386d;
                if (eVar != null) {
                    str = eVar.f57378a;
                } else {
                    str = null;
                }
                if (str == null) {
                    a2 a2Var7 = a2.ONBOARDING;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var7, "AppOnboardingDialogHandler", "requestDialogData: missing partner reward metadata");
                    return null;
                }
                if (fVar2.m(str)) {
                    a2 a2Var8 = a2.ONBOARDING;
                    String strConcat3 = "requestDialogData: Partner challenge onboarding prompt already completed for badgeKey ".concat(str);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var8, "AppOnboardingDialogHandler", strConcat3);
                    return null;
                }
                if (b.f206118a[dVar2.ordinal()] == 1) {
                    return new n.b(cVarA);
                }
                cVar3.f206120b = null;
                cVar3.f206121c = null;
                cVar3.f206122d = null;
                cVar3.f206119a = j8;
                cVar3.f206123e = i14;
                cVar3.f206126h = 5;
                objA = a(fVar, cVar3);
            } else {
                if (i16 == 4) {
                    o13.r.b(objA);
                    ((o13.q) objA).getClass();
                    return null;
                }
                if (i16 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
        }
        return (n) objA;
        int i19 = o13.q.f128596b;
        if (!(objD instanceof o13.q.b)) {
            fVar2.c(System.currentTimeMillis());
        }
        d31.c cVar6 = d31.c.NOT_STARTED;
        cVar3.f206120b = null;
        cVar3.f206119a = jP;
        cVar3.f206126h = 2;
        objA = hVar.a(cVar6, cVar3);
        if (objA != obj) {
            j8 = jP;
            it = ((Iterable) objA).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                d31.f fVar5 = (d31.f) next;
                i2.f36769a.getClass();
                i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: Found onboarding item  " + fVar5);
                b63.l lVarA3 = b63.a.C0229a.f16171a.a();
                b63.z.INSTANCE.getClass();
                oVarB = b63.b.d(lVarA3, b63.z.Companion.a()).b();
                uVar = fVar5.f57385c;
                if (uVar == null) {
                    break;
                    break;
                }
            } while (uVar.b().compareTo(oVarB) > 0);
            fVar = (d31.f) next;
            if (fVar != null) {
                dVar2 = fVar.f57383a;
                k31.c.f102631r.getClass();
                cVarA = k31.c.a.a(dVar2, null);
                if (cVarA == null) {
                    i2.f36769a.getClass();
                    i2.a.f(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: Unsupported onboarding item type: " + dVar2);
                    return null;
                }
                i2.f36769a.getClass();
                i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: Refreshing onboarding state for item: " + dVar2);
                z0VarA = h31.d.a(dVar2);
                if (z0VarA != null) {
                    cVar3.f206120b = fVar;
                    cVar3.f206121c = dVar2;
                    cVar3.f206122d = cVarA;
                    cVar3.f206119a = j8;
                    cVar3.f206123e = 0;
                    cVar3.f206126h = 3;
                    int i110 = z0.f96953a;
                }
                i14 = 0;
                if (dVar2 == d31.d.PARTNER_CHALLENGE_PROMOTE) {
                    eVar = fVar.f57386d;
                    if (eVar != null) {
                        str = eVar.f57378a;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        a2 a2Var9 = a2.ONBOARDING;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var9, "AppOnboardingDialogHandler", "requestDialogData: missing partner reward metadata");
                        return null;
                    }
                    if (fVar2.m(str)) {
                        a2 a2Var10 = a2.ONBOARDING;
                        String strConcat4 = "requestDialogData: Partner challenge onboarding prompt already completed for badgeKey ".concat(str);
                        i2.f36769a.getClass();
                        i2.a.b(a2Var10, "AppOnboardingDialogHandler", strConcat4);
                        return null;
                    }
                } else {
                    aVarArr = (e31.a[]) cVarA.f102647c.toArray(new e31.a[0]);
                    if (fVar2.e((e31.a[]) Arrays.copyOf(aVarArr, aVarArr.length))) {
                        i2.f36769a.getClass();
                        i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "requestDialogData: All checks completed for onboarding item " + dVar2);
                        userProfilePk = this.f206115g.getUserProfilePk();
                        cVar2 = d31.c.COMPLETED;
                        cVar3.f206120b = null;
                        cVar3.f206121c = null;
                        cVar3.f206122d = null;
                        cVar3.f206119a = j8;
                        cVar3.f206123e = i14;
                        cVar3.f206126h = 4;
                        if (hVar.b(userProfilePk, dVar2, cVar2, cVar3) != obj) {
                        }
                    }
                }
                if (b.f206118a[dVar2.ordinal()] == 1) {
                    return new n.b(cVarA);
                }
                cVar3.f206120b = null;
                cVar3.f206121c = null;
                cVar3.f206122d = null;
                cVar3.f206119a = j8;
                cVar3.f206123e = i14;
                cVar3.f206126h = 5;
                objA = a(fVar, cVar3);
            }
            return null;
        }
        return obj;
    }

    @Override // zo0.p
    public final Unit d(n nVar) {
        i2.f36769a.getClass();
        i2.a.b(a2.ONBOARDING, "AppOnboardingDialogHandler", "onDialogShown: " + nVar);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzo0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

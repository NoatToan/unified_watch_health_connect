package f90;

import ca0.o1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import lc.u0;
import o13.p;
import o13.r;
import p005kotlin.Metadata;
import p13.j0;
import q92.x;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lf90/f;", "", "Lf90/b;", "checkConsentUseCase", "Le20/a;", "consentRepository", "", "isChildAccount", "<init>", "(Lf90/b;Le20/a;Z)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f69980d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f90.b f69981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e20.a f69982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69983c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69984a;

        static {
            int[] iArr = new int[o1.values().length];
            try {
                iArr[o1.CREATE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o1.SIGN_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o1.ADD_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69984a = iArr;
        }
    }

    static {
        new a(null);
        e20.a.C1315a c1315a = e20.a.f62587b;
    }

    public f(f90.b bVar, e20.a aVar, boolean z14) {
        bVar.getClass();
        aVar.getClass();
        this.f69981a = bVar;
        this.f69982b = aVar;
        this.f69983c = z14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable a(v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f69987c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f69987c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objA = gVar.f69985a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f69987c;
        if (i15 == 0) {
            r.b(objA);
            x xVar = x.DI_CONNECT_UPLOAD;
            gVar.f69987c = 1;
            int i16 = f90.b.f69963b;
            objA = this.f69981a.a(xVar, false, gVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        p pVar = (p) objA;
        if (pVar != null) {
            return new p(ca0.j.c.a((ca0.j.c) pVar.f128594a, this.f69983c, false, 27), pVar.f128595b);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00db  */
    /* JADX WARN: Code duplicated, block: B:33:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0091, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00db, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable b(v13.c cVar) {
        h hVar;
        p pVar;
        String str;
        v2 v2Var;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f69992e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f69992e = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Serializable serializableA = hVar.f69990c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f69992e;
        if (i15 == 0) {
            r.b(serializableA);
            x xVar = x.DI_CONNECT_UPLOAD;
            hVar.f69992e = 1;
            int i16 = f90.b.f69963b;
            serializableA = this.f69981a.a(xVar, false, hVar);
            if (serializableA != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            r.b(serializableA);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = hVar.f69989b;
            pVar = hVar.f69988a;
            r.b(serializableA);
        }
        v2Var = (v2) serializableA;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            a2 a2Var = a2.DEVICE_SETUP;
            String str2 = "Error fetching parental approval request status for " + str + ": " + ((v2.a) v2Var).f47383a;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "FetchStartupConsentsDataUseCase", str2);
            return new p(ca0.j.c.a((ca0.j.c) pVar.f128594a, false, true, 23), pVar.f128595b);
        }
        d1 d1Var = d1.f200951a;
        Object obj = ((v2.b) v2Var).f47386a;
        d1Var.getClass();
        boolean zG = d1.g((d20.a) obj);
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "FetchStartupConsentsDataUseCase", "Parental approval request status for " + str + ": " + obj + ", isConsentRequestRecentlySent: " + zG);
        return new p(ca0.j.c.a((ca0.j.c) pVar.f128594a, false, zG, 23), pVar.f128595b);
        p pVar2 = (p) serializableA;
        if (pVar2 != null) {
            String str3 = x.valueOf(((ca0.j.c) pVar2.f128594a).f26293a).f143819a;
            a2 a2Var2 = a2.DEVICE_SETUP;
            String strN = fb1.c.n("Checking parental approval request status for consent type: ", str3);
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "FetchStartupConsentsDataUseCase", strN);
            String str4 = x.DI_CONNECT_UPLOAD.f143819a;
            hVar.f69988a = pVar2;
            hVar.f69989b = str3;
            hVar.f69992e = 2;
            Object objA = this.f69982b.a(str4, hVar);
            if (objA != aVar) {
                pVar = pVar2;
                serializableA = objA;
                str = str3;
                v2Var = (v2) serializableA;
                if (!(v2Var instanceof v2.b)) {
                    d1 d1Var2 = d1.f200951a;
                    Object obj2 = ((v2.b) v2Var).f47386a;
                    d1Var2.getClass();
                    boolean zG2 = d1.g((d20.a) obj2);
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICE_SETUP, "FetchStartupConsentsDataUseCase", "Parental approval request status for " + str + ": " + obj2 + ", isConsentRequestRecentlySent: " + zG2);
                    return new p(ca0.j.c.a((ca0.j.c) pVar.f128594a, false, zG2, 23), pVar.f128595b);
                }
                if (!(v2Var instanceof v2.a)) {
                    a2 a2Var3 = a2.DEVICE_SETUP;
                    String str5 = "Error fetching parental approval request status for " + str + ": " + ((v2.a) v2Var).f47383a;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var3, "FetchStartupConsentsDataUseCase", str5);
                    return new p(ca0.j.c.a((ca0.j.c) pVar.f128594a, false, true, 23), pVar.f128595b);
                }
                u0.r();
            }
            return aVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r8 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o1 o1Var, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f69995c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f69995c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objB = iVar.f69993a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f69995c;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(objB);
                return p13.x.l(objB);
            }
            if (i15 == 2) {
                r.b(objB);
                return p13.x.l(objB);
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objB);
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "FetchStartupConsentsDataUseCase", "Checking device setup startup required consents for flow: " + o1Var);
        if (!this.f69983c) {
            return j0.f134944a;
        }
        int i16 = b.f69984a[o1Var.ordinal()];
        if (i16 == 1 || i16 == 2) {
            iVar.f69995c = 1;
            objB = b(iVar);
        } else {
            if (i16 != 3) {
                u0.r();
                return null;
            }
            iVar.f69995c = 2;
            objB = a(iVar);
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf90/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

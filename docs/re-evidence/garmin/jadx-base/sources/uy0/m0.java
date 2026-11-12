package uy0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Luy0/m0;", "", "Lf12/l;", "userSettings", "Lzd0/j1;", "subscriptionProvider", "Lm12/r;", "profileDelegate", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lf12/l;Lzd0/j1;Lm12/r;Lo53/z;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f173235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd0.j1 f173236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m12.r f173237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.z f173238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ty0.b f173239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o13.t f173240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f173241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.t f173242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q92.x f173243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q92.x f173244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o13.t f173245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o13.t f173246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o13.t f173247m;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173248a;

        static {
            int[] iArr = new int[m12.t.values().length];
            try {
                iArr[m12.t.f115872m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m12.t.f115882y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m12.t.P0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m12.t.B.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m12.t.C.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m12.t.D.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m12.t.F.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m12.t.E.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m12.t.P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m12.t.f115879v.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f173248a = iArr;
        }
    }

    public m0(f12.l lVar, zd0.j1 j1Var, m12.r rVar, o53.z zVar) {
        lVar.getClass();
        j1Var.getClass();
        rVar.getClass();
        zVar.getClass();
        this.f173235a = lVar;
        this.f173236b = j1Var;
        this.f173237c = rVar;
        this.f173238d = zVar;
        this.f173239e = ty0.b.f166864d2;
        this.f173240f = o13.m.b(new ux1.b(24));
        this.f173241g = o13.m.b(new ux1.b(25));
        this.f173242h = o13.m.b(new ux1.b(26));
        this.f173243i = q92.x.DI_CONNECT_LIVETRACK;
        this.f173244j = q92.x.DI_CONNECT_AI;
        this.f173245k = o13.m.b(new ux1.b(27));
        this.f173246l = o13.m.b(new ux1.b(28));
        this.f173247m = o13.m.b(new ty1.f1(this, 20));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r12 == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        if (r12 == r5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0119, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m0 m0Var, m12.t tVar, v13.c cVar) {
        o0 o0Var;
        m0Var.getClass();
        o13.t tVar2 = m0Var.f173242h;
        o13.t tVar3 = m0Var.f173241g;
        o13.t tVar4 = m0Var.f173240f;
        o13.t tVar5 = m0Var.f173247m;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f173273c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f173273c = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(m0Var, cVar);
            }
        } else {
            o0Var = new o0(m0Var, cVar);
        }
        Object objB = o0Var.f173271a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f173273c;
        boolean zBooleanValue = false;
        if (i15 == 0) {
            o13.r.b(objB);
            switch (a.f173248a[tVar.ordinal()]) {
                case 1:
                    m12.t.a aVar2 = m12.t.f115868j;
                    boolean zBooleanValue2 = ((Boolean) tVar4.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) tVar3.getValue()).booleanValue();
                    aVar2.getClass();
                    if (!m12.t.a.a(tVar, zBooleanValue2, zBooleanValue3)) {
                        zBooleanValue = true;
                    }
                    break;
                case 2:
                    zBooleanValue = true;
                    break;
                case 3:
                    m12.r rVar = m0Var.f173237c;
                    o0Var.f173273c = 1;
                    objB = rVar.b(o0Var);
                    break;
                case 4:
                    zBooleanValue = ((Boolean) m0Var.f173245k.getValue()).booleanValue();
                    break;
                case 5:
                    zBooleanValue = ((Boolean) m0Var.f173246l.getValue()).booleanValue();
                    break;
                case 6:
                    zBooleanValue = ((Boolean) tVar2.getValue()).booleanValue();
                    break;
                case 7:
                    if (!((Set) tVar5.getValue()).contains("ROLE_USER_MANAGED_ACCOUNTS_CHILD")) {
                        zBooleanValue = true;
                    }
                    break;
                case 8:
                    if (!((Set) tVar5.getValue()).contains("ROLE_USER_MANAGED_ACCOUNTS_CHILD") && ((Boolean) tVar2.getValue()).booleanValue() && z10.d1.h(m0Var.f173243i, true) && m0Var.f173235a.Y()) {
                        zBooleanValue = true;
                    }
                    break;
                case 9:
                    if (!((Set) tVar5.getValue()).contains("ROLE_USER_MANAGED_ACCOUNTS_CHILD")) {
                        zd0.j1 j1Var = m0Var.f173236b;
                        c80.q qVar = c80.q.MESSAGING_PLUS;
                        o0Var.f173273c = 2;
                        objB = j1Var.l(qVar, o0Var);
                    }
                    break;
                case 10:
                    zBooleanValue = com.garmin.android.apps.connectmobile.k1.f37122a.Q0();
                    break;
                default:
                    m12.t.a aVar3 = m12.t.f115868j;
                    boolean zBooleanValue4 = ((Boolean) tVar4.getValue()).booleanValue();
                    boolean zBooleanValue5 = ((Boolean) tVar3.getValue()).booleanValue();
                    aVar3.getClass();
                    if (!m12.t.a.a(tVar, zBooleanValue4, zBooleanValue5)) {
                        zBooleanValue = true;
                    }
                    break;
            }
        } else if (i15 == 1) {
            o13.r.b(objB);
            v2 v2Var = (v2) objB;
            if (v2Var instanceof v2.b) {
                zBooleanValue = ((Boolean) ((v2.b) v2Var).f47386a).booleanValue();
            } else if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
            if (((Boolean) objB).booleanValue()) {
                zBooleanValue = true;
            } else {
                p92.o oVar = p92.o.f136619a;
                q92.x xVar = m0Var.f173244j;
                oVar.getClass();
                q92.v vVarN = p92.o.n(xVar);
                if ((vVarN != null ? vVarN.f143785c : null) == q92.u.CUSTOMER) {
                    zBooleanValue = true;
                }
            }
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public m0(f12.l lVar, zd0.j1 j1Var, m12.r rVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, j1Var, rVar, (i14 & 8) != 0 ? o53.s0.f129406a : zVar);
    }
}

package fi0;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.actions.SearchIntents;
import ei0.p0;
import java.util.List;
import java.util.Map;
import lc.u0;
import li0.l0;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013BS\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lfi0/q;", "Lei0/b;", "Lhi0/a;", "Lr53/z1;", "", "", "Lli0/l0;", "stateMap", "displayName", SearchIntents.EXTRA_QUERY, "Lei0/d;", "followRepo", "Lfi0/q$a;", "target", "", "startIndex", "pageSize", "<init>", "(Lr53/z1;Ljava/lang/String;Ljava/lang/String;Lei0/d;Lfi0/q$a;II)V", "a", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends ei0.b<hi0.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1<Map<String, l0>> f71725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f71726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ei0.d f71728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f71729i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfi0/q$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        FOLLOWER,
        FOLLOWING
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71733a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.FOLLOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71733a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z1<Map<String, l0>> z1Var, String str, String str2, ei0.d dVar, a aVar, int i14, int i15) {
        super(i14, i15);
        z1Var.getClass();
        str2.getClass();
        dVar.getClass();
        aVar.getClass();
        this.f71725e = z1Var;
        this.f71726f = str;
        this.f71727g = str2;
        this.f71728h = dVar;
        this.f71729i = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:21:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ei0.b
    public final java.lang.Object f(java.util.List r9, v13.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof fi0.r
            if (r0 == 0) goto L13
            r0 = r10
            fi0.r r0 = (fi0.r) r0
            int r1 = r0.f71742i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71742i = r1
            goto L18
        L13:
            fi0.r r0 = new fi0.r
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f71740g
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f71742i
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L37
            int r9 = r0.f71739f
            int r2 = r0.f71738e
            java.util.Collection r4 = r0.f71737d
            java.util.Collection r4 = (java.util.Collection) r4
            li0.d0 r5 = r0.f71736c
            java.util.Iterator r6 = r0.f71735b
            java.util.Collection r7 = r0.f71734a
            java.util.Collection r7 = (java.util.Collection) r7
            o13.r.b(r10)
            goto L7f
        L37:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r9)
            r9 = 0
            return r9
        L3e:
            o13.r.b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = p13.y.r(r9, r2)
            r10.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r6 = r9
            r4 = r10
            r9 = r2
        L54:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L84
            java.lang.Object r10 = r6.next()
            hi0.a r10 = (hi0.a) r10
            li0.d0 r5 = hi0.b.a(r10)
            r10 = r4
            java.util.Collection r10 = (java.util.Collection) r10
            r0.f71734a = r10
            r0.f71735b = r6
            r0.f71736c = r5
            r0.f71737d = r10
            r0.f71738e = r2
            r0.f71739f = r9
            r0.f71742i = r3
            r53.z1<java.util.Map<java.lang.String, li0.l0>> r10 = r8.f71725e
            java.lang.Object r10 = li0.e0.d(r5, r10, r0)
            if (r10 != r1) goto L7e
            return r1
        L7e:
            r7 = r4
        L7f:
            r4.add(r5)
            r4 = r7
            goto L54
        L84:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fi0.q.f(java.util.List, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r12 == r0) goto L32;
     */
    @Override // ei0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i14, int i15, v13.c cVar) throws Exception {
        s sVar;
        v2 v2Var;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i16 = sVar.f71745c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                sVar.f71745c = i16 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        s sVar2 = sVar;
        Object objR0 = sVar2.f71743a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = sVar2.f71745c;
        if (i17 == 0) {
            o13.r.b(objR0);
            if (this.f71726f == null) {
                return j0.f134944a;
            }
            int i18 = b.f71733a[this.f71729i.ordinal()];
            if (i18 == 1) {
                List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                Integer num = new Integer(i14);
                Integer num2 = new Integer(i15);
                sVar2.f71745c = 1;
                objR0 = this.f71728h.R0(this.f71726f, this.f71727g, listC, num, num2, p0.f64292c, sVar2);
            } else {
                if (i18 != 2) {
                    u0.r();
                    return null;
                }
                List listC2 = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
                Integer num3 = new Integer(i14);
                Integer num4 = new Integer(i15);
                sVar2.f71745c = 2;
                objR0 = this.f71728h.e3(this.f71726f, this.f71727g, listC2, num3, num4, p0.f64292c, sVar2);
            }
            return aVar;
        }
        if (i17 == 1) {
            o13.r.b(objR0);
            v2Var = (v2) objR0;
        } else {
            if (i17 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objR0);
            v2Var = (v2) objR0;
        }
        if (v2Var instanceof v2.b) {
            return (List) ((v2.b) v2Var).f47386a;
        }
        if (v2Var instanceof v2.a) {
            throw ((v2.a) v2Var).f47383a;
        }
        u0.r();
        return null;
    }
}

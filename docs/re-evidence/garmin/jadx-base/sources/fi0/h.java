package fi0;

import com.garmin.android.apps.connectmobile.v2;
import ei0.p0;
import java.util.List;
import java.util.Map;
import lc.u0;
import li0.l0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.w;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfi0/h;", "Lei0/b;", "Lhi0/a;", "Lr53/z1;", "", "", "Lli0/l0;", "stateMap", "Lei0/d;", "followRepo", "", "startIndex", "pageSize", "<init>", "(Lr53/z1;Lei0/d;II)V", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends ei0.b<hi0.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1<Map<String, l0>> f71683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ei0.d f71684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z1<Map<String, l0>> z1Var, ei0.d dVar, int i14, int i15) {
        super(i14, i15);
        z1Var.getClass();
        dVar.getClass();
        this.f71683e = z1Var;
        this.f71684f = dVar;
        this.f71685g = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
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
            boolean r0 = r10 instanceof fi0.f
            if (r0 == 0) goto L13
            r0 = r10
            fi0.f r0 = (fi0.f) r0
            int r1 = r0.f71679i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71679i = r1
            goto L18
        L13:
            fi0.f r0 = new fi0.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f71677g
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f71679i
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L37
            int r9 = r0.f71676f
            int r2 = r0.f71675e
            java.util.Collection r4 = r0.f71674d
            java.util.Collection r4 = (java.util.Collection) r4
            li0.d0 r5 = r0.f71673c
            java.util.Iterator r6 = r0.f71672b
            java.util.Collection r7 = r0.f71671a
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
            r0.f71671a = r10
            r0.f71672b = r6
            r0.f71673c = r5
            r0.f71674d = r10
            r0.f71675e = r2
            r0.f71676f = r9
            r0.f71679i = r3
            r53.z1<java.util.Map<java.lang.String, li0.l0>> r10 = r8.f71683e
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
        throw new UnsupportedOperationException("Method not decompiled: fi0.h.f(java.util.List, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // ei0.b
    public final Object g(int i14, int i15, v13.c cVar) throws Exception {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i16 = gVar.f71682c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                gVar.f71682c = i16 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        g gVar2 = gVar;
        Object objT0 = gVar2.f71680a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = gVar2.f71682c;
        if (i17 == 0) {
            o13.r.b(objT0);
            List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            Integer num = new Integer(i14);
            Integer num2 = new Integer(i15);
            gVar2.f71682c = 1;
            objT0 = this.f71684f.t0(this.f71685g, listC, num, num2, p0.f64292c, gVar2);
            if (objT0 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objT0);
        }
        v2 v2Var = (v2) objT0;
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

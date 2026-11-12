package fi0;

import com.garmin.android.apps.connectmobile.v2;
import ei0.p0;
import java.util.List;
import java.util.Map;
import lc.u0;
import li0.l0;
import p005kotlin.Metadata;
import p13.w;
import r1.q2;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfi0/m;", "Lei0/b;", "Lhi0/a;", "Lr53/z1;", "", "", "Lli0/l0;", "stateMap", "displayName", "Lei0/d;", "followRepo", "", "startIndex", "pageSize", "<init>", "(Lr53/z1;Ljava/lang/String;Lei0/d;II)V", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends ei0.b<hi0.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1<Map<String, l0>> f71707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f71708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ei0.d f71709g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z1<Map<String, l0>> z1Var, String str, ei0.d dVar, int i14, int i15) {
        super(i14, i15);
        z1Var.getClass();
        dVar.getClass();
        this.f71707e = z1Var;
        this.f71708f = str;
        this.f71709g = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c6 -> B:34:0x00c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ei0.b
    public final java.lang.Object f(java.util.List r21, v13.c r22) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fi0.m.f(java.util.List, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // ei0.b
    public final Object g(int i14, int i15, v13.c cVar) throws Exception {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i16 = lVar.f71706c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                lVar.f71706c = i16 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        l lVar2 = lVar;
        Object objI4 = lVar2.f71704a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = lVar2.f71706c;
        if (i17 == 0) {
            o13.r.b(objI4);
            String str = this.f71708f;
            if (str == null) {
                q2.u("displayName cannot be null");
                return null;
            }
            List listC = w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
            Integer num = new Integer(i14);
            Integer num2 = new Integer(i15);
            lVar2.f71706c = 1;
            objI4 = this.f71709g.i4(str, listC, num, num2, p0.f64292c, lVar2);
            if (objI4 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI4);
        }
        v2 v2Var = (v2) objI4;
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

package v01;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lv01/j1;", "", "Lm01/g;", "repository", "Lv01/t0;", "getMicronutrientsSettingsUseCase", "Ls01/f;", "nutritionSettingsConfigProvider", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lm01/g;Lv01/t0;Ls01/f;Lo53/z;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f174441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f174442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s01.f f174443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.z f174444d;

    public j1(m01.g gVar, t0 t0Var, s01.f fVar, o53.z zVar) {
        gVar.getClass();
        t0Var.getClass();
        fVar.getClass();
        zVar.getClass();
        this.f174441a = gVar;
        this.f174442b = t0Var;
        this.f174443c = fVar;
        this.f174444d = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable a(j1 j1Var, b63.o oVar, v13.c cVar) {
        g1 g1Var;
        String str;
        j1Var.getClass();
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i14 = g1Var.f174384c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g1Var.f174384c = i14 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(j1Var, cVar);
            }
        } else {
            g1Var = new g1(j1Var, cVar);
        }
        Object objY = g1Var.f174382a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g1Var.f174384c;
        if (i15 == 0) {
            o13.r.b(objY);
            m01.g gVar = j1Var.f174441a;
            g1Var.f174384c = 1;
            objY = gVar.Y(oVar, g1Var);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        v2 v2Var = (v2) objY;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return null;
            }
            lc.u0.r();
            return null;
        }
        l01.k kVar = (l01.k) ((v2.b) v2Var).f47386a;
        String str2 = kVar.f107889l;
        if (str2 == null || (str = kVar.f107888k) == null) {
            return null;
        }
        return new o13.p(str2, str);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object b(j1 j1Var, String str, v13.c cVar) {
        h1 h1Var;
        g01.c cVarA;
        Uri uri;
        String str2;
        j1Var.getClass();
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i14 = h1Var.f174395c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h1Var.f174395c = i14 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(j1Var, cVar);
            }
        } else {
            h1Var = new h1(j1Var, cVar);
        }
        Object objK = h1Var.f174393a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h1Var.f174395c;
        if (i15 == 0) {
            o13.r.b(objK);
            m01.g gVar = j1Var.f174441a;
            h1Var.f174395c = 1;
            objK = gVar.k(str, h1Var);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        v2 v2Var = (v2) objK;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return null;
            }
            lc.u0.r();
            return null;
        }
        j01.c cVar2 = (j01.c) ((v2.b) v2Var).f47386a;
        cVar2.getClass();
        b11.t.a aVar2 = b11.t.f14377d;
        List list = cVar2.f96006k;
        if (list == null) {
            list = p13.j0.f134944a;
        }
        g01.u uVar = g01.u.GARMIN;
        aVar2.getClass();
        b11.t tVarA = b11.t.a.a(list, uVar);
        String str3 = cVar2.f95998c;
        String str4 = cVar2.f95999d;
        String str5 = cVar2.f96001f;
        Double d14 = cVar2.f96000e;
        g01.c0 c0Var = cVar2.f96005j;
        String str6 = c0Var != null ? c0Var.f74124a : null;
        if (c0Var == null || (str2 = c0Var.f74125b) == null) {
            cVarA = g01.c.SERVING;
        } else {
            g01.c.INSTANCE.getClass();
            cVarA = g01.c.Companion.a(str2);
            if (cVarA == null) {
                cVarA = g01.c.SERVING;
            } else {
                if (cVarA == g01.c.UNKNOWN) {
                    cVarA = null;
                }
                if (cVarA == null) {
                    cVarA = g01.c.SERVING;
                }
            }
        }
        g01.c cVar3 = cVarA;
        String str7 = tVarA.f14379b;
        y22.x xVar = (str7 == null || (uri = Uri.parse(str7)) == null) ? null : new y22.x(uri, (String) null, false, 6, (p005kotlin.jvm.internal.j) null);
        String str8 = cVar2.f96003h;
        String str9 = cVar2.f96002g;
        Iterable iterable = cVar2.f96004i;
        if (iterable == null) {
            iterable = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b11.v vVarB = ((g01.a) it.next()).b();
            if (vVarB != null) {
                arrayList.add(vVarB);
            }
        }
        return new q01.h(str3, str4, str5, d14, str6, cVar3, xVar, str8, str9, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j1(m01.g gVar, t0 t0Var, s01.f fVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 8) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(gVar, t0Var, fVar, zVar);
    }
}

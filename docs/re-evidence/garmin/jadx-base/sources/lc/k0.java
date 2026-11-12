package lc;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fBC\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\r\u0012\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000e¢\u0006\u0004\b\b\u0010\u0012B?\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0013\u0012\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000e¢\u0006\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Llc/k0;", "Llc/i0;", "Llc/j0;", "Llc/w0;", "provider", "", TtmlNode.ATTR_ID, "startDestination", "<init>", "(Llc/w0;II)V", "", "route", "(Llc/w0;Ljava/lang/String;Ljava/lang/String;)V", "Lk23/d;", "", "Lk23/p;", "Llc/q0;", "typeMap", "(Llc/w0;Lk23/d;Lk23/d;Ljava/util/Map;)V", "", "(Llc/w0;Ljava/lang/Object;Lk23/d;Ljava/util/Map;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class k0 extends i0<j0> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w0 f111792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f111793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f111794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k23.d<?> f111795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f111796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f111797m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(w0 w0Var, k23.d<?> dVar, k23.d<?> dVar2, Map<k23.p, q0<?>> map) {
        super(w0Var.b(l0.class), dVar2, map);
        w0Var.getClass();
        dVar.getClass();
        map.getClass();
        this.f111797m = new ArrayList();
        this.f111792h = w0Var;
        this.f111795k = dVar;
    }

    @Override // lc.i0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j0 a() {
        j0 j0Var = (j0) super.a();
        ArrayList<h0> arrayList = this.f111797m;
        arrayList.getClass();
        qc.l lVar = j0Var.f111791g;
        lVar.getClass();
        for (h0 h0Var : arrayList) {
            if (h0Var != null) {
                lVar.a(h0Var);
            }
        }
        Object obj = this.f111796l;
        k23.d<?> dVar = this.f111795k;
        String str = this.f111794j;
        int i14 = this.f111793i;
        if (i14 == 0 && str == null && dVar == null && obj == null) {
            if (this.f111785c != null) {
                vb.h.z("You must set a start destination route");
                return null;
            }
            vb.h.z("You must set a start destination id");
            return null;
        }
        if (str != null) {
            lVar.g(str);
            return j0Var;
        }
        if (dVar == null) {
            if (obj != null) {
                j0Var.q(obj);
                return j0Var;
            }
            j0Var.p(i14);
            return j0Var;
        }
        i63.c cVarJ = gl1.y.J(dVar);
        int iB = rc.l.b(cVarJ);
        h0 h0VarB = lVar.b(iB);
        if (h0VarB == null) {
            n23.j.t("Cannot find startDestination ", cVarJ.getF158591b().getF103233a(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
            return null;
        }
        String str2 = h0VarB.f111773b.f144347f;
        str2.getClass();
        lVar.g(str2);
        lVar.f144354c = iB;
        return j0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(w0 w0Var, String str, String str2) {
        super(w0Var.b(l0.class), str2);
        w0Var.getClass();
        str.getClass();
        this.f111797m = new ArrayList();
        this.f111792h = w0Var;
        this.f111794j = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @o13.e
    public k0(w0 w0Var, int i14, int i15) {
        super(w0Var.b(l0.class), i14);
        w0Var.getClass();
        this.f111797m = new ArrayList();
        this.f111792h = w0Var;
        this.f111793i = i15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(w0 w0Var, Object obj, k23.d<?> dVar, Map<k23.p, q0<?>> map) {
        super(w0Var.b(l0.class), dVar, map);
        w0Var.getClass();
        obj.getClass();
        map.getClass();
        this.f111797m = new ArrayList();
        this.f111792h = w0Var;
        this.f111796l = obj;
    }
}

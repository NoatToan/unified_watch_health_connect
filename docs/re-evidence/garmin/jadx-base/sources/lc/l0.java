package lc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@v0.a("navigation")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Llc/l0;", "Llc/v0;", "Llc/j0;", "Llc/w0;", "navigatorProvider", "<init>", "(Llc/w0;)V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class l0 extends v0<j0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f111798d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f111799c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(w0 w0Var) {
        super("navigation");
        w0Var.getClass();
        this.f111799c = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, android.os.Bundle] */
    @Override // lc.v0
    public final void d(List list, o0 o0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            h0 h0Var = vVar.f111882b;
            h0Var.getClass();
            j0 j0Var = (j0) h0Var;
            p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
            r0Var.f105810a = vVar.f111888h.a();
            qc.l lVar = j0Var.f111791g;
            int i14 = lVar.f144354c;
            String str = lVar.f144356e;
            if (i14 == 0 && str == null) {
                qc.j jVar = j0Var.f111773b;
                String strValueOf = jVar.f144343b;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(jVar.f144346e);
                }
                strValueOf.getClass();
                if (lVar.f144352a.f111773b.f144346e == 0) {
                    strValueOf = "the root navigation";
                }
                v.e0.n("no start destination defined via app:startDestination for ".concat(strValueOf));
                return;
            }
            h0 h0VarC = str != null ? lVar.c(str, false) : lVar.f144353b.c(i14);
            if (h0VarC == null) {
                if (lVar.f144355d == null) {
                    String strValueOf2 = lVar.f144356e;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(lVar.f144354c);
                    }
                    lVar.f144355d = strValueOf2;
                }
                String str2 = lVar.f144355d;
                str2.getClass();
                vb.h.s(am.j.m("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            qc.j jVar2 = h0VarC.f111773b;
            if (str != null) {
                if (!str.equals(jVar2.f144347f)) {
                    h0.b bVarA = jVar2.a(str);
                    Bundle bundle = bVarA != null ? bVarA.f111778b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        p13.k0.f134949a.getClass();
                        ?? A = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
                        A.putAll(bundle);
                        Bundle bundle2 = (Bundle) r0Var.f105810a;
                        if (bundle2 != null) {
                            A.putAll(bundle2);
                        }
                        r0Var.f105810a = A;
                    }
                }
                if (h0VarC.e().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListD = gl1.y.D(h0VarC.e(), new c2.s0(r0Var, 9));
                    if (!arrayListD.isEmpty()) {
                        o2.c.i(93, "Cannot navigate to startDestination ", h0VarC, ". Missing required arguments [", arrayListD);
                        return;
                    }
                }
            }
            this.f111799c.c(h0VarC.f111772a).d(p13.w.c(b().a(h0VarC, h0VarC.b((Bundle) r0Var.f105810a))), o0Var);
        }
    }

    @Override // lc.v0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public j0 a() {
        return new j0(this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llc/l0$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package n23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln23/c0;", "Lw23/q;", "Ln23/p0;", "", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "<init>", "(Ln23/i3;)V", "Lt23/r0;", "descriptor", "data", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Ln23/p0;", "Lt23/v;", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Ln23/p0;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class c0 extends w23.q<p0<?>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f122404a;

    public c0(i3 i3Var) {
        i3Var.getClass();
        this.f122404a = i3Var;
    }

    @Override // w23.q, t23.n
    public final Object c(w23.n0 n0Var, Object obj) {
        int i14;
        n0Var.getClass();
        ((Unit) obj).getClass();
        List<t23.u0> listS = n0Var.S();
        listS.getClass();
        if (listS.isEmpty()) {
            i14 = (n0Var.f181676w != null ? 1 : 0) + (n0Var.f181677x != null ? 1 : 0);
        } else {
            i14 = -1;
        }
        boolean z14 = n0Var.f181567f;
        i3 i3Var = this.f122404a;
        if (z14) {
            if (i14 == -1) {
                return new b1(i3Var, n0Var);
            }
            if (i14 == 0) {
                return new v0(i3Var, n0Var);
            }
            if (i14 == 1) {
                return new x0(i3Var, n0Var);
            }
            if (i14 == 2) {
                return new z0(i3Var, n0Var);
            }
        } else {
            if (i14 == -1) {
                return new x1(i3Var, n0Var);
            }
            if (i14 == 0) {
                return new o1(i3Var, n0Var);
            }
            if (i14 == 1) {
                return new r1(i3Var, n0Var);
            }
            if (i14 == 2) {
                return new u1(i3Var, n0Var);
            }
        }
        lc.u0.t(n0Var, "Unsupported property: ");
        return null;
    }

    @Override // w23.q, t23.n
    public final Object k(t23.v vVar, Object obj) {
        ((Unit) obj).getClass();
        return new t0(this.f122404a, vVar);
    }
}

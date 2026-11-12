package m4;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lm4/o0;", "Ljava/util/Comparator;", "Lm4/j0;", "Lkotlin/Comparator;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 implements Comparator<j0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f116511a = new o0();

    private o0() {
    }

    @Override // java.util.Comparator
    public final int compare(j0 j0Var, j0 j0Var2) {
        j0 j0Var3 = j0Var;
        j0 j0Var4 = j0Var2;
        int i14 = 0;
        if (m0.d(j0Var3) && m0.d(j0Var4)) {
            h5.e0 e0VarG = h5.k.g(j0Var3);
            h5.e0 e0VarG2 = h5.k.g(j0Var4);
            if (!p005kotlin.jvm.internal.s.g(e0VarG, e0VarG2)) {
                q3.c cVar = new q3.c(new h5.e0[16], 0);
                while (e0VarG != null) {
                    cVar.a(0, e0VarG);
                    e0VarG = e0VarG.K();
                }
                q3.c cVar2 = new q3.c(new h5.e0[16], 0);
                while (e0VarG2 != null) {
                    cVar2.a(0, e0VarG2);
                    e0VarG2 = e0VarG2.K();
                }
                int iMin = Math.min(cVar.f142358c - 1, cVar2.f142358c - 1);
                if (iMin >= 0) {
                    while (p005kotlin.jvm.internal.s.g(cVar.f142356a[i14], cVar2.f142356a[i14])) {
                        if (i14 != iMin) {
                            i14++;
                        }
                    }
                    return p005kotlin.jvm.internal.s.h(((h5.e0) cVar.f142356a[i14]).L(), ((h5.e0) cVar2.f142356a[i14]).L());
                }
                vb.h.z("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (m0.d(j0Var3)) {
                return -1;
            }
            if (m0.d(j0Var4)) {
                return 1;
            }
        }
        return 0;
    }
}

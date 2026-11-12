package b0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lb0/s0;", "Lb0/z0;", "", "Lb0/i1;", "useCases", "Lb0/k1;", "viewPort", "Lb0/l;", "effects", "<init>", "(Ljava/util/List;Lb0/k1;Ljava/util/List;)V", "Lb0/j1;", "useCaseGroup", "(Lb0/j1;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s0 extends z0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14047i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(List<? extends i1> list, k1 k1Var, List<? extends l> list2) {
        super(list, k1Var, list2, null, null, null, 56, null);
        list.getClass();
        list2.getClass();
        this.f14047i = true;
    }

    public s0(List list, k1 k1Var, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? null : k1Var, (i14 & 4) != 0 ? p13.j0.f134944a : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s0(j1 j1Var) {
        j1Var.getClass();
        List<i1> list = j1Var.f13991b;
        list.getClass();
        k1 k1Var = j1Var.f13990a;
        List<l> list2 = j1Var.f13992c;
        list2.getClass();
        this(list, k1Var, list2);
    }
}

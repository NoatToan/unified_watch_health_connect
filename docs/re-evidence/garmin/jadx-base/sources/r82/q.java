package r82;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lr82/q;", "", "", "initialSelectionIndex", "Li53/c;", "list", "", "afterContentText", "Lkotlin/Function1;", "", "onSelect", "<init>", "(ILi53/c;Ljava/lang/String;Le23/l;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<Integer> f151316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<Integer, Unit> f151318d;

    public /* synthetic */ q(int i14, i53.c cVar, String str, e23.l lVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, cVar, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? new e(6) : lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f151315a == qVar.f151315a && p005kotlin.jvm.internal.s.g(this.f151316b, qVar.f151316b) && p005kotlin.jvm.internal.s.g(this.f151317c, qVar.f151317c) && p005kotlin.jvm.internal.s.g(this.f151318d, qVar.f151318d);
    }

    public final int hashCode() {
        int iA = l2.a(this.f151316b, Integer.hashCode(this.f151315a) * 31, 31);
        String str = this.f151317c;
        return this.f151318d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PickerConfigurationData(initialSelectionIndex=" + this.f151315a + ", list=" + this.f151316b + ", afterContentText=" + this.f151317c + ", onSelect=" + this.f151318d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(int i14, i53.c<Integer> cVar, String str, e23.l<? super Integer, Unit> lVar) {
        cVar.getClass();
        lVar.getClass();
        this.f151315a = i14;
        this.f151316b = cVar;
        this.f151317c = str;
        this.f151318d = lVar;
    }
}

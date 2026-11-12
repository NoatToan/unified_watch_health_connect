package fb0;

import e23.l;
import f21.g0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfb0/f;", "", "", "initialSelectionIndex", "Li53/c;", "list", "afterContentTextRes", "Lkotlin/Function1;", "", "onSelect", "<init>", "(ILi53/c;Ljava/lang/Integer;Le23/l;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<Integer> f70198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f70199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<Integer, Unit> f70200d;

    public /* synthetic */ f(int i14, i53.c cVar, Integer num, l lVar, int i15, j jVar) {
        this(i14, cVar, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? new g0(24) : lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f70197a == fVar.f70197a && s.g(this.f70198b, fVar.f70198b) && s.g(this.f70199c, fVar.f70199c) && s.g(this.f70200d, fVar.f70200d);
    }

    public final int hashCode() {
        int iA = l2.a(this.f70198b, Integer.hashCode(this.f70197a) * 31, 31);
        Integer num = this.f70199c;
        return this.f70200d.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "PickerConfigData(initialSelectionIndex=" + this.f70197a + ", list=" + this.f70198b + ", afterContentTextRes=" + this.f70199c + ", onSelect=" + this.f70200d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(int i14, i53.c<Integer> cVar, Integer num, l<? super Integer, Unit> lVar) {
        cVar.getClass();
        lVar.getClass();
        this.f70197a = i14;
        this.f70198b = cVar;
        this.f70199c = num;
        this.f70200d = lVar;
    }
}

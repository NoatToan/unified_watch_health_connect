package i4;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Li4/o;", "", "", "Li4/q;", "autofillTypes", "Ln4/d;", "boundingBox", "Lkotlin/Function1;", "", "", "onFill", "<init>", "(Ljava/util/List;Ln4/d;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q> f90846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4.d f90847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<String, Unit> f90848c;

    /* JADX WARN: Multi-variable type inference failed */
    public o(List<? extends q> list, n4.d dVar, e23.l<? super String, Unit> lVar) {
        this.f90846a = list;
        this.f90847b = dVar;
        this.f90848c = lVar;
        p5.v.f136092a.addAndGet(1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.f90846a, oVar.f90846a) && p005kotlin.jvm.internal.s.g(this.f90847b, oVar.f90847b) && this.f90848c == oVar.f90848c;
    }

    public final int hashCode() {
        int iHashCode = this.f90846a.hashCode() * 31;
        n4.d dVar = this.f90847b;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        e23.l<String, Unit> lVar = this.f90848c;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }

    public o(List list, n4.d dVar, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? null : dVar, lVar);
    }
}

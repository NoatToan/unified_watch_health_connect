package o82;

import b63.o;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo82/a;", "", "Lb63/o;", TtmlNode.START, TtmlNode.END, "<init>", "(Lb63/o;Lb63/o;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f130843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f130844b;

    public a(o oVar, o oVar2) {
        oVar.getClass();
        oVar2.getClass();
        this.f130843a = oVar;
        this.f130844b = oVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f130843a, aVar.f130843a) && s.g(this.f130844b, aVar.f130844b);
    }

    public final int hashCode() {
        return this.f130844b.f16206a.hashCode() + (this.f130843a.f16206a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInterval(start=" + this.f130843a + ", end=" + this.f130844b + ")";
    }

    public /* synthetic */ a(o oVar, o oVar2, int i14, j jVar) {
        this(oVar, (i14 & 2) != 0 ? oVar : oVar2);
    }
}

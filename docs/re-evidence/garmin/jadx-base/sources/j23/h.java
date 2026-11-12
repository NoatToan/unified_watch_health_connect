package j23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.Comparable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj23/h;", "", "T", "Lj23/r;", TtmlNode.START, "endExclusive", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class h<T extends Comparable<? super T>> implements r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f96791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f96792b;

    public h(T t7, T t14) {
        t7.getClass();
        t14.getClass();
        this.f96791a = t7;
        this.f96792b = t14;
    }

    @Override // j23.r
    public final T c() {
        return this.f96792b;
    }

    @Override // j23.r
    public final boolean contains(T t7) {
        t7.getClass();
        return t7.compareTo(this.f96791a) >= 0 && t7.compareTo(this.f96792b) < 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        T t7 = this.f96791a;
        T t14 = this.f96792b;
        if (t7.compareTo(t14) >= 0) {
            h hVar = (h) obj;
            if (hVar.f96791a.compareTo(hVar.f96792b) >= 0) {
                return true;
            }
        }
        h hVar2 = (h) obj;
        return t7.equals(hVar2.f96791a) && t14.equals(hVar2.f96792b);
    }

    @Override // j23.r
    public final T getStart() {
        return this.f96791a;
    }

    public final int hashCode() {
        T t7 = this.f96791a;
        T t14 = this.f96792b;
        if (t7.compareTo(t14) >= 0) {
            return -1;
        }
        return t14.hashCode() + (t7.hashCode() * 31);
    }

    public final String toString() {
        return this.f96791a + "..<" + this.f96792b;
    }
}

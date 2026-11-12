package j23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.Comparable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj23/i;", "", "T", "Lj23/g;", TtmlNode.START, "endInclusive", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class i<T extends Comparable<? super T>> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f96793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f96794b;

    public i(T t7, T t14) {
        t7.getClass();
        t14.getClass();
        this.f96793a = t7;
        this.f96794b = t14;
    }

    @Override // j23.g
    public final T b() {
        return this.f96794b;
    }

    @Override // j23.g
    public final /* bridge */ boolean contains(T t7) {
        return g.a.a(this, t7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (g.a.b(this) && g.a.b((i) obj)) {
            return true;
        }
        i iVar = (i) obj;
        return this.f96793a.equals(iVar.f96793a) && this.f96794b.equals(iVar.f96794b);
    }

    @Override // j23.g, j23.r
    public final T getStart() {
        return this.f96793a;
    }

    public final int hashCode() {
        if (g.a.b(this)) {
            return -1;
        }
        return this.f96794b.hashCode() + (this.f96793a.hashCode() * 31);
    }

    @Override // j23.g
    public final /* bridge */ boolean isEmpty() {
        return g.a.b(this);
    }

    public final String toString() {
        return this.f96793a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f96794b;
    }
}

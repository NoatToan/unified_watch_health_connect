package j23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\tB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lj23/l;", "Lj23/j;", "Lj23/g;", "", "Lj23/r;", TtmlNode.START, "endInclusive", "<init>", "(II)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends j implements g<Integer>, r<Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f96803e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f96804f = new l(1, 0);

    public l(int i14, int i15) {
        super(i14, i15, 1);
    }

    @Override // j23.g
    public final Comparable b() {
        return Integer.valueOf(this.f96797b);
    }

    @Override // j23.r
    public final Comparable c() {
        int i14 = this.f96797b;
        if (i14 != Integer.MAX_VALUE) {
            return Integer.valueOf(i14 + 1);
        }
        vb.h.z("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.g
    public final /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return d(((Number) comparable).intValue());
    }

    public final boolean d(int i14) {
        return this.f96796a <= i14 && i14 <= this.f96797b;
    }

    @Override // j23.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (isEmpty() && ((l) obj).isEmpty()) {
            return true;
        }
        l lVar = (l) obj;
        return this.f96796a == lVar.f96796a && this.f96797b == lVar.f96797b;
    }

    @Override // j23.g, j23.r
    public final Comparable getStart() {
        return Integer.valueOf(this.f96796a);
    }

    @Override // j23.j
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f96796a * 31) + this.f96797b;
    }

    @Override // j23.j, j23.g
    public final boolean isEmpty() {
        return this.f96796a > this.f96797b;
    }

    @Override // j23.j
    public final String toString() {
        return this.f96796a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f96797b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj23/l$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

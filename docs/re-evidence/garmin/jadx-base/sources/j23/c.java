package j23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\tB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lj23/c;", "Lj23/a;", "Lj23/g;", "", "Lj23/r;", TtmlNode.START, "endInclusive", "<init>", "(CC)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends j23.a implements g<Character>, r<Character> {
    static {
        new a(null);
        new c((char) 1, (char) 0);
    }

    public c(char c14, char c15) {
        super(c14, c15, 1);
    }

    @Override // j23.g
    public final Comparable b() {
        return Character.valueOf(this.f96781b);
    }

    @Override // j23.r
    public final Comparable c() {
        char c14 = this.f96781b;
        if (c14 != 65535) {
            return Character.valueOf((char) (c14 + 1));
        }
        vb.h.z("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        return null;
    }

    @Override // j23.g
    public final boolean contains(Comparable comparable) {
        char cCharValue = ((Character) comparable).charValue();
        return p005kotlin.jvm.internal.s.h(this.f96780a, cCharValue) <= 0 && p005kotlin.jvm.internal.s.h(cCharValue, this.f96781b) <= 0;
    }

    @Override // j23.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f96780a == cVar.f96780a && this.f96781b == cVar.f96781b;
    }

    @Override // j23.g, j23.r
    public final Comparable getStart() {
        return Character.valueOf(this.f96780a);
    }

    @Override // j23.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f96780a * 31) + this.f96781b;
    }

    @Override // j23.a, j23.g
    public final boolean isEmpty() {
        return p005kotlin.jvm.internal.s.h(this.f96780a, this.f96781b) > 0;
    }

    @Override // j23.a
    public final String toString() {
        return this.f96780a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f96781b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj23/c$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

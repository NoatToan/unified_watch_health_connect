package defpackage;

import com.iabtcf.utils.IntIterable;
import com.iabtcf.utils.IntIterator;
import com.iabtcf.v2.RestrictionType;
import java.util.Objects;
import java.util.StringJoiner;

/* JADX INFO: loaded from: classes20.dex */
public class ysl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RestrictionType f53809c;
    private final IntIterable e;

    public ysl(int i, RestrictionType restrictionType, IntIterable intIterable) {
        Objects.requireNonNull(intIterable);
        Objects.requireNonNull(restrictionType);
        this.f53808b = i;
        this.f53809c = restrictionType;
        this.e = intIterable;
    }

    public IntIterable a() {
        return this.e;
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        IntIterator intIterator = a().intIterator();
        while (intIterator.hasNext()) {
            stringJoiner.add(intIterator.next().toString());
        }
        return "PublisherRestriction{purposeId=" + this.f53808b + ", restrictionType=" + this.f53809c + ", vendorIds=" + stringJoiner.toString() + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ysl yslVar = (ysl) obj;
        return this.f53808b == yslVar.f53808b && this.f53809c == yslVar.f53809c && this.e.equals(yslVar.e);
    }

    public int hashCode() {
        int i = this.f53808b;
        return Objects.hash(Integer.valueOf(i), this.f53809c, this.e);
    }
}

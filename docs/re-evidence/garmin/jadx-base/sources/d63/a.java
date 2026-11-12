package d63;

import am.j;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import d53.w;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld63/a;", "", "", "fractionalPart", "digits", "<init>", "(II)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58076b;

    public a(int i14, int i15) {
        this.f58075a = i14;
        this.f58076b = i15;
        if (i15 >= 0) {
            return;
        }
        h.x(j.h(i15, "Digits must be non-negative, but was "));
        throw null;
    }

    public final int a(int i14) {
        int i15 = this.f58075a;
        int i16 = this.f58076b;
        if (i14 == i16) {
            return i15;
        }
        int[] iArr = c.f58079a;
        return i14 > i16 ? i15 * iArr[i14 - i16] : i15 / iArr[i16 - i14];
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a aVar2 = aVar;
        aVar2.getClass();
        int iMax = Math.max(this.f58076b, aVar2.f58076b);
        return s.h(a(iMax), aVar2.a(iMax));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int iMax = Math.max(this.f58076b, aVar.f58076b);
        return s.h(a(iMax), aVar.a(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        int i14 = c.f58079a[this.f58076b];
        int i15 = this.f58075a;
        sb3.append(i15 / i14);
        sb3.append('.');
        sb3.append(w.O(String.valueOf((i15 % i14) + i14), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        return sb3.toString();
    }
}

package g2;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg2/n;", "", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.c<a> f75177a = new q3.c<>(new a[16], 0);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg2/n$a;", "", "", TtmlNode.START, TtmlNode.END, "<init>", "(II)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f75178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f75179b;

        public a(int i14, int i15) {
            this.f75178a = i14;
            this.f75179b = i15;
            if (!(i14 >= 0)) {
                b2.e.a("negative start index");
            }
            if (i15 >= i14) {
                return;
            }
            b2.e.a("end index greater than start");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f75178a == aVar.f75178a && this.f75179b == aVar.f75179b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f75179b) + (Integer.hashCode(this.f75178a) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Interval(start=");
            sb3.append(this.f75178a);
            sb3.append(", end=");
            return ds.e0.j(sb3, this.f75179b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }
}

package g6;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lg6/l;", "", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "<init>", "(IIII)V", "a", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f76006e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f76007f = new l(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f76011d;

    public l(int i14, int i15, int i16, int i17) {
        this.f76008a = i14;
        this.f76009b = i15;
        this.f76010c = i16;
        this.f76011d = i17;
    }

    public final long a() {
        int iD = (d() / 2) + this.f76008a;
        long j8 = ((long) iD) << 32;
        long jB = (((long) ((b() / 2) + this.f76009b)) & 4294967295L) | j8;
        k.a aVar = k.f76003b;
        return jB;
    }

    public final int b() {
        return this.f76011d - this.f76009b;
    }

    public final long c() {
        long j8 = (((long) this.f76008a) << 32) | (((long) this.f76009b) & 4294967295L);
        k.a aVar = k.f76003b;
        return j8;
    }

    public final int d() {
        return this.f76010c - this.f76008a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f76008a == lVar.f76008a && this.f76009b == lVar.f76009b && this.f76010c == lVar.f76010c && this.f76011d == lVar.f76011d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76011d) + q2.d(this.f76010c, q2.d(this.f76009b, Integer.hashCode(this.f76008a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IntRect.fromLTRB(");
        sb3.append(this.f76008a);
        sb3.append(", ");
        sb3.append(this.f76009b);
        sb3.append(", ");
        sb3.append(this.f76010c);
        sb3.append(", ");
        return e0.j(sb3, this.f76011d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/l$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

package u2;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu2/g$b;", "Lu2/g;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f167845a = new b();

        private b() {
        }

        public final String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu2/g$a;", "Lu2/g;", "", "minHeightInLines", "maxHeightInLines", "<init>", "(II)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f167843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f167844b;

        public a(int i14, int i15) {
            this.f167843a = i14;
            this.f167844b = i15;
            boolean z14 = false;
            if (1 <= i14 && i14 <= i15) {
                z14 = true;
            }
            if (z14) {
                return;
            }
            b2.e.a("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i14 + ", " + i15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f167843a == aVar.f167843a && this.f167844b == aVar.f167844b;
        }

        public final int hashCode() {
            return (this.f167843a * 31) + this.f167844b;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("MultiLine(minHeightInLines=");
            sb3.append(this.f167843a);
            sb3.append(", maxHeightInLines=");
            return e0.j(sb3, this.f167844b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            int i14 = 0;
            this(i14, i14, 3, null);
        }

        public /* synthetic */ a(int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
            this((i16 & 1) != 0 ? 1 : i14, (i16 & 2) != 0 ? Integer.MAX_VALUE : i15);
        }
    }
}

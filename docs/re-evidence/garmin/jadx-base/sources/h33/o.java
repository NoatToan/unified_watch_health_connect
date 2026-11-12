package h33;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public interface o {
    z23.t a(a aVar);

    z23.d0 b(x33.c cVar);

    void c(x33.c cVar);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x33.b f81482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f81483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o33.f f81484c;

        public /* synthetic */ a(x33.b bVar, byte[] bArr, o33.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, (i14 & 2) != 0 ? null : bArr, (i14 & 4) != 0 ? null : fVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f81482a, aVar.f81482a) && p005kotlin.jvm.internal.s.g(this.f81483b, aVar.f81483b) && p005kotlin.jvm.internal.s.g(this.f81484c, aVar.f81484c);
        }

        public final int hashCode() {
            int iHashCode = this.f81482a.hashCode() * 31;
            byte[] bArr = this.f81483b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            o33.f fVar = this.f81484c;
            return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
        }

        public final String toString() {
            return "Request(classId=" + this.f81482a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f81483b) + ", outerClass=" + this.f81484c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public a(x33.b bVar, byte[] bArr, o33.f fVar) {
            bVar.getClass();
            this.f81482a = bVar;
            this.f81483b = bArr;
            this.f81484c = fVar;
        }
    }
}

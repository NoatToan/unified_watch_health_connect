package bb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface l0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f17216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17218d;

        public a(int i14, byte[] bArr, int i15, int i16) {
            this.f17215a = i14;
            this.f17216b = bArr;
            this.f17217c = i15;
            this.f17218d = i16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f17215a == aVar.f17215a && this.f17217c == aVar.f17217c && this.f17218d == aVar.f17218d && Arrays.equals(this.f17216b, aVar.f17216b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f17216b) + (this.f17215a * 31)) * 31) + this.f17217c) * 31) + this.f17218d;
        }
    }

    void a(fa.r rVar, int i14, int i15);

    default int b(androidx.media3.common.j jVar, int i14, boolean z14) {
        return e(jVar, i14, z14);
    }

    void c(long j8, int i14, int i15, int i16, a aVar);

    void d(androidx.media3.common.q qVar);

    int e(androidx.media3.common.j jVar, int i14, boolean z14);

    default void f(int i14, fa.r rVar) {
        a(rVar, i14, 0);
    }
}

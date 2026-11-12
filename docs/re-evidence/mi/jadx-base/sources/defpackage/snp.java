package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public interface snp {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f33824b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f33823a = i;
            this.f33824b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f33823a == aVar.f33823a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.f33824b, aVar.f33824b);
        }

        public int hashCode() {
            return (((((this.f33823a * 31) + Arrays.hashCode(this.f33824b)) * 31) + this.c) * 31) + this.d;
        }
    }

    void a(okh okhVar, int i, int i2);

    void b(Format format);

    default int c(zm5 zm5Var, int i, boolean z) throws IOException {
        return f(zm5Var, i, z, 0);
    }

    default void d(okh okhVar, int i) {
        a(okhVar, i, 0);
    }

    void e(long j, int i, int i2, int i3, a aVar);

    int f(zm5 zm5Var, int i, boolean z, int i2) throws IOException;
}

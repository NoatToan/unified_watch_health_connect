package yb;

import androidx.media3.common.q;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3640a f195662a = new C3640a();

        /* JADX INFO: renamed from: yb.n$a$a, reason: collision with other inner class name */
        public class C3640a implements a {
            @Override // yb.n.a
            public final boolean a(q qVar) {
                return false;
            }

            @Override // yb.n.a
            public final int b(q qVar) {
                return 1;
            }

            @Override // yb.n.a
            public final n c(q qVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(q qVar);

        int b(q qVar);

        n c(q qVar);
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f195663c = new b(C.TIME_UNSET, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f195664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f195665b;

        private b(long j8, boolean z14) {
            this.f195664a = j8;
            this.f195665b = z14;
        }

        public static b a(long j8) {
            return new b(j8, true);
        }
    }

    int a();

    default i b(int i14, int i15, byte[] bArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        b bVar = b.f195663c;
        Objects.requireNonNull(builder);
        c(bArr, 0, i15, bVar, new xw.b(builder, 3));
        return new d(builder.build());
    }

    void c(byte[] bArr, int i14, int i15, b bVar, fa.g<c> gVar);

    default void reset() {
    }
}

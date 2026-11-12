package ja;

import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.d0;
import androidx.media3.common.h0;
import androidx.media3.common.k0;
import androidx.media3.common.w;
import androidx.media3.common.y;
import androidx.media3.common.z;
import androidx.media3.exoplayer.audio.AudioSink;
import com.google.common.base.Objects;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f97942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0 f97943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f97944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.j.b f97945d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f97946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d0 f97947f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f97948g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.j.b f97949h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f97950i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f97951j;

        public a(long j8, d0 d0Var, int i14, androidx.media3.exoplayer.source.j.b bVar, long j14, d0 d0Var2, int i15, androidx.media3.exoplayer.source.j.b bVar2, long j15, long j16) {
            this.f97942a = j8;
            this.f97943b = d0Var;
            this.f97944c = i14;
            this.f97945d = bVar;
            this.f97946e = j14;
            this.f97947f = d0Var2;
            this.f97948g = i15;
            this.f97949h = bVar2;
            this.f97950i = j15;
            this.f97951j = j16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f97942a == aVar.f97942a && this.f97944c == aVar.f97944c && this.f97946e == aVar.f97946e && this.f97948g == aVar.f97948g && this.f97950i == aVar.f97950i && this.f97951j == aVar.f97951j && Objects.equal(this.f97943b, aVar.f97943b) && Objects.equal(this.f97945d, aVar.f97945d) && Objects.equal(this.f97947f, aVar.f97947f) && Objects.equal(this.f97949h, aVar.f97949h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f97942a), this.f97943b, Integer.valueOf(this.f97944c), this.f97945d, Long.valueOf(this.f97946e), this.f97947f, Integer.valueOf(this.f97948g), this.f97949h, Long.valueOf(this.f97950i), Long.valueOf(this.f97951j));
        }
    }

    /* JADX INFO: renamed from: ja.b$b, reason: collision with other inner class name */
    public static final class C1872b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.o f97952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<a> f97953b;

        public C1872b(androidx.media3.common.o oVar, SparseArray<a> sparseArray) {
            this.f97952a = oVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(oVar.f8347a.size());
            for (int i14 = 0; i14 < oVar.f8347a.size(); i14++) {
                int iA = oVar.a(i14);
                a aVar = sparseArray.get(iA);
                aVar.getClass();
                sparseArray2.append(iA, aVar);
            }
            this.f97953b = sparseArray2;
        }

        public final boolean a(int i14) {
            return this.f97952a.f8347a.get(i14);
        }
    }

    default void B(a aVar, PlaybackException playbackException) {
    }

    default void D(a aVar, androidx.media3.exoplayer.g gVar) {
    }

    default void E(a aVar, int i14) {
    }

    default void F(a aVar, int i14, int i15, boolean z14) {
    }

    default void H(a aVar, boolean z14) {
    }

    default void J(a aVar, String str) {
    }

    default void K(a aVar, int i14) {
    }

    default void L(z zVar, C1872b c1872b) {
    }

    default void M(a aVar, h0 h0Var) {
    }

    default void N(a aVar, androidx.media3.common.q qVar) {
    }

    default void O(a aVar, int i14) {
    }

    default void Q(a aVar) {
    }

    default void R(a aVar, Exception exc) {
    }

    default void T(a aVar, int i14) {
    }

    default void U(a aVar, k0 k0Var) {
    }

    default void V(a aVar, int i14) {
    }

    default void W(a aVar, String str) {
    }

    default void X(a aVar, String str) {
    }

    default void Z(a aVar) {
    }

    default void a(a aVar, Object obj) {
    }

    default void a0(a aVar, int i14, int i15) {
    }

    default void b(a aVar, w wVar) {
    }

    default void b0(a aVar, AudioSink.a aVar2) {
    }

    default void c(a aVar, boolean z14) {
    }

    default void c0(a aVar, int i14) {
    }

    default void d(a aVar) {
    }

    default void e(a aVar, androidx.media3.common.q qVar) {
    }

    default void f(a aVar, androidx.media3.exoplayer.g gVar) {
    }

    default void g(a aVar, sa.i iVar, sa.j jVar, IOException iOException) {
    }

    default void h(a aVar, int i14) {
    }

    default void i(a aVar, AudioSink.a aVar2) {
    }

    default void j(a aVar, androidx.media3.exoplayer.g gVar) {
    }

    default void l(a aVar, y yVar) {
    }

    default void m(a aVar, boolean z14) {
    }

    default void o(a aVar) {
    }

    default void q(a aVar, sa.j jVar) {
    }

    default void r(a aVar, String str) {
    }

    default void s(a aVar, androidx.media3.exoplayer.g gVar) {
    }

    default void t(a aVar, boolean z14, int i14) {
    }

    default void u(a aVar, sa.j jVar) {
    }

    default void v(a aVar, z.e eVar, z.e eVar2, int i14) {
    }

    default void w(int i14, long j8, a aVar) {
    }

    default void x(a aVar, boolean z14) {
    }

    default void y(a aVar, int i14, long j8, long j14) {
    }
}

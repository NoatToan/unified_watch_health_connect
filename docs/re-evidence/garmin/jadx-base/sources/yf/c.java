package yf;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import tj.i;
import w63.g;

/* JADX INFO: loaded from: classes7.dex */
public interface c {
    public static final a F0;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a implements c, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f196838a = new a();

        @Override // yf.c
        public final zf.a a(g gVar) {
            InputStream inputStreamV4 = gVar.v4();
            i iVar = new i();
            if (!inputStreamV4.markSupported()) {
                inputStreamV4 = new BufferedInputStream(inputStreamV4);
            }
            try {
                inputStreamV4.mark(3);
                int i14 = inputStreamV4.read() + (inputStreamV4.read() << 8);
                inputStreamV4.reset();
                if (i14 == 35615) {
                    inputStreamV4 = new BufferedInputStream(new GZIPInputStream(inputStreamV4));
                }
            } catch (IOException unused) {
            }
            try {
                inputStreamV4.mark(4096);
                iVar.B(inputStreamV4);
                return new zf.a(iVar.f165011a);
            } finally {
                try {
                    inputStreamV4.close();
                } catch (IOException unused2) {
                }
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return new q(1, zf.b.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lyf/c$b;", "", "<init>", "()V", "Lyf/c;", "DEFAULT", "Lyf/c;", "coil-svg_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f196839a = 0;

        static {
            new b();
        }

        private b() {
        }
    }

    static {
        int i14 = b.f196839a;
        F0 = a.f196838a;
    }

    zf.a a(g gVar);
}

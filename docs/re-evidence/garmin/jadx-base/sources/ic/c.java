package ic;

import androidx.media3.common.ParserException;
import bb.o;
import fa.k;
import fa.r;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f92554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f92555b;

        private a(int i14, long j8) {
            this.f92554a = i14;
            this.f92555b = j8;
        }

        public static a a(o oVar, r rVar) {
            oVar.peekFully(rVar.f70054a, 0, 8);
            rVar.G(0);
            return new a(rVar.g(), rVar.l());
        }
    }

    private c() {
    }

    public static boolean a(o oVar) {
        r rVar = new r(8);
        int i14 = a.a(oVar, rVar).f92554a;
        if (i14 != 1380533830 && i14 != 1380333108) {
            return false;
        }
        oVar.peekFully(rVar.f70054a, 0, 4);
        rVar.G(0);
        int iG = rVar.g();
        if (iG == 1463899717) {
            return true;
        }
        k.c("Unsupported form type: " + iG);
        return false;
    }

    public static a b(int i14, o oVar, r rVar) throws ParserException {
        a aVarA = a.a(oVar, rVar);
        while (true) {
            int i15 = aVarA.f92554a;
            if (i15 == i14) {
                return aVarA;
            }
            fb1.c.r(i15, "Ignoring unknown WAV chunk: ");
            long j8 = aVarA.f92555b;
            long j14 = 8 + j8;
            if (j8 % 2 != 0) {
                j14 = 9 + j8;
            }
            if (j14 > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + i15);
            }
            oVar.skipFully((int) j14);
            aVarA = a.a(oVar, rVar);
        }
    }
}

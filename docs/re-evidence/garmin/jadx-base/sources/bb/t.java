package bb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v f17254a;

        public a(v vVar) {
            this.f17254a = vVar;
        }
    }

    private t() {
    }

    public static v.a a(fa.r rVar) {
        rVar.H(1);
        int iX = rVar.x();
        long j8 = ((long) rVar.f70055b) + ((long) iX);
        int i14 = iX / 18;
        long[] jArrCopyOf = new long[i14];
        long[] jArrCopyOf2 = new long[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            long jO = rVar.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                break;
            }
            jArrCopyOf[i15] = jO;
            jArrCopyOf2[i15] = rVar.o();
            rVar.H(2);
        }
        rVar.H((int) (j8 - ((long) rVar.f70055b)));
        return new v.a(jArrCopyOf, jArrCopyOf2);
    }
}

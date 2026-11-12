package m63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lm63/k2;", "Li63/c;", "Lg53/b;", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k2 implements i63.c<g53.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f116972a = new k2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f116973b = new q1("kotlin.uuid.Uuid", k63.d.i.f103232a);

    private k2() {
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        g53.b.a aVar = g53.b.f75983c;
        String strS = eVar.s();
        aVar.getClass();
        strS.getClass();
        int length = strS.length();
        int i14 = 0;
        if (length == 32) {
            long j8 = 0;
            while (i14 < 16) {
                long j14 = j8 << 4;
                char cCharAt = strS.charAt(i14);
                if ((cCharAt >>> '\b') == 0) {
                    long j15 = d53.f.f57682b[cCharAt];
                    if (j15 >= 0) {
                        j8 = j14 | j15;
                        i14++;
                    }
                }
                g53.d.c(i14, strS, "a hexadecimal digit");
                throw null;
            }
            long j16 = 0;
            for (int i15 = 16; i15 < 32; i15++) {
                long j17 = j16 << 4;
                char cCharAt2 = strS.charAt(i15);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j18 = d53.f.f57682b[cCharAt2];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                g53.d.c(i15, strS, "a hexadecimal digit");
                throw null;
            }
            g53.b.f75983c.getClass();
            return g53.b.a.a(j8, j16);
        }
        if (length != 36) {
            StringBuilder sb3 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            sb3.append(strS.length() <= 64 ? strS : strS.substring(0, 64).concat("..."));
            sb3.append("\" of length ");
            sb3.append(strS.length());
            throw new IllegalArgumentException(sb3.toString());
        }
        long j19 = 0;
        while (i14 < 8) {
            long j24 = j19 << 4;
            char cCharAt3 = strS.charAt(i14);
            if ((cCharAt3 >>> '\b') == 0) {
                long j25 = d53.f.f57682b[cCharAt3];
                if (j25 >= 0) {
                    j19 = j24 | j25;
                    i14++;
                }
            }
            g53.d.c(i14, strS, "a hexadecimal digit");
            throw null;
        }
        if (strS.charAt(8) != '-') {
            g53.d.c(8, strS, "'-' (hyphen)");
            throw null;
        }
        long j26 = 0;
        for (int i16 = 9; i16 < 13; i16++) {
            long j27 = j26 << 4;
            char cCharAt4 = strS.charAt(i16);
            if ((cCharAt4 >>> '\b') == 0) {
                long j28 = d53.f.f57682b[cCharAt4];
                if (j28 >= 0) {
                    j26 = j27 | j28;
                }
            }
            g53.d.c(i16, strS, "a hexadecimal digit");
            throw null;
        }
        if (strS.charAt(13) != '-') {
            g53.d.c(13, strS, "'-' (hyphen)");
            throw null;
        }
        long j29 = 0;
        for (int i17 = 14; i17 < 18; i17++) {
            long j34 = j29 << 4;
            char cCharAt5 = strS.charAt(i17);
            if ((cCharAt5 >>> '\b') == 0) {
                long j35 = d53.f.f57682b[cCharAt5];
                if (j35 >= 0) {
                    j29 = j34 | j35;
                }
            }
            g53.d.c(i17, strS, "a hexadecimal digit");
            throw null;
        }
        if (strS.charAt(18) != '-') {
            g53.d.c(18, strS, "'-' (hyphen)");
            throw null;
        }
        long j36 = 0;
        for (int i18 = 19; i18 < 23; i18++) {
            long j37 = j36 << 4;
            char cCharAt6 = strS.charAt(i18);
            if ((cCharAt6 >>> '\b') == 0) {
                long j38 = d53.f.f57682b[cCharAt6];
                if (j38 >= 0) {
                    j36 = j37 | j38;
                }
            }
            g53.d.c(i18, strS, "a hexadecimal digit");
            throw null;
        }
        if (strS.charAt(23) != '-') {
            g53.d.c(23, strS, "'-' (hyphen)");
            throw null;
        }
        long j39 = 0;
        for (int i19 = 24; i19 < 36; i19++) {
            long j44 = j39 << 4;
            char cCharAt7 = strS.charAt(i19);
            if ((cCharAt7 >>> '\b') == 0) {
                long j45 = d53.f.f57682b[cCharAt7];
                if (j45 >= 0) {
                    j39 = j44 | j45;
                }
            }
            g53.d.c(i19, strS, "a hexadecimal digit");
            throw null;
        }
        g53.b.f75983c.getClass();
        return g53.b.a.a((j19 << 32) | (j26 << 16) | j29, (j36 << 48) | j39);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return f116973b;
    }

    @Override // i63.i
    public final void serialize(l63.f fVar, Object obj) {
        g53.b bVar = (g53.b) obj;
        bVar.getClass();
        fVar.p(bVar.toString());
    }
}

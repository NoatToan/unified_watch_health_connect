package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class xjh extends de {
    public static final BigInteger e = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f39188b;
    public int[] c;
    public int[] d;

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jd jdVar2 = new jd();
        jd jdVar3 = new jd();
        int i = 0;
        while (true) {
            int[] iArr = this.f39188b;
            if (i >= iArr.length) {
                jd jdVar4 = new jd();
                jdVar4.a(new wd(this.f39187a));
                jdVar4.a(new yg5(jdVar));
                jdVar4.a(new yg5(jdVar2));
                jdVar4.a(new yg5(jdVar3));
                return new yg5(jdVar4);
            }
            jdVar.a(new wd(iArr[i]));
            jdVar2.a(new wd(this.c[i]));
            jdVar3.a(new wd(this.d[i]));
            i++;
        }
    }
}

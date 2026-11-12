package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class wjh extends be {
    public static final BigInteger e = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f38030b;
    public int[] c;
    public int[] d;

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        id idVar2 = new id();
        id idVar3 = new id();
        int i = 0;
        while (true) {
            int[] iArr = this.f38030b;
            if (i >= iArr.length) {
                id idVar4 = new id();
                idVar4.a(new vd(this.f38029a));
                idVar4.a(new xg5(idVar));
                idVar4.a(new xg5(idVar2));
                idVar4.a(new xg5(idVar3));
                return new xg5(idVar4);
            }
            idVar.a(new vd(iArr[i]));
            idVar2.a(new vd(this.c[i]));
            idVar3.a(new vd(this.d[i]));
            i++;
        }
    }
}

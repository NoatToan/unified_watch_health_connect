package as2;

import e13.o;
import e13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@o13.e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Las2/h;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h {
    public static o m(ul2.c cVar, byte[] bArr, String str) {
        cVar.getClass();
        bArr.getClass();
        p pVarH = w13.b.h(cVar, bArr);
        a73.j jVar = new a73.j(new defpackage.b(str, 13), 23);
        int i14 = w03.b.f181178a;
        return new o(pVarH, jVar);
    }

    public static z03.j n(ul2.c cVar, byte[] bArr) {
        cVar.getClass();
        bArr.getClass();
        return new z03.j(m(cVar, wq2.a.b(bArr), "Select SD Failed"));
    }
}

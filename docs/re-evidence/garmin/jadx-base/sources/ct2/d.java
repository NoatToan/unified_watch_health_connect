package ct2;

import e23.l;
import hq2.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p13.s;
import tn2.w;
import z03.j;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f55536b;

    public /* synthetic */ d(byte[] bArr, int i14) {
        this.f55535a = i14;
        this.f55536b = bArr;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws IOException {
        int i14 = this.f55535a;
        byte[] bArr = this.f55536b;
        switch (i14) {
            case 0:
                ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) obj;
                int i15 = f.f55541g;
                byteArrayOutputStream.getClass();
                byteArrayOutputStream.write(bArr);
                return Unit.INSTANCE;
            case 1:
                byte[] bArr2 = (byte[]) obj;
                Logger logger = r.f85270f;
                bArr2.getClass();
                return q03.r.f(new p(bArr, bArr2));
            case 2:
                wl2.b bVar = (wl2.b) obj;
                Logger logger2 = w.f165679d;
                bVar.getClass();
                j jVar = new j(q03.r.e(bVar.k(0L, bArr)).g(l13.a.f108328c));
                hq2.d dVar = new hq2.d(bVar, 2);
                w03.a.d dVar2 = w03.a.f181172c;
                w03.a.c cVar = w03.a.f181171b;
                return jVar.f(dVar2, dVar2, cVar, dVar, cVar, cVar);
            default:
                byte[] bArr3 = (byte[]) obj;
                Logger logger3 = w.f165679d;
                bArr3.getClass();
                byte[] bArr4 = {-16};
                bArr.getClass();
                return s.q(s.q(bArr4, bArr), bArr3);
        }
    }
}

package lb;

import androidx.media3.common.w;
import fa.q;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends kb.b {
    @Override // kb.b
    public final w b(kb.a aVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            q qVar = new q(byteBuffer.array(), byteBuffer.limit());
            qVar.o(12);
            int iD = (qVar.d() + qVar.g(12)) - 4;
            qVar.o(44);
            qVar.p(qVar.g(12));
            qVar.o(16);
            ArrayList arrayList = new ArrayList();
            while (qVar.d() < iD) {
                qVar.o(48);
                int iG = qVar.g(8);
                qVar.o(4);
                int iD2 = qVar.d() + qVar.g(12);
                String str = null;
                String str2 = null;
                while (qVar.d() < iD2) {
                    int iG2 = qVar.g(8);
                    int iG3 = qVar.g(8);
                    int iD3 = qVar.d() + iG3;
                    if (iG2 == 2) {
                        int iG4 = qVar.g(16);
                        qVar.o(8);
                        if (iG4 == 3) {
                            while (qVar.d() < iD3) {
                                int iG5 = qVar.g(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iG5];
                                qVar.j(iG5, bArr);
                                str = new String(bArr, charset);
                                int iG6 = qVar.g(8);
                                for (int i14 = 0; i14 < iG6; i14++) {
                                    qVar.p(qVar.g(8));
                                }
                            }
                        }
                    } else if (iG2 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iG3];
                        qVar.j(iG3, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    qVar.m(iD3 * 8);
                }
                qVar.m(iD2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new a(iG, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new w(arrayList);
            }
        }
        return null;
    }
}

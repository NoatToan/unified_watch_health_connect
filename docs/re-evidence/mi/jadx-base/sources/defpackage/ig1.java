package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ig1 extends adm {
    public static Metadata c(nkh nkhVar) {
        nkhVar.r(12);
        int iD = (nkhVar.d() + nkhVar.h(12)) - 4;
        nkhVar.r(44);
        nkhVar.s(nkhVar.h(12));
        nkhVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (nkhVar.d() >= iD) {
                break;
            }
            nkhVar.r(48);
            int iH = nkhVar.h(8);
            nkhVar.r(4);
            int iD2 = nkhVar.d() + nkhVar.h(12);
            String strL2 = null;
            while (nkhVar.d() < iD2) {
                int iH2 = nkhVar.h(8);
                int iH3 = nkhVar.h(8);
                int iD3 = nkhVar.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = nkhVar.h(16);
                    nkhVar.r(8);
                    if (iH4 == 3) {
                        while (nkhVar.d() < iD3) {
                            strL = nkhVar.l(nkhVar.h(8), bu3.f4606a);
                            int iH5 = nkhVar.h(8);
                            for (int i = 0; i < iH5; i++) {
                                nkhVar.s(nkhVar.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = nkhVar.l(iH3, bu3.f4606a);
                }
                nkhVar.p(iD3 * 8);
            }
            nkhVar.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new AppInfoTable(iH, strL2.length() != 0 ? strL.concat(strL2) : new String(strL)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // defpackage.adm
    public Metadata b(mtf mtfVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new nkh(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}

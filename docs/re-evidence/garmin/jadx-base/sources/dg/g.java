package dg;

import java.io.FileNotFoundException;
import java.io.IOException;
import w63.f0;
import w63.y;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public static void a(w63.l lVar, y yVar) {
        if (lVar.k(yVar)) {
            return;
        }
        f0 f0VarV = lVar.v(yVar, false);
        t.a aVar = t.f59501a;
        try {
            f0VarV.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void b(w63.l lVar, y yVar) throws IOException {
        try {
            IOException iOException = null;
            for (y yVar2 : lVar.l(yVar)) {
                try {
                    if (lVar.n(yVar2).f183380b) {
                        b(lVar, yVar2);
                    }
                    lVar.f(yVar2);
                } catch (IOException e4) {
                    if (iOException == null) {
                        iOException = e4;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}

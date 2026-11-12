package defpackage;

import com.xiaomi.push.c;
import com.xiaomi.push.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qns {
    public abstract int a();

    public abstract qns b(cas casVar);

    public qns c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public qns d(byte[] bArr, int i, int i2) throws d {
        try {
            cas casVarG = cas.g(bArr, i, i2);
            b(casVarG);
            casVarG.j(0);
            return this;
        } catch (d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public abstract void e(c cVar);

    public void f(byte[] bArr, int i, int i2) {
        try {
            c cVarP = c.p(bArr, i, i2);
            e(cVarP);
            cVarP.K();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    public boolean g(cas casVar, int i) {
        return casVar.m(i);
    }

    public byte[] h() {
        int i = i();
        byte[] bArr = new byte[i];
        f(bArr, 0, i);
        return bArr;
    }

    public abstract int i();
}

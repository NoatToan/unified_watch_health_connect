package ol2;

import com.google.common.util.concurrent.Futures;
import dz2.f;
import java.io.IOException;
import java.io.OutputStream;
import ml2.s;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f132875a;

    public b(s sVar) {
        if (sVar != null) {
            this.f132875a = sVar;
        } else {
            h.s("service is null");
            throw null;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i14, int i15) {
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, i14, bArr2, 0, i15);
        Futures.getChecked(this.f132875a.g(new f(bArr2)), IOException.class);
    }

    @Override // java.io.OutputStream
    public final void write(int i14) {
        write(new byte[]{(byte) i14}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}

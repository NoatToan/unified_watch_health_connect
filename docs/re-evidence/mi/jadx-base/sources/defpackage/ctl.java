package defpackage;

import android.os.RemoteException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class ctl extends btl {
    public zdi e;

    public ctl(String str, zdi zdiVar) {
        super(str, 240);
        this.e = zdiVar;
    }

    @Override // defpackage.btl
    public void d(fhj fhjVar) throws RemoteException {
        int i = fhjVar.d;
        zdi zdiVar = this.e;
        if (zdiVar != null) {
            zdiVar.a(i);
        }
    }

    @Override // defpackage.btl
    public void e(int i, String str) throws RemoteException {
        zdi zdiVar = this.e;
        if (zdiVar != null) {
            if (i != 0) {
                zdiVar.onFail(i, str);
            } else {
                c("addWriteCallbackCode write data success", new Object[0]);
            }
        }
    }

    @Override // defpackage.btl
    public byte[] f() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) g(5)).putShort((short) k()).put((byte) -16);
        return byteBufferOrder.array();
    }
}

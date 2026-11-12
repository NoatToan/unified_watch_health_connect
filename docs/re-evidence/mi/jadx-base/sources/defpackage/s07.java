package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class s07 extends btl {
    public l5n e;
    public r07 f;

    public s07(String str, l5n l5nVar, r07 r07Var) {
        super(str, 5);
        this.f29176a = "DoActionPacket";
        this.e = l5nVar;
        this.f = r07Var;
    }

    @Override // defpackage.btl
    public void d(fhj fhjVar) {
        t07 t07Var = (t07) fhjVar;
        int iJ = t07Var.j();
        r07 r07Var = this.f;
        if (r07Var != null) {
            if (iJ == 0) {
                r07Var.a(t07Var.i());
            } else {
                r07Var.onFail(iJ, "code from device spec code");
            }
        }
    }

    @Override // defpackage.btl
    public void e(int i, String str) {
        if (i == 0) {
            c("addWriteCallbackCode write data to ble success", new Object[0]);
            return;
        }
        r07 r07Var = this.f;
        if (r07Var != null) {
            if (str == null) {
                str = "code from ble,write data to ble fail";
            }
            r07Var.onFail(i, str);
        }
    }

    @Override // defpackage.btl
    public byte[] f() {
        l5n l5nVar = this.e;
        if (l5nVar == null) {
            a("buildBytes, but action entity is null", new Object[0]);
            return new byte[0];
        }
        int size = l5nVar.b().size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int iCapacity = 8;
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBufferM = m(this.e.b().get(i));
            byteBufferArr[i] = byteBufferM;
            iCapacity += byteBufferM.capacity();
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iCapacity).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) g(iCapacity)).putShort((short) this.d).put((byte) 5).put((byte) this.e.c()).put((byte) this.e.a()).put((byte) size);
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                byteBufferOrder.put(byteBufferArr[i2].array());
            }
        }
        return byteBufferOrder.array();
    }

    public final ByteBuffer m(q5n q5nVar) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i(q5nVar) + 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) q5nVar.b());
        byteBufferOrder.putShort((short) j(q5nVar));
        l(byteBufferOrder, q5nVar.f(), q5nVar.e());
        return byteBufferOrder;
    }
}

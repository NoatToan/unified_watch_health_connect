package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class xya extends btl {
    public List<q5n> e;
    public wya f;

    public xya(String str, List<q5n> list, wya wyaVar) {
        super(str, 2);
        this.f29176a = "GetPropertyPacket";
        this.e = list;
        this.f = wyaVar;
    }

    private ByteBuffer m(q5n q5nVar) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(3).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) q5nVar.d());
        byteBufferOrder.putShort((short) q5nVar.b());
        return byteBufferOrder;
    }

    @Override // defpackage.btl
    public void d(fhj fhjVar) {
        yya yyaVar = (yya) fhjVar;
        wya wyaVar = this.f;
        if (wyaVar != null) {
            wyaVar.a(yyaVar.g);
        }
    }

    @Override // defpackage.btl
    public void e(int i, String str) {
        wya wyaVar = this.f;
        if (wyaVar != null) {
            if (i != 0) {
                wyaVar.onFail(i, str);
            } else {
                c("addWriteCallbackCode ,write data success ", new Object[0]);
            }
        }
    }

    @Override // defpackage.btl
    public byte[] f() {
        List<q5n> list = this.e;
        if (list == null || list.isEmpty()) {
            return new byte[0];
        }
        int size = this.e.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        Iterator<q5n> it = this.e.iterator();
        int iCapacity = 6;
        int i = 0;
        while (it.hasNext()) {
            ByteBuffer byteBufferM = m(it.next());
            byteBufferArr[i] = byteBufferM;
            iCapacity += byteBufferM.capacity();
            i++;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iCapacity).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) g(iCapacity)).putShort((short) this.d).put((byte) 2).put((byte) size);
        for (int i2 = 0; i2 < size; i2++) {
            byteBufferOrder.put(byteBufferArr[i2].array());
        }
        return byteBufferOrder.array();
    }
}

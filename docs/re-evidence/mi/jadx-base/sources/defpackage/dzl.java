package defpackage;

import com.miot.spec.entity.SpecValueType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class dzl extends btl {
    public List<q5n> e;
    public czl f;

    public dzl(String str, List<q5n> list, czl czlVar) {
        super(str, 0);
        this.f29176a = "SetPropertyPacket";
        this.e = list;
        this.f = czlVar;
    }

    @Override // defpackage.btl
    public void d(fhj fhjVar) {
        List<ezl.a> list = ((ezl) fhjVar).g;
        for (q5n q5nVar : this.e) {
            for (ezl.a aVar : list) {
                if (aVar.f17227a == q5nVar.d() && aVar.f17228b == q5nVar.b()) {
                    q5nVar.m(aVar.c);
                }
            }
        }
        czl czlVar = this.f;
        if (czlVar != null) {
            czlVar.a(this.e);
        }
    }

    @Override // defpackage.btl
    public void e(int i, String str) {
        czl czlVar = this.f;
        if (czlVar != null) {
            if (i != 0) {
                czlVar.onFail(i, str);
            } else {
                c("addWriteCallbackCode write data success", new Object[0]);
            }
        }
    }

    @Override // defpackage.btl
    public byte[] f() {
        List<q5n> list = this.e;
        if (list == null || list.isEmpty()) {
            a("buildBytes ,property list is null or empty", new Object[0]);
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
        byteBufferOrder.putShort((short) g(iCapacity)).putShort((short) this.d).put((byte) 0).put((byte) size);
        for (int i2 = 0; i2 < size; i2++) {
            byteBufferOrder.put(byteBufferArr[i2].array());
        }
        return byteBufferOrder.array();
    }

    public final ByteBuffer m(q5n q5nVar) {
        SpecValueType specValueTypeF = q5nVar.f();
        Object objE = q5nVar.e();
        int iD = q5nVar.d();
        int iB = q5nVar.b();
        int iJ = j(q5nVar);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i(q5nVar) + 5).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) iD);
        byteBufferOrder.putShort((short) iB);
        byteBufferOrder.putShort((short) iJ);
        l(byteBufferOrder, specValueTypeF, objE);
        return byteBufferOrder;
    }
}

package defpackage;

import com.miot.spec.entity.SpecValueType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ndi extends fhj {
    public List<q5n> g;

    public ndi(String str, int i, int i2, int i3, ByteBuffer byteBuffer) {
        super(str, i, i2, i3, byteBuffer);
        this.g = new ArrayList();
    }

    @Override // defpackage.fhj
    public void h(ByteBuffer byteBuffer) {
        int iD = v73.d(byteBuffer.get());
        for (int i = 0; i < iD; i++) {
            int iD2 = v73.d(byteBuffer.get());
            int iD3 = this.d == 1 ? v73.d(byteBuffer.get()) : v73.g(byteBuffer.getShort());
            short s = byteBuffer.getShort();
            int iD4 = d(s);
            int iG = g(s);
            SpecValueType specValueTypeConvert2ValueType = SpecValueType.convert2ValueType(iD4);
            byte[] bArr = new byte[iG];
            byteBuffer.get(bArr);
            this.g.add(q5n.i(iD2, iD3, specValueTypeConvert2ValueType, SpecValueType.convertBytes2Value(specValueTypeConvert2ValueType, bArr)));
        }
    }

    public List<q5n> i() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("PropertyChangedPacket={");
        sb.append("frameLength=");
        sb.append(this.e);
        sb.append(",tid=");
        sb.append(this.f);
        sb.append(",opcode=");
        sb.append(this.f29177b);
        List<q5n> list = this.g;
        if (list == null || list.isEmpty()) {
            sb.append(", property list size=0");
        } else {
            for (q5n q5nVar : this.g) {
                sb.append(",");
                sb.append(q5nVar.toString());
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

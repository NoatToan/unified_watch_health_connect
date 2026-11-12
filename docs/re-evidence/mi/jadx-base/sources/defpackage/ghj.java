package defpackage;

import com.miot.spec.exception.ProtocolVersionIsLowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class ghj {
    public static fhj a(String str, byte[] bArr) throws ProtocolVersionIsLowException {
        fhj zd8Var = null;
        if (bArr == null || bArr.length < 5) {
            n5n.b("ReceivePacketParser", "receive byte[] value length less than 5, invalid data!!!", new Object[0]);
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        short s = byteBufferOrder.getShort();
        int iG = v73.g(byteBufferOrder.getShort());
        int iD = v73.d(byteBufferOrder.get());
        if (iD == 1) {
            zd8Var = new ezl(str, s, iG, iD, byteBufferOrder);
        } else if (iD == 3) {
            zd8Var = new yya(str, s, iG, iD, byteBufferOrder);
        } else if (iD == 6) {
            zd8Var = new t07(str, s, iG, iD, byteBufferOrder);
        } else if (iD == 4) {
            zd8Var = new ndi(str, s, iG, iD, byteBufferOrder);
            p5n.i().x(str, zd8Var.d);
        } else if (iD == 7) {
            zd8Var = new zd8(str, s, iG, iD, byteBufferOrder);
            p5n.i().x(str, zd8Var.d);
        } else if (iD == 240) {
            aei aeiVar = new aei(str, s, iG, iD, byteBufferOrder);
            p5n.i().x(str, aeiVar.d);
            return aeiVar;
        }
        if (zd8Var == null) {
            n5n.a("ReceivePacketParser", "parse byte[],opCode %d is not support", Integer.valueOf(iD));
        } else {
            if (zd8Var.d > 2) {
                throw new ProtocolVersionIsLowException();
            }
            zd8Var.h(byteBufferOrder);
        }
        return zd8Var;
    }
}

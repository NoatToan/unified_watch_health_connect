package defpackage;

import com.miot.spec.entity.SpecValueType;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class t07 extends fhj {
    public int g;
    public JSONArray h;

    public t07(String str, int i, int i2, int i3, ByteBuffer byteBuffer) {
        super(str, i, i2, i3, byteBuffer);
        this.h = new JSONArray();
    }

    @Override // defpackage.fhj
    public void h(ByteBuffer byteBuffer) {
        this.g = v73.g(byteBuffer.getShort());
        if (byteBuffer.hasRemaining()) {
            int iD = v73.d(byteBuffer.get());
            for (int i = 0; i < iD; i++) {
                try {
                    int iD2 = this.d == 1 ? v73.d(byteBuffer.get()) : v73.g(byteBuffer.getShort());
                    short s = byteBuffer.getShort();
                    int iD3 = d(s);
                    int iG = g(s);
                    SpecValueType specValueTypeConvert2ValueType = SpecValueType.convert2ValueType(iD3);
                    byte[] bArr = new byte[iG];
                    byteBuffer.get(bArr);
                    q5n q5nVarI = q5n.i(-1, iD2, specValueTypeConvert2ValueType, SpecValueType.convertBytes2Value(specValueTypeConvert2ValueType, bArr));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("piid", q5nVarI.b());
                    if (q5nVarI.f() != null) {
                        jSONObject.put("type", (int) q5nVarI.f().value());
                        jSONObject.put("value", q5n.g(q5nVarI.f()) ? q5nVarI.c() : q5nVarI.e());
                    }
                    this.h.put(jSONObject);
                } catch (Exception unused) {
                    MiJiaLog.writeLogOnAll(LogType.KUAILIAN, this.f29176a, "parseChild action prop failed!");
                    return;
                }
            }
        }
    }

    public JSONArray i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("DoActionRespPacket={");
        sb.append("frameLength=");
        sb.append(this.e);
        sb.append(",tid=");
        sb.append(this.f);
        sb.append(",opcode=");
        sb.append(this.f29177b);
        sb.append(",respCode=");
        sb.append(this.g);
        sb.append(", prop=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}

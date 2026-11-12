package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.xiaomi.ai.api.common.Utils;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class b2h extends StdSerializer<Object> {
    public b2h() {
        super(Object.class);
    }

    public final void a(JsonGenerator jsonGenerator) throws IOException {
        StringBuilder sb;
        String string;
        StringBuilder sb2 = new StringBuilder();
        fud fudVarY = jsonGenerator.y();
        Object objC = fudVarY.c();
        while (fudVarY != null) {
            String strB = "]";
            if (fudVarY.h()) {
                string = "[" + objC.getClass().getName() + "]";
            } else {
                if (fudVarY.f()) {
                    sb = new StringBuilder();
                    sb.append("/[");
                    sb.append(fudVarY.a());
                } else {
                    sb = new StringBuilder();
                    sb.append("/");
                    strB = fudVarY.b();
                }
                sb.append(strB);
                string = sb.toString();
            }
            sb2.insert(0, string);
            if (fudVarY.c() != null) {
                objC = fudVarY.c();
            }
            fudVarY = fudVarY.e();
        }
        Utils.dumpValue(objC, sb2);
        throw new JsonGenerationException(String.format("Missing required value: %s", sb2.toString()));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        a(jsonGenerator);
    }

    @Override // defpackage.eud
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        a(jsonGenerator);
    }
}

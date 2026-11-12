package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface bud {

    public static abstract class a implements bud {
        public boolean g(wwl wwlVar) {
            return false;
        }
    }

    void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException;

    void serializeWithType(JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException;
}

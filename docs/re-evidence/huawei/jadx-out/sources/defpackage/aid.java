package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class aid implements JsonSerializable {
    protected Object e;

    public aid(String str) {
        this.e = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj = this.e;
        if (obj instanceof JsonSerializable) {
            ((JsonSerializable) obj).serialize(jsonGenerator, serializerProvider);
        } else {
            a(jsonGenerator);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object obj = this.e;
        if (obj instanceof JsonSerializable) {
            ((JsonSerializable) obj).serializeWithType(jsonGenerator, serializerProvider, typeSerializer);
        } else if (obj instanceof SerializableString) {
            serialize(jsonGenerator, serializerProvider);
        }
    }

    public void c(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.e;
        if (obj instanceof JsonSerializable) {
            jsonGenerator.writeObject(obj);
        } else {
            a(jsonGenerator);
        }
    }

    protected void a(JsonGenerator jsonGenerator) throws IOException {
        Object obj = this.e;
        if (obj instanceof SerializableString) {
            jsonGenerator.writeRawValue((SerializableString) obj);
        } else {
            jsonGenerator.writeRawValue(String.valueOf(obj));
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aid)) {
            return false;
        }
        Object obj2 = this.e;
        Object obj3 = ((aid) obj).e;
        if (obj2 == obj3) {
            return true;
        }
        return obj2 != null && obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return String.format("[RawValue of type %s]", ahw.b(this.e));
    }
}

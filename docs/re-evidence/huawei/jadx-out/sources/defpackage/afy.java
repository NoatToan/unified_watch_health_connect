package defpackage;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class afy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f377a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f378c;
    public final ObjectIdGenerator<?> d;

    public afy(ObjectIdGenerator<?> objectIdGenerator) {
        this.d = objectIdGenerator;
    }

    public boolean d(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, afj afjVar) throws IOException {
        if (this.f378c == null) {
            return false;
        }
        if (!this.f377a && !afjVar.f360b) {
            return false;
        }
        if (jsonGenerator.canWriteObjectId()) {
            jsonGenerator.writeObjectRef(String.valueOf(this.f378c));
            return true;
        }
        afjVar.d.serialize(this.f378c, jsonGenerator, serializerProvider);
        return true;
    }

    public Object d(Object obj) {
        if (this.f378c == null) {
            this.f378c = this.d.generateId(obj);
        }
        return this.f378c;
    }

    public void e(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, afj afjVar) throws IOException {
        this.f377a = true;
        if (jsonGenerator.canWriteObjectId()) {
            Object obj = this.f378c;
            jsonGenerator.writeObjectId(obj == null ? null : String.valueOf(obj));
            return;
        }
        SerializableString serializableString = afjVar.e;
        if (serializableString != null) {
            jsonGenerator.writeFieldName(serializableString);
            afjVar.d.serialize(this.f378c, jsonGenerator, serializerProvider);
        }
    }
}

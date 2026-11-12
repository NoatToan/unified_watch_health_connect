package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class zw extends StdDeserializer<Object> {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f54658a;

    public zw(String str) {
        this(Object.class, str);
    }

    public zw(Class<?> cls, String str) {
        super(cls);
        this.f54658a = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportInputMismatch(this, this.f54658a, new Object[0]);
        return null;
    }
}

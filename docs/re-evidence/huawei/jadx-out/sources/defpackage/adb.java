package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;

/* JADX INFO: loaded from: classes21.dex */
public class adb extends ObjectMapper {
    private static final long serialVersionUID = 1;

    public adb() {
        this(new JsonFactory());
    }

    public adb(JsonFactory jsonFactory) {
        super(jsonFactory);
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.Versioned
    public wu version() {
        return za.e;
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, com.fasterxml.jackson.core.ObjectCodec
    public JsonFactory getFactory() {
        return this.j;
    }
}

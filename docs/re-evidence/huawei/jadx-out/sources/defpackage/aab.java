package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class aab implements NullValueProvider, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JsonDeserializer<?> f61b;

    public aab(JsonDeserializer<?> jsonDeserializer) {
        this.f61b = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object getNullValue(DeserializationContext deserializationContext) throws ym {
        return this.f61b.getEmptyValue(deserializationContext);
    }
}

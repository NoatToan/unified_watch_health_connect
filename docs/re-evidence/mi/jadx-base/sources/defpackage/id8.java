package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class id8 extends esd<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Error f21019a;

    public id8(NoClassDefFoundError noClassDefFoundError) {
        this.f21019a = noClassDefFoundError;
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw this.f21019a;
    }
}

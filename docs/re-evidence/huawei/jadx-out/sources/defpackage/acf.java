package defpackage;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ext.Java7Handlers;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes21.dex */
public class acf extends Java7Handlers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f242a = Path.class;

    @Override // com.fasterxml.jackson.databind.ext.Java7Handlers
    public Class<?> getClassJavaNioFilePath() {
        return this.f242a;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Handlers
    public JsonDeserializer<?> getDeserializerForJavaNioFilePath(Class<?> cls) {
        if (cls == this.f242a) {
            return new acb();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Handlers
    public JsonSerializer<?> getSerializerForJavaNioFilePath(Class<?> cls) {
        if (this.f242a.isAssignableFrom(cls)) {
            return new acc();
        }
        return null;
    }
}

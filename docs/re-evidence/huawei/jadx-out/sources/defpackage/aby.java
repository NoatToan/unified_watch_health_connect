package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes21.dex */
public class aby extends ym {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f236b;

    protected aby(JsonParser jsonParser, String str, JavaType javaType, Throwable th) {
        super(jsonParser, str, th);
        this.f236b = javaType;
    }

    protected aby(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this.f236b = javaType;
    }

    public static aby e(JsonParser jsonParser, String str, JavaType javaType) {
        return new aby(jsonParser, str, javaType);
    }

    public static aby c(JsonParser jsonParser, String str, JavaType javaType, Throwable th) {
        return new aby(jsonParser, str, javaType, th);
    }
}

package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes21.dex */
public class abw extends aca {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f235c;
    protected final JavaType d;

    public abw(JsonParser jsonParser, String str, JavaType javaType, String str2) {
        super(jsonParser, str);
        this.d = javaType;
        this.f235c = str2;
    }

    public static abw d(JsonParser jsonParser, String str, JavaType javaType, String str2) {
        return new abw(jsonParser, str, javaType, str2);
    }
}

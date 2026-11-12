package defpackage;

import com.fasterxml.jackson.core.JsonParser;

/* JADX INFO: loaded from: classes21.dex */
public class abs extends aca {
    private static final long serialVersionUID = 1;
    protected final Object d;

    public abs(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        super(jsonParser, str, cls);
        this.d = obj;
    }

    public static abs b(JsonParser jsonParser, String str, Object obj, Class<?> cls) {
        return new abs(jsonParser, str, obj, cls);
    }
}

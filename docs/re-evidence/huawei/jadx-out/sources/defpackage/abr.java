package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.PropertyBindingException;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
public class abr extends PropertyBindingException {
    private static final long serialVersionUID = 1;

    public abr(JsonParser jsonParser, String str, wq wqVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, wqVar, cls, str2, collection);
    }

    public static abr d(JsonParser jsonParser, Object obj, String str, Collection<Object> collection) {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        Class<?> cls2 = cls;
        abr abrVar = new abr(jsonParser, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", str, cls2.getName()), jsonParser.getCurrentLocation(), cls2, str, collection);
        abrVar.prependPath(obj, str);
        return abrVar;
    }
}

package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.exc.PropertyBindingException;
import java.util.Collection;

/* JADX INFO: loaded from: classes21.dex */
public class abx extends PropertyBindingException {
    private static final long serialVersionUID = 1;

    public abx(JsonParser jsonParser, String str, wq wqVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, wqVar, cls, str2, collection);
    }

    public static abx b(JsonParser jsonParser, Object obj, String str, Collection<Object> collection) {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        Class<?> cls2 = cls;
        abx abxVar = new abx(jsonParser, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", str, cls2.getName()), jsonParser.getCurrentLocation(), cls2, str, collection);
        abxVar.prependPath(obj, str);
        return abxVar;
    }
}

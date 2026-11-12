package defpackage;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class aan extends BeanProperty.d {
    private static final long serialVersionUID = 1;
    protected final Object h;

    public aan(ys ysVar, JavaType javaType, AnnotatedMember annotatedMember, Object obj) {
        super(ysVar, javaType, null, annotatedMember, yq.f53745a);
        this.h = obj;
    }

    public Object a(DeserializationContext deserializationContext, Object obj) throws ym {
        return deserializationContext.findInjectableValue(this.h, this, obj);
    }

    public void e(DeserializationContext deserializationContext, Object obj) throws IOException {
        this.f4091c.setValue(obj, a(deserializationContext, obj));
    }
}

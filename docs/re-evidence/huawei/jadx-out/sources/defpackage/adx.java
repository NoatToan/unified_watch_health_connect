package defpackage;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class adx extends AbstractTypeResolver implements Serializable {
    private static final long serialVersionUID = 1;
    protected final HashMap<ahd, Class<?>> d = new HashMap<>();

    @Override // com.fasterxml.jackson.databind.AbstractTypeResolver
    public JavaType resolveAbstractType(yi yiVar, BeanDescription beanDescription) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractTypeResolver
    @Deprecated
    public JavaType resolveAbstractType(yi yiVar, JavaType javaType) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractTypeResolver
    public JavaType findTypeMapping(yi yiVar, JavaType javaType) {
        Class<?> cls = this.d.get(new ahd(javaType.getRawClass()));
        if (cls == null) {
            return null;
        }
        return yiVar.getTypeFactory().c(javaType, cls);
    }
}

package defpackage;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.ext.NioPathSerializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.beans.ConstructorProperties;
import java.beans.Transient;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes4.dex */
public class tqd extends sqd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f34941b = ConstructorProperties.class;

    @Override // defpackage.sqd
    public PropertyName a(AnnotatedParameter annotatedParameter) {
        ConstructorProperties annotation;
        AnnotatedWithParams owner = annotatedParameter.getOwner();
        if (owner == null || (annotation = owner.getAnnotation(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] strArrValue = annotation.value();
        int index = annotatedParameter.getIndex();
        if (index < strArrValue.length) {
            return PropertyName.construct(strArrValue[index]);
        }
        return null;
    }

    @Override // defpackage.sqd
    public Boolean b(fd1 fd1Var) {
        Transient annotation = fd1Var.getAnnotation(Transient.class);
        if (annotation != null) {
            return Boolean.valueOf(annotation.value());
        }
        return null;
    }

    @Override // defpackage.sqd
    public esd<?> c(Class<?> cls) {
        if (cls == Path.class) {
            return new NioPathDeserializer();
        }
        return null;
    }

    @Override // defpackage.sqd
    public eud<?> d(Class<?> cls) {
        if (Path.class.isAssignableFrom(cls)) {
            return new NioPathSerializer();
        }
        return null;
    }

    @Override // defpackage.sqd
    public Boolean e(fd1 fd1Var) {
        if (fd1Var.getAnnotation(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}

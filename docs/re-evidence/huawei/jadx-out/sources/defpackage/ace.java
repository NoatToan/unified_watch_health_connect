package defpackage;

import com.fasterxml.jackson.databind.ext.Java7Support;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* JADX INFO: loaded from: classes21.dex */
public class ace extends Java7Support {
    private final Class<?> e = ConstructorProperties.class;

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public Boolean findTransient(Annotated annotated) {
        Transient annotation = annotated.getAnnotation(Transient.class);
        if (annotation != null) {
            return Boolean.valueOf(annotation.value());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public Boolean hasCreatorAnnotation(Annotated annotated) {
        if (annotated.getAnnotation(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Support
    public ys findConstructorName(acp acpVar) {
        ConstructorProperties annotation;
        AnnotatedWithParams annotatedWithParamsE = acpVar.e();
        if (annotatedWithParamsE == null || (annotation = annotatedWithParamsE.getAnnotation(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] strArrValue = annotation.value();
        int iD = acpVar.d();
        if (iD < strArrValue.length) {
            return ys.c(strArrValue[iD]);
        }
        return null;
    }
}

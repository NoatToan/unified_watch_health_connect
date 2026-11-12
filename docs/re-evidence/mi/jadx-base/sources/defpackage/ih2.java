package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ih2 implements ogg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonInclude.Value f21134a = JsonInclude.Value.empty();

    public boolean A(PropertyName propertyName) {
        return getFullName().equals(propertyName);
    }

    public abstract boolean B();

    public abstract boolean C();

    public boolean D() {
        return C();
    }

    public boolean E() {
        return false;
    }

    public boolean a() {
        return p() != null;
    }

    public boolean b() {
        return k() != null;
    }

    public abstract JsonInclude.Value c();

    public z3h d() {
        return null;
    }

    public String e() {
        AnnotationIntrospector.ReferenceProperty referencePropertyH = h();
        if (referencePropertyH == null) {
            return null;
        }
        return referencePropertyH.b();
    }

    public abstract PropertyName getFullName();

    public abstract PropertyMetadata getMetadata();

    @Override // defpackage.ogg
    public abstract String getName();

    public abstract PropertyName getWrapperName();

    public AnnotationIntrospector.ReferenceProperty h() {
        return null;
    }

    public Class<?>[] i() {
        return null;
    }

    public AnnotatedMember k() {
        AnnotatedMethod annotatedMethodO = o();
        return annotatedMethodO == null ? n() : annotatedMethodO;
    }

    public abstract AnnotatedParameter l();

    public Iterator<AnnotatedParameter> m() {
        return h04.m();
    }

    public abstract AnnotatedField n();

    public abstract AnnotatedMethod o();

    public AnnotatedMember p() {
        AnnotatedParameter annotatedParameterL = l();
        if (annotatedParameterL != null) {
            return annotatedParameterL;
        }
        AnnotatedMethod annotatedMethodX = x();
        return annotatedMethodX == null ? n() : annotatedMethodX;
    }

    public AnnotatedMember r() {
        AnnotatedMethod annotatedMethodX = x();
        return annotatedMethodX == null ? n() : annotatedMethodX;
    }

    public abstract AnnotatedMember s();

    public abstract JavaType u();

    public abstract Class<?> w();

    public abstract AnnotatedMethod x();

    public abstract boolean y();

    public abstract boolean z();
}

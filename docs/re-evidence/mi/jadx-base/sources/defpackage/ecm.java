package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ecm extends ih2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnnotationIntrospector f16503b;
    public final AnnotatedMember c;
    public final PropertyMetadata d;
    public final PropertyName e;
    public final JsonInclude.Value f;

    public ecm(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        this.f16503b = annotationIntrospector;
        this.c = annotatedMember;
        this.e = propertyName;
        this.d = propertyMetadata == null ? PropertyMetadata.STD_OPTIONAL : propertyMetadata;
        this.f = value;
    }

    public static ecm F(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName) {
        return H(mapperConfig, annotatedMember, propertyName, null, ih2.f21134a);
    }

    public static ecm G(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Include include) {
        return new ecm(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, (include == null || include == JsonInclude.Include.USE_DEFAULTS) ? ih2.f21134a : JsonInclude.Value.construct(include, null));
    }

    public static ecm H(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        return new ecm(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, value);
    }

    @Override // defpackage.ih2
    public boolean A(PropertyName propertyName) {
        return this.e.equals(propertyName);
    }

    @Override // defpackage.ih2
    public boolean B() {
        return x() != null;
    }

    @Override // defpackage.ih2
    public boolean C() {
        return false;
    }

    @Override // defpackage.ih2
    public boolean D() {
        return false;
    }

    @Override // defpackage.ih2
    public JsonInclude.Value c() {
        return this.f;
    }

    @Override // defpackage.ih2
    public PropertyName getFullName() {
        return this.e;
    }

    @Override // defpackage.ih2
    public PropertyMetadata getMetadata() {
        return this.d;
    }

    @Override // defpackage.ih2, defpackage.ogg
    public String getName() {
        return this.e.getSimpleName();
    }

    @Override // defpackage.ih2
    public PropertyName getWrapperName() {
        AnnotatedMember annotatedMember;
        AnnotationIntrospector annotationIntrospector = this.f16503b;
        if (annotationIntrospector == null || (annotatedMember = this.c) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(annotatedMember);
    }

    @Override // defpackage.ih2
    public AnnotatedParameter l() {
        AnnotatedMember annotatedMember = this.c;
        if (annotatedMember instanceof AnnotatedParameter) {
            return (AnnotatedParameter) annotatedMember;
        }
        return null;
    }

    @Override // defpackage.ih2
    public Iterator<AnnotatedParameter> m() {
        AnnotatedParameter annotatedParameterL = l();
        return annotatedParameterL == null ? h04.m() : Collections.singleton(annotatedParameterL).iterator();
    }

    @Override // defpackage.ih2
    public AnnotatedField n() {
        AnnotatedMember annotatedMember = this.c;
        if (annotatedMember instanceof AnnotatedField) {
            return (AnnotatedField) annotatedMember;
        }
        return null;
    }

    @Override // defpackage.ih2
    public AnnotatedMethod o() {
        AnnotatedMember annotatedMember = this.c;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).getParameterCount() == 0) {
            return (AnnotatedMethod) this.c;
        }
        return null;
    }

    @Override // defpackage.ih2
    public AnnotatedMember s() {
        return this.c;
    }

    @Override // defpackage.ih2
    public JavaType u() {
        AnnotatedMember annotatedMember = this.c;
        return annotatedMember == null ? TypeFactory.unknownType() : annotatedMember.getType();
    }

    @Override // defpackage.ih2
    public Class<?> w() {
        AnnotatedMember annotatedMember = this.c;
        return annotatedMember == null ? Object.class : annotatedMember.getRawType();
    }

    @Override // defpackage.ih2
    public AnnotatedMethod x() {
        AnnotatedMember annotatedMember = this.c;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).getParameterCount() == 1) {
            return (AnnotatedMethod) this.c;
        }
        return null;
    }

    @Override // defpackage.ih2
    public boolean y() {
        return this.c instanceof AnnotatedParameter;
    }

    @Override // defpackage.ih2
    public boolean z() {
        return this.c instanceof AnnotatedField;
    }
}

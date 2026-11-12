package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.huawei.wearengine.sensor.DataResult;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes21.dex */
public final class yy implements Serializable {
    private static final TimeZone l = TimeZone.getTimeZone(DataResult.UTC);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AccessorNamingStrategy.Provider f53897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final DateFormat f53898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ClassIntrospector f53899c;
    protected final AnnotationIntrospector d;
    protected final Base64Variant e;
    protected final Locale f;
    protected final TimeZone g;
    protected final ahp h;
    protected final PropertyNamingStrategy i;
    protected final HandlerInstantiator j;
    protected final PolymorphicTypeValidator k;
    protected final TypeResolverBuilder<?> o;

    public yy(ClassIntrospector classIntrospector, AnnotationIntrospector annotationIntrospector, PropertyNamingStrategy propertyNamingStrategy, ahp ahpVar, TypeResolverBuilder<?> typeResolverBuilder, DateFormat dateFormat, HandlerInstantiator handlerInstantiator, Locale locale, TimeZone timeZone, Base64Variant base64Variant, PolymorphicTypeValidator polymorphicTypeValidator, AccessorNamingStrategy.Provider provider) {
        this.f53899c = classIntrospector;
        this.d = annotationIntrospector;
        this.i = propertyNamingStrategy;
        this.h = ahpVar;
        this.o = typeResolverBuilder;
        this.f53898b = dateFormat;
        this.j = handlerInstantiator;
        this.f = locale;
        this.g = timeZone;
        this.e = base64Variant;
        this.k = polymorphicTypeValidator;
        this.f53897a = provider;
    }

    public yy e() {
        return new yy(this.f53899c.copy(), this.d, this.i, this.h, this.o, this.f53898b, this.j, this.f, this.g, this.e, this.k, this.f53897a);
    }

    public yy e(ClassIntrospector classIntrospector) {
        return this.f53899c == classIntrospector ? this : new yy(classIntrospector, this.d, this.i, this.h, this.o, this.f53898b, this.j, this.f, this.g, this.e, this.k, this.f53897a);
    }

    public yy e(AnnotationIntrospector annotationIntrospector) {
        return this.d == annotationIntrospector ? this : new yy(this.f53899c, annotationIntrospector, this.i, this.h, this.o, this.f53898b, this.j, this.f, this.g, this.e, this.k, this.f53897a);
    }

    public yy c(AnnotationIntrospector annotationIntrospector) {
        return e(acs.a(annotationIntrospector, this.d));
    }

    public yy d(AnnotationIntrospector annotationIntrospector) {
        return e(acs.a(this.d, annotationIntrospector));
    }

    public yy c(PropertyNamingStrategy propertyNamingStrategy) {
        return this.i == propertyNamingStrategy ? this : new yy(this.f53899c, this.d, propertyNamingStrategy, this.h, this.o, this.f53898b, this.j, this.f, this.g, this.e, this.k, this.f53897a);
    }

    public yy c(AccessorNamingStrategy.Provider provider) {
        return this.f53897a == provider ? this : new yy(this.f53899c, this.d, this.i, this.h, this.o, this.f53898b, this.j, this.f, this.g, this.e, this.k, provider);
    }

    public yy d(ahp ahpVar) {
        return this.h == ahpVar ? this : new yy(this.f53899c, this.d, this.i, ahpVar, this.o, this.f53898b, this.j, this.f, this.g, this.e, this.k, this.f53897a);
    }

    public yy a(TypeResolverBuilder<?> typeResolverBuilder) {
        return this.o == typeResolverBuilder ? this : new yy(this.f53899c, this.d, this.i, this.h, typeResolverBuilder, this.f53898b, this.j, this.f, this.g, this.e, this.k, this.f53897a);
    }

    public yy d(DateFormat dateFormat) {
        if (this.f53898b == dateFormat) {
            return this;
        }
        if (dateFormat != null && l()) {
            dateFormat = b(dateFormat, this.g);
        }
        return new yy(this.f53899c, this.d, this.i, this.h, this.o, dateFormat, this.j, this.f, this.g, this.e, this.k, this.f53897a);
    }

    public yy d(HandlerInstantiator handlerInstantiator) {
        return this.j == handlerInstantiator ? this : new yy(this.f53899c, this.d, this.i, this.h, this.o, this.f53898b, handlerInstantiator, this.f, this.g, this.e, this.k, this.f53897a);
    }

    public yy c(Locale locale) {
        return this.f == locale ? this : new yy(this.f53899c, this.d, this.i, this.h, this.o, this.f53898b, this.j, locale, this.g, this.e, this.k, this.f53897a);
    }

    public yy c(TimeZone timeZone) {
        if (timeZone == this.g) {
            return this;
        }
        return new yy(this.f53899c, this.d, this.i, this.h, this.o, b(this.f53898b, timeZone == null ? l : timeZone), this.j, this.f, timeZone, this.e, this.k, this.f53897a);
    }

    public yy b(Base64Variant base64Variant) {
        return base64Variant == this.e ? this : new yy(this.f53899c, this.d, this.i, this.h, this.o, this.f53898b, this.j, this.f, this.g, base64Variant, this.k, this.f53897a);
    }

    public yy e(PolymorphicTypeValidator polymorphicTypeValidator) {
        return polymorphicTypeValidator == this.k ? this : new yy(this.f53899c, this.d, this.i, this.h, this.o, this.f53898b, this.j, this.f, this.g, this.e, polymorphicTypeValidator, this.f53897a);
    }

    public ClassIntrospector d() {
        return this.f53899c;
    }

    public AnnotationIntrospector a() {
        return this.d;
    }

    public PropertyNamingStrategy j() {
        return this.i;
    }

    public AccessorNamingStrategy.Provider c() {
        return this.f53897a;
    }

    public ahp m() {
        return this.h;
    }

    public TypeResolverBuilder<?> o() {
        return this.o;
    }

    public PolymorphicTypeValidator i() {
        return this.k;
    }

    public DateFormat h() {
        return this.f53898b;
    }

    public HandlerInstantiator g() {
        return this.j;
    }

    public Locale f() {
        return this.f;
    }

    public TimeZone k() {
        TimeZone timeZone = this.g;
        return timeZone == null ? l : timeZone;
    }

    public boolean l() {
        return this.g != null;
    }

    public Base64Variant b() {
        return this.e;
    }

    private DateFormat b(DateFormat dateFormat, TimeZone timeZone) {
        if (dateFormat instanceof aif) {
            return ((aif) dateFormat).a(timeZone);
        }
        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(timeZone);
        return dateFormat2;
    }
}

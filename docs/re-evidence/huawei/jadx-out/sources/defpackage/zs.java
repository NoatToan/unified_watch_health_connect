package defpackage;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.lang.reflect.Member;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class zs {
    protected static final String[] d = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final BeanDescription f54557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected SettableBeanProperty[] f54558b;
    protected final boolean e;
    protected SettableBeanProperty[] g;
    protected SettableBeanProperty[] i;
    protected final boolean j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AnnotatedWithParams[] f54559c = new AnnotatedWithParams[11];
    protected int h = 0;
    protected boolean f = false;

    public zs(BeanDescription beanDescription, MapperConfig<?> mapperConfig) {
        this.f54557a = beanDescription;
        this.e = mapperConfig.canOverrideAccessModifiers();
        this.j = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public ValueInstantiator c(DeserializationContext deserializationContext) throws ym {
        yi config = deserializationContext.getConfig();
        JavaType javaTypeC = c(deserializationContext, this.f54559c[8], this.i);
        JavaType javaTypeC2 = c(deserializationContext, this.f54559c[10], this.f54558b);
        abh abhVar = new abh(config, this.f54557a.getType());
        AnnotatedWithParams[] annotatedWithParamsArr = this.f54559c;
        abhVar.c(annotatedWithParamsArr[0], annotatedWithParamsArr[8], javaTypeC, this.i, annotatedWithParamsArr[9], this.g);
        abhVar.d(this.f54559c[10], javaTypeC2, this.f54558b);
        abhVar.f(this.f54559c[1]);
        abhVar.e(this.f54559c[2]);
        abhVar.h(this.f54559c[3]);
        abhVar.a(this.f54559c[4]);
        abhVar.d(this.f54559c[5]);
        abhVar.b(this.f54559c[6]);
        abhVar.c(this.f54559c[7]);
        return abhVar;
    }

    public void c(AnnotatedWithParams annotatedWithParams) {
        this.f54559c[0] = (AnnotatedWithParams) e(annotatedWithParams);
    }

    public void i(AnnotatedWithParams annotatedWithParams, boolean z) {
        c(annotatedWithParams, 1, z);
    }

    public void c(AnnotatedWithParams annotatedWithParams, boolean z) {
        c(annotatedWithParams, 2, z);
    }

    public void h(AnnotatedWithParams annotatedWithParams, boolean z) {
        c(annotatedWithParams, 3, z);
    }

    public void e(AnnotatedWithParams annotatedWithParams, boolean z) {
        c(annotatedWithParams, 4, z);
    }

    public void a(AnnotatedWithParams annotatedWithParams, boolean z) {
        c(annotatedWithParams, 5, z);
    }

    public void b(AnnotatedWithParams annotatedWithParams, boolean z) {
        c(annotatedWithParams, 6, z);
    }

    public void d(AnnotatedWithParams annotatedWithParams, boolean z) {
        c(annotatedWithParams, 7, z);
    }

    public void d(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i) {
        if (annotatedWithParams.getParameterType(i).isCollectionLikeType()) {
            if (c(annotatedWithParams, 10, z)) {
                this.f54558b = settableBeanPropertyArr;
            }
        } else if (c(annotatedWithParams, 8, z)) {
            this.i = settableBeanPropertyArr;
        }
    }

    public void d(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (c(annotatedWithParams, 9, z)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap map = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    String name = settableBeanPropertyArr[i].getName();
                    if ((!name.isEmpty() || settableBeanPropertyArr[i].getInjectableValueId() == null) && (num = (Integer) map.put(name, Integer.valueOf(i))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, Integer.valueOf(i), ahw.u(this.f54557a.getBeanClass())));
                    }
                }
            }
            this.g = settableBeanPropertyArr;
        }
    }

    public boolean c() {
        return this.f54559c[0] != null;
    }

    public boolean b() {
        return this.f54559c[8] != null;
    }

    public boolean d() {
        return this.f54559c[9] != null;
    }

    private JavaType c(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) throws ym {
        if (!this.f || annotatedWithParams == null) {
            return null;
        }
        int i = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (settableBeanPropertyArr[i2] == null) {
                    i = i2;
                    break;
                }
            }
        }
        yi config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        acp parameter = annotatedWithParams.getParameter(i);
        Object objFindDeserializer = annotationIntrospector.findDeserializer(parameter);
        if (objFindDeserializer != null) {
            return parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, objFindDeserializer));
        }
        return annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    private <T extends AnnotatedMember> T e(T t) {
        if (t != null && this.e) {
            ahw.a((Member) t.getAnnotated(), this.j);
        }
        return t;
    }

    protected boolean c(AnnotatedWithParams annotatedWithParams, int i, boolean z) {
        int i2 = 1 << i;
        this.f = true;
        AnnotatedWithParams annotatedWithParams2 = this.f54559c[i];
        if (annotatedWithParams2 != null) {
            if ((this.h & i2) != 0) {
                if (!z) {
                    return false;
                }
            } else if (!z) {
            }
            if (annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (e(annotatedWithParams)) {
                        return false;
                    }
                    if (!e(annotatedWithParams2)) {
                        d(i, z, annotatedWithParams2, annotatedWithParams);
                    }
                } else {
                    if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                        return false;
                    }
                    if (!rawParameterType.isAssignableFrom(rawParameterType2)) {
                        if (rawParameterType.isPrimitive() != rawParameterType2.isPrimitive()) {
                            if (rawParameterType.isPrimitive()) {
                                return false;
                            }
                        } else {
                            d(i, z, annotatedWithParams2, annotatedWithParams);
                        }
                    }
                }
            }
        }
        if (z) {
            this.h |= i2;
        }
        this.f54559c[i] = (AnnotatedWithParams) e(annotatedWithParams);
        return true;
    }

    protected void d(int i, boolean z, AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
        String str;
        String str2 = d[i];
        if (z) {
            str = "explicitly marked";
        } else {
            str = "implicitly discovered";
        }
        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", str2, str, annotatedWithParams, annotatedWithParams2));
    }

    protected boolean e(AnnotatedWithParams annotatedWithParams) {
        return ahw.m(annotatedWithParams.getDeclaringClass()) && "valueOf".equals(annotatedWithParams.getName());
    }
}

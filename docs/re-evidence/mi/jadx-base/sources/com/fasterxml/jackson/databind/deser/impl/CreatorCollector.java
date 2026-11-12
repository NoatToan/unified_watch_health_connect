package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.b;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import defpackage.fd1;
import defpackage.fh2;
import defpackage.h04;
import defpackage.hd1;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CreatorCollector {
    public static final String[] j = {"default", "from-String", "from-int", "from-long", "from-double", "from-boolean", "delegate", "property-based"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh2 f7641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7642b;
    public final boolean c;
    public final AnnotatedWithParams[] d = new AnnotatedWithParams[9];
    public int e = 0;
    public boolean f = false;
    public SettableBeanProperty[] g;
    public SettableBeanProperty[] h;
    public SettableBeanProperty[] i;

    public static final class StdTypeConstructor extends AnnotatedWithParams implements Serializable {
        public static final int TYPE_ARRAY_LIST = 1;
        public static final int TYPE_HASH_MAP = 2;
        public static final int TYPE_LINKED_HASH_MAP = 3;
        private static final long serialVersionUID = 1;
        private final AnnotatedWithParams _base;
        private final int _type;

        public StdTypeConstructor(AnnotatedWithParams annotatedWithParams, int i) {
            super(annotatedWithParams, null);
            this._base = annotatedWithParams;
            this._type = i;
        }

        public static AnnotatedWithParams tryToOptimize(AnnotatedWithParams annotatedWithParams) {
            if (annotatedWithParams != null) {
                Class<?> declaringClass = annotatedWithParams.getDeclaringClass();
                if (declaringClass == List.class || declaringClass == ArrayList.class) {
                    return new StdTypeConstructor(annotatedWithParams, 1);
                }
                if (declaringClass == LinkedHashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 3);
                }
                if (declaringClass == HashMap.class) {
                    return new StdTypeConstructor(annotatedWithParams, 2);
                }
            }
            return annotatedWithParams;
        }

        public final Object _construct() {
            int i = this._type;
            if (i == 1) {
                return new ArrayList();
            }
            if (i == 2) {
                return new HashMap();
            }
            if (i == 3) {
                return new LinkedHashMap();
            }
            throw new IllegalStateException("Unknown type " + this._type);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call() throws Exception {
            return _construct();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call1(Object obj) throws Exception {
            return _construct();
        }

        @Override // defpackage.fd1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // defpackage.fd1
        public AnnotatedElement getAnnotated() {
            return this._base.getAnnotated();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Class<?> getDeclaringClass() {
            return this._base.getDeclaringClass();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        @Deprecated
        public Type getGenericParameterType(int i) {
            return this._base.getGenericParameterType(i);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Member getMember() {
            return this._base.getMember();
        }

        @Override // defpackage.fd1
        public int getModifiers() {
            return this._base.getMember().getModifiers();
        }

        @Override // defpackage.fd1
        public String getName() {
            return this._base.getName();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public int getParameterCount() {
            return this._base.getParameterCount();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public JavaType getParameterType(int i) {
            return this._base.getParameterType(i);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Class<?> getRawParameterType(int i) {
            return this._base.getRawParameterType(i);
        }

        @Override // defpackage.fd1
        public Class<?> getRawType() {
            return this._base.getRawType();
        }

        @Override // defpackage.fd1
        public JavaType getType() {
            return this._base.getType();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public Object getValue(Object obj) throws UnsupportedOperationException, IllegalArgumentException {
            throw new UnsupportedOperationException();
        }

        @Override // defpackage.fd1
        public int hashCode() {
            return this._base.hashCode();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public void setValue(Object obj, Object obj2) throws UnsupportedOperationException, IllegalArgumentException {
            throw new UnsupportedOperationException();
        }

        @Override // defpackage.fd1
        public String toString() {
            return this._base.toString();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedMember
        public fd1 withAnnotations(hd1 hd1Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotatedWithParams
        public Object call(Object[] objArr) throws Exception {
            return _construct();
        }
    }

    public CreatorCollector(fh2 fh2Var, MapperConfig<?> mapperConfig) {
        this.f7641a = fh2Var;
        this.f7642b = mapperConfig.canOverrideAccessModifiers();
        this.c = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public final JavaType a(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
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
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        AnnotatedParameter parameter = annotatedWithParams.getParameter(i);
        Object objFindDeserializer = annotationIntrospector.findDeserializer(parameter);
        return objFindDeserializer != null ? parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, objFindDeserializer)) : annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    public final <T extends AnnotatedMember> T b(T t) {
        if (t != null && this.f7642b) {
            h04.f((Member) t.getAnnotated(), this.c);
        }
        return t;
    }

    public boolean c(AnnotatedWithParams annotatedWithParams) {
        return annotatedWithParams.getDeclaringClass().isEnum() && "valueOf".equals(annotatedWithParams.getName());
    }

    public void d(AnnotatedWithParams annotatedWithParams, boolean z) {
        p(annotatedWithParams, 5, z);
    }

    public void e(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i) {
        if (annotatedWithParams.getParameterType(i).isCollectionLikeType()) {
            if (p(annotatedWithParams, 8, z)) {
                this.h = settableBeanPropertyArr;
            }
        } else if (p(annotatedWithParams, 6, z)) {
            this.g = settableBeanPropertyArr;
        }
    }

    public void f(AnnotatedWithParams annotatedWithParams, boolean z) {
        p(annotatedWithParams, 4, z);
    }

    public void g(AnnotatedWithParams annotatedWithParams, boolean z) {
        p(annotatedWithParams, 2, z);
    }

    public void h(AnnotatedWithParams annotatedWithParams, boolean z) {
        p(annotatedWithParams, 3, z);
    }

    public void i(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (p(annotatedWithParams, 7, z)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap map = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    String name = settableBeanPropertyArr[i].getName();
                    if ((!name.isEmpty() || settableBeanPropertyArr[i].getInjectableValueId() == null) && (num = (Integer) map.put(name, Integer.valueOf(i))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, Integer.valueOf(i), h04.T(this.f7641a.s())));
                    }
                }
            }
            this.i = settableBeanPropertyArr;
        }
    }

    public void j(AnnotatedWithParams annotatedWithParams, boolean z) {
        p(annotatedWithParams, 1, z);
    }

    public b k(DeserializationContext deserializationContext) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType javaTypeA = a(deserializationContext, this.d[6], this.g);
        JavaType javaTypeA2 = a(deserializationContext, this.d[8], this.h);
        JavaType javaTypeZ = this.f7641a.z();
        AnnotatedWithParams annotatedWithParamsTryToOptimize = StdTypeConstructor.tryToOptimize(this.d[0]);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, javaTypeZ);
        AnnotatedWithParams[] annotatedWithParamsArr = this.d;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsTryToOptimize, annotatedWithParamsArr[6], javaTypeA, this.g, annotatedWithParamsArr[7], this.i);
        stdValueInstantiator.configureFromArraySettings(this.d[8], javaTypeA2, this.h);
        stdValueInstantiator.configureFromStringCreator(this.d[1]);
        stdValueInstantiator.configureFromIntCreator(this.d[2]);
        stdValueInstantiator.configureFromLongCreator(this.d[3]);
        stdValueInstantiator.configureFromDoubleCreator(this.d[4]);
        stdValueInstantiator.configureFromBooleanCreator(this.d[5]);
        return stdValueInstantiator;
    }

    public boolean l() {
        return this.d[0] != null;
    }

    public boolean m() {
        return this.d[6] != null;
    }

    public boolean n() {
        return this.d[7] != null;
    }

    public void o(AnnotatedWithParams annotatedWithParams) {
        this.d[0] = (AnnotatedWithParams) b(annotatedWithParams);
    }

    public boolean p(AnnotatedWithParams annotatedWithParams, int i, boolean z) {
        int i2 = 1 << i;
        this.f = true;
        AnnotatedWithParams annotatedWithParams2 = this.d[i];
        if (annotatedWithParams2 != null) {
            if ((this.e & i2) != 0) {
                if (!z) {
                    return false;
                }
            } else if (!z) {
            }
            if (annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (c(annotatedWithParams)) {
                        return false;
                    }
                    if (!c(annotatedWithParams2)) {
                        Object[] objArr = new Object[4];
                        objArr[0] = j[i];
                        objArr[1] = z ? "explicitly marked" : "implicitly discovered";
                        objArr[2] = annotatedWithParams2;
                        objArr[3] = annotatedWithParams;
                        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
                    }
                } else if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                    return false;
                }
            }
        }
        if (z) {
            this.e |= i2;
        }
        this.d[i] = (AnnotatedWithParams) b(annotatedWithParams);
        return true;
    }
}

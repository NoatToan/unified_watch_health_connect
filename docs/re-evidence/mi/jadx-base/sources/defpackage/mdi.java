package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: loaded from: classes4.dex */
public class mdi {
    public static final Object g = Boolean.FALSE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerializationConfig f26038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh2 f26039b;
    public final AnnotationIntrospector c;
    public Object d;
    public final JsonInclude.Value e;
    public final boolean f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26040a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f26040a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26040a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26040a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26040a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26040a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26040a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public mdi(SerializationConfig serializationConfig, fh2 fh2Var) {
        this.f26038a = serializationConfig;
        this.f26039b = fh2Var;
        JsonInclude.Value valueMerge = JsonInclude.Value.merge(fh2Var.p(JsonInclude.Value.empty()), serializationConfig.getDefaultPropertyInclusion(fh2Var.s(), JsonInclude.Value.empty()));
        this.e = JsonInclude.Value.merge(serializationConfig.getDefaultPropertyInclusion(), valueMerge);
        this.f = valueMerge.getValueInclusion() == JsonInclude.Include.NON_DEFAULT;
        this.c = serializationConfig.getAnnotationIntrospector();
    }

    public Object a(Exception exc, String str, Object obj) {
        Throwable cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        h04.d0(cause);
        h04.f0(cause);
        throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
    }

    public BeanPropertyWriter b(wwl wwlVar, ih2 ih2Var, JavaType javaType, eud<?> eudVar, e5q e5qVar, e5q e5qVar2, AnnotatedMember annotatedMember, boolean z) throws JsonMappingException {
        JavaType javaType2;
        Object objB;
        Object objD;
        boolean z2;
        Object obj;
        boolean zIncludeFilterSuppressNulls = false;
        try {
            JavaType javaTypeC = c(annotatedMember, z, javaType);
            if (e5qVar2 != null) {
                if (javaTypeC == null) {
                    javaTypeC = javaType;
                }
                if (javaTypeC.getContentType() == null) {
                    wwlVar.reportBadPropertyDefinition(this.f26039b, ih2Var, "serialization type " + javaTypeC + " has no content", new Object[0]);
                }
                JavaType javaTypeWithContentTypeHandler = javaTypeC.withContentTypeHandler(e5qVar2);
                javaTypeWithContentTypeHandler.getContentType();
                javaType2 = javaTypeWithContentTypeHandler;
            } else {
                javaType2 = javaTypeC;
            }
            JavaType javaType3 = javaType2 == null ? javaType : javaType2;
            AnnotatedMember annotatedMemberK = ih2Var.k();
            if (annotatedMemberK == null) {
                return (BeanPropertyWriter) wwlVar.reportBadPropertyDefinition(this.f26039b, ih2Var, "could not determine property type", new Object[0]);
            }
            JsonInclude.Value valueWithOverrides = this.f26038a.getDefaultInclusion(javaType3.getRawClass(), annotatedMemberK.getRawType(), this.e).withOverrides(ih2Var.c());
            JsonInclude.Include valueInclusion = valueWithOverrides.getValueInclusion();
            if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
                valueInclusion = JsonInclude.Include.ALWAYS;
            }
            int i = a.f26040a[valueInclusion.ordinal()];
            Object objA = null;
            if (i != 1) {
                if (i == 2) {
                    if (javaType3.isReferenceType()) {
                        objB = BeanPropertyWriter.MARKER_FOR_EMPTY;
                    }
                    z2 = true;
                    obj = objA;
                } else if (i != 3) {
                    if (i != 4) {
                        zIncludeFilterSuppressNulls = i == 5;
                        if (javaType3.isContainerType() && !this.f26038a.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) {
                            objB = BeanPropertyWriter.MARKER_FOR_EMPTY;
                        }
                        z2 = zIncludeFilterSuppressNulls;
                        obj = objA;
                    } else {
                        objB = wwlVar.includeFilterInstance(ih2Var, valueWithOverrides.getValueFilter());
                        if (objB != null) {
                            zIncludeFilterSuppressNulls = wwlVar.includeFilterSuppressNulls(objB);
                        }
                    }
                    obj = objB;
                    z2 = zIncludeFilterSuppressNulls;
                } else {
                    objB = BeanPropertyWriter.MARKER_FOR_EMPTY;
                }
                obj = objB;
                z2 = true;
            } else {
                if (!this.f || (objD = d()) == null) {
                    objA = qh2.a(javaType3);
                    zIncludeFilterSuppressNulls = true;
                } else {
                    if (wwlVar.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        annotatedMember.fixAccess(this.f26038a.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        objA = annotatedMember.getValue(objD);
                    } catch (Exception e) {
                        a(e, ih2Var.getName(), objD);
                    }
                }
                if (objA == null) {
                    z2 = true;
                } else {
                    if (objA.getClass().isArray()) {
                        objB = ij1.b(objA);
                        obj = objB;
                        z2 = zIncludeFilterSuppressNulls;
                    }
                    z2 = zIncludeFilterSuppressNulls;
                }
                obj = objA;
            }
            Class<?>[] clsArrI = ih2Var.i();
            if (clsArrI == null) {
                clsArrI = this.f26039b.e();
            }
            BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter(ih2Var, annotatedMember, this.f26039b.t(), javaType, eudVar, e5qVar, javaType2, z2, obj, clsArrI);
            Object objFindNullSerializer = this.c.findNullSerializer(annotatedMember);
            if (objFindNullSerializer != null) {
                beanPropertyWriter.assignNullSerializer(wwlVar.serializerInstance(annotatedMember, objFindNullSerializer));
            }
            NameTransformer nameTransformerFindUnwrappingNameTransformer = this.c.findUnwrappingNameTransformer(annotatedMember);
            return nameTransformerFindUnwrappingNameTransformer != null ? beanPropertyWriter.unwrappingWriter(nameTransformerFindUnwrappingNameTransformer) : beanPropertyWriter;
        } catch (JsonMappingException e2) {
            return ih2Var == null ? (BeanPropertyWriter) wwlVar.reportBadDefinition(javaType, h04.n(e2)) : (BeanPropertyWriter) wwlVar.reportBadPropertyDefinition(this.f26039b, ih2Var, h04.n(e2), new Object[0]);
        }
    }

    public JavaType c(fd1 fd1Var, boolean z, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeRefineSerializationType = this.c.refineSerializationType(this.f26038a, fd1Var, javaType);
        if (javaTypeRefineSerializationType != javaType) {
            Class<?> rawClass = javaTypeRefineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + fd1Var.getName() + "': class " + rawClass.getName() + " not a super-type of (declared) class " + rawClass2.getName());
            }
            z = true;
            javaType = javaTypeRefineSerializationType;
        }
        JsonSerialize.Typing typingFindSerializationTyping = this.c.findSerializationTyping(fd1Var);
        if (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            if (!z) {
                return null;
            }
        } else if (typingFindSerializationTyping != JsonSerialize.Typing.STATIC) {
            return null;
        }
        return javaType.withStaticTyping();
    }

    public Object d() {
        Object objB = this.d;
        if (objB == null) {
            objB = this.f26039b.B(this.f26038a.canOverrideAccessModifiers());
            if (objB == null) {
                objB = g;
            }
            this.d = objB;
        }
        if (objB == g) {
            return null;
        }
        return this.d;
    }
}

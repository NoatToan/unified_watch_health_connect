package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: loaded from: classes21.dex */
public class afg {
    private static final Object g = Boolean.FALSE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AnnotationIntrospector f354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JsonInclude.b f355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final yt f356c;
    protected final BeanDescription d;
    protected Object e;
    protected final boolean f;

    public afg(yt ytVar, BeanDescription beanDescription) {
        this.f356c = ytVar;
        this.d = beanDescription;
        JsonInclude.b bVarC = JsonInclude.b.c(beanDescription.findPropertyInclusion(JsonInclude.b.e()), ytVar.getDefaultPropertyInclusion(beanDescription.getBeanClass(), JsonInclude.b.e()));
        this.f355b = JsonInclude.b.c(ytVar.getDefaultPropertyInclusion(), bVarC);
        this.f = bVarC.b() == JsonInclude.Include.NON_DEFAULT;
        this.f354a = ytVar.getAnnotationIntrospector();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x010e A[PHI: r1 r6
      0x010e: PHI (r1v4 boolean) = (r1v3 boolean), (r1v12 boolean), (r1v12 boolean) binds: [B:62:0x0105, B:35:0x009b, B:37:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x010e: PHI (r6v8 java.lang.Object) = (r6v5 java.lang.Object), (r6v3 java.lang.Object), (r6v3 java.lang.Object) binds: [B:62:0x0105, B:35:0x009b, B:37:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    protected aez c(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, TypeSerializer typeSerializer2, AnnotatedMember annotatedMember, boolean z) throws ym {
        JavaType javaType2;
        Object objB;
        Object objD;
        Object obj;
        boolean z2;
        boolean z3 = false;
        try {
            JavaType javaTypeE = e(annotatedMember, z, javaType);
            if (typeSerializer2 != null) {
                if (javaTypeE == null) {
                    javaTypeE = javaType;
                }
                if (javaTypeE.getContentType() == null) {
                    serializerProvider.reportBadPropertyDefinition(this.d, beanPropertyDefinition, "serialization type " + javaTypeE + " has no content", new Object[0]);
                }
                JavaType javaTypeWithContentTypeHandler = javaTypeE.withContentTypeHandler(typeSerializer2);
                javaTypeWithContentTypeHandler.getContentType();
                javaType2 = javaTypeWithContentTypeHandler;
            } else {
                javaType2 = javaTypeE;
            }
            JavaType javaType3 = javaType2 == null ? javaType : javaType2;
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (accessor == null) {
                return (aez) serializerProvider.reportBadPropertyDefinition(this.d, beanPropertyDefinition, "could not determine property type", new Object[0]);
            }
            JsonInclude.b bVarB = this.f356c.getDefaultInclusion(javaType3.getRawClass(), accessor.getRawType(), this.f355b).b(beanPropertyDefinition.findInclusion());
            JsonInclude.Include includeB = bVarB.b();
            if (includeB == JsonInclude.Include.USE_DEFAULTS) {
                includeB = JsonInclude.Include.ALWAYS;
            }
            int i = AnonymousClass4.f357b[includeB.ordinal()];
            Object objD2 = null;
            boolean zIncludeFilterSuppressNulls = true;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        objD2 = aez.MARKER_FOR_EMPTY;
                    } else if (i == 4) {
                        objD2 = serializerProvider.includeFilterInstance(beanPropertyDefinition, bVarB.c());
                        if (objD2 != null) {
                            zIncludeFilterSuppressNulls = serializerProvider.includeFilterSuppressNulls(objD2);
                        }
                    } else {
                        z3 = i == 5;
                        SerializationFeature serializationFeature = SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
                        if (!javaType3.isContainerType() || this.f356c.a(serializationFeature)) {
                            z2 = z3;
                            obj = objD2;
                        } else {
                            objB = aez.MARKER_FOR_EMPTY;
                            obj = objB;
                            z2 = z3;
                        }
                    }
                } else if (javaType3.isReferenceType()) {
                    objD2 = aez.MARKER_FOR_EMPTY;
                }
                obj = objD2;
                z2 = zIncludeFilterSuppressNulls;
            } else {
                if (this.f && (objD = d()) != null) {
                    if (serializerProvider.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        annotatedMember.fixAccess(this.f356c.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        objD2 = annotatedMember.getValue(objD);
                    } catch (Exception e) {
                        a(e, beanPropertyDefinition.getName(), objD);
                    }
                } else {
                    objD2 = ahr.d(javaType3);
                    z3 = true;
                }
                if (objD2 == null) {
                    obj = objD2;
                    z2 = zIncludeFilterSuppressNulls;
                } else if (objD2.getClass().isArray()) {
                    objB = aht.b(objD2);
                    obj = objB;
                    z2 = z3;
                } else {
                    z2 = z3;
                    obj = objD2;
                }
            }
            Class<?>[] clsArrFindViews = beanPropertyDefinition.findViews();
            if (clsArrFindViews == null) {
                clsArrFindViews = this.d.findDefaultViews();
            }
            aez aezVarB = b(beanPropertyDefinition, annotatedMember, this.d.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z2, obj, clsArrFindViews);
            Object objFindNullSerializer = this.f354a.findNullSerializer(annotatedMember);
            if (objFindNullSerializer != null) {
                aezVarB.assignNullSerializer(serializerProvider.serializerInstance(annotatedMember, objFindNullSerializer));
            }
            NameTransformer nameTransformerFindUnwrappingNameTransformer = this.f354a.findUnwrappingNameTransformer(annotatedMember);
            return nameTransformerFindUnwrappingNameTransformer != null ? aezVarB.unwrappingWriter(nameTransformerFindUnwrappingNameTransformer) : aezVarB;
        } catch (ym e2) {
            if (beanPropertyDefinition == null) {
                return (aez) serializerProvider.reportBadDefinition(javaType, ahw.a((Throwable) e2));
            }
            return (aez) serializerProvider.reportBadPropertyDefinition(this.d, beanPropertyDefinition, ahw.a((Throwable) e2), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: afg$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f357b;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f357b = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f357b[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f357b[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f357b[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f357b[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f357b[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected aez b(BeanPropertyDefinition beanPropertyDefinition, AnnotatedMember annotatedMember, Annotations annotations, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JavaType javaType2, boolean z, Object obj, Class<?>[] clsArr) throws ym {
        return new aez(beanPropertyDefinition, annotatedMember, annotations, javaType, jsonSerializer, typeSerializer, javaType2, z, obj, clsArr);
    }

    protected JavaType e(Annotated annotated, boolean z, JavaType javaType) throws ym {
        JavaType javaTypeRefineSerializationType = this.f354a.refineSerializationType(this.f356c, annotated, javaType);
        if (javaTypeRefineSerializationType != javaType) {
            Class<?> rawClass = javaTypeRefineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + annotated.getName() + "': class " + rawClass.getName() + " not a super-type of (declared) class " + rawClass2.getName());
            }
            z = true;
            javaType = javaTypeRefineSerializationType;
        }
        JsonSerialize.Typing typingFindSerializationTyping = this.f354a.findSerializationTyping(annotated);
        if (typingFindSerializationTyping == null || typingFindSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) {
            if (!z) {
                return null;
            }
        } else if (typingFindSerializationTyping != JsonSerialize.Typing.STATIC) {
            return null;
        }
        return javaType.withStaticTyping();
    }

    protected Object d() {
        Object objInstantiateBean = this.e;
        if (objInstantiateBean == null) {
            objInstantiateBean = this.d.instantiateBean(this.f356c.canOverrideAccessModifiers());
            if (objInstantiateBean == null) {
                objInstantiateBean = g;
            }
            this.e = objInstantiateBean;
        }
        if (objInstantiateBean == g) {
            return null;
        }
        return this.e;
    }

    protected Object a(Exception exc, String str, Object obj) {
        Throwable cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        ahw.e(cause);
        ahw.i(cause);
        throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
    }
}

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class LazyJavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {
    public static final /* synthetic */ KProperty<Object>[] i = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    @NotNull
    private final LazyJavaResolverContext a;

    @NotNull
    private final JavaAnnotation b;

    @NotNull
    private final NullableLazyValue c;

    @NotNull
    private final NotNullLazyValue d;

    @NotNull
    private final JavaSourceElement e;

    @NotNull
    private final NotNullLazyValue f;
    private final boolean g;
    private final boolean h;

    public static final class a extends Lambda implements Function0<Map<Name, ? extends ConstantValue<?>>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Map<Name, ? extends ConstantValue<?>> getA() {
            Collection<JavaAnnotationArgument> arguments = LazyJavaAnnotationDescriptor.this.b.getArguments();
            LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = LazyJavaAnnotationDescriptor.this;
            ArrayList arrayList = new ArrayList();
            for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
                Name name = javaAnnotationArgument.getName();
                if (name == null) {
                    name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                }
                ConstantValue constantValueB = lazyJavaAnnotationDescriptor.b(javaAnnotationArgument);
                Pair pair = constantValueB == null ? null : TuplesKt.to(name, constantValueB);
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            return r.toMap(arrayList);
        }
    }

    public static final class b extends Lambda implements Function0<FqName> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FqName getA() {
            ClassId classId = LazyJavaAnnotationDescriptor.this.b.getClassId();
            if (classId == null) {
                return null;
            }
            return classId.asSingleFqName();
        }
    }

    public static final class c extends Lambda implements Function0<SimpleType> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleType getA() {
            FqName fqName = LazyJavaAnnotationDescriptor.this.getFqName();
            if (fqName == null) {
                return ErrorUtils.createErrorType(Intrinsics.stringPlus("No fqName: ", LazyJavaAnnotationDescriptor.this.b));
            }
            ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(JavaToKotlinClassMapper.INSTANCE, fqName, LazyJavaAnnotationDescriptor.this.a.getModule().getBuiltIns(), null, 4, null);
            if (classDescriptorMapJavaToKotlin$default == null) {
                JavaClass javaClassResolve = LazyJavaAnnotationDescriptor.this.b.resolve();
                classDescriptorMapJavaToKotlin$default = javaClassResolve == null ? null : LazyJavaAnnotationDescriptor.this.a.getComponents().getModuleClassResolver().resolveClass(javaClassResolve);
                if (classDescriptorMapJavaToKotlin$default == null) {
                    classDescriptorMapJavaToKotlin$default = LazyJavaAnnotationDescriptor.this.a(fqName);
                }
            }
            return classDescriptorMapJavaToKotlin$default.getDefaultType();
        }
    }

    public LazyJavaAnnotationDescriptor(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaAnnotation javaAnnotation, boolean z) {
        this.a = lazyJavaResolverContext;
        this.b = javaAnnotation;
        this.c = lazyJavaResolverContext.getStorageManager().createNullableLazyValue(new b());
        this.d = lazyJavaResolverContext.getStorageManager().createLazyValue(new c());
        this.e = lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaAnnotation);
        this.f = lazyJavaResolverContext.getStorageManager().createLazyValue(new a());
        this.g = javaAnnotation.isIdeExternalAnnotation();
        this.h = javaAnnotation.isFreshlySupportedTypeUseAnnotation() || z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor a(FqName fqName) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.a.getModule(), ClassId.topLevel(fqName), this.a.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConstantValue<?> b(JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.INSTANCE.createConstantValue(((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue());
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return e(javaEnumValueAnnotationArgument.getEnumClassId(), javaEnumValueAnnotationArgument.getEntryName());
        }
        if (javaAnnotationArgument instanceof JavaArrayAnnotationArgument) {
            JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
            Name name = javaArrayAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            return d(name, javaArrayAnnotationArgument.getElements());
        }
        if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
            return c(((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation());
        }
        if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
            return f(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType());
        }
        return null;
    }

    private final ConstantValue<?> c(JavaAnnotation javaAnnotation) {
        return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.a, javaAnnotation, false, 4, null));
    }

    private final ConstantValue<?> d(Name name, List<? extends JavaAnnotationArgument> list) {
        if (KotlinTypeKt.isError(getType())) {
            return null;
        }
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, DescriptorUtilsKt.getAnnotationClass(this));
        KotlinType type = annotationParameterByName != null ? annotationParameterByName.getType() : null;
        if (type == null) {
            type = this.a.getComponents().getModule().getBuiltIns().getArrayType(Variance.INVARIANT, ErrorUtils.createErrorType("Unknown array element type"));
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ConstantValue<?> constantValueB = b((JavaAnnotationArgument) it2.next());
            if (constantValueB == null) {
                constantValueB = new NullValue();
            }
            arrayList.add(constantValueB);
        }
        return ConstantValueFactory.INSTANCE.createArrayValue(arrayList, type);
    }

    private final ConstantValue<?> e(ClassId classId, Name name) {
        if (classId == null || name == null) {
            return null;
        }
        return new EnumValue(classId, name);
    }

    private final ConstantValue<?> f(JavaType javaType) {
        return KClassValue.Companion.create(this.a.getTypeResolver().transformJavaType(javaType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.f, this, (KProperty<?>) i[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    public FqName getFqName() {
        return (FqName) StorageKt.getValue(this.c, this, (KProperty<?>) i[0]);
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.g;
    }

    @NotNull
    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public JavaSourceElement getSource() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.d, this, (KProperty<?>) i[1]);
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i2 & 4) != 0 ? false : z);
    }
}

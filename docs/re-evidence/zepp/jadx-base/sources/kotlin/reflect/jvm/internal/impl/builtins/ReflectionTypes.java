package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class ReflectionTypes {

    @NotNull
    private final NotFoundClasses a;

    @NotNull
    private final Lazy b;

    @NotNull
    private final a c = new a(1);

    @NotNull
    private final a d = new a(1);

    @NotNull
    private final a e = new a(1);

    @NotNull
    private final a f = new a(2);

    @NotNull
    private final a g = new a(3);

    @NotNull
    private final a h = new a(1);

    @NotNull
    private final a i = new a(2);

    @NotNull
    private final a j = new a(3);
    public static final /* synthetic */ KProperty<Object>[] k = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final KotlinType createKPropertyStarType(@NotNull ModuleDescriptor moduleDescriptor) {
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardNames.FqNames.kProperty);
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                return null;
            }
            return KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), classDescriptorFindClassAcrossModuleDependencies, e.listOf(new StarProjectionImpl((TypeParameterDescriptor) CollectionsKt.single((List) classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters()))));
        }
    }

    public static final class a {
        private final int a;

        public a(int i) {
            this.a = i;
        }

        @NotNull
        public final ClassDescriptor a(@NotNull ReflectionTypes reflectionTypes, @NotNull KProperty<?> kProperty) {
            return reflectionTypes.a(CapitalizeDecapitalizeKt.capitalizeAsciiOnly(kProperty.getName()), this.a);
        }
    }

    public static final class b extends Lambda implements Function0<MemberScope> {
        public final /* synthetic */ ModuleDescriptor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ModuleDescriptor moduleDescriptor) {
            super(0);
            this.a = moduleDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MemberScope invoke() {
            return this.a.getPackage(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
        }
    }

    public ReflectionTypes(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses) {
        this.a = notFoundClasses;
        this.b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b(moduleDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor a(String str, int i) {
        Name nameIdentifier = Name.identifier(str);
        ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier = b().mo4299getContributedClassifier(nameIdentifier, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor = classifierDescriptorMo4299getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo4299getContributedClassifier : null;
        return classDescriptor == null ? this.a.getClass(new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, nameIdentifier), e.listOf(Integer.valueOf(i))) : classDescriptor;
    }

    private final MemberScope b() {
        return (MemberScope) this.b.getValue();
    }

    @NotNull
    public final ClassDescriptor getKClass() {
        return this.c.a(this, k[0]);
    }
}

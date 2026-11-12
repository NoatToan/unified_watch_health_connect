package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class AnnotationTypeQualifierResolver {

    @NotNull
    private final JavaTypeEnhancementState a;

    @NotNull
    private final MemoizedFunctionToNullable<ClassDescriptor, AnnotationDescriptor> b;

    public static final class TypeQualifierWithApplicability {

        @NotNull
        private final AnnotationDescriptor a;
        private final int b;

        public TypeQualifierWithApplicability(@NotNull AnnotationDescriptor annotationDescriptor, int i) {
            this.a = annotationDescriptor;
            this.b = i;
        }

        private final boolean a(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
            return ((1 << annotationQualifierApplicabilityType.ordinal()) & this.b) != 0;
        }

        private final boolean b(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
            if (a(annotationQualifierApplicabilityType)) {
                return true;
            }
            return a(AnnotationQualifierApplicabilityType.TYPE_USE) && annotationQualifierApplicabilityType != AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        }

        @NotNull
        public final AnnotationDescriptor component1() {
            return this.a;
        }

        @NotNull
        public final List<AnnotationQualifierApplicabilityType> component2() {
            AnnotationQualifierApplicabilityType[] annotationQualifierApplicabilityTypeArrValues = AnnotationQualifierApplicabilityType.values();
            ArrayList arrayList = new ArrayList();
            for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : annotationQualifierApplicabilityTypeArrValues) {
                if (b(annotationQualifierApplicabilityType)) {
                    arrayList.add(annotationQualifierApplicabilityType);
                }
            }
            return arrayList;
        }
    }

    public static final class a extends Lambda implements Function2<EnumValue, AnnotationQualifierApplicabilityType, Boolean> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull EnumValue enumValue, @NotNull AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
            return Boolean.valueOf(Intrinsics.areEqual(enumValue.getEnumEntryName().getIdentifier(), annotationQualifierApplicabilityType.getJavaTarget()));
        }
    }

    public static final class b extends Lambda implements Function2<EnumValue, AnnotationQualifierApplicabilityType, Boolean> {
        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull EnumValue enumValue, @NotNull AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
            return Boolean.valueOf(AnnotationTypeQualifierResolver.this.h(annotationQualifierApplicabilityType.getJavaTarget()).contains(enumValue.getEnumEntryName().getIdentifier()));
        }
    }

    public /* synthetic */ class c extends FunctionReference implements Function1<ClassDescriptor, AnnotationDescriptor> {
        public c(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnnotationDescriptor invoke(@NotNull ClassDescriptor classDescriptor) {
            return ((AnnotationTypeQualifierResolver) this.receiver).a(classDescriptor);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "computeTypeQualifierNickname";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(AnnotationTypeQualifierResolver.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
        }
    }

    public AnnotationTypeQualifierResolver(@NotNull StorageManager storageManager, @NotNull JavaTypeEnhancementState javaTypeEnhancementState) {
        this.a = javaTypeEnhancementState;
        this.b = storageManager.createMemoizedFunctionWithNullableValues(new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnnotationDescriptor a(ClassDescriptor classDescriptor) {
        if (!classDescriptor.getAnnotations().hasAnnotation(AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_NICKNAME_FQNAME())) {
            return null;
        }
        Iterator<AnnotationDescriptor> it2 = classDescriptor.getAnnotations().iterator();
        while (it2.hasNext()) {
            AnnotationDescriptor annotationDescriptorResolveTypeQualifierAnnotation = resolveTypeQualifierAnnotation(it2.next());
            if (annotationDescriptorResolveTypeQualifierAnnotation != null) {
                return annotationDescriptorResolveTypeQualifierAnnotation;
            }
        }
        return null;
    }

    private final List<AnnotationQualifierApplicabilityType> b(ConstantValue<?> constantValue, Function2<? super EnumValue, ? super AnnotationQualifierApplicabilityType, Boolean> function2) {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType;
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> value = ((ArrayValue) constantValue).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = value.iterator();
            while (it2.hasNext()) {
                h.addAll(arrayList, b((ConstantValue) it2.next(), function2));
            }
            return arrayList;
        }
        if (!(constantValue instanceof EnumValue)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        AnnotationQualifierApplicabilityType[] annotationQualifierApplicabilityTypeArrValues = AnnotationQualifierApplicabilityType.values();
        int length = annotationQualifierApplicabilityTypeArrValues.length;
        for (int i = 0; i < length; i++) {
            annotationQualifierApplicabilityType = annotationQualifierApplicabilityTypeArrValues[i];
            if (function2.invoke(constantValue, annotationQualifierApplicabilityType).booleanValue()) {
                return CollectionsKt__CollectionsKt.listOfNotNull(annotationQualifierApplicabilityType);
            }
        }
        annotationQualifierApplicabilityType = null;
        return CollectionsKt__CollectionsKt.listOfNotNull(annotationQualifierApplicabilityType);
    }

    private final List<AnnotationQualifierApplicabilityType> c(ConstantValue<?> constantValue) {
        return b(constantValue, a.a);
    }

    private final List<AnnotationQualifierApplicabilityType> d(ConstantValue<?> constantValue) {
        return b(constantValue, new b());
    }

    private final ReportLevel e(ClassDescriptor classDescriptor) {
        AnnotationDescriptor annotationDescriptorMo4294findAnnotation = classDescriptor.getAnnotations().mo4294findAnnotation(AnnotationQualifiersFqNamesKt.getMIGRATION_ANNOTATION_FQNAME());
        ConstantValue<?> constantValueFirstArgument = annotationDescriptorMo4294findAnnotation == null ? null : DescriptorUtilsKt.firstArgument(annotationDescriptorMo4294findAnnotation);
        EnumValue enumValue = constantValueFirstArgument instanceof EnumValue ? (EnumValue) constantValueFirstArgument : null;
        if (enumValue == null) {
            return null;
        }
        ReportLevel migrationLevel = this.a.getJsr305().getMigrationLevel();
        if (migrationLevel != null) {
            return migrationLevel;
        }
        String strAsString = enumValue.getEnumEntryName().asString();
        int iHashCode = strAsString.hashCode();
        if (iHashCode == -2137067054) {
            if (strAsString.equals("IGNORE")) {
                return ReportLevel.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (strAsString.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && strAsString.equals("WARN")) {
            return ReportLevel.WARN;
        }
        return null;
    }

    private final ReportLevel f(AnnotationDescriptor annotationDescriptor) {
        FqName fqName = annotationDescriptor.getFqName();
        return (fqName == null || !AnnotationQualifiersFqNamesKt.getJSPECIFY_DEFAULT_ANNOTATIONS().containsKey(fqName)) ? resolveJsr305AnnotationState(annotationDescriptor) : this.a.getGetReportLevelForAnnotation().invoke(fqName);
    }

    private final AnnotationDescriptor g(ClassDescriptor classDescriptor) {
        if (classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
            return null;
        }
        return this.b.invoke(classDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> h(String str) {
        Set<KotlinTarget> setMapJavaTargetArgumentByName = JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArgumentByName(str);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setMapJavaTargetArgumentByName, 10));
        Iterator<T> it2 = setMapJavaTargetArgumentByName.iterator();
        while (it2.hasNext()) {
            arrayList.add(((KotlinTarget) it2.next()).name());
        }
        return arrayList;
    }

    @Nullable
    public final TypeQualifierWithApplicability resolveAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
        AnnotationDescriptor annotationDescriptorMo4294findAnnotation;
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass == null || (annotationDescriptorMo4294findAnnotation = annotationClass.getAnnotations().mo4294findAnnotation(JvmAnnotationNames.TARGET_ANNOTATION)) == null) {
            return null;
        }
        Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptorMo4294findAnnotation.getAllValueArguments();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Name, ConstantValue<?>>> it2 = allValueArguments.entrySet().iterator();
        while (it2.hasNext()) {
            h.addAll(arrayList, d(it2.next().getValue()));
        }
        int iOrdinal = 0;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            iOrdinal |= 1 << ((AnnotationQualifierApplicabilityType) it3.next()).ordinal();
        }
        return new TypeQualifierWithApplicability(annotationDescriptor, iOrdinal);
    }

    @NotNull
    public final ReportLevel resolveJsr305AnnotationState(@NotNull AnnotationDescriptor annotationDescriptor) {
        ReportLevel reportLevelResolveJsr305CustomState = resolveJsr305CustomState(annotationDescriptor);
        return reportLevelResolveJsr305CustomState == null ? this.a.getJsr305().getGlobalLevel() : reportLevelResolveJsr305CustomState;
    }

    @Nullable
    public final ReportLevel resolveJsr305CustomState(@NotNull AnnotationDescriptor annotationDescriptor) {
        ReportLevel reportLevel = this.a.getJsr305().getUserDefinedLevelForSpecificAnnotation().get(annotationDescriptor.getFqName());
        if (reportLevel != null) {
            return reportLevel;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass == null) {
            return null;
        }
        return e(annotationClass);
    }

    @Nullable
    public final JavaDefaultQualifiers resolveQualifierBuiltInDefaultAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
        JavaDefaultQualifiers javaDefaultQualifiers;
        if (this.a.getDisabledDefaultAnnotations() || (javaDefaultQualifiers = AnnotationQualifiersFqNamesKt.getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS().get(annotationDescriptor.getFqName())) == null) {
            return null;
        }
        ReportLevel reportLevelF = f(annotationDescriptor);
        if (!(reportLevelF != ReportLevel.IGNORE)) {
            reportLevelF = null;
        }
        if (reportLevelF == null) {
            return null;
        }
        return JavaDefaultQualifiers.copy$default(javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus.copy$default(javaDefaultQualifiers.getNullabilityQualifier(), null, reportLevelF.isWarning(), 1, null), null, false, false, 14, null);
    }

    @Nullable
    public final AnnotationDescriptor resolveTypeQualifierAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass;
        if (this.a.getJsr305().isDisabled() || (annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor)) == null) {
            return null;
        }
        return AnnotationTypeQualifierResolverKt.a(annotationClass) ? annotationDescriptor : g(annotationClass);
    }

    @Nullable
    public final TypeQualifierWithApplicability resolveTypeQualifierDefaultAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
        AnnotationDescriptor next;
        if (this.a.getJsr305().isDisabled()) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass == null || !annotationClass.getAnnotations().hasAnnotation(AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_DEFAULT_FQNAME())) {
            annotationClass = null;
        }
        if (annotationClass == null) {
            return null;
        }
        Map<Name, ConstantValue<?>> allValueArguments = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor).getAnnotations().mo4294findAnnotation(AnnotationQualifiersFqNamesKt.getTYPE_QUALIFIER_DEFAULT_FQNAME()).getAllValueArguments();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Name, ConstantValue<?>> entry : allValueArguments.entrySet()) {
            h.addAll(arrayList, Intrinsics.areEqual(entry.getKey(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME) ? c(entry.getValue()) : CollectionsKt__CollectionsKt.emptyList());
        }
        Iterator it2 = arrayList.iterator();
        int iOrdinal = 0;
        while (it2.hasNext()) {
            iOrdinal |= 1 << ((AnnotationQualifierApplicabilityType) it2.next()).ordinal();
        }
        Iterator<AnnotationDescriptor> it3 = annotationClass.getAnnotations().iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!(resolveTypeQualifierAnnotation(next) != null));
        AnnotationDescriptor annotationDescriptor2 = next;
        if (annotationDescriptor2 == null) {
            return null;
        }
        return new TypeQualifierWithApplicability(annotationDescriptor2, iOrdinal);
    }
}

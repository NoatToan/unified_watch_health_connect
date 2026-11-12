package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfoKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1557#2:291\n1628#2,3:292\n1557#2:295\n1628#2,3:296\n1557#2:300\n1628#2,3:301\n1755#2,3:304\n1755#2,3:307\n1567#2:310\n1598#2,4:311\n1557#2:315\n1628#2,3:316\n1557#2:319\n1628#2,3:320\n1#3:299\n*S KotlinDebug\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancement\n*L\n55#1:291\n55#1:292,3\n66#1:295\n66#1:296,3\n117#1:300\n117#1:301,3\n138#1:304,3\n144#1:307,3\n150#1:310\n150#1:311,4\n164#1:315\n164#1:316,3\n214#1:319\n214#1:320,3\n*E\n"})
public final class SignatureEnhancement {

    @NotNull
    private final JavaTypeEnhancement typeEnhancement;

    public SignatureEnhancement(@NotNull JavaTypeEnhancement typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.typeEnhancement = typeEnhancement;
    }

    private final boolean containsFunctionN(KotlinType kotlinType) {
        return TypeUtils.contains(kotlinType, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public Object invoke2(Object obj) {
                return SignatureEnhancement.containsFunctionN$lambda$15((UnwrappedType) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean containsFunctionN$lambda$15(UnwrappedType unwrappedType) {
        ClassifierDescriptor classifierDescriptorMo2180getDeclarationDescriptor = unwrappedType.getConstructor().mo2180getDeclarationDescriptor();
        if (classifierDescriptorMo2180getDeclarationDescriptor == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorMo2180getDeclarationDescriptor.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        return Boolean.valueOf(Intrinsics.areEqual(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(classifierDescriptorMo2180getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
    }

    private final KotlinType enhance(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        SignatureParts signatureParts = new SignatureParts(annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType kotlinTypeInvoke2 = function1.invoke2(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            Intrinsics.checkNotNull(callableMemberDescriptor2);
            arrayList.add(function1.invoke2(callableMemberDescriptor2));
        }
        return enhance(signatureParts, kotlinTypeInvoke2, arrayList, typeEnhancementInfo, z2);
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, TypeEnhancementInfo typeEnhancementInfo, boolean z2, Function1 function1, int i, Object obj) {
        return signatureEnhancement.enhance(callableMemberDescriptor, annotated, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, typeEnhancementInfo, (i & 32) != 0 ? false : z2, function1);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    private final <D extends CallableMemberDescriptor> D enhanceSignature(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        D d2;
        KotlinType kotlinTypeEnhanceValueParameter;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo;
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair;
        KotlinType type;
        ReceiverParameterDescriptor extensionReceiverParameter;
        KotlinType type2;
        List<TypeEnhancementInfo> parametersInfo;
        PropertyDescriptorImpl propertyDescriptorImpl;
        PropertyGetterDescriptorImpl getter;
        if (!(d instanceof JavaCallableMemberDescriptor)) {
            return d;
        }
        if (d.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && d.getOriginal().getOverriddenDescriptors().size() == 1) {
            return d;
        }
        LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, getDefaultAnnotations(d, lazyJavaResolverContext));
        if (!(d instanceof JavaPropertyDescriptor) || (getter = (propertyDescriptorImpl = (PropertyDescriptorImpl) d).getGetter()) == null || getter.isDefault()) {
            d2 = d;
        } else {
            PropertyGetterDescriptorImpl getter2 = propertyDescriptorImpl.getGetter();
            Intrinsics.checkNotNull(getter2);
            d2 = getter2;
        }
        TypeEnhancementInfo typeEnhancementInfo = null;
        if (d.getExtensionReceiverParameter() != null) {
            FunctionDescriptor functionDescriptor = d2 instanceof FunctionDescriptor ? (FunctionDescriptor) d2 : null;
            kotlinTypeEnhanceValueParameter = enhanceValueParameter(d, functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, null, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public Object invoke2(Object obj) {
                    return SignatureEnhancement.enhanceSignature$lambda$2((CallableMemberDescriptor) obj);
                }
            });
        } else {
            kotlinTypeEnhanceValueParameter = null;
        }
        JavaMethodDescriptor javaMethodDescriptor = d instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) d : null;
        if (javaMethodDescriptor != null) {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
            Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            String strSignature = MethodSignatureBuildingUtilsKt.signature(signatureBuildingComponents, (ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
            if (strSignature != null) {
                predefinedFunctionEnhancementInfo = PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(strSignature);
            } else {
                predefinedFunctionEnhancementInfo = null;
            }
        } else {
            predefinedFunctionEnhancementInfo = null;
        }
        if (predefinedFunctionEnhancementInfo != null) {
            predefinedFunctionEnhancementInfo.getParametersInfo().size();
            ((JavaMethodDescriptor) d).getValueParameters().size();
        }
        boolean z = (UtilsKt.isJspecifyEnabledInStrictMode(lazyJavaResolverContext.getComponents().getJavaTypeEnhancementState()) || lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(d);
        List<ValueParameterDescriptor> valueParameters = d2.getValueParameters();
        String str = "getValueParameters(...)";
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        char c = '\n';
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (final ValueParameterDescriptor valueParameterDescriptor : list) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(enhanceValueParameter(d, valueParameterDescriptor, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, (predefinedFunctionEnhancementInfo == null || (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) == null) ? typeEnhancementInfo : (TypeEnhancementInfo) CollectionsKt___CollectionsKt.getOrNull(parametersInfo, valueParameterDescriptor.getIndex()), z, new Function1(valueParameterDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$1
                private final ValueParameterDescriptor arg$0;

                {
                    this.arg$0 = valueParameterDescriptor;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public Object invoke2(Object obj) {
                    return SignatureEnhancement.enhanceSignature$lambda$8$lambda$7(this.arg$0, (CallableMemberDescriptor) obj);
                }
            }));
            str = str;
            arrayList = arrayList2;
            c = '\n';
            typeEnhancementInfo = null;
        }
        ArrayList arrayList3 = arrayList;
        String str2 = str;
        PropertyDescriptor propertyDescriptor = d instanceof PropertyDescriptor ? (PropertyDescriptor) d : null;
        KotlinType kotlinTypeEnhance$default = enhance$default(this, d, d2, true, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, (propertyDescriptor == null || !JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE : AnnotationQualifierApplicabilityType.FIELD, predefinedFunctionEnhancementInfo != null ? predefinedFunctionEnhancementInfo.getReturnTypeInfo() : null, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public Object invoke2(Object obj) {
                return SignatureEnhancement.enhanceSignature$lambda$9((CallableMemberDescriptor) obj);
            }
        }, 32, null);
        KotlinType returnType = d.getReturnType();
        Intrinsics.checkNotNull(returnType);
        if (containsFunctionN(returnType) || !((extensionReceiverParameter = d.getExtensionReceiverParameter()) == null || (type2 = extensionReceiverParameter.getType()) == null || !containsFunctionN(type2))) {
            pair = TuplesKt.to(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(d));
        } else {
            List<ValueParameterDescriptor> valueParameters2 = d.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters2, str2);
            List<ValueParameterDescriptor> list2 = valueParameters2;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        KotlinType type3 = ((ValueParameterDescriptor) it.next()).getType();
                        Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                        if (containsFunctionN(type3)) {
                            pair = TuplesKt.to(DescriptorBasedDeprecationInfoKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(d));
                        }
                    }
                }
            }
            pair = null;
        }
        if (kotlinTypeEnhanceValueParameter == null && kotlinTypeEnhance$default == null) {
            if (!arrayList3.isEmpty()) {
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        if (pair != null) {
                            break;
                        }
                        return d;
                    }
                } while (((KotlinType) it2.next()) == null);
            } else if (pair != null) {
                return d;
            }
        }
        JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) d;
        if (kotlinTypeEnhanceValueParameter == null) {
            ReceiverParameterDescriptor extensionReceiverParameter2 = d.getExtensionReceiverParameter();
            type = extensionReceiverParameter2 != null ? extensionReceiverParameter2.getType() : null;
        } else {
            type = kotlinTypeEnhanceValueParameter;
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        int i = 0;
        for (Object obj : arrayList3) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            KotlinType type4 = (KotlinType) obj;
            if (type4 == null) {
                type4 = d.getValueParameters().get(i).getType();
                Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
            }
            arrayList4.add(type4);
            i = i2;
        }
        if (kotlinTypeEnhance$default == null) {
            kotlinTypeEnhance$default = d.getReturnType();
            Intrinsics.checkNotNull(kotlinTypeEnhance$default);
        }
        JavaCallableMemberDescriptor javaCallableMemberDescriptorEnhance = javaCallableMemberDescriptor.enhance(type, arrayList4, kotlinTypeEnhance$default, pair);
        Intrinsics.checkNotNull(javaCallableMemberDescriptorEnhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
        return javaCallableMemberDescriptorEnhance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$2(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ReceiverParameterDescriptor extensionReceiverParameter = it.getExtensionReceiverParameter();
        Intrinsics.checkNotNull(extensionReceiverParameter);
        KotlinType type = extensionReceiverParameter.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$8$lambda$7(ValueParameterDescriptor valueParameterDescriptor, CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType type = it.getValueParameters().get(valueParameterDescriptor.getIndex()).getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$9(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType returnType = it.getReturnType();
        Intrinsics.checkNotNull(returnType);
        return returnType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enhanceTypeParameterBounds$lambda$14$lambda$13(UnwrappedType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof RawType;
    }

    private final KotlinType enhanceValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, TypeEnhancementInfo typeEnhancementInfo, boolean z, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers;
        return enhance(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, typeEnhancementInfo, z, function1);
    }

    private final <D extends CallableMemberDescriptor> Annotations getDefaultAnnotations(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(d);
        if (topLevelContainingClassifier == null) {
            return d.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
        List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
        List<JavaAnnotation> list = moduleAnnotations;
        if (list == null || list.isEmpty()) {
            return d.getAnnotations();
        }
        List<JavaAnnotation> list2 = moduleAnnotations;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it.next(), true));
        }
        return Annotations.Companion.create(CollectionsKt___CollectionsKt.plus((Iterable) d.getAnnotations(), (Iterable) arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(@NotNull LazyJavaResolverContext c, @NotNull Collection<? extends D> platformSignatures) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((CallableMemberDescriptor) it.next(), c));
        }
        return arrayList;
    }

    @NotNull
    public final KotlinType enhanceSuperType(@NotNull KotlinType type, @NotNull LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        KotlinType kotlinTypeEnhance$default = enhance$default(this, new SignatureParts(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), type, CollectionsKt__CollectionsKt.emptyList(), null, false, 12, null);
        return kotlinTypeEnhance$default == null ? type : kotlinTypeEnhance$default;
    }

    @NotNull
    public final List<KotlinType> enhanceTypeParameterBounds(@NotNull TypeParameterDescriptor typeParameter, @NotNull List<? extends KotlinType> bounds, @NotNull LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<? extends KotlinType> list = bounds;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (KotlinType kotlinType : list) {
            if (!TypeUtilsKt.contains(kotlinType, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public Object invoke2(Object obj) {
                    return Boolean.valueOf(SignatureEnhancement.enhanceTypeParameterBounds$lambda$14$lambda$13((UnwrappedType) obj));
                }
            })) {
                KotlinType kotlinTypeEnhance$default = enhance$default(this, new SignatureParts(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), kotlinType, CollectionsKt__CollectionsKt.emptyList(), null, false, 12, null);
                if (kotlinTypeEnhance$default != null) {
                    kotlinType = kotlinTypeEnhance$default;
                }
            }
            arrayList.add(kotlinType);
        }
        return arrayList;
    }

    public static /* synthetic */ KotlinType enhance$default(SignatureEnhancement signatureEnhancement, SignatureParts signatureParts, KotlinType kotlinType, List list, TypeEnhancementInfo typeEnhancementInfo, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            typeEnhancementInfo = null;
        }
        TypeEnhancementInfo typeEnhancementInfo2 = typeEnhancementInfo;
        if ((i & 8) != 0) {
            z = false;
        }
        return signatureEnhancement.enhance(signatureParts, kotlinType, list, typeEnhancementInfo2, z);
    }

    private final KotlinType enhance(SignatureParts signatureParts, KotlinType kotlinType, List<? extends KotlinType> list, TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        return this.typeEnhancement.enhance(kotlinType, signatureParts.computeIndexedQualifiers(kotlinType, list, typeEnhancementInfo, z), signatureParts.getSkipRawTypeArguments());
    }
}

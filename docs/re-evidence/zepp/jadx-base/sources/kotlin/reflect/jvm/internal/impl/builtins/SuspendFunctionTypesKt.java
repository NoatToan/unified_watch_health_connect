package kotlin.reflect.jvm.internal.impl.builtins;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.MutableClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class SuspendFunctionTypesKt {

    @NotNull
    private static final MutableClassDescriptor a;

    @NotNull
    private static final MutableClassDescriptor b;

    static {
        EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(ErrorUtils.getErrorModule(), StandardNames.COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL);
        ClassKind classKind = ClassKind.INTERFACE;
        Name nameShortName = StandardNames.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL.shortName();
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        StorageManager storageManager = LockBasedStorageManager.NO_LOCKS;
        MutableClassDescriptor mutableClassDescriptor = new MutableClassDescriptor(emptyPackageFragmentDescriptor, classKind, false, false, nameShortName, sourceElement, storageManager);
        Modality modality = Modality.ABSTRACT;
        mutableClassDescriptor.setModality(modality);
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        mutableClassDescriptor.setVisibility(descriptorVisibility);
        Annotations.Companion companion = Annotations.Companion;
        Annotations empty = companion.getEMPTY();
        Variance variance = Variance.IN_VARIANCE;
        mutableClassDescriptor.setTypeParameterDescriptors(e.listOf(TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor, empty, false, variance, Name.identifier(ExifInterface.GPS_DIRECTION_TRUE), 0, storageManager)));
        mutableClassDescriptor.createTypeConstructor();
        a = mutableClassDescriptor;
        MutableClassDescriptor mutableClassDescriptor2 = new MutableClassDescriptor(new EmptyPackageFragmentDescriptor(ErrorUtils.getErrorModule(), StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE), classKind, false, false, StandardNames.CONTINUATION_INTERFACE_FQ_NAME_RELEASE.shortName(), sourceElement, storageManager);
        mutableClassDescriptor2.setModality(modality);
        mutableClassDescriptor2.setVisibility(descriptorVisibility);
        mutableClassDescriptor2.setTypeParameterDescriptors(e.listOf(TypeParameterDescriptorImpl.createWithDefaultBound(mutableClassDescriptor2, companion.getEMPTY(), false, variance, Name.identifier(ExifInterface.GPS_DIRECTION_TRUE), 0, storageManager)));
        mutableClassDescriptor2.createTypeConstructor();
        b = mutableClassDescriptor2;
    }

    public static final boolean isContinuation(@Nullable FqName fqName, boolean z) {
        return z ? Intrinsics.areEqual(fqName, StandardNames.CONTINUATION_INTERFACE_FQ_NAME_RELEASE) : Intrinsics.areEqual(fqName, StandardNames.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL);
    }

    @NotNull
    public static final SimpleType transformSuspendFunctionToRuntimeFunctionType(@NotNull KotlinType kotlinType, boolean z) {
        FunctionTypesKt.isSuspendFunctionType(kotlinType);
        KotlinBuiltIns builtIns = TypeUtilsKt.getBuiltIns(kotlinType);
        Annotations annotations = kotlinType.getAnnotations();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        List<TypeProjection> valueParameterTypesFromFunctionType = FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(valueParameterTypesFromFunctionType, 10));
        Iterator<T> it2 = valueParameterTypesFromFunctionType.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TypeProjection) it2.next()).getType());
        }
        return FunctionTypesKt.createFunctionType(builtIns, annotations, receiverTypeFromFunctionType, CollectionsKt___CollectionsKt.plus((Collection<? extends SimpleType>) arrayList, KotlinTypeFactory.simpleType$default(Annotations.Companion.getEMPTY(), z ? b.getTypeConstructor() : a.getTypeConstructor(), e.listOf(TypeUtilsKt.asTypeProjection(FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType))), false, null, 16, null)), null, TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType(), (64 & 64) != 0 ? false : false).makeNullableAsSpecified(kotlinType.isMarkedNullable());
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    @NotNull
    private final DeserializationContext k;

    @NotNull
    private final ProtoBuf.TypeParameter l;

    @NotNull
    private final DeserializedAnnotations m;

    public static final class a extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends AnnotationDescriptor> getA() {
            return CollectionsKt___CollectionsKt.toList(DeserializedTypeParameterDescriptor.this.k.getComponents().getAnnotationAndConstantLoader().loadTypeParameterAnnotations(DeserializedTypeParameterDescriptor.this.getProto(), DeserializedTypeParameterDescriptor.this.k.getNameResolver()));
        }
    }

    public DeserializedTypeParameterDescriptor(@NotNull DeserializationContext deserializationContext, @NotNull ProtoBuf.TypeParameter typeParameter, int i) {
        super(deserializationContext.getStorageManager(), deserializationContext.getContainingDeclaration(), Annotations.Companion.getEMPTY(), NameResolverUtilKt.getName(deserializationContext.getNameResolver(), typeParameter.getName()), ProtoEnumFlags.INSTANCE.variance(typeParameter.getVariance()), typeParameter.getReified(), i, SourceElement.NO_SOURCE, SupertypeLoopChecker.EMPTY.INSTANCE);
        this.k = deserializationContext;
        this.l = typeParameter;
        this.m = new DeserializedAnnotations(deserializationContext.getStorageManager(), new a());
    }

    @NotNull
    public final ProtoBuf.TypeParameter getProto() {
        return this.l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    public List<KotlinType> resolveUpperBounds() {
        List<ProtoBuf.Type> listUpperBounds = ProtoTypeTableUtilKt.upperBounds(this.l, this.k.getTypeTable());
        if (listUpperBounds.isEmpty()) {
            return e.listOf(DescriptorUtilsKt.getBuiltIns(this).getDefaultBound());
        }
        TypeDeserializer typeDeserializer = this.k.getTypeDeserializer();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listUpperBounds, 10));
        Iterator<T> it2 = listUpperBounds.iterator();
        while (it2.hasNext()) {
            arrayList.add(typeDeserializer.type((ProtoBuf.Type) it2.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public DeserializedAnnotations getAnnotations() {
        return this.m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    @NotNull
    /* JADX INFO: renamed from: reportSupertypeLoopError, reason: merged with bridge method [inline-methods] */
    public Void mo4300reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        throw new IllegalStateException(Intrinsics.stringPlus("There should be no cycles for deserialized type parameters, but found for: ", this));
    }
}

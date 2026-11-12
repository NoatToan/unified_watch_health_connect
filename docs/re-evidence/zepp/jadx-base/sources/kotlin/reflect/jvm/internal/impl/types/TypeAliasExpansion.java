package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class TypeAliasExpansion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final TypeAliasExpansion a;

    @NotNull
    private final TypeAliasDescriptor b;

    @NotNull
    private final List<TypeProjection> c;

    @NotNull
    private final Map<TypeParameterDescriptor, TypeProjection> d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TypeAliasExpansion create(@Nullable TypeAliasExpansion typeAliasExpansion, @NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> list) {
            List<TypeParameterDescriptor> parameters = typeAliasDescriptor.getTypeConstructor().getParameters();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
            Iterator<T> it2 = parameters.iterator();
            while (it2.hasNext()) {
                arrayList.add(((TypeParameterDescriptor) it2.next()).getOriginal());
            }
            return new TypeAliasExpansion(typeAliasExpansion, typeAliasDescriptor, list, r.toMap(CollectionsKt___CollectionsKt.zip(arrayList, list)), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> list, Map<TypeParameterDescriptor, ? extends TypeProjection> map) {
        this.a = typeAliasExpansion;
        this.b = typeAliasDescriptor;
        this.c = list;
        this.d = map;
    }

    public /* synthetic */ TypeAliasExpansion(TypeAliasExpansion typeAliasExpansion, TypeAliasDescriptor typeAliasDescriptor, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeAliasExpansion, typeAliasDescriptor, list, map);
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.c;
    }

    @NotNull
    public final TypeAliasDescriptor getDescriptor() {
        return this.b;
    }

    @Nullable
    public final TypeProjection getReplacement(@NotNull TypeConstructor typeConstructor) {
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = typeConstructor.mo4298getDeclarationDescriptor();
        if (classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return this.d.get(classifierDescriptorMo4298getDeclarationDescriptor);
        }
        return null;
    }

    public final boolean isRecursion(@NotNull TypeAliasDescriptor typeAliasDescriptor) {
        if (!Intrinsics.areEqual(this.b, typeAliasDescriptor)) {
            TypeAliasExpansion typeAliasExpansion = this.a;
            if (!(typeAliasExpansion == null ? false : typeAliasExpansion.isRecursion(typeAliasDescriptor))) {
                return false;
            }
        }
        return true;
    }
}

package kotlin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.ExperimentalStdlibApi;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@ExperimentalStdlibApi
final class d implements TypeVariable<GenericDeclaration>, c {

    @NotNull
    private final KTypeParameter a;

    public d(@NotNull KTypeParameter kTypeParameter) {
        this.a = kTypeParameter;
    }

    @NotNull
    public final Annotation[] a() {
        return new Annotation[0];
    }

    @Nullable
    public final <T extends Annotation> T b(@NotNull Class<T> cls) {
        return null;
    }

    @NotNull
    public final Annotation[] c() {
        return new Annotation[0];
    }

    @NotNull
    public final Annotation[] d() {
        return new Annotation[0];
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (Intrinsics.areEqual(getName(), typeVariable.getName()) && Intrinsics.areEqual(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public Type[] getBounds() {
        List<KType> upperBounds = this.a.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(upperBounds, 10));
        Iterator<T> it2 = upperBounds.iterator();
        while (it2.hasNext()) {
            arrayList.add(TypesJVMKt.a((KType) it2.next(), true));
        }
        Object[] array = arrayList.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (Type[]) array;
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", Intrinsics.stringPlus("getGenericDeclaration() is not yet supported for type variables created from KType: ", this.a)));
    }

    @Override // java.lang.reflect.TypeVariable
    @NotNull
    public String getName() {
        return this.a.getName();
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.c
    @NotNull
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.e;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    @NotNull
    private final NameResolver a;

    @NotNull
    private final BinaryVersion b;

    @NotNull
    private final Function1<ClassId, SourceElement> c;

    @NotNull
    private final Map<ClassId, ProtoBuf.Class> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBasedClassDataFinder(@NotNull ProtoBuf.PackageFragment packageFragment, @NotNull NameResolver nameResolver, @NotNull BinaryVersion binaryVersion, @NotNull Function1<? super ClassId, ? extends SourceElement> function1) {
        this.a = nameResolver;
        this.b = binaryVersion;
        this.c = function1;
        List<ProtoBuf.Class> class_List = packageFragment.getClass_List();
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(class_List, 10)), 16));
        for (Object obj : class_List) {
            linkedHashMap.put(NameResolverUtilKt.getClassId(this.a, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    public ClassData findClassData(@NotNull ClassId classId) {
        ProtoBuf.Class r0 = this.d.get(classId);
        if (r0 == null) {
            return null;
        }
        return new ClassData(this.a, r0, this.b, this.c.invoke(classId));
    }

    @NotNull
    public final Collection<ClassId> getAllClassIds() {
        return this.d.keySet();
    }
}

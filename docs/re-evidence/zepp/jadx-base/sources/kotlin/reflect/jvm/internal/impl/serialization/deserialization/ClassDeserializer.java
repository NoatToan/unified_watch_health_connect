package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class ClassDeserializer {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<ClassId> c = x.setOf(ClassId.topLevel(StandardNames.FqNames.cloneable.toSafe()));

    @NotNull
    private final DeserializationComponents a;

    @NotNull
    private final Function1<a, ClassDescriptor> b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.c;
        }
    }

    public static final class a {

        @NotNull
        private final ClassId a;

        @Nullable
        private final ClassData b;

        public a(@NotNull ClassId classId, @Nullable ClassData classData) {
            this.a = classId;
            this.b = classData;
        }

        @Nullable
        public final ClassData a() {
            return this.b;
        }

        @NotNull
        public final ClassId b() {
            return this.a;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class b extends Lambda implements Function1<a, ClassDescriptor> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassDescriptor invoke(@NotNull a aVar) {
            return ClassDeserializer.this.a(aVar);
        }
    }

    public ClassDeserializer(@NotNull DeserializationComponents deserializationComponents) {
        this.a = deserializationComponents;
        this.b = deserializationComponents.getStorageManager().createMemoizedFunctionWithNullableValues(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor a(a aVar) {
        Object next;
        DeserializationContext deserializationContextCreateContext;
        PackageFragmentDescriptor packageFragmentDescriptor;
        ClassId classIdB = aVar.b();
        Iterator<ClassDescriptorFactory> it2 = this.a.getFictitiousClassDescriptorFactories().iterator();
        while (it2.hasNext()) {
            ClassDescriptor classDescriptorCreateClass = it2.next().createClass(classIdB);
            if (classDescriptorCreateClass != null) {
                return classDescriptorCreateClass;
            }
        }
        if (c.contains(classIdB)) {
            return null;
        }
        ClassData classDataA = aVar.a();
        if (classDataA == null && (classDataA = this.a.getClassDataFinder().findClassData(classIdB)) == null) {
            return null;
        }
        NameResolver nameResolverComponent1 = classDataA.component1();
        ProtoBuf.Class classComponent2 = classDataA.component2();
        BinaryVersion binaryVersionComponent3 = classDataA.component3();
        SourceElement sourceElementComponent4 = classDataA.component4();
        ClassId outerClassId = classIdB.getOuterClassId();
        if (outerClassId != null) {
            ClassDescriptor classDescriptorDeserializeClass$default = deserializeClass$default(this, outerClassId, null, 2, null);
            DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorDeserializeClass$default instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorDeserializeClass$default : null;
            if (deserializedClassDescriptor == null || !deserializedClassDescriptor.hasNestedClass$deserialization(classIdB.getShortClassName())) {
                return null;
            }
            deserializationContextCreateContext = deserializedClassDescriptor.getC();
        } else {
            Iterator<T> it3 = PackageFragmentProviderKt.packageFragments(this.a.getPackageFragmentProvider(), classIdB.getPackageFqName()).iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                packageFragmentDescriptor = (PackageFragmentDescriptor) next;
            } while (!(!(packageFragmentDescriptor instanceof DeserializedPackageFragment) || ((DeserializedPackageFragment) packageFragmentDescriptor).hasTopLevelClass(classIdB.getShortClassName())));
            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) next;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            deserializationContextCreateContext = this.a.createContext(packageFragmentDescriptor2, nameResolverComponent1, new TypeTable(classComponent2.getTypeTable()), VersionRequirementTable.Companion.create(classComponent2.getVersionRequirementTable()), binaryVersionComponent3, null);
        }
        return new DeserializedClassDescriptor(deserializationContextCreateContext, classComponent2, nameResolverComponent1, binaryVersionComponent3, sourceElementComponent4);
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i, Object obj) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    @Nullable
    public final ClassDescriptor deserializeClass(@NotNull ClassId classId, @Nullable ClassData classData) {
        return this.b.invoke(new a(classId, classData));
    }
}

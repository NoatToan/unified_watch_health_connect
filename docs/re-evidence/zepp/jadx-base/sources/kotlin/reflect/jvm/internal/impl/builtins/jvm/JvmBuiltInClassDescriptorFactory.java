package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {

    @NotNull
    private static final Name f;

    @NotNull
    private static final ClassId g;

    @NotNull
    private final ModuleDescriptor a;

    @NotNull
    private final Function1<ModuleDescriptor, DeclarationDescriptor> b;

    @NotNull
    private final NotNullLazyValue c;
    public static final /* synthetic */ KProperty<Object>[] d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final FqName e = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.g;
        }
    }

    public static final class a extends Lambda implements Function1<ModuleDescriptor, BuiltInsPackageFragment> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BuiltInsPackageFragment invoke(@NotNull ModuleDescriptor moduleDescriptor) {
            List<PackageFragmentDescriptor> fragments = moduleDescriptor.getPackage(JvmBuiltInClassDescriptorFactory.e).getFragments();
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BuiltInsPackageFragment) {
                    arrayList.add(obj);
                }
            }
            return (BuiltInsPackageFragment) CollectionsKt.first((List) arrayList);
        }
    }

    public static final class b extends Lambda implements Function0<ClassDescriptorImpl> {
        public final /* synthetic */ StorageManager b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StorageManager storageManager) {
            super(0);
            this.b = storageManager;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassDescriptorImpl getA() {
            ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl((DeclarationDescriptor) JvmBuiltInClassDescriptorFactory.this.b.invoke(JvmBuiltInClassDescriptorFactory.this.a), JvmBuiltInClassDescriptorFactory.f, Modality.ABSTRACT, ClassKind.INTERFACE, e.listOf(JvmBuiltInClassDescriptorFactory.this.a.getBuiltIns().getAnyType()), SourceElement.NO_SOURCE, false, this.b);
            classDescriptorImpl.initialize(new CloneableClassScope(this.b, classDescriptorImpl), y.emptySet(), null);
            return classDescriptorImpl;
        }
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.cloneable;
        f = fqNameUnsafe.shortName();
        g = ClassId.topLevel(fqNameUnsafe.toSafe());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JvmBuiltInClassDescriptorFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> function1) {
        this.a = moduleDescriptor;
        this.b = function1;
        this.c = storageManager.createLazyValue(new b(storageManager));
    }

    private final ClassDescriptorImpl a() {
        return (ClassDescriptorImpl) StorageKt.getValue(this.c, this, (KProperty<?>) d[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId) {
        if (Intrinsics.areEqual(classId, g)) {
            return a();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName fqName) {
        return Intrinsics.areEqual(fqName, e) ? x.setOf(a()) : y.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(@NotNull FqName fqName, @NotNull Name name) {
        return Intrinsics.areEqual(name, f) && Intrinsics.areEqual(fqName, e);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i & 4) != 0 ? a.a : function1);
    }
}

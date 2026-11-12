package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {
    public static final /* synthetic */ KProperty<Object>[] k = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    @NotNull
    private final Kind h;

    @Nullable
    private Function0<Settings> i;

    @NotNull
    private final NotNullLazyValue j;

    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    public static final class Settings {

        @NotNull
        private final ModuleDescriptor a;
        private final boolean b;

        public Settings(@NotNull ModuleDescriptor moduleDescriptor, boolean z) {
            this.a = moduleDescriptor;
            this.b = z;
        }

        @NotNull
        public final ModuleDescriptor getOwnerModuleDescriptor() {
            return this.a;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.b;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[Kind.FALLBACK.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class a extends Lambda implements Function0<JvmBuiltInsCustomizer> {
        public final /* synthetic */ StorageManager b;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a$a, reason: collision with other inner class name */
        public static final class C1163a extends Lambda implements Function0<Settings> {
            public final /* synthetic */ JvmBuiltIns a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1163a(JvmBuiltIns jvmBuiltIns) {
                super(0);
                this.a = jvmBuiltIns;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Settings getA() {
                Function0 function0 = this.a.i;
                if (function0 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                Settings settings = (Settings) function0.getA();
                this.a.i = null;
                return settings;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StorageManager storageManager) {
            super(0);
            this.b = storageManager;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JvmBuiltInsCustomizer getA() {
            return new JvmBuiltInsCustomizer(JvmBuiltIns.this.getBuiltInsModule(), this.b, new C1163a(JvmBuiltIns.this));
        }
    }

    public static final class b extends Lambda implements Function0<Settings> {
        public final /* synthetic */ ModuleDescriptor a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ModuleDescriptor moduleDescriptor, boolean z) {
            super(0);
            this.a = moduleDescriptor;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Settings getA() {
            return new Settings(this.a, this.b);
        }
    }

    public JvmBuiltIns(@NotNull StorageManager storageManager, @NotNull Kind kind) {
        super(storageManager);
        this.h = kind;
        this.j = storageManager.createLazyValue(new a(storageManager));
        int i = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i == 2) {
            createBuiltInsModule(false);
        } else {
            if (i != 3) {
                return;
            }
            createBuiltInsModule(true);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return getCustomizer();
    }

    @NotNull
    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer) StorageKt.getValue(this.j, this, (KProperty<?>) k[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return getCustomizer();
    }

    public final void initialize(@NotNull ModuleDescriptor moduleDescriptor, boolean z) {
        setPostponedSettingsComputation(new b(moduleDescriptor, z));
    }

    public final void setPostponedSettingsComputation(@NotNull Function0<Settings> function0) {
        this.i = function0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    @NotNull
    public List<ClassDescriptorFactory> getClassDescriptorFactories() {
        return CollectionsKt___CollectionsKt.plus(super.getClassDescriptorFactories(), new JvmBuiltInClassDescriptorFactory(getStorageManager(), getBuiltInsModule(), null, 4, null));
    }
}

package kotlin.reflect.jvm.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u00013B\u001f\u0012\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0019\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b1\u00102J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R,\u0010\u0018\u001a\u0018\u0012\u0014\u0012\u0012 \u0015*\b\u0018\u00010\u0014R\u00020\u00000\u0014R\u00020\u00000\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u00198\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u0004\u0018\u00010\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u0006\u0012\u0002\b\u00030\u00198T@\u0014X\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR \u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(R\u0016\u00100\u001a\u00020-8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getProperties", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "getFunctions", "", "index", "getLocalProperty", "", "other", "", "equals", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$a;", "kotlin.jvm.PlatformType", "c", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "data", "Ljava/lang/Class;", GoogleApiAvailabilityLight.a, "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "e", "Ljava/lang/String;", "getUsageModuleName", "()Ljava/lang/String;", "usageModuleName", "getMethodOwner", "methodOwner", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 5, 1})
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ReflectProperties.LazyVal<a> data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Class<?> jClass;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String usageModuleName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b \u0010!R\u001f\u0010\b\u001a\u0004\u0018\u00010\u00038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\u00020\t8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R1\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0004\u0010\u0018R'\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"kotlin/reflect/jvm/internal/KPackageImpl$a", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", GoogleApiAvailabilityLight.a, "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "e", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "f", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "()Ljava/lang/Class;", "multifileFacade", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "g", "()Lkotlin/Triple;", "metadata", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "h", "c", "()Ljava/util/Collection;", "members", "<init>", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "kotlin-reflection"}, k = 1, mv = {1, 5, 1})
    public final class a extends KDeclarationContainerImpl.Data {
        public static final /* synthetic */ KProperty[] j = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final ReflectProperties.LazySoftVal kotlinClass;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal scope;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private final ReflectProperties.LazyVal multifileFacade;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private final ReflectProperties.LazyVal metadata;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        private final ReflectProperties.LazySoftVal members;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KPackageImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;"}, k = 3, mv = {1, 5, 1})
        public static final class C1161a extends Lambda implements Function0<ReflectKotlinClass> {
            public C1161a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReflectKotlinClass getA() {
                return ReflectKotlinClass.Factory.create(KPackageImpl.this.getJClass());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001 \u0002*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/Collection;"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Collection<? extends KCallableImpl<?>>> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<KCallableImpl<?>> getA() {
                a aVar = a.this;
                return KPackageImpl.this.getMembers(aVar.f(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "a", "()Lkotlin/Triple;"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Triple<? extends JvmNameResolver, ? extends ProtoBuf.Package, ? extends JvmMetadataVersion>> {
            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Triple<JvmNameResolver, ProtoBuf.Package, JvmMetadataVersion> getA() {
                KotlinClassHeader classHeader;
                ReflectKotlinClass reflectKotlinClassB = a.this.b();
                if (reflectKotlinClassB == null || (classHeader = reflectKotlinClassB.getClassHeader()) == null) {
                    return null;
                }
                String[] data = classHeader.getData();
                String[] strings = classHeader.getStrings();
                if (data == null || strings == null) {
                    return null;
                }
                Pair<JvmNameResolver, ProtoBuf.Package> packageDataFrom = JvmProtoBufUtil.readPackageDataFrom(data, strings);
                return new Triple<>(packageDataFrom.component1(), packageDataFrom.component2(), classHeader.getMetadataVersion());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "a", "()Ljava/lang/Class;"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<Class<?>> {
            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Class<?> getA() {
                KotlinClassHeader classHeader;
                ReflectKotlinClass reflectKotlinClassB = a.this.b();
                String multifileClassName = (reflectKotlinClassB == null || (classHeader = reflectKotlinClassB.getClassHeader()) == null) ? null : classHeader.getMultifileClassName();
                if (multifileClassName == null) {
                    return null;
                }
                if (multifileClassName.length() > 0) {
                    return KPackageImpl.this.getJClass().getClassLoader().loadClass(m.replace$default(multifileClassName, '/', '.', false, 4, (Object) null));
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<MemberScope> {
            public e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MemberScope getA() {
                ReflectKotlinClass reflectKotlinClassB = a.this.b();
                return reflectKotlinClassB != null ? a.this.getModuleData().getPackagePartScopeCache().getPackagePartScope(reflectKotlinClassB) : MemberScope.Empty.INSTANCE;
            }
        }

        public a() {
            super();
            this.kotlinClass = ReflectProperties.lazySoft(new C1161a());
            this.scope = ReflectProperties.lazySoft(new e());
            this.multifileFacade = ReflectProperties.lazy(new d());
            this.metadata = ReflectProperties.lazy(new c());
            this.members = ReflectProperties.lazySoft(new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final ReflectKotlinClass b() {
            return (ReflectKotlinClass) this.kotlinClass.getValue(this, j[0]);
        }

        @NotNull
        public final Collection<KCallableImpl<?>> c() {
            return (Collection) this.members.getValue(this, j[4]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Triple<JvmNameResolver, ProtoBuf.Package, JvmMetadataVersion> d() {
            return (Triple) this.metadata.getValue(this, j[3]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Class<?> e() {
            return (Class) this.multifileFacade.getValue(this, j[2]);
        }

        @NotNull
        public final MemberScope f() {
            return (MemberScope) this.scope.getValue(this, j[1]);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012 \u0002*\b\u0018\u00010\u0000R\u00020\u00010\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$a;", "Lkotlin/reflect/jvm/internal/KPackageImpl;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/KPackageImpl$a;"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<a> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a getA() {
            return KPackageImpl.this.new a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "p1", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "p2", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "a", "(Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;"}, k = 3, mv = {1, 5, 1})
    public static final /* synthetic */ class c extends FunctionReference implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyDescriptor invoke(@NotNull MemberDeserializer memberDeserializer, @NotNull ProtoBuf.Property property) {
            return memberDeserializer.loadProperty(property);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(MemberDeserializer.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public /* synthetic */ KPackageImpl(Class cls, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, (i & 2) != 0 ? null : str);
    }

    private final MemberScope h() {
        return this.data.getA().f();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KPackageImpl) && Intrinsics.areEqual(getJClass(), ((KPackageImpl) other).getJClass());
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<FunctionDescriptor> getFunctions(@NotNull Name name) {
        return h().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    public PropertyDescriptor getLocalProperty(int index) {
        Triple<JvmNameResolver, ProtoBuf.Package, JvmMetadataVersion> tripleD = this.data.getA().d();
        if (tripleD == null) {
            return null;
        }
        JvmNameResolver jvmNameResolverComponent1 = tripleD.component1();
        ProtoBuf.Package packageComponent2 = tripleD.component2();
        JvmMetadataVersion jvmMetadataVersionComponent3 = tripleD.component3();
        ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(packageComponent2, JvmProtoBuf.packageLocalVariable, index);
        if (property != null) {
            return (PropertyDescriptor) UtilKt.deserializeToDescriptor(getJClass(), property, jvmNameResolverComponent1, new TypeTable(packageComponent2.getTypeTable()), jvmMetadataVersionComponent3, c.a);
        }
        return null;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        return this.data.getA().c();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Class<?> getMethodOwner() {
        Class<?> clsE = this.data.getA().e();
        return clsE != null ? clsE : getJClass();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    public Collection<PropertyDescriptor> getProperties(@NotNull Name name) {
        return h().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    @NotNull
    public String toString() {
        return "file class " + ReflectClassUtilKt.getClassId(getJClass()).asSingleFqName();
    }

    public KPackageImpl(@NotNull Class<?> cls, @Nullable String str) {
        this.jClass = cls;
        this.usageModuleName = str;
        this.data = ReflectProperties.lazy(new b());
    }
}

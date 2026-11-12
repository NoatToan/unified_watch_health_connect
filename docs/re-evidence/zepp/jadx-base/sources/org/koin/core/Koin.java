package org.koin.core;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.error.ScopeNotCreatedException;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.registry.PropertyRegistry;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.core.time.MeasureKt;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bV\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007JL\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\bø\u0001\u0000JN\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\bø\u0001\u0000JC\u0010\u0012\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\n\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013JC\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0012\u0010\u0017JE\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00152\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u0014\u0010\u0017JJ\u0010\u001d\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u0018\u001a\u00028\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0086\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0006\b\u0000\u0010\u0006\u0018\u0001H\u0086\bJ&\u0010%\u001a\u00020$2\n\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001J-\u0010%\u001a\u00020$\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\u0010\"\u001a\u00060 j\u0002`!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001H\u0086\bJ#\u0010%\u001a\u00020$\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\f\b\u0002\u0010\"\u001a\u00060 j\u0002`!H\u0086\bJ\u001f\u0010%\u001a\u00020$\"\b\b\u0000\u0010\u0006*\u00020&2\u0006\u0010'\u001a\u00028\u0000¢\u0006\u0004\b%\u0010(J&\u0010)\u001a\u00020$2\n\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0001J!\u0010)\u001a\u00020$\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u00012\n\u0010\"\u001a\u00060 j\u0002`!H\u0086\bJ\u0012\u0010*\u001a\u00020$2\n\u0010\"\u001a\u00060 j\u0002`!J\u0014\u0010+\u001a\u0004\u0018\u00010$2\n\u0010\"\u001a\u00060 j\u0002`!J\u0012\u0010,\u001a\u00020\u00042\n\u0010\"\u001a\u00060 j\u0002`!J'\u0010/\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00028\u0000¢\u0006\u0004\b/\u00100J!\u0010/\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0006\u0010-\u001a\u00020 ¢\u0006\u0004\b/\u00101J\u0016\u00103\u001a\u00020\u00042\u0006\u0010-\u001a\u00020 2\u0006\u00102\u001a\u00020\u0001J\u000e\u00104\u001a\u00020\u00042\u0006\u0010-\u001a\u00020 J\u0006\u00105\u001a\u00020\u0004J\u001e\u00108\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0014\u00109\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0019J\u0006\u0010:\u001a\u00020\u0004R\"\u0010B\u001a\u00020;8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\"\u0010I\u001a\u00020C8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010A\u001a\u0004\bF\u0010GR\"\u0010P\u001a\u00020J8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bO\u0010A\u001a\u0004\bM\u0010NR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006W"}, d2 = {"Lorg/koin/core/Koin;", "", "Lorg/koin/core/logger/Logger;", "logger", "", "setupLogger", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/LazyThreadSafetyMode;", "mode", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/Lazy;", "inject", "injectOrNull", "get", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrNull", "Lkotlin/reflect/KClass;", "clazz", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", DefaultSettingsSpiCall.n, "", "secondaryTypes", "", "allowOverride", "declare", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "getAll", "", "Lorg/koin/core/scope/ScopeID;", "scopeId", "source", "Lorg/koin/core/scope/Scope;", "createScope", "Lorg/koin/core/component/KoinScopeComponent;", "t", "(Lorg/koin/core/component/KoinScopeComponent;)Lorg/koin/core/scope/Scope;", "getOrCreateScope", "getScope", "getScopeOrNull", "deleteScope", "key", "defaultValue", "getProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "setProperty", "deleteProperty", "close", "Lorg/koin/core/module/Module;", "modules", "loadModules", "unloadModules", "createEagerInstances", "Lorg/koin/core/registry/ScopeRegistry;", "a", "Lorg/koin/core/registry/ScopeRegistry;", "getScopeRegistry", "()Lorg/koin/core/registry/ScopeRegistry;", "getScopeRegistry$annotations", "()V", "scopeRegistry", "Lorg/koin/core/registry/InstanceRegistry;", "b", "Lorg/koin/core/registry/InstanceRegistry;", "getInstanceRegistry", "()Lorg/koin/core/registry/InstanceRegistry;", "getInstanceRegistry$annotations", "instanceRegistry", "Lorg/koin/core/registry/PropertyRegistry;", "c", "Lorg/koin/core/registry/PropertyRegistry;", "getPropertyRegistry", "()Lorg/koin/core/registry/PropertyRegistry;", "getPropertyRegistry$annotations", "propertyRegistry", "<set-?>", GoogleApiAvailabilityLight.a, "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "<init>", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class Koin {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ScopeRegistry scopeRegistry = new ScopeRegistry(this);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final InstanceRegistry instanceRegistry = new InstanceRegistry(this);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PropertyRegistry propertyRegistry = new PropertyRegistry(this);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Logger logger = new EmptyLogger();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Koin.this.getInstanceRegistry().createAllEagerInstances$koin_core();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Qualifier b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Qualifier qualifier) {
            super(0);
            this.a = str;
            this.b = qualifier;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "|- create scope - id:'" + this.a + "' q:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/component/KoinScopeComponent;", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ TypeQualifier b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, TypeQualifier typeQualifier) {
            super(0);
            this.a = str;
            this.b = typeQualifier;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "|- create scope - id:'" + this.a + "' q:" + this.b;
        }
    }

    /* JADX INFO: renamed from: org.koin.core.Koin$createScope$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ TypeQualifier b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, TypeQualifier typeQualifier) {
            super(0);
            this.a = str;
            this.b = typeQualifier;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "|- create scope - id:'" + this.a + "' q:" + this.b;
        }
    }

    /* JADX INFO: renamed from: org.koin.core.Koin$createScope$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass3 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ TypeQualifier b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, TypeQualifier typeQualifier) {
            super(0);
            this.a = str;
            this.b = typeQualifier;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "|- create scope - id:'" + this.a + "' q:" + this.b;
        }
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return koin.createScope(str, qualifier, obj);
    }

    public static /* synthetic */ void declare$default(Koin koin, Object obj, Qualifier qualifier, List list, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        Qualifier qualifier2 = qualifier;
        if ((i & 4) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        boolean z2 = (i & 8) != 0 ? true : z;
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        List listListOf = e.listOf(Reflection.getOrCreateKotlinClass(Object.class));
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) listListOf, (Iterable) list);
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m4495synchronized(rootScope, new Koin$declare$$inlined$declare$1(rootScope, obj, qualifier2, listPlus, z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Koin koin, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    @KoinInternalApi
    public static /* synthetic */ void getInstanceRegistry$annotations() {
    }

    public static /* synthetic */ Scope getOrCreateScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return koin.getOrCreateScope(str, qualifier, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Koin koin, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, function0);
    }

    @KoinInternalApi
    public static /* synthetic */ void getPropertyRegistry$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getScopeRegistry$annotations() {
    }

    public static /* synthetic */ Lazy inject$default(Koin koin, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$inject$$inlined$inject$1(rootScope, qualifier, function0));
    }

    public static /* synthetic */ Lazy injectOrNull$default(Koin koin, Qualifier qualifier, LazyThreadSafetyMode lazyThreadSafetyMode, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            lazyThreadSafetyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        Scope rootScope = koin.getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$1(rootScope, qualifier, function0));
    }

    public static /* synthetic */ void loadModules$default(Koin koin, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        koin.loadModules(list, z);
    }

    public final void close() {
        this.scopeRegistry.close$koin_core();
        this.instanceRegistry.close$koin_core();
        this.propertyRegistry.close();
    }

    public final void createEagerInstances() {
        this.logger.info("create eager instances ...");
        if (!this.logger.isAt(Level.DEBUG)) {
            this.instanceRegistry.createAllEagerInstances$koin_core();
            return;
        }
        double dMeasureDuration = MeasureKt.measureDuration(new a());
        this.logger.debug("eager instances created in " + dMeasureDuration + " ms");
    }

    @NotNull
    public final Scope createScope(@NotNull String scopeId, @NotNull Qualifier qualifier, @Nullable Object source) {
        this.logger.log(Level.DEBUG, new b(scopeId, qualifier));
        return this.scopeRegistry.createScope(scopeId, qualifier, source);
    }

    public final /* synthetic */ <T> void declare(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        List listListOf = e.listOf(Reflection.getOrCreateKotlinClass(Object.class));
        Scope rootScope = getScopeRegistry().getRootScope();
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) listListOf, (Iterable) secondaryTypes);
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Intrinsics.needClassReification();
        koinPlatformTools.m4495synchronized(rootScope, new Koin$declare$$inlined$declare$1(rootScope, instance, qualifier, listPlus, allowOverride));
    }

    public final void deleteProperty(@NotNull String key) {
        this.propertyRegistry.deleteProperty(key);
    }

    public final void deleteScope(@NotNull String scopeId) {
        this.scopeRegistry.deleteScope$koin_core(scopeId);
    }

    public final /* synthetic */ <T> T get(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    public final /* synthetic */ <T> List<T> getAll() {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return rootScope.getAll(Reflection.getOrCreateKotlinClass(Object.class));
    }

    @NotNull
    public final InstanceRegistry getInstanceRegistry() {
        return this.instanceRegistry;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final Scope getOrCreateScope(@NotNull String scopeId, @NotNull Qualifier qualifier, @Nullable Object source) {
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(scopeId);
        return scopeOrNull == null ? createScope(scopeId, qualifier, source) : scopeOrNull;
    }

    public final /* synthetic */ <T> T getOrNull(Qualifier qualifier, Function0<? extends ParametersHolder> parameters) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) rootScope.getOrNull(Reflection.getOrCreateKotlinClass(Object.class), qualifier, parameters);
    }

    @NotNull
    public final <T> T getProperty(@NotNull String key, @NotNull T defaultValue) {
        T t = (T) this.propertyRegistry.getProperty(key);
        return t == null ? defaultValue : t;
    }

    @NotNull
    public final PropertyRegistry getPropertyRegistry() {
        return this.propertyRegistry;
    }

    @NotNull
    public final Scope getScope(@NotNull String scopeId) throws ScopeNotCreatedException {
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(scopeId);
        if (scopeOrNull != null) {
            return scopeOrNull;
        }
        throw new ScopeNotCreatedException("No scope found for id '" + scopeId + '\'');
    }

    @Nullable
    public final Scope getScopeOrNull(@NotNull String scopeId) {
        return this.scopeRegistry.getScopeOrNull(scopeId);
    }

    @NotNull
    public final ScopeRegistry getScopeRegistry() {
        return this.scopeRegistry;
    }

    public final /* synthetic */ <T> Lazy<T> inject(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new Koin$inject$$inlined$inject$1(rootScope, qualifier, parameters));
    }

    public final /* synthetic */ <T> Lazy<T> injectOrNull(Qualifier qualifier, LazyThreadSafetyMode mode, Function0<? extends ParametersHolder> parameters) {
        Scope rootScope = getScopeRegistry().getRootScope();
        Intrinsics.needClassReification();
        return LazyKt__LazyJVMKt.lazy(mode, (Function0) new Koin$injectOrNull$$inlined$injectOrNull$1(rootScope, qualifier, parameters));
    }

    public final void loadModules(@NotNull List<Module> modules, boolean allowOverride) {
        this.instanceRegistry.loadModules$koin_core(modules, allowOverride);
        this.scopeRegistry.loadScopes(modules);
    }

    public final void setProperty(@NotNull String key, @NotNull Object value) {
        this.propertyRegistry.saveProperty$koin_core(key, value);
    }

    @KoinInternalApi
    public final void setupLogger(@NotNull Logger logger) {
        this.logger = logger;
    }

    public final void unloadModules(@NotNull List<Module> modules) {
        this.instanceRegistry.unloadModules$koin_core(modules);
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        koin.getLogger().log(Level.DEBUG, new AnonymousClass2(str, typeQualifier));
        return koin.getScopeRegistry().createScope(str, typeQualifier, obj);
    }

    public final /* synthetic */ <T> Scope getOrCreateScope(String scopeId) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        Scope scopeOrNull = getScopeRegistry().getScopeOrNull(scopeId);
        return scopeOrNull == null ? createScope$default(this, scopeId, typeQualifier, null, 4, null) : scopeOrNull;
    }

    @Nullable
    public final <T> T getProperty(@NotNull String key) {
        return (T) this.propertyRegistry.getProperty(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Koin koin, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return koin.get(kClass, qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Koin koin, KClass kClass, Qualifier qualifier, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            qualifier = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        return koin.getOrNull(kClass, qualifier, function0);
    }

    public final /* synthetic */ <T> Scope createScope(String scopeId, Object source) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        getLogger().log(Level.DEBUG, new AnonymousClass2(scopeId, typeQualifier));
        return getScopeRegistry().createScope(scopeId, typeQualifier, source);
    }

    public final <T> T get(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        return (T) this.scopeRegistry.getRootScope().get(clazz, qualifier, parameters);
    }

    @Nullable
    public final <T> T getOrNull(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @Nullable Function0<? extends ParametersHolder> parameters) {
        return (T) this.scopeRegistry.getRootScope().getOrNull(clazz, qualifier, parameters);
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = KoinPlatformTools.INSTANCE.generateId();
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        koin.getLogger().log(Level.DEBUG, new AnonymousClass3(str, typeQualifier));
        return koin.getScopeRegistry().createScope(str, typeQualifier, null);
    }

    public final /* synthetic */ <T> Scope createScope(String scopeId) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        getLogger().log(Level.DEBUG, new AnonymousClass3(scopeId, typeQualifier));
        return getScopeRegistry().createScope(scopeId, typeQualifier, null);
    }

    @NotNull
    public final <T extends KoinScopeComponent> Scope createScope(@NotNull T t) {
        String scopeId = KoinScopeComponentKt.getScopeId(t);
        TypeQualifier scopeName = KoinScopeComponentKt.getScopeName(t);
        this.logger.log(Level.DEBUG, new c(scopeId, scopeName));
        return this.scopeRegistry.createScope(scopeId, scopeName, null);
    }
}

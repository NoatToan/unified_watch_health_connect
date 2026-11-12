package org.koin.core.registry;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0001J(\u0010\u000f\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0001J\u001b\u0010\u0012\u001a\u00020\u00022\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u001a\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR&\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\f0\u001ej\b\u0012\u0004\u0012\u00020\f`\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R&\u0010%\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\n0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010+\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0016\u001a\u0004\b(\u0010)R\u0019\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0,8F@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, d2 = {"Lorg/koin/core/registry/ScopeRegistry;", "", "", "a", "Lorg/koin/core/module/Module;", "module", "b", "", "Lorg/koin/core/scope/ScopeID;", "scopeId", "Lorg/koin/core/scope/Scope;", "getScopeOrNull", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "source", "createScope", "deleteScope$koin_core", "(Ljava/lang/String;)V", "deleteScope", "scope", "(Lorg/koin/core/scope/Scope;)V", "close$koin_core", "()V", "close", "", "modules", "loadScopes", "Lorg/koin/core/Koin;", "Lorg/koin/core/Koin;", "_koin", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "_scopeDefinitions", "", "c", "Ljava/util/Map;", "_scopes", GoogleApiAvailabilityLight.a, "Lorg/koin/core/scope/Scope;", "getRootScope", "()Lorg/koin/core/scope/Scope;", "getRootScope$annotations", "rootScope", "", "getScopeDefinitions", "()Ljava/util/Set;", "scopeDefinitions", "<init>", "(Lorg/koin/core/Koin;)V", "Companion", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class ScopeRegistry {

    @NotNull
    private static final String e = "_";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Koin _koin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HashSet<Qualifier> _scopeDefinitions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Map<String, Scope> _scopes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Scope rootScope;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final StringQualifier f = QualifierKt._q("_");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lorg/koin/core/registry/ScopeRegistry$Companion;", "", "Lorg/koin/core/qualifier/StringQualifier;", "rootScopeQualifier", "Lorg/koin/core/qualifier/StringQualifier;", "getRootScopeQualifier", "()Lorg/koin/core/qualifier/StringQualifier;", "getRootScopeQualifier$annotations", "()V", "", "ROOT_SCOPE_ID", "Ljava/lang/String;", "<init>", "koin-core"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @PublishedApi
        public static /* synthetic */ void getRootScopeQualifier$annotations() {
        }

        @NotNull
        public final StringQualifier getRootScopeQualifier() {
            return ScopeRegistry.f;
        }
    }

    public ScopeRegistry(@NotNull Koin koin) {
        this._koin = koin;
        HashSet<Qualifier> hashSet = new HashSet<>();
        this._scopeDefinitions = hashSet;
        Map<String, Scope> mapSafeHashMap = KoinPlatformTools.INSTANCE.safeHashMap();
        this._scopes = mapSafeHashMap;
        Scope scope = new Scope(f, "_", true, koin);
        this.rootScope = scope;
        hashSet.add(scope.getScopeQualifier());
        mapSafeHashMap.put(scope.getId(), scope);
    }

    private final void a() {
        Iterator<T> it2 = this._scopes.values().iterator();
        while (it2.hasNext()) {
            ((Scope) it2.next()).close();
        }
    }

    private final void b(Module module) {
        this._scopeDefinitions.addAll(module.getScopes());
    }

    public static /* synthetic */ Scope createScope$default(ScopeRegistry scopeRegistry, String str, Qualifier qualifier, Object obj, int i, Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return scopeRegistry.createScope(str, qualifier, obj);
    }

    @KoinInternalApi
    public static /* synthetic */ void getRootScope$annotations() {
    }

    public final void close$koin_core() {
        a();
        this._scopes.clear();
        this._scopeDefinitions.clear();
    }

    @PublishedApi
    @NotNull
    public final Scope createScope(@NotNull String scopeId, @NotNull Qualifier qualifier, @Nullable Object source) throws ScopeAlreadyCreatedException {
        if (!this._scopeDefinitions.contains(qualifier)) {
            this._koin.getLogger().info("Warning: Scope '" + qualifier + "' not defined. Creating it");
            this._scopeDefinitions.add(qualifier);
        }
        if (this._scopes.containsKey(scopeId)) {
            throw new ScopeAlreadyCreatedException("Scope with id '" + scopeId + "' is already created");
        }
        Scope scope = new Scope(qualifier, scopeId, false, this._koin, 4, null);
        if (source != null) {
            scope.set_source(source);
        }
        scope.linkTo(this.rootScope);
        this._scopes.put(scopeId, scope);
        return scope;
    }

    public final void deleteScope$koin_core(@NotNull String scopeId) {
        Scope scope = this._scopes.get(scopeId);
        if (scope == null) {
            return;
        }
        deleteScope$koin_core(scope);
    }

    @NotNull
    public final Scope getRootScope() {
        return this.rootScope;
    }

    @NotNull
    public final Set<Qualifier> getScopeDefinitions() {
        return this._scopeDefinitions;
    }

    @PublishedApi
    @Nullable
    public final Scope getScopeOrNull(@NotNull String scopeId) {
        return this._scopes.get(scopeId);
    }

    public final void loadScopes(@NotNull List<Module> modules) {
        Iterator<T> it2 = modules.iterator();
        while (it2.hasNext()) {
            b((Module) it2.next());
        }
    }

    public final void deleteScope$koin_core(@NotNull Scope scope) {
        this._koin.getInstanceRegistry().dropScopeInstances$koin_core(scope);
        this._scopes.remove(scope.getId());
    }
}

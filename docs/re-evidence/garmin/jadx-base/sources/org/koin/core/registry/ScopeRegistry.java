package org.koin.core.registry;

import am.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\u0010\u0018\u001a\u00060\u000fj\u0002`\u0010H\u0001J(\u0010\u0019\u001a\u00020\u00112\n\u0010\u0018\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\n\u0010\u0018\u001a\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0002\b\u001eJ\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001eJ\r\u0010 \u001a\u00020\u001dH\u0000¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u001dH\u0002J\u0014\u0010#\u001a\u00020\u001d2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\nJ\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, d2 = {"Lorg/koin/core/registry/ScopeRegistry;", "", "_koin", "Lorg/koin/core/Koin;", "<init>", "(Lorg/koin/core/Koin;)V", "_scopeDefinitions", "", "Lorg/koin/core/qualifier/Qualifier;", "scopeDefinitions", "", "getScopeDefinitions", "()Ljava/util/Set;", "_scopes", "", "", "Lorg/koin/core/scope/ScopeID;", "Lorg/koin/core/scope/Scope;", "rootScope", "getRootScope$annotations", "()V", "getRootScope", "()Lorg/koin/core/scope/Scope;", "getScopeOrNull", "scopeId", "createScope", "qualifier", "source", "deleteScope", "", "deleteScope$koin_core", Action.SCOPE_ATTRIBUTE, "close", "close$koin_core", "closeAllScopes", "loadScopes", "modules", "Lorg/koin/core/module/Module;", "loadModule", "module", "Companion", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopeRegistry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ROOT_SCOPE_ID = "_root_";
    private static final StringQualifier rootScopeQualifier = QualifierKt._q(ROOT_SCOPE_ID);
    private final Koin _koin;
    private final Set<Qualifier> _scopeDefinitions;
    private final Map<String, Scope> _scopes;
    private final Scope rootScope;

    public ScopeRegistry(Koin koin) {
        koin.getClass();
        this._koin = koin;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        Set<Qualifier> setSafeSet = koinPlatformTools.safeSet();
        this._scopeDefinitions = setSafeSet;
        Map<String, Scope> mapSafeHashMap = koinPlatformTools.safeHashMap();
        this._scopes = mapSafeHashMap;
        Scope scope = new Scope(rootScopeQualifier, ROOT_SCOPE_ID, true, koin);
        this.rootScope = scope;
        setSafeSet.add(scope.getScopeQualifier());
        mapSafeHashMap.put(scope.getId(), scope);
    }

    private final void closeAllScopes() {
        Iterator it = h0.b1(this._scopes.values()).iterator();
        while (it.hasNext()) {
            ((Scope) it.next()).close();
        }
    }

    public static /* synthetic */ Scope createScope$default(ScopeRegistry scopeRegistry, String str, Qualifier qualifier, Object obj, int i14, Object obj2) {
        if ((i14 & 4) != 0) {
            obj = null;
        }
        return scopeRegistry.createScope(str, qualifier, obj);
    }

    @KoinInternalApi
    public static /* synthetic */ void getRootScope$annotations() {
    }

    private final void loadModule(Module module) {
        this._scopeDefinitions.addAll(module.getScopes());
    }

    public final void close$koin_core() {
        closeAllScopes();
        this._scopes.clear();
        this._scopeDefinitions.clear();
    }

    public final Scope createScope(String scopeId, Qualifier qualifier, Object source) throws ScopeAlreadyCreatedException {
        scopeId.getClass();
        qualifier.getClass();
        this._koin.getLogger().debug("| (+) Scope - id:'" + scopeId + "' q:'" + qualifier + CoreConstants.SINGLE_QUOTE_CHAR);
        if (!this._scopeDefinitions.contains(qualifier)) {
            this._koin.getLogger().debug("| Scope '" + qualifier + "' not defined. Creating it ...");
            this._scopeDefinitions.add(qualifier);
        }
        if (this._scopes.containsKey(scopeId)) {
            throw new ScopeAlreadyCreatedException(j.m("Scope with id '", scopeId, "' is already created"));
        }
        Scope scope = new Scope(qualifier, scopeId, false, this._koin, 4, null);
        if (source != null) {
            this._koin.getLogger().debug("|- Scope source set id:'" + scopeId + "' -> " + source);
            scope.setSourceValue(source);
        }
        scope.linkTo(this.rootScope);
        this._scopes.put(scopeId, scope);
        return scope;
    }

    public final void deleteScope$koin_core(Scope scope) {
        scope.getClass();
        this._koin.getInstanceRegistry().dropScopeInstances$koin_core(scope);
        this._scopes.remove(scope.getId());
    }

    public final Scope getRootScope() {
        return this.rootScope;
    }

    public final Set<Qualifier> getScopeDefinitions() {
        return this._scopeDefinitions;
    }

    public final Scope getScopeOrNull(String scopeId) {
        scopeId.getClass();
        return this._scopes.get(scopeId);
    }

    public final void loadScopes(Set<Module> modules) {
        modules.getClass();
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            loadModule((Module) it.next());
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lorg/koin/core/registry/ScopeRegistry$Companion;", "", "<init>", "()V", "ROOT_SCOPE_ID", "", "rootScopeQualifier", "Lorg/koin/core/qualifier/StringQualifier;", "getRootScopeQualifier$annotations", "getRootScopeQualifier", "()Lorg/koin/core/qualifier/StringQualifier;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static /* synthetic */ void getRootScopeQualifier$annotations() {
        }

        public final StringQualifier getRootScopeQualifier() {
            return ScopeRegistry.rootScopeQualifier;
        }

        private Companion() {
        }
    }

    public final void deleteScope$koin_core(String scopeId) {
        scopeId.getClass();
        Scope scope = this._scopes.get(scopeId);
        if (scope != null) {
            deleteScope$koin_core(scope);
        }
    }
}

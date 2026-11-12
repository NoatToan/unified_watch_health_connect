package org.koin.core.instance;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import k23.d;
import org.koin.core.logger.Logger;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lorg/koin/core/instance/ResolutionContext;", "", "Lorg/koin/core/logger/Logger;", "logger", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "Lk23/d;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lorg/koin/core/parameter/ParametersHolder;", "parameters", "<init>", "(Lorg/koin/core/logger/Logger;Lorg/koin/core/scope/Scope;Lk23/d;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/parameter/ParametersHolder;)V", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "Lk23/d;", "getClazz", "()Lk23/d;", "Lorg/koin/core/qualifier/Qualifier;", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "Lorg/koin/core/parameter/ParametersHolder;", "getParameters", "()Lorg/koin/core/parameter/ParametersHolder;", "", "debugTag", "Ljava/lang/String;", "getDebugTag", "()Ljava/lang/String;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResolutionContext {
    private final d<?> clazz;
    private final String debugTag;
    private final Logger logger;
    private final ParametersHolder parameters;
    private final Qualifier qualifier;
    private final Scope scope;

    public ResolutionContext(Logger logger, Scope scope, d<?> dVar, Qualifier qualifier, ParametersHolder parametersHolder) {
        logger.getClass();
        scope.getClass();
        dVar.getClass();
        this.logger = logger;
        this.scope = scope;
        this.clazz = dVar;
        this.qualifier = qualifier;
        this.parameters = parametersHolder;
        this.debugTag = "t:'" + KClassExtKt.getFullName(dVar) + "' - q:'" + qualifier + CoreConstants.SINGLE_QUOTE_CHAR;
    }

    public final d<?> getClazz() {
        return this.clazz;
    }

    public final String getDebugTag() {
        return this.debugTag;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final ParametersHolder getParameters() {
        return this.parameters;
    }

    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    public final Scope getScope() {
        return this.scope;
    }

    public /* synthetic */ ResolutionContext(Logger logger, Scope scope, d dVar, Qualifier qualifier, ParametersHolder parametersHolder, int i14, j jVar) {
        this(logger, scope, dVar, (i14 & 8) != 0 ? null : qualifier, (i14 & 16) != 0 ? null : parametersHolder);
    }
}

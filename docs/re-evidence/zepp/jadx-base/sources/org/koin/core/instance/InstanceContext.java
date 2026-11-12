package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lorg/koin/core/instance/InstanceContext;", "", "Lorg/koin/core/Koin;", "a", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "koin", "Lorg/koin/core/scope/Scope;", "b", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "Lorg/koin/core/parameter/ParametersHolder;", "c", "Lorg/koin/core/parameter/ParametersHolder;", "getParameters", "()Lorg/koin/core/parameter/ParametersHolder;", "parameters", "<init>", "(Lorg/koin/core/Koin;Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/ParametersHolder;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class InstanceContext {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Koin koin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Scope scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final ParametersHolder parameters;

    public InstanceContext(@NotNull Koin koin, @NotNull Scope scope, @Nullable ParametersHolder parametersHolder) {
        this.koin = koin;
        this.scope = scope;
        this.parameters = parametersHolder;
    }

    @NotNull
    public final Koin getKoin() {
        return this.koin;
    }

    @Nullable
    public final ParametersHolder getParameters() {
        return this.parameters;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }

    public /* synthetic */ InstanceContext(Koin koin, Scope scope, ParametersHolder parametersHolder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(koin, scope, (i & 4) != 0 ? null : parametersHolder);
    }
}

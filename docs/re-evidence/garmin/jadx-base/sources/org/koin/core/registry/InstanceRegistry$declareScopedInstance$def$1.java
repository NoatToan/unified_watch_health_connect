package org.koin.core.registry;

import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class InstanceRegistry$declareScopedInstance$def$1<T> implements p<Scope, ParametersHolder, T> {
    final /* synthetic */ T $instance;

    public InstanceRegistry$declareScopedInstance$def$1(T t7) {
        this.$instance = t7;
    }

    @Override // e23.p
    public final T invoke(Scope scope, ParametersHolder parametersHolder) {
        scope.getClass();
        parametersHolder.getClass();
        return this.$instance;
    }
}

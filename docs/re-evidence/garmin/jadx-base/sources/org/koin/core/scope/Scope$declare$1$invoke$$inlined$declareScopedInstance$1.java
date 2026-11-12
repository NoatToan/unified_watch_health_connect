package org.koin.core.scope;

import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import org.koin.core.parameter.ParametersHolder;
import p005kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class Scope$declare$1$invoke$$inlined$declareScopedInstance$1<T> implements p<Scope, ParametersHolder, T> {
    final /* synthetic */ Object $instance;

    public Scope$declare$1$invoke$$inlined$declareScopedInstance$1(Object obj) {
        this.$instance = obj;
    }

    @Override // e23.p
    public final T invoke(Scope scope, ParametersHolder parametersHolder) {
        scope.getClass();
        parametersHolder.getClass();
        return (T) this.$instance;
    }
}

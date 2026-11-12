package org.koin.core;

import ch.qos.logback.core.net.SyslogConstants;
import e23.a;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class Koin$inject$$inlined$inject$1<T> implements a<T> {
    final /* synthetic */ a $parameters;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ Scope this$0;

    public Koin$inject$$inlined$inject$1(Scope scope, Qualifier qualifier, a aVar) {
        this.this$0 = scope;
        this.$qualifier = qualifier;
        this.$parameters = aVar;
    }

    @Override // e23.a
    public final T invoke() {
        s.l();
        throw null;
    }
}

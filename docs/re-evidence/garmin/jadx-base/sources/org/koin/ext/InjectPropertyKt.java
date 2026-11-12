package org.koin.ext;

import ch.qos.logback.core.joran.action.Action;
import k23.i;
import org.koin.core.Koin;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0007\u001a*\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00020\bH\u0086\b¢\u0006\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lk23/i;", "", "inject", "(Lk23/i;)V", "Lorg/koin/core/Koin;", "koin", "(Lk23/i;Lorg/koin/core/Koin;)V", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "(Lk23/i;Lorg/koin/core/scope/Scope;)V", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InjectPropertyKt {
    public static final <T> void inject(i<T> iVar) {
        iVar.getClass();
        KoinPlatformTools.INSTANCE.defaultContext().get().getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public static final <T> void inject(i<T> iVar, Koin koin) {
        iVar.getClass();
        koin.getClass();
        koin.getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public static final <T> void inject(i<T> iVar, Scope scope) {
        iVar.getClass();
        scope.getClass();
        s.l();
        throw null;
    }
}

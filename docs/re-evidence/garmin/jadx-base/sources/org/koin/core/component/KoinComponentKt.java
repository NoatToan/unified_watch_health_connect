package org.koin.core.component;

import ch.qos.logback.core.net.SyslogConstants;
import o13.l;
import o13.n;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\t\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aW\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0016\b\n\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"", "T", "Lorg/koin/core/component/KoinComponent;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "get", "(Lorg/koin/core/component/KoinComponent;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Ljava/lang/Object;", "Lo13/n;", "mode", "Lo13/l;", "inject", "(Lorg/koin/core/component/KoinComponent;Lorg/koin/core/qualifier/Qualifier;Lo13/n;Le23/a;)Lo13/l;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinComponentKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.core.component.KoinComponentKt$inject$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1<T> implements e23.a<T> {
        final /* synthetic */ e23.a<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ KoinComponent $this_inject;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(KoinComponent koinComponent, Qualifier qualifier, e23.a<? extends ParametersHolder> aVar) {
            this.$this_inject = koinComponent;
            this.$qualifier = qualifier;
            this.$parameters = aVar;
        }

        @Override // e23.a
        public final T invoke() {
            KoinComponent koinComponent = this.$this_inject;
            if (koinComponent instanceof KoinScopeComponent) {
                ((KoinScopeComponent) koinComponent).getScope();
                s.l();
                throw null;
            }
            koinComponent.getKoin().getScopeRegistry().getRootScope();
            s.l();
            throw null;
        }
    }

    public static final <T> T get(KoinComponent koinComponent, Qualifier qualifier, e23.a<? extends ParametersHolder> aVar) {
        koinComponent.getClass();
        if (koinComponent instanceof KoinScopeComponent) {
            ((KoinScopeComponent) koinComponent).getScope();
            s.l();
            throw null;
        }
        koinComponent.getKoin().getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public static Object get$default(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar, int i14, Object obj) {
        koinComponent.getClass();
        if (koinComponent instanceof KoinScopeComponent) {
            ((KoinScopeComponent) koinComponent).getScope();
            s.l();
            throw null;
        }
        koinComponent.getKoin().getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public static final <T> l<T> inject(KoinComponent koinComponent, Qualifier qualifier, n nVar, e23.a<? extends ParametersHolder> aVar) {
        koinComponent.getClass();
        nVar.getClass();
        s.l();
        throw null;
    }

    public static l inject$default(KoinComponent koinComponent, Qualifier qualifier, n nVar, e23.a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            nVar = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        koinComponent.getClass();
        nVar.getClass();
        s.l();
        throw null;
    }
}

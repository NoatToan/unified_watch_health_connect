package org.koin.android.ext.android;

import android.content.ComponentCallbacks;
import ch.qos.logback.core.net.SyslogConstants;
import e23.a;
import o13.l;
import o13.n;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aW\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aG\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\n\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\u0004\u0018\u0001`\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroid/content/ComponentCallbacks;", "Lorg/koin/core/Koin;", "getKoin", "(Landroid/content/ComponentCallbacks;)Lorg/koin/core/Koin;", "", "T", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lo13/n;", "mode", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lo13/l;", "inject", "(Landroid/content/ComponentCallbacks;Lorg/koin/core/qualifier/Qualifier;Lo13/n;Le23/a;)Lo13/l;", "get", "(Landroid/content/ComponentCallbacks;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Ljava/lang/Object;", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComponentCallbackExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.android.ext.android.ComponentCallbackExtKt$inject$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1<T> implements a<T> {
        final /* synthetic */ a<ParametersHolder> $parameters;
        final /* synthetic */ Qualifier $qualifier;
        final /* synthetic */ ComponentCallbacks $this_inject;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ComponentCallbacks componentCallbacks, Qualifier qualifier, a<? extends ParametersHolder> aVar) {
            this.$this_inject = componentCallbacks;
            this.$qualifier = qualifier;
            this.$parameters = aVar;
        }

        @Override // e23.a
        public final T invoke() {
            AndroidKoinScopeExtKt.getKoinScope(this.$this_inject);
            s.l();
            throw null;
        }
    }

    public static final <T> T get(ComponentCallbacks componentCallbacks, Qualifier qualifier, a<? extends ParametersHolder> aVar) {
        componentCallbacks.getClass();
        AndroidKoinScopeExtKt.getKoinScope(componentCallbacks);
        s.l();
        throw null;
    }

    public static Object get$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, a aVar, int i14, Object obj) {
        componentCallbacks.getClass();
        AndroidKoinScopeExtKt.getKoinScope(componentCallbacks);
        s.l();
        throw null;
    }

    public static final Koin getKoin(ComponentCallbacks componentCallbacks) {
        componentCallbacks.getClass();
        return componentCallbacks instanceof KoinComponent ? ((KoinComponent) componentCallbacks).getKoin() : GlobalContext.INSTANCE.get();
    }

    public static final <T> l<T> inject(ComponentCallbacks componentCallbacks, Qualifier qualifier, n nVar, a<? extends ParametersHolder> aVar) {
        componentCallbacks.getClass();
        nVar.getClass();
        s.l();
        throw null;
    }

    public static l inject$default(ComponentCallbacks componentCallbacks, Qualifier qualifier, n nVar, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            nVar = n.SYNCHRONIZED;
        }
        componentCallbacks.getClass();
        nVar.getClass();
        s.l();
        throw null;
    }
}

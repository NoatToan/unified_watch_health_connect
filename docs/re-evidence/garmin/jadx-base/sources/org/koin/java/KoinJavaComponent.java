package org.koin.java;

import e23.a;
import o13.l;
import o13.m;
import o13.n;
import org.koin.core.Koin;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r\"\u0004\b\u0000\u0010\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJE\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lorg/koin/java/KoinJavaComponent;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lo13/l;", "inject", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Lo13/l;", "injectOrNull", "get", "(Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Ljava/lang/Object;", "getOrNull", "Lorg/koin/core/Koin;", "getKoin", "()Lorg/koin/core/Koin;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KoinJavaComponent {
    public static final KoinJavaComponent INSTANCE = new KoinJavaComponent();

    private KoinJavaComponent() {
    }

    public static final <T> T get(Class<?> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        clazz.getClass();
        return (T) getKoin().get(s0.f105811a.b(clazz), qualifier, parameters);
    }

    public static /* synthetic */ Object get$default(Class cls, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return get(cls, qualifier, aVar);
    }

    public static final Koin getKoin() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    public static final <T> T getOrNull(Class<?> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        clazz.getClass();
        return (T) getKoin().getOrNull(s0.f105811a.b(clazz), qualifier, parameters);
    }

    public static /* synthetic */ Object getOrNull$default(Class cls, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return getOrNull(cls, qualifier, aVar);
    }

    public static final <T> l<T> inject(Class<?> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        clazz.getClass();
        return m.a(n.SYNCHRONIZED, new x73.a(clazz, qualifier, parameters, 1));
    }

    public static /* synthetic */ l inject$default(Class cls, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return inject(cls, qualifier, aVar);
    }

    public static final <T> l<T> injectOrNull(Class<?> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        clazz.getClass();
        return m.b(new x73.a(clazz, qualifier, parameters, 0));
    }

    public static /* synthetic */ l injectOrNull$default(Class cls, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return injectOrNull(cls, qualifier, aVar);
    }

    public static final <T> l<T> injectOrNull(Class<?> cls, Qualifier qualifier) {
        cls.getClass();
        return injectOrNull$default(cls, qualifier, null, 4, null);
    }

    public static final <T> l<T> injectOrNull(Class<?> cls) {
        cls.getClass();
        return injectOrNull$default(cls, null, null, 6, null);
    }

    public static final <T> l<T> inject(Class<?> cls, Qualifier qualifier) {
        cls.getClass();
        return inject$default(cls, qualifier, null, 4, null);
    }

    public static final <T> l<T> inject(Class<?> cls) {
        cls.getClass();
        return inject$default(cls, null, null, 6, null);
    }

    public static final <T> T get(Class<?> cls, Qualifier qualifier) {
        cls.getClass();
        return (T) get$default(cls, qualifier, null, 4, null);
    }

    public static final <T> T getOrNull(Class<?> cls, Qualifier qualifier) {
        cls.getClass();
        return (T) getOrNull$default(cls, qualifier, null, 4, null);
    }

    public static final <T> T get(Class<?> cls) {
        cls.getClass();
        return (T) get$default(cls, null, null, 6, null);
    }

    public static final <T> T getOrNull(Class<?> cls) {
        cls.getClass();
        return (T) getOrNull$default(cls, null, null, 6, null);
    }
}

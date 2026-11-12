package org.koin.mp;

import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import dh.b;
import e23.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k23.d;
import o13.n;
import org.koin.core.context.GlobalContext;
import org.koin.core.context.KoinContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.PrintLogger;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\n\u0010\u001c\u001a\u00060\u0001j\u0002`\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#\"\u0004\b\u0000\u0010!\"\u0004\b\u0001\u0010\"¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010!¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lorg/koin/mp/KoinPlatformTools;", "", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", JWKParameterNames.RSA_EXPONENT, "", "getStackTrace", "(Ljava/lang/Exception;)Ljava/lang/String;", "Lk23/d;", "kClass", "getClassName", "(Lk23/d;)Ljava/lang/String;", "getClassFullNameOrNull", "Lo13/n;", "defaultLazyMode", "()Lo13/n;", "Lorg/koin/core/logger/Level;", "level", "Lorg/koin/core/logger/Logger;", "defaultLogger", "(Lorg/koin/core/logger/Level;)Lorg/koin/core/logger/Logger;", "Lorg/koin/core/context/KoinContext;", "defaultContext", "()Lorg/koin/core/context/KoinContext;", "R", "Lorg/koin/mp/Lockable;", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Le23/a;)Ljava/lang/Object;", "K", "V", "", "safeHashMap", "()Ljava/util/Map;", "", "safeSet", "()Ljava/util/Set;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KoinPlatformTools {
    public static final KoinPlatformTools INSTANCE = new KoinPlatformTools();

    private KoinPlatformTools() {
    }

    public static /* synthetic */ Logger defaultLogger$default(KoinPlatformTools koinPlatformTools, Level level, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            level = Level.INFO;
        }
        return koinPlatformTools.defaultLogger(level);
    }

    public final KoinContext defaultContext() {
        return GlobalContext.INSTANCE;
    }

    public final n defaultLazyMode() {
        return n.SYNCHRONIZED;
    }

    public final Logger defaultLogger(Level level) {
        level.getClass();
        return new PrintLogger(level);
    }

    public final String getClassFullNameOrNull(d<?> kClass) {
        kClass.getClass();
        return kClass.w();
    }

    public final String getClassName(d<?> kClass) {
        kClass.getClass();
        return b.u(kClass).getName();
    }

    public final String getStackTrace(Exception e4) {
        e4.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(e4);
        sb3.append(InstanceFactory.ERROR_SEPARATOR);
        StackTraceElement[] stackTrace = e4.getStackTrace();
        stackTrace.getClass();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            if (w.z(className, "sun.reflect", false)) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb3.append(h0.k0(arrayList, InstanceFactory.ERROR_SEPARATOR, null, null, null, 62));
        return sb3.toString();
    }

    public final <K, V> Map<K, V> safeHashMap() {
        return new ConcurrentHashMap();
    }

    public final <K> Set<K> safeSet() {
        Set<K> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        setNewSetFromMap.getClass();
        return setNewSetFromMap;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final <R> R m499synchronized(Object lock, a<? extends R> block) {
        R rInvoke;
        lock.getClass();
        block.getClass();
        synchronized (lock) {
            rInvoke = block.invoke();
        }
        return rInvoke;
    }
}

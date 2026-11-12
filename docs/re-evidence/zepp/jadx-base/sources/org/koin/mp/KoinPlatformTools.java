package org.koin.mp;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.watch.notification.TransportUri;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.GlobalContext;
import org.koin.core.context.KoinContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.PrintLogger;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003J\u0012\u0010\t\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u0011J)\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0000\u0010\u0019\"\u0004\b\u0001\u0010\u001a¨\u0006\u001f"}, d2 = {"Lorg/koin/mp/KoinPlatformTools;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "getStackTrace", "Lkotlin/reflect/KClass;", "kClass", "getClassName", "generateId", "Lkotlin/LazyThreadSafetyMode;", "defaultLazyMode", "Lorg/koin/core/logger/Level;", FirebaseAnalytics.Param.LEVEL, "Lorg/koin/core/logger/Logger;", "defaultLogger", "Lorg/koin/core/context/KoinContext;", "defaultContext", "R", "lock", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "K", "V", "", "safeHashMap", "<init>", "()V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class KoinPlatformTools {

    @NotNull
    public static final KoinPlatformTools INSTANCE = new KoinPlatformTools();

    private KoinPlatformTools() {
    }

    public static /* synthetic */ Logger defaultLogger$default(KoinPlatformTools koinPlatformTools, Level level, int i, Object obj) {
        if ((i & 1) != 0) {
            level = Level.INFO;
        }
        return koinPlatformTools.defaultLogger(level);
    }

    @NotNull
    public final KoinContext defaultContext() {
        return GlobalContext.INSTANCE;
    }

    @NotNull
    public final LazyThreadSafetyMode defaultLazyMode() {
        return LazyThreadSafetyMode.SYNCHRONIZED;
    }

    @NotNull
    public final Logger defaultLogger(@NotNull Level level) {
        return new PrintLogger(level);
    }

    @NotNull
    public final String generateId() {
        return UUID.randomUUID().toString();
    }

    @NotNull
    public final String getClassName(@NotNull KClass<?> kClass) {
        return JvmClassMappingKt.getJavaClass((KClass) kClass).getName();
    }

    @NotNull
    public final String getStackTrace(@NotNull Exception e) {
        StringBuilder sb = new StringBuilder();
        sb.append(e);
        sb.append(InstanceFactory.ERROR_SEPARATOR);
        StackTraceElement[] stackTrace = e.getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!(!StringsKt__StringsKt.contains$default((CharSequence) stackTraceElement.getClassName(), (CharSequence) "sun.reflect", false, 2, (Object) null))) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, InstanceFactory.ERROR_SEPARATOR, null, null, 0, null, null, 62, null));
        return sb.toString();
    }

    @NotNull
    public final <K, V> Map<K, V> safeHashMap() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final <R> R m4495synchronized(@NotNull Object lock, @NotNull Function0<? extends R> block) {
        R rInvoke;
        synchronized (lock) {
            rInvoke = block.invoke();
        }
        return rInvoke;
    }
}

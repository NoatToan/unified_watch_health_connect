package org.koin.ext;

import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000\"&\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/reflect/KClass;", "", "getFullName", "saveCache", "", "a", "Ljava/util/Map;", "classNames", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class KClassExtKt {

    @NotNull
    private static final Map<KClass<?>, String> a = KoinPlatformTools.INSTANCE.safeHashMap();

    @NotNull
    public static final String getFullName(@NotNull KClass<?> kClass) {
        String str = a.get(kClass);
        return str == null ? saveCache(kClass) : str;
    }

    @NotNull
    public static final String saveCache(@NotNull KClass<?> kClass) {
        String className = KoinPlatformTools.INSTANCE.getClassName(kClass);
        a.put(kClass, className);
        return className;
    }
}

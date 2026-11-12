package org.koin.ext;

import java.util.Map;
import k23.d;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"$\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk23/d;", "", "getFullName", "(Lk23/d;)Ljava/lang/String;", "saveCache", "", "classNames", "Ljava/util/Map;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KClassExtKt {
    private static final Map<d<?>, String> classNames = KoinPlatformTools.INSTANCE.safeHashMap();

    public static final String getFullName(d<?> dVar) {
        dVar.getClass();
        String str = classNames.get(dVar);
        return str == null ? saveCache(dVar) : str;
    }

    public static final String saveCache(d<?> dVar) {
        dVar.getClass();
        String className = KoinPlatformTools.INSTANCE.getClassName(dVar);
        classNames.put(dVar, className);
        return className;
    }
}

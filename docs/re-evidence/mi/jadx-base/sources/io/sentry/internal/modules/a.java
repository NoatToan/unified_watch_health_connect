package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
@ApiStatus.Experimental
public final class a extends d {
    public final List<b> d;

    public a(@NotNull List<b> list, @NotNull ILogger iLogger) {
        super(iLogger);
        this.d = list;
    }

    @Override // io.sentry.internal.modules.d
    public Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            Map<String, String> mapA = it.next().a();
            if (mapA != null) {
                treeMap.putAll(mapA);
            }
        }
        return treeMap;
    }
}

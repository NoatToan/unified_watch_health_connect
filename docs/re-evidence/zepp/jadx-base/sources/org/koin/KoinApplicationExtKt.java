package org.koin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.core.KoinApplication;
import org.koin.core.error.NoPropertyFileFoundException;
import org.koin.core.registry.PropertyRegistryExtKt;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lorg/koin/core/KoinApplication;", "", "fileName", "fileProperties", "environmentProperties", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class KoinApplicationExtKt {
    @NotNull
    public static final KoinApplication environmentProperties(@NotNull KoinApplication koinApplication) {
        PropertyRegistryExtKt.loadEnvironmentProperties(koinApplication.getKoin().getPropertyRegistry());
        return koinApplication;
    }

    @NotNull
    public static final KoinApplication fileProperties(@NotNull KoinApplication koinApplication, @NotNull String str) throws NoPropertyFileFoundException {
        PropertyRegistryExtKt.loadPropertiesFromFile(koinApplication.getKoin().getPropertyRegistry(), str);
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication fileProperties$default(KoinApplication koinApplication, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "/koin.properties";
        }
        return fileProperties(koinApplication, str);
    }
}

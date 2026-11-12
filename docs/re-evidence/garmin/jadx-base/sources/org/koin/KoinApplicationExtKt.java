package org.koin;

import java.io.IOException;
import org.koin.core.KoinApplication;
import org.koin.core.error.NoPropertyFileFoundException;
import org.koin.core.registry.PropertyRegistryExtKt;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0005"}, d2 = {"fileProperties", "Lorg/koin/core/KoinApplication;", "fileName", "", "environmentProperties", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinApplicationExtKt {
    public static final KoinApplication environmentProperties(KoinApplication koinApplication) {
        koinApplication.getClass();
        PropertyRegistryExtKt.loadEnvironmentProperties(koinApplication.getKoin().getPropertyRegistry());
        return koinApplication;
    }

    public static final KoinApplication fileProperties(KoinApplication koinApplication, String str) throws NoPropertyFileFoundException, IOException {
        koinApplication.getClass();
        str.getClass();
        PropertyRegistryExtKt.loadPropertiesFromFile(koinApplication.getKoin().getPropertyRegistry(), str);
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication fileProperties$default(KoinApplication koinApplication, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = "/koin.properties";
        }
        return fileProperties(koinApplication, str);
    }
}

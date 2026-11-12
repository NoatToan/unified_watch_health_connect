package org.koin.core.component;

import org.koin.core.Koin;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"Lorg/koin/core/component/KoinComponent;", "", "getKoin", "Lorg/koin/core/Koin;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface KoinComponent {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Koin getKoin(KoinComponent koinComponent) {
            return KoinPlatformTools.INSTANCE.defaultContext().get();
        }
    }

    Koin getKoin();
}

package org.koin.core.extension;

import org.koin.core.Koin;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lorg/koin/core/extension/KoinExtension;", "", "onRegister", "", "koin", "Lorg/koin/core/Koin;", "onClose", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface KoinExtension {
    void onClose();

    void onRegister(Koin koin);
}

package org.koin.core.error;

import kotlin.Metadata;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/koin/core/error/ScopeAlreadyCreatedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", SOAP.XMLNS, "<init>", "(Ljava/lang/String;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class ScopeAlreadyCreatedException extends Exception {
    public ScopeAlreadyCreatedException(@NotNull String str) {
        super(str);
    }
}

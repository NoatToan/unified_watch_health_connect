package org.koin.core.qualifier;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lorg/koin/core/qualifier/Qualifier;", "", "", "Lorg/koin/core/qualifier/QualifierValue;", "getValue", "()Ljava/lang/String;", "value", "koin-core"}, k = 1, mv = {1, 5, 1})
public interface Qualifier {
    @NotNull
    String getValue();
}

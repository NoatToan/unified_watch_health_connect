package com.google.crypto.tink;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface Catalogue<P> {
    KeyManager<P> getKeyManager(String str, String str2, int i14);

    PrimitiveWrapper<?, P> getPrimitiveWrapper();
}

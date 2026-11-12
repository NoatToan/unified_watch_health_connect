package com.nimbusds.jose.jwk;

import androidx.core.view.j;
import com.nimbusds.jose.KeyException;

/* JADX INFO: loaded from: classes3.dex */
public class JWKException extends KeyException {
    public JWKException(String str) {
        super(str);
    }

    public static JWKException expectedClass(Class<? extends JWK> cls) {
        return new JWKException(j.h(cls, "Invalid JWK: Must be an instance of "));
    }

    public static JWKException expectedPrivate() {
        return new JWKException("Expected private JWK but none available");
    }
}

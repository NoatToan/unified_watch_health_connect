package com.nimbusds.jose.crypto.impl;

import java.security.AlgorithmParameters;
import java.security.Provider;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmParametersHelper {
    public static AlgorithmParameters getInstance(String str, Provider provider) {
        return provider == null ? AlgorithmParameters.getInstance(str) : AlgorithmParameters.getInstance(str, provider);
    }
}

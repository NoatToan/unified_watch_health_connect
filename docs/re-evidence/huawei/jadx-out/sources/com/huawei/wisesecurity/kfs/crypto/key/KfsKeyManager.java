package com.huawei.wisesecurity.kfs.crypto.key;

import defpackage.ynn;
import defpackage.yob;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes20.dex */
public interface KfsKeyManager {
    void generate(ynn ynnVar) throws yob;

    Certificate[] getCertificateChain(String str) throws yob;

    Key getKey(String str) throws yob;

    PrivateKey getPrivateKey(String str) throws yob;

    PublicKey getPublicKey(String str) throws yob;

    boolean hasAlias(String str) throws yob;
}

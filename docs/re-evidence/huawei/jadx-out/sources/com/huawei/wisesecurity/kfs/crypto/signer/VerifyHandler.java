package com.huawei.wisesecurity.kfs.crypto.signer;

import defpackage.ynz;

/* JADX INFO: loaded from: classes20.dex */
public interface VerifyHandler {
    VerifyHandler fromBase64Data(String str) throws ynz;

    VerifyHandler fromBase64UrlData(String str) throws ynz;

    VerifyHandler fromData(String str) throws ynz;

    VerifyHandler fromData(byte[] bArr) throws ynz;

    VerifyHandler fromHexData(String str) throws ynz;

    boolean verify(String str) throws ynz;

    boolean verify(byte[] bArr) throws ynz;

    boolean verifyBase64(String str) throws ynz;

    boolean verifyBase64Url(String str) throws ynz;

    boolean verifyHex(String str) throws ynz;
}

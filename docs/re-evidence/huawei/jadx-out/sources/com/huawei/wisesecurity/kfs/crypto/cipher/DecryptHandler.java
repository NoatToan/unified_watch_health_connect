package com.huawei.wisesecurity.kfs.crypto.cipher;

import defpackage.ynz;

/* JADX INFO: loaded from: classes20.dex */
public interface DecryptHandler {
    DecryptHandler from(byte[] bArr) throws ynz;

    DecryptHandler fromBase64(String str) throws ynz;

    DecryptHandler fromBase64Url(String str) throws ynz;

    DecryptHandler fromHex(String str) throws ynz;

    byte[] to() throws ynz;

    String toBase64() throws ynz;

    String toHex() throws ynz;

    String toRawString() throws ynz;
}

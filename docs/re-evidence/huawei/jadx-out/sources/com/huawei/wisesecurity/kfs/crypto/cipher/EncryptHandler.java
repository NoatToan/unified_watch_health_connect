package com.huawei.wisesecurity.kfs.crypto.cipher;

import defpackage.ynz;

/* JADX INFO: loaded from: classes20.dex */
public interface EncryptHandler {
    EncryptHandler from(String str) throws ynz;

    EncryptHandler from(byte[] bArr) throws ynz;

    EncryptHandler fromBase64(String str) throws ynz;

    EncryptHandler fromBase64Url(String str) throws ynz;

    EncryptHandler fromHex(String str) throws ynz;

    byte[] to() throws ynz;

    String toBase64() throws ynz;

    String toBase64Url() throws ynz;

    String toHex() throws ynz;
}

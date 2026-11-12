package com.huawei.wisesecurity.kfs.crypto.digest;

import defpackage.ynz;

/* JADX INFO: loaded from: classes46.dex */
public interface DigestHandler {
    byte[] digest() throws ynz;

    String digestBase64() throws ynz;

    String digestBase64Url() throws ynz;

    String digestHex() throws ynz;

    DigestHandler from(String str) throws ynz;

    DigestHandler from(byte[] bArr) throws ynz;

    DigestHandler fromBase64(String str) throws ynz;

    DigestHandler fromBase64Url(String str) throws ynz;

    DigestHandler fromHex(String str) throws ynz;
}

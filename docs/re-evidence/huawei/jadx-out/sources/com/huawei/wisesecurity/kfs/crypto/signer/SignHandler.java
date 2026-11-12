package com.huawei.wisesecurity.kfs.crypto.signer;

import defpackage.ynz;

/* JADX INFO: loaded from: classes20.dex */
public interface SignHandler {
    SignHandler from(String str) throws ynz;

    SignHandler from(byte[] bArr) throws ynz;

    SignHandler fromBase64(String str) throws ynz;

    SignHandler fromBase64Url(String str) throws ynz;

    SignHandler fromHex(String str) throws ynz;

    byte[] sign() throws ynz;

    String signBase64() throws ynz;

    String signBase64Url() throws ynz;

    String signHex() throws ynz;
}

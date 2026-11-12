package com.baidu.ocr.sdk.utils;

import com.baidu.ocr.sdk.exception.OCRError;

/* JADX INFO: loaded from: classes2.dex */
public interface Parser<T> {
    T parse(String str) throws OCRError;
}

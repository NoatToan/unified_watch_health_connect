package com.baidu.ocr.sdk;

import com.baidu.ocr.sdk.exception.OCRError;

/* JADX INFO: loaded from: classes2.dex */
public interface OnResultListener<T> {
    void onError(OCRError oCRError);

    void onResult(T t);
}

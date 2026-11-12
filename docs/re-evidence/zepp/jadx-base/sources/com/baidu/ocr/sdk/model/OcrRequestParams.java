package com.baidu.ocr.sdk.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class OcrRequestParams extends BaseImageParams implements RequestParams {
    private Map<String, String> params = new HashMap();

    @Override // com.baidu.ocr.sdk.model.BaseImageParams, com.baidu.ocr.sdk.model.RequestParams
    public Map<String, String> getStringParams() {
        return this.params;
    }

    public void putParam(String str, String str2) {
        if (str2 != null) {
            this.params.put(str, str2);
        } else {
            this.params.remove(str);
        }
    }

    public void putParam(String str, boolean z) {
        if (z) {
            putParam(str, "true");
        } else {
            putParam(str, "false");
        }
    }

    public void putParam(String str, long j) {
        putParam(str, String.valueOf(j));
    }
}

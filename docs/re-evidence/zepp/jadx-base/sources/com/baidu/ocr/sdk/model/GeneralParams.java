package com.baidu.ocr.sdk.model;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralParams extends GeneralBasicParams {
    public static final String GRANULARITY_BIG = "big";
    public static final String GRANULARITY_SMALL = "small";

    public void setRecognizeGranularity(String str) {
        putParam("recognize_granularity", str);
    }

    public void setVertexesLocation(boolean z) {
        putParam("vertexes_location", z);
    }
}

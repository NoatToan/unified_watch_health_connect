package com.baidu.ocr.sdk.model;

import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface RequestParams {
    Map<String, File> getFileParams();

    Map<String, String> getStringParams();
}

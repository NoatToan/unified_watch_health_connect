package com.baidu.ocr.sdk.model;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class BaseImageParams implements RequestParams {
    public Map<String, File> fileMap = new HashMap();

    @Override // com.baidu.ocr.sdk.model.RequestParams
    public Map<String, File> getFileParams() {
        return this.fileMap;
    }

    public File getImageFile() {
        return this.fileMap.get("image");
    }

    @Override // com.baidu.ocr.sdk.model.RequestParams
    public Map<String, String> getStringParams() {
        return null;
    }

    public void setImageFile(File file) {
        this.fileMap.put("image", file);
    }
}

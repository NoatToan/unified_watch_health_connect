package com.baidu.ocr.sdk.model;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralBasicParams implements RequestParams {
    public static final String CHINESE_ENGLISH = "CHN_ENG";
    public static final String ENGLISH = "ENG";
    public static final String FRENCH = "FRE";
    public static final String GERMAN = "GER";
    public static final String ITALIAN = "ITA";
    public static final String JAPANESE = "JAP";
    public static final String PORTUGUESE = "POR";
    public static final String RUSSIAN = "RUS";
    public static final String SPANISH = "SPA";
    private Map<String, String> params = new HashMap();
    private Map<String, File> fileMap = new HashMap();

    @Override // com.baidu.ocr.sdk.model.RequestParams
    public Map<String, File> getFileParams() {
        return this.fileMap;
    }

    public File getImageFile() {
        return this.fileMap.get("image");
    }

    @Override // com.baidu.ocr.sdk.model.RequestParams
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

    public void setDetectDirection(boolean z) {
        if (z) {
            putParam("detect_direction", "true");
        } else {
            putParam("detect_direction", "false");
        }
    }

    public void setDetectLanguage(boolean z) {
        putParam("detect_language", z);
    }

    public void setImageFile(File file) {
        this.fileMap.put("image", file);
    }

    public void setLanguageType(String str) {
        putParam("language_type", str);
    }

    public void putParam(String str, boolean z) {
        if (z) {
            putParam(str, "true");
        } else {
            putParam(str, "false");
        }
    }
}

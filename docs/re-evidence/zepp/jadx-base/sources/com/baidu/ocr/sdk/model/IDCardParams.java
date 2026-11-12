package com.baidu.ocr.sdk.model;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class IDCardParams implements RequestParams {
    public static final String ID_CARD_SIDE_BACK = "back";
    public static final String ID_CARD_SIDE_FRONT = "front";
    private boolean detectDirection;
    private boolean detectRisk;
    private String idCardSide;
    private File imageFile;
    private int imageQuality = 20;

    @Override // com.baidu.ocr.sdk.model.RequestParams
    public Map<String, File> getFileParams() {
        HashMap map = new HashMap();
        map.put("image", this.imageFile);
        return map;
    }

    public String getIdCardSide() {
        return this.idCardSide;
    }

    public File getImageFile() {
        return this.imageFile;
    }

    public int getImageQuality() {
        return this.imageQuality;
    }

    @Override // com.baidu.ocr.sdk.model.RequestParams
    public Map<String, String> getStringParams() {
        HashMap map = new HashMap();
        map.put("id_card_side", this.idCardSide);
        if (this.detectDirection) {
            map.put("detect_direction", "true");
        } else {
            map.put("detect_direction", "false");
        }
        if (this.detectRisk) {
            map.put("detect_risk", "true");
        } else {
            map.put("detect_risk", "false");
        }
        return map;
    }

    public boolean isDetectDirection() {
        return this.detectDirection;
    }

    public void setDetectDirection(boolean z) {
        this.detectDirection = z;
    }

    public void setDetectRisk(boolean z) {
        this.detectRisk = z;
    }

    public void setIdCardSide(String str) {
        this.idCardSide = str;
    }

    public void setImageFile(File file) {
        this.imageFile = file;
    }

    public void setImageQuality(int i) {
        this.imageQuality = i;
    }
}

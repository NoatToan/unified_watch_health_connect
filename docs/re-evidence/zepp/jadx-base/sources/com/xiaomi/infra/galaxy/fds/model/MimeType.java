package com.xiaomi.infra.galaxy.fds.model;

import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Strings;

/* JADX INFO: loaded from: classes22.dex */
public enum MimeType {
    UNKNOWN("unknown"),
    IMAGE_BMP("image/bmp"),
    IMAGE_PNG("image/png"),
    IMAGE_JPEG(MimeTypes.IMAGE_JPEG),
    IMAGE_GIF("image/gif"),
    IMAGE_WEBP("image/webp"),
    IMAGE_TIFF("image/tiff");

    private String val;

    MimeType(String str) {
        this.val = str;
    }

    public static MimeType fromString(String str) {
        if (Strings.isNullOrEmpty(str)) {
            return UNKNOWN;
        }
        String strTrim = str.toLowerCase().trim();
        if (strTrim.endsWith("jpg")) {
            return IMAGE_JPEG;
        }
        for (MimeType mimeType : values()) {
            if (mimeType.val.endsWith(strTrim)) {
                return mimeType;
            }
        }
        return UNKNOWN;
    }

    public String getFormatVal() {
        if (this == UNKNOWN) {
            return null;
        }
        return this.val.substring(6);
    }

    public String getVal() {
        return this.val;
    }
}

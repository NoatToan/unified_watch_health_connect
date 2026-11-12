package com.huawei.openalliance.ad.constant;

import com.huawei.openalliance.ad.utils.dg;
import java.util.Locale;

/* JADX INFO: loaded from: classes41.dex */
public enum ArContentFormat {
    AR_GLB(".glb"),
    AR_GLTF(".gltf");

    private String format;

    public String getFormat() {
        return this.format;
    }

    public static boolean isArFormatSupported(String str) {
        if (dg.b(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.endsWith(AR_GLB.getFormat()) || lowerCase.endsWith(AR_GLTF.getFormat());
    }

    ArContentFormat(String str) {
        this.format = str;
    }
}

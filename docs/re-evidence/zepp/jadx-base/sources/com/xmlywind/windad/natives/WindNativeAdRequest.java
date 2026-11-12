package com.xmlywind.windad.natives;

import com.xmlywind.windad.WindAdRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class WindNativeAdRequest extends WindAdRequest {
    public WindNativeAdRequest(String str, String str2, int i, Map<String, Object> map) {
        super(str, str2, i, map);
        this.a = 5;
    }

    public static WindNativeAdRequest getWindVideoAdRequest(WindAdRequest windAdRequest) {
        if (windAdRequest != null) {
            return new WindNativeAdRequest(windAdRequest.getPlacementId(), windAdRequest.getUserId(), 1, windAdRequest.getOptions());
        }
        return null;
    }
}

package com.xmlywind.windad.base;

import com.xmlywind.windad.WindAdRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class WindVideoAdRequest extends WindAdRequest {
    public WindVideoAdRequest(String str, String str2, Map<String, Object> map) {
        super(str, str2, map);
        this.a = 1;
    }

    @Deprecated
    public WindVideoAdRequest(String str, String str2, boolean z, Map<String, Object> map) {
        this(str, str2, map);
        this.a = z ? 1 : 4;
    }
}

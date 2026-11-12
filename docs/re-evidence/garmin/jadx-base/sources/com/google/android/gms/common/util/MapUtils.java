package com.google.android.gms.common.util;

import am.j;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.maps.android.BuildConfig;
import java.util.HashMap;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder sb3, HashMap<String, String> map) {
        sb3.append("{");
        boolean z14 = true;
        for (String str : map.keySet()) {
            if (!z14) {
                sb3.append(",");
            }
            String str2 = map.get(str);
            j.y(sb3, "\"", str, "\":");
            if (str2 == null) {
                sb3.append(BuildConfig.TRAVIS);
            } else {
                j.y(sb3, "\"", str2, "\"");
            }
            z14 = false;
        }
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
    }
}

package com.huawei.secure.android.common.intent;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes42.dex */
public class SafeUri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22849a = "SafeUri";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f22850b = "";

    private SafeUri() {
    }

    public static boolean getBooleanQueryParameter(Uri uri, String str, boolean z) {
        if (uri != null && !TextUtils.isEmpty(str)) {
            try {
                return uri.getBooleanQueryParameter(str, z);
            } catch (Exception e) {
                Log.e(f22849a, "getBooleanQueryParameter: " + e.getMessage());
            }
        }
        return z;
    }

    public static String getQueryParameter(Uri uri, String str) {
        if (uri == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return uri.getQueryParameter(str);
        } catch (Exception e) {
            Log.e(f22849a, "getQueryParameter: " + e.getMessage());
            return "";
        }
    }

    public static Set<String> getQueryParameterNames(Uri uri) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (uri != null) {
            try {
                return uri.getQueryParameterNames();
            } catch (Exception e) {
                Log.e(f22849a, "getQueryParameterNames: " + e.getMessage());
            }
        }
        return linkedHashSet;
    }

    public static List<String> getQueryParameters(Uri uri, String str) {
        ArrayList arrayList = new ArrayList();
        if (uri != null && !TextUtils.isEmpty(str)) {
            try {
                return uri.getQueryParameters(str);
            } catch (Exception e) {
                Log.e(f22849a, "getQueryParameters: " + e.getMessage());
            }
        }
        return arrayList;
    }
}

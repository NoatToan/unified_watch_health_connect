package com.huawei.hianalytics.process;

import com.huawei.hianalytics.w0;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class HaEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f11596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11597c;

    public HaEvent(String str, JSONObject jSONObject, long j) {
        this.f11597c = j;
        this.f11595a = str;
        this.f11596b = jSONObject;
    }

    public static HaEvent create(String str, JSONObject jSONObject) {
        return new HaEvent(str, jSONObject, System.currentTimeMillis());
    }

    public static HaEvent create(String str, LinkedHashMap<String, String> linkedHashMap) {
        return new HaEvent(str, linkedHashMap == null ? new JSONObject() : w0.a(linkedHashMap), System.currentTimeMillis());
    }
}

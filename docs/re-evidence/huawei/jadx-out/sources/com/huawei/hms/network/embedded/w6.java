package com.huawei.hms.network.embedded;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import ohos.ace.adapter.capability.web.WebDataBaseColumns;

/* JADX INFO: loaded from: classes34.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f15564b;

    public String toString() {
        return this.f15563a + " authParams=" + this.f15564b;
    }

    public int hashCode() {
        return ((this.f15563a.hashCode() + 899) * 31) + this.f15564b.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return w6Var.f15563a.equals(this.f15563a) && w6Var.f15564b.equals(this.f15564b);
    }

    public String d() {
        return this.f15563a;
    }

    public String c() {
        return this.f15564b.get(WebDataBaseColumns.EntryColumns.COLUMN_NAME_REALM);
    }

    public Charset b() {
        String str = this.f15564b.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public Map<String, String> a() {
        return this.f15564b;
    }

    public w6 a(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f15564b);
        linkedHashMap.put("charset", charset.name());
        return new w6(this.f15563a, linkedHashMap);
    }

    public w6(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (map == null) {
            throw new NullPointerException("authParams == null");
        }
        this.f15563a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
        }
        this.f15564b = Collections.unmodifiableMap(linkedHashMap);
    }

    public w6(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        }
        if (str2 == null) {
            throw new NullPointerException("realm == null");
        }
        this.f15563a = str;
        this.f15564b = Collections.singletonMap(WebDataBaseColumns.EntryColumns.COLUMN_NAME_REALM, str2);
    }
}

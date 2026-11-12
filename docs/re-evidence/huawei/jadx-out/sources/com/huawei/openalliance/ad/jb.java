package com.huawei.openalliance.ad;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f19300a = new HashMap();

    public void a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f19300a.put(b(str), str2);
    }

    public String a(String str) {
        if (str != null) {
            return this.f19300a.get(b(str));
        }
        return null;
    }

    public Iterable<? extends String> a() {
        return this.f19300a.keySet();
    }

    private String b(String str) {
        return str.toLowerCase(Locale.ENGLISH);
    }
}

package com.xiaomi.push.service;

import com.xiaomi.push.di;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class bj {
    public static di a(di diVar) {
        Map<String, String> map;
        if (diVar != null && (map = diVar.f93b) != null) {
            map.remove("score_info");
        }
        return diVar;
    }
}

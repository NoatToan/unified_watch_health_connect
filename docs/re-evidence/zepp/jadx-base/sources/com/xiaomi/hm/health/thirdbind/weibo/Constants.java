package com.xiaomi.hm.health.thirdbind.weibo;

import com.xiaomi.hm.health.baseutil.GlobalConfig;

/* JADX INFO: loaded from: classes21.dex */
public interface Constants {
    public static final String APP_KEY;

    static {
        APP_KEY = GlobalConfig.get().isBuildMidong() ? "2475165547" : "1445984418";
    }
}

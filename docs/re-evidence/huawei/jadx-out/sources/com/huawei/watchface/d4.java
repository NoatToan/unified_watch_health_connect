package com.huawei.watchface;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public enum d4 {
    WEIXIN_FRIEND(0),
    WEIXIN_MOMENT(1),
    XIAOHONGSHU(2),
    DOUYIN(3),
    QQ(4),
    QQ_ZONE(5),
    WEIBO(6),
    SAVE_LOCAL(7),
    SAVE_CLIPBOARD(8),
    MORE(9),
    FACEBOOK(10),
    TELEGRAM(11),
    INSTAGRAM(12),
    WHATSAPP(13),
    TWITTER(14),
    LINKEDIN(15),
    VK(16),
    UNKNOWN(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f30119a = new HashMap();
    private final int mValue;

    static {
        for (d4 d4Var : values()) {
            f30119a.put(Integer.valueOf(d4Var.getValue()), d4Var);
        }
    }

    d4(int i) {
        this.mValue = i;
    }

    public static d4 fromValue(int i) {
        d4 d4Var = (d4) f30119a.get(Integer.valueOf(i));
        return d4Var != null ? d4Var : UNKNOWN;
    }

    public int getValue() {
        return this.mValue;
    }
}

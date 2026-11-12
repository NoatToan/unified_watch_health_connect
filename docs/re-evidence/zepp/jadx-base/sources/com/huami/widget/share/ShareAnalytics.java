package com.huami.widget.share;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class ShareAnalytics {
    public static final String EVENT_SHARE_TYPE_CLICK = "ShareType_Click";

    public static final class ParamKey {
        public static final String SHARE_TYPE = "ShareType";
    }

    public static final class ParamValue {
        public static final String FACEBOOK = "facebook";
        public static final String INSTAGRAM = "instagram";
        public static final String LINE = "line";
        public static final String MICIRCLE = "micircle";
        public static final String MOMENTS = "moments";
        public static final String QQ = "QQ";
        public static final String QQ_SPACE = "QQ space";
        public static final String SAVE = "save";
        public static final String TWITTER = "twitter";
        public static final String WECHAT = "wechat";
        public static final String WEIBO = "weibo";
    }

    public static void analyticsShareType(String str) {
        HashMap map = new HashMap();
        map.put(ParamKey.SHARE_TYPE, str);
        Analytics.recordEvent(new CountEventBuilder(EVENT_SHARE_TYPE_CLICK).putExtras(map));
    }
}

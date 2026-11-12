package com.xiaomi.hm.health.utils;

import com.huami.widget.share.Constant;
import com.xiaomi.hm.health.thirdbind.weibo.Constants;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/utils/ShareCommonConfig;", "", "", PointCategory.INIT, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ShareCommonConfig {

    @NotNull
    public static final ShareCommonConfig INSTANCE = new ShareCommonConfig();

    private ShareCommonConfig() {
    }

    public final void init() {
        Constant.WEIBO_APPKEY = Constants.APP_KEY;
    }
}

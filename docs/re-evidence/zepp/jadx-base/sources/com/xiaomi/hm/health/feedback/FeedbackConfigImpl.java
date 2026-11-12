package com.xiaomi.hm.health.feedback;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.feedback.api.FeedbackConfig;
import com.huami.watch.hmwatchmanager.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u000b8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/feedback/FeedbackConfigImpl;", "Lcom/huami/feedback/api/FeedbackConfig;", "", "a", LogUtil.I, "getNotificationIcon", "()I", "notificationIcon", "b", "getNotificationIconBg", "notificationIconBg", "", "c", "Z", "getShowErrorMessage", "()Z", "showErrorMessage", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FeedbackConfigImpl implements FeedbackConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int notificationIcon = R.drawable.push_notification;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int notificationIconBg = R.color.black;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean showErrorMessage;

    @Override // com.huami.feedback.api.FeedbackConfig
    public int getNotificationIcon() {
        return this.notificationIcon;
    }

    @Override // com.huami.feedback.api.FeedbackConfig
    public int getNotificationIconBg() {
        return this.notificationIconBg;
    }

    @Override // com.huami.feedback.api.FeedbackConfig
    public boolean getShowErrorMessage() {
        return this.showErrorMessage;
    }
}

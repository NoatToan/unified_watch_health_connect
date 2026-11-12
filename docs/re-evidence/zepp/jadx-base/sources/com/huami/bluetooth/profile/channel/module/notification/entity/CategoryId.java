package com.huami.bluetooth.profile.channel.module.notification.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.utils.CincoAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/entity/CategoryId;", "", "", "SIMPLE_ALERT", LogUtil.I, "EMAIL", "NEWS", "INCOMING_CALL", "MISSED_CALL", CincoAnalytics.VIBRATE_SMS, "VOICE_EMAIL", "SCHEDULE", "HIGH_ALERT", "INSTANT_MSG", "CARE", "THIRD_APP", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CategoryId {
    public static final int CARE = 128;
    public static final int EMAIL = 1;
    public static final int HIGH_ALERT = 8;
    public static final int INCOMING_CALL = 3;

    @NotNull
    public static final CategoryId INSTANCE = new CategoryId();
    public static final int INSTANT_MSG = 9;
    public static final int MISSED_CALL = 4;
    public static final int NEWS = 2;
    public static final int SCHEDULE = 7;
    public static final int SIMPLE_ALERT = 0;
    public static final int SMS = 5;
    public static final int THIRD_APP = 250;
    public static final int VOICE_EMAIL = 6;

    private CategoryId() {
    }
}

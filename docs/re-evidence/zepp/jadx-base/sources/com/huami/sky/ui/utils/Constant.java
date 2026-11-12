package com.huami.sky.ui.utils;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/huami/sky/ui/utils/Constant;", "", "", "json", "Ljava/lang/String;", "title", "desc", "key", Constant.btnVisible, "", "COLOR_ALPHA_6", LogUtil.D, "COLOR_ALPHA_3", "COLOR_ALPHA_4", "COLOR_ALPHA_9", "SKY_REMINDER_NOTIFICATION_ACTION", "SKY_REMINDER_KEY", "SKY_REMINDER_VALUE", "PLAY_FROM_EVENT_KEY", "PLAY_ACTIVITY_PATH", "ILLUSTRATE_WEB_URL", "REALTIME_WEB_URL", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class Constant {
    public static final double COLOR_ALPHA_3 = 0.3d;
    public static final double COLOR_ALPHA_4 = 0.4d;
    public static final double COLOR_ALPHA_6 = 0.6d;
    public static final double COLOR_ALPHA_9 = 0.9d;

    @NotNull
    public static final String ILLUSTRATE_WEB_URL = "https://api.huami.com/t/cms.zepp.xingkonginfo";

    @NotNull
    public static final Constant INSTANCE = new Constant();

    @NotNull
    public static final String PLAY_ACTIVITY_PATH = "com.huami.sky.ui.play.SkyPlayActivity";

    @NotNull
    public static final String PLAY_FROM_EVENT_KEY = "play.from.event.key";

    @NotNull
    public static final String REALTIME_WEB_URL = "https://api.huami.com/t/27494";

    @NotNull
    public static final String SKY_REMINDER_KEY = "sky.reminder.key";

    @NotNull
    public static final String SKY_REMINDER_NOTIFICATION_ACTION = "sky.reminder.notification.action";

    @NotNull
    public static final String SKY_REMINDER_VALUE = "sky.reminder.value";

    @NotNull
    public static final String btnVisible = "btnVisible";

    @NotNull
    public static final String desc = "desc";

    @NotNull
    public static final String json = "json";

    @NotNull
    public static final String key = "key";

    @NotNull
    public static final String title = "title";

    private Constant() {
    }
}

package com.huami.bluetooth.profile.channel.module.notification;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV3;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV2;", "", "supportMsgReply", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface NotificationApiV3 extends NotificationApiV2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int VERSION_3 = 3;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV3$Companion;", "", "", "VERSION_3", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int VERSION_3 = 3;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    boolean supportMsgReply();
}

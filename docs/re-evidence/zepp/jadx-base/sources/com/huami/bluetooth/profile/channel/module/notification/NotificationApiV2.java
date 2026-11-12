package com.huami.bluetooth.profile.channel.module.notification;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.notification.entity.AppReplyResult;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV2;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApi;", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoResponse;", AbstractJSONTokenResponse.RESPONSE, "Lkotlin/Function1;", "", "", "action", "responseLogoRequest", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/AppReplyResult;", "result", "setAppReplyResult", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface NotificationApiV2 extends NotificationApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int VERSION_2 = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV2$Companion;", "", "", "VERSION_2", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int VERSION_2 = 2;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    void responseLogoRequest(@NotNull LogoResponse response, @NotNull Function1<? super Boolean, Unit> action);

    void setAppReplyResult(@NotNull AppReplyResult result, @NotNull Function1<? super Boolean, Unit> action);
}

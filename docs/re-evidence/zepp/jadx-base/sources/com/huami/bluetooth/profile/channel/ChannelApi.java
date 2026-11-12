package com.huami.bluetooth.profile.channel;

import androidx.core.app.NotificationCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.model.ChannelRequest;
import com.huami.bluetooth.profile.channel.model.ChannelVersion;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ.\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH'J\u001b\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\bH&J\b\u0010\u0016\u001a\u00020\u0015H&R\u0016\u0010\u001a\u001a\u00020\u00178&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelApi;", "", "", "moduleId", "", "isOneTime", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "", "callback", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/huami/bluetooth/profile/channel/model/ChannelRequest;", "request", "sendData", NotificationCompat.CATEGORY_TRANSPORT, "(Lcom/huami/bluetooth/profile/channel/model/ChannelRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/Channel;", "channel", "setChannel", Constant.FUNCTION_CLOSE_CHANNEL, "", "getAddress", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "version", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ChannelApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelApi$Companion;", "", "", "VERSION_1", LogUtil.I, "VERSION_2", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int VERSION_1 = 1;
        public static final int VERSION_2 = 2;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void register$default(ChannelApi channelApi, int i, boolean z, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            channelApi.register(i, z, function1);
        }
    }

    void closeChannel();

    @NotNull
    String getAddress();

    @NotNull
    ChannelVersion getVersion();

    void register(int moduleId, boolean isOneTime, @NotNull Function1<? super ChannelResponse, Unit> callback);

    @Deprecated(message = "Not recommend", replaceWith = @ReplaceWith(expression = "transport()", imports = {}))
    void sendData(@NotNull ChannelRequest request);

    void setChannel(@NotNull Channel channel);

    @Nullable
    Object transport(@NotNull ChannelRequest channelRequest, @NotNull Continuation<? super Boolean> continuation);

    void unregister(int moduleId);
}

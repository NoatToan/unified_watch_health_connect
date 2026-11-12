package com.huami.bluetooth.profile.channel;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelFactory;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelFactory$Companion;", "", "Lcom/huami/bluetooth/profile/channel/Channel;", "channel", "Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;", "callbackHolder", "", "appId", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "createChannel", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ChannelApi createChannel(@NotNull Channel channel, @NotNull ChannelCallbackHolder callbackHolder, int appId) {
            int versionCode = channel.version().getVersionCode();
            if (versionCode == 1) {
                return new ChannelApiImpl(channel, callbackHolder);
            }
            if (versionCode == 2) {
                return new ChannelApiImpl2(channel, callbackHolder, appId);
            }
            throw new Exception(Intrinsics.stringPlus("不支持的Channel版本:", channel.version()));
        }
    }
}

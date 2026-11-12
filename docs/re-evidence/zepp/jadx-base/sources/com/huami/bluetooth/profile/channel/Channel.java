package com.huami.bluetooth.profile.channel;

import com.huami.bluetooth.profile.channel.model.ChannelOptions;
import com.huami.bluetooth.profile.channel.model.ChannelVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0013H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/Channel;", "", "", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/channel/ResponseRequire;", "responseRequire", "Lcom/huami/bluetooth/profile/channel/DataSendResponse;", "sendData", "([BLcom/huami/bluetooth/profile/channel/ResponseRequire;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendReply", "Lkotlin/Function1;", "", "callback", "dataCallback", "Lcom/huami/bluetooth/profile/channel/model/ChannelOptions;", "channelOptions", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "version", "", "getAddress", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface Channel {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object sendData$default(Channel channel, byte[] bArr, ResponseRequire responseRequire, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendData");
            }
            if ((i & 2) != 0) {
                responseRequire = new ResponseRequire(false, 0, 0, 6, null);
            }
            return channel.sendData(bArr, responseRequire, continuation);
        }
    }

    @NotNull
    ChannelOptions channelOptions();

    void dataCallback(@NotNull Function1<? super byte[], Unit> callback);

    @NotNull
    String getAddress();

    @Nullable
    Object sendData(@NotNull byte[] bArr, @NotNull ResponseRequire responseRequire, @NotNull Continuation<? super DataSendResponse> continuation);

    boolean sendReply(@NotNull byte[] bytes);

    @NotNull
    ChannelVersion version();
}

package defpackage;

import kotlin.Metadata;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class zjf {
    public static final void c(ReceiveChannel<?> receiveChannel, Throwable th) {
        DEFAULT_CLOSE_MESSAGE.b(receiveChannel, th);
    }
}

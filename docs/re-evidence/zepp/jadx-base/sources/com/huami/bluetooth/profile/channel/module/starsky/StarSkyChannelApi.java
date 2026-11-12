package com.huami.bluetooth.profile.channel.module.starsky;

import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/starsky/StarSkyChannelApi;", "", "", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/starsky/IStarSkyDeviceDataReceiver;", SocialConstants.PARAM_RECEIVER, "", "enableRelaxMusic", "(Lcom/huami/bluetooth/profile/channel/module/starsky/IStarSkyDeviceDataReceiver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disableRelaxMusic", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface StarSkyChannelApi {
    @Nullable
    Object disableRelaxMusic(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object enableRelaxMusic(@NotNull IStarSkyDeviceDataReceiver iStarSkyDeviceDataReceiver, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object queryVersion(@NotNull Continuation<? super Integer> continuation);
}

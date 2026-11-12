package com.huami.device.core.sync.impl.sync.inject;

import com.huami.device.core.sync.api.dto.WorkStatusDto;
import kotlin.Metadata;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/device/core/sync/impl/sync/inject/InjectStatusChannel;", "", "Lkotlinx/coroutines/channels/Channel;", "Lcom/huami/device/core/sync/api/dto/WorkStatusDto;", "channel", "", "onInject", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public interface InjectStatusChannel {
    void onInject(@NotNull Channel<WorkStatusDto> channel);
}

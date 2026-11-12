package com.xiaomi.wearable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/wearable/ChannelWriter;", "", "writeToChannel", "", "channelInfo", "Lcom/xiaomi/wearable/ChannelInfo;", "data", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChannelWriter {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void writeToChannel(@NotNull ChannelWriter channelWriter, @Nullable ChannelInfo channelInfo, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    void writeToChannel(@Nullable ChannelInfo channelInfo, @NotNull byte[] data);
}

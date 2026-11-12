package com.xiaomi.hm.health.nfc.channel;

import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/nfc/channel/TransportChannel;", "", "", "requestAction", "responseAction", "Lcom/huami/watch/transport/DataBundle;", "data", "Lcom/huami/watch/transport/TransportDataItem;", "sendAction", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface TransportChannel {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ TransportDataItem sendAction$default(TransportChannel transportChannel, String str, String str2, DataBundle dataBundle, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAction");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                dataBundle = new DataBundle();
            }
            return transportChannel.sendAction(str, str2, dataBundle);
        }
    }

    @Nullable
    TransportDataItem sendAction(@NotNull String requestAction, @Nullable String responseAction, @NotNull DataBundle data);
}

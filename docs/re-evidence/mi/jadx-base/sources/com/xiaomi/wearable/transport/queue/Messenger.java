package com.xiaomi.wearable.transport.queue;

import com.xiaomi.wearable.wear.api.Callback;
import defpackage.s5f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0018J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/Messenger;", "", "", "type", "", "data", "Lcom/xiaomi/wearable/wear/api/Callback;", "callback", "timeout", "", "call", "(I[BLcom/xiaomi/wearable/wear/api/Callback;I)V", "Lcom/xiaomi/wearable/transport/queue/Messenger$DataReceiver;", "dataReceiver", "setDataReceiver", "(Lcom/xiaomi/wearable/transport/queue/Messenger$DataReceiver;)V", "detailType", "", "path", "Ls5f;", "sendFile", "(IILjava/lang/String;Ls5f;)V", "destroy", "()V", "DataReceiver", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public interface Messenger {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/Messenger$DataReceiver;", "", "onDataReceive", "", "type", "", "data", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DataReceiver {
        void onDataReceive(int type, @NotNull byte[] data);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void sendFile(@NotNull Messenger messenger, int i, int i2, @NotNull String path, @NotNull s5f callback) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    void call(int type, @NotNull byte[] data, @NotNull Callback callback, int timeout);

    void destroy();

    void sendFile(int type, int detailType, @NotNull String path, @NotNull s5f callback);

    void setDataReceiver(@NotNull DataReceiver dataReceiver);
}

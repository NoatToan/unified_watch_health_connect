package com.huami.bluetooth.feature.file_transfer.impl;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.file_transfer.ReceiveListener;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/feature/file_transfer/impl/ReceiveListenerWrapper;", "", "", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "url", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/ReceiveListener;", "b", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/ReceiveListener;", "getListener", "()Lcom/huami/bluetooth/profile/channel/module/file_transfer/ReceiveListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "c", LogUtil.I, "getLastProgress", "()I", "lastProgress", "<init>", "(Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/file_transfer/ReceiveListener;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ReceiveListenerWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ReceiveListener listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int lastProgress;

    public ReceiveListenerWrapper(@NotNull String str, @NotNull ReceiveListener receiveListener, int i) {
        this.url = str;
        this.listener = receiveListener;
        this.lastProgress = i;
    }

    public final int getLastProgress() {
        return this.lastProgress;
    }

    @NotNull
    public final ReceiveListener getListener() {
        return this.listener;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }
}

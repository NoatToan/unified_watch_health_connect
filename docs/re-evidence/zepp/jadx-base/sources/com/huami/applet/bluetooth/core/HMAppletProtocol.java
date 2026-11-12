package com.huami.applet.bluetooth.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/huami/applet/bluetooth/core/HMAppletProtocol;", "", "", "msg", "", "sendMessage", "Lkotlin/Function1;", "", "messageListener", "onMessage", "Lcom/huami/applet/bluetooth/core/FileInfo;", "fileInfo", "Lcom/huami/applet/bluetooth/core/PushListener;", "pushListener", "pushFileToDevice", "Lcom/huami/applet/bluetooth/core/ReceiveListener;", "receiveListener", "addReceiveFileListener", "applet_release"}, k = 1, mv = {1, 5, 1})
public interface HMAppletProtocol {
    void addReceiveFileListener(@NotNull FileInfo fileInfo, @NotNull ReceiveListener receiveListener);

    void onMessage(@NotNull Function1<? super byte[], Unit> messageListener);

    void pushFileToDevice(@NotNull FileInfo fileInfo, @NotNull PushListener pushListener);

    boolean sendMessage(@NotNull byte[] msg);
}

package com.huami.bluetooth.profile.channel.module.js;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/js/JSAppMessageApi;", "", "", "msg", "", "sendMessage", "Lcom/huami/bluetooth/profile/channel/module/js/MessageListener;", "messageListener", "", "onMessage", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface JSAppMessageApi {
    void onMessage(@NotNull MessageListener messageListener);

    boolean sendMessage(@NotNull byte[] msg);
}

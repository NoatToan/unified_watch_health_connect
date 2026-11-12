package com.huami.bluetooth.profile.channel.module.find;

import com.facebook.appevents.integrity.IntegrityManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/FindPhoneListener;", "", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "onFind", "onStop", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface FindPhoneListener {
    void onFind(@NotNull String address);

    void onStop(@NotNull String address);
}

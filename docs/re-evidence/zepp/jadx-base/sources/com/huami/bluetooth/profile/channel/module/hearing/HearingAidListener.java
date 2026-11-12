package com.huami.bluetooth.profile.channel.module.hearing;

import com.huami.bluetooth.profile.channel.module.hearing.entity.HearingAidComponents;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/hearing/HearingAidListener;", "", "Lcom/huami/bluetooth/profile/channel/module/hearing/entity/HearingAidComponents;", "component", "", "sn", "", "onSn", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface HearingAidListener {
    void onSn(@NotNull HearingAidComponents component, @NotNull String sn);
}

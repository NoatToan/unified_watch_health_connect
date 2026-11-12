package com.huami.bluetooth.profile.channel.module.pb;

import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pb/PBApi;", "", "", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/SmartWatchProfile$BlePBInfo;", "list", "", "isFull", "setPBInfos", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface PBApi {
    boolean setPBInfos(@NotNull List<? extends SmartWatchProfile.BlePBInfo> list, boolean isFull);
}

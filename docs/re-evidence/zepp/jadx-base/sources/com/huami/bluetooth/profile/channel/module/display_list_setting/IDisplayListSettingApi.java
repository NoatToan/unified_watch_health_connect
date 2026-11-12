package com.huami.bluetooth.profile.channel.module.display_list_setting;

import com.xiaomi.hm.health.bt.profile.milipro.DisplaySetting;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/IDisplayListSettingApi;", "", "", "type", "", "Lcom/xiaomi/hm/health/bt/profile/page/PageItem;", "getDisplayItems", "items", "", "setDisplayItems", "Lcom/xiaomi/hm/health/bt/profile/milipro/DisplaySetting;", "displaySetting", "setDisplaySetting", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IDisplayListSettingApi {
    @Nullable
    List<PageItem> getDisplayItems(int type);

    boolean setDisplayItems(@NotNull List<? extends PageItem> items);

    boolean setDisplaySetting(@NotNull DisplaySetting displaySetting);
}

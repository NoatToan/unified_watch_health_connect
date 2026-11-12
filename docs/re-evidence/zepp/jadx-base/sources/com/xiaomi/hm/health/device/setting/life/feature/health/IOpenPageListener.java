package com.xiaomi.hm.health.device.setting.life.feature.health;

import com.huami.bluetooth.profile.channel.module.openapp.AppPageType;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/health/IOpenPageListener;", "", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", DTransferConstants.PAGE, "Lkotlin/Pair;", "", "openPage", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IOpenPageListener {
    @NotNull
    Pair<Boolean, AppPageType> openPage(@NotNull AppPageType page);
}

package com.huami.wallet.ui.resource;

import com.huami.wallet.ui.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/wallet/ui/resource/WatchWalletRes;", "Lcom/huami/wallet/ui/resource/DTHWalletRes;", "", "getSwipingRes", "getOpenBusCardInProgressResP0", "getOpenBusCardInProgressResP1", "getOpenBusCardInProgressResP2", "", "getOpenBusCardInProgressResDescribe", "getRechargeTips", "getShiftInProgressResP0", "<init>", "()V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WatchWalletRes extends DTHWalletRes {
    @Override // com.huami.wallet.ui.resource.DTHWalletRes, com.huami.wallet.ui.resource.IWalletRes
    public int getOpenBusCardInProgressResDescribe() {
        return R.string.wl_open_bus_card_intro0_dth;
    }

    @Override // com.huami.wallet.ui.resource.DTHWalletRes, com.huami.wallet.ui.resource.IWalletRes
    @NotNull
    public String getOpenBusCardInProgressResP0() {
        return "wl_open_bus_intor0_dth_bg_watch";
    }

    @Override // com.huami.wallet.ui.resource.DTHWalletRes, com.huami.wallet.ui.resource.IWalletRes
    @NotNull
    public String getOpenBusCardInProgressResP1() {
        return "wl_open_bus_intor1_bg";
    }

    @Override // com.huami.wallet.ui.resource.DTHWalletRes, com.huami.wallet.ui.resource.IWalletRes
    @NotNull
    public String getOpenBusCardInProgressResP2() {
        return "wl_open_bus_intor2_dth_bg_watch";
    }

    @Override // com.huami.wallet.ui.resource.DTHWalletRes, com.huami.wallet.ui.resource.IWalletRes
    public int getRechargeTips() {
        return R.string.wl_recharge_tips_content_watch;
    }

    @Override // com.huami.wallet.ui.resource.DTHWalletRes, com.huami.wallet.ui.resource.IWalletRes
    @NotNull
    public String getShiftInProgressResP0() {
        return "wl_shift_in_0_watch";
    }

    @Override // com.huami.wallet.ui.resource.DTHWalletRes, com.huami.wallet.ui.resource.IWalletRes
    @NotNull
    public String getSwipingRes() {
        return "wl_img_swiping_card_watch";
    }
}

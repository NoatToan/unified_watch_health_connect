package com.huami.wallet.ui.resource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\u0002H&J\b\u0010\u000f\u001a\u00020\u0006H&¨\u0006\u0010"}, d2 = {"Lcom/huami/wallet/ui/resource/IWalletRes;", "", "", "getSetAsDefaultCardMessage", "getSetAsDefaultCardSuccessMessage", "getRemindTitleRes", "", "getSwipingRes", "getOpenCardTipsRes", "getOpenRechargeFailTipsRes", "getOpenBusCardInProgressResP0", "getOpenBusCardInProgressResP1", "getOpenBusCardInProgressResP2", "getOpenBusCardInProgressResDescribe", "getRechargeTips", "getShiftInProgressResP0", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public interface IWalletRes {
    int getOpenBusCardInProgressResDescribe();

    @NotNull
    String getOpenBusCardInProgressResP0();

    @NotNull
    String getOpenBusCardInProgressResP1();

    @NotNull
    String getOpenBusCardInProgressResP2();

    int getOpenCardTipsRes();

    int getOpenRechargeFailTipsRes();

    int getRechargeTips();

    int getRemindTitleRes();

    int getSetAsDefaultCardMessage();

    int getSetAsDefaultCardSuccessMessage();

    @NotNull
    String getShiftInProgressResP0();

    @NotNull
    String getSwipingRes();
}

package com.huami.wallet.ui.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes16.dex */
public interface NavigationController {
    void closePreviousPages();

    void finishCurrentPage(Context context);

    void hideOpenBusCardInProgress(FragmentActivity fragmentActivity);

    void navigateAlipayAuth(Context context);

    void navigateBack(Context context);

    void navigateReturnCardResultFailActivity(Context context);

    void navigateReturnCardResultSuccessActivity(Context context);

    void navigateToBindPhoneNumber(Context context, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9);

    void navigateToBusCardDetail(Context context, String str, String str2, String str3, String str4, boolean z, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8);

    void navigateToBusCardList(Context context, @Nullable String str);

    void navigateToBusCardOperationNoTokenResult(Context context, String str, String str2, String str3, boolean z, String str4, boolean z2);

    void navigateToBusCardOperationResult(Context context, String str, String str2, String str3, boolean z, @Nullable String str4);

    void navigateToOpenBusCard(Context context, String str, String str2, String str3, String str4, String str5);

    void navigateToOpenBusCardInProgress(FragmentActivity fragmentActivity, String str);

    void navigateToOpenedBusCardList(Context context);

    void navigateToRechargeBusCard(Context context, String str, String str2, String str3, String str4);

    void navigateToRefundResult(@NonNull Context context, int i, String str, @NonNull String str2, String str3);

    void navigateToRemindOpenBusCard(Context context);

    void navigateToRemindRefundActivity(String str, Context context);

    void navigateToShift(Context context, String str, String str2, String str3, boolean z, @Nullable String str4, @Nullable String str5, Boolean bool, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10);

    void navigateToShiftOutTips(Context context, String str, @Nullable String str2, String str3, String str4, String str5, @Nullable String str6);

    void navigateToShiftProgress(FragmentActivity fragmentActivity, String str, boolean z);

    void navigateToShiftResult(FragmentActivity fragmentActivity, String str, String str2, boolean z, boolean z2, String str3, String str4, @Nullable String str5, Boolean bool, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12);

    void navigateToTradeRecord(Context context, String str, String str2, String str3, String str4);

    void navigateToWeb(String str, Bundle bundle);

    void navigateToWebOfPay(Context context, String str, String str2);

    void navigateUserInputAuth(Context context);

    void resetStyleToTitleBarWithBg(FragmentActivity fragmentActivity);
}

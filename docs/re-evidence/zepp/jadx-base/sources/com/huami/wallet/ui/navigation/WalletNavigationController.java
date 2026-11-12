package com.huami.wallet.ui.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huami.discovery.bridge.WebFragment;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.WalletConfig;
import com.huami.wallet.ui.R;
import com.huami.wallet.ui.activity.BaseWalletActivity;
import com.huami.wallet.ui.activity.BindPhoneNumberActivity;
import com.huami.wallet.ui.activity.BusCardDetailActivity;
import com.huami.wallet.ui.activity.BusCardListActivity;
import com.huami.wallet.ui.activity.BusCardOperationResultActivity;
import com.huami.wallet.ui.activity.BusCardStackActivity;
import com.huami.wallet.ui.activity.OpenBusCardActivity;
import com.huami.wallet.ui.activity.RechargeActivity;
import com.huami.wallet.ui.activity.RefundResultActivity;
import com.huami.wallet.ui.activity.RemindOpenBusCardActivity;
import com.huami.wallet.ui.activity.RemindRefundActivity;
import com.huami.wallet.ui.activity.RemindRefundAlipayAuthActivity;
import com.huami.wallet.ui.activity.ReturnCardResultFailActivity;
import com.huami.wallet.ui.activity.ReturnCardResultSuccessActivity;
import com.huami.wallet.ui.activity.ReturnCardUserInputAuthActivity;
import com.huami.wallet.ui.activity.ShiftCardActivity;
import com.huami.wallet.ui.activity.ShiftCardMiActivity;
import com.huami.wallet.ui.activity.ShiftOutCardTipsActivity;
import com.huami.wallet.ui.activity.TradeRecordActivity;
import com.huami.wallet.ui.fragment.OpenBusCardInProgressFragment;
import com.huami.wallet.ui.fragment.ShiftCardProgressFragment;
import com.huami.wallet.ui.fragment.ShiftResultFragment;
import com.huami.wallet.ui.fragment.ShiftResultMiFragment;
import com.huami.wallet.ui.helper.AnalyticsHelper;
import com.huami.wallet.ui.helper.BusDetailOutType;
import com.huami.wallet.ui.helper.WalletPageHelper;
import com.huami.wallet.ui.utils.KTExtFunKt;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010P\u001a\u00020N¢\u0006\u0004\bQ\u0010RJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0016J<\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J:\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\bH\u0016JB\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020!H\u0016Jb\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010\b2\b\u0010+\u001a\u0004\u0018\u00010\b2\b\u0010,\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\bH\u0016J4\u00100\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010/\u001a\u0004\u0018\u00010\bH\u0016J4\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010/\u001a\u0004\u0018\u00010\bH\u0016Jp\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\b2\b\u0010+\u001a\u0004\u0018\u00010\b2\b\u0010,\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010:\u001a\u00020\u00042\u0006\u00107\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u000108H\u0016J \u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bH\u0016J\u0084\u0001\u0010A\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u00102\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010>\u001a\u0004\u0018\u00010\b2\u0006\u0010?\u001a\u00020!2\b\u0010@\u001a\u0004\u0018\u00010\b2\b\u0010*\u001a\u0004\u0018\u00010\b2\b\u0010+\u001a\u0004\u0018\u00010\b2\b\u0010,\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\bH\u0016J \u0010B\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0006\u00102\u001a\u00020!H\u0016J\u009e\u0001\u0010F\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u0010C\u001a\u00020!2\u0006\u00102\u001a\u00020!2\u0006\u0010(\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010?\u001a\u00020!2\b\u0010@\u001a\u0004\u0018\u00010\b2\b\u0010D\u001a\u0004\u0018\u00010\b2\b\u0010E\u001a\u0004\u0018\u00010\b2\b\u0010*\u001a\u0004\u0018\u00010\b2\b\u0010+\u001a\u0004\u0018\u00010\b2\b\u0010,\u001a\u0004\u0018\u00010\b2\b\u0010-\u001a\u0004\u0018\u00010\bH\u0016JD\u0010H\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010G\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010I\u001a\u00020\u0004H\u0016J4\u0010M\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010K\u001a\u00020J2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010L\u001a\u00020\b2\b\u0010E\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010O¨\u0006S"}, d2 = {"Lcom/huami/wallet/ui/navigation/WalletNavigationController;", "Lcom/huami/wallet/ui/navigation/NavigationController;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "tag", "b", "appCode", "navigateToRemindRefundActivity", "navigateAlipayAuth", "navigateUserInputAuth", "navigateReturnCardResultSuccessActivity", "navigateReturnCardResultFailActivity", "navigateToOpenedBusCardList", "finishCurrentPage", "navigateBack", "navigateToRemindOpenBusCard", "parentAppCode", "navigateToBusCardList", "busCardId", "busCardName", "busCardImageUrl", "boundPhone", "_xiaomiCardName", "navigateToOpenBusCard", "navigateToOpenBusCardInProgress", "hideOpenBusCardInProgress", "resetStyleToTitleBarWithBg", "orderId", "", "isCheckRecord", "extraMsg", "navigateToBusCardOperationResult", "isNoToken", "navigateToBusCardOperationNoTokenResult", "xiaomiBusCardName", "cardImgUrl", "shiftEnable", "packageName", "appName", "redirectTo", "serviceContact", "navigateToBusCardDetail", "cardNumber", "navigateToRechargeBusCard", "navigateToTradeRecord", "isShiftIn", "isShiftOut", "shiftInOrderId", "xiaoMiCardName", "navigateToBindPhoneNumber", "url", "Landroid/os/Bundle;", "extras", "navigateToWeb", "payUrl", "returnUrl", "navigateToWebOfPay", "imgUrl", "isShiftInException", "xmActionToken", "navigateToShift", "navigateToShiftProgress", "isSuccess", "errorCode", "errorMsg", "navigateToShiftResult", "xiaomiCardName", "navigateToShiftOutTips", "closePreviousPages", "", "resultCode", "orderNumber", "navigateToRefundResult", "Lcom/huami/wallet/lib/api/WalletDataSource;", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WalletNavigationController implements NavigationController {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource dataSource;

    public WalletNavigationController(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    private final void a(Context context) {
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    private final void b(FragmentActivity activity, String tag) {
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(tag);
        if (fragmentFindFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void closePreviousPages() {
        WalletPageHelper.getInstance().finishPreviousActivities();
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void finishCurrentPage(@NotNull Context context) {
        a(context);
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void hideOpenBusCardInProgress(@NotNull FragmentActivity activity) {
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(OpenBusCardInProgressFragment.TAG);
        if (fragmentFindFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateAlipayAuth(@Nullable Context context) {
        if (context == null) {
            return;
        }
        context.startActivity(new Intent(context, (Class<?>) RemindRefundAlipayAuthActivity.class));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateBack(@NotNull Context context) {
        a(context);
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateReturnCardResultFailActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) ReturnCardResultFailActivity.class));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateReturnCardResultSuccessActivity(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) ReturnCardResultSuccessActivity.class));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public /* bridge */ /* synthetic */ void navigateToBindPhoneNumber(Context context, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        navigateToBindPhoneNumber(context, bool.booleanValue(), bool2.booleanValue(), str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToBusCardDetail(@NotNull Context context, @NotNull String busCardId, @NotNull String busCardName, @Nullable String xiaomiBusCardName, @NotNull String cardImgUrl, boolean shiftEnable, @Nullable String packageName, @Nullable String appName, @Nullable String redirectTo, @Nullable String serviceContact) {
        context.startActivity(new Intent(context, (Class<?>) BusCardDetailActivity.class).putExtra("EXTRA_EXPAND_CARD_ID", busCardId).putExtra(BusCardDetailActivity.EXTRA_EXPAND_CARD_NAME, busCardName).putExtra(BusCardDetailActivity.EXTRA_EXPAND_XIAOMI_CARD_NAME, xiaomiBusCardName).putExtra("EXTRA_EXPAND_CARD_IMG_URL", cardImgUrl).putExtra(BusCardDetailActivity.EXTRA_EXPAND_CARD_SHIFTENABLE, shiftEnable).putExtra("EXTRA_PACKAGENAME", packageName).putExtra("EXTRA_APPNAME", appName).putExtra("EXTRA_REDIRECTTO", redirectTo).putExtra("EXTRA_SERVICECONTACT", serviceContact));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToBusCardList(@NotNull Context context, @Nullable String parentAppCode) {
        Intent intent = new Intent(context, (Class<?>) BusCardListActivity.class);
        if (parentAppCode != null) {
            intent.putExtra(BusCardListActivity.EXTRA_PARENT_APP_CODE, parentAppCode);
        }
        Unit unit = Unit.INSTANCE;
        context.startActivity(intent);
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToBusCardOperationNoTokenResult(@NotNull Context context, @NotNull String busCardId, @NotNull String orderId, @NotNull String busCardName, boolean isCheckRecord, @Nullable String extraMsg, boolean isNoToken) {
        context.startActivity(new Intent(context, (Class<?>) BusCardOperationResultActivity.class).putExtra("ARG_CARD_ID", busCardId).putExtra("ARG_CARD_NAME", busCardName).putExtra("ARG_ORDER_ID", orderId).putExtra("ARG_IS_CHECK_RECORD", isCheckRecord).putExtra("ARG_EXTRA_MSG", extraMsg).putExtra("ARG_IS_NO_TOKEN", isNoToken));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToBusCardOperationResult(@NotNull Context context, @NotNull String busCardId, @NotNull String orderId, @NotNull String busCardName, boolean isCheckRecord, @Nullable String extraMsg) {
        context.startActivity(new Intent(context, (Class<?>) BusCardOperationResultActivity.class).putExtra("ARG_CARD_ID", busCardId).putExtra("ARG_CARD_NAME", busCardName).putExtra("ARG_ORDER_ID", orderId).putExtra("ARG_IS_CHECK_RECORD", isCheckRecord).putExtra("ARG_EXTRA_MSG", extraMsg));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToOpenBusCard(@NotNull Context context, @NotNull String busCardId, @NotNull String busCardName, @NotNull String busCardImageUrl, @Nullable String boundPhone, @Nullable String _xiaomiCardName) {
        if (_xiaomiCardName == null) {
            _xiaomiCardName = "";
        }
        context.startActivity(new Intent(context, (Class<?>) OpenBusCardActivity.class).putExtra("ARG_BUS_CARD_ID", busCardId).putExtra("ARG_BUS_CARD_NAME", busCardName).putExtra("ARG_BUS_CARD_IMAGE_URL", busCardImageUrl).putExtra("ARG_BOUND_PHONE", boundPhone).putExtra("ARG_XIAO_MI_CARDNAME", _xiaomiCardName));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToOpenBusCardInProgress(@NotNull FragmentActivity activity, @NotNull String busCardName) {
        hideOpenBusCardInProgress(activity);
        BaseWalletActivity baseWalletActivity = (BaseWalletActivity) activity;
        baseWalletActivity.mTitleBar.setVisibility(8);
        baseWalletActivity.getSupportFragmentManager().beginTransaction().add(baseWalletActivity.getContentViewId(), new OpenBusCardInProgressFragment(), OpenBusCardInProgressFragment.TAG).commitAllowingStateLoss();
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToOpenedBusCardList(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) BusCardStackActivity.class));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToRechargeBusCard(@NotNull Context context, @NotNull String busCardId, @NotNull String busCardName, @Nullable String _xiaomiCardName, @Nullable String cardNumber) {
        if (_xiaomiCardName == null) {
            _xiaomiCardName = "";
        }
        AnalyticsHelper.INSTANCE.recordBusDetailOutEvent(BusDetailOutType.BUS_DETAIL_OUT_CHARGE, this.dataSource.getDeviceModel());
        context.startActivity(new Intent(context, (Class<?>) RechargeActivity.class).putExtra("ARG_BUS_CARD_ID", busCardId).putExtra("ARG_BUS_CARD_NAME", busCardName).putExtra("ARG_XIAO_MI_CARDNAME", _xiaomiCardName).putExtra("ARG_BUS_CARD_NUMBER", cardNumber));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToRefundResult(@NotNull Context context, int resultCode, @Nullable String busCardName, @NotNull String orderNumber, @Nullable String errorMsg) {
        context.startActivity(new Intent(context, (Class<?>) RefundResultActivity.class).putExtra(RefundResultActivity.EXTRA_RESULT, resultCode).putExtra("ARG_BUS_CARD_NAME", busCardName).putExtra(RefundResultActivity.EXTRA_ORDER_NUMBER, orderNumber).putExtra(RefundResultActivity.EXTRA_ERROR_MEG, errorMsg));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToRemindOpenBusCard(@NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) RemindOpenBusCardActivity.class));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToRemindRefundActivity(@NotNull String appCode, @NotNull Context context) {
        context.startActivity(new Intent(context, (Class<?>) RemindRefundActivity.class).putExtra("EXTRA_EXPAND_CARD_ID", appCode));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public /* bridge */ /* synthetic */ void navigateToShift(Context context, String str, String str2, String str3, boolean z, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10) {
        navigateToShift(context, str, str2, str3, z, str4, str5, bool.booleanValue(), str6, str7, str8, str9, str10);
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToShiftOutTips(@NotNull Context context, @NotNull String appCode, @Nullable String orderId, @NotNull String cardImgUrl, @NotNull String busCardName, @NotNull String xiaomiCardName, @Nullable String xmActionToken) {
        context.startActivity(new Intent(context, (Class<?>) ShiftOutCardTipsActivity.class).putExtra(ShiftCardActivity.EXTRA_BUS_CARD_NAME, busCardName).putExtra(ShiftCardActivity.EXTRA_XIAO_MI_CARD_NAME, xiaomiCardName).putExtra(ShiftCardActivity.EXTRA_BUS_CARD_ID, appCode).putExtra(ShiftCardActivity.EXTRA_SHIFT_ORDER_ID, orderId).putExtra("EXTRA_EXPAND_CARD_ID", appCode).putExtra("EXTRA_EXPAND_CARD_IMG_URL", cardImgUrl).putExtra(ShiftCardActivity.EXTRA_XM_ACTION_TOKEN, xmActionToken));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToShiftProgress(@NotNull FragmentActivity activity, @NotNull String busCardName, boolean isShiftIn) {
        b(activity, ShiftResultFragment.TAG);
        BaseWalletActivity baseWalletActivity = (BaseWalletActivity) activity;
        baseWalletActivity.mTitleBar.setVisibility(8);
        ShiftCardProgressFragment shiftCardProgressFragment = new ShiftCardProgressFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ShiftCardActivity.EXTRA_IS_SHIFT_IN, isShiftIn);
        Unit unit = Unit.INSTANCE;
        shiftCardProgressFragment.setArguments(bundle);
        baseWalletActivity.getSupportFragmentManager().beginTransaction().add(baseWalletActivity.getContentViewId(), shiftCardProgressFragment, ShiftCardProgressFragment.TAG).commitAllowingStateLoss();
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public /* bridge */ /* synthetic */ void navigateToShiftResult(FragmentActivity fragmentActivity, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        navigateToShiftResult(fragmentActivity, str, str2, z, z2, str3, str4, str5, bool.booleanValue(), str6, str7, str8, str9, str10, str11, str12);
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToTradeRecord(@NotNull Context context, @NotNull String busCardId, @NotNull String busCardName, @Nullable String _xiaomiCardName, @Nullable String cardNumber) {
        if (_xiaomiCardName == null) {
            _xiaomiCardName = "";
        }
        AnalyticsHelper.INSTANCE.recordBusDetailOutEvent(BusDetailOutType.BUS_DETAIL_OUT_TRADING_RECORD, this.dataSource.getDeviceModel());
        context.startActivity(new Intent(context, (Class<?>) TradeRecordActivity.class).putExtra("ARG_BUS_CARD_ID", busCardId).putExtra("ARG_BUS_CARD_NAME", busCardName).putExtra("ARG_XIAO_MI_CARDNAME", _xiaomiCardName).putExtra("ARG_BUS_CARD_NUMBER", cardNumber));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToWeb(@NotNull String url, @Nullable Bundle extras) {
        WalletConfig.getOnOpenWebUrl().invoke(url, extras);
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateToWebOfPay(@NotNull Context context, @NotNull String payUrl, @NotNull String returnUrl) {
        Bundle bundle = new Bundle();
        bundle.putString(WebFragment.WEB_INTENT_ARG_RETURN_URL, returnUrl);
        navigateToWeb(payUrl, bundle);
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void navigateUserInputAuth(@Nullable Context context) {
        if (context == null) {
            return;
        }
        context.startActivity(new Intent(context, (Class<?>) ReturnCardUserInputAuthActivity.class));
    }

    @Override // com.huami.wallet.ui.navigation.NavigationController
    public void resetStyleToTitleBarWithBg(@NotNull FragmentActivity activity) {
        if (activity instanceof BaseWalletActivity) {
            RainbowTitleBar rainbowTitleBar = ((BaseWalletActivity) activity).mTitleBar;
            rainbowTitleBar.setVisibility(0);
            rainbowTitleBar.setTitle(activity.getTitle());
        }
    }

    public void navigateToBindPhoneNumber(@NotNull Context context, boolean isShiftIn, boolean isShiftOut, @NotNull String shiftInOrderId, @NotNull String busCardId, @NotNull String busCardName, @NotNull String busCardImageUrl, @NotNull String xiaoMiCardName, @Nullable String packageName, @Nullable String appName, @Nullable String redirectTo, @Nullable String serviceContact) {
        context.startActivity(new Intent(context, (Class<?>) BindPhoneNumberActivity.class).putExtra("ARG_SHIFT_IN_ORDER_ID", shiftInOrderId).putExtra("ARG_IS_SHIFT_IN", isShiftIn).putExtra("ARG_IS_SHIFT_OUT", isShiftOut).putExtra("ARG_BUS_CARD_ID", busCardId).putExtra("ARG_BUS_CARD_NAME", busCardName).putExtra("ARG_BUS_CARD_IMAGE_URL", busCardImageUrl).putExtra("ARG_BUS_XIAOMI_CARD_NAME", xiaoMiCardName).putExtra("ARG_PACKAGE_NAME", packageName).putExtra("ARG_APP_NAME", appName).putExtra("ARG_REDIRECT_TO", redirectTo).putExtra("ARG_SERVICE_CONTACT", serviceContact));
    }

    public void navigateToShift(@NotNull Context context, @Nullable String busCardId, @Nullable String busCardName, @Nullable String _xiaomiCardName, boolean isShiftIn, @Nullable String orderId, @Nullable String imgUrl, boolean isShiftInException, @Nullable String xmActionToken, @Nullable String packageName, @Nullable String appName, @Nullable String redirectTo, @Nullable String serviceContact) {
        if (_xiaomiCardName == null) {
            _xiaomiCardName = "";
        }
        context.startActivity(new Intent(context, (Class<?>) (this.dataSource.isForMi() ? ShiftCardMiActivity.class : ShiftCardActivity.class)).putExtra(ShiftCardActivity.EXTRA_IS_SHIFTIN_EXCEPTION, isShiftInException).putExtra(ShiftCardActivity.EXTRA_IS_SHIFT_IN, isShiftIn).putExtra(ShiftCardActivity.EXTRA_SHIFT_ORDER_ID, orderId).putExtra(ShiftCardActivity.EXTRA_BUS_CARD_ID, busCardId).putExtra(ShiftCardActivity.EXTRA_BUS_CARD_NAME, busCardName).putExtra("EXTRA_EXPAND_CARD_IMG_URL", imgUrl).putExtra(ShiftCardActivity.EXTRA_XIAO_MI_CARD_NAME, _xiaomiCardName).putExtra(ShiftCardActivity.EXTRA_XM_ACTION_TOKEN, xmActionToken).putExtra("EXTRA_PACKAGENAME", packageName).putExtra("EXTRA_APPNAME", appName).putExtra("EXTRA_REDIRECTTO", redirectTo).putExtra("EXTRA_SERVICECONTACT", serviceContact));
    }

    public void navigateToShiftResult(@Nullable FragmentActivity activity, @NotNull String busCardName, @Nullable String xiaomiBusCardName, boolean isSuccess, boolean isShiftIn, @NotNull String cardImgUrl, @Nullable String busCardId, @Nullable String orderId, boolean isShiftInException, @Nullable String xmActionToken, @Nullable String errorCode, @Nullable String errorMsg, @Nullable String packageName, @Nullable String appName, @Nullable String redirectTo, @Nullable String serviceContact) {
        b(activity, ShiftCardProgressFragment.TAG);
        BaseWalletActivity baseWalletActivity = (BaseWalletActivity) activity;
        KTExtFunKt.showTitleAndNav$default(baseWalletActivity, Integer.valueOf(isShiftIn ? R.string.wl_r_shift_in_tile : R.string.wl_r_shift_out_tile), (Function1) null, 2, (Object) null);
        Fragment shiftResultMiFragment = this.dataSource.isForMi() ? new ShiftResultMiFragment() : new ShiftResultFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ShiftCardActivity.EXTRA_IS_SHIFT_IN, isShiftIn);
        bundle.putBoolean(ShiftCardActivity.EXTRA_IS_SHIFTIN_EXCEPTION, isShiftInException);
        bundle.putBoolean("ARG_IS_SUCCESS", isSuccess);
        bundle.putString(ShiftCardActivity.EXTRA_SHIFT_ORDER_ID, orderId);
        bundle.putString(ShiftCardActivity.EXTRA_BUS_CARD_ID, busCardId);
        bundle.putString("EXTRA_EXPAND_CARD_IMG_URL", cardImgUrl);
        bundle.putString(BusCardDetailActivity.EXTRA_EXPAND_CARD_NAME, busCardName);
        bundle.putString(BusCardDetailActivity.EXTRA_EXPAND_XIAOMI_CARD_NAME, xiaomiBusCardName);
        bundle.putString(ShiftCardActivity.EXTRA_XM_ACTION_TOKEN, xmActionToken);
        bundle.putString(ShiftCardActivity.EXTRA_ERROR_CODE, errorCode);
        bundle.putString(ShiftCardActivity.EXTRA_ERROR_MSG, errorMsg);
        bundle.putString("EXTRA_PACKAGENAME", packageName);
        bundle.putString("EXTRA_APPNAME", appName);
        bundle.putString("EXTRA_REDIRECTTO", redirectTo);
        bundle.putString("EXTRA_SERVICECONTACT", serviceContact);
        Unit unit = Unit.INSTANCE;
        shiftResultMiFragment.setArguments(bundle);
        baseWalletActivity.getSupportFragmentManager().beginTransaction().add(baseWalletActivity.getContentViewId(), shiftResultMiFragment, ShiftResultFragment.TAG).commitAllowingStateLoss();
    }
}

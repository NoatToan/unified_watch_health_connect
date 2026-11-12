package com.mibi.sdk.payment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.mibi.sdk.common.Client;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.Utils;
import com.mibi.sdk.common.account.AccountRegistry;
import com.mibi.sdk.common.account.IAccountProvider;
import com.mibi.sdk.common.account.ILoginProvider;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.OrderBean;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes5.dex */
public final class Payment {
    private static final String CHANNEL_PAY_ACTION = "com.mibi.sdk.action.PAY";
    private static final String DEDUCT_ACTION = "com.mibi.sdk.action.DEDUCT";
    public static final String DEDUCT_CHANNEL_ALIPAY = "ALIPAYDEDUCT";
    public static final String DEDUCT_CHANNEL_MIPAY = "MIPAYDEDUCT";
    public static final String DEDUCT_CHANNEL_UNIONPAY = "UNIONPAYDEDUCT";
    public static final String DEDUCT_CHANNEL_WXPAY = "WXPAYDEDUCT";
    private static final String MIBI_ENVIRONMENT;
    private static final String MSG_ACTIVITY_NOT_NULL = "activity cannot be null";
    private static final String MSG_CHANNEL_NOT_NULL = "the value of channel can not be empty!";
    private static final String MSG_NEED_LOGIN = "should login first";
    private static final String MSG_ORDER_NOT_NULL = "the value of order can not be empty!";
    public static final String PARTNER_CHANNEL_ALIPAY = "ALIPAY";
    public static final String PARTNER_CHANNEL_MIPAY = "MIPAY";
    public static final String PARTNER_CHANNEL_WXPAY = "WXPAY";
    private static final String PARTNER_PAY_ACTION = "com.mibi.sdk.action.PARTNER_PAY";
    private static final String PARTNER_RECHARGE_ACTION = "com.mibi.sdk.action.PARTNER_RECHARGE";
    public static final String PAY_CHANNEL_ALIPAY = "ALIPAY";
    public static final String PAY_CHANNEL_EMPTY = "";
    public static final String PAY_CHANNEL_MIPAY = "MIPAY";
    public static final String PAY_CHANNEL_UNIONMIPAY = "UNIONMIPAY";
    public static final String PAY_CHANNEL_UNIONPAY = "UNIONPAY";
    public static final String PAY_CHANNEL_WXPAY = "WXPAY";
    public static final String QR_CHANNEL_ALI = "ALI_QR";
    public static final String QR_CHANNEL_MI = "MI_QR";
    public static final String QR_CHANNEL_UNITED = "UNITED_QR";
    public static final String QR_CHANNEL_WX = "WX_QR";
    private static final String QR_CODE_ACTION = "com.mibi.sdk.action.QR_CODE";
    private static final String SIGN_DEDUCT_ACTION = "com.mibi.sdk.action.SIGN_DEDUCT";
    private static final String TAG = "Payment";

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(" ; mibiEnv : ");
        sb.append(CommonConstants.STAGING ? "sta" : "pro");
        sb.append(" ; accEnv : ");
        sb.append(CommonConstants.ACCOUNT_PREVIEW ? "sta" : "pro");
        MIBI_ENVIRONMENT = sb.toString();
    }

    private Payment() {
    }

    private static void checkActivity(Activity activity) {
        if (activity == null) {
            throw new InvalidParameterException(MSG_ACTIVITY_NOT_NULL);
        }
    }

    private static void checkChannel(OrderBean orderBean) {
        if (TextUtils.isEmpty(orderBean.mChannel)) {
            MibiLog.d(TAG, "channel can't be null");
            throw new IllegalArgumentException("channel can't be null");
        }
    }

    private static void checkOrder(OrderBean orderBean) {
        if (TextUtils.isEmpty(orderBean.mOrder)) {
            throw new InvalidParameterException(MSG_ORDER_NOT_NULL);
        }
    }

    private static void checkPartnerInfo(OrderBean orderBean) {
        if (orderBean == null || TextUtils.isEmpty(orderBean.mPartnerUserId) || TextUtils.isEmpty(orderBean.mPartnerAccountType) || orderBean.mPartnerMarketType <= 0) {
            MibiLog.e(TAG, "partner info invalid, please check your param");
            throw new IllegalArgumentException("partner info invalid, please check your param");
        }
    }

    @Deprecated
    public static void deduct(Activity activity, String str, String str2, int i) {
        deduct(activity, str, str2, i, "");
    }

    private static boolean isQrDeductChannelValid(String str) {
        return QR_CHANNEL_UNITED.equals(str);
    }

    private static boolean isQrPayChannelValid(String str) {
        return QR_CHANNEL_UNITED.equals(str) || QR_CHANNEL_MI.equals(str) || QR_CHANNEL_ALI.equals(str) || QR_CHANNEL_WX.equals(str);
    }

    private static boolean isQrSignDeductChannelValid(String str) {
        return QR_CHANNEL_UNITED.equals(str);
    }

    public static void partnerPay(Activity activity, int i, OrderBean orderBean) {
        MibiLog.d(TAG, "partnerPay versionCode : 78 ; useUi : " + orderBean.mUseUi + MIBI_ENVIRONMENT);
        checkActivity(activity);
        checkPartnerInfo(orderBean);
        if (!orderBean.mUseUi) {
            checkChannel(orderBean);
        }
        checkOrder(orderBean);
        orderBean.mIsNoAccount = true;
        orderBean.mDiscountGiftCardId = -1L;
        Client.init(activity);
        ChannelManager.registerRechargeChannels(activity);
        Intent intent = new Intent(PARTNER_PAY_ACTION);
        intent.putExtra(Constants.KEY_ORDER_BEAN, orderBean);
        intent.setPackage(Client.getAppInfo().getPackage());
        activity.startActivityForResult(intent, i);
    }

    public static void partnerRecharge(Activity activity, int i, OrderBean orderBean) {
        MibiLog.d(TAG, "partnerRecharge versionCode : 78 ; useUi : " + orderBean.mUseUi + MIBI_ENVIRONMENT);
        checkActivity(activity);
        checkPartnerInfo(orderBean);
        if (!orderBean.mUseUi) {
            checkChannel(orderBean);
        }
        orderBean.mIsNoAccount = true;
        Client.init(activity);
        ChannelManager.registerRechargeChannels(activity);
        Intent intent = new Intent(PARTNER_RECHARGE_ACTION);
        intent.putExtra(Constants.KEY_ORDER_BEAN, orderBean);
        intent.setPackage(Client.getAppInfo().getPackage());
        activity.startActivityForResult(intent, i);
    }

    public static boolean pay(Activity activity, int i, OrderBean orderBean) {
        MibiLog.d(TAG, "pay versionCode : 78 ;use no account : " + orderBean.mIsNoAccount + " ; use ui : " + orderBean.mUseUi + MIBI_ENVIRONMENT);
        Client.init(activity);
        ChannelManager.registerRechargeChannels(activity);
        if (orderBean.mIsNoAccount) {
            AccountManager.tryClearAccount();
        } else {
            if (!AccountManager.isLogined(activity)) {
                MibiLog.e(TAG, MSG_NEED_LOGIN);
                return false;
            }
            AccountManager.initAccount(activity);
        }
        orderBean.mOrderType = 1;
        Intent intent = new Intent(CHANNEL_PAY_ACTION);
        intent.putExtra(Constants.KEY_ORDER_BEAN, orderBean);
        intent.setPackage(Client.getAppInfo().getPackage());
        activity.startActivityForResult(intent, i);
        return true;
    }

    @Deprecated
    public static boolean payChannel(Activity activity, int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return payChannel(activity, i, str, str2, z, z2, z3, z4, "");
    }

    public static boolean qrDeduct(Activity activity, int i, OrderBean orderBean) {
        MibiLog.d(TAG, "qrDeduct versionCode : 78 ; qrDeduct" + MIBI_ENVIRONMENT);
        if (!isQrDeductChannelValid(orderBean.mChannel)) {
            MibiLog.d(TAG, "qr deduct not support for channel : " + orderBean.mChannel);
            return false;
        }
        Client.init(activity);
        if (orderBean.mIsNoAccount) {
            AccountManager.tryClearAccount();
        } else {
            if (!AccountManager.isLogined(activity)) {
                MibiLog.e(TAG, MSG_NEED_LOGIN);
                return false;
            }
            AccountManager.initAccount(activity);
        }
        orderBean.mOrderType = 2;
        Intent intent = new Intent(QR_CODE_ACTION);
        intent.putExtra(Constants.KEY_ORDER_BEAN, orderBean);
        intent.setPackage(Client.getAppInfo().getPackage());
        activity.startActivityForResult(intent, i);
        return true;
    }

    public static boolean qrPay(Activity activity, int i, OrderBean orderBean) {
        MibiLog.d(TAG, "qrPay versionCode : 78 ;use no account : " + orderBean.mIsNoAccount + " ; use ui : " + orderBean.mUseUi + MIBI_ENVIRONMENT);
        if (!isQrPayChannelValid(orderBean.mChannel)) {
            MibiLog.d(TAG, "qr pay not support for channel : " + orderBean.mChannel);
            return false;
        }
        Client.init(activity);
        if (orderBean.mIsNoAccount) {
            AccountManager.tryClearAccount();
        } else {
            if (!AccountManager.isLogined(activity)) {
                MibiLog.e(TAG, MSG_NEED_LOGIN);
                return false;
            }
            AccountManager.initAccount(activity);
        }
        orderBean.mOrderType = 1;
        Intent intent = new Intent(QR_CODE_ACTION);
        intent.putExtra(Constants.KEY_ORDER_BEAN, orderBean);
        intent.setPackage(Client.getAppInfo().getPackage());
        activity.startActivityForResult(intent, i);
        return true;
    }

    public static boolean qrSignDeduct(Activity activity, int i, OrderBean orderBean) {
        MibiLog.d(TAG, "qrSignDeduct versionCode : 78 ; qrSignDeduct" + MIBI_ENVIRONMENT);
        if (!isQrSignDeductChannelValid(orderBean.mChannel)) {
            MibiLog.d(TAG, "qr sign deduct not support for channel : " + orderBean.mChannel);
            return false;
        }
        Client.init(activity);
        if (orderBean.mIsNoAccount) {
            AccountManager.tryClearAccount();
        } else {
            if (!AccountManager.isLogined(activity)) {
                MibiLog.e(TAG, MSG_NEED_LOGIN);
                return false;
            }
            AccountManager.initAccount(activity);
        }
        orderBean.mOrderType = 3;
        Intent intent = new Intent(QR_CODE_ACTION);
        intent.putExtra(Constants.KEY_ORDER_BEAN, orderBean);
        intent.setPackage(Client.getAppInfo().getPackage());
        activity.startActivityForResult(intent, i);
        return true;
    }

    public static void releaseAccountProvider() {
        AccountRegistry.releaseAccountProvider();
    }

    public static void releaseLoginProvider() {
        AccountRegistry.releaseLoginProvider();
    }

    public static void setAccountProvider(IAccountProvider iAccountProvider) {
        AccountRegistry.setAccountProvider(iAccountProvider);
    }

    public static void setLoginProvider(ILoginProvider iLoginProvider) {
        AccountRegistry.setLoginProvider(iLoginProvider);
    }

    public static void setTokenType(Context context, String str) {
        if (!TextUtils.isEmpty(str) && (CommonConstants.TOKEN_TYPE_AUTH_TOKEN.equals(str) || CommonConstants.TOKEN_TYPE_SERVICE_TOKEN.equals(str))) {
            CommonConstants.TOKEN_TYPE = str;
            Utils.setStringPref(context, "tokenType", str);
            return;
        }
        String str2 = str + " not supported, only support CommonConstants.TOKEN_TYPE_AUTH_TOKEN and CommonConstants.TOKEN_TYPE_SERVICE_TOKEN";
        MibiLog.d(TAG, str2);
        throw new IllegalArgumentException(str2);
    }

    public static void setUseSystemAccount(boolean z) {
        CommonConstants.sIsUseSystemAccount = z;
    }

    @Deprecated
    public static void signDeduct(Activity activity, String str, String str2, int i) {
        signDeduct(activity, str, str2, i, "");
    }

    @Deprecated
    public static void deduct(Activity activity, String str, String str2, int i, String str3) {
        deduct(activity, i, new OrderBean.OrderBeanBuilder().setOrder(str).setChannel(str2).setQueryIntervalConfig(str3).build());
    }

    @Deprecated
    public static boolean payChannel(Activity activity, int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3) {
        return pay(activity, i, new OrderBean.OrderBeanBuilder().setOrder(str).setChannel(str2).useBalance(z).useGiftcard(z2).usePartnerGiftcard(z3).setNoAccount(z4).setQueryIntervalConfig(str3).build());
    }

    @Deprecated
    public static void signDeduct(Activity activity, String str, String str2, int i, String str3) {
        signDeduct(activity, i, new OrderBean.OrderBeanBuilder().setOrder(str).setChannel(str2).setQueryIntervalConfig(str3).build());
    }

    public static void deduct(Activity activity, int i, OrderBean orderBean) {
        MibiLog.d(TAG, "deduct versionCode : 78 ; deduct" + MIBI_ENVIRONMENT);
        if (activity != null) {
            checkOrder(orderBean);
            if (!TextUtils.isEmpty(orderBean.mChannel)) {
                if (!DEDUCT_CHANNEL_MIPAY.equals(orderBean.mChannel) && !"WXPAYDEDUCT".equals(orderBean.mChannel) && !"ALIPAYDEDUCT".equals(orderBean.mChannel) && !DEDUCT_CHANNEL_UNIONPAY.equals(orderBean.mChannel)) {
                    throw new IllegalArgumentException(orderBean.mChannel + " not supported(only sign)");
                }
                if (orderBean.mIsNoAccount) {
                    AccountManager.tryClearAccount();
                } else if (AccountManager.isLogined(activity)) {
                    AccountManager.initAccount(activity);
                } else {
                    throw new IllegalStateException(MSG_NEED_LOGIN);
                }
                Client.init(activity);
                orderBean.mOrderType = 2;
                Intent intent = new Intent(DEDUCT_ACTION);
                intent.putExtra(Constants.KEY_ORDER_BEAN, orderBean);
                intent.setPackage(Client.getAppInfo().getPackage());
                activity.startActivityForResult(intent, i);
                return;
            }
            throw new InvalidParameterException(MSG_CHANNEL_NOT_NULL);
        }
        throw new InvalidParameterException(MSG_ACTIVITY_NOT_NULL);
    }

    public static void signDeduct(Activity activity, int i, OrderBean orderBean) {
        MibiLog.d(TAG, "signDeduct versionCode : 78 ; signDeduct" + MIBI_ENVIRONMENT);
        checkActivity(activity);
        checkOrder(orderBean);
        if (!TextUtils.isEmpty(orderBean.mChannel)) {
            if (!"WXPAYDEDUCT".equals(orderBean.mChannel) && !"ALIPAYDEDUCT".equals(orderBean.mChannel) && !DEDUCT_CHANNEL_UNIONPAY.equals(orderBean.mChannel)) {
                throw new IllegalArgumentException(orderBean.mChannel + " not supported(only sign)");
            }
            if (orderBean.mIsNoAccount) {
                AccountManager.tryClearAccount();
            } else if (AccountManager.isLogined(activity)) {
                AccountManager.initAccount(activity);
            } else {
                throw new IllegalStateException(MSG_NEED_LOGIN);
            }
            Client.init(activity);
            orderBean.mOrderType = 3;
            Intent intent = new Intent(SIGN_DEDUCT_ACTION);
            intent.putExtra(Constants.KEY_ORDER_BEAN, orderBean);
            intent.setPackage(Client.getAppInfo().getPackage());
            activity.startActivityForResult(intent, i);
            return;
        }
        throw new InvalidParameterException(MSG_CHANNEL_NOT_NULL);
    }
}

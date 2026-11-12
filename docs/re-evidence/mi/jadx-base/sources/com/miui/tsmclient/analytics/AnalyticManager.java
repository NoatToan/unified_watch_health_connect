package com.miui.tsmclient.analytics;

import android.content.Context;
import android.content.Intent;
import com.miui.tsmclient.util.DeviceUtils;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AnalyticManager {
    private static final String APP_ID = "2882303761517368855";
    private static final String APP_KEY = "5281736870855";
    public static final String CATEGORY_BANK = "bank";
    public static final String CATEGORY_COMMON = "common";
    public static final String CATEGORY_FMSH = "fmsh";
    public static final String CATEGORY_MI_QUICK_PAY = "MIQuickPay";
    public static final String CATEGORY_NFC = "nfc";
    public static final String CATEGORY_PAY = "pay";
    public static final String CATEGORY_TRANSIT = "transit";
    public static final String CATEGORY_UP = "UPService";
    public static final String EVENT_PARAM_AID = "aid";
    public static final String EVENT_PARAM_CARD_BALANCE = "card_balance";
    public static final String EVENT_PARAM_CARD_TYPE = "card_type";
    public static final String EVENT_PARAM_ERROR_CODE = "error_code";
    public static final String EVENT_PARAM_FAIL_REASON = "fail_reason";
    public static final String EVENT_PARAM_HAS_ISSUE = "has_issue";
    public static final String EVENT_PARAM_HYPER_OS_ROM_TYPE = "hyper_os_rom_type";
    public static final String EVENT_PARAM_HYPER_OS_VERSION = "hyper_os_version";
    public static final String EVENT_PARAM_IS_ENABLE = "is_enable";
    public static final String EVENT_PARAM_MIUI_ROM_TYPE = "miui_rom_type";
    public static final String EVENT_PARAM_MODEL = "model";
    public static final String EVENT_PARAM_PAY_CHANNEL = "pay_channel";
    public static final String EVENT_PARAM_PAY_PLUGIN_TYPE = "pay_plugin_type";
    public static final String EVENT_PARAM_RECHARGE_AMOUNT = "recharge_amount";
    public static final String EVENT_PARAM_RECHARGE_BY_NFC = "recharge_by_nfc";
    public static final String EVENT_PARAM_SYSTEM_VERSION = "system_version";
    public static final String EVENT_PARAM_TSMCLIENT_VERSION_CODE = "tsmclient_version_code";
    public static final String EVENT_PARAM_TSMCLIENT_VERSION_NAME = "tsmclient_version_name";
    public static final String EVENT_TIME = "time";
    public static final String EVENT_TRADE_AMOUNT = "trade_amount";
    public static final String EVENT_TRADE_LOCATION = "trade_location";
    public static final String KEY_CARD_DETAIL_BANNER = "card_detail_banner";
    public static final String KEY_CARD_DETAIL_FOOTER_LINK = "card_detail_footer_link";
    public static final String KEY_CARD_TYPE = "card_type";
    public static final String KEY_CLICK_PURCHASE_RECORD = "click_purchase_record_%s";
    public static final String KEY_CREATE_ORDER = "create_order/%s";
    public static final String KEY_CREATE_ORDER_CARD_TYPE = "create_order_card_type";
    public static final String KEY_DEACTIVATE_CACHED_BANK_CARD = "deactivate_cached_bank_card";
    public static final String KEY_ENTER = "key_enter_%s";
    public static final String KEY_ERROR_CODE = "error_code";
    public static final String KEY_EVENT_SOURCE = "event_source";
    public static final String KEY_INPUT_BANK_CARD_NUM = "input_bank_card_num";
    public static final String KEY_INSTALL_NOW = "install_now_%s";
    public static final String KEY_INSTALL_NOW_CARD_TYPE = "install_now_card_type";
    public static final String KEY_ISSUE_CARDS = "issue_cards";
    public static final String KEY_ISSUE_RECHARGE_PAY_NOW = "issue_recharge_pay_now/%s";
    public static final String KEY_ISSUE_RECHARGE_PAY_NOW_CARD_TYPE = "issue_recharge_pay_now_card_type";
    public static final String KEY_MORE_SETTINGS = "more_settings";
    public static final String KEY_MY_CARDS = "my_cards";
    public static final String KEY_NFC_EE_IO_EXCEPTION = "key_nfc_ee_io_exception";
    public static final String KEY_NFC_EE_RESTRICTED = "key_nfc_ee_restricted";
    public static final String KEY_NFC_RECHARGE = "nfc_recharge/%s";
    public static final String KEY_NFC_RECHARGE_CARD_TYPE = "nfc_recharge_card_type";
    public static final String KEY_NFC_UNUSUAL_DISABLED = "key_nfc_unusual_disabled";
    public static final String KEY_NFC_UNUSUAL_DISABLED_RESTORE = "key_nfc_unusual_disabled_restore";
    public static final String KEY_NOTIFY_TRANSIT_INFO = "notify_transit_card_info";
    public static final String KEY_OPERATION_FAILED = "operation_%s_failed";
    public static final String KEY_OPERATION_LAUNCH = "operation_%s_launch";
    public static final String KEY_OPERATION_SUCCESS = "operation_%s_success";
    public static final String KEY_PAY_RESULT = "pay_result";
    public static final String KEY_RECHARGE_AMOUNT = "recharge_amount/%s";
    public static final String KEY_RECHARGE_AMOUNT_CARD_TYPE = "recharge_amount_card_type";
    public static final String KEY_RECHARGE_NOW = "recharge_now/%s";
    public static final String KEY_RECHARGE_NOW_CARD_TYPE = "recharge_now_card_type";
    public static final String KEY_RECHARGE_PAY_NOW = "recharge_pay_now/%s";
    public static final String KEY_RECHARGE_PAY_NOW_CARD_TYPE = "recharge_pay_now_card_type";
    public static final String KEY_SET_DEFAULT_CARD = "set_default_card";
    public static final String KEY_SOURCE_CHANNEL = "source_channel/%s";
    public static final String KEY_SOURCE_CHANNEL_TYPE = "key_source_channel_type";
    public static final String MI_STAT_PARAM_CAPTURE_METHOD = "capture_method";
    public static final String MI_STAT_PARAM_EVENT_SOURCE = "param_event_source";
    public static final String MI_STAT_PARAM_SOURCE_CHANNEL = "param_source_channel";
    public static final String PAY_PLUGIN_TYPE_UNION_APK = "union_apk";
    private static final String PUBLIC_KEY_RSA_DMP = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDgA/ZfzV1GkdjfCisZRtorDWRm\n8FklXv5wjoNQxFL+qjiN5rxmQSrP0ksyuJVeSiy7mPRMYLMoUF7bDvYudhRvxkuL\nq6EByE/O3lksvJUjvlxr2KqcGQ3xbTY3xK52ilvh4CfBarAzzXl850ejqMhsLEZ7\npH2mQm+AMQ75+PD7NwIDAQAB";
    public static final String UNION_PAY_RESULT_NOT_PAY = "not_pay";
    private static final String URL_DMP_RECEIVE = "content://com.miui.analytics.server.AnalyticsProvider";
    private static volatile AnalyticManager sInstance;
    private int mClientVersionCode;
    private String mClientVersionName;
    private Context mContext;

    private AnalyticManager() {
    }

    public static AnalyticManager getInstance() {
        if (sInstance == null) {
            synchronized (AnalyticManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new AnalyticManager();
                        sInstance.init(EnvironmentConfig.getContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void init(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context can not be null");
        }
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mClientVersionCode = DeviceUtils.getAppVersionCode(applicationContext);
        this.mClientVersionName = DeviceUtils.getAppVersionName(this.mContext);
    }

    public void bugReport(Context context, String str, long j) {
        if (EnvironmentConfig.isStaging()) {
            return;
        }
        LogUtils.d("RomVersion:" + DeviceUtils.getRomVersion());
        Intent intent = new Intent("com.miui.klo.COMMON_LOG");
        intent.setPackage("com.miui.klo.bugreport");
        intent.putExtra("name", str);
        intent.putExtra("logcatCmd", "*:V");
        context.sendBroadcast(intent);
    }

    public void recordEvent(String str, String str2) {
        recordEvent(str, str2, null);
    }

    public void recordPageEnd(String str) {
    }

    public void recordPageStart(String str) {
    }

    public void setNetworkAccessEnabled(boolean z) {
    }

    public void setStatisticsEnabled(boolean z) {
    }

    public void recordEvent(String str, String str2, Map<String, String> map) {
        if (!EnvironmentConfig.isStaging() && map == null) {
            new HashMap();
        }
    }
}

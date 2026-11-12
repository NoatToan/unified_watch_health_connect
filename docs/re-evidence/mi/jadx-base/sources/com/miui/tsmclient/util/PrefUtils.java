package com.miui.tsmclient.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.RfCardCacheData;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class PrefUtils {
    public static final String INBOUND_SITE = "inbound_site";
    public static final String PREF_KEY_ADD_CITY_CONFIG_STATUS_AGAIN = "key_add_rf_config_again";
    public static final String PREF_KEY_APDU_RESPONSE = "apdu_response";
    public static String PREF_KEY_AUTO_DISPLAY_QR_VIEW = "pref_key_auto_display_QR_view";
    public static String PREF_KEY_AUTO_RECHARGE_CARD_AID = null;
    public static final String PREF_KEY_AUTO_RECHARGE_SIGN_CONTRACT = "key_auto_recharge_sign_contract_%1$s";
    public static final String PREF_KEY_BALANCE_TIP_PREFIX = "key_balance_tip_";
    public static final String PREF_KEY_BANK_CACHED = "key_bank_cached";
    public static final String PREF_KEY_BANK_CARD_PHONE_LAST_DIGEST_PREFIX = "key_bank_card_phone_last_digest_id_";
    public static final String PREF_KEY_BAN_SET_DOUBLE_PRESS_POWER = "key_ban_set_double_press_power";
    public static final String PREF_KEY_BLE_RESTRICTED_NOTIFICATION_COUNT = "ble_restricted_notification_count";
    public static final String PREF_KEY_CAPTURE_LOG_CONTENT = "capture_log_content";
    public static final String PREF_KEY_CAPTURE_LOG_TIME = "capture_log_time";
    public static final String PREF_KEY_CARDS_CACHED = "key_cards_cached";
    public static final String PREF_KEY_CARD_CONFIG = "key_card_config";
    public static final String PREF_KEY_CARD_DETAIL_BG_PREFIX = "key_card_detail_bg_";
    public static final String PREF_KEY_CARD_EXTRA = "key_card_extra_%1$s";
    public static final String PREF_KEY_CARD_PARAMETER_CALIBRATION = "card_parameter_calibration";
    public static final String PREF_KEY_CAR_KEY_ENTRANCE_CLICKED = "car_key_entrance_clicked";
    public static final String PREF_KEY_CLOUD_CACHED = "key_cloud_cached";
    public static final String PREF_KEY_COMPONENT_ENABLED_SETTING_VERSION_CODE = "component_enabled_setting_version_code";
    public static final String PREF_KEY_CTA_CACHED = "key_cta_cached";
    public static final String PREF_KEY_CURRENT_CUSTOM_TIME_RF_CARD = "current_custom_time_rf_card";
    public static final String PREF_KEY_CURRENT_NFC_CONFIG_MD5 = "key_current_nfc_config";
    public static final String PREF_KEY_CUSTOM_TIME_NEED_SHOW_GUIDE = "key_custom_time_need_show_guide";
    public static final String PREF_KEY_CUSTOM_TIME_RF_CARDS = "key_custom_time_rf_cards";
    public static final String PREF_KEY_DEFAULT_TRANS_CARD = "key_default_trans_card";
    public static final String PREF_KEY_DEVICE_UWB = "device_uwb";
    public static final String PREF_KEY_DKF_SERVICE_WHITELIST = "dkf_service_whitelist";
    public static String PREF_KEY_DOES_SUPPORT_HARDWARE_WALLET = null;
    public static final String PREF_KEY_DUMMY_COMMUNITY_BUSINESS_ID_PREFIX = "key_dummy_community_business_id_";
    public static final String PREF_KEY_EID_CACHED = "key_identity_cached";
    public static final String PREF_KEY_ENTER_LOCATION = "PREF_KEY_ENTER_LOCATION";
    public static final String PREF_KEY_FETCH_CITY_CONFIG_TIME = "key_fetch_city_config_time";
    public static final String PREF_KEY_FETCH_NFC_CONFIG_TIME = "key_fetch_swipe_card_config_time";
    public static final String PREF_KEY_GEO_FENCE_COUNT = "geo_fence_count";
    public static final String PREF_KEY_HAS_SET_DOUBLE_PRESS_POWER_KEY = "key_has_set_double_press_power_key";
    public static final String PREF_KEY_HAS_SHOWN_SWIPE_AREA_DIALOG = "has_shown_swipe_area_dialog";
    public static final String PREF_KEY_HAS_VIEW_OTHER_PHONE_TRANSIT_CARDS = "key_has_view_other_phone_transit_cards";
    public static final String PREF_KEY_ICCOA_DKF_SERVICE_WHITELIST = "iccoa_dkf_service_whitelist";
    public static final String PREF_KEY_ICCOA_OEM_MAP = "oem_pkg_mapping_table";
    public static final String PREF_KEY_ISSUED_CARD_EXTRA_DATA = "new_issued_card_extra_data_%1$s";
    public static final String PREF_KEY_IS_RECOVER_KEEP_ACTIVATE_DONE = "is_recover_keep_activate_done";
    public static String PREF_KEY_KEEP_ACTIVATED_STATUS_PREFIX = null;
    public static final String PREF_KEY_LANDSCAPE_RF_DEFAULT_CARD_INFO = "key_landscape_rf_default_card_info";
    public static final String PREF_KEY_LANDSCAPE_SWIPING_CARD_SWITCH = "key_landscape_swiping_card_switch";
    public static final String PREF_KEY_LAST_CARD = "key_last_card";
    public static final String PREF_KEY_LAST_INAPP_CARD = "key_last_inapp_card";
    public static final String PREF_KEY_LAST_MIFARE_CARD = "key_last_mifare_card";
    public static final String PREF_KEY_LAST_MIPAY_CARD = "key_last_mipay_card";
    public static String PREF_KEY_LAST_RECHARGED_TRANSIT_CARD_AID = null;
    public static final String PREF_KEY_LAST_SE_ROUTE = "key_last_se_route";
    public static final String PREF_KEY_LAST_TRANSIT_CARD = "key_last_transit_card";
    public static final String PREF_KEY_LAST_UPLOAD_DADA_STAT_TIME = "pref_key_last_upload_data_stat_time";
    public static final String PREF_KEY_LAST_UPLOAD_TRADE_LOGS_END_ID = "key__%1$s_last_upload_trade_logs_end_id";
    public static final String PREF_KEY_LAST_UPLOAD_TRADE_LOGS_TIME = "key_%1$s_last_upload_trade_logs_time";
    public static String PREF_KEY_LAST_USER_NAME = null;
    public static final String PREF_KEY_MIFARE_CACHED = "key_mifare_cached";
    public static final String PREF_KEY_MI_TSM_SERVICE_WHITELIST = "mi_tsm_service_whitelist";
    public static final String PREF_KEY_NFC_ID = "pref_key_nfc_id";
    public static final String PREF_KEY_NON_TRANSACTION_HCI_CONFIG = "key_non_transaction_hci_config";
    public static final String PREF_KEY_NOTIFY_SERVER_UPDATE_CARD = "key_notify_server_update_card";
    public static final String PREF_KEY_POPUP_RECHARGE_TIPS_ALREADY = "key_popup_recharge_tips_already";
    public static final String PREF_KEY_PRIVACY_STATUS = "key_privacy_status";
    public static final String PREF_KEY_PRIVACY_STATUS_DONE = "key_privacy_status_done";
    public static final String PREF_KEY_QR_BANK_CACHED = "key_qr_bank_cached";
    public static final String PREF_KEY_RF_DEFAULT_CARD_AID = "key_rf_default_card_aid";
    public static final String PREF_KEY_RF_INTELLIGENT_TRANSIT_CARD_AID = "key_rf_intelligent_transit_card_aid";
    public static final String PREF_KEY_RF_QUICK_TRANSIT_CARD_AID = "key_rf_intelligent_quick_card_aid";
    public static final String PREF_KEY_RKE_LIST_FROM_VEHICLE = "rke_list_from_vehicle_";
    public static final String PREF_KEY_SHOULD_UPLOAD_PHONE_NUMBER = "key_should_upload_phone_number_";
    public static String PREF_KEY_SPI_PK_STATE = "key_spi_pk_state";
    public static final String PREF_KEY_SWIPE_CARD_CONFIG = "pref_key_swipe_card_config";
    public static final String PREF_KEY_SWITCH_CARD_DEFAULT_AID = "key_switch_card_default_aid";
    public static final String PREF_KEY_SWITCH_DOUBLE_CLICK_HOME = "key_switch_double_click_home";
    public static final String PREF_KEY_SWITCH_INTELLIGENT_PICK_CARD = "key_switch_intelligent_pick_card";
    public static final String PREF_KEY_SWITCH_QUICK_PICK_CARD = "key_switch_quick_pick_card";
    public static final String PREF_KEY_TRANS_CACHED = "key_trans_cached";
    public static final String PREF_KEY_TRANS_CARD_BALANCE_NOTIFICATION_QUOTA = "key_trans_card_balance_notification_quota_%1$s";
    public static final String PREF_KEY_TRANS_CARD_LIST_NOTICE = "key_trans_card_list_notice";
    public static final String PREF_KEY_UPGRADE_CPLC_SUCCESS = "pref_key_upgrade";
    public static final String PREF_KEY_UPGRADE_FORCE = "key_upgrade_force";
    public static final String PREF_KEY_UPGRADE_LATEST_TIME = "key_upgrade_latest_time";
    public static final String PREF_KEY_UPLOAD_SWIPE_CARD_ERROR_INFO = "key_upload_swipe_card_error_info";
    public static final String PREF_KEY_UPLOAD_SWIPE_CARD_HCI_TRADE_INFO = "key_upload_swipe_card_hci_trade_info";
    public static final String PREF_KEY_UP_INITED = "key_up_inited";
    public static final String PREF_KEY_USER_MIFARE_SETTINGS_TIPS = "user_mifare_settings_tips";
    public static final String PREF_KEY_UWB_AUTH_STATUS = "uwb_auth_status";
    public static final String PREF_KEY_UWB_ENTRY_STATUS = "uwb_entry_status";
    public static final String PREF_KEY_UWB_SESSION_STATUS = "uwb_session_status";
    public static final String PREF_KEY_UWB_STATION_VERSION = "uwb_station_version";
    public static final String PREF_KEY_UWB_STATUS = "uwb_status";
    public static final String PREF_KEY_UWB_SUPPORT = "uwb_support";
    public static final String PREF_KEY_VERSION_CONTROL_ID = "key_version_control_id_";
    public static final String PREF_KEY_WX_APP_ID = "key_wx_app_id";
    private static final String PREF_NAME = "pref_com_miui_tsmclient";
    public static final String PREF_PICTURE_CACHE_FILE_DATA_LIST = "picture_cache_file_data_list";
    public static final String RF_DEFAULT_CARD_AID_PREF_VALUE_NONE = "none";
    public static final String SETTINGS_SYSTEM_PREF_KEY_BANK_CARD = "key_bank_card_in_ese";
    public static final String SETTINGS_SYSTEM_PREF_KEY_DOUBLE_HOME_AVAILABILITY = "key_double_home_availability";
    public static final String SETTINGS_SYSTEM_PREF_KEY_DOUBLE_PRESS_POWER_KEY = "double_click_power_key";
    public static final String SETTINGS_SYSTEM_PREF_KEY_NFC_STATE = "system_key_nfc_state";
    public static final String SETTINGS_SYSTEM_PREF_KEY_TRANS_CARD = "key_trans_card_in_ese";
    public static final int SETTINGS_SYSTEM_PREF_VALUE_DEFAULT = 0;
    public static final int SETTINGS_SYSTEM_PREF_VALUE_DOUBLE_HOME_AVAILABLE = 1;
    public static final int SETTINGS_SYSTEM_PREF_VALUE_DOUBLE_HOME_UNAVAILABLE = 0;
    public static final String SETTINGS_SYSTEM_PREF_VALUE_DOUBLE_PRESS_POWER_MI_PAY = "mi_pay";
    public static final String SETTINGS_SYSTEM_PREF_VALUE_DOUBLE_PRESS_POWER_NONE = "none";
    public static final int SETTINGS_SYSTEM_PREF_VALUE_HAS_CARD = 1;
    public static final String SUBWAY_GOING_STATUS = "subway_going_status";
    public static final String TRAVEL_INFO = "travel_info";
    private static Set<String> sInvalidSPIKeyDeviceSet;

    static {
        HashSet hashSet = new HashSet();
        sInvalidSPIKeyDeviceSet = hashSet;
        PREF_KEY_LAST_RECHARGED_TRANSIT_CARD_AID = "pref_key_last_recharged_transit_card_aid";
        PREF_KEY_KEEP_ACTIVATED_STATUS_PREFIX = "pref_key_activated_status_";
        PREF_KEY_AUTO_RECHARGE_CARD_AID = "pref_key_auto_recharge_card_aid";
        PREF_KEY_LAST_USER_NAME = "pref_key_last_user_name";
        PREF_KEY_DOES_SUPPORT_HARDWARE_WALLET = "pref_key_does_support_hardware_wallet";
        hashSet.add("polaris");
        sInvalidSPIKeyDeviceSet.add("dipper");
        sInvalidSPIKeyDeviceSet.add("equuleus");
        sInvalidSPIKeyDeviceSet.add("ursa");
        sInvalidSPIKeyDeviceSet.add("sagit");
        sInvalidSPIKeyDeviceSet.add("jason");
        sInvalidSPIKeyDeviceSet.add("chiron");
        if (sInvalidSPIKeyDeviceSet.contains(Build.DEVICE)) {
            PREF_KEY_SPI_PK_STATE = "key_spi_pk_state_new";
        }
    }

    private PrefUtils() {
    }

    public static void clear(Context context) {
        context.getSharedPreferences(PREF_NAME, 0).edit().clear().apply();
    }

    public static boolean contains(Context context, String str) {
        return context.getSharedPreferences(PREF_NAME, 0).contains(CardEnvironmentConfig.getPrefKey(str));
    }

    public static boolean getBoolean(Context context, String str, boolean z) {
        return context.getSharedPreferences(PREF_NAME, 0).getBoolean(CardEnvironmentConfig.getPrefKey(str), z);
    }

    public static int getFenceCount(Context context) {
        return getInt(context, PREF_KEY_GEO_FENCE_COUNT, 0);
    }

    public static int getInt(Context context, String str, int i) {
        return context.getSharedPreferences(PREF_NAME, 0).getInt(CardEnvironmentConfig.getPrefKey(str), i);
    }

    public static long getLong(Context context, String str, long j) {
        return context.getSharedPreferences(PREF_NAME, 0).getLong(CardEnvironmentConfig.getPrefKey(str), j);
    }

    public static String getPreferTransitCardAid(Context context) {
        RfCardCacheData rfCardCacheData = getRfCardCacheData(context, false);
        CardGroupType cardGroupType = rfCardCacheData.getCardGroupType();
        return (cardGroupType == null || cardGroupType != CardGroupType.TRANSCARD) ? getString(context, PREF_KEY_LAST_RECHARGED_TRANSIT_CARD_AID, getString(context, PREF_KEY_DEFAULT_TRANS_CARD, "")) : rfCardCacheData.getAid();
    }

    public static RfCardCacheData getRfCardCacheData(Context context, boolean z) {
        String string = z ? getString(context, PREF_KEY_LANDSCAPE_RF_DEFAULT_CARD_INFO, "") : getString(context, PREF_KEY_RF_DEFAULT_CARD_AID, "");
        StringBuilder sb = new StringBuilder();
        sb.append("cached rf data: ");
        sb.append(string);
        sb.append(", ");
        sb.append(z ? "is" : "is not");
        sb.append("landscape data");
        LogUtils.d(sb.toString());
        return new RfCardCacheData(string);
    }

    public static int getSecureSettings(Context context, String str) {
        int secureInt;
        String prefKey = CardEnvironmentConfig.getPrefKey(str);
        try {
            secureInt = SettingKeys.getSecureInt(context, prefKey);
        } catch (Settings.SettingNotFoundException e) {
            LogUtils.e("failed to get secure value for key: " + prefKey, e);
            secureInt = -1;
        }
        LogUtils.d("get secure value for key: " + prefKey + ", value: " + secureInt);
        return secureInt;
    }

    public static String getString(Context context, String str, String str2) {
        return context.getSharedPreferences(PREF_NAME, 0).getString(CardEnvironmentConfig.getPrefKey(str), str2);
    }

    public static String getTravelInfoTip(Context context, String str) {
        String string = getString(context, "travel_info", null);
        if (string == null) {
            return null;
        }
        String[] strArrSplit = string.split("\\|");
        if (strArrSplit.length < 2 || !TextUtils.equals(strArrSplit[0], str)) {
            return null;
        }
        return strArrSplit[1];
    }

    public static boolean isDoneForCTA(Context context) {
        if (contains(context, PREF_KEY_PRIVACY_STATUS) || contains(context, PREF_KEY_PRIVACY_STATUS_DONE)) {
            return true;
        }
        return getBoolean(context, PREF_KEY_CTA_CACHED, false);
    }

    public static void putBoolean(Context context, String str, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_NAME, 0).edit();
        editorEdit.putBoolean(CardEnvironmentConfig.getPrefKey(str), z);
        editorEdit.apply();
    }

    public static void putInt(Context context, String str, int i) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_NAME, 0).edit();
        editorEdit.putInt(CardEnvironmentConfig.getPrefKey(str), i);
        editorEdit.apply();
    }

    public static void putLong(Context context, String str, long j) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREF_NAME, 0).edit();
        editorEdit.putLong(CardEnvironmentConfig.getPrefKey(str), j);
        editorEdit.apply();
    }

    public static void putSecureSettings(Context context, String str, int i) {
        putSecureSettings(context, str, i, true);
    }

    public static void putString(Context context, String str, String str2) {
        putString(context, PREF_NAME, str, str2);
    }

    public static boolean remove(Context context, String str) {
        return context.getSharedPreferences(PREF_NAME, 0).edit().remove(CardEnvironmentConfig.getPrefKey(str)).commit();
    }

    public static void removeAsync(Context context, String str) {
        context.getSharedPreferences(PREF_NAME, 0).edit().remove(CardEnvironmentConfig.getPrefKey(str)).apply();
    }

    public static void saveRfCard(Context context, CardInfo cardInfo, boolean z) {
        String strBuildCacheStr = new RfCardCacheData(cardInfo).buildCacheStr();
        LogUtils.d("save rf data: " + strBuildCacheStr);
        putString(context, z ? PREF_KEY_LANDSCAPE_RF_DEFAULT_CARD_INFO : PREF_KEY_RF_DEFAULT_CARD_AID, strBuildCacheStr);
    }

    public static void setDoubleHomeAvailability(Context context) {
        int secureSettings = getSecureSettings(context, SETTINGS_SYSTEM_PREF_KEY_TRANS_CARD);
        int secureSettings2 = getSecureSettings(context, SETTINGS_SYSTEM_PREF_KEY_BANK_CARD);
        if ((secureSettings == 1 || secureSettings2 == 1) && getBoolean(context, PREF_KEY_SWITCH_DOUBLE_CLICK_HOME, false)) {
            putSecureSettings(context, SETTINGS_SYSTEM_PREF_KEY_DOUBLE_HOME_AVAILABILITY, 1);
        } else {
            putSecureSettings(context, SETTINGS_SYSTEM_PREF_KEY_DOUBLE_HOME_AVAILABILITY, 0);
        }
    }

    public static void setTravelInfoTip(Context context, String str, String str2) {
        String str3;
        if (str2 != null) {
            str3 = str + "|" + str2;
        } else {
            str3 = null;
        }
        putString(context, "travel_info", str3);
    }

    public static void putSecureSettings(Context context, String str, int i, boolean z) {
        String prefKey = CardEnvironmentConfig.getPrefKey(str);
        LogUtils.d("save secure settings, key: " + prefKey + ", value: " + i);
        if (z) {
            putInt(context, prefKey, i);
        }
        SettingKeys.putSecureInt(context, prefKey, i);
        if (SETTINGS_SYSTEM_PREF_KEY_BANK_CARD.equals(str) || SETTINGS_SYSTEM_PREF_KEY_TRANS_CARD.equals(str)) {
            setDoubleHomeAvailability(context);
        }
    }

    public static void putString(Context context, String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(CardEnvironmentConfig.getPrefKey(str2), str3);
        editorEdit.apply();
    }
}

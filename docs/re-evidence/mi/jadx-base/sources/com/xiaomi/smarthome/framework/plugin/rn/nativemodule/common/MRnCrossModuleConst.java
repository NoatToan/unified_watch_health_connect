package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.common;

/* JADX INFO: loaded from: classes2.dex */
public interface MRnCrossModuleConst {
    public static final String SHARE_INTENT_DATA = "share_intent_data";
    public static final String SHARE_INTENT_DATA_TYPE = "share_intent_data_type";
    public static final String SOURCE = "source";
    public static final int SOURCE_DEFAULT = 0;
    public static final int SOURCE_SEND_PRINTER = 1;

    public interface BindUwbTagDeviceActivity {
        public static final String ARGS_ASSOCIATE_DEV_ID = "args_associate_id";
        public static final String ARGS_HOME_ID = "args_home_id";
        public static final String ARGS_TAG_ID = "args_tag_id";
    }

    public interface BleOTAUpgradeActivity {
        public static final String ARG_AUTH_TYPE = "arg_auth_type";
        public static final String ARG_DID = "arg_did";
        public static final String ARG_TEST_FILE_MD5 = "arg_test_file_md5";
        public static final String ARG_TEST_URL = "arg_test_dfu_url";
        public static final String ARG_TEST_VERSION_NAME = "arg_test_version_name";
    }

    public interface ChooseDeviceActivity {
        public static final String EXTRA_SHOW = "extra_show";
        public static final int SHOW_MANUALLY = 0;
        public static final int SHOW_SCAN = 1;
    }

    public interface DevSettingRnDebugListActivity {
        public static final String RN_DEBUG_SERVER_HOST_KEY = "debug_http_host";
    }

    public interface DeviceMainPage {
        public static final String FIREWARE_AUTOUPDATE_HINT = "fireware_autoupdate_hint";

        public interface ViewPageConsts {
            public static final String MAIN_ACTION_ROOM_SELECTED = "main_action_room_selected";
            public static final String MAIN_EXTRA_ROOM_SELECTED_ID = "main_extra_room_selected_id";
        }
    }

    public interface DeviceMoreActivity {
        public static final String ARGS_CLIENT_ID = "client_id";
        public static final String ARGS_ENABLE_PRIVACY_SETTING = "enable_privacy_setting";
        public static final String ARGS_IS_RN_PLUGIN = "is_rn_plugin";
        public static final String ARGS_KEY_DID = "did";
        public static final String ARGS_POP_TYPE = "pop_type";
        public static final String ARGS_PRIVACY_CONTENT_CHANGED = "privacy_content_changed";
        public static final String ARGS_PRIVACY_FOR_CHILDREN = "privacy_for_children";
        public static final String ARGS_PRIVACY_ID = "privacy_id";
        public static final String ARGS_PRIVACY_TYPE = "privacy_type";
        public static final String ARGS_PRIVACY_VERSION = "privacy_version";
        public static final String ARGS_RESULT_REMOVE_LICENSE = "removedLicense";
        public static final String ARGS_SET_PRIVACY_CONFIRMATION_INFO = "set_privacy_confirmation_Info";
        public static final String ARGS_USR_EXP_PLAN_RN_URI = "usrExpPlanContentRnUri";
        public static final String ARG_AUTH_TYPE = "arg_auth_type";
        public static final String RESULT_KEY_FINISH = "result_data";
    }

    public interface DeviceNetworkInfoActivity {
        public static final String ARGS_KEY_DID = "did";
    }

    public interface DeviceRenderer {
        public static final int TYPE_LOADING_ACTIVITY = 1;
        public static final int TYPE_LOADING_DIALOG = 0;
    }

    public interface DeviceShopWeiboShareActivity {
        public static final String DATA_CALLER_SMARTHOME = "caller_smarthome";
        public static final String EXTRA_HANDLE_RESULT = "extra_handle_result";
        public static final String KEY_CALLER = "caller";
    }

    public interface FreqDeviceSetActivity {
        public static final String ARG_KEY_DID = "did";
        public static final String ARG_KEY_PAGE_TYPE = "pagetype";
        public static final int PAGE_TYPE_CAMERA = 2;
        public static final int PAGE_TYPE_NORMAL_DEVICE = 1;
    }

    public interface HomeRoomDeviceMoveActivity {
        public static final String KEY_CHECKED_DIDS = "key_checked_dids";
        public static final String KEY_FILTER_ROOM_ID = "key_filter_room_id";
        public static final String KEY_TRANSFER_ROOM_NAME = "key_transfer_room_name";
    }

    public interface LightGroupManageActivity {
        public static final String ARGS_KEY_UPGRADE_ONLY = "args_key_upgrade_only";
    }

    public interface LightGroupMemberUpdateActivity {
        public static final String KEY_MEMBER = "members";
        public static final String KEY_NO_BLE_MESH_DEVICES = "key_no_ble_mesh_devices";
    }

    public interface LightGroupSettingActivity {
        public static final String ARGS_KEY_CREATE_MODE = "create_mode";
        public static final String ARGS_KEY_DID = "did";
        public static final String ARGS_KEY_GROUP_MODEL = "key_group_model";
    }

    public interface LightGroupSettingV2Activity {
        public static final String ARGS_KEY_DID_LIST = "args_key_did_list";
        public static final String ARGS_KEY_EDIT_MODE = "args_key_edit_mode";
    }

    public interface MiioUpgradeActivity {
        public static final String MIIO_UPGRADE_DID = "miio_upgrade_did";
        public static final int MIIO_UPGRADE_MAX = 120;
        public static final String MIIO_UPGRADE_NAME = "miio_upgrade_name";
        public static final String MIIO_UPGRADE_PID = "miio_upgrade_pid";
        public static final int MIIO_UPGRADE_TIME = 2000;
    }

    public interface OperationCommonWebViewActivity {
        public static final String ARGS_KEY_URL = "url";
    }

    public interface PluginRecommendSceneActivity {
        public static final String EXTRA_DID = "did";
        public static final String EXTRA_IS_FROM_PLUGIN = "is_from_plugin";
        public static final String EXTRA_SRID = "sr_id";
    }

    public interface PowerMultikeyActivity {
        public static final String EXTRA_LIST_ENTITY = "extra_list_entity";
    }

    public interface SceneCardModuleEditActivity {
        public static final String EXTRA_ARG_HOME_ID = "extra_arg_home_id";
        public static final String EXTRA_ARG_ROOM_ID = "extra_arg_room_id";
    }

    public interface SmartHomeMainActivity {
        public static final String ACTION_SHOP_MODE_CHANGE = "shop_model_change";
        public static final int GET_DEVICE_TYPE = 3;
        public static final int MAIN_PAGE_SCAN_REQ = 4;
        public static final int SHOW_CARD = 6;
    }

    public interface TabChangeInfoActiveReceiver {
        public static final String ACTION_BOTTOM_TAB_CHANGE = "action_bottom_tab_change";
        public static final String ARG_BOTTOM_TAB_FIND = "arg_bottom_tab_find";
    }

    public interface TimezoneActivity {
        public static final String EXTRA_DEVICE_DID = "extra_device_did";
        public static final String KEY_SYNC_DEVICE = "sync_device";
        public static final String KEY_TIMEZONE = "TimeZone";
        public static final int REQUEST_CODE = 3;
        public static final int RESULT_CODE = 4;
    }

    public interface UpdateActivity {
        public static final String ARG_DID_LIST = "arg_did_list";
        public static final String EXTRA_AUTO_SWITCH = "auto_switch";
    }

    public interface UserLicenseDialog {
        public static final String ARGS_CLIENT_ID = "client_id";
        public static final String ARGS_ENABLE_PRIVACY_SETTING = "enable_privacy_setting";
        public static final String ARGS_IS_RN_PLUGIN = "is_rn_plugin";
        public static final String ARGS_POP_TYPE = "pop_type";
        public static final String ARGS_PRIVACY_CONTENT_CHANGED = "privacy_content_changed";
        public static final String ARGS_PRIVACY_FOR_CHILDREN = "privacy_for_children";
        public static final String ARGS_PRIVACY_FOR_WATCH = "privacy_for_watch";
        public static final String ARGS_PRIVACY_ID = "privacy_id";
        public static final String ARGS_PRIVACY_TYPE = "privacy_type";
        public static final String ARGS_PRIVACY_VERSION = "privacy_version";
        public static final String ARGS_SET_PRIVACY_CONFIRMATION_INFO = "set_privacy_confirmation_Info";
    }
}

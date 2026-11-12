package com.xiaomi.smarthome.framework.plugin.rn.report;

/* JADX INFO: loaded from: classes2.dex */
public interface RnReportConst {
    public static final String EVENT_MEMORY_STATUS = "rn_runtime_reuse_memory_status";
    public static final String EVENT_PLUGIN_OPEN_STATUS = "rn_plugin_open_status";
    public static final String EVENT_RN_PROCESS_REUSE_ENTER_TYPE = "rn_process_reuse_enter_type";
    public static final String EVENT_RN_RUNTIME_MEMORY = "rn_runtime_app_memory_info";
    public static final String EVENT_RN_RUNTIME_PROCESS_EXIT = "rn_runtime_process_exit";
    public static final String EVENT_RN_RUNTIME_REUSE_CRASH = "rn_runtime_reuse_crash";
    public static final String EVENT_RN_RUNTIME_REUSE_NULL = "rn_runtime_reuse_null";
    public static final String EVENT_RUNTIME_REUSE_STATUS = "rn_runtime_reuse_status";
    public static final String EVENT_RUNTIME_REUSE_STATUS_NOT_REPORT_SO_FAR = "rn_runtime_reuse_status_not_report_so_far";
    public static final String EVENT_RUNTIME_REUSE_STATUS_OPEN_TIME_INFO_NULL = "rn_runtime_reuse_status_open_time_info_null";
    public static final String PARAM_ENTRY = "entry";
    public static final String PARAM_PACKAGE_NAME = "package_name";
    public static final String PARAM_SDK_LEVEL = "sdk_level";
    public static final String PARAM_SDK_VERSION = "sdk_version_name";
    public static final String PLUGIN_FRAMEWORK_SUB_ID = "rn_plugin_framework";

    public interface ApiReport {
        public static final String EVENT_NAME = "rn_plugin_api";
        public static final String EVENT_PLUGIN_FPS = "rn_plugin_fps";
        public static final String EVENT_PLUGIN_MEMORY = "rn_plugin_memory";
        public static final String PARAM_COST = "cost";
        public static final String PARAM_DEVICE_ID = "device_id";
        public static final String PARAM_METHOD = "method";
        public static final String PARAM_MODEL = "device_model";
        public static final String PARAM_MODULE = "module";
        public static final String PARAM_PACKAGE_ID = "package_id";
        public static final String PARAM_PACKAGE_NAME = "package_name";
        public static final String PARAM_PLUGIN_ID = "plugin_id";
        public static final String PARAM_SUCCESS = "success";
    }

    public interface NetworkReport {
        public static final String EVENT_NAME = "plugin_fetch_request";
        public static final String PARAM_ACTION = "action";
        public static final String PARAM_MODEL = "device_model";
        public static final String PARAM_PACKAGE_ID = "package_id";
        public static final String PARAM_PLUGIN_ID = "plugin_id";
        public static final String PARAM_REQUEST = "request";
        public static final String PARAM_TIP = "tip";
        public static final String TIP = "6.7.0.1.4466";
    }

    public interface OfflineEnterStat {
        public static final String EVENT_NAME = "offline_enter_stat";
        public static final String PARAM_DID = "did";
        public static final String PARAM_MODEL = "device_model";
        public static final String PARAM_ONLINE_STATUS = "online_status";
        public static final String PARAM_PID = "pid";
        public static final String PARAM_SOURCE = "source";
        public static final int SOURCE_RN_PLUGIN = 0;
        public static final int STATUS_OFFLINE = 0;
        public static final int STATUS_ONLINE = 1;
    }

    public interface PluginBusinessReport {
        public static final String PARAM_DEVICE_NAME = "device_name";
        public static final String PARAM_DID = "did";
        public static final String PARAM_MODEL = "device_model";
        public static final String PARAM_PACKAGE_ID = "package_id";
        public static final String PARAM_PLUGIN_ID = "plugin_id";
        public static final String PARAM_PLUGIN_VERSION = "plugin_version";
        public static final String PARAM_SUBID = "sub_id";
    }

    public interface PluginDownload {
        public static final int CODE_FAILED = -1001;
        public static final int CODE_OK = 0;
        public static final String DOWNLOAD_PLUGIN = "download_plugin";
        public static final String DOWNLOAD_SDK = "download_sdk";
        public static final String DOWNLOAD_TIP = "6.0.0.0.152";
        public static final String EVENT_NAME = "rn_download_plugin_sdk";
        public static final String PARAM_CODE = "code";
        public static final String PARAM_COST = "cost";
        public static final String PARAM_MODEL = "device_model";
        public static final String PARAM_SUCCESS = "success";
        public static final String PARAM_TASK_TYPE = "task_type";
        public static final String PARAM_TIP = "tip";
        public static final String PARAM_URL = "url";
    }

    public interface PluginInstall {
        public static final String EVENT_NAME = "rn_install_plugin_sdk";
        public static final String EVENT_NAME_DETAIL = "rn_install_plugin_sdk_detail";
        public static final String PARAM_CODE = "code";
        public static final String PARAM_MODEL = "device_model";
        public static final String PARAM_TASK_TYPE = "task_type";
    }

    public interface PluginLoad {
        public static final int CODE_FAILED = -1001;
        public static final int CODE_OK = 0;
        public static final String EVENT_NAME = "rn_load_plugin_sdk";
        public static final String LOAD_PLUGIN = "load_plugin";
        public static final String LOAD_SDK = "load_sdk";
        public static final String LOAD_TIP = "6.0.0.0.151";
        public static final String PARAM_CODE = "code";
        public static final String PARAM_COST = "cost";
        public static final String PARAM_MODEL = "device_model";
        public static final String PARAM_SDK_LEVEL = "sdk_level";
        public static final String PARAM_SUCCESS = "success";
        public static final String PARAM_TASK_TYPE = "task_type";
        public static final String PARAM_TIP = "tip";
    }

    public interface PluginOpenError {
        public static final String EVENT_NAME = "rn_plugin_open_error";
        public static final String PARAM_CODE = "code";
        public static final String PARAM_MODEL = "device_model";
    }

    public interface PluginOpenTrace {
        public static final String ACTION_CLICK = "click";
        public static final String ACTION_PLUGIN_DOWNLOADED = "plugin_downloaded";
        public static final String ACTION_PLUGIN_LOADED = "plugin_loaded";
        public static final String ACTION_PLUGIN_RENDERED = "plugin_rendered";
        public static final String ACTION_SDK_LOADED = "sdk_loaded";
        public static final String EVENT_NAME = "plugin_open_trace";
        public static final String PARAM_ACTION = "plugin_open_action";
        public static final String PARAM_MODEL = "device_model";
        public static final String PARAM_PACKAGE_ID = "package_id";
        public static final String PARAM_PLUGIN_ID = "plugin_id";
    }

    public interface PluginRealDownload {
        public static final int CODE_FAILED = -1001;
        public static final int CODE_OK = 0;
        public static final String DOWNLOAD_PLUGIN = "download_plugin";
        public static final String DOWNLOAD_SDK = "download_sdk";
        public static final String EVENT_NAME = "rn_real_download_plugin_sdk";
        public static final String PARAM_CODE = "code";
        public static final String PARAM_MODEL = "device_model";
        public static final String PARAM_PACKAGE_ID = "package_id";
        public static final String PARAM_PLUGIN_ID = "plugin_id";
        public static final String PARAM_SUCCESS = "success";
        public static final String PARAM_TASK_TYPE = "task_type";
        public static final String PARAM_URL = "url";
    }

    public interface RAMBundleReport {
        public static final String EVENT_NAME = "rn_plugin_loadTime_bundleType";
    }

    public interface RNProcessReuseEnterType {
        public static final int CRASH = 2;
        public static final int ENTER_NATIVE_PRE = 5;
        public static final int FROM_RN_PLUGIN = 3;
        public static final int MEMORY_NOT_ENOUGH = 1;
        public static final int PRINTER_PAGE = 7;
        public static final int RNRUNTIME_NULL = 4;
        public static final int SHORT_CUT = 6;
    }
}

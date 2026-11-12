package com.xiaomi.ai.android.capability;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MIXEngineCapability implements Capability {
    public static final int CODE_ASR_INIT = 1;
    public static final int CODE_ASR_RELOAD = 2;
    public static final int CODE_EOS_INIT = 3;
    public static final int CODE_NLP_INIT = 5;
    public static final int CODE_REJECT_INIT = 4;
    public static final int CODE_TTS_INIT = 6;
    public static final String XAEE_APP_CRASHED = "xaee_app_crashed";
    public static final String XAEE_APP_KILLED = "xaee_app_killed";
    public static final String XAEE_CLOUD_CLOSED = "xaee_cloud_closed";
    public static final String XAEE_LOW_MEMORY = "xaee_low_memory";
    public static final String XAEE_MEMORY_UNSUPPORTED = "xaee_memory_unsupported";
    public static final String XAEE_MOCK_VERSION = "xaee_mock_version";
    public static final String XAEE_MODEL_INVALID = "xaee_model_invalid";
    public static final String XAEE_NOT_INSTALLED = "xaee_not_installed";
    public static final String XAEE_RESIDENT_INIT_FAILED = "xaee_resident_init_failed";
    public static final String XAEE_SERVICE_PKG_EMPTY = "xaee_service_pkg_empty";
    public static final String XAEE_SPEECH_ASR_INIT_ERROR = "xaee_speech_asr_init_error";
    public static final String XAEE_SPEECH_ASR_RELOAD_ERROR = "xaee_speech_asr_reload_error";
    public static final String XAEE_SPEECH_EOS_INIT_ERROR = "xaee_speech_eos_init_error";
    public static final String XAEE_SPEECH_NLP_INIT_ERROR = "xaee_speech_nlp_init_error";
    public static final String XAEE_SPEECH_OTHER_ERROR = "xaee_speech_other_error";
    public static final String XAEE_SPEECH_REJECT_INIT_ERROR = "xaee_speech_reject_init_error";
    public static final String XAEE_SPEECH_TTS_INIT_ERROR = "xaee_speech_tts_init_error";
    public static final String XAEE_VERSION_INCOMPATIBLE = "xaee_version_incompatible";

    public enum EngineLink {
        OFFLINE,
        ONLINE
    }

    public boolean isDeviceMemorySupported() {
        return true;
    }

    public void onConnectOfflineError(String str) {
    }

    public int onGetMockXaeeVersion() {
        return 0;
    }

    public boolean onGetProcessExist(String str) {
        return true;
    }

    public abstract boolean onGetXaeeHealth();

    public abstract void onInitMIXEngine(EngineLink engineLink);

    public void onXaeeNotExist(String str) {
    }
}

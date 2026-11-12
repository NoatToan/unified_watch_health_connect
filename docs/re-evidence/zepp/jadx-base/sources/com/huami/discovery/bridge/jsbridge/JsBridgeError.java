package com.huami.discovery.bridge.jsbridge;

import com.google.gson.annotations.SerializedName;
import com.huami.discovery.bridge.jsbridge.util.IOUtil;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes8.dex */
public class JsBridgeError {
    public static final long ERR_CODE_ALPHA_INVALID = 4020202;
    public static final long ERR_CODE_DISPLAY_INVALID = 4020301;
    public static final long ERR_CODE_FLAVOR_UNSUPPORT_TYPE = 4010502;
    public static final long ERR_CODE_JSON_ERROR = 4000000;
    public static final long ERR_CODE_LOCATTION_NULL = 4040902;
    public static final long ERR_CODE_LOCATTION_PERMISSION = 4040901;
    public static final long ERR_CODE_MISS_PARAM = 4020000;
    public static final long ERR_CODE_NAV_POSITION_UNSUPPORT_EVENT = 4040603;
    public static final long ERR_CODE_REQUIRE_GLOBAL = 4020501;
    public static final long ERR_CODE_REQUIRE_TYPE_CAP = 4020502;
    public static final long ERR_CODE_RGB_INVALID = 4020201;
    public static final long ERR_CODE_SHARE_TYPE_REQUIRE_PARAM = 4010503;
    public static final long ERR_CODE_UNKNOWN_BTN_KEY = 4040401;
    public static final long ERR_CODE_UNKNOWN_FALLBACK_EVENT = 4040602;
    public static final long ERR_CODE_UNKNOWN_FLAVOR = 4040503;
    public static final long ERR_CODE_UNKNOWN_NAV_POSITION = 4040601;
    public static final long ERR_CODE_UNSUPPORT_CAP = 4040502;
    public static final long ERR_CODE_UNSUPPORT_CAP_IMGURL = 4010501;
    public static final long ERR_CODE_UNSUPPORT_PROTOCOL = 4040701;
    public static final long ERR_CODE_URL_INVALID = 4010401;
    public static final long ERR_CODE_USER_LOGOUT = 4030801;
    public static final long ERR_CODE_USER_MUTEXED = 4030802;
    public static final long ERR_CODE_USER_UNLOGIN = 4030803;
    public static final long ERR_CODE_VERIFY_FAIL = 4020101;
    public static final String TAG = "JsBridgeError";
    public static JsBridgeError mJsonParseError;
    public static JsBridgeError mMissParamError;

    @SerializedName("errorCode")
    public long errorCode;

    @SerializedName("errorMessage")
    public String errorMessage;

    public JsBridgeError() {
    }

    public static JsBridgeError jsonParseError() {
        if (mJsonParseError == null) {
            JsBridgeError jsBridgeError = new JsBridgeError();
            mJsonParseError = jsBridgeError;
            jsBridgeError.errorCode = 4000000L;
            jsBridgeError.errorMessage = "Param syntax error.";
        }
        HMLog.i("JsBridgeError", "Json ParseError", new Object[0]);
        return mJsonParseError;
    }

    public static JsBridgeError missParamError(String str) {
        if (mMissParamError == null) {
            JsBridgeError jsBridgeError = new JsBridgeError();
            mMissParamError = jsBridgeError;
            jsBridgeError.errorCode = 4020000L;
        }
        mMissParamError.errorMessage = "Param '" + str + "' is required";
        StringBuilder sb = new StringBuilder();
        sb.append("miss param Error:");
        sb.append(str);
        HMLog.i("JsBridgeError", sb.toString(), new Object[0]);
        return mMissParamError;
    }

    public String toString() {
        return IOUtil.getGson().toJson(this);
    }

    public JsBridgeError(long j, String... strArr) {
        this.errorCode = j;
        if (4020202 == j) {
            this.errorMessage = "Parameter 'a' must be float between 0 to 1.";
        } else if (4020301 == j) {
            this.errorMessage = "Parameter 'display' must be bool.";
        } else if (4010502 == j) {
            if (strArr == null || strArr.length != 2) {
                this.errorMessage = "cannot support share type";
            } else {
                this.errorMessage = strArr[0] + " cannot support share type " + strArr[1];
            }
        } else if (4040603 == j) {
            if (strArr == null || strArr.length != 2) {
                this.errorMessage = "this position can't support this fallbackEvent";
            } else {
                this.errorMessage = "The " + strArr[1] + " of position " + strArr[0] + " is unsupported";
            }
        } else if (4020501 == j) {
            this.errorMessage = "Param global object is required.";
        } else if (4020502 == j) {
            this.errorMessage = "Param type and capture are required.";
        } else if (4020201 == j) {
            this.errorMessage = "Parameter 'r','g','b' must be int between 0 to 255.";
        } else if (4010503 == j) {
            if (strArr == null || strArr.length != 2) {
                this.errorMessage = "share type required special param";
            } else {
                this.errorMessage = "Share type " + strArr[0] + " require use " + strArr[1];
            }
        } else if (4040401 == j) {
            this.errorMessage = "Unknown button key.";
        } else if (4040602 == j) {
            this.errorMessage = "Unknown the fallbackEvent value: ";
            if (strArr != null && strArr.length == 1) {
                this.errorMessage += strArr[0];
            }
        } else if (4040503 == j) {
            this.errorMessage = "Unsupported social in especial config : ";
            if (strArr != null && strArr.length == 1) {
                this.errorMessage += strArr[0];
            }
        } else if (4040601 == j) {
            this.errorMessage = "Not defined :";
            if (strArr != null && strArr.length == 1) {
                this.errorMessage += strArr[0];
            }
        } else if (4040502 == j) {
            this.errorMessage = "Unknown capture value, just support 0, 1, 2.";
        } else if (4010501 == j) {
            this.errorMessage = "Cannot use 'imgUrl' as share image , because used 'capture' = ";
            if (strArr != null && strArr.length == 1) {
                this.errorMessage += strArr[0];
            }
        } else if (4040701 == j) {
            this.errorMessage = "This protocol is not registered.";
        } else if (4010401 == j) {
            this.errorMessage = "Invalid url: ";
            if (strArr != null && strArr.length == 1) {
                this.errorMessage += strArr[0];
            }
        } else if (4030801 == j) {
            this.errorMessage = "User has logout.";
        } else if (4030802 == j) {
            this.errorMessage = "User has kicked out.";
        } else if (4030803 == j) {
            this.errorMessage = "User has not login.";
        } else if (4020101 == j) {
            this.errorMessage = "Verify sign error.";
        } else if (ERR_CODE_LOCATTION_PERMISSION == j) {
            this.errorMessage = "Getting location is forbidden.";
        } else if (ERR_CODE_LOCATTION_NULL == j) {
            this.errorMessage = "Location is null.";
        }
        HMLog.i("JsBridgeError", "errorCode:" + this.errorCode + ",errMessage:" + this.errorMessage, new Object[0]);
    }
}

package com.huami.passport;

import com.android.volley.VolleyError;
import com.google.gson.annotations.SerializedName;
import com.huami.passport.entity.Data;
import com.huami.passport.entity.Entity;
import com.huami.passport.entity.Message;
import com.huami.passport.entity.NextActions;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ErrorCode extends Entity implements Serializable {
    public static final String APPTOKEN_IS_NULL_ERROR = "C030004";
    public static final String CALL_TPSDK_ERROR = "C030010";
    public static final String CONFIG_LOGIN_DIALOG_ERROR = "C020002";
    public static final String GOOGLE_ACTIVITY_CONFIG_ERROR = "C030007";
    public static final String GOOGLE_SERVER_CLIENTID_ERROR = "C030008";
    public static final String ID_AUTH_DENIED_ERROR = "C050000";
    public static final String ID_AUTH_FORMAT_ERROR = "C050006";
    public static final String ID_TOKEN_INVALID_ERROR = "C050004";
    public static final String INNER_HANDLE_ERROR = "C020004";
    public static final String LOGIN_SERVER_INNER_ERROR = "C060001";
    public static final String NOT_SUPPORT_ERROR = "C030009";
    public static final String NOT_SUPPORT_TPN_ERROR = "C030005";
    public static final String NO_CONNECTION_ERROR = "C020001";
    public static final String NO_LOGIN_ERROR = "C050005";
    public static final String NO_NETWORK_ERROR = "C020007";
    public static final String NO_TPA_FOUND_ERROR = "C030000";
    public static final String PARAMS_ERROR = "C020006";
    public static final String PARAMS_IS_NULL_ERROR = "C020005";
    public static final String PARSE_ERROR = "C050001";
    public static final String SERVER_ERROR = "C050002";
    public static final String THRID_NO_PROVIDER_ERROR = "C020003";
    public static final String TIMEOUT_ERROR = "C050003";
    public static final String TPA_CLOSE_GLOBLE_ERROR = "C030006";
    public static final String TPA_CONFIG_ERROR = "C030001";
    public static final String TPA_CONFIG_JSON_FORMAT_ERROR = "C030002";
    public static final String TPA_DENIED_ERROR = "C040000";
    public static final String TPA_DONE_ERROR_RESULT = "C040002";
    public static final String TPA_DONE_NO_RESULT = "C040001";
    public static final String TPA_OPT_SUCCESS_NO_CODE = "C040003";
    public static final String UNINSTALL_TPAPP_ERROR = "C030003";
    public static final String UNKOWN_ERROR = "C020000";
    public static final String USER_CANCEL_ERROR = "C010000";

    @SerializedName("code")
    private int code;
    private transient Data data;

    @SerializedName("message")
    private String errorMsg;
    private transient String extras;
    private VolleyError mVolleyError;
    private transient Message message;
    private transient String tempAccess;

    @SerializedName(Configs.Params.THIRD_ID)
    private String thirdId;

    public interface Server {
        public static final String S0100 = "0100";
        public static final String S0101 = "0101";
        public static final String S0102 = "0102";
        public static final String S0103 = "0103";
        public static final String S0105 = "0105";
        public static final String S0106 = "0106";
        public static final String S0107 = "0107";
        public static final String S0108 = "0108";
        public static final String S0109 = "0109";
        public static final String S0110 = "0110";
        public static final String S0111 = "0111";
        public static final String S0112 = "0112";
    }

    public ErrorCode() {
    }

    public static ErrorCode builder(String str) {
        return new ErrorCode(str);
    }

    public int getCode() {
        return this.code;
    }

    public Data getData() {
        return this.data;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getExtras() {
        return this.extras;
    }

    public Message getMessage() {
        return this.message;
    }

    public String getTempAccess() {
        return this.tempAccess;
    }

    public String getThirdId() {
        return this.thirdId;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setErrorCode(ErrorCode errorCode) {
        setErrorCode(errorCode.getErrorCode());
        setErrorMsg(errorCode.getErrorMsg());
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setExtras(String str) {
        this.extras = str;
    }

    public void setTempAccess(String str) {
        this.tempAccess = str;
    }

    public void setThirdId(String str) {
        this.thirdId = str;
    }

    public String toString() {
        return ", result='" + getResult() + "', errorCode='" + getErrorCode() + "', userid='" + getUserId() + "', errorMsg='" + this.errorMsg + "', mutimeLong='" + getMutimeLong() + "', mutime='" + getMutime() + "', thirdId='" + getThirdId() + "', extras='" + getExtras() + "'}";
    }

    public ErrorCode(String str, String str2) {
        setErrorCode(str);
        this.errorMsg = str2;
    }

    public static ErrorCode builder(String str, List<NextActions> list) {
        ErrorCode errorCode = new ErrorCode(str);
        errorCode.setNextActions(list);
        return errorCode;
    }

    public static ErrorCode builder(String str, String str2) {
        return new ErrorCode(str, str2);
    }

    public ErrorCode(int i, String str) {
        this.code = i;
        this.errorMsg = str;
        this.mVolleyError.printStackTrace();
    }

    public ErrorCode(String str, Message message) {
        setErrorCode(str);
        this.message = message;
    }

    public ErrorCode(String str) {
        setErrorCode(str);
    }
}

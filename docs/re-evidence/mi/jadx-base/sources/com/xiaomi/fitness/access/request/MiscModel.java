package com.xiaomi.fitness.access.request;

import android.os.SystemClock;
import com.google.android.gms.actions.SearchIntents;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.nfc.ui.IssuerActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class MiscModel {

    public static class AlipayBindResult {
        public static final int sStatusBind = 2;
        public static final int sStatusBindOther = 3;
        public static final int sStatusUnAuth = 0;
        public static final int sStatusUnBind = 1;

        @SerializedName("bind_status")
        public int bind_status;

        @SerializedName(SearchIntents.EXTRA_QUERY)
        public String query;

        @SerializedName(Constants.KEY_PAY_RESULT_RET)
        public boolean ret;

        public boolean isBind() {
            return this.bind_status == 2;
        }

        public boolean isBindOther() {
            return this.bind_status == 3;
        }

        public String toString() {
            return "AlipayBindResult{bind_status=" + this.bind_status + ", query='" + this.query + "', ret=" + this.ret + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class AlipayQueryQuest {
        private String api_method = "alipay.open.auth.sdk.code.get";
        private Map<String, Object> params = new HashMap();
        private boolean need_encrypt = false;

        public static AlipayQueryQuest create() {
            AlipayQueryQuest alipayQueryQuest = new AlipayQueryQuest();
            alipayQueryQuest.params.put("auth_type", "AUTHACCOUNT");
            alipayQueryQuest.params.put(FeedbackConstants.KEY_APP_NAME, "mc");
            alipayQueryQuest.params.put("target_id", SystemClock.currentThreadTimeMillis() + "");
            alipayQueryQuest.params.put("apiname", "com.alipay.account.auth");
            alipayQueryQuest.params.put("scope", "kuaijie");
            alipayQueryQuest.params.put("biz_type", "openservice");
            alipayQueryQuest.params.put(IssuerActivity.KEY_PRODUCT_ID, "APP_FAST_LOGIN");
            alipayQueryQuest.params.put("sign_type", "RSA2");
            return alipayQueryQuest;
        }
    }

    public static class BindStatus {

        @SerializedName("bind_status")
        public Integer bindStatus;

        @SerializedName("did")
        public String did;

        @SerializedName("ilink_im_sdkId")
        public String iLinkImSdkId;

        @SerializedName("ilink_iot_userId")
        public String iLinkIotUserId;

        public String toString() {
            return "BindStatus{did='" + this.did + "', bindStatus=" + this.bindStatus + ", iLinkImSdkId='" + this.iLinkImSdkId + "', iLinkIotUserId='" + this.iLinkIotUserId + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class DeviceTicket {

        @SerializedName("ticket")
        public String ticket;
    }

    public static class ProductResult {

        @SerializedName("product_list")
        public List<String> productList;
    }

    public static class StravaBindResult {

        @SerializedName("bind_status")
        public int bindStatus;

        @SerializedName(Constants.KEY_PAY_RESULT_RET)
        public boolean ret;

        @SerializedName("third_uid")
        public String thirdUid;

        @SerializedName("update_time")
        public long updateTime;

        public boolean isBound() {
            return this.bindStatus == 1;
        }

        public String toString() {
            return "StravaBindResult{thirdUid='" + this.thirdUid + "', bindStatus=" + this.bindStatus + ", updateTime=" + this.updateTime + ", ret=" + this.ret + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class StravaRequest {

        @SerializedName(ThirdPartAccessConstants.PARAM_AUTH_CODE)
        public String authCode;

        public static StravaRequest create(String str) {
            StravaRequest stravaRequest = new StravaRequest();
            stravaRequest.authCode = str;
            return stravaRequest;
        }
    }

    public static class UnbindDeviceFromWechat {

        @SerializedName("result")
        public Boolean result;
    }

    public static class WechatBindResult {

        @SerializedName("bind_status")
        public int status;

        @SerializedName("qr_ticket")
        public String ticket;

        public boolean isBound() {
            return this.status == 2;
        }

        public String toString() {
            return "WechatBindResult{status=" + this.status + ", ticket='" + this.ticket + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }
}

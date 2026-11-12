package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.alipay.sdk.m.u.i;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.upnp.Argument;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 U2\u00020\u0001:\u0003VUWB\u0083\u0001\b\u0002\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010*\u001a\u00020\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00109\u001a\u0004\u0018\u000104\u0012\b\u0010<\u001a\u0004\u0018\u000104\u0012\b\u0010B\u001a\u0004\u0018\u00010=\u0012\b\u0010H\u001a\u0004\u0018\u00010C\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NB#\b\u0017\u0012\b\u0010H\u001a\u0004\u0018\u00010C\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010Oj\u0004\u0018\u0001`P¢\u0006\u0004\bM\u0010QB%\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bM\u0010RB\u0011\b\u0012\u0012\u0006\u0010S\u001a\u00020\u0004¢\u0006\u0004\bM\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028F@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001c\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010$\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010'\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0019\u0010*\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001b\u0010-\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000eR\u001b\u00100\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000eR\u001b\u00103\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000eR\u001b\u00109\u001a\u0004\u0018\u0001048\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010<\u001a\u0004\u0018\u0001048\u0006@\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u001b\u0010B\u001a\u0004\u0018\u00010=8\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010H\u001a\u0004\u0018\u00010C8\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006X"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "", "toString", "Landroid/os/Parcel;", Argument.OUT, "", DataCacher.j, "", "writeToParcel", "describeContents", "a", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "Lcom/facebook/FacebookException;", "<set-?>", "b", "Lcom/facebook/FacebookException;", "getException", "()Lcom/facebook/FacebookException;", Constants.EXCEPTION, "Lcom/facebook/FacebookRequestError$Category;", "c", "Lcom/facebook/FacebookRequestError$Category;", "getCategory", "()Lcom/facebook/FacebookRequestError$Category;", "category", GoogleApiAvailabilityLight.a, "getErrorRecoveryMessage", "errorRecoveryMessage", "e", LogUtil.I, "getRequestStatusCode", "()I", "requestStatusCode", "f", "getErrorCode", "errorCode", "g", "getSubErrorCode", "subErrorCode", "h", "getErrorType", "errorType", "i", "getErrorUserTitle", "errorUserTitle", z.j, "getErrorUserMessage", "errorUserMessage", "Lorg/json/JSONObject;", hl.k, "Lorg/json/JSONObject;", "getRequestResultBody", "()Lorg/json/JSONObject;", "requestResultBody", "l", "getRequestResult", "requestResult", "", "m", "Ljava/lang/Object;", "getBatchRequestResult", "()Ljava/lang/Object;", "batchRequestResult", "Ljava/net/HttpURLConnection;", GoogleApiAvailabilityLight.b, "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", AbsEsimOperation.HEADER_CONNECTION, "errorMessageField", "exceptionField", "", "errorIsTransient", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;Z)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "(ILjava/lang/String;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "Companion", "Category", "Range", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookRequestError implements Parcelable {
    private static final String A = "is_transient";
    public static final int INVALID_ERROR_CODE = -1;
    public static final int INVALID_HTTP_STATUS_CODE = -1;
    private static final String o = "code";
    private static final String p = "body";
    private static final String q = "error";
    private static final String r = "type";
    private static final String s = "code";
    private static final String t = "message";
    private static final String u = "error_code";
    private static final String v = "error_subcode";
    private static final String w = "error_msg";
    private static final String x = "error_reason";
    private static final String y = "error_user_title";
    private static final String z = "error_user_msg";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final String errorMessage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private FacebookException exception;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Category category;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final String errorRecoveryMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int requestStatusCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int errorCode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int subErrorCode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final String errorType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final String errorUserTitle;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final String errorUserMessage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private final JSONObject requestResultBody;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private final JSONObject requestResult;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final Object batchRequestResult;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private final HttpURLConnection connection;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Range B = new Range(200, 299);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new Parcelable.Creator<FacebookRequestError>() { // from class: com.facebook.FacebookRequestError$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FacebookRequestError createFromParcel(@NotNull Parcel parcel) {
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FacebookRequestError[] newArray(int size) {
            return new FacebookRequestError[size];
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/FacebookRequestError$Category;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN_RECOVERABLE", MeasureStateValue.OTHER, "TRANSIENT", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J&\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007R\u001c\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0011\u001a\u00020\u000e8G@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001c\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0016\u0010\u001d\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010\u001f\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0016\u0010 \u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0016\u0010!\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0016\u0010%\u001a\u00020$8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020$8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006*"}, d2 = {"Lcom/facebook/FacebookRequestError$Companion;", "", "Lorg/json/JSONObject;", "singleResult", "batchResult", "Ljava/net/HttpURLConnection;", AbsEsimOperation.HEADER_CONNECTION, "Lcom/facebook/FacebookRequestError;", "checkResponseAndCreateError", "Lcom/facebook/FacebookRequestError$Range;", "HTTP_RANGE_SUCCESS", "Lcom/facebook/FacebookRequestError$Range;", "getHTTP_RANGE_SUCCESS$facebook_core_release", "()Lcom/facebook/FacebookRequestError$Range;", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "getErrorClassification", "()Lcom/facebook/internal/FacebookRequestErrorClassification;", "errorClassification", "", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "ERROR_CODE_FIELD_KEY", "ERROR_CODE_KEY", "ERROR_IS_TRANSIENT_KEY", "ERROR_KEY", "ERROR_MESSAGE_FIELD_KEY", "ERROR_MSG_KEY", "ERROR_REASON_KEY", "ERROR_SUB_CODE_KEY", "ERROR_TYPE_FIELD_KEY", "ERROR_USER_MSG_KEY", "ERROR_USER_TITLE_KEY", "", "INVALID_ERROR_CODE", LogUtil.I, "INVALID_HTTP_STATUS_CODE", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00c8 A[Catch: JSONException -> 0x0126, TryCatch #0 {JSONException -> 0x0126, blocks: (B:3:0x000d, B:5:0x0013, B:7:0x001d, B:9:0x0021, B:12:0x002f, B:14:0x003a, B:17:0x0044, B:20:0x004e, B:23:0x0056, B:25:0x005c, B:28:0x0066, B:31:0x0070, B:45:0x00c8, B:33:0x007c, B:36:0x0089, B:38:0x0092, B:42:0x00a3, B:47:0x00e9, B:49:0x00f3, B:51:0x0101, B:53:0x010a), top: B:57:0x000d }] */
        @JvmStatic
        @Nullable
        public final FacebookRequestError checkResponseAndCreateError(@NotNull JSONObject singleResult, @Nullable Object batchResult, @Nullable HttpURLConnection connection) {
            String strOptString;
            int iOptInt;
            String str;
            String strOptString2;
            String strOptString3;
            boolean zOptBoolean;
            String str2;
            try {
                if (singleResult.has("code")) {
                    int i = singleResult.getInt("code");
                    Object stringPropertyAsJSON = Utility.getStringPropertyAsJSON(singleResult, "body", GraphResponse.NON_JSON_RESPONSE_PROPERTY);
                    if (stringPropertyAsJSON != null && (stringPropertyAsJSON instanceof JSONObject)) {
                        boolean z = false;
                        int iOptInt2 = -1;
                        if (((JSONObject) stringPropertyAsJSON).has("error")) {
                            JSONObject jSONObject = (JSONObject) Utility.getStringPropertyAsJSON((JSONObject) stringPropertyAsJSON, "error", null);
                            strOptString = jSONObject != null ? jSONObject.optString("type", null) : null;
                            String strOptString4 = jSONObject != null ? jSONObject.optString("message", null) : null;
                            int iOptInt3 = jSONObject != null ? jSONObject.optInt("code", -1) : -1;
                            iOptInt2 = jSONObject != null ? jSONObject.optInt("error_subcode", -1) : -1;
                            strOptString2 = jSONObject != null ? jSONObject.optString(FacebookRequestError.z, null) : null;
                            strOptString3 = jSONObject != null ? jSONObject.optString(FacebookRequestError.y, null) : null;
                            str = strOptString4;
                            zOptBoolean = jSONObject != null ? jSONObject.optBoolean(FacebookRequestError.A, false) : false;
                            iOptInt = iOptInt2;
                            z = true;
                            iOptInt2 = iOptInt3;
                        } else {
                            if (((JSONObject) stringPropertyAsJSON).has("error_code") || ((JSONObject) stringPropertyAsJSON).has(FacebookRequestError.w) || ((JSONObject) stringPropertyAsJSON).has("error_reason")) {
                                strOptString = ((JSONObject) stringPropertyAsJSON).optString("error_reason", null);
                                String strOptString5 = ((JSONObject) stringPropertyAsJSON).optString(FacebookRequestError.w, null);
                                int iOptInt4 = ((JSONObject) stringPropertyAsJSON).optInt("error_code", -1);
                                iOptInt = ((JSONObject) stringPropertyAsJSON).optInt("error_subcode", -1);
                                iOptInt2 = iOptInt4;
                                str = strOptString5;
                                strOptString2 = null;
                                strOptString3 = null;
                                z = true;
                                zOptBoolean = false;
                            } else {
                                str2 = null;
                                str = null;
                                strOptString2 = null;
                                strOptString3 = null;
                                iOptInt = -1;
                                zOptBoolean = false;
                            }
                            if (z) {
                                return new FacebookRequestError(i, iOptInt2, iOptInt, str2, str, strOptString3, strOptString2, (JSONObject) stringPropertyAsJSON, singleResult, batchResult, connection, null, zOptBoolean, null);
                            }
                        }
                        str2 = strOptString;
                        if (z) {
                            return new FacebookRequestError(i, iOptInt2, iOptInt, str2, str, strOptString3, strOptString2, (JSONObject) stringPropertyAsJSON, singleResult, batchResult, connection, null, zOptBoolean, null);
                        }
                    }
                    if (!getHTTP_RANGE_SUCCESS$facebook_core_release().contains(i)) {
                        return new FacebookRequestError(i, -1, -1, null, null, null, null, singleResult.has("body") ? (JSONObject) Utility.getStringPropertyAsJSON(singleResult, "body", GraphResponse.NON_JSON_RESPONSE_PROPERTY) : null, singleResult, batchResult, connection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public final synchronized FacebookRequestErrorClassification getErrorClassification() {
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
            if (appSettingsWithoutQuery != null) {
                return appSettingsWithoutQuery.getErrorClassification();
            }
            return FacebookRequestErrorClassification.INSTANCE.getDefaultErrorClassification();
        }

        @NotNull
        public final Range getHTTP_RANGE_SUCCESS$facebook_core_release() {
            return FacebookRequestError.B;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/facebook/FacebookRequestError$Range;", "", "", "value", "", SearchCriteria.CONTAINS, "a", LogUtil.I, "start", "b", "end", "<init>", "(II)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Range {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int start;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int end;

        public Range(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public final boolean contains(int value) {
            return this.start <= value && this.end >= value;
        }
    }

    public /* synthetic */ FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z2);
    }

    @JvmStatic
    @Nullable
    public static final FacebookRequestError checkResponseAndCreateError(@NotNull JSONObject jSONObject, @Nullable Object obj, @Nullable HttpURLConnection httpURLConnection) {
        return INSTANCE.checkResponseAndCreateError(jSONObject, obj, httpURLConnection);
    }

    @JvmStatic
    @NotNull
    public static final synchronized FacebookRequestErrorClassification getErrorClassification() {
        return INSTANCE.getErrorClassification();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Object getBatchRequestResult() {
        return this.batchRequestResult;
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.exception;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Nullable
    public final String getErrorRecoveryMessage() {
        return this.errorRecoveryMessage;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final String getErrorUserMessage() {
        return this.errorUserMessage;
    }

    @Nullable
    public final String getErrorUserTitle() {
        return this.errorUserTitle;
    }

    @Nullable
    public final FacebookException getException() {
        return this.exception;
    }

    @Nullable
    public final JSONObject getRequestResult() {
        return this.requestResult;
    }

    @Nullable
    public final JSONObject getRequestResultBody() {
        return this.requestResultBody;
    }

    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    @NotNull
    public String toString() {
        return "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + getErrorMessage() + i.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int flags) {
        out.writeInt(this.requestStatusCode);
        out.writeInt(this.errorCode);
        out.writeInt(this.subErrorCode);
        out.writeString(this.errorType);
        out.writeString(getErrorMessage());
        out.writeString(this.errorUserTitle);
        out.writeString(this.errorUserMessage);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z2) {
        boolean z3;
        Category categoryClassify;
        this.requestStatusCode = i;
        this.errorCode = i2;
        this.subErrorCode = i3;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (facebookException != null) {
            this.exception = facebookException;
            z3 = true;
        } else {
            this.exception = new FacebookServiceException(this, getErrorMessage());
            z3 = false;
        }
        if (z3) {
            categoryClassify = Category.OTHER;
        } else {
            categoryClassify = INSTANCE.getErrorClassification().classify(i2, i3, z2);
        }
        this.category = categoryClassify;
        this.errorRecoveryMessage = INSTANCE.getErrorClassification().getRecoveryMessage(categoryClassify);
    }

    @VisibleForTesting(otherwise = 4)
    public FacebookRequestError(@Nullable HttpURLConnection httpURLConnection, @Nullable Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i, @Nullable String str, @Nullable String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}

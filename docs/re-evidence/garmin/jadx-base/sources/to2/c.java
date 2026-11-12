package to2;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lto2/c;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "reason", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    CREDITCARD_CREATED("CREDITCARD_CREATED", null, 2, null),
    CREDITCARD_DEACTIVATED("CREDITCARD_DEACTIVATED", null, 2, null),
    CREDITCARD_REACTIVATED("CREDITCARD_REACTIVATED", null, 2, null),
    CREDITCARD_ACTIVATED("CREDITCARD_ACTIVATED", null, 2, null),
    CREDITCARD_DELETED("CREDITCARD_DELETED", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    RESET_DEFAULT_CREDITCARD("RESET_DEFAULT_CREDITCARD", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    SET_DEFAULT_CREDITCARD("SET_DEFAULT_CREDITCARD", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    APDU_PACKAGE("APDU_PACKAGE", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CREDITCARD_METADATA_UPDATED("CREDITCARD_METADATA_UPDATED", null, 2, null),
    CREDITCARD_PROVISION_FAILED("CREDITCARD_PROVISION_FAILED", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CREDITCARD_PROVISION_SUCCESS("CREDITCARD_PROVISION_SUCCESS", null, 2, null),
    CREDITCARD_PENDING_VERIFICATION("CREDITCARD_PENDING_VERIFICATION", null, 2, null),
    CREDENTIAL_UPDATE_FAILED("CREDENTIAL_UPDATE_FAILED", null, 2, null),
    CREDENTIAL_UPDATE_SUCCESS("CREDENTIAL_UPDATE_SUCCESS", null, 2, null),
    CREDENTIAL_EXPIRING("CREDENTIAL_EXPIRING", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    USER_DELETED("USER_CREATE", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    USER_DELETED("USER_DELETED", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    APDU_RESPONSE("APDU_RESPONSE", null, 2, null),
    SYNC("SYNC", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    DEVICE_CREATED("DEVICE_CREATED", null, 2, null),
    DEVICE_STATE_UPDATED("DEVICE_STATE_UPDATED", null, 2, null),
    DEVICE_DELETED("DEVICE_DELETED", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSFER_UPDATE("TRANSFER_UPDATE", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    SE_OPERATION_UPDATE("SE_OPERATION_UPDATE", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    RESET_DEFAULT_CREDENTIAL("RESET_DEFAULT_CREDENTIAL", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CREDENTIAL_DEACTIVATED("CREDENTIAL_DEACTIVATED", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    CREDENTIAL_REACTIVATED("CREDENTIAL_REACTIVATED", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_CONNECTED("STREAM_CONNECTED", null, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_DISCONNECTED("STREAM_DISCONNECTED", null, 2, null),
    STREAM_HEARTBEAT("STREAM_HEARTBEAT", null, 2, null),
    TOKEN_DEACTIVATED("TOKEN_DEACTIVATED", null, 2, null),
    TOKEN_REACTIVATED("TOKEN_REACTIVATED", null, 2, null),
    PURCHASE_COMPLETE("PURCHASE_COMPLETE", null, 2, null),
    PURCHASE_FAILED("PURCHASE_FAILED", null, 2, null),
    CREDENTIAL_CREATED("CREDENTIAL_CREATED", null, 2, null),
    CREDENTIAL_ACTIVATED("CREDENTIAL_ACTIVATED", null, 2, null),
    CREDENTIAL_DELETED("CREDENTIAL_DELETED", null, 2, null),
    CREDENTIAL_DELETE_FAILED("CREDENTIAL_DELETE_FAILED", null, 2, null),
    JOB_STATUS("JOB_STATUS", null, 2, null),
    APDU_OFFLINE_SESSION_START("APDU_OFFLINE_SESSION_START", null, 2, null),
    APDU_OFFLINE_SESSION_END("APDU_OFFLINE_SESSION_END", null, 2, null),
    REFUND_FAILED("REFUND_FAILED", null, 2, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f165895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f165896b;

    /* synthetic */ c(String str, String str2, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : str2);
    }

    c(String str, String str2) {
        this.f165895a = str;
        this.f165896b = str2;
    }
}

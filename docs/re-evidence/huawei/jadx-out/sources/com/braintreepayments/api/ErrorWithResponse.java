package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 )2\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001)B\u0007\b\u0012¢\u0006\u0002\u0010\u0004B\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u000f\b\u0014\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\"\u001a\u00020\bJ\u0012\u0010#\u001a\u00020$2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010%\u001a\u00020\bH\u0016J\u0018\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0006H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R4\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/braintreepayments/api/ErrorWithResponse;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Landroid/os/Parcelable;", "()V", "statusCode", "", "jsonString", "", "(ILjava/lang/String;)V", "inParcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "_message", "_originalResponse", "errorResponse", "getErrorResponse", "()Ljava/lang/String;", "<set-?>", "", "Lcom/braintreepayments/api/BraintreeError;", ErrorWithResponse.FIELD_ERRORS_KEY, "getFieldErrors", "()Ljava/util/List;", "setFieldErrors$BraintreeCore_release", "(Ljava/util/List;)V", "message", "getMessage", "getStatusCode", "()I", "setStatusCode$BraintreeCore_release", "(I)V", "describeContents", "errorFor", "field", "parseJson", "", "toString", "writeToParcel", "dest", ParamConstants.Param.FLAGS, "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class ErrorWithResponse extends Exception implements Parcelable {
    private static final String ERROR_KEY = "error";
    private static final String FIELD_ERRORS_KEY = "fieldErrors";
    private static final int GRAPHQL_ERROR_CODE = 422;
    private static final String MESSAGE_KEY = "message";
    private String _message;
    private String _originalResponse;
    private List<? extends BraintreeError> fieldErrors;
    private int statusCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ErrorWithResponse> CREATOR = new d();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode$BraintreeCore_release(int i) {
        this.statusCode = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this._message;
    }

    /* JADX INFO: renamed from: getErrorResponse, reason: from getter */
    public String get_originalResponse() {
        return this._originalResponse;
    }

    public List<BraintreeError> getFieldErrors() {
        return this.fieldErrors;
    }

    public void setFieldErrors$BraintreeCore_release(List<? extends BraintreeError> list) {
        this.fieldErrors = list;
    }

    private ErrorWithResponse() {
    }

    public ErrorWithResponse(int i, String str) {
        setStatusCode$BraintreeCore_release(i);
        this._originalResponse = str;
        try {
            parseJson(str);
        } catch (JSONException unused) {
            this._message = "Parsing error response failed";
            setFieldErrors$BraintreeCore_release(new ArrayList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseJson(String jsonString) throws JSONException {
        if (jsonString != null) {
            JSONObject jSONObject = new JSONObject(jsonString);
            this._message = jSONObject.getJSONObject("error").getString("message");
            setFieldErrors$BraintreeCore_release(BraintreeError.INSTANCE.d(jSONObject.optJSONArray(FIELD_ERRORS_KEY)));
        }
    }

    public final BraintreeError errorFor(String field) {
        BraintreeError braintreeErrorErrorFor;
        zcp.c(field, "");
        if (getFieldErrors() == null) {
            return null;
        }
        List<BraintreeError> fieldErrors = getFieldErrors();
        zcp.e(fieldErrors);
        for (BraintreeError braintreeError : fieldErrors) {
            if (zcp.b((Object) braintreeError.getField(), (Object) field)) {
                return braintreeError;
            }
            if (braintreeError.getFieldErrors() != null && (braintreeErrorErrorFor = braintreeError.errorFor(field)) != null) {
                return braintreeErrorErrorFor;
            }
        }
        return null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return zes.d("\n            ErrorWithResponse (" + getStatusCode() + "): " + getMessage() + "\n            " + getFieldErrors() + "\n        ");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zcp.c(dest, "");
        dest.writeInt(getStatusCode());
        dest.writeString(getMessage());
        dest.writeString(this._originalResponse);
        dest.writeTypedList(getFieldErrors());
    }

    protected ErrorWithResponse(Parcel parcel) {
        zcp.c(parcel, "");
        setStatusCode$BraintreeCore_release(parcel.readInt());
        this._message = parcel.readString();
        this._originalResponse = parcel.readString();
        setFieldErrors$BraintreeCore_release(parcel.createTypedArrayList(BraintreeError.CREATOR));
    }

    /* JADX INFO: renamed from: com.braintreepayments.api.ErrorWithResponse$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u000eJ\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/braintreepayments/api/ErrorWithResponse$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/ErrorWithResponse;", "ERROR_KEY", "", "FIELD_ERRORS_KEY", "GRAPHQL_ERROR_CODE", "", "MESSAGE_KEY", "fromGraphQLJson", "json", "fromGraphQLJson$BraintreeCore_release", "fromJson", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final ErrorWithResponse e(String str) throws JSONException {
            ErrorWithResponse errorWithResponse = new ErrorWithResponse((zcm) null);
            errorWithResponse._originalResponse = str;
            errorWithResponse.parseJson(str);
            return errorWithResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [zcm] */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final ErrorWithResponse c(String str) {
            JSONArray jSONArray;
            JSONObject jSONObject;
            String string = 0;
            string = 0;
            ErrorWithResponse errorWithResponse = new ErrorWithResponse((zcm) string);
            errorWithResponse._originalResponse = str;
            errorWithResponse.setStatusCode$BraintreeCore_release(422);
            if (str != null) {
                try {
                    jSONArray = new JSONObject(str).getJSONArray("errors");
                } catch (JSONException unused) {
                    errorWithResponse._message = "Parsing error response failed";
                    errorWithResponse.setFieldErrors$BraintreeCore_release(new ArrayList());
                    return errorWithResponse;
                }
            } else {
                jSONArray = null;
            }
            errorWithResponse.setFieldErrors$BraintreeCore_release(BraintreeError.INSTANCE.c(jSONArray));
            List<BraintreeError> fieldErrors = errorWithResponse.getFieldErrors();
            if (fieldErrors != null && !fieldErrors.isEmpty()) {
                errorWithResponse._message = "Input is invalid.";
                return errorWithResponse;
            }
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(0)) != null) {
                string = jSONObject.getString("message");
            }
            errorWithResponse._message = string;
            return errorWithResponse;
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/braintreepayments/api/ErrorWithResponse$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/ErrorWithResponse;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/braintreepayments/api/ErrorWithResponse;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d implements Parcelable.Creator<ErrorWithResponse> {
        d() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ErrorWithResponse createFromParcel(Parcel parcel) {
            zcp.c(parcel, "");
            return new ErrorWithResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ErrorWithResponse[] newArray(int i) {
            return new ErrorWithResponse[i];
        }
    }

    @JvmStatic
    public static final ErrorWithResponse fromJson(String str) throws JSONException {
        return INSTANCE.e(str);
    }

    public /* synthetic */ ErrorWithResponse(zcm zcmVar) {
        this();
    }
}

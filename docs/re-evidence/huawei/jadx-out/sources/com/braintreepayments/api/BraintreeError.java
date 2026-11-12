package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.tu;
import defpackage.zcm;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007\b\u0010¢\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H\u0016R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R4\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00132\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006$"}, d2 = {"Lcom/braintreepayments/api/BraintreeError;", "Landroid/os/Parcelable;", "()V", "inParcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "<set-?>", "", "code", "getCode", "()I", "setCode$BraintreeCore_release", "(I)V", "", BraintreeError.FIELD_KEY, "getField", "()Ljava/lang/String;", "setField$BraintreeCore_release", "(Ljava/lang/String;)V", "", BraintreeError.FIELD_ERRORS_KEY, "getFieldErrors", "()Ljava/util/List;", "setFieldErrors$BraintreeCore_release", "(Ljava/util/List;)V", "message", "getMessage", "setMessage$BraintreeCore_release", "describeContents", "errorFor", "toString", "writeToParcel", "", "dest", ParamConstants.Param.FLAGS, "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class BraintreeError implements Parcelable {
    private static final String CODE_KEY = "code";
    private static final String FIELD_ERRORS_KEY = "fieldErrors";
    private static final String FIELD_KEY = "field";
    private static final String MESSAGE_KEY = "message";
    private static final int UNKNOWN_CODE = -1;
    private int code;
    private String field;
    private List<BraintreeError> fieldErrors;
    private String message;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<BraintreeError> CREATOR = new d();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getField() {
        return this.field;
    }

    public void setField$BraintreeCore_release(String str) {
        this.field = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage$BraintreeCore_release(String str) {
        this.message = str;
    }

    public List<BraintreeError> getFieldErrors() {
        return this.fieldErrors;
    }

    public void setFieldErrors$BraintreeCore_release(List<BraintreeError> list) {
        this.fieldErrors = list;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode$BraintreeCore_release(int i) {
        this.code = i;
    }

    public BraintreeError errorFor(String field) {
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

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("BraintreeError for ");
        sb.append(getField());
        sb.append(": ");
        sb.append(getMessage());
        sb.append(" -> ");
        List<BraintreeError> fieldErrors = getFieldErrors();
        if (fieldErrors == null || (string = fieldErrors.toString()) == null) {
            string = "";
        }
        sb.append(string);
        return sb.toString();
    }

    public BraintreeError() {
        this.code = -1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zcp.c(dest, "");
        dest.writeString(getField());
        dest.writeString(getMessage());
        dest.writeTypedList(getFieldErrors());
    }

    protected BraintreeError(Parcel parcel) {
        zcp.c(parcel, "");
        this.code = -1;
        setField$BraintreeCore_release(parcel.readString());
        setMessage$BraintreeCore_release(parcel.readString());
        setFieldErrors$BraintreeCore_release(parcel.createTypedArrayList(CREATOR));
    }

    /* JADX INFO: renamed from: com.braintreepayments.api.BraintreeError$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H\u0002J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u001aJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0002\b\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/braintreepayments/api/BraintreeError$Companion;", "", "()V", "CODE_KEY", "", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/BraintreeError;", "FIELD_ERRORS_KEY", "FIELD_KEY", "MESSAGE_KEY", "UNKNOWN_CODE", "", "addGraphQLFieldError", "", "inputPath", "", "errorJSON", "Lorg/json/JSONObject;", "errors", "", "fromGraphQLJsonArray", "graphQLErrors", "Lorg/json/JSONArray;", "fromJson", "json", "fromJson$BraintreeCore_release", "fromJsonArray", "input", "fromJsonArray$BraintreeCore_release", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<BraintreeError> d(JSONArray jSONArray) {
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    zcp.b((Object) jSONObject, "");
                    arrayList.add(b(jSONObject));
                } catch (JSONException unused) {
                }
            }
            return arrayList;
        }

        @JvmStatic
        public final List<BraintreeError> c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extensions");
                        if (zcp.b((Object) (jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("errorType") : null), (Object) "user_error")) {
                            ArrayList arrayList2 = new ArrayList();
                            JSONArray jSONArray2 = jSONObjectOptJSONObject.getJSONArray("inputPath");
                            int length2 = jSONArray2.length();
                            for (int i2 = 1; i2 < length2; i2++) {
                                arrayList2.add(jSONArray2.getString(i2));
                            }
                            zcp.b((Object) jSONObject, "");
                            a(arrayList2, jSONObject, arrayList);
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            return arrayList;
        }

        public final BraintreeError b(JSONObject jSONObject) {
            zcp.c(jSONObject, "");
            BraintreeError braintreeError = new BraintreeError();
            braintreeError.setField$BraintreeCore_release(tu.e(jSONObject, BraintreeError.FIELD_KEY, null));
            braintreeError.setMessage$BraintreeCore_release(tu.e(jSONObject, "message", null));
            braintreeError.setCode$BraintreeCore_release(jSONObject.optInt("code", -1));
            braintreeError.setFieldErrors$BraintreeCore_release(BraintreeError.INSTANCE.d(jSONObject.optJSONArray(BraintreeError.FIELD_ERRORS_KEY)));
            return braintreeError;
        }

        private final void a(List<String> list, JSONObject jSONObject, List<BraintreeError> list2) throws JSONException {
            BraintreeError braintreeError;
            String str = list.get(0);
            if (list.size() == 1) {
                BraintreeError braintreeError2 = new BraintreeError();
                braintreeError2.setField$BraintreeCore_release(str);
                braintreeError2.setMessage$BraintreeCore_release(jSONObject.getString("message"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extensions");
                if (jSONObjectOptJSONObject != null) {
                    braintreeError2.setCode$BraintreeCore_release(jSONObjectOptJSONObject.optInt("legacyCode", -1));
                }
                braintreeError2.setFieldErrors$BraintreeCore_release(new ArrayList());
                if (list2 != null) {
                    list2.add(braintreeError2);
                    return;
                }
                return;
            }
            List<String> listSubList = list.subList(1, list.size());
            if (list2 != null) {
                braintreeError = null;
                for (BraintreeError braintreeError3 : list2) {
                    if (zcp.b((Object) braintreeError3.getField(), (Object) str)) {
                        braintreeError = braintreeError3;
                    }
                }
                if (braintreeError == null) {
                    braintreeError = new BraintreeError();
                    braintreeError.setField$BraintreeCore_release(str);
                    braintreeError.setFieldErrors$BraintreeCore_release(new ArrayList());
                    list2.add(braintreeError);
                }
            } else {
                braintreeError = null;
            }
            a(listSubList, jSONObject, braintreeError != null ? braintreeError.getFieldErrors() : null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/braintreepayments/api/BraintreeError$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/BraintreeError;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/braintreepayments/api/BraintreeError;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d implements Parcelable.Creator<BraintreeError> {
        d() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BraintreeError createFromParcel(Parcel parcel) {
            zcp.c(parcel, "");
            return new BraintreeError(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public BraintreeError[] newArray(int i) {
            return new BraintreeError[i];
        }
    }

    @JvmStatic
    public static final List<BraintreeError> fromGraphQLJsonArray(JSONArray jSONArray) {
        return INSTANCE.c(jSONArray);
    }
}

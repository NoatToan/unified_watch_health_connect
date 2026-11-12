package com.huawei.hms.support.account.request;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.feature.request.AbstractAuthParams;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AccountAuthParams extends AbstractAuthParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16474b;
    public static final AccountAuthParams DEFAULT_AUTH_REQUEST_PARAM = new AccountAuthParamsHelper().setId().setProfile().createParams();
    public static final AccountAuthParams DEFAULT_AUTH_REQUEST_PARAM_GAME = new AccountAuthParamsHelper().setScope(SCOPE_GAMES).createParams();
    public static final Parcelable.Creator<AccountAuthParams> CREATOR = new Parcelable.Creator<AccountAuthParams>() { // from class: com.huawei.hms.support.account.request.AccountAuthParams.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountAuthParams createFromParcel(Parcel parcel) {
            return new AccountAuthParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountAuthParams[] newArray(int i) {
            return new AccountAuthParams[i];
        }
    };

    protected AccountAuthParams(Set<Scope> set, Set<PermissionInfo> set2) {
        this((ArrayList<Scope>) new ArrayList(set), (ArrayList<PermissionInfo>) new ArrayList(set2));
    }

    protected AccountAuthParams(Set<Scope> set, Set<PermissionInfo> set2, String str) {
        this((ArrayList<Scope>) new ArrayList(set), (ArrayList<PermissionInfo>) new ArrayList(set2));
        this.f16473a = str;
    }

    protected AccountAuthParams(ArrayList<Scope> arrayList, ArrayList<PermissionInfo> arrayList2) {
        super(arrayList, arrayList2);
        this.f16473a = "";
    }

    protected AccountAuthParams(ArrayList<Scope> arrayList, ArrayList<PermissionInfo> arrayList2, String str) {
        super(arrayList, arrayList2);
        this.f16473a = str;
    }

    private AccountAuthParams(Parcel parcel) {
        super((ArrayList<Scope>) parcel.createTypedArrayList(Scope.CREATOR), (ArrayList<PermissionInfo>) parcel.createTypedArrayList(PermissionInfo.CREATOR));
        this.f16473a = "";
        this.f16473a = parcel.readString();
    }

    @Override // com.huawei.hms.support.feature.request.AbstractAuthParams
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAuthParams)) {
            return false;
        }
        AccountAuthParams accountAuthParams = (AccountAuthParams) obj;
        return isListEquals(this.scopeArrayList, accountAuthParams.scopeArrayList) && isListEquals(this.permissionArrayList, accountAuthParams.permissionArrayList);
    }

    @Override // com.huawei.hms.support.feature.request.AbstractAuthParams
    public int hashCode() {
        return (((this.scopeArrayList == null ? 0 : this.scopeArrayList.hashCode()) + 31) * 31) + (this.permissionArrayList != null ? this.permissionArrayList.hashCode() : 0);
    }

    public static AccountAuthParams fromJson(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return fromJsonObject(new JSONObject(str));
    }

    public static AccountAuthParams fromJsonObject(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(AuthInternalPickerConstant.SignInReqKey.SCOP_ARRAYLIST);
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jsonToScope(jSONArray.getJSONObject(i)));
            }
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(AuthInternalPickerConstant.SignInReqKey.PERMISSION_ARRAYLIST);
        ArrayList arrayList2 = new ArrayList();
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(jsonToPermission(jSONArray2.getJSONObject(i2)));
            }
        }
        String strOptString = jSONObject.optString("signInParams");
        AccountAuthParams accountAuthParams = new AccountAuthParams((ArrayList<Scope>) arrayList, (ArrayList<PermissionInfo>) arrayList2);
        accountAuthParams.setSignInParams(strOptString);
        return accountAuthParams;
    }

    @Override // com.huawei.hms.support.feature.request.AbstractAuthParams
    public JSONObject toJsonObject() throws JSONException {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("signInParams", this.f16473a);
        return jsonObject;
    }

    public void setSignInParams(String str) {
        this.f16473a = str;
    }

    public String getSignInParams() {
        return this.f16473a;
    }

    public int getIdTokenSignAlg() {
        return this.f16474b;
    }

    public void setIdTokenSignAlg(int i) {
        this.f16474b = i;
    }
}

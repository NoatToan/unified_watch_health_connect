package com.service.mi.wallet.entity.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.service.mi.wallet.entity.AuthenticationMethod;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AuthenticationMethodsResp extends BaseWalletResponse implements Parcelable {
    public static final Parcelable.Creator<AuthenticationMethodsResp> CREATOR = new Parcelable.Creator<AuthenticationMethodsResp>() { // from class: com.service.mi.wallet.entity.resp.AuthenticationMethodsResp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationMethodsResp createFromParcel(Parcel parcel) {
            return new AuthenticationMethodsResp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthenticationMethodsResp[] newArray(int i) {
            return new AuthenticationMethodsResp[i];
        }
    };
    private List<AuthenticationMethod> authenticationMethods;

    public AuthenticationMethodsResp(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<AuthenticationMethod> getAuthenticationMethods() {
        return this.authenticationMethods;
    }

    public void setAuthenticationMethods(List<AuthenticationMethod> list) {
        this.authenticationMethods = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public AuthenticationMethodsResp(Parcel parcel) {
    }
}

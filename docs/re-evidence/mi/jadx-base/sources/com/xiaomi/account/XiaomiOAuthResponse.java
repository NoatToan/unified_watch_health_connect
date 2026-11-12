package com.xiaomi.account;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;

/* JADX INFO: loaded from: classes6.dex */
public class XiaomiOAuthResponse implements Parcelable {
    public static final Parcelable.Creator<XiaomiOAuthResponse> CREATOR = new Parcelable.Creator<XiaomiOAuthResponse>() { // from class: com.xiaomi.account.XiaomiOAuthResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public XiaomiOAuthResponse createFromParcel(Parcel parcel) {
            return new XiaomiOAuthResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public XiaomiOAuthResponse[] newArray(int i) {
            return new XiaomiOAuthResponse[i];
        }
    };
    private static final String TAG = "com.xiaomi.account.XiaomiOAuthResponse";
    private IXiaomiAuthResponse mResponse;

    public XiaomiOAuthResponse(IXiaomiAuthResponse iXiaomiAuthResponse) {
        this.mResponse = iXiaomiAuthResponse;
    }

    public static void setIXiaomiAuthResponseCancel(IXiaomiAuthResponse iXiaomiAuthResponse) {
        if (iXiaomiAuthResponse == null) {
            return;
        }
        try {
            iXiaomiAuthResponse.onCancel();
        } catch (RemoteException | RuntimeException unused) {
        }
    }

    public static void setIXiaomiAuthResponseResult(IXiaomiAuthResponse iXiaomiAuthResponse, Bundle bundle) {
        if (iXiaomiAuthResponse != null) {
            try {
                if (bundle == null) {
                    return;
                }
                try {
                    iXiaomiAuthResponse.onResult(bundle);
                } catch (RuntimeException e) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(XiaomiOAuthConstants.EXTRA_ERROR_CODE, -1);
                    bundle2.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION, e.getMessage());
                    iXiaomiAuthResponse.onResult(bundle2);
                }
            } catch (RemoteException | RuntimeException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onCancel() {
        setIXiaomiAuthResponseCancel(this.mResponse);
    }

    public void onError(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(XiaomiOAuthConstants.EXTRA_ERROR_CODE, i);
        bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION, str);
        setIXiaomiAuthResponseResult(this.mResponse, bundle);
    }

    public void onResult(Bundle bundle) {
        setIXiaomiAuthResponseResult(this.mResponse, bundle);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.mResponse.asBinder());
    }

    public XiaomiOAuthResponse(Parcel parcel) {
        this.mResponse = IXiaomiAuthResponse.Stub.asInterface(parcel.readStrongBinder());
    }
}

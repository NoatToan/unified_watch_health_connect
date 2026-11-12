package com.miui.tsmclientsdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class MiTsmResponseParcelable implements Parcelable {
    public static final Parcelable.Creator<MiTsmResponseParcelable> CREATOR = new Parcelable.Creator<MiTsmResponseParcelable>() { // from class: com.miui.tsmclientsdk.MiTsmResponseParcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiTsmResponseParcelable createFromParcel(Parcel parcel) {
            return new MiTsmResponseParcelable(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MiTsmResponseParcelable[] newArray(int i) {
            return new MiTsmResponseParcelable[i];
        }
    };
    private static final String TAG = "MiTsmResponseParcelable";
    private IMiTsmResponse mResponse;

    private void logE(String str, Exception exc) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onError(int i, String str) {
        IMiTsmResponse iMiTsmResponse = this.mResponse;
        if (iMiTsmResponse == null || !iMiTsmResponse.asBinder().isBinderAlive()) {
            return;
        }
        try {
            this.mResponse.onError(i, str);
        } catch (Exception e) {
            logE("onError", e);
        }
    }

    public void onProgress(int i) {
        IMiTsmResponse iMiTsmResponse = this.mResponse;
        if (iMiTsmResponse == null || !iMiTsmResponse.asBinder().isBinderAlive()) {
            return;
        }
        try {
            this.mResponse.onProgress(i);
        } catch (Exception e) {
            logE("onProgress", e);
        }
    }

    public void onResult(Bundle bundle) {
        IMiTsmResponse iMiTsmResponse = this.mResponse;
        if (iMiTsmResponse == null || !iMiTsmResponse.asBinder().isBinderAlive()) {
            return;
        }
        try {
            this.mResponse.onResult(bundle);
        } catch (Exception e) {
            logE("onResult", e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.mResponse.asBinder());
    }

    public MiTsmResponseParcelable(IMiTsmResponse iMiTsmResponse) {
        this.mResponse = iMiTsmResponse;
    }

    private MiTsmResponseParcelable(Parcel parcel) {
        this.mResponse = IMiTsmResponse.Stub.asInterface(parcel.readStrongBinder());
    }
}

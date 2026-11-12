package com.miui.tsmclient.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.miui.tsmclient.service.IServiceResponse;

/* JADX INFO: loaded from: classes6.dex */
public class ServiceResponseParcelable implements Parcelable {
    public static final Parcelable.Creator<ServiceResponseParcelable> CREATOR = new Parcelable.Creator<ServiceResponseParcelable>() { // from class: com.miui.tsmclient.entity.ServiceResponseParcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServiceResponseParcelable createFromParcel(Parcel parcel) {
            return new ServiceResponseParcelable(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ServiceResponseParcelable[] newArray(int i) {
            return new ServiceResponseParcelable[i];
        }
    };
    private IServiceResponse mResponse;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void onError(int i, String str) {
        IServiceResponse iServiceResponse = this.mResponse;
        if (iServiceResponse == null) {
            return;
        }
        try {
            iServiceResponse.onError(i, str);
        } catch (RemoteException unused) {
        }
    }

    public void onProgress(int i) {
        IServiceResponse iServiceResponse = this.mResponse;
        if (iServiceResponse == null) {
            return;
        }
        try {
            iServiceResponse.onProgress(i);
        } catch (RemoteException unused) {
        }
    }

    public void onResult(Bundle bundle) {
        IServiceResponse iServiceResponse = this.mResponse;
        if (iServiceResponse == null) {
            return;
        }
        try {
            iServiceResponse.onResult(bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.mResponse.asBinder());
    }

    public ServiceResponseParcelable(IServiceResponse iServiceResponse) {
        this.mResponse = iServiceResponse;
    }

    private ServiceResponseParcelable(Parcel parcel) {
        this.mResponse = IServiceResponse.Stub.asInterface(parcel.readStrongBinder());
    }
}

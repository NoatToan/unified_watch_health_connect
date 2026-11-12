package com.amazon.identity.auth.device.interactive;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class InteractiveRequestRecord implements Parcelable {
    public static final Parcelable.Creator<InteractiveRequestRecord> CREATOR = new Parcelable.Creator<InteractiveRequestRecord>() { // from class: com.amazon.identity.auth.device.interactive.InteractiveRequestRecord.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InteractiveRequestRecord createFromParcel(Parcel parcel) {
            return new InteractiveRequestRecord(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InteractiveRequestRecord[] newArray(int i) {
            return new InteractiveRequestRecord[i];
        }
    };
    private Bundle fragmentWrapper;
    private final Bundle requestExtras;
    private final String requestId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InteractiveRequestRecord.class != obj.getClass()) {
            return false;
        }
        InteractiveRequestRecord interactiveRequestRecord = (InteractiveRequestRecord) obj;
        Bundle bundle = this.fragmentWrapper;
        if (bundle == null) {
            if (interactiveRequestRecord.fragmentWrapper != null) {
                return false;
            }
        } else if (!bundle.equals(interactiveRequestRecord.fragmentWrapper)) {
            return false;
        }
        Bundle bundle2 = this.requestExtras;
        if (bundle2 == null) {
            if (interactiveRequestRecord.requestExtras != null) {
                return false;
            }
        } else if (!bundle2.equals(interactiveRequestRecord.requestExtras)) {
            return false;
        }
        String str = this.requestId;
        if (str == null) {
            if (interactiveRequestRecord.requestId != null) {
                return false;
            }
        } else if (!str.equals(interactiveRequestRecord.requestId)) {
            return false;
        }
        return true;
    }

    public Bundle getFragmentWrapper() {
        return this.fragmentWrapper;
    }

    public Bundle getRequestExtras() {
        return this.requestExtras;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        Bundle bundle = this.fragmentWrapper;
        int iHashCode = ((bundle == null ? 0 : bundle.hashCode()) + 31) * 31;
        Bundle bundle2 = this.requestExtras;
        int iHashCode2 = (iHashCode + (bundle2 == null ? 0 : bundle2.hashCode())) * 31;
        String str = this.requestId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public void setFragmentWrapper(Bundle bundle) {
        this.fragmentWrapper = bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" id=");
        sb.append(this.requestId);
        sb.append(" hasFragment=");
        sb.append(this.fragmentWrapper != null);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.requestId);
        parcel.writeBundle(this.requestExtras);
        parcel.writeBundle(this.fragmentWrapper);
    }

    public InteractiveRequestRecord(String str, Bundle bundle) {
        this.requestId = str;
        this.requestExtras = bundle;
    }

    @SuppressLint({"ParcelClassLoader"})
    private InteractiveRequestRecord(Parcel parcel) {
        this.requestId = parcel.readString();
        this.requestExtras = parcel.readBundle();
        this.fragmentWrapper = parcel.readBundle();
    }
}

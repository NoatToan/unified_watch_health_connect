package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.utils.IwdsAssert;

/* JADX INFO: loaded from: classes18.dex */
public class TimeAdditionalInfo implements Parcelable {
    public static final Parcelable.Creator<TimeAdditionalInfo> CREATOR = new Parcelable.Creator<TimeAdditionalInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.TimeAdditionalInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeAdditionalInfo createFromParcel(Parcel parcel) {
            TimeAdditionalInfo timeAdditionalInfo = new TimeAdditionalInfo();
            timeAdditionalInfo.sunrise = parcel.readString();
            timeAdditionalInfo.sunset = parcel.readString();
            return timeAdditionalInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeAdditionalInfo[] newArray(int i) {
            return new TimeAdditionalInfo[i];
        }
    };
    public String sunrise;
    public String sunset;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "TimeAdditionalInfo [sunrise = " + this.sunrise + " sunset = " + this.sunset + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sunrise);
        parcel.writeString(this.sunset);
    }

    public TimeAdditionalInfo(String str, String str2) {
        IwdsAssert.dieIf(this, str == null, "sunrise is null.");
        IwdsAssert.dieIf(this, str2 == null, "sunset is null.");
        this.sunrise = str;
        this.sunset = str2;
    }

    private TimeAdditionalInfo() {
    }
}

package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public class SptcCardInfo extends FmshCardInfo {
    public static final Parcelable.Creator<SptcCardInfo> CREATOR = new Parcelable.Creator<SptcCardInfo>() { // from class: com.miui.tsmclient.entity.SptcCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SptcCardInfo createFromParcel(Parcel parcel) {
            SptcCardInfo sptcCardInfo = new SptcCardInfo(null);
            sptcCardInfo.readFromParcel(parcel);
            return sptcCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SptcCardInfo[] newArray(int i) {
            return new SptcCardInfo[i];
        }
    };

    public SptcCardInfo(String str) {
        super(str);
    }
}

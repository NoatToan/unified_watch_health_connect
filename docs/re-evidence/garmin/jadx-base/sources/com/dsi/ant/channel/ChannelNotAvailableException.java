package com.dsi.ant.channel;

import android.os.Parcel;
import android.os.Parcelable;
import wj.g;

/* JADX INFO: loaded from: classes7.dex */
public final class ChannelNotAvailableException extends Exception implements Parcelable {
    public static final Parcelable.Creator<ChannelNotAvailableException> CREATOR = new a();
    private static final long serialVersionUID = -2385032501709296766L;
    public final g reasonCode;

    public static class a implements Parcelable.Creator<ChannelNotAvailableException> {
        @Override // android.os.Parcelable.Creator
        public final ChannelNotAvailableException createFromParcel(Parcel parcel) {
            return new ChannelNotAvailableException(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelNotAvailableException[] newArray(int i14) {
            return new ChannelNotAvailableException[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ChannelNotAvailableException(Parcel parcel) {
        int i14 = parcel.readInt();
        g gVar = g.UNKNOWN;
        int i15 = 0;
        while (true) {
            g[] gVarArr = g.f185760d;
            if (i15 >= gVarArr.length) {
                break;
            }
            g gVar2 = gVarArr[i15];
            if (i14 == gVar2.f185762a) {
                gVar = gVar2;
                break;
            }
            i15++;
        }
        this(gVar, parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.reasonCode.f185762a);
        parcel.writeString(getMessage());
    }

    public ChannelNotAvailableException(g gVar) {
        super("Could not acquire channel. Reason = " + gVar);
        this.reasonCode = gVar;
    }

    public ChannelNotAvailableException(g gVar, String str) {
        super(str);
        this.reasonCode = gVar;
    }

    public /* synthetic */ ChannelNotAvailableException(Parcel parcel, a aVar) {
        this(parcel);
    }
}

package com.xiaomi.continuity.messagecenter;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MessageOptions implements Parcelable {
    public static final Parcelable.Creator<MessageOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11188b;
    public List<String> c;

    public class a implements Parcelable.Creator<MessageOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageOptions createFromParcel(Parcel parcel) {
            return new MessageOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageOptions[] newArray(int i) {
            return new MessageOptions[i];
        }
    }

    public MessageOptions() {
    }

    public MessageOptions(Parcel parcel) {
        this.f11187a = parcel.readInt();
        this.f11188b = parcel.readInt();
        this.c = (List) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11187a);
        parcel.writeInt(this.f11188b);
        parcel.writeSerializable((Serializable) this.c);
    }
}

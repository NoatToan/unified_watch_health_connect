package com.xiaomi.continuity.messagecenter;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h64;
import defpackage.mkh;

/* JADX INFO: loaded from: classes7.dex */
public class TopicConfig implements Parcelable {
    public static final Parcelable.Creator<TopicConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11191a;

    public class a implements Parcelable.Creator<TopicConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TopicConfig createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            int iDataPosition = parcel.dataPosition();
            TopicConfig topicConfig = new TopicConfig(parcel, parcel.readInt());
            parcel.setDataPosition(iDataPosition + i);
            return topicConfig;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TopicConfig[] newArray(int i) {
            return new TopicConfig[i];
        }
    }

    public TopicConfig(Parcel parcel, int i) {
        this.f11191a = parcel.readString();
    }

    public final /* synthetic */ void c(Parcel parcel, int i) {
        parcel.writeInt(0);
        parcel.writeString(this.f11191a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        mkh.a(parcel, i, new h64() { // from class: pjp
            @Override // defpackage.h64
            public final void a(Parcel parcel2, int i2) {
                this.f30473a.c(parcel2, i2);
            }
        });
    }
}

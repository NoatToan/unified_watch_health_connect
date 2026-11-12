package com.google.android.clockwork.companion.partnerapi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EcoAppNotificationConfig implements Parcelable {
    public static final Parcelable.Creator<EcoAppNotificationConfig> CREATOR = new a();

    public class a implements Parcelable.Creator<EcoAppNotificationConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EcoAppNotificationConfig createFromParcel(Parcel parcel) {
            return EcoAppNotificationConfig.f().e(parcel.readString()).b(parcel.readString()).c(parcel.readInt() == 1).d(parcel.readInt()).a();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EcoAppNotificationConfig[] newArray(int i) {
            return new EcoAppNotificationConfig[i];
        }
    }

    public static abstract class b {
        public abstract EcoAppNotificationConfig a();

        public abstract b b(String str);

        public abstract b c(boolean z);

        public abstract b d(int i);

        public abstract b e(String str);
    }

    public static b f() {
        return new AutoValue_EcoAppNotificationConfig.a().c(false).b("");
    }

    public abstract String a();

    public abstract boolean c();

    public abstract int d();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(e());
        parcel.writeString(a());
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(d());
    }
}

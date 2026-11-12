package com.garmin.android.apps.connectmobile.smartscale.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/model/a;", "Landroid/os/Parcelable;", "", "reasonCode", "", "reasonMessage", "<init>", "(ILjava/lang/String;)V", "a", "I", "getReasonCode", "()I", "setReasonCode", "(I)V", "b", "Ljava/lang/String;", "getReasonMessage", "()Ljava/lang/String;", "setReasonMessage", "(Ljava/lang/String;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0837a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reasonCode")
    private int reasonCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reasonMessage")
    private String reasonMessage;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.smartscale.model.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0837a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(int i14, String str, int i15, j jVar) {
        this(i14, (i15 & 2) != 0 ? null : str);
    }

    public final b b() {
        b.C0838a c0838a = b.f44421b;
        int i14 = this.reasonCode;
        c0838a.getClass();
        b bVar = b.f44422c.get(i14);
        bVar.getClass();
        return bVar;
    }

    public final boolean d() {
        return this.reasonCode == WeightScaleServiceResponseDTO.b.DUPLICATE_SHORT_NAME.f44405a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.reasonCode == aVar.reasonCode && s.g(this.reasonMessage, aVar.reasonMessage);
    }

    public final boolean f() {
        return this.reasonCode == WeightScaleServiceResponseDTO.b.SUCCESS.f44405a;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.reasonCode) * 31;
        String str = this.reasonMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return o2.c.e(this.reasonCode, "CodedResponseDTO(reasonCode=", ", reasonMessage=", this.reasonMessage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.reasonCode);
        parcel.writeString(this.reasonMessage);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/model/a$b;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        SUCCESS(0),
        /* JADX INFO: Fake field, exist only in values array */
        ERROR_PARAMETER_FORMAT(1),
        /* JADX INFO: Fake field, exist only in values array */
        DUPLICATE_SHORT_NAME(2),
        REACH_DEVICE_MAX_USER_NUMBER(3),
        /* JADX INFO: Fake field, exist only in values array */
        USER_CONNECTION_ERROR(4),
        /* JADX INFO: Fake field, exist only in values array */
        SERIAL_NUMBER_ERROR(5),
        /* JADX INFO: Fake field, exist only in values array */
        DEVICE_REGISTRATION_ERROR(6),
        /* JADX INFO: Fake field, exist only in values array */
        FAIL_TO_REMOVE_USER(7),
        /* JADX INFO: Fake field, exist only in values array */
        INVALID_INVITATION(10),
        /* JADX INFO: Fake field, exist only in values array */
        DEVICE_REGISTRATION_NOT_ALLOWED(13),
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN_REASON(999);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0838a f44421b = new C0838a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SparseArray<b> f44422c = new SparseArray<>(WeightScaleServiceResponseDTO.b.values().length);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44426a;

        static {
            for (b bVar : values()) {
                f44422c.put(bVar.f44426a, bVar);
            }
        }

        b(int i14) {
            this.f44426a = i14;
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.smartscale.model.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/smartscale/model/a$b$a;", "", "<init>", "()V", "Landroid/util/SparseArray;", "Lcom/garmin/android/apps/connectmobile/smartscale/model/a$b;", "lookupByValue", "Landroid/util/SparseArray;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0838a {
            public /* synthetic */ C0838a(j jVar) {
                this();
            }

            private C0838a() {
            }
        }
    }

    public a(int i14, String str) {
        this.reasonCode = i14;
        this.reasonMessage = str;
    }
}

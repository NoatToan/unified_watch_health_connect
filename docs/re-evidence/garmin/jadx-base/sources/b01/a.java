package b01;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lb01/a;", "", "<init>", "()V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14162a = new a();

    /* JADX INFO: renamed from: b01.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lb01/a$a;", "Landroid/os/Parcelable;", "", "partnerName", "interaction", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getPartnerName", "()Ljava/lang/String;", "b", "getInteraction", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0198a implements Parcelable {
        public static final Parcelable.Creator<C0198a> CREATOR = new C0199a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("partnerName")
        private final String partnerName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("interaction")
        private final String interaction;

        /* JADX INFO: renamed from: b01.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0199a implements Parcelable.Creator<C0198a> {
            @Override // android.os.Parcelable.Creator
            public final C0198a createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new C0198a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final C0198a[] newArray(int i14) {
                return new C0198a[i14];
            }
        }

        public C0198a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.partnerName = str;
            this.interaction = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0198a)) {
                return false;
            }
            C0198a c0198a = (C0198a) obj;
            return s.g(this.partnerName, c0198a.partnerName) && s.g(this.interaction, c0198a.interaction);
        }

        public final int hashCode() {
            return this.interaction.hashCode() + (this.partnerName.hashCode() * 31);
        }

        public final String toString() {
            return e0.g("PartnerOnboardingEvent(partnerName=", this.partnerName, ", interaction=", this.interaction, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.partnerName);
            parcel.writeString(this.interaction);
        }
    }

    private a() {
    }
}

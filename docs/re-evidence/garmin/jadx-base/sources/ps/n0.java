package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lps/n0;", "Landroid/os/Parcelable;", "", "eBikeAssistMode", "", "eBikeAssistModeName", "<init>", "(ILjava/lang/String;)V", "a", "I", "b", "()I", "f", "(I)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ebikeAssistMode")
    private int eBikeAssistMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ebikeAssistModeName")
    private String eBikeAssistModeName;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n0> {
        @Override // android.os.Parcelable.Creator
        public final n0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n0(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final n0[] newArray(int i14) {
            return new n0[i14];
        }
    }

    public /* synthetic */ n0(int i14, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getEBikeAssistMode() {
        return this.eBikeAssistMode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEBikeAssistModeName() {
        return this.eBikeAssistModeName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.eBikeAssistMode == n0Var.eBikeAssistMode && p005kotlin.jvm.internal.s.g(this.eBikeAssistModeName, n0Var.eBikeAssistModeName);
    }

    public final void f(int i14) {
        this.eBikeAssistMode = i14;
    }

    public final void g(String str) {
        str.getClass();
        this.eBikeAssistModeName = str;
    }

    public final int hashCode() {
        return this.eBikeAssistModeName.hashCode() + (Integer.hashCode(this.eBikeAssistMode) * 31);
    }

    public final String toString() {
        return o2.c.e(this.eBikeAssistMode, "EBikeAssistModeInfoDTO(eBikeAssistMode=", ", eBikeAssistModeName=", this.eBikeAssistModeName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.eBikeAssistMode);
        parcel.writeString(this.eBikeAssistModeName);
    }

    public n0(int i14, String str) {
        str.getClass();
        this.eBikeAssistMode = i14;
        this.eBikeAssistModeName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}

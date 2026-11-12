package ep2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lep2/j;", "Landroid/os/Parcelable;", "Lep2/k;", "fitPayEcomTokenDTO", "fitPayNfcTokenDTO", "<init>", "(Lep2/k;Lep2/k;)V", "a", "Lep2/k;", "b", "()Lep2/k;", "setFitPayEcomTokenDTO", "(Lep2/k;)V", "d", "setFitPayNfcTokenDTO", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ecom")
    private k fitPayEcomTokenDTO;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nfc")
    private k fitPayNfcTokenDTO;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? k.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(k kVar, k kVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : kVar, (i14 & 2) != 0 ? null : kVar2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getFitPayEcomTokenDTO() {
        return this.fitPayEcomTokenDTO;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getFitPayNfcTokenDTO() {
        return this.fitPayNfcTokenDTO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.fitPayEcomTokenDTO, jVar.fitPayEcomTokenDTO) && s.g(this.fitPayNfcTokenDTO, jVar.fitPayNfcTokenDTO);
    }

    public final int hashCode() {
        k kVar = this.fitPayEcomTokenDTO;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        k kVar2 = this.fitPayNfcTokenDTO;
        return iHashCode + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    public final String toString() {
        return "FitPayTemplatesDTO(fitPayEcomTokenDTO=" + this.fitPayEcomTokenDTO + ", fitPayNfcTokenDTO=" + this.fitPayNfcTokenDTO + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        k kVar = this.fitPayEcomTokenDTO;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
        k kVar2 = this.fitPayNfcTokenDTO;
        if (kVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar2.writeToParcel(parcel, i14);
        }
    }

    public j(k kVar, k kVar2) {
        this.fitPayEcomTokenDTO = kVar;
        this.fitPayNfcTokenDTO = kVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

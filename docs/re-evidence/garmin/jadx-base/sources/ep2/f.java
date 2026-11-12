package ep2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import fo2.m0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lep2/f;", "Landroid/os/Parcelable;", "Lfo2/m0;", "links", "Lep2/j;", "fitPayTemplatesDTO", "<init>", "(Lfo2/m0;Lep2/j;)V", "a", "Lfo2/m0;", "d", "()Lfo2/m0;", "setLinks", "(Lfo2/m0;)V", "b", "Lep2/j;", "()Lep2/j;", "setFitPayTemplatesDTO", "(Lep2/j;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private m0 links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_templates")
    private j fitPayTemplatesDTO;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readInt() == 0 ? null : m0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? j.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(m0 m0Var, j jVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : m0Var, (i14 & 2) != 0 ? null : jVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final j getFitPayTemplatesDTO() {
        return this.fitPayTemplatesDTO;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m0 getLinks() {
        return this.links;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.links, fVar.links) && s.g(this.fitPayTemplatesDTO, fVar.fitPayTemplatesDTO);
    }

    public final int hashCode() {
        m0 m0Var = this.links;
        int iHashCode = (m0Var == null ? 0 : m0Var.hashCode()) * 31;
        j jVar = this.fitPayTemplatesDTO;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "FitPayFieldPropertiesForVerificationDTO(links=" + this.links + ", fitPayTemplatesDTO=" + this.fitPayTemplatesDTO + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        m0 m0Var = this.links;
        if (m0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m0Var.writeToParcel(parcel, i14);
        }
        j jVar = this.fitPayTemplatesDTO;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
    }

    public f(m0 m0Var, j jVar) {
        this.links = m0Var;
        this.fitPayTemplatesDTO = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

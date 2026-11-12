package gj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lgj1/f;", "Landroid/os/Parcelable;", "Lgj1/d;", "primaryTrainingDeviceDTO", "", "Lgj1/a;", "registeredDevices", "Lgj1/i;", "wearableDevices", "Lgj1/e;", "primaryTrainingDevices", "Lgj1/g;", "trainingStatusOnlyDevices", "<init>", "(Lgj1/d;Ljava/util/List;Lgj1/i;Lgj1/e;Lgj1/g;)V", "a", "Lgj1/d;", "b", "()Lgj1/d;", "setPrimaryTrainingDeviceDTO", "(Lgj1/d;)V", "Ljava/util/List;", "f", "()Ljava/util/List;", "setRegisteredDevices", "(Ljava/util/List;)V", "c", "Lgj1/i;", "h", "()Lgj1/i;", "setWearableDevices", "(Lgj1/i;)V", "d", "Lgj1/e;", "()Lgj1/e;", "setPrimaryTrainingDevices", "(Lgj1/e;)V", JWKParameterNames.RSA_EXPONENT, "Lgj1/g;", "g", "()Lgj1/g;", "setTrainingStatusOnlyDevices", "(Lgj1/g;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PrimaryTrainingDevice")
    private d primaryTrainingDeviceDTO;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("RegisteredDevices")
    private List<gj1.a> registeredDevices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("WearableDevices")
    private i wearableDevices;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("PrimaryTrainingDevices")
    private e primaryTrainingDevices;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TrainingStatusOnlyDevices")
    private g trainingStatusOnlyDevices;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            d dVarCreateFromParcel = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(gj1.a.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new f(dVarCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? g.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(d dVar, List list, i iVar, e eVar, g gVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : iVar, (i14 & 8) != 0 ? null : eVar, (i14 & 16) != 0 ? null : gVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getPrimaryTrainingDeviceDTO() {
        return this.primaryTrainingDeviceDTO;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getPrimaryTrainingDevices() {
        return this.primaryTrainingDevices;
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
        return s.g(this.primaryTrainingDeviceDTO, fVar.primaryTrainingDeviceDTO) && s.g(this.registeredDevices, fVar.registeredDevices) && s.g(this.wearableDevices, fVar.wearableDevices) && s.g(this.primaryTrainingDevices, fVar.primaryTrainingDevices) && s.g(this.trainingStatusOnlyDevices, fVar.trainingStatusOnlyDevices);
    }

    public final List<gj1.a> f() {
        return this.registeredDevices;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getTrainingStatusOnlyDevices() {
        return this.trainingStatusOnlyDevices;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final i getWearableDevices() {
        return this.wearableDevices;
    }

    public final int hashCode() {
        d dVar = this.primaryTrainingDeviceDTO;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        List<gj1.a> list = this.registeredDevices;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        i iVar = this.wearableDevices;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        e eVar = this.primaryTrainingDevices;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g gVar = this.trainingStatusOnlyDevices;
        return iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "RegisteredDevicesDTO(primaryTrainingDeviceDTO=" + this.primaryTrainingDeviceDTO + ", registeredDevices=" + this.registeredDevices + ", wearableDevices=" + this.wearableDevices + ", primaryTrainingDevices=" + this.primaryTrainingDevices + ", trainingStatusOnlyDevices=" + this.trainingStatusOnlyDevices + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        d dVar = this.primaryTrainingDeviceDTO;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        List<gj1.a> list = this.registeredDevices;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((gj1.a) itO.next()).writeToParcel(parcel, i14);
            }
        }
        i iVar = this.wearableDevices;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        e eVar = this.primaryTrainingDevices;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        g gVar = this.trainingStatusOnlyDevices;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, i14);
        }
    }

    public f(d dVar, List<gj1.a> list, i iVar, e eVar, g gVar) {
        this.primaryTrainingDeviceDTO = dVar;
        this.registeredDevices = list;
        this.wearableDevices = iVar;
        this.primaryTrainingDevices = eVar;
        this.trainingStatusOnlyDevices = gVar;
    }

    public f() {
        this(null, null, null, null, null, 31, null);
    }
}

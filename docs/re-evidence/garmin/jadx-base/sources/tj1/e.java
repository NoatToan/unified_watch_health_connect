package tj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ltj1/e;", "Landroid/os/Parcelable;", "", "assistancePlusEnabled", "Ll20/r;", "userContactsDTO", "<init>", "(Ljava/lang/Boolean;Ll20/r;)V", "a", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "b", "Ll20/r;", "f", "()Ll20/r;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("assistancePlusEnabled")
    private final Boolean assistancePlusEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userContactsDTO")
    private final l20.r userContactsDTO;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new e(boolValueOf, parcel.readInt() != 0 ? l20.r.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(Boolean bool, l20.r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : rVar);
    }

    public static e b(e eVar, Boolean bool, l20.r rVar, int i14) {
        if ((i14 & 1) != 0) {
            bool = eVar.assistancePlusEnabled;
        }
        if ((i14 & 2) != 0) {
            rVar = eVar.userContactsDTO;
        }
        eVar.getClass();
        return new e(bool, rVar);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getAssistancePlusEnabled() {
        return this.assistancePlusEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.assistancePlusEnabled, eVar.assistancePlusEnabled) && p005kotlin.jvm.internal.s.g(this.userContactsDTO, eVar.userContactsDTO);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l20.r getUserContactsDTO() {
        return this.userContactsDTO;
    }

    public final int hashCode() {
        Boolean bool = this.assistancePlusEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        l20.r rVar = this.userContactsDTO;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        return "ECCContactDTO(assistancePlusEnabled=" + this.assistancePlusEnabled + ", userContactsDTO=" + this.userContactsDTO + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Boolean bool = this.assistancePlusEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        l20.r rVar = this.userContactsDTO;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
    }

    public e(Boolean bool, l20.r rVar) {
        this.assistancePlusEnabled = bool;
        this.userContactsDTO = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

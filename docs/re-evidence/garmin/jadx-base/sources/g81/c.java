package g81;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg81/c;", "Landroid/os/Parcelable;", "Lg81/p;", "enduranceScoreState", "Lg81/f;", "runningStaminaState", "cyclingStaminaState", "Li53/c;", "Lc22/c3;", "tabTitles", "<init>", "(Lg81/p;Lg81/f;Lg81/f;Li53/c;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f76283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f76284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f76285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<c3> f76286d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            p pVarCreateFromParcel = parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel);
            f fVarCreateFromParcel = parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel);
            f fVarCreateFromParcel2 = parcel.readInt() != 0 ? f.CREATOR.createFromParcel(parcel) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD = 0;
            while (iD != i14) {
                iD = u0.d(c.class, parcel, arrayList, iD, 1);
            }
            return new c(pVarCreateFromParcel, fVarCreateFromParcel, fVarCreateFromParcel2, i53.a.j(arrayList));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, f fVar, f fVar2, i53.c<? extends c3> cVar) {
        cVar.getClass();
        this.f76283a = pVar;
        this.f76284b = fVar;
        this.f76285c = fVar2;
        this.f76286d = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f76283a, cVar.f76283a) && p005kotlin.jvm.internal.s.g(this.f76284b, cVar.f76284b) && p005kotlin.jvm.internal.s.g(this.f76285c, cVar.f76285c) && this.f76286d.equals(cVar.f76286d);
    }

    public final int hashCode() {
        p pVar = this.f76283a;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        f fVar = this.f76284b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.f76285c;
        return this.f76286d.hashCode() + ((iHashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DailyEnduranceStaminaUiState(enduranceScoreState=" + this.f76283a + ", runningStaminaState=" + this.f76284b + ", cyclingStaminaState=" + this.f76285c + ", tabTitles=" + this.f76286d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        p pVar = this.f76283a;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i14);
        }
        f fVar = this.f76284b;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        f fVar2 = this.f76285c;
        if (fVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar2.writeToParcel(parcel, i14);
        }
        Iterator itG = j20.x.g(this.f76286d, parcel);
        while (itG.hasNext()) {
            parcel.writeParcelable((Parcelable) itG.next(), i14);
        }
    }
}

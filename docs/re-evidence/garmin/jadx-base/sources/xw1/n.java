package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import zf0.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lxw1/n;", "Landroid/os/Parcelable;", "Lzf0/y0;", "eventFlowType", "Lfg0/k;", "eventDTO", "Lfg0/p;", "eventSearchResultDTO", "", "isFromEventDelete", "<init>", "(Lzf0/y0;Lfg0/k;Lfg0/p;Z)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f192425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg0.k f192426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg0.p f192427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f192428d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readInt() == 0 ? null : y0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : fg0.k.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? fg0.p.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(y0 y0Var, fg0.k kVar, fg0.p pVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : y0Var, (i14 & 2) != 0 ? null : kVar, (i14 & 4) != 0 ? null : pVar, (i14 & 8) != 0 ? false : z14);
    }

    public static n b(n nVar, y0 y0Var, fg0.k kVar, fg0.p pVar, int i14) {
        if ((i14 & 1) != 0) {
            y0Var = nVar.f192425a;
        }
        if ((i14 & 2) != 0) {
            kVar = nVar.f192426b;
        }
        if ((i14 & 4) != 0) {
            pVar = nVar.f192427c;
        }
        return new n(y0Var, kVar, pVar, nVar.f192428d);
    }

    public final k d() {
        String strR;
        String shareableEventUuid = null;
        fg0.k kVar = this.f192426b;
        String strValueOf = String.valueOf(kVar != null ? kVar.getDate() : null);
        String registrationUrl = kVar != null ? kVar.getRegistrationUrl() : null;
        if (kVar != null) {
            Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
            strR = kVar.r(false);
        } else {
            strR = null;
        }
        Long l14 = (kVar == null || !kVar.n0()) ? null : kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
        if (kVar != null && kVar.p0()) {
            shareableEventUuid = kVar.getShareableEventUuid();
        }
        return new k(strValueOf, registrationUrl, strR, l14, shareableEventUuid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f192425a == nVar.f192425a && s.g(this.f192426b, nVar.f192426b) && s.g(this.f192427c, nVar.f192427c) && this.f192428d == nVar.f192428d;
    }

    public final int hashCode() {
        y0 y0Var = this.f192425a;
        int iHashCode = (y0Var == null ? 0 : y0Var.hashCode()) * 31;
        fg0.k kVar = this.f192426b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        fg0.p pVar = this.f192427c;
        return Boolean.hashCode(this.f192428d) + ((iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TrainingInitiativeRaceEventDTO(eventFlowType=" + this.f192425a + ", eventDTO=" + this.f192426b + ", eventSearchResultDTO=" + this.f192427c + ", isFromEventDelete=" + this.f192428d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        y0 y0Var = this.f192425a;
        if (y0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(y0Var.name());
        }
        fg0.k kVar = this.f192426b;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
        fg0.p pVar = this.f192427c;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f192428d ? 1 : 0);
    }

    public n(y0 y0Var, fg0.k kVar, fg0.p pVar, boolean z14) {
        this.f192425a = y0Var;
        this.f192426b = kVar;
        this.f192427c = pVar;
        this.f192428d = z14;
    }

    public n() {
        this(null, null, null, false, 15, null);
    }
}

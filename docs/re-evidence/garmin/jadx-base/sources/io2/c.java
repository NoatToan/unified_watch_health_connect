package io2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio2/c;", "Landroid/os/Parcelable;", "Lio2/f;", "pushProvisioningPayload", "Lio2/g;", "riskData", "<init>", "(Lio2/f;Lio2/g;)V", "a", "Lio2/f;", "b", "()Lio2/f;", "Lio2/g;", "getRiskData", "()Lio2/g;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushProvisioningPayload")
    private final f pushProvisioningPayload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("riskData")
    private final g riskData;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), g.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(f fVar, g gVar, int i14, j jVar) {
        this(fVar, (i14 & 2) != 0 ? new g(null, null, 3, null) : gVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getPushProvisioningPayload() {
        return this.pushProvisioningPayload;
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
        return s.g(this.pushProvisioningPayload, cVar.pushProvisioningPayload) && s.g(this.riskData, cVar.riskData);
    }

    public final int hashCode() {
        f fVar = this.pushProvisioningPayload;
        return this.riskData.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }

    public final String toString() {
        return "PushProvCardInformationModel(pushProvisioningPayload=" + this.pushProvisioningPayload + ", riskData=" + this.riskData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f fVar = this.pushProvisioningPayload;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        this.riskData.writeToParcel(parcel, i14);
    }

    public c(f fVar, g gVar) {
        gVar.getClass();
        this.pushProvisioningPayload = fVar;
        this.riskData = gVar;
    }
}

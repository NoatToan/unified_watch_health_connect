package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lqn2/i;", "Lpn2/d;", "Lqn2/h;", "conditions", "Lqn2/g;", "additionalInfoParameter", "additionalInfoHashParameter", "<init>", "(Lqn2/h;Lqn2/g;Lqn2/g;)V", "a", "Lqn2/h;", "getConditions", "()Lqn2/h;", "setConditions", "(Lqn2/h;)V", "b", "Lqn2/g;", "getAdditionalInfoParameter", "()Lqn2/g;", "setAdditionalInfoParameter", "(Lqn2/g;)V", "c", "getAdditionalInfoHashParameter", "setAdditionalInfoHashParameter", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements pn2.d {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("conditions")
    private h conditions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("additionalInfoParameter")
    private g additionalInfoParameter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("additionalInfoHashParameter")
    private g additionalInfoHashParameter;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            h hVarCreateFromParcel = h.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<g> creator = g.CREATOR;
            return new i(hVarCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(h hVar, g gVar, g gVar2) {
        hVar.getClass();
        gVar.getClass();
        gVar2.getClass();
        this.conditions = hVar;
        this.additionalInfoParameter = gVar;
        this.additionalInfoHashParameter = gVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.conditions, iVar.conditions) && p005kotlin.jvm.internal.s.g(this.additionalInfoParameter, iVar.additionalInfoParameter) && p005kotlin.jvm.internal.s.g(this.additionalInfoHashParameter, iVar.additionalInfoHashParameter);
    }

    public final int hashCode() {
        return this.additionalInfoHashParameter.hashCode() + ((this.additionalInfoParameter.hashCode() + (this.conditions.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FNCardListRequestPayloadDto(conditions=" + this.conditions + ", additionalInfoParameter=" + this.additionalInfoParameter + ", additionalInfoHashParameter=" + this.additionalInfoHashParameter + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.conditions.writeToParcel(parcel, i14);
        this.additionalInfoParameter.writeToParcel(parcel, i14);
        this.additionalInfoHashParameter.writeToParcel(parcel, i14);
    }
}

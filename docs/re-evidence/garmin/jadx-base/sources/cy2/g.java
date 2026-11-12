package cy2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcy2/g;", "Landroid/os/Parcelable;", "Lcy2/e;", "animationProvider", "", "webViewBackgroundColor", "Lcy2/f;", "toolbarConfig", "", "useTWAIfAvailable", "<init>", "(Lcy2/e;Ljava/lang/Integer;Lcy2/f;Ljava/lang/Boolean;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f56834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f56835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f56836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f56837d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            e eVar = (e) parcel.readParcelable(g.class.getClassLoader());
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            f fVarCreateFromParcel = parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new g(eVar, numValueOf, fVarCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(e eVar, Integer num, f fVar, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this(eVar, (i14 & 2) != 0 ? 0 : num, (i14 & 4) != 0 ? null : fVar, (i14 & 8) != 0 ? Boolean.FALSE : bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f56834a, gVar.f56834a) && s.g(this.f56835b, gVar.f56835b) && s.g(this.f56836c, gVar.f56836c) && s.g(this.f56837d, gVar.f56837d);
    }

    public final int hashCode() {
        int iHashCode = this.f56834a.hashCode() * 31;
        Integer num = this.f56835b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        f fVar = this.f56836c;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Boolean bool = this.f56837d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "InAppPurchaseViewConfig(animationProvider=" + this.f56834a + ", webViewBackgroundColor=" + this.f56835b + ", toolbarConfig=" + this.f56836c + ", useTWAIfAvailable=" + this.f56837d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f56834a, i14);
        Integer num = this.f56835b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        f fVar = this.f56836c;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        Boolean bool = this.f56837d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
    }

    public g(e eVar, Integer num, f fVar, Boolean bool) {
        eVar.getClass();
        this.f56834a = eVar;
        this.f56835b = num;
        this.f56836c = fVar;
        this.f56837d = bool;
    }
}

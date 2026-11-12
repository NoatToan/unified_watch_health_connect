package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lww1/w;", "Landroid/os/Parcelable;", "Lm52/i;", "triathlonType", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;", "swim", "bike", "run", "<init>", "(Lm52/i;Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;Lcom/garmin/android/apps/connectmobile/workouts/data/model/k;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m52.i f187882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.k f187883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.k f187884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.k f187885d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            parcel.getClass();
            m52.i iVarValueOf = m52.i.valueOf(parcel.readString());
            Parcelable.Creator<com.garmin.android.apps.connectmobile.workouts.data.model.k> creator = com.garmin.android.apps.connectmobile.workouts.data.model.k.CREATOR;
            return new w(iVarValueOf, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public w(m52.i iVar, com.garmin.android.apps.connectmobile.workouts.data.model.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2, com.garmin.android.apps.connectmobile.workouts.data.model.k kVar3) {
        iVar.getClass();
        kVar.getClass();
        kVar2.getClass();
        kVar3.getClass();
        this.f187882a = iVar;
        this.f187883b = kVar;
        this.f187884c = kVar2;
        this.f187885d = kVar3;
    }

    public final List<com.garmin.android.apps.connectmobile.workouts.data.model.k> b() {
        return p13.x.k(this.f187883b, this.f187884c, this.f187885d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f187882a == wVar.f187882a && this.f187883b.equals(wVar.f187883b) && this.f187884c.equals(wVar.f187884c) && this.f187885d.equals(wVar.f187885d);
    }

    public final int hashCode() {
        return this.f187885d.hashCode() + ((this.f187884c.hashCode() + ((this.f187883b.hashCode() + (this.f187882a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FBTTriathlonLegTargetsDTO(triathlonType=" + this.f187882a + ", swim=" + this.f187883b + ", bike=" + this.f187884c + ", run=" + this.f187885d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f187882a.name());
        this.f187883b.writeToParcel(parcel, i14);
        this.f187884c.writeToParcel(parcel, i14);
        this.f187885d.writeToParcel(parcel, i14);
    }
}

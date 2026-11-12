package we0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwe0/d;", "Landroid/os/Parcelable;", "Lxe0/a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "title", "rateHeadline", "Lwe0/f;", "inputConfig", "Lwe0/b;", "chipsConfig", "", "confirmationMessageRes", "<init>", "(Lxe0/a;Ljava/lang/String;Ljava/lang/String;Lwe0/f;Lwe0/b;I)V", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f184739g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe0.a f184740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f184743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f184744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f184745f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(xe0.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(xe0.a aVar, String str, String str2, f fVar, b bVar, int i14) {
        aVar.getClass();
        str.getClass();
        str2.getClass();
        fVar.getClass();
        this.f184740a = aVar;
        this.f184741b = str;
        this.f184742c = str2;
        this.f184743d = fVar;
        this.f184744e = bVar;
        this.f184745f = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f184740a == dVar.f184740a && s.g(this.f184741b, dVar.f184741b) && s.g(this.f184742c, dVar.f184742c) && s.g(this.f184743d, dVar.f184743d) && s.g(this.f184744e, dVar.f184744e) && this.f184745f == dVar.f184745f;
    }

    public final int hashCode() {
        int iHashCode = (this.f184743d.hashCode() + wr.g.j(wr.g.j(this.f184740a.hashCode() * 31, 31, this.f184741b), 31, this.f184742c)) * 31;
        b bVar = this.f184744e;
        return Integer.hashCode(this.f184745f) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        return "FeedbackConfig(type=" + this.f184740a + ", title=" + this.f184741b + ", rateHeadline=" + this.f184742c + ", inputConfig=" + this.f184743d + ", chipsConfig=" + this.f184744e + ", confirmationMessageRes=" + this.f184745f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f184740a.name());
        parcel.writeString(this.f184741b);
        parcel.writeString(this.f184742c);
        this.f184743d.writeToParcel(parcel, i14);
        b bVar = this.f184744e;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f184745f);
    }

    public /* synthetic */ d(xe0.a aVar, String str, String str2, f fVar, b bVar, int i14, int i15, j jVar) {
        this(aVar, str, str2, fVar, bVar, (i15 & 32) != 0 ? R.string.lbl_thank_you_for_sharing : i14);
    }
}

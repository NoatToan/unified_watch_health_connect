package o51;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo51/g;", "Landroid/os/Parcelable;", "", "operationInProgress", "isError", "isSuccessful", "", "popupMessage", "<init>", "(ZZZLjava/lang/String;)V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f129262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f129265d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(boolean z14, boolean z15, boolean z16, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? "" : str);
    }

    public static g b(g gVar, boolean z14, String str, int i14) {
        boolean z15 = (i14 & 2) != 0 ? gVar.f129263b : true;
        boolean z16 = (i14 & 4) != 0 ? gVar.f129264c : true;
        if ((i14 & 8) != 0) {
            str = gVar.f129265d;
        }
        gVar.getClass();
        str.getClass();
        return new g(z14, z15, z16, str);
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
        return this.f129262a == gVar.f129262a && this.f129263b == gVar.f129263b && this.f129264c == gVar.f129264c && s.g(this.f129265d, gVar.f129265d);
    }

    public final int hashCode() {
        return this.f129265d.hashCode() + q6.f.g(q6.f.g(Boolean.hashCode(this.f129262a) * 31, 31, this.f129263b), 31, this.f129264c);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("PaceProSendToDeviceState(operationInProgress=", ", isError=", ", isSuccessful=", this.f129262a, this.f129263b);
        sbM.append(this.f129264c);
        sbM.append(", popupMessage=");
        sbM.append(this.f129265d);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f129262a ? 1 : 0);
        parcel.writeInt(this.f129263b ? 1 : 0);
        parcel.writeInt(this.f129264c ? 1 : 0);
        parcel.writeString(this.f129265d);
    }

    public g(boolean z14, boolean z15, boolean z16, String str) {
        str.getClass();
        this.f129262a = z14;
        this.f129263b = z15;
        this.f129264c = z16;
        this.f129265d = str;
    }

    public g() {
        this(false, false, false, null, 15, null);
    }
}

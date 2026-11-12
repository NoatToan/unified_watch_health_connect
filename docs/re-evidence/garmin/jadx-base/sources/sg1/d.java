package sg1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lsg1/d;", "Landroid/os/Parcelable;", "", "isLoading", "isError", "", "Lsg1/c;", "backups", "", "deviceName", "<init>", "(ZZLjava/util/List;Ljava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c> f159213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f159214d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            int iA = 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            while (iA != i14) {
                iA = kg.f.a(c.CREATOR, parcel, arrayList, iA, 1);
            }
            return new d(z14, z15, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(boolean z14, boolean z15, List list, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, list, (i14 & 8) != 0 ? null : str);
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
        return this.f159211a == dVar.f159211a && this.f159212b == dVar.f159212b && s.g(this.f159213c, dVar.f159213c) && s.g(this.f159214d, dVar.f159214d);
    }

    public final int hashCode() {
        int iB = u0.b(q6.f.g(Boolean.hashCode(this.f159211a) * 31, 31, this.f159212b), 31, this.f159213c);
        String str = this.f159214d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("DeviceBackupUiState(isLoading=", ", isError=", ", backups=", this.f159211a, this.f159212b);
        sbM.append(this.f159213c);
        sbM.append(", deviceName=");
        sbM.append(this.f159214d);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f159211a ? 1 : 0);
        parcel.writeInt(this.f159212b ? 1 : 0);
        Iterator itE = kg.f.e(this.f159213c, parcel);
        while (itE.hasNext()) {
            ((c) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f159214d);
    }

    public d(boolean z14, boolean z15, List<c> list, String str) {
        list.getClass();
        this.f159211a = z14;
        this.f159212b = z15;
        this.f159213c = list;
        this.f159214d = str;
    }
}

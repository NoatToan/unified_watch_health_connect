package qv;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lqv/a;", "Landroid/os/Parcelable;", "", "hasSportFileBackups", "hasSensorsBackups", "", "Lqv/c;", "sportProfileBackups", "<init>", "(ZZLjava/util/List;)V", "a", "Z", "d", "()Z", "b", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2783a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasSportFileBackups")
    private final boolean hasSportFileBackups;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasSensorsBackups")
    private final boolean hasSensorsBackups;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportProfileBackupDTOList")
    private final List<c> sportProfileBackups;

    /* JADX INFO: renamed from: qv.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2783a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int iA = 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                while (iA != i14) {
                    iA = f.a(c.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new a(z14, z15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(boolean z14, boolean z15, List<c> list) {
        this.hasSportFileBackups = z14;
        this.hasSensorsBackups = z15;
        this.sportProfileBackups = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasSensorsBackups() {
        return this.hasSensorsBackups;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasSportFileBackups() {
        return this.hasSportFileBackups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.hasSportFileBackups == aVar.hasSportFileBackups && this.hasSensorsBackups == aVar.hasSensorsBackups && s.g(this.sportProfileBackups, aVar.sportProfileBackups);
    }

    public final List<c> f() {
        return this.sportProfileBackups;
    }

    public final int hashCode() {
        int iG = q6.f.g(Boolean.hashCode(this.hasSportFileBackups) * 31, 31, this.hasSensorsBackups);
        List<c> list = this.sportProfileBackups;
        return iG + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        boolean z14 = this.hasSportFileBackups;
        boolean z15 = this.hasSensorsBackups;
        return z.c(com.airbnb.lottie.animation.keyframe.a.m("BackupDTO(hasSportFileBackups=", ", hasSensorsBackups=", ", sportProfileBackups=", z14, z15), this.sportProfileBackups, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.hasSportFileBackups ? 1 : 0);
        parcel.writeInt(this.hasSensorsBackups ? 1 : 0);
        List<c> list = this.sportProfileBackups;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((c) itO.next()).writeToParcel(parcel, i14);
        }
    }
}

package nz0;

import am.x0;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnz0/b;", "Landroid/os/Parcelable;", "", "Lnz0/a;", "ownerTypes", "Lam/x0;", "activityTypes", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<nz0.a> f128379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<x0> f128380b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashSet.add(nz0.a.valueOf(parcel.readString()));
            }
            int i16 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                linkedHashSet2.add(parcel.readParcelable(b.class.getClassLoader()));
            }
            return new b(linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Set set, Set set2, int i14, j jVar) {
        this((i14 & 1) != 0 ? new LinkedHashSet() : set, (i14 & 2) != 0 ? new LinkedHashSet() : set2);
    }

    public static String b(Context context, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return h0.k0(arrayList, ", ", null, null, null, 62);
        }
        String string = context.getString(R.string.common_all);
        string.getClass();
        return string;
    }

    public final boolean d() {
        return this.f128379a.isEmpty() && this.f128380b.isEmpty();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f128379a, bVar.f128379a) && s.g(this.f128380b, bVar.f128380b);
    }

    public final int hashCode() {
        return this.f128380b.hashCode() + (this.f128379a.hashCode() * 31);
    }

    public final String toString() {
        return "NewsFeedFilterData(ownerTypes=" + this.f128379a + ", activityTypes=" + this.f128380b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Set<nz0.a> set = this.f128379a;
        parcel.writeInt(set.size());
        Iterator<nz0.a> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        Set<x0> set2 = this.f128380b;
        parcel.writeInt(set2.size());
        Iterator<x0> it3 = set2.iterator();
        while (it3.hasNext()) {
            parcel.writeParcelable(it3.next(), i14);
        }
    }

    public b(Set<nz0.a> set, Set<x0> set2) {
        set.getClass();
        set2.getClass();
        this.f128379a = set;
        this.f128380b = set2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}

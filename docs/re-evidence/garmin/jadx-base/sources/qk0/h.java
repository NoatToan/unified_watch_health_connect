package qk0;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;
import p13.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqk0/h;", "Landroid/os/Parcelable;", "Lam/x0;", "activityType", "", "", "collectionUUIDs", "individualGearUUIDs", "<init>", "(Lam/x0;Ljava/util/Set;Ljava/util/Set;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f145100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f145101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f145102c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            x0 x0Var = (x0) parcel.readParcelable(h.class.getClassLoader());
            int i14 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashSet.add(parcel.readString());
            }
            int i16 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                linkedHashSet2.add(parcel.readString());
            }
            return new h(x0Var, linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(x0 x0Var, Set<String> set, Set<String> set2) {
        x0Var.getClass();
        set.getClass();
        set2.getClass();
        this.f145100a = x0Var;
        this.f145101b = set;
        this.f145102c = set2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f145100a == hVar.f145100a && p005kotlin.jvm.internal.s.g(this.f145101b, hVar.f145101b) && p005kotlin.jvm.internal.s.g(this.f145102c, hVar.f145102c);
    }

    public final int hashCode() {
        return this.f145102c.hashCode() + ((this.f145101b.hashCode() + (this.f145100a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DefaultGearConflictReplacement(activityType=" + this.f145100a + ", collectionUUIDs=" + this.f145101b + ", individualGearUUIDs=" + this.f145102c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f145100a, i14);
        Set<String> set = this.f145101b;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        Set<String> set2 = this.f145102c;
        parcel.writeInt(set2.size());
        Iterator<String> it3 = set2.iterator();
        while (it3.hasNext()) {
            parcel.writeString(it3.next());
        }
    }

    public h(x0 x0Var, Set set, Set set2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, (i14 & 2) != 0 ? l0.f134950a : set, (i14 & 4) != 0 ? l0.f134950a : set2);
    }
}

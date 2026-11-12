package sg0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsg0/z;", "", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class z implements Parcelable {
    public static final z INSTANCE = new z();
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f159184a = o13.m.a(o13.n.PUBLICATION, new sd.o(4));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        @Override // android.os.Parcelable.Creator
        public final z createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return z.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final z[] newArray(int i14) {
            return new z[i14];
        }
    }

    private z() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z);
    }

    public final int hashCode() {
        return 264226332;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i63.c<z> serializer() {
        return (i63.c) f159184a.getValue();
    }

    public final String toString() {
        return "ChildAgedOut";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}

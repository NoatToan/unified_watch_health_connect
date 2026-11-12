package ir0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lir0/g;", "Landroid/os/Parcelable;", "", "timestamp", "", "value", "<init>", "(JI)V", "Companion", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h(with = h.class)
public final /* data */ class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94808b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<g> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(long j8, int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 0L : j8, (i15 & 2) != 0 ? 0 : i14);
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
        return this.f94807a == gVar.f94807a && this.f94808b == gVar.f94808b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f94808b) + (Long.hashCode(this.f94807a) * 31);
    }

    public final String toString() {
        StringBuilder sbW = v.h.w(this.f94808b, "IntensityMinutesValueDTO(timestamp=", ", value=", this.f94807a);
        sbW.append(")");
        return sbW.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f94807a);
        parcel.writeInt(this.f94808b);
    }

    /* JADX INFO: renamed from: ir0.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lir0/g$a;", "", "<init>", "()V", "Li63/c;", "Lir0/g;", "serializer", "()Li63/c;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return new h();
        }

        private Companion() {
        }
    }

    public g(long j8, int i14) {
        this.f94807a = j8;
        this.f94808b = i14;
    }

    public g() {
        this(0L, 0, 3, null);
    }
}

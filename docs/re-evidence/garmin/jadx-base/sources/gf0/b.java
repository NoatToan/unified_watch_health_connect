package gf0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgf0/b;", "Landroid/os/Parcelable;", "Lgf0/a;", "summary", "Lgf0/d;", "reading", "<init>", "(Lgf0/a;Lgf0/d;)V", "a", "Lgf0/a;", "d", "()Lgf0/a;", "b", "Lgf0/d;", "()Lgf0/d;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summary")
    private final gf0.a summary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reading")
    private final d reading;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(gf0.a.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(gf0.a aVar, d dVar) {
        aVar.getClass();
        this.summary = aVar;
        this.reading = dVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getReading() {
        return this.reading;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final gf0.a getSummary() {
        return this.summary;
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
        return s.g(this.summary, bVar.summary) && s.g(this.reading, bVar.reading);
    }

    public final int hashCode() {
        int iHashCode = this.summary.hashCode() * 31;
        d dVar = this.reading;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "EcgActivitySummaryDto(summary=" + this.summary + ", reading=" + this.reading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.summary.writeToParcel(parcel, i14);
        d dVar = this.reading;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ b(gf0.a aVar, d dVar, int i14, j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : dVar);
    }
}

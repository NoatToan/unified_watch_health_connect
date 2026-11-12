package we0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwe0/g;", "Landroid/os/Parcelable;", "", "userId", "", "rating", "", "feedback", "", "selectedChips", "chipFeedback", "<init>", "(JILjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f184752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f184753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f184755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f184756e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(long j8, int i14, String str, List<String> list, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.f184752a = j8;
        this.f184753b = i14;
        this.f184754c = str;
        this.f184755d = list;
        this.f184756e = str2;
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
        return this.f184752a == gVar.f184752a && this.f184753b == gVar.f184753b && this.f184754c.equals(gVar.f184754c) && this.f184755d.equals(gVar.f184755d) && this.f184756e.equals(gVar.f184756e);
    }

    public final int hashCode() {
        return this.f184756e.hashCode() + u0.b(wr.g.j(q2.d(this.f184753b, Long.hashCode(this.f184752a) * 31, 31), 31, this.f184754c), 31, this.f184755d);
    }

    public final String toString() {
        StringBuilder sbW = v.h.w(this.f184753b, "FeedbackSelections(userId=", ", rating=", this.f184752a);
        sbW.append(", feedback=");
        sbW.append(this.f184754c);
        sbW.append(", selectedChips=");
        sbW.append(this.f184755d);
        return e0.h(sbW, ", chipFeedback=", this.f184756e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f184752a);
        parcel.writeInt(this.f184753b);
        parcel.writeString(this.f184754c);
        parcel.writeStringList(this.f184755d);
        parcel.writeString(this.f184756e);
    }
}

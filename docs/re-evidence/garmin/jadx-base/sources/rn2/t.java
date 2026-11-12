package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lrn2/t;", "Lpn2/d;", "", "finish", "", "blacklist", "recovery", "forceReissue", "<init>", "(Ljava/lang/String;ZZZ)V", "a", "Ljava/lang/String;", "getFinish", "()Ljava/lang/String;", "b", "Z", "()Z", "c", "f", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements pn2.d {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("finish")
    private final String finish;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("blacklist")
    private final boolean blacklist;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recovery")
    private final boolean recovery;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("forceReissue")
    private final boolean forceReissue;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public t(String str, boolean z14, boolean z15, boolean z16) {
        str.getClass();
        this.finish = str;
        this.blacklist = z14;
        this.recovery = z15;
        this.forceReissue = z16;
        int length = str.length();
        if (length < 0 || length >= 33) {
            vb.h.x(am.j.h(str.length(), "finish length(0-32): "));
            throw null;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getBlacklist() {
        return this.blacklist;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getForceReissue() {
        return this.forceReissue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.finish, tVar.finish) && this.blacklist == tVar.blacklist && this.recovery == tVar.recovery && this.forceReissue == tVar.forceReissue;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRecovery() {
        return this.recovery;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.forceReissue) + q6.f.g(q6.f.g(this.finish.hashCode() * 31, 31, this.blacklist), 31, this.recovery);
    }

    public final String toString() {
        String str = this.finish;
        boolean z14 = this.blacklist;
        return com.airbnb.lottie.animation.keyframe.a.f(", forceReissue=", ")", zl.a.d("FNSubStatusDto(finish='", str, "', blacklist=", z14, ", recovery="), this.recovery, this.forceReissue);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.finish);
        parcel.writeInt(this.blacklist ? 1 : 0);
        parcel.writeInt(this.recovery ? 1 : 0);
        parcel.writeInt(this.forceReissue ? 1 : 0);
    }
}

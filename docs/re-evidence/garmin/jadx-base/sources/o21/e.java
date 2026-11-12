package o21;

import android.os.Parcel;
import android.os.Parcelable;
import b63.v;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lo21/e;", "Landroid/os/Parcelable;", "", "mealId", "", "mealName", "_startTime", "_endTime", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lb63/v;", "startTime", "endTime", "(JLjava/lang/String;Lb63/v;Lb63/v;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f128665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f128667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f128668d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(long j8, String str, v vVar, v vVar2) {
        this(j8, str, vVar.toString(), vVar2.toString());
        str.getClass();
        vVar.getClass();
        vVar2.getClass();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f128665a == eVar.f128665a && s.g(this.f128666b, eVar.f128666b) && s.g(this.f128667c, eVar.f128667c) && s.g(this.f128668d, eVar.f128668d);
    }

    public final int hashCode() {
        return this.f128668d.hashCode() + wr.g.j(wr.g.j(Long.hashCode(this.f128665a) * 31, 31, this.f128666b), 31, this.f128667c);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f128665a, "LegacyMealWindowResult(mealId=", ", mealName=", this.f128666b);
        sn.a.t(sbK, ", _startTime=", this.f128667c, ", _endTime=", this.f128668d);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f128665a);
        parcel.writeString(this.f128666b);
        parcel.writeString(this.f128667c);
        parcel.writeString(this.f128668d);
    }

    public e(long j8, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f128665a = j8;
        this.f128666b = str;
        this.f128667c = str2;
        this.f128668d = str3;
    }
}

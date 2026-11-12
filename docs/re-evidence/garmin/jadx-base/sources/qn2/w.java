package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lqn2/w;", "Lpn2/d;", "", "sepId", "seType", "seId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getSepId", "()Ljava/lang/String;", "setSepId", "(Ljava/lang/String;)V", "b", "getSeType", "setSeType", "c", "getSeId", "setSeId", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w implements pn2.d {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sepId")
    private String sepId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("seType")
    private String seType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("seId")
    private String seId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new w(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public w(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.sepId = str;
        this.seType = str2;
        this.seId = str3;
        if (str.length() != 6) {
            vb.h.x(am.j.h(this.sepId.length(), "sepId length(6): "));
            throw null;
        }
        if (this.seType.length() != 2) {
            vb.h.x(am.j.h(this.seType.length(), "seType length(2): "));
            throw null;
        }
        int length = this.seId.length();
        if (2 > length || length >= 129) {
            vb.h.x(am.j.h(this.seType.length(), "seId length(2-128): "));
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p005kotlin.jvm.internal.s.g(this.sepId, wVar.sepId) && p005kotlin.jvm.internal.s.g(this.seType, wVar.seType) && p005kotlin.jvm.internal.s.g(this.seId, wVar.seId);
    }

    public final int hashCode() {
        return this.seId.hashCode() + wr.g.j(this.sepId.hashCode() * 31, 31, this.seType);
    }

    public final String toString() {
        return am.j.o(this.seId, "')", p6.b.i("FNSEInfoDto(sepId='", this.sepId, "', seType='", this.seType, "', seId='"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.sepId);
        parcel.writeString(this.seType);
        parcel.writeString(this.seId);
    }
}

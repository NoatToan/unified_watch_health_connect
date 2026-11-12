package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lqn2/x;", "Lpn2/d;", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "keyVersion", "sequenceCounter", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "a", "I", "getType", "()I", "setType", "(I)V", "b", "Ljava/lang/String;", "getKeyVersion", "()Ljava/lang/String;", "setKeyVersion", "(Ljava/lang/String;)V", "c", "getSequenceCounter", "setSequenceCounter", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x implements pn2.d {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private int type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("keyVersion")
    private String keyVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sequenceCounter")
    private String sequenceCounter;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new x(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public x(int i14, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.type = i14;
        this.keyVersion = str;
        this.sequenceCounter = str2;
        int length = str.length();
        if (2 > length || length >= 4097) {
            vb.h.x(am.j.h(this.keyVersion.length(), "keyVersion length(2-4096): "));
            throw null;
        }
        if (this.sequenceCounter.length() == 6) {
            return;
        }
        vb.h.x(am.j.h(this.sequenceCounter.length(), "sequenceCounter length(6): "));
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.type == xVar.type && p005kotlin.jvm.internal.s.g(this.keyVersion, xVar.keyVersion) && p005kotlin.jvm.internal.s.g(this.sequenceCounter, xVar.sequenceCounter);
    }

    public final int hashCode() {
        return this.sequenceCounter.hashCode() + wr.g.j(Integer.hashCode(this.type) * 31, 31, this.keyVersion);
    }

    public final String toString() {
        return am.j.o(this.sequenceCounter, "')", wr.g.r(this.type, "FNSdInfoListItemDto(type=", ", keyVersion='", this.keyVersion, "', sequenceCounter='"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.type);
        parcel.writeString(this.keyVersion);
        parcel.writeString(this.sequenceCounter);
    }
}

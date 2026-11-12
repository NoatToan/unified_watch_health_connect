package i41;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Li41/c;", "Landroid/os/Parcelable;", "", "hrvValue", "", "readingTimeGMT", "readingTimeLocal", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "a", "I", "b", "()I", "setHrvValue", "(I)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setReadingTimeGMT", "(Ljava/lang/String;)V", "c", "getReadingTimeLocal", "setReadingTimeLocal", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hrvValue")
    private int hrvValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("readingTimeGMT")
    private String readingTimeGMT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("readingTimeLocal")
    private String readingTimeLocal;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public c(int i14, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.hrvValue = i14;
        this.readingTimeGMT = str;
        this.readingTimeLocal = str2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHrvValue() {
        return this.hrvValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReadingTimeGMT() {
        return this.readingTimeGMT;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.hrvValue == cVar.hrvValue && s.g(this.readingTimeGMT, cVar.readingTimeGMT) && s.g(this.readingTimeLocal, cVar.readingTimeLocal);
    }

    public final int hashCode() {
        return this.readingTimeLocal.hashCode() + wr.g.j(Integer.hashCode(this.hrvValue) * 31, 31, this.readingTimeGMT);
    }

    public final String toString() {
        return j.o(this.readingTimeLocal, ")", wr.g.r(this.hrvValue, "HrvReadingsDTO(hrvValue=", ", readingTimeGMT=", this.readingTimeGMT, ", readingTimeLocal="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.hrvValue);
        parcel.writeString(this.readingTimeGMT);
        parcel.writeString(this.readingTimeLocal);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li41/c$a;", "", "<init>", "()V", "", "TIMESTAMP_PATTERN", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

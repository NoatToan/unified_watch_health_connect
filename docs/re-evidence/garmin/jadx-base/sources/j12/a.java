package j12;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lj12/a;", "Landroid/os/Parcelable;", "", "isShowGender", "isShowHeight", "isShowAge", "isShowRecentDevice", "isShowWeight", "isShowVO2Max", "<init>", "(ZZZZZZ)V", "a", "Z", "d", "()Z", "setShowGender", "(Z)V", "b", "f", "setShowHeight", "c", "setShowAge", "g", "setShowRecentDevice", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "setShowWeight", "h", "setShowVO2Max", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1843a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showGender")
    private boolean isShowGender;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showHeight")
    private boolean isShowHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showAge")
    private boolean isShowAge;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showRecentDevice")
    private boolean isShowRecentDevice;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showWeight")
    private boolean isShowWeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showVO2Max")
    private boolean isShowVO2Max;

    /* JADX INFO: renamed from: j12.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1843a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            boolean z14 = false;
            boolean z15 = true;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            if (parcel.readInt() != 0) {
                z14 = z15;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            return new a(z16, z14, z15, z14, z15, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? false : z19);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsShowAge() {
        return this.isShowAge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsShowGender() {
        return this.isShowGender;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsShowHeight() {
        return this.isShowHeight;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsShowRecentDevice() {
        return this.isShowRecentDevice;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsShowVO2Max() {
        return this.isShowVO2Max;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsShowWeight() {
        return this.isShowWeight;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.isShowGender ? 1 : 0);
        parcel.writeInt(this.isShowHeight ? 1 : 0);
        parcel.writeInt(this.isShowAge ? 1 : 0);
        parcel.writeInt(this.isShowRecentDevice ? 1 : 0);
        parcel.writeInt(this.isShowWeight ? 1 : 0);
        parcel.writeInt(this.isShowVO2Max ? 1 : 0);
    }

    public a(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.isShowGender = z14;
        this.isShowHeight = z15;
        this.isShowAge = z16;
        this.isShowRecentDevice = z17;
        this.isShowWeight = z18;
        this.isShowVO2Max = z19;
    }

    public a() {
        this(false, false, false, false, false, false, 63, null);
    }
}

package qs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b\u0015\u0010!R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001b\u0010$¨\u0006%"}, d2 = {"Lqs1/b;", "Landroid/os/Parcelable;", "", "imageId", "", "imageUrl", "imageThumbnailUrl", "imageMediumUrl", "imageTimestamp", "", "imageHelpfulCount", "displayOrder", "", "requesterOwned", "hidden", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;ZZ)V", "a", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "c", IntegerTokenConverter.CONVERTER_KEY, "d", "h", JWKParameterNames.RSA_EXPONENT, "j", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Z", JWKParameterNames.OCT_KEY_VALUE, "()Z", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageId")
    private final Long imageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageThumbnailUrl")
    private final String imageThumbnailUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageMediumUrl")
    private final String imageMediumUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageTimestamp")
    private final Long imageTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageHelpfulCount")
    private final Integer imageHelpfulCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayOrder")
    private final Integer displayOrder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requesterOwned")
    private final boolean requesterOwned;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hidden")
    private final boolean hidden;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer num;
            Integer num2;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                num = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                num = null;
            }
            String string = parcel.readString();
            Integer num3 = num;
            String string2 = parcel.readString();
            Integer numValueOf = num3;
            String string3 = parcel.readString();
            Object objValueOf = parcel.readInt() == 0 ? numValueOf : Long.valueOf(parcel.readLong());
            Integer numValueOf2 = parcel.readInt() == 0 ? numValueOf : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                num2 = numValueOf2;
                z14 = true;
            } else {
                num2 = numValueOf2;
            }
            return new b(lValueOf, string, string2, string3, objValueOf, num2, numValueOf, z15, z14);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(Long l14, String str, String str2, String str3, Long l15, Integer num, Integer num2, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : l15, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? null : num2, (i14 & 128) != 0 ? false : z14, (i14 & 256) != 0 ? false : z15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
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
        return p005kotlin.jvm.internal.s.g(this.imageId, bVar.imageId) && p005kotlin.jvm.internal.s.g(this.imageUrl, bVar.imageUrl) && p005kotlin.jvm.internal.s.g(this.imageThumbnailUrl, bVar.imageThumbnailUrl) && p005kotlin.jvm.internal.s.g(this.imageMediumUrl, bVar.imageMediumUrl) && p005kotlin.jvm.internal.s.g(this.imageTimestamp, bVar.imageTimestamp) && p005kotlin.jvm.internal.s.g(this.imageHelpfulCount, bVar.imageHelpfulCount) && p005kotlin.jvm.internal.s.g(this.displayOrder, bVar.displayOrder) && this.requesterOwned == bVar.requesterOwned && this.hidden == bVar.hidden;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getImageHelpfulCount() {
        return this.imageHelpfulCount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getImageId() {
        return this.imageId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getImageMediumUrl() {
        return this.imageMediumUrl;
    }

    public final int hashCode() {
        Long l14 = this.imageId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageThumbnailUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageMediumUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l15 = this.imageTimestamp;
        int iHashCode5 = (iHashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num = this.imageHelpfulCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.displayOrder;
        return Boolean.hashCode(this.hidden) + q6.f.g((iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.requesterOwned);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getImageThumbnailUrl() {
        return this.imageThumbnailUrl;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getImageTimestamp() {
        return this.imageTimestamp;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getRequesterOwned() {
        return this.requesterOwned;
    }

    public final String toString() {
        Long l14 = this.imageId;
        String str = this.imageUrl;
        String str2 = this.imageThumbnailUrl;
        String str3 = this.imageMediumUrl;
        Long l15 = this.imageTimestamp;
        Integer num = this.imageHelpfulCount;
        Integer num2 = this.displayOrder;
        boolean z14 = this.requesterOwned;
        boolean z15 = this.hidden;
        StringBuilder sbJ = b71.i.j("CoverImageDTO(imageId=", ", imageUrl=", str, l14, ", imageThumbnailUrl=");
        sn.a.t(sbJ, str2, ", imageMediumUrl=", str3, ", imageTimestamp=");
        sbJ.append(l15);
        sbJ.append(", imageHelpfulCount=");
        sbJ.append(num);
        sbJ.append(", displayOrder=");
        sbJ.append(num2);
        sbJ.append(", requesterOwned=");
        sbJ.append(z14);
        sbJ.append(", hidden=");
        return hb.a.k(sbJ, z15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.imageId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.imageThumbnailUrl);
        parcel.writeString(this.imageMediumUrl);
        Long l15 = this.imageTimestamp;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        Integer num = this.imageHelpfulCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.displayOrder;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeInt(this.requesterOwned ? 1 : 0);
        parcel.writeInt(this.hidden ? 1 : 0);
    }

    public b(Long l14, String str, String str2, String str3, Long l15, Integer num, Integer num2, boolean z14, boolean z15) {
        this.imageId = l14;
        this.imageUrl = str;
        this.imageThumbnailUrl = str2;
        this.imageMediumUrl = str3;
        this.imageTimestamp = l15;
        this.imageHelpfulCount = num;
        this.displayOrder = num2;
        this.requesterOwned = z14;
        this.hidden = z15;
    }

    public b() {
        this(null, null, null, null, null, null, null, false, false, 511, null);
    }
}

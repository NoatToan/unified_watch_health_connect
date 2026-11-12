package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001e\u0010\"R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lfo2/w;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", "operatorId", "displayName", "operatorKey", "operatorType", "Lfo2/d;", "cardMetaData", "", "maxOccurrencesPerDevice", "", "alwaysShowProductList", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfo2/d;IZ)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "d", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Ljava/lang/String;", "getOperatorId", "()Ljava/lang/String;", "c", "getDisplayName", "g", JWKParameterNames.RSA_EXPONENT, "h", "f", "Lfo2/d;", "()Lfo2/d;", "I", "()I", "Z", "X2", "()Z", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("operatorId")
    private final String operatorId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("operatorKey")
    private final String operatorKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("operatorType")
    private final String operatorType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardMetaData")
    private final d cardMetaData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxOccurrencesPerDevice")
    private final int maxOccurrencesPerDevice;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("alwaysShowProductList")
    private final boolean alwaysShowProductList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new w((Links) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), d.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public w(Links links, String str, String str2, String str3, String str4, d dVar, int i14, boolean z14) {
        links.getClass();
        str.getClass();
        str2.getClass();
        str4.getClass();
        dVar.getClass();
        this.links = links;
        this.operatorId = str;
        this.displayName = str2;
        this.operatorKey = str3;
        this.operatorType = str4;
        this.cardMetaData = dVar;
        this.maxOccurrencesPerDevice = i14;
        this.alwaysShowProductList = z14;
    }

    /* JADX INFO: renamed from: X2, reason: from getter */
    public final boolean getAlwaysShowProductList() {
        return this.alwaysShowProductList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getCardMetaData() {
        return this.cardMetaData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Links getLinks() {
        return this.links;
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
        return p005kotlin.jvm.internal.s.g(this.links, wVar.links) && p005kotlin.jvm.internal.s.g(this.operatorId, wVar.operatorId) && p005kotlin.jvm.internal.s.g(this.displayName, wVar.displayName) && p005kotlin.jvm.internal.s.g(this.operatorKey, wVar.operatorKey) && p005kotlin.jvm.internal.s.g(this.operatorType, wVar.operatorType) && p005kotlin.jvm.internal.s.g(this.cardMetaData, wVar.cardMetaData) && this.maxOccurrencesPerDevice == wVar.maxOccurrencesPerDevice && this.alwaysShowProductList == wVar.alwaysShowProductList;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxOccurrencesPerDevice() {
        return this.maxOccurrencesPerDevice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOperatorKey() {
        return this.operatorKey;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getOperatorType() {
        return this.operatorType;
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.links.f51142a.hashCode() * 31, 31, this.operatorId), 31, this.displayName);
        String str = this.operatorKey;
        return Boolean.hashCode(this.alwaysShowProductList) + q2.d(this.maxOccurrencesPerDevice, (this.cardMetaData.hashCode() + wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.operatorType)) * 31, 31);
    }

    public final String toString() {
        Links links = this.links;
        String str = this.operatorId;
        String str2 = this.displayName;
        String str3 = this.operatorKey;
        String str4 = this.operatorType;
        d dVar = this.cardMetaData;
        int i14 = this.maxOccurrencesPerDevice;
        boolean z14 = this.alwaysShowProductList;
        StringBuilder sb3 = new StringBuilder("Operator(links=");
        sb3.append(links);
        sb3.append(", operatorId=");
        sb3.append(str);
        sb3.append(", displayName=");
        sn.a.t(sb3, str2, ", operatorKey=", str3, ", operatorType=");
        sb3.append(str4);
        sb3.append(", cardMetaData=");
        sb3.append(dVar);
        sb3.append(", maxOccurrencesPerDevice=");
        sb3.append(i14);
        sb3.append(", alwaysShowProductList=");
        sb3.append(z14);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        parcel.writeString(this.operatorId);
        parcel.writeString(this.displayName);
        parcel.writeString(this.operatorKey);
        parcel.writeString(this.operatorType);
        this.cardMetaData.writeToParcel(parcel, i14);
        parcel.writeInt(this.maxOccurrencesPerDevice);
        parcel.writeInt(this.alwaysShowProductList ? 1 : 0);
    }
}

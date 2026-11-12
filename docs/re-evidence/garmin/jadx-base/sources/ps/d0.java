package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationOptions;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014¨\u0006("}, d2 = {"Lps/d0;", "Landroid/os/Parcelable;", "", "chartTitle", "fillColor", "", TtmlNode.ATTR_ID, "", "isActivityVisible", "isChartVisible", "isLapVisible", Constants.ScionAnalytics.PARAM_LABEL, "precision", "sortOrder", "unitLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZZLjava/lang/String;IILjava/lang/String;)V", "a", "Ljava/lang/String;", "W0", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "d", "Z", "m", "()Z", JWKParameterNames.RSA_EXPONENT, "o", "f", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "h", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "j", JWKParameterNames.OCT_KEY_VALUE, "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("chart-title-key")
    private final String chartTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(PolygonAnnotationOptions.PROPERTY_FILL_COLOR)
    private final String fillColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private final Integer id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activity-visible")
    private final boolean isActivityVisible;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("chart-visible")
    private final boolean isChartVisible;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lap-visible")
    private final boolean isLapVisible;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("label-key")
    private final String label;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("precision")
    private final int precision;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sort-order")
    private final int sortOrder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unit-label-key")
    private final String unitLabel;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new d0(string, string2, numValueOf, z15, z14, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i14) {
            return new d0[i14];
        }
    }

    public /* synthetic */ d0(String str, String str2, Integer num, boolean z14, boolean z15, boolean z16, String str3, int i14, int i15, String str4, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? null : str2, (i16 & 4) != 0 ? null : num, (i16 & 8) != 0 ? false : z14, (i16 & 16) != 0 ? false : z15, (i16 & 32) != 0 ? false : z16, (i16 & 64) != 0 ? null : str3, (i16 & 128) != 0 ? -1 : i14, (i16 & 256) != 0 ? 0 : i15, (i16 & 512) != 0 ? null : str4);
    }

    public static d0 b(d0 d0Var, String str, String str2, String str3) {
        String str4 = d0Var.fillColor;
        Integer num = d0Var.id;
        boolean z14 = d0Var.isActivityVisible;
        boolean z15 = d0Var.isChartVisible;
        boolean z16 = d0Var.isLapVisible;
        int i14 = d0Var.precision;
        int i15 = d0Var.sortOrder;
        d0Var.getClass();
        return new d0(str, str4, num, z14, z15, z16, str2, i14, i15, str3);
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    public final String getChartTitle() {
        return this.chartTitle;
    }

    public final double d() {
        String str = this.fillColor;
        if (str == null || !d53.w.z(str, "(", false) || !d53.w.z(this.fillColor, ")", false)) {
            return 1.0d;
        }
        String str2 = this.fillColor;
        List listW = d53.w.W(str2.substring(d53.w.G(CoreConstants.LEFT_PARENTHESIS_CHAR, 0, 6, str2) + 1, d53.w.G(CoreConstants.RIGHT_PARENTHESIS_CHAR, 0, 6, this.fillColor)), new String[]{","});
        if (listW.size() == 4) {
            return Double.parseDouble(d53.w.i0((String) listW.get(3)).toString());
        }
        return 1.0d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.chartTitle, d0Var.chartTitle) && p005kotlin.jvm.internal.s.g(this.fillColor, d0Var.fillColor) && p005kotlin.jvm.internal.s.g(this.id, d0Var.id) && this.isActivityVisible == d0Var.isActivityVisible && this.isChartVisible == d0Var.isChartVisible && this.isLapVisible == d0Var.isLapVisible && p005kotlin.jvm.internal.s.g(this.label, d0Var.label) && this.precision == d0Var.precision && this.sortOrder == d0Var.sortOrder && p005kotlin.jvm.internal.s.g(this.unitLabel, d0Var.unitLabel);
    }

    public final int[] f() {
        String str = this.fillColor;
        if (str == null || !d53.w.z(str, "(", false) || !d53.w.z(this.fillColor, ")", false)) {
            return new int[]{255, 0, 0};
        }
        String str2 = this.fillColor;
        List listW = d53.w.W(str2.substring(d53.w.G(CoreConstants.LEFT_PARENTHESIS_CHAR, 0, 6, str2) + 1, d53.w.G(CoreConstants.RIGHT_PARENTHESIS_CHAR, 0, 6, this.fillColor)), new String[]{","});
        return listW.size() == 4 ? new int[]{Integer.parseInt(d53.w.i0((String) listW.get(0)).toString()), Integer.parseInt(d53.w.i0((String) listW.get(1)).toString()), Integer.parseInt(d53.w.i0((String) listW.get(2)).toString())} : new int[]{255, 0, 0};
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final int hashCode() {
        String str = this.chartTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fillColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.id;
        int iG = q6.f.g(q6.f.g(q6.f.g((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.isActivityVisible), 31, this.isChartVisible), 31, this.isLapVisible);
        String str3 = this.label;
        int iD = q2.d(this.sortOrder, q2.d(this.precision, (iG + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.unitLabel;
        return iD + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getUnitLabel() {
        return this.unitLabel;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsActivityVisible() {
        return this.isActivityVisible;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsChartVisible() {
        return this.isChartVisible;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsLapVisible() {
        return this.isLapVisible;
    }

    public final String toString() {
        String str = this.chartTitle;
        String str2 = this.fillColor;
        Integer num = this.id;
        boolean z14 = this.isActivityVisible;
        boolean z15 = this.isChartVisible;
        boolean z16 = this.isLapVisible;
        String str3 = this.label;
        int i14 = this.precision;
        int i15 = this.sortOrder;
        String str4 = this.unitLabel;
        StringBuilder sbI = p6.b.i("ConnectIQAppDataFieldDTO(chartTitle=", str, ", fillColor=", str2, ", id=");
        sbI.append(num);
        sbI.append(", isActivityVisible=");
        sbI.append(z14);
        sbI.append(", isChartVisible=");
        kg.f.q(", isLapVisible=", ", label=", sbI, z15, z16);
        q6.f.q(i14, str3, ", precision=", ", sortOrder=", sbI);
        sbI.append(i15);
        sbI.append(", unitLabel=");
        sbI.append(str4);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.chartTitle);
        parcel.writeString(this.fillColor);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeInt(this.isActivityVisible ? 1 : 0);
        parcel.writeInt(this.isChartVisible ? 1 : 0);
        parcel.writeInt(this.isLapVisible ? 1 : 0);
        parcel.writeString(this.label);
        parcel.writeInt(this.precision);
        parcel.writeInt(this.sortOrder);
        parcel.writeString(this.unitLabel);
    }

    public d0(String str, String str2, Integer num, boolean z14, boolean z15, boolean z16, String str3, int i14, int i15, String str4) {
        this.chartTitle = str;
        this.fillColor = str2;
        this.id = num;
        this.isActivityVisible = z14;
        this.isChartVisible = z15;
        this.isLapVisible = z16;
        this.label = str3;
        this.precision = i14;
        this.sortOrder = i15;
        this.unitLabel = str4;
    }

    public d0() {
        this(null, null, null, false, false, false, null, 0, 0, null, 1023, null);
    }
}

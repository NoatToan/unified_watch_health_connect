package op0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import gg1.n;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lop0/a;", "Landroid/os/Parcelable;", "", "containerId", "", "name", "unit", "", "volume", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "a", "I", "f", "()I", JWKParameterNames.OCT_KEY_VALUE, "(I)V", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "c", "getUnit", "setUnit", "d", "Ljava/lang/Double;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Double;", "setVolume", "(Ljava/lang/Double;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private int containerId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unit")
    private String unit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("volume")
    private Double volume;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133167a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.CUP_US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.OUNCE_US.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f133167a = iArr;
        }
    }

    static {
        new C2527a(null);
        CREATOR = new b();
    }

    public /* synthetic */ a(int i14, String str, String str2, Double d14, int i15, j jVar) {
        this((i15 & 1) != 0 ? 1 : i14, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : d14);
    }

    public final void b() {
        n nVarG = g();
        if (nVarG != null) {
            op0.b.f133168a.getClass();
            q22.b bVarA = op0.b.a.a(nVarG);
            Double d14 = this.volume;
            if (d14 != null) {
                this.volume = Double.valueOf(q22.a.a(d14.doubleValue(), q22.b.MILLILITER, bVarA));
            }
        }
    }

    public final void d() {
        n nVarG = g();
        if (nVarG != null) {
            op0.b.f133168a.getClass();
            q22.b bVarA = op0.b.a.a(nVarG);
            Double d14 = this.volume;
            if (d14 != null) {
                this.volume = Double.valueOf(q22.a.a(d14.doubleValue(), bVarA, q22.b.MILLILITER));
            }
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.containerId == aVar.containerId && s.g(this.name, aVar.name) && s.g(this.unit, aVar.unit) && s.g(this.volume, aVar.volume);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getContainerId() {
        return this.containerId;
    }

    public final n g() {
        String str = this.unit;
        if (str == null) {
            return null;
        }
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1329144361) {
                if (iHashCode != 98878) {
                    if (iHashCode == 106105258 && str.equals("ounce")) {
                        return n.OUNCE_US;
                    }
                } else if (str.equals("cup")) {
                    return n.CUP_US;
                }
            } else if (str.equals("milliliter")) {
                return n.METRIC;
            }
        }
        return n.METRIC;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.containerId) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unit;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.volume;
        return iHashCode3 + (d14 != null ? d14.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getVolume() {
        return this.volume;
    }

    public final boolean j() {
        Double d14 = this.volume;
        if (d14 != null) {
            if (!(d14 != null ? Double.isNaN(d14.doubleValue()) : false)) {
                String str = this.unit;
                if (!(str == null || str.length() == 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void k(int i14) {
        this.containerId = i14;
    }

    public final void m(String str) {
        this.name = str;
    }

    public final void o(n nVar) {
        String str;
        int i14 = c.f133167a[nVar.ordinal()];
        if (i14 == 1) {
            str = "milliliter";
        } else if (i14 == 2) {
            str = "cup";
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            str = "ounce";
        }
        this.unit = str;
    }

    public final String toString() {
        int i14 = this.containerId;
        String str = this.name;
        String str2 = this.unit;
        Double d14 = this.volume;
        StringBuilder sbR = g.r(i14, "HydrationContainerDTO(containerId=", ", name=", str, ", unit=");
        sbR.append(str2);
        sbR.append(", volume=");
        sbR.append(d14);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.containerId);
        parcel.writeString(this.name);
        parcel.writeString(this.unit);
        Double d14 = this.volume;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }

    /* JADX INFO: renamed from: op0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lop0/a$a;", "", "<init>", "()V", "", "FLUID_CONTAINER_1", "I", "FLUID_CONTAINER_2", "FLUID_CONTAINER_3", "", "NAME", "Ljava/lang/String;", "UNIT", "VOLUME", "OUNCE_US", "CUP_US", "METRIC", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2527a {
        public /* synthetic */ C2527a(j jVar) {
            this();
        }

        private C2527a() {
        }
    }

    public a(int i14, String str, String str2, Double d14) {
        this.containerId = i14;
        this.name = str;
        this.unit = str2;
        this.volume = d14;
    }

    public a() {
        this(0, null, null, null, 15, null);
    }
}

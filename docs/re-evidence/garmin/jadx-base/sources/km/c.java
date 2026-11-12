package km;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import i3.e5;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import v.h;
import wr.g;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkm/c;", "Landroid/os/Parcelable;", "", "lineColor", "lineColorOverlay", "highlightLineColor", "", "dataSetColors", "", "lineWidth", "highlightLineWidth", "fillGradient", "", "drawFilled", "drawStepped", "drawSteppedAsOverlay", "drawFilledAsOverlay", "disableDrawWhenChartIsMain", "disableDrawWhenChartIsOverlay", "minAxisGradientFillValue", "customFillAreaLineDataSetIndex", "<init>", "(III[IFF[IZZZZZZILjava/lang/Integer;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f105281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f105282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f105283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f105284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f105285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f105286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f105287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f105288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f105289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f105290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f105291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f105292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f105293o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            int[] iArrCreateIntArray = parcel.createIntArray();
            float f14 = parcel.readFloat();
            float f15 = parcel.readFloat();
            int[] iArrCreateIntArray2 = parcel.createIntArray();
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
            return new c(i14, i15, i16, iArrCreateIntArray, f14, f15, iArrCreateIntArray2, z16, z14, z15, z14, z15, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(int i14, int i15, int i16, int[] iArr, float f14, float f15, int[] iArr2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i17, Integer num, int i18, j jVar) {
        this(i14, (i18 & 2) != 0 ? i14 : i15, i16, iArr, f14, f15, iArr2, z14, z15, z16, z17, (i18 & 2048) != 0 ? false : z18, (i18 & 4096) != 0 ? false : z19, (i18 & 8192) != 0 ? -20 : i17, (i18 & 16384) != 0 ? null : num);
    }

    public static c b(c cVar, boolean z14, int i14) {
        int i15 = cVar.f105279a;
        int i16 = cVar.f105280b;
        int i17 = cVar.f105281c;
        int[] iArr = cVar.f105282d;
        float f14 = cVar.f105283e;
        float f15 = cVar.f105284f;
        int[] iArr2 = cVar.f105285g;
        boolean z15 = cVar.f105286h;
        boolean z16 = cVar.f105287i;
        boolean z17 = cVar.f105288j;
        boolean z18 = cVar.f105289k;
        boolean z19 = (i14 & 2048) != 0 ? cVar.f105290l : true;
        boolean z24 = (i14 & 4096) != 0 ? cVar.f105291m : z14;
        int i18 = cVar.f105292n;
        Integer num = cVar.f105293o;
        cVar.getClass();
        iArr.getClass();
        iArr2.getClass();
        return new c(i15, i16, i17, iArr, f14, f15, iArr2, z15, z16, z17, z18, z19, z24, i18, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c cVar = (c) obj;
        return this.f105279a == cVar.f105279a && this.f105280b == cVar.f105280b && this.f105281c == cVar.f105281c && Arrays.equals(this.f105282d, cVar.f105282d) && this.f105283e == cVar.f105283e && this.f105284f == cVar.f105284f && Arrays.equals(this.f105285g, cVar.f105285g) && this.f105286h == cVar.f105286h && this.f105287i == cVar.f105287i && this.f105288j == cVar.f105288j && this.f105289k == cVar.f105289k && this.f105290l == cVar.f105290l && this.f105291m == cVar.f105291m && this.f105292n == cVar.f105292n && s.g(this.f105293o, cVar.f105293o);
    }

    public final int hashCode() {
        int iD = q2.d(this.f105292n, f.g(f.g(f.g(f.g(f.g(f.g((Arrays.hashCode(this.f105285g) + f.d(this.f105284f, f.d(this.f105283e, (Arrays.hashCode(this.f105282d) + (((((this.f105279a * 31) + this.f105280b) * 31) + this.f105281c) * 31)) * 31, 31), 31)) * 31, 31, this.f105286h), 31, this.f105287i), 31, this.f105288j), 31, this.f105289k), 31, this.f105290l), 31, this.f105291m), 31);
        Integer num = this.f105293o;
        return iD + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.f105282d);
        String string2 = Arrays.toString(this.f105285g);
        StringBuilder sbJ = e5.j(this.f105279a, this.f105280b, "ChartDataSetCustomization(lineColor=", ", lineColorOverlay=", ", highlightLineColor=");
        g.t(this.f105281c, ", dataSetColors=", string, ", lineWidth=", sbJ);
        l2.n(sbJ, this.f105283e, ", highlightLineWidth=", this.f105284f, ", fillGradient=");
        h.C(string2, ", drawFilled=", ", drawStepped=", sbJ, this.f105286h);
        kg.f.q(", drawSteppedAsOverlay=", ", drawFilledAsOverlay=", sbJ, this.f105287i, this.f105288j);
        kg.f.q(", disableDrawWhenChartIsMain=", ", disableDrawWhenChartIsOverlay=", sbJ, this.f105289k, this.f105290l);
        sbJ.append(this.f105291m);
        sbJ.append(", minAxisGradientFillValue=");
        sbJ.append(this.f105292n);
        sbJ.append(", customFillAreaLineDataSetIndex=");
        return f3.i(sbJ, this.f105293o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f105279a);
        parcel.writeInt(this.f105280b);
        parcel.writeInt(this.f105281c);
        parcel.writeIntArray(this.f105282d);
        parcel.writeFloat(this.f105283e);
        parcel.writeFloat(this.f105284f);
        parcel.writeIntArray(this.f105285g);
        parcel.writeInt(this.f105286h ? 1 : 0);
        parcel.writeInt(this.f105287i ? 1 : 0);
        parcel.writeInt(this.f105288j ? 1 : 0);
        parcel.writeInt(this.f105289k ? 1 : 0);
        parcel.writeInt(this.f105290l ? 1 : 0);
        parcel.writeInt(this.f105291m ? 1 : 0);
        parcel.writeInt(this.f105292n);
        Integer num = this.f105293o;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public c(int i14, int i15, int i16, int[] iArr, float f14, float f15, int[] iArr2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i17, Integer num) {
        iArr.getClass();
        iArr2.getClass();
        this.f105279a = i14;
        this.f105280b = i15;
        this.f105281c = i16;
        this.f105282d = iArr;
        this.f105283e = f14;
        this.f105284f = f15;
        this.f105285g = iArr2;
        this.f105286h = z14;
        this.f105287i = z15;
        this.f105288j = z16;
        this.f105289k = z17;
        this.f105290l = z18;
        this.f105291m = z19;
        this.f105292n = i17;
        this.f105293o = num;
    }
}

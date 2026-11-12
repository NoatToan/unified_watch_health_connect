package b11;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb11/s;", "Landroid/os/Parcelable;", "", "servingId", "servingUnit", "", "numberOfUnits", "Lb11/f;", "fullNutritionContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLb11/f;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f14374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f14375d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new s(parcel.readString(), parcel.readString(), parcel.readDouble(), f.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14376a;

        static {
            int[] iArr = new int[g01.u.values().length];
            try {
                iArr[g01.u.GARMIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g01.u.FATSECRET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g01.u.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14376a = iArr;
        }
    }

    public s(String str, String str2, double d14, f fVar) {
        str.getClass();
        str2.getClass();
        fVar.getClass();
        this.f14372a = str;
        this.f14373b = str2;
        this.f14374c = d14;
        this.f14375d = fVar;
    }

    public final String b(g01.u uVar, double d14, p3.m mVar, int i14) {
        uVar.getClass();
        if ((i14 & 2) != 0) {
            d14 = 1.0d;
        }
        x1 x1Var = p3.n.f135158a;
        int i15 = b.f14376a[uVar.ordinal()];
        String str = this.f14373b;
        if (i15 == 1) {
            mVar.C(-259351386);
            g01.c.INSTANCE.getClass();
            String strB = g01.c.Companion.b(g01.c.Companion.a(str), d14, mVar, 0);
            mVar.f();
            return strB;
        }
        if (i15 != 2 && i15 != 3) {
            throw n23.j.m(mVar, 1931295036);
        }
        mVar.C(1931301381);
        mVar.f();
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f14372a.equals(sVar.f14372a) && this.f14373b.equals(sVar.f14373b) && Double.compare(this.f14374c, sVar.f14374c) == 0 && this.f14375d.equals(sVar.f14375d);
    }

    public final int hashCode() {
        return this.f14375d.hashCode() + org.apache.commons.lang3.e.b(wr.g.j(this.f14372a.hashCode() * 31, 31, this.f14373b), 31, this.f14374c);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("NutritionContentUIModel(servingId=", this.f14372a, ", servingUnit=", this.f14373b, ", numberOfUnits=");
        sbI.append(this.f14374c);
        sbI.append(", fullNutritionContent=");
        sbI.append(this.f14375d);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f14372a);
        parcel.writeString(this.f14373b);
        parcel.writeDouble(this.f14374c);
        this.f14375d.writeToParcel(parcel, i14);
    }
}

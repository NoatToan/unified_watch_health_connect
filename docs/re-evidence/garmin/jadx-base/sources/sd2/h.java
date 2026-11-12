package sd2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.maps.android.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class h implements Parcelable, i {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f158658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f158659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f158660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f158661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f158662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f158663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f158664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f158665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f158666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f158667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f158668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f158669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f158670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f158671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f158672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f158673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f158674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f158675r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Long f158676t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Integer f158677v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f158678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Long f158679x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Long f158680y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f158681z;

    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(Parcel parcel) {
        this.f158658a = null;
        this.f158659b = null;
        this.f158660c = null;
        this.f158661d = null;
        this.f158662e = null;
        this.f158663f = null;
        this.f158664g = null;
        this.f158665h = null;
        this.f158666i = null;
        this.f158667j = null;
        this.f158668k = null;
        this.f158669l = null;
        this.f158670m = null;
        this.f158671n = null;
        this.f158672o = null;
        this.f158673p = null;
        this.f158674q = null;
        this.f158675r = null;
        this.f158676t = null;
        this.f158677v = null;
        this.f158678w = null;
        this.f158679x = null;
        this.f158680y = null;
        this.f158681z = null;
        Long lValueOf = Long.valueOf(parcel.readLong());
        this.f158679x = lValueOf;
        this.f158679x = lValueOf.longValue() == 2147483647L ? null : this.f158679x;
        Integer numValueOf = Integer.valueOf(parcel.readInt());
        this.f158681z = numValueOf;
        this.f158681z = numValueOf.intValue() == Integer.MAX_VALUE ? null : this.f158681z;
        Integer numValueOf2 = Integer.valueOf(parcel.readInt());
        this.f158658a = numValueOf2;
        this.f158658a = numValueOf2.intValue() == Integer.MAX_VALUE ? null : this.f158658a;
        Integer numValueOf3 = Integer.valueOf(parcel.readInt());
        this.f158663f = numValueOf3;
        this.f158663f = numValueOf3.intValue() == Integer.MAX_VALUE ? null : this.f158663f;
        this.f158666i = parcel.readString();
        Integer numValueOf4 = Integer.valueOf(parcel.readInt());
        this.f158664g = numValueOf4;
        this.f158664g = numValueOf4.intValue() == Integer.MAX_VALUE ? null : this.f158664g;
        Integer numValueOf5 = Integer.valueOf(parcel.readInt());
        this.f158665h = numValueOf5;
        this.f158665h = numValueOf5.intValue() == Integer.MAX_VALUE ? null : this.f158665h;
        Long lValueOf2 = Long.valueOf(parcel.readLong());
        this.f158676t = lValueOf2;
        this.f158676t = lValueOf2.longValue() == 2147483647L ? null : this.f158676t;
        this.f158672o = parcel.readString();
        this.f158659b = parcel.readString();
        this.f158671n = parcel.readString();
        this.f158670m = parcel.readString();
        this.f158660c = parcel.readString();
        this.f158673p = parcel.readString();
        this.f158668k = parcel.readString();
        this.f158669l = parcel.readString();
        Integer numValueOf6 = Integer.valueOf(parcel.readInt());
        this.f158667j = numValueOf6;
        this.f158667j = numValueOf6.intValue() == Integer.MAX_VALUE ? null : this.f158667j;
        this.f158677v = Integer.valueOf(parcel.readInt());
        this.f158678w = Integer.valueOf(parcel.readInt());
        Long lValueOf3 = Long.valueOf(parcel.readLong());
        this.f158680y = lValueOf3;
        this.f158680y = lValueOf3.longValue() != 2147483647L ? this.f158680y : null;
        this.f158661d = parcel.readString();
        this.f158674q = parcel.readString();
        this.f158675r = Integer.valueOf(parcel.readInt());
    }

    @Override // sd2.i
    public final String b() {
        return this.f158670m;
    }

    @Override // sd2.i
    public final Long d() {
        return this.f158676t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // sd2.i
    public final String f() {
        return this.f158673p;
    }

    @Override // sd2.i
    public final Integer g() {
        return this.f158667j;
    }

    @Override // sd2.i
    public final String getCity() {
        return this.f158659b;
    }

    @Override // sd2.i
    public final String getCountry() {
        return this.f158660c;
    }

    @Override // sd2.i
    public final String getEmail() {
        return this.f158662e;
    }

    @Override // sd2.i
    public final String getName() {
        return this.f158666i;
    }

    @Override // sd2.i
    public final String getState() {
        return this.f158671n;
    }

    @Override // sd2.i
    public final Integer getVersion() {
        return this.f158675r;
    }

    @Override // sd2.i
    public final String h() {
        return this.f158668k;
    }

    @Override // sd2.i
    public final String i() {
        return this.f158669l;
    }

    @Override // sd2.i
    public final Integer j() {
        return this.f158658a;
    }

    @Override // sd2.i
    public final String k() {
        return this.f158661d;
    }

    @Override // sd2.i
    public final Long m() {
        return this.f158679x;
    }

    @Override // sd2.i
    public final Integer o() {
        return this.f158665h;
    }

    @Override // sd2.i
    public final Integer q() {
        return this.f158664g;
    }

    @Override // sd2.i
    public final Integer r() {
        return this.f158663f;
    }

    @Override // sd2.i
    public final Integer s() {
        return this.f158678w;
    }

    @Override // sd2.i
    public final String t() {
        return this.f158672o;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("androidDownloadID: ");
        Object obj = this.f158679x;
        Object obj2 = BuildConfig.TRAVIS;
        if (obj == null) {
            obj = BuildConfig.TRAVIS;
        }
        sb3.append(obj);
        sb3.append("\ndownloadMgrStatusReasonID: ");
        Object obj3 = this.f158681z;
        if (obj3 == null) {
            obj3 = BuildConfig.TRAVIS;
        }
        sb3.append(obj3);
        sb3.append("\nbuildID: ");
        Object obj4 = this.f158658a;
        if (obj4 == null) {
            obj4 = BuildConfig.TRAVIS;
        }
        sb3.append(obj4);
        sb3.append("\nglobalLayoutID: ");
        Object obj5 = this.f158663f;
        if (obj5 == null) {
            obj5 = BuildConfig.TRAVIS;
        }
        sb3.append(obj5);
        sb3.append("\nname: ");
        String str = this.f158666i;
        if (str == null) {
            str = BuildConfig.TRAVIS;
        }
        sb3.append(str);
        sb3.append("\nsemiCircleLatitude: ");
        Object obj6 = this.f158664g;
        if (obj6 == null) {
            obj6 = BuildConfig.TRAVIS;
        }
        sb3.append(obj6);
        sb3.append("\nsemiCircleLongitude: ");
        Object obj7 = this.f158665h;
        if (obj7 == null) {
            obj7 = BuildConfig.TRAVIS;
        }
        sb3.append(obj7);
        sb3.append("\ndistanceFromOrigin: ");
        Object obj8 = this.f158676t;
        if (obj8 == null) {
            obj8 = BuildConfig.TRAVIS;
        }
        sb3.append(obj8);
        sb3.append("\nstreet: ");
        String str2 = this.f158672o;
        if (str2 == null) {
            str2 = BuildConfig.TRAVIS;
        }
        sb3.append(str2);
        sb3.append("\ncity: ");
        String str3 = this.f158659b;
        if (str3 == null) {
            str3 = BuildConfig.TRAVIS;
        }
        sb3.append(str3);
        sb3.append("\npostalCode: ");
        String str4 = this.f158670m;
        if (str4 == null) {
            str4 = BuildConfig.TRAVIS;
        }
        sb3.append(str4);
        sb3.append("\ncountry: ");
        String str5 = this.f158660c;
        if (str5 == null) {
            str5 = BuildConfig.TRAVIS;
        }
        sb3.append(str5);
        sb3.append("\nwebsiteURL: ");
        String str6 = this.f158673p;
        if (str6 == null) {
            str6 = BuildConfig.TRAVIS;
        }
        sb3.append(str6);
        sb3.append("\ntelephone: ");
        String str7 = this.f158668k;
        if (str7 == null) {
            str7 = BuildConfig.TRAVIS;
        }
        sb3.append(str7);
        sb3.append("\ntelephoneExtension: ");
        String str8 = this.f158669l;
        if (str8 == null) {
            str8 = BuildConfig.TRAVIS;
        }
        sb3.append(str8);
        sb3.append("\nemail: ");
        String str9 = this.f158662e;
        if (str9 == null) {
            str9 = BuildConfig.TRAVIS;
        }
        sb3.append(str9);
        sb3.append("\nholeCount: ");
        Object obj9 = this.f158667j;
        if (obj9 == null) {
            obj9 = BuildConfig.TRAVIS;
        }
        sb3.append(obj9);
        sb3.append("\nmembershipType: ");
        Object obj10 = this.f158677v;
        if (obj10 == null) {
            obj10 = BuildConfig.TRAVIS;
        }
        sb3.append(obj10);
        sb3.append("\nstatusEnum: ");
        Object obj11 = this.f158678w;
        if (obj11 == null) {
            obj11 = BuildConfig.TRAVIS;
        }
        sb3.append(obj11);
        sb3.append("\nsavedTimestamp: ");
        sb3.append(this.f158680y != null ? new SimpleDateFormat("EEE, MMM d, yyyy hh:mm aa", Locale.ENGLISH).format(this.f158680y) : BuildConfig.TRAVIS);
        sb3.append("\ndesigner: ");
        String str10 = this.f158661d;
        if (str10 == null) {
            str10 = BuildConfig.TRAVIS;
        }
        sb3.append(str10);
        sb3.append("\nyearDesigned: ");
        String str11 = this.f158674q;
        if (str11 == null) {
            str11 = BuildConfig.TRAVIS;
        }
        sb3.append(str11);
        sb3.append("\nversion: ");
        Integer num = this.f158675r;
        if (num != null) {
            obj2 = num;
        }
        return am.j.k(obj2, "\n", sb3);
    }

    @Override // sd2.i
    public final Integer u() {
        return this.f158677v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        Long l14 = this.f158679x;
        parcel.writeLong(l14 == null ? 2147483647L : l14.longValue());
        Integer num = this.f158681z;
        parcel.writeInt(num == null ? Integer.MAX_VALUE : num.intValue());
        parcel.writeInt(this.f158658a.intValue());
        Integer num2 = this.f158663f;
        parcel.writeInt(num2 == null ? Integer.MAX_VALUE : num2.intValue());
        parcel.writeString(this.f158666i);
        Integer num3 = this.f158664g;
        parcel.writeInt(num3 == null ? Integer.MAX_VALUE : num3.intValue());
        Integer num4 = this.f158665h;
        parcel.writeInt(num4 == null ? Integer.MAX_VALUE : num4.intValue());
        Long l15 = this.f158676t;
        parcel.writeLong(l15 == null ? 2147483647L : l15.longValue());
        parcel.writeString(this.f158672o);
        parcel.writeString(this.f158659b);
        parcel.writeString(this.f158671n);
        parcel.writeString(this.f158670m);
        parcel.writeString(this.f158660c);
        parcel.writeString(this.f158673p);
        parcel.writeString(this.f158668k);
        parcel.writeString(this.f158669l);
        Integer num5 = this.f158667j;
        parcel.writeInt(num5 != null ? num5.intValue() : Integer.MAX_VALUE);
        parcel.writeInt(this.f158677v.intValue());
        parcel.writeInt(this.f158678w.intValue());
        Long l16 = this.f158680y;
        parcel.writeLong(l16 != null ? l16.longValue() : 2147483647L);
        parcel.writeString(this.f158661d);
        parcel.writeString(this.f158674q);
        parcel.writeInt(this.f158675r.intValue());
    }

    @Override // sd2.i
    public final String y() {
        return this.f158674q;
    }

    public h() {
        this.f158658a = null;
        this.f158659b = null;
        this.f158660c = null;
        this.f158661d = null;
        this.f158662e = null;
        this.f158663f = null;
        this.f158664g = null;
        this.f158665h = null;
        this.f158666i = null;
        this.f158667j = null;
        this.f158668k = null;
        this.f158669l = null;
        this.f158670m = null;
        this.f158671n = null;
        this.f158672o = null;
        this.f158673p = null;
        this.f158674q = null;
        this.f158675r = null;
        this.f158676t = null;
        this.f158677v = null;
        this.f158678w = null;
        this.f158679x = null;
        this.f158680y = null;
        this.f158681z = null;
    }
}

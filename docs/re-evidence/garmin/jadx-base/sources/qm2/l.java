package qm2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class l implements Parcelable {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final Parcelable.Creator<l> CREATOR;
    public static final l D;
    public static final l E;
    public static final l F;
    public static final l H0;
    public static final l I;
    public static final l P;
    public static final l T;
    public static final l X;
    public static final l Y;
    public static final l Z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f145741h = b.b().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f145742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f145743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f145744k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final l f145745k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l f145746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l f145747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f145748n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l f145749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l f145750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l f145751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f145752r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f145753t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f145754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l f145755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l f145756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final l f145757y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final l f145758z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f145759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f145762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f145763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f145764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f145765g;

    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public enum c {
        INITIALIZE_ONLY,
        RESPECT_PERMISSION,
        ALWAYS_ON,
        ALWAYS_OFF
    }

    static {
        b bVar = new b(0);
        c cVar = c.ALWAYS_ON;
        bVar.d(cVar, null);
        f145742i = bVar.a();
        b bVarB = b.b();
        bVarB.f145770e = 3;
        bVarB.f145767b = false;
        c cVar2 = c.RESPECT_PERMISSION;
        Boolean bool = Boolean.TRUE;
        bVarB.d(cVar2, bool);
        c cVar3 = c.ALWAYS_OFF;
        bVarB.e(cVar3, null);
        f145745k0 = bVarB.a();
        b bVarB2 = b.b();
        bVarB2.f145770e = 3;
        bVarB2.f145772g = 3;
        bVarB2.f145767b = false;
        bVarB2.d(cVar2, bool);
        bVarB2.e(cVar3, null);
        H0 = bVarB2.a();
        b bVarB3 = b.b();
        bVarB3.f145770e = 3;
        bVarB3.f145769d = 3;
        Z = bVarB3.a();
        b bVarB4 = b.b();
        bVarB4.f145770e = 3;
        bVarB4.f145772g = 3;
        bVarB4.f145767b = false;
        bVarB4.d(cVar2, bool);
        bVarB4.f145769d = 2;
        Y = bVarB4.a();
        b bVarB5 = b.b();
        bVarB5.f145770e = 3;
        X = bVarB5.a();
        b bVarB6 = b.b();
        bVarB6.d(cVar2, bool);
        bVarB6.f145770e = 3;
        bVarB6.f145767b = false;
        f145743j = bVarB6.a();
        b bVarB7 = b.b();
        bVarB7.f145769d = 2;
        bVarB7.d(cVar2, bool);
        l lVarA = bVarB7.a();
        f145744k = lVarA;
        b bVarC = b.c(lVarA);
        bVarC.f(cVar, null);
        f145746l = bVarC.a();
        b bVarB8 = b.b();
        bVarB8.d(cVar2, bool);
        bVarB8.f(cVar, null);
        f145747m = bVarB8.a();
        b bVarB9 = b.b();
        bVarB9.f145771f = true;
        l lVarA2 = bVarB9.a();
        f145748n = lVarA2;
        b bVarC2 = b.c(lVarA2);
        bVarC2.f145772g = 2;
        l lVarA3 = bVarC2.a();
        f145749o = lVarA3;
        b bVarC3 = b.c(lVarA3);
        bVarC3.f(cVar, bool);
        c cVar4 = c.INITIALIZE_ONLY;
        Boolean bool2 = Boolean.FALSE;
        bVarC3.e(cVar4, bool2);
        f145750p = bVarC3.a();
        b bVarB10 = b.b();
        bVarB10.f145770e = 3;
        bVarB10.f145771f = true;
        f145752r = bVarB10.a();
        b bVarB11 = b.b();
        bVarB11.f(cVar2, bool);
        bVarB11.f145771f = true;
        f145751q = bVarB11.a();
        b bVarB12 = b.b();
        bVarB12.d(cVar2, bool);
        bVarB12.f(cVar, null);
        bVarB12.e(cVar4, bool2);
        f145754v = bVarB12.a();
        b bVarB13 = b.b();
        bVarB13.f145772g = 3;
        bVarB13.f145767b = false;
        bVarB13.f145770e = 3;
        bVarB13.d(cVar2, bool);
        bVarB13.f(cVar, null);
        l lVarA4 = bVarB13.a();
        f145755w = lVarA4;
        b bVarC4 = b.c(lVarA4);
        bVarC4.f145769d = 2;
        f145756x = bVarC4.a();
        f145757y = lVarA4;
        b bVarC5 = b.c(lVarA4);
        bVarC5.d(cVar, bool);
        A = bVarC5.a();
        b bVarC6 = b.c(lVarA4);
        bVarC6.d(cVar, bool);
        bVarC6.f145770e = 1;
        bVarC6.e(cVar, bool2);
        bVarC6.f(cVar, null);
        B = bVarC6.a();
        b bVarC7 = b.c(lVarA4);
        bVarC7.f145770e = 1;
        bVarC7.d(cVar2, bool);
        bVarC7.f(cVar, null);
        bVarC7.e(cVar4, bool2);
        f145758z = bVarC7.a();
        b bVarB14 = b.b();
        bVarB14.f145770e = 3;
        bVarB14.f145772g = 3;
        bVarB14.f145767b = false;
        bVarB14.f145771f = true;
        bVarB14.d(cVar2, bool);
        bVarB14.f145769d = 3;
        f145753t = bVarB14.a();
        b bVarB15 = b.b();
        bVarB15.f145770e = 3;
        bVarB15.f145767b = false;
        bVarB15.d(cVar2, bool);
        bVarB15.f(cVar2, bool2);
        bVarB15.e(cVar4, bool);
        l lVarA5 = bVarB15.a();
        C = lVarA5;
        b bVarC8 = b.c(lVarA5);
        bVarC8.f(cVar, bool);
        T = bVarC8.a();
        D = lVarA5;
        b bVarC9 = b.c(lVarA5);
        bVarC9.f(cVar4, bool);
        l lVarA6 = bVarC9.a();
        F = lVarA6;
        b bVarC10 = b.c(lVarA6);
        bVarC10.f145769d = 2;
        I = bVarC10.a();
        b bVarB16 = b.b();
        bVarB16.f145770e = 3;
        bVarB16.f145767b = false;
        bVarB16.d(cVar2, bool);
        bVarB16.f(cVar2, bool);
        bVarB16.e(cVar2, bool);
        l lVarA7 = bVarB16.a();
        E = lVarA7;
        b bVarC11 = b.c(lVarA7);
        bVarC11.f145769d = 2;
        P = bVarC11.a();
        CREATOR = new a();
    }

    public l(Parcel parcel) {
        this.f145760b = parcel.readByte() != 0;
        this.f145761c = parcel.readByte() != 0;
        this.f145762d = parcel.readInt();
        this.f145763e = parcel.readInt();
        this.f145764f = parcel.readByte() != 0;
        this.f145765g = parcel.readInt();
        this.f145759a = (n) parcel.readParcelable(n.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f145761c == lVar.f145761c && this.f145760b == lVar.f145760b && this.f145762d == lVar.f145762d && this.f145763e == lVar.f145763e && this.f145764f == lVar.f145764f && this.f145765g == lVar.f145765g && Objects.equals(this.f145759a, lVar.f145759a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f145761c), Boolean.valueOf(this.f145760b), Integer.valueOf(this.f145762d), Integer.valueOf(this.f145763e), Boolean.valueOf(this.f145764f), Integer.valueOf(this.f145765g), this.f145759a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeByte(this.f145760b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f145761c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f145762d);
        parcel.writeInt(this.f145763e);
        parcel.writeByte(this.f145764f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f145765g);
        parcel.writeParcelable(this.f145759a, i14);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f145766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f145767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f145768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f145769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f145770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f145771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f145772g;

        private b(l lVar) {
            this.f145766a = new n();
            this.f145766a = lVar.f145759a.b();
            this.f145767b = lVar.f145761c;
            this.f145768c = lVar.f145760b;
        }

        public static b b() {
            b bVar = new b();
            bVar.f145770e = 1;
            bVar.f145772g = 1;
            bVar.f145767b = true;
            bVar.f145769d = 1;
            bVar.d(c.ALWAYS_ON, null);
            bVar.f(c.ALWAYS_OFF, null);
            return bVar;
        }

        public static b c(l lVar) {
            b bVar = new b(lVar);
            bVar.f145769d = lVar.f145762d;
            bVar.f145770e = lVar.f145763e;
            bVar.f145771f = lVar.f145764f;
            bVar.f145772g = lVar.f145765g;
            return bVar;
        }

        public final l a() {
            return new l(this, 0);
        }

        public final void d(c cVar, Boolean bool) {
            this.f145766a.f145780a.put(1, new m(cVar, bool));
        }

        public final void e(c cVar, Boolean bool) {
            this.f145766a.f145780a.put(3, new m(cVar, bool));
        }

        public final void f(c cVar, Boolean bool) {
            this.f145766a.f145780a.put(2, new m(cVar, bool));
        }

        private b() {
            this.f145766a = new n();
        }

        public /* synthetic */ b(int i14) {
            this();
        }
    }

    private l(b bVar) {
        this.f145759a = bVar.f145766a.b();
        this.f145760b = bVar.f145768c;
        this.f145761c = bVar.f145767b;
        this.f145762d = bVar.f145769d;
        this.f145763e = bVar.f145770e;
        this.f145764f = bVar.f145771f;
        this.f145765g = bVar.f145772g;
    }

    public /* synthetic */ l(b bVar, int i14) {
        this(bVar);
    }
}

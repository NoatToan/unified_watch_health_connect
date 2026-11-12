package o90;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import i63.h;
import l63.d;
import l63.f;
import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import o72.v3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lo90/a;", "Landroid/os/Parcelable;", "", "imageUrl", "", "imageRes", "defaultWatchFaceBlankImage", "defaultWatchFaceImage", "option1Image", "option2Image", "option3Image", "sideProfileImage", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f130961j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f130963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f130964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f130965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f130966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f130967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f130968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f130969h;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f130960i = 8;

    /* JADX INFO: renamed from: o90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/model/DeviceImageData.$serializer", "Lm63/e0;", "Lo90/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C2487a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2487a f130970a;
        private static final k63.e descriptor;

        static {
            C2487a c2487a = new C2487a();
            f130970a = c2487a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.model.DeviceImageData", c2487a, 8);
            m1Var.j("imageUrl", true);
            m1Var.j("imageRes", true);
            m1Var.j("defaultWatchFaceBlankImage", true);
            m1Var.j("defaultWatchFaceImage", true);
            m1Var.j("option1Image", true);
            m1Var.j("option2Image", true);
            m1Var.j("option3Image", true);
            m1Var.j("sideProfileImage", true);
            descriptor = m1Var;
        }

        private C2487a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = a.f130961j;
            return new i63.c[]{j63.a.d(lVarArr[0].getValue()), j63.a.d(m0.f116981a), j63.a.d(lVarArr[2].getValue()), j63.a.d(lVarArr[3].getValue()), j63.a.d(lVarArr[4].getValue()), j63.a.d(lVarArr[5].getValue()), j63.a.d(lVarArr[6].getValue()), j63.a.d(lVarArr[7].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = a.f130961j;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            int i15 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        str2 = (String) cVarC.v(eVar2, 0, lVarArr[0].getValue(), str2);
                        i15 |= 1;
                        break;
                    case 1:
                        num = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num);
                        i15 |= 2;
                        break;
                    case 2:
                        str3 = (String) cVarC.v(eVar2, 2, lVarArr[2].getValue(), str3);
                        i15 |= 4;
                        break;
                    case 3:
                        str4 = (String) cVarC.v(eVar2, 3, lVarArr[3].getValue(), str4);
                        i15 |= 8;
                        break;
                    case 4:
                        str5 = (String) cVarC.v(eVar2, 4, lVarArr[4].getValue(), str5);
                        i15 |= 16;
                        break;
                    case 5:
                        str6 = (String) cVarC.v(eVar2, 5, lVarArr[5].getValue(), str6);
                        i15 |= 32;
                        break;
                    case 6:
                        str7 = (String) cVarC.v(eVar2, 6, lVarArr[6].getValue(), str7);
                        i15 |= 64;
                        break;
                    case 7:
                        str = (String) cVarC.v(eVar2, 7, lVarArr[7].getValue(), str);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new a(i15, str2, num, str3, str4, str5, str6, str7, str, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            String str = aVar.f130969h;
            String str2 = aVar.f130968g;
            String str3 = aVar.f130967f;
            String str4 = aVar.f130966e;
            String str5 = aVar.f130965d;
            String str6 = aVar.f130964c;
            Integer num = aVar.f130963b;
            String str7 = aVar.f130962a;
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = a.f130961j;
            if (dVarC.C(eVar) || str7 != null) {
                dVarC.d(eVar, 0, lVarArr[0].getValue(), str7);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 1, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || str6 != null) {
                dVarC.d(eVar, 2, lVarArr[2].getValue(), str6);
            }
            if (dVarC.C(eVar) || str5 != null) {
                dVarC.d(eVar, 3, lVarArr[3].getValue(), str5);
            }
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 4, lVarArr[4].getValue(), str4);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 5, lVarArr[5].getValue(), str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 6, lVarArr[6].getValue(), str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 7, lVarArr[7].getValue(), str);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f130961j = new l[]{m.a(nVar, new v3(19)), null, m.a(nVar, new v3(20)), m.a(nVar, new v3(21)), m.a(nVar, new v3(22)), m.a(nVar, new v3(23)), m.a(nVar, new v3(24)), m.a(nVar, new v3(25))};
    }

    public /* synthetic */ a(int i14, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f130962a = null;
        } else {
            this.f130962a = str;
        }
        if ((i14 & 2) == 0) {
            this.f130963b = null;
        } else {
            this.f130963b = num;
        }
        if ((i14 & 4) == 0) {
            this.f130964c = null;
        } else {
            this.f130964c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f130965d = null;
        } else {
            this.f130965d = str3;
        }
        if ((i14 & 16) == 0) {
            this.f130966e = null;
        } else {
            this.f130966e = str4;
        }
        if ((i14 & 32) == 0) {
            this.f130967f = null;
        } else {
            this.f130967f = str5;
        }
        if ((i14 & 64) == 0) {
            this.f130968g = null;
        } else {
            this.f130968g = str6;
        }
        if ((i14 & 128) == 0) {
            this.f130969h = null;
        } else {
            this.f130969h = str7;
        }
    }

    public static a b(a aVar, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, int i14) {
        if ((i14 & 1) != 0) {
            str = aVar.f130962a;
        }
        String str8 = str;
        if ((i14 & 2) != 0) {
            num = aVar.f130963b;
        }
        Integer num2 = num;
        if ((i14 & 4) != 0) {
            str2 = aVar.f130964c;
        }
        String str9 = str2;
        if ((i14 & 8) != 0) {
            str3 = aVar.f130965d;
        }
        String str10 = str3;
        if ((i14 & 16) != 0) {
            str4 = aVar.f130966e;
        }
        String str11 = str4;
        if ((i14 & 32) != 0) {
            str5 = aVar.f130967f;
        }
        String str12 = str5;
        String str13 = (i14 & 64) != 0 ? aVar.f130968g : str6;
        String str14 = (i14 & 128) != 0 ? aVar.f130969h : str7;
        aVar.getClass();
        return new a(str8, num2, str9, str10, str11, str12, str13, str14);
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
        return s.g(this.f130962a, aVar.f130962a) && s.g(this.f130963b, aVar.f130963b) && s.g(this.f130964c, aVar.f130964c) && s.g(this.f130965d, aVar.f130965d) && s.g(this.f130966e, aVar.f130966e) && s.g(this.f130967f, aVar.f130967f) && s.g(this.f130968g, aVar.f130968g) && s.g(this.f130969h, aVar.f130969h);
    }

    public final int hashCode() {
        String str = this.f130962a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f130963b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f130964c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f130965d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f130966e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f130967f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f130968g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f130969h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = u0.n("DeviceImageData(imageUrl=", this.f130963b, this.f130962a, ", imageRes=", ", defaultWatchFaceBlankImage=");
        sn.a.t(sbN, this.f130964c, ", defaultWatchFaceImage=", this.f130965d, ", option1Image=");
        sn.a.t(sbN, this.f130966e, ", option2Image=", this.f130967f, ", option3Image=");
        return e5.h(sbN, this.f130968g, ", sideProfileImage=", this.f130969h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f130962a);
        Integer num = this.f130963b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f130964c);
        parcel.writeString(this.f130965d);
        parcel.writeString(this.f130966e);
        parcel.writeString(this.f130967f);
        parcel.writeString(this.f130968g);
        parcel.writeString(this.f130969h);
    }

    /* JADX INFO: renamed from: o90.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo90/a$b;", "", "<init>", "()V", "Li63/c;", "Lo90/a;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C2487a.f130970a;
        }

        private Companion() {
        }
    }

    public a() {
        this((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (j) null);
    }

    public a(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f130962a = str;
        this.f130963b = num;
        this.f130964c = str2;
        this.f130965d = str3;
        this.f130966e = str4;
        this.f130967f = str5;
        this.f130968g = str6;
        this.f130969h = str7;
    }

    public /* synthetic */ a(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7);
    }
}

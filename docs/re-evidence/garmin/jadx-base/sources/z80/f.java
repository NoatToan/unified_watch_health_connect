package z80;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.devices.model.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017Bm\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, d2 = {"Lz80/f;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/devices/model/w;", "supportedLanguages", "", "languageId", "", "displayOrientation", "mountingSide", "screenOrientation", "", "metricsFileTrueUpEnabled", "dndEnabled", "autoActivityDetectEnabledV2", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<w> f203043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f203044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f203045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f203046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f203047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f203048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f203049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f203050h;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<f> CREATOR = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f203042i = {o13.m.a(o13.n.PUBLICATION, new z41.j(20)), null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/data/model/DeviceSettingsMiniDTO.$serializer", "Lm63/e0;", "Lz80/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f203051a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f203051a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.data.model.DeviceSettingsMiniDTO", aVar, 8);
            m1Var.j("supportedLanguages", true);
            m1Var.j("language", true);
            m1Var.j("displayOrientation", true);
            m1Var.j("mountingSide", true);
            m1Var.j("screenOrientation", true);
            m1Var.j("metricsFileTrueupEnabled", true);
            m1Var.j("dndEnabled", true);
            m1Var.j("autoActivityDetectEnabledV2", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(f.f203042i[0].getValue());
            i63.c<?> cVarD2 = j63.a.d(m0.f116981a);
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD3 = j63.a.d(y1Var);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            i63.c<?> cVarD5 = j63.a.d(y1Var);
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = f.f203042i;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            Boolean bool = null;
            List list = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            int i15 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        list = (List) cVarC.v(eVar2, 0, lVarArr[0].getValue(), list);
                        i15 |= 1;
                        break;
                    case 1:
                        num = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num);
                        i15 |= 2;
                        break;
                    case 2:
                        str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                        i15 |= 4;
                        break;
                    case 3:
                        str2 = (String) cVarC.v(eVar2, 3, y1.f117048a, str2);
                        i15 |= 8;
                        break;
                    case 4:
                        str3 = (String) cVarC.v(eVar2, 4, y1.f117048a, str3);
                        i15 |= 16;
                        break;
                    case 5:
                        bool2 = (Boolean) cVarC.v(eVar2, 5, m63.g.f116948a, bool2);
                        i15 |= 32;
                        break;
                    case 6:
                        bool3 = (Boolean) cVarC.v(eVar2, 6, m63.g.f116948a, bool3);
                        i15 |= 64;
                        break;
                    case 7:
                        bool = (Boolean) cVarC.v(eVar2, 7, m63.g.f116948a, bool);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new f(i15, list, num, str, str2, str3, bool2, bool3, bool, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            f fVar2 = (f) obj;
            fVar2.getClass();
            Boolean bool = fVar2.f203050h;
            Boolean bool2 = fVar2.f203049g;
            Boolean bool3 = fVar2.f203048f;
            String str = fVar2.f203047e;
            String str2 = fVar2.f203046d;
            String str3 = fVar2.f203045c;
            Integer num = fVar2.f203044b;
            List<w> list = fVar2.f203043a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = f.f203042i;
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 0, lVarArr[0].getValue(), list);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 1, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 2, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 3, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 4, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || bool3 != null) {
                dVarC.d(eVar, 5, m63.g.f116948a, bool3);
            }
            if (dVarC.C(eVar) || bool2 != null) {
                dVarC.d(eVar, 6, m63.g.f116948a, bool2);
            }
            if (dVarC.C(eVar) || bool != null) {
                dVarC.d(eVar, 7, m63.g.f116948a, bool);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            Boolean boolValueOf3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(f.class, parcel, arrayList, iD, 1);
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new f(arrayList, numValueOf, string, string2, string3, boolValueOf, boolValueOf2, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(int i14, List list, Integer num, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f203043a = null;
        } else {
            this.f203043a = list;
        }
        if ((i14 & 2) == 0) {
            this.f203044b = null;
        } else {
            this.f203044b = num;
        }
        if ((i14 & 4) == 0) {
            this.f203045c = null;
        } else {
            this.f203045c = str;
        }
        if ((i14 & 8) == 0) {
            this.f203046d = null;
        } else {
            this.f203046d = str2;
        }
        if ((i14 & 16) == 0) {
            this.f203047e = null;
        } else {
            this.f203047e = str3;
        }
        if ((i14 & 32) == 0) {
            this.f203048f = null;
        } else {
            this.f203048f = bool;
        }
        if ((i14 & 64) == 0) {
            this.f203049g = null;
        } else {
            this.f203049g = bool2;
        }
        if ((i14 & 128) == 0) {
            this.f203050h = null;
        } else {
            this.f203050h = bool3;
        }
    }

    public static f b(f fVar, List list, Integer num, String str, String str2, String str3, Boolean bool, Boolean bool2, int i14) {
        if ((i14 & 1) != 0) {
            list = fVar.f203043a;
        }
        List list2 = list;
        if ((i14 & 2) != 0) {
            num = fVar.f203044b;
        }
        Integer num2 = num;
        if ((i14 & 4) != 0) {
            str = fVar.f203045c;
        }
        String str4 = str;
        if ((i14 & 8) != 0) {
            str2 = fVar.f203046d;
        }
        String str5 = str2;
        if ((i14 & 16) != 0) {
            str3 = fVar.f203047e;
        }
        String str6 = str3;
        if ((i14 & 32) != 0) {
            bool = fVar.f203048f;
        }
        Boolean bool3 = bool;
        Boolean bool4 = (i14 & 64) != 0 ? fVar.f203049g : bool2;
        Boolean bool5 = fVar.f203050h;
        fVar.getClass();
        return new f(list2, num2, str4, str5, str6, bool3, bool4, bool5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f203043a, fVar.f203043a) && s.g(this.f203044b, fVar.f203044b) && s.g(this.f203045c, fVar.f203045c) && s.g(this.f203046d, fVar.f203046d) && s.g(this.f203047e, fVar.f203047e) && s.g(this.f203048f, fVar.f203048f) && s.g(this.f203049g, fVar.f203049g) && s.g(this.f203050h, fVar.f203050h);
    }

    public final int hashCode() {
        List<w> list = this.f203043a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f203044b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f203045c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f203046d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f203047e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f203048f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f203049g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f203050h;
        return iHashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceSettingsMiniDTO(supportedLanguages=");
        sb3.append(this.f203043a);
        sb3.append(", languageId=");
        sb3.append(this.f203044b);
        sb3.append(", displayOrientation=");
        sn.a.t(sb3, this.f203045c, ", mountingSide=", this.f203046d, ", screenOrientation=");
        b71.i.w(sb3, this.f203047e, ", metricsFileTrueUpEnabled=", this.f203048f, ", dndEnabled=");
        sb3.append(this.f203049g);
        sb3.append(", autoActivityDetectEnabledV2=");
        sb3.append(this.f203050h);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<w> list = this.f203043a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        Integer num = this.f203044b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f203045c);
        parcel.writeString(this.f203046d);
        parcel.writeString(this.f203047e);
        Boolean bool = this.f203048f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.f203049g;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.f203050h;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
    }

    /* JADX INFO: renamed from: z80.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/f$b;", "", "<init>", "()V", "Li63/c;", "Lz80/f;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f203051a;
        }

        private Companion() {
        }
    }

    public f() {
        this((List) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, 255, (p005kotlin.jvm.internal.j) null);
    }

    public f(List<w> list, Integer num, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f203043a = list;
        this.f203044b = num;
        this.f203045c = str;
        this.f203046d = str2;
        this.f203047e = str3;
        this.f203048f = bool;
        this.f203049g = bool2;
        this.f203050h = bool3;
    }

    public /* synthetic */ f(List list, Integer num, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : bool, (i14 & 64) != 0 ? null : bool2, (i14 & 128) != 0 ? null : bool3);
    }
}

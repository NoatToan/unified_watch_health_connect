package ir0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.j;
import g22.k;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u0081\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015¨\u0006\u0019"}, d2 = {"Lir0/f;", "Landroid/os/Parcelable;", "", "calendarDate", "", "weeklyGoal", "moderateValue", "vigorousValue", "moderateMinutes", "vigorousMinutes", "timezoneOffset", "startTimestampGMT", "endTimestampGMT", "", "Lir0/g;", "hourlyValues", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "b", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f94798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f94799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f94800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f94801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f94802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f94803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f94804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<g> f94805j;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<f> CREATOR = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f94795k = {null, null, null, null, null, null, null, null, null, m.a(n.PUBLICATION, new ik2.b(6))};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/intensityminutes/data/model/IntensityMinutesSummaryDTO.$serializer", "Lm63/e0;", "Lir0/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f94806a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f94806a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.intensityminutes.data.model.IntensityMinutesSummaryDTO", aVar, 10);
            m1Var.j("calendarDate", true);
            m1Var.j("weeklyGoal", true);
            m1Var.j("moderateValue", true);
            m1Var.j("vigorousValue", true);
            m1Var.j("moderateMinutes", true);
            m1Var.j("vigorousMinutes", true);
            m1Var.j("timezoneOffset", true);
            m1Var.j("startTimestampGMT", true);
            m1Var.j("endTimestampGMT", true);
            m1Var.j("hourlyValues", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = f.f94795k;
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, m0Var, j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var), m0Var, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[9].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = f.f94795k;
            int i14 = l63.c.f110557a;
            List list = null;
            String str = null;
            boolean z14 = true;
            String str2 = null;
            int i15 = 0;
            String str3 = null;
            int iA = 0;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            int iA2 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        str3 = (String) cVarC.v(eVar2, 0, y1.f117048a, str3);
                        i15 |= 1;
                        break;
                    case 1:
                        iA = cVarC.A(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        num = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num);
                        i15 |= 4;
                        break;
                    case 3:
                        num2 = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num2);
                        i15 |= 8;
                        break;
                    case 4:
                        num3 = (Integer) cVarC.v(eVar2, 4, m0.f116981a, num3);
                        i15 |= 16;
                        break;
                    case 5:
                        num4 = (Integer) cVarC.v(eVar2, 5, m0.f116981a, num4);
                        i15 |= 32;
                        break;
                    case 6:
                        iA2 = cVarC.A(eVar2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        str2 = (String) cVarC.v(eVar2, 7, y1.f117048a, str2);
                        i15 |= 128;
                        break;
                    case 8:
                        str = (String) cVarC.v(eVar2, 8, y1.f117048a, str);
                        i15 |= 256;
                        break;
                    case 9:
                        list = (List) cVarC.v(eVar2, 9, lVarArr[9].getValue(), list);
                        i15 |= 512;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
                lVarArr = lVarArr;
            }
            cVarC.b(eVar2);
            return new f(i15, str3, iA, num, num2, num3, num4, iA2, str2, str, list, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            f fVar2 = (f) obj;
            fVar2.getClass();
            List<g> list = fVar2.f94805j;
            String str = fVar2.f94804i;
            String str2 = fVar2.f94803h;
            int i14 = fVar2.f94802g;
            Integer num = fVar2.f94801f;
            Integer num2 = fVar2.f94800e;
            Integer num3 = fVar2.f94799d;
            Integer num4 = fVar2.f94798c;
            int i15 = fVar2.f94797b;
            String str3 = fVar2.f94796a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = f.f94795k;
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 0, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || i15 != 0) {
                dVarC.v(1, i15, eVar);
            }
            if (dVarC.C(eVar) || num4 != null) {
                dVarC.d(eVar, 2, m0.f116981a, num4);
            }
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 3, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 4, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 5, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || i14 != 0) {
                dVarC.v(6, i14, eVar);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 7, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 8, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 9, lVarArr[9].getValue(), list);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i15 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i16 = parcel.readInt();
                arrayList = new ArrayList(i16);
                int iA = 0;
                while (iA != i16) {
                    iA = kg.f.a(g.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new f(string, i14, numValueOf, numValueOf2, numValueOf3, numValueOf4, i15, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(int i14, String str, int i15, Integer num, Integer num2, Integer num3, Integer num4, int i16, String str2, String str3, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f94796a = null;
        } else {
            this.f94796a = str;
        }
        if ((i14 & 2) == 0) {
            this.f94797b = 0;
        } else {
            this.f94797b = i15;
        }
        if ((i14 & 4) == 0) {
            this.f94798c = null;
        } else {
            this.f94798c = num;
        }
        if ((i14 & 8) == 0) {
            this.f94799d = null;
        } else {
            this.f94799d = num2;
        }
        if ((i14 & 16) == 0) {
            this.f94800e = null;
        } else {
            this.f94800e = num3;
        }
        if ((i14 & 32) == 0) {
            this.f94801f = null;
        } else {
            this.f94801f = num4;
        }
        if ((i14 & 64) == 0) {
            this.f94802g = 0;
        } else {
            this.f94802g = i16;
        }
        if ((i14 & 128) == 0) {
            this.f94803h = null;
        } else {
            this.f94803h = str2;
        }
        if ((i14 & 256) == 0) {
            this.f94804i = null;
        } else {
            this.f94804i = str3;
        }
        if ((i14 & 512) == 0) {
            this.f94805j = null;
        } else {
            this.f94805j = list;
        }
    }

    public final LocalDate b() {
        String str = this.f94796a;
        if (str != null) {
            return k.w(str, "yyyy-MM-dd");
        }
        return null;
    }

    public final Integer d() {
        Integer num = this.f94798c;
        return num == null ? this.f94800e : num;
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
        return s.g(this.f94796a, fVar.f94796a) && this.f94797b == fVar.f94797b && s.g(this.f94798c, fVar.f94798c) && s.g(this.f94799d, fVar.f94799d) && s.g(this.f94800e, fVar.f94800e) && s.g(this.f94801f, fVar.f94801f) && this.f94802g == fVar.f94802g && s.g(this.f94803h, fVar.f94803h) && s.g(this.f94804i, fVar.f94804i) && s.g(this.f94805j, fVar.f94805j);
    }

    public final Integer f() {
        if (d() == null && g() == null) {
            return null;
        }
        Integer numD = d();
        Integer numValueOf = Integer.valueOf(numD != null ? numD.intValue() : 0);
        Integer numG = g();
        return Integer.valueOf(oe2.f.y(numValueOf, Integer.valueOf(numG != null ? numG.intValue() : 0)));
    }

    public final Integer g() {
        Integer num = this.f94799d;
        return num == null ? this.f94801f : num;
    }

    public final int hashCode() {
        String str = this.f94796a;
        int iD = q2.d(this.f94797b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Integer num = this.f94798c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f94799d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f94800e;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f94801f;
        int iD2 = q2.d(this.f94802g, (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31, 31);
        String str2 = this.f94803h;
        int iHashCode4 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94804i;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<g> list = this.f94805j;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = j.k(this.f94797b, "IntensityMinutesSummaryDTO(calendarDate=", this.f94796a, ", weeklyGoal=", ", moderateValue=");
        x.m(sbK, this.f94798c, ", vigorousValue=", this.f94799d, ", moderateMinutes=");
        x.m(sbK, this.f94800e, ", vigorousMinutes=", this.f94801f, ", timezoneOffset=");
        wr.g.t(this.f94802g, ", startTimestampGMT=", this.f94803h, ", endTimestampGMT=", sbK);
        sbK.append(this.f94804i);
        sbK.append(", hourlyValues=");
        sbK.append(this.f94805j);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f94796a);
        parcel.writeInt(this.f94797b);
        Integer num = this.f94798c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.f94799d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.f94800e;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.f94801f;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        parcel.writeInt(this.f94802g);
        parcel.writeString(this.f94803h);
        parcel.writeString(this.f94804i);
        List<g> list = this.f94805j;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((g) itO.next()).writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: ir0.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lir0/f$b;", "", "<init>", "()V", "Li63/c;", "Lir0/f;", "serializer", "()Li63/c;", "", "DATE_FORMAT", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f94806a;
        }

        private Companion() {
        }
    }

    public f() {
        this((String) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0, (String) null, (String) null, (List) null, 1023, (p005kotlin.jvm.internal.j) null);
    }

    public f(String str, int i14, Integer num, Integer num2, Integer num3, Integer num4, int i15, String str2, String str3, List<g> list) {
        this.f94796a = str;
        this.f94797b = i14;
        this.f94798c = num;
        this.f94799d = num2;
        this.f94800e = num3;
        this.f94801f = num4;
        this.f94802g = i15;
        this.f94803h = str2;
        this.f94804i = str3;
        this.f94805j = list;
    }

    public /* synthetic */ f(String str, int i14, Integer num, Integer num2, Integer num3, Integer num4, int i15, String str2, String str3, List list, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? null : num, (i16 & 8) != 0 ? null : num2, (i16 & 16) != 0 ? null : num3, (i16 & 32) != 0 ? null : num4, (i16 & 64) != 0 ? 0 : i15, (i16 & 128) != 0 ? null : str2, (i16 & 256) != 0 ? null : str3, (i16 & 512) != 0 ? null : list);
    }
}

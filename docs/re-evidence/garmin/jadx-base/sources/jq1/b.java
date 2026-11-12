package jq1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.e5;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u007f\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, d2 = {"Ljq1/b;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "date", "", "steps", "", "calories", "distance", "stepGoal", "startTimeGmt", "startTimeLocal", "endTimeGmt", "endTimeLocal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f99981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f99982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f99983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f99984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f99985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f99986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f99987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f99988j;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/steps/data/model/DailyStepsDTO.$serializer", "Lm63/e0;", "Ljq1/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99989a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f99989a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.steps.data.model.DailyStepsDTO", aVar, 10);
            m1Var.j("userProfileId", true);
            m1Var.j("calendarDate", true);
            m1Var.j("totalSteps", true);
            m1Var.j("totalKilocalories", true);
            m1Var.j("wellnessDistanceMeters", true);
            m1Var.j("dailyStepGoal", true);
            m1Var.j("wellnessStartTimeGmt", true);
            m1Var.j("wellnessStartTimeLocal", true);
            m1Var.j("wellnessEndTimeGmt", true);
            m1Var.j("wellnessEndTimeLocal", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, j63.a.d(m0Var), j63.a.d(x.f117036a), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            String str = null;
            boolean z14 = true;
            String str2 = null;
            int i15 = 0;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            Double d14 = null;
            Integer num2 = null;
            Integer num3 = null;
            String str5 = null;
            String str6 = null;
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
                        str4 = (String) cVarC.v(eVar2, 1, y1.f117048a, str4);
                        i15 |= 2;
                        break;
                    case 2:
                        num = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num);
                        i15 |= 4;
                        break;
                    case 3:
                        d14 = (Double) cVarC.v(eVar2, 3, x.f117036a, d14);
                        i15 |= 8;
                        break;
                    case 4:
                        num2 = (Integer) cVarC.v(eVar2, 4, m0.f116981a, num2);
                        i15 |= 16;
                        break;
                    case 5:
                        num3 = (Integer) cVarC.v(eVar2, 5, m0.f116981a, num3);
                        i15 |= 32;
                        break;
                    case 6:
                        str5 = (String) cVarC.v(eVar2, 6, y1.f117048a, str5);
                        i15 |= 64;
                        break;
                    case 7:
                        str6 = (String) cVarC.v(eVar2, 7, y1.f117048a, str6);
                        i15 |= 128;
                        break;
                    case 8:
                        str2 = (String) cVarC.v(eVar2, 8, y1.f117048a, str2);
                        i15 |= 256;
                        break;
                    case 9:
                        str = (String) cVarC.v(eVar2, 9, y1.f117048a, str);
                        i15 |= 512;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, str3, str4, num, d14, num2, num3, str5, str6, str2, str, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            String str = bVar.f99988j;
            String str2 = bVar.f99987i;
            String str3 = bVar.f99986h;
            String str4 = bVar.f99985g;
            Integer num = bVar.f99984f;
            Integer num2 = bVar.f99983e;
            Double d14 = bVar.f99982d;
            Integer num3 = bVar.f99981c;
            String str5 = bVar.f99980b;
            String str6 = bVar.f99979a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str6 != null) {
                dVarC.d(eVar, 0, y1.f117048a, str6);
            }
            if (dVarC.C(eVar) || str5 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str5);
            }
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 2, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 3, x.f117036a, d14);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 4, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 5, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 6, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 7, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 8, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 9, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(int i14, String str, String str2, Integer num, Double d14, Integer num2, Integer num3, String str3, String str4, String str5, String str6, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f99979a = null;
        } else {
            this.f99979a = str;
        }
        if ((i14 & 2) == 0) {
            this.f99980b = null;
        } else {
            this.f99980b = str2;
        }
        if ((i14 & 4) == 0) {
            this.f99981c = null;
        } else {
            this.f99981c = num;
        }
        if ((i14 & 8) == 0) {
            this.f99982d = null;
        } else {
            this.f99982d = d14;
        }
        if ((i14 & 16) == 0) {
            this.f99983e = null;
        } else {
            this.f99983e = num2;
        }
        if ((i14 & 32) == 0) {
            this.f99984f = null;
        } else {
            this.f99984f = num3;
        }
        if ((i14 & 64) == 0) {
            this.f99985g = null;
        } else {
            this.f99985g = str3;
        }
        if ((i14 & 128) == 0) {
            this.f99986h = null;
        } else {
            this.f99986h = str4;
        }
        if ((i14 & 256) == 0) {
            this.f99987i = null;
        } else {
            this.f99987i = str5;
        }
        if ((i14 & 512) == 0) {
            this.f99988j = null;
        } else {
            this.f99988j = str6;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f99979a, bVar.f99979a) && s.g(this.f99980b, bVar.f99980b) && s.g(this.f99981c, bVar.f99981c) && s.g(this.f99982d, bVar.f99982d) && s.g(this.f99983e, bVar.f99983e) && s.g(this.f99984f, bVar.f99984f) && s.g(this.f99985g, bVar.f99985g) && s.g(this.f99986h, bVar.f99986h) && s.g(this.f99987i, bVar.f99987i) && s.g(this.f99988j, bVar.f99988j);
    }

    public final int hashCode() {
        String str = this.f99979a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f99980b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f99981c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f99982d;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num2 = this.f99983e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f99984f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f99985g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f99986h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f99987i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f99988j;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("DailyStepsDTO(id=", this.f99979a, ", date=", this.f99980b, ", steps=");
        b71.i.v(sbI, this.f99981c, ", calories=", this.f99982d, ", distance=");
        j20.x.m(sbI, this.f99983e, ", stepGoal=", this.f99984f, ", startTimeGmt=");
        sn.a.t(sbI, this.f99985g, ", startTimeLocal=", this.f99986h, ", endTimeGmt=");
        return e5.h(sbI, this.f99987i, ", endTimeLocal=", this.f99988j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f99979a);
        parcel.writeString(this.f99980b);
        Integer num = this.f99981c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.f99982d;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Integer num2 = this.f99983e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.f99984f;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeString(this.f99985g);
        parcel.writeString(this.f99986h);
        parcel.writeString(this.f99987i);
        parcel.writeString(this.f99988j);
    }

    /* JADX INFO: renamed from: jq1.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljq1/b$b;", "", "<init>", "()V", "Li63/c;", "Ljq1/b;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f99989a;
        }

        private Companion() {
        }
    }

    public b() {
        this((String) null, (String) null, (Integer) null, (Double) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, 1023, (p005kotlin.jvm.internal.j) null);
    }

    public b(String str, String str2, Integer num, Double d14, Integer num2, Integer num3, String str3, String str4, String str5, String str6) {
        this.f99979a = str;
        this.f99980b = str2;
        this.f99981c = num;
        this.f99982d = d14;
        this.f99983e = num2;
        this.f99984f = num3;
        this.f99985g = str3;
        this.f99986h = str4;
        this.f99987i = str5;
        this.f99988j = str6;
    }

    public /* synthetic */ b(String str, String str2, Integer num, Double d14, Integer num2, Integer num3, String str3, String str4, String str5, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : num3, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : str6);
    }
}

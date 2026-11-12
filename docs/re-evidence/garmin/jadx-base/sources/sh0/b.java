package sh0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import i63.h;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0003\u000e\u000f\u0010B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0011"}, d2 = {"Lsh0/b;", "Landroid/os/Parcelable;", "", "_calendarDate", "Lsh0/b$d;", "values", "<init>", "(Ljava/lang/String;Lsh0/b$d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lsh0/b$d;Lm63/u1;)V", "Companion", "d", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f159274b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(int i14, String str, d dVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f159273a = null;
        } else {
            this.f159273a = str;
        }
        if ((i14 & 2) == 0) {
            this.f159274b = null;
        } else {
            this.f159274b = dVar;
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
        return s.g(this.f159273a, bVar.f159273a) && s.g(this.f159274b, bVar.f159274b);
    }

    public final int hashCode() {
        String str = this.f159273a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d dVar = this.f159274b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "DailyFloorsSummaryDto(_calendarDate=" + this.f159273a + ", values=" + this.f159274b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f159273a);
        d dVar = this.f159274b;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Lsh0/b$d;", "Landroid/os/Parcelable;", "", "floorsAscendedGoal", "floorsAscended", "floorsDescended", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @h
    public static final /* data */ class d implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f159277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f159278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f159279c;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f159276d = 8;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/floors/data/model/DailyFloorsSummaryDto.Values.$serializer", "Lm63/e0;", "Lsh0/b$d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @o13.e
        public static final /* synthetic */ class a implements e0<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f159280a;
            private static final k63.e descriptor;

            static {
                a aVar = new a();
                f159280a = aVar;
                m1 m1Var = new m1("com.garmin.android.apps.connectmobile.floors.data.model.DailyFloorsSummaryDto.Values", aVar, 3);
                m1Var.j("wellnessUserFloorsAscendedGoal", true);
                m1Var.j("wellnessFloorsAscended", true);
                m1Var.j("wellnessFloorsDescended", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // m63.e0
            public final i63.c<?>[] childSerializers() {
                m0 m0Var = m0.f116981a;
                return new i63.c[]{j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var)};
            }

            @Override // i63.b
            public final Object deserialize(l63.e eVar) {
                eVar.getClass();
                k63.e eVar2 = descriptor;
                l63.c cVarC = eVar.c(eVar2);
                int i14 = l63.c.f110557a;
                boolean z14 = true;
                int i15 = 0;
                Integer num = null;
                Integer num2 = null;
                Integer num3 = null;
                while (z14) {
                    int iE = cVarC.e(eVar2);
                    if (iE == -1) {
                        z14 = false;
                    } else if (iE == 0) {
                        num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                        i15 |= 1;
                    } else if (iE == 1) {
                        num2 = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num2);
                        i15 |= 2;
                    } else {
                        if (iE != 2) {
                            hb.a.o(iE);
                            return null;
                        }
                        num3 = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num3);
                        i15 |= 4;
                    }
                }
                cVarC.b(eVar2);
                return new d(i15, num, num2, num3, (u1) null);
            }

            @Override // i63.i, i63.b
            /* JADX INFO: renamed from: getDescriptor */
            public final k63.e getF158591b() {
                return descriptor;
            }

            @Override // i63.i
            public final void serialize(l63.f fVar, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                Integer num = dVar.f159279c;
                Integer num2 = dVar.f159278b;
                Integer num3 = dVar.f159277a;
                k63.e eVar = descriptor;
                l63.d dVarC = fVar.c(eVar);
                if (dVarC.C(eVar) || num3 != null) {
                    dVarC.d(eVar, 0, m0.f116981a, num3);
                }
                if (dVarC.C(eVar) || num2 != null) {
                    dVarC.d(eVar, 1, m0.f116981a, num2);
                }
                if (dVarC.C(eVar) || num != null) {
                    dVarC.d(eVar, 2, m0.f116981a, num);
                }
                dVarC.b(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new d(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i14) {
                return new d[i14];
            }
        }

        public /* synthetic */ d(int i14, Integer num, Integer num2, Integer num3, u1 u1Var) {
            if ((i14 & 1) == 0) {
                this.f159277a = null;
            } else {
                this.f159277a = num;
            }
            if ((i14 & 2) == 0) {
                this.f159278b = null;
            } else {
                this.f159278b = num2;
            }
            if ((i14 & 4) == 0) {
                this.f159279c = null;
            } else {
                this.f159279c = num3;
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return s.g(this.f159277a, dVar.f159277a) && s.g(this.f159278b, dVar.f159278b) && s.g(this.f159279c, dVar.f159279c);
        }

        public final int hashCode() {
            Integer num = this.f159277a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f159278b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f159279c;
            return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            return f3.i(com.airbnb.lottie.animation.keyframe.a.l(this.f159277a, "Values(floorsAscendedGoal=", ", floorsAscended=", ", floorsDescended=", this.f159278b), this.f159279c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            Integer num = this.f159277a;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num);
            }
            Integer num2 = this.f159278b;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num2);
            }
            Integer num3 = this.f159279c;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                kg.f.k(parcel, 1, num3);
            }
        }

        /* JADX INFO: renamed from: sh0.b$d$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsh0/b$d$b;", "", "<init>", "()V", "Li63/c;", "Lsh0/b$d;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final i63.c<d> serializer() {
                return a.f159280a;
            }

            private Companion() {
            }
        }

        public d() {
            this((Integer) null, (Integer) null, (Integer) null, 7, (j) null);
        }

        public d(Integer num, Integer num2, Integer num3) {
            this.f159277a = num;
            this.f159278b = num2;
            this.f159279c = num3;
        }

        public /* synthetic */ d(Integer num, Integer num2, Integer num3, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3);
        }
    }

    /* JADX INFO: renamed from: sh0.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsh0/b$b;", "", "<init>", "()V", "Li63/c;", "Lsh0/b;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f159275a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this((String) null, (d) (0 == true ? 1 : 0), 3, (j) (0 == true ? 1 : 0));
    }

    public b(String str, d dVar) {
        this.f159273a = str;
        this.f159274b = dVar;
    }

    public /* synthetic */ b(String str, d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : dVar);
    }
}

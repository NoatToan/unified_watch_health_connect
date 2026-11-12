package dh0;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Ldh0/b;", "Landroid/os/Parcelable;", "Ldh0/e;", "bmi", "bodyFat", "vigorousDaysAvg", "vigorousMinutesAvg", "restingHR", "<init>", "(Ldh0/e;Ldh0/e;Ldh0/e;Ldh0/e;Ldh0/e;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILdh0/e;Ldh0/e;Ldh0/e;Ldh0/e;Ldh0/e;Lm63/u1;)V", "Companion", "a", "b", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f59550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f59551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f59552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f59553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f59554e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/fitness_age/data/model/FitnessAgeDetailsComponentsDto.$serializer", "Lm63/e0;", "Ldh0/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f59555a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f59555a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.fitness_age.data.model.FitnessAgeDetailsComponentsDto", aVar, 5);
            m1Var.j("bmi", true);
            m1Var.j("bodyFat", true);
            m1Var.j("vigorousDaysAvg", true);
            m1Var.j("vigorousMinutesAvg", true);
            m1Var.j("rhr", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            e.a aVar = e.a.f59582a;
            return new i63.c[]{j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar), j63.a.d(aVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            e eVar3 = null;
            e eVar4 = null;
            e eVar5 = null;
            e eVar6 = null;
            e eVar7 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    eVar3 = (e) cVarC.v(eVar2, 0, e.a.f59582a, eVar3);
                    i15 |= 1;
                } else if (iE == 1) {
                    eVar4 = (e) cVarC.v(eVar2, 1, e.a.f59582a, eVar4);
                    i15 |= 2;
                } else if (iE == 2) {
                    eVar5 = (e) cVarC.v(eVar2, 2, e.a.f59582a, eVar5);
                    i15 |= 4;
                } else if (iE == 3) {
                    eVar6 = (e) cVarC.v(eVar2, 3, e.a.f59582a, eVar6);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    eVar7 = (e) cVarC.v(eVar2, 4, e.a.f59582a, eVar7);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, eVar3, eVar4, eVar5, eVar6, eVar7, (u1) null);
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
            e eVar = bVar.f59554e;
            e eVar2 = bVar.f59553d;
            e eVar3 = bVar.f59552c;
            e eVar4 = bVar.f59551b;
            e eVar5 = bVar.f59550a;
            k63.e eVar6 = descriptor;
            l63.d dVarC = fVar.c(eVar6);
            if (dVarC.C(eVar6) || eVar5 != null) {
                dVarC.d(eVar6, 0, e.a.f59582a, eVar5);
            }
            if (dVarC.C(eVar6) || eVar4 != null) {
                dVarC.d(eVar6, 1, e.a.f59582a, eVar4);
            }
            if (dVarC.C(eVar6) || eVar3 != null) {
                dVarC.d(eVar6, 2, e.a.f59582a, eVar3);
            }
            if (dVarC.C(eVar6) || eVar2 != null) {
                dVarC.d(eVar6, 3, e.a.f59582a, eVar2);
            }
            if (dVarC.C(eVar6) || eVar != null) {
                dVarC.d(eVar6, 4, e.a.f59582a, eVar);
            }
            dVarC.b(eVar6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(int i14, e eVar, e eVar2, e eVar3, e eVar4, e eVar5, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f59550a = null;
        } else {
            this.f59550a = eVar;
        }
        if ((i14 & 2) == 0) {
            this.f59551b = null;
        } else {
            this.f59551b = eVar2;
        }
        if ((i14 & 4) == 0) {
            this.f59552c = null;
        } else {
            this.f59552c = eVar3;
        }
        if ((i14 & 8) == 0) {
            this.f59553d = null;
        } else {
            this.f59553d = eVar4;
        }
        if ((i14 & 16) == 0) {
            this.f59554e = null;
        } else {
            this.f59554e = eVar5;
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
        return s.g(this.f59550a, bVar.f59550a) && s.g(this.f59551b, bVar.f59551b) && s.g(this.f59552c, bVar.f59552c) && s.g(this.f59553d, bVar.f59553d) && s.g(this.f59554e, bVar.f59554e);
    }

    public final int hashCode() {
        e eVar = this.f59550a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        e eVar2 = this.f59551b;
        int iHashCode2 = (iHashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        e eVar3 = this.f59552c;
        int iHashCode3 = (iHashCode2 + (eVar3 == null ? 0 : eVar3.hashCode())) * 31;
        e eVar4 = this.f59553d;
        int iHashCode4 = (iHashCode3 + (eVar4 == null ? 0 : eVar4.hashCode())) * 31;
        e eVar5 = this.f59554e;
        return iHashCode4 + (eVar5 != null ? eVar5.hashCode() : 0);
    }

    public final String toString() {
        return "FitnessAgeDetailsComponentsDto(bmi=" + this.f59550a + ", bodyFat=" + this.f59551b + ", vigorousDaysAvg=" + this.f59552c + ", vigorousMinutesAvg=" + this.f59553d + ", restingHR=" + this.f59554e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        e eVar = this.f59550a;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        e eVar2 = this.f59551b;
        if (eVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar2.writeToParcel(parcel, i14);
        }
        e eVar3 = this.f59552c;
        if (eVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar3.writeToParcel(parcel, i14);
        }
        e eVar4 = this.f59553d;
        if (eVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar4.writeToParcel(parcel, i14);
        }
        e eVar5 = this.f59554e;
        if (eVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar5.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: dh0.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldh0/b$b;", "", "<init>", "()V", "Li63/c;", "Ldh0/b;", "serializer", "()Li63/c;", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f59555a;
        }

        private Companion() {
        }
    }

    public b() {
        this((e) null, (e) null, (e) null, (e) null, (e) null, 31, (p005kotlin.jvm.internal.j) null);
    }

    public b(e eVar, e eVar2, e eVar3, e eVar4, e eVar5) {
        this.f59550a = eVar;
        this.f59551b = eVar2;
        this.f59552c = eVar3;
        this.f59553d = eVar4;
        this.f59554e = eVar5;
    }

    public /* synthetic */ b(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : eVar, (i14 & 2) != 0 ? null : eVar2, (i14 & 4) != 0 ? null : eVar3, (i14 & 8) != 0 ? null : eVar4, (i14 & 16) != 0 ? null : eVar5);
    }
}

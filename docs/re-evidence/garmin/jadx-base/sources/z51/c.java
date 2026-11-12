package z51;

import android.os.Parcel;
import android.os.Parcelable;
import b63.u;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.x;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import z41.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lz51/c;", "Landroid/os/Parcelable;", "Lb63/u;", "time", "", "value", "<init>", "(Lb63/u;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILb63/u;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f202484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f202485b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<c> CREATOR = new C3777c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202482c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f202483d = {m.a(n.PUBLICATION, new j(5)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/pendingactivity/model/HeartRateMeasurementDTO.$serializer", "Lm63/e0;", "Lz51/c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f202486a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f202486a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.pendingactivity.model.HeartRateMeasurementDTO", aVar, 2);
            m1Var.j("timestamp", true);
            m1Var.j("value", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(c.f202483d[0].getValue()), j63.a.d(x.f117036a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = c.f202483d;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            u uVar = null;
            Double d14 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    uVar = (u) cVarC.v(eVar2, 0, lVarArr[0].getValue(), uVar);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    d14 = (Double) cVarC.v(eVar2, 1, x.f117036a, d14);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new c(i15, uVar, d14, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            Double d14 = cVar.f202485b;
            u uVar = cVar.f202484a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = c.f202483d;
            if (dVarC.C(eVar) || uVar != null) {
                dVarC.d(eVar, 0, lVarArr[0].getValue(), uVar);
            }
            if (dVarC.C(eVar) || d14 != null) {
                dVarC.d(eVar, 1, x.f117036a, d14);
            }
            dVarC.b(eVar);
        }
    }

    /* JADX INFO: renamed from: z51.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3777c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c((u) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(int i14, u uVar, Double d14, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f202484a = null;
        } else {
            this.f202484a = uVar;
        }
        if ((i14 & 2) == 0) {
            this.f202485b = null;
        } else {
            this.f202485b = d14;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f202484a, cVar.f202484a) && s.g(this.f202485b, cVar.f202485b);
    }

    public final int hashCode() {
        u uVar = this.f202484a;
        int iHashCode = (uVar == null ? 0 : uVar.f16216a.hashCode()) * 31;
        Double d14 = this.f202485b;
        return iHashCode + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        return "HeartRateMeasurementDTO(time=" + this.f202484a + ", value=" + this.f202485b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.f202484a);
        Double d14 = this.f202485b;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }

    /* JADX INFO: renamed from: z51.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz51/c$b;", "", "<init>", "()V", "Li63/c;", "Lz51/c;", "serializer", "()Li63/c;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f202486a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this((u) null, (Double) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public c(u uVar, Double d14) {
        this.f202484a = uVar;
        this.f202485b = d14;
    }

    public /* synthetic */ c(u uVar, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : uVar, (i14 & 2) != 0 ? null : d14);
    }
}

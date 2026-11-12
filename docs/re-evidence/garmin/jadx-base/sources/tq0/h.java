package tq0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.FirebasePerformance;
import com.nimbusds.jose.jwk.JWKParameterNames;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Ltq0/h;", "Landroid/os/Parcelable;", "", "xValue", "yValue", "Ltq0/j;", "options", "<init>", "(DDLtq0/j;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IDDLtq0/j;Lm63/u1;)V", "Companion", "b", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f166076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f166077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f166078c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<h> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/insights/model/InsightChartBarValueDTO.$serializer", "Lm63/e0;", "Ltq0/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f166079a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f166079a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.insights.model.InsightChartBarValueDTO", aVar, 3);
            m1Var.j("x", true);
            m1Var.j(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, true);
            m1Var.j("options", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(j.a.f166095a);
            x xVar = x.f117036a;
            return new i63.c[]{xVar, xVar, cVarD};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            double dT = 0.0d;
            double dT2 = 0.0d;
            j jVar = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    dT = cVarC.t(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    dT2 = cVarC.t(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    jVar = (j) cVarC.v(eVar2, 2, j.a.f166095a, jVar);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new h(i15, dT, dT2, jVar, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            h hVar = (h) obj;
            hVar.getClass();
            j jVar = hVar.f166078c;
            double d14 = hVar.f166077b;
            double d15 = hVar.f166076a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || Double.compare(d15, 0.0d) != 0) {
                dVarC.B(eVar, 0, d15);
            }
            if (dVarC.C(eVar) || Double.compare(d14, 0.0d) != 0) {
                dVarC.B(eVar, 1, d14);
            }
            if (dVarC.C(eVar) || jVar != null) {
                dVarC.d(eVar, 2, j.a.f166095a, jVar);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(int i14, double d14, double d15, j jVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f166076a = 0.0d;
        } else {
            this.f166076a = d14;
        }
        if ((i14 & 2) == 0) {
            this.f166077b = 0.0d;
        } else {
            this.f166077b = d15;
        }
        if ((i14 & 4) == 0) {
            this.f166078c = null;
        } else {
            this.f166078c = jVar;
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Double.compare(this.f166076a, hVar.f166076a) == 0 && Double.compare(this.f166077b, hVar.f166077b) == 0 && s.g(this.f166078c, hVar.f166078c);
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(Double.hashCode(this.f166076a) * 31, 31, this.f166077b);
        j jVar = this.f166078c;
        return iB + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("InsightChartBarValueDTO(xValue=", this.f166076a, ", yValue=");
        sbA.append(this.f166077b);
        sbA.append(", options=");
        sbA.append(this.f166078c);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.f166076a);
        parcel.writeDouble(this.f166077b);
        j jVar = this.f166078c;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jVar.f166094a);
        }
    }

    /* JADX INFO: renamed from: tq0.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Ltq0/h$b;", "", "<init>", "()V", "Li63/c;", "Ltq0/h;", "serializer", "()Li63/c;", "", "X_KEY", "Ljava/lang/String;", "Y_KEY", FirebasePerformance.HttpMethod.OPTIONS, "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f166079a;
        }

        private Companion() {
        }
    }

    public h(double d14, double d15, j jVar) {
        this.f166076a = d14;
        this.f166077b = d15;
        this.f166078c = jVar;
    }

    public h() {
        this(0.0d, 0.0d, (j) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public /* synthetic */ h(double d14, double d15, j jVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? 0.0d : d14, (i14 & 2) != 0 ? 0.0d : d15, (i14 & 4) != 0 ? null : jVar);
    }
}

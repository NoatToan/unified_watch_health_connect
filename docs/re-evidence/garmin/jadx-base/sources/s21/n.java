package s21;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0015"}, d2 = {"Ls21/n;", "Landroid/os/Parcelable;", "", "enabled", "", Action.KEY_ATTRIBUTE, "name", "", "goal", "unit", "", "displayOrder", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;I)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;ILm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class n implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f156151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f156154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f156155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f156156f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<n> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/setup/model/MicronutrientUiModel.$serializer", "Lm63/e0;", "Ls21/n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f156157a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f156157a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.presentation.setup.model.MicronutrientUiModel", aVar, 6);
            m1Var.j("enabled", false);
            m1Var.j(Action.KEY_ATTRIBUTE, false);
            m1Var.j("name", false);
            m1Var.j("goal", false);
            m1Var.j("unit", false);
            m1Var.j("displayOrder", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{m63.g.f116948a, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(m63.x.f117036a), j63.a.d(y1Var), m0.f116981a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            int iA = 0;
            String str = null;
            String str2 = null;
            Double d14 = null;
            String str3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        zG = cVarC.g(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                        break;
                    case 2:
                        str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                        i15 |= 4;
                        break;
                    case 3:
                        d14 = (Double) cVarC.v(eVar2, 3, m63.x.f117036a, d14);
                        i15 |= 8;
                        break;
                    case 4:
                        str3 = (String) cVarC.v(eVar2, 4, y1.f117048a, str3);
                        i15 |= 16;
                        break;
                    case 5:
                        iA = cVarC.A(eVar2, 5);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new n(i15, zG, str, str2, d14, str3, iA, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            n nVar = (n) obj;
            nVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.n(eVar, 0, nVar.f156151a);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 1, y1Var, nVar.f156152b);
            dVarC.d(eVar, 2, y1Var, nVar.f156153c);
            dVarC.d(eVar, 3, m63.x.f117036a, nVar.f156154d);
            dVarC.d(eVar, 4, y1Var, nVar.f156155e);
            dVarC.v(5, nVar.f156156f, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(int i14, boolean z14, String str, String str2, Double d14, String str3, int i15, u1 u1Var) {
        if (63 != (i14 & 63)) {
            k1.h(i14, 63, a.f156157a.getF116202c());
            throw null;
        }
        this.f156151a = z14;
        this.f156152b = str;
        this.f156153c = str2;
        this.f156154d = d14;
        this.f156155e = str3;
        this.f156156f = i15;
    }

    public static n b(n nVar, boolean z14, Double d14, int i14, int i15) {
        if ((i15 & 1) != 0) {
            z14 = nVar.f156151a;
        }
        boolean z15 = z14;
        String str = nVar.f156152b;
        String str2 = nVar.f156153c;
        if ((i15 & 8) != 0) {
            d14 = nVar.f156154d;
        }
        Double d15 = d14;
        String str3 = nVar.f156155e;
        if ((i15 & 32) != 0) {
            i14 = nVar.f156156f;
        }
        nVar.getClass();
        return new n(z15, str, str2, d15, str3, i14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f156151a == nVar.f156151a && p005kotlin.jvm.internal.s.g(this.f156152b, nVar.f156152b) && p005kotlin.jvm.internal.s.g(this.f156153c, nVar.f156153c) && p005kotlin.jvm.internal.s.g(this.f156154d, nVar.f156154d) && p005kotlin.jvm.internal.s.g(this.f156155e, nVar.f156155e) && this.f156156f == nVar.f156156f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f156151a) * 31;
        String str = this.f156152b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f156153c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.f156154d;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str3 = this.f156155e;
        return Integer.hashCode(this.f156156f) + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MicronutrientUiModel(enabled=");
        sb3.append(this.f156151a);
        sb3.append(", key=");
        sb3.append(this.f156152b);
        sb3.append(", name=");
        b71.i.x(sb3, this.f156153c, ", goal=", this.f156154d, ", unit=");
        sb3.append(this.f156155e);
        sb3.append(", displayOrder=");
        sb3.append(this.f156156f);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f156151a ? 1 : 0);
        parcel.writeString(this.f156152b);
        parcel.writeString(this.f156153c);
        Double d14 = this.f156154d;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.f156155e);
        parcel.writeInt(this.f156156f);
    }

    /* JADX INFO: renamed from: s21.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls21/n$b;", "", "<init>", "()V", "Li63/c;", "Ls21/n;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<n> serializer() {
            return a.f156157a;
        }

        private Companion() {
        }
    }

    public n(boolean z14, String str, String str2, Double d14, String str3, int i14) {
        this.f156151a = z14;
        this.f156152b = str;
        this.f156153c = str2;
        this.f156154d = d14;
        this.f156155e = str3;
        this.f156156f = i14;
    }
}

package ps;

import android.os.Parcel;
import android.os.Parcelable;
import c22.m3;
import com.google.gson.annotations.SerializedName;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0010\u000eB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lps/z1;", "Landroid/os/Parcelable;", "", "factor", "", "unitId", "", "unitKey", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lm63/u1;)V", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Companion", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class z1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("factor")
    private final Double factor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private final Integer unitId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitKey")
    private final String unitKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<z1> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activity/model/UnitDTO.$serializer", "Lm63/e0;", "Lps/z1;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<z1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f140453a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f140453a = aVar;
            m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.activity.model.UnitDTO", aVar, 3);
            m1Var.j("factor", true);
            m1Var.j("unitId", true);
            m1Var.j("unitKey", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(m63.x.f117036a), j63.a.d(m63.m0.f116981a), j63.a.d(m63.y1.f117048a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Double d14 = null;
            Integer num = null;
            String str = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    d14 = (Double) cVarC.v(eVar2, 0, m63.x.f117036a, d14);
                    i15 |= 1;
                } else if (iE == 1) {
                    num = (Integer) cVarC.v(eVar2, 1, m63.m0.f116981a, num);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    str = (String) cVarC.v(eVar2, 2, m63.y1.f117048a, str);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new z1(i15, d14, num, str, (m63.u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            z1 z1Var = (z1) obj;
            z1Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            z1.j(z1Var, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<z1> {
        @Override // android.os.Parcelable.Creator
        public final z1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new z1(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final z1[] newArray(int i14) {
            return new z1[i14];
        }
    }

    public /* synthetic */ z1(int i14, Double d14, Integer num, String str, m63.u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.factor = null;
        } else {
            this.factor = d14;
        }
        if ((i14 & 2) == 0) {
            this.unitId = null;
        } else {
            this.unitId = num;
        }
        if ((i14 & 4) == 0) {
            this.unitKey = null;
        } else {
            this.unitKey = str;
        }
    }

    public static final /* synthetic */ void j(z1 z1Var, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || z1Var.factor != null) {
            dVar.d(eVar, 0, m63.x.f117036a, z1Var.factor);
        }
        if (dVar.C(eVar) || z1Var.unitId != null) {
            dVar.d(eVar, 1, m63.m0.f116981a, z1Var.unitId);
        }
        if (!dVar.C(eVar) && z1Var.unitKey == null) {
            return;
        }
        dVar.d(eVar, 2, m63.y1.f117048a, z1Var.unitKey);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getFactor() {
        return this.factor;
    }

    public final m3 d() {
        String str = this.unitKey;
        if (p005kotlin.jvm.internal.s.g(str, qs.y.UNIT_DISTANCE_METER.f147239a)) {
            return m3.METER;
        }
        if (p005kotlin.jvm.internal.s.g(str, qs.y.UNIT_DISTANCE_YARD.f147239a)) {
            return m3.YARD;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return p005kotlin.jvm.internal.s.g(this.factor, z1Var.factor) && p005kotlin.jvm.internal.s.g(this.unitId, z1Var.unitId) && p005kotlin.jvm.internal.s.g(this.unitKey, z1Var.unitKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getUnitId() {
        return this.unitId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUnitKey() {
        return this.unitKey;
    }

    public final qs.y h() {
        qs.y.a aVar = qs.y.f147222b;
        String str = this.unitKey;
        aVar.getClass();
        return qs.y.a.a(str);
    }

    public final int hashCode() {
        Double d14 = this.factor;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Integer num = this.unitId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.unitKey;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("unitKey", this.unitKey);
        jSONObject.put("factor", this.factor);
        return jSONObject;
    }

    public final String toString() {
        Double d14 = this.factor;
        Integer num = this.unitId;
        String str = this.unitKey;
        StringBuilder sb3 = new StringBuilder("UnitDTO(factor=");
        sb3.append(d14);
        sb3.append(", unitId=");
        sb3.append(num);
        sb3.append(", unitKey=");
        return am.j.o(str, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.factor;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Integer num = this.unitId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.unitKey);
    }

    /* JADX INFO: renamed from: ps.z1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lps/z1$b;", "", "<init>", "()V", "Li63/c;", "Lps/z1;", "serializer", "()Li63/c;", "", "UNIT_KEY_PK", "Ljava/lang/String;", "FACTOR_PK", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<z1> serializer() {
            return a.f140453a;
        }

        private Companion() {
        }
    }

    public z1() {
        this((Double) null, (Integer) null, (String) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public z1(Double d14, Integer num, String str) {
        this.factor = d14;
        this.unitId = num;
        this.unitKey = str;
    }

    public /* synthetic */ z1(Double d14, Integer num, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str);
    }
}

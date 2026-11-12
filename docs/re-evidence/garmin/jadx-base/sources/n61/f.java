package n61;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.LinkedHashMap;
import java.util.Map;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import mz1.d0;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 12\u00020\u0001:\u0002\u0015\u001bBY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bm\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b!\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010#\u0012\u0004\b%\u0010\u001a\u001a\u0004\b\u001b\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010#\u0012\u0004\b(\u0010\u001a\u001a\u0004\b'\u0010$R.\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010\u001a\u001a\u0004\b+\u0010,R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010.\u0012\u0004\b0\u0010\u001a\u001a\u0004\b)\u0010/¨\u00062"}, d2 = {"Ln61/f;", "Landroid/os/Parcelable;", "", "userProfilePk", "", "startDate", "endDate", "", "avg", "max", "", "Ln61/g;", "groupMap", "Ln61/c;", "enduranceScore", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ln61/c;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ln61/c;Lm63/u1;)V", "a", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "getUserProfilePk$annotations", "()V", "b", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "getStartDate$annotations", "c", "d", "getEndDate$annotations", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getAvg$annotations", JWKParameterNames.RSA_EXPONENT, "h", "getMax$annotations", "f", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "getGroupMap$annotations", "Ln61/c;", "()Ln61/c;", "getEnduranceScore$annotations", "Companion", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avg")
    private final Integer avg;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("max")
    private final Integer max;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupMap")
    private final Map<String, g> groupMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enduranceScoreDTO")
    private final n61.c enduranceScore;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<f> CREATOR = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f123849h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f123850i = {null, null, null, null, null, m.a(n.PUBLICATION, new d0(27)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/performance/endurancescore/model/EnduranceScoreReportDTO.$serializer", "Lm63/e0;", "Ln61/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f123858a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f123858a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.performance.endurancescore.model.EnduranceScoreReportDTO", aVar, 7);
            m1Var.j("userProfilePK", false);
            m1Var.j("startDate", false);
            m1Var.j("endDate", false);
            m1Var.j("avg", false);
            m1Var.j("max", false);
            m1Var.j("groupMap", false);
            m1Var.j("enduranceScoreDTO", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = f.f123850i;
            i63.c<?> cVarD = j63.a.d(v0.f117027a);
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            i63.c<?> cVarD3 = j63.a.d(y1Var);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(lVarArr[5].getValue()), j63.a.d(n61.c.a.f123839a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = f.f123850i;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            int i15 = 0;
            Long l14 = null;
            String str = null;
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            Map map = null;
            n61.c cVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
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
                        num = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num);
                        i15 |= 8;
                        break;
                    case 4:
                        num2 = (Integer) cVarC.v(eVar2, 4, m0.f116981a, num2);
                        i15 |= 16;
                        break;
                    case 5:
                        map = (Map) cVarC.v(eVar2, 5, lVarArr[5].getValue(), map);
                        i15 |= 32;
                        break;
                    case 6:
                        cVar = (n61.c) cVarC.v(eVar2, 6, n61.c.a.f123839a, cVar);
                        i15 |= 64;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new f(i15, l14, str, str2, num, num2, map, cVar, null);
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
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            f.k(fVar2, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap2.put(parcel.readString(), g.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new f(lValueOf, string, string2, numValueOf, numValueOf2, linkedHashMap, parcel.readInt() != 0 ? n61.c.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(int i14, Long l14, String str, String str2, Integer num, Integer num2, Map map, n61.c cVar, u1 u1Var) {
        if (127 != (i14 & 127)) {
            k1.h(i14, 127, a.f123858a.getF116202c());
            throw null;
        }
        this.userProfilePk = l14;
        this.startDate = str;
        this.endDate = str2;
        this.avg = num;
        this.max = num2;
        this.groupMap = map;
        this.enduranceScore = cVar;
    }

    public static final /* synthetic */ void k(f fVar, l63.d dVar, k63.e eVar) {
        dVar.d(eVar, 0, v0.f117027a, fVar.userProfilePk);
        y1 y1Var = y1.f117048a;
        dVar.d(eVar, 1, y1Var, fVar.startDate);
        dVar.d(eVar, 2, y1Var, fVar.endDate);
        m0 m0Var = m0.f116981a;
        dVar.d(eVar, 3, m0Var, fVar.avg);
        dVar.d(eVar, 4, m0Var, fVar.max);
        dVar.d(eVar, 5, f123850i[5].getValue(), fVar.groupMap);
        dVar.d(eVar, 6, n61.c.a.f123839a, fVar.enduranceScore);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
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
        return s.g(this.userProfilePk, fVar.userProfilePk) && s.g(this.startDate, fVar.startDate) && s.g(this.endDate, fVar.endDate) && s.g(this.avg, fVar.avg) && s.g(this.max, fVar.max) && s.g(this.groupMap, fVar.groupMap) && s.g(this.enduranceScore, fVar.enduranceScore);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final n61.c getEnduranceScore() {
        return this.enduranceScore;
    }

    public final Map<String, g> g() {
        return this.groupMap;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getMax() {
        return this.max;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.startDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.avg;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.max;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, g> map = this.groupMap;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        n61.c cVar = this.enduranceScore;
        return iHashCode6 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getUserProfilePk() {
        return this.userProfilePk;
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        String str = this.startDate;
        String str2 = this.endDate;
        Integer num = this.avg;
        Integer num2 = this.max;
        Map<String, g> map = this.groupMap;
        n61.c cVar = this.enduranceScore;
        StringBuilder sbJ = b71.i.j("EnduranceScoreReportDTO(userProfilePk=", ", startDate=", str, l14, ", endDate=");
        fb1.c.u(num, str2, ", avg=", ", max=", sbJ);
        sbJ.append(num2);
        sbJ.append(", groupMap=");
        sbJ.append(map);
        sbJ.append(", enduranceScore=");
        sbJ.append(cVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userProfilePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        Integer num = this.avg;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.max;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Map<String, g> map = this.groupMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, g> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i14);
            }
        }
        n61.c cVar = this.enduranceScore;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: n61.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln61/f$b;", "", "<init>", "()V", "Li63/c;", "Ln61/f;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f123858a;
        }

        private Companion() {
        }
    }

    public f(Long l14, String str, String str2, Integer num, Integer num2, Map<String, g> map, n61.c cVar) {
        this.userProfilePk = l14;
        this.startDate = str;
        this.endDate = str2;
        this.avg = num;
        this.max = num2;
        this.groupMap = map;
        this.enduranceScore = cVar;
    }
}

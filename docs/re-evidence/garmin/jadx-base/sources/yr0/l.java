package yr0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u0011\u0017BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u0012\u0004\b!\u0010\u0016\u001a\u0004\b \u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u0012\u0004\b$\u0010\u0016\u001a\u0004\b#\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001b\u0012\u0004\b'\u0010\u0016\u001a\u0004\b&\u0010\u001d¨\u0006)"}, d2 = {"Lyr0/l;", "Landroid/os/Parcelable;", "", "guidanceId", "dailyStatusId", "", "guidanceType", "guidanceStartTime", "guidanceEndTime", "guidanceFeedback", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "a", "Ljava/lang/Long;", "getGuidanceId", "()Ljava/lang/Long;", "getGuidanceId$annotations", "()V", "b", "getDailyStatusId", "getDailyStatusId$annotations", "c", "Ljava/lang/String;", "getGuidanceType", "()Ljava/lang/String;", "getGuidanceType$annotations", "d", "getGuidanceStartTime", "getGuidanceStartTime$annotations", JWKParameterNames.RSA_EXPONENT, "getGuidanceEndTime", "getGuidanceEndTime$annotations", "f", "getGuidanceFeedback", "getGuidanceFeedback$annotations", "Companion", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class l implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("guidanceId")
    private final Long guidanceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyStatusId")
    private final Long dailyStatusId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("guidanceType")
    private final String guidanceType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("guidanceStartTime")
    private final String guidanceStartTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("guidanceEndTime")
    private final String guidanceEndTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("guidanceFeedback")
    private final String guidanceFeedback;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<l> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/jet_lag/data/model/JetLagGuidanceDTO.$serializer", "Lm63/e0;", "Lyr0/l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199024a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199024a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.jet_lag.data.model.JetLagGuidanceDTO", aVar, 6);
            m1Var.j("guidanceId", true);
            m1Var.j("dailyStatusId", true);
            m1Var.j("guidanceType", true);
            m1Var.j("guidanceStartTime", true);
            m1Var.j("guidanceEndTime", true);
            m1Var.j("guidanceFeedback", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            v0 v0Var = v0.f117027a;
            i63.c<?> cVarD = j63.a.d(v0Var);
            i63.c<?> cVarD2 = j63.a.d(v0Var);
            y1 y1Var = y1.f117048a;
            return new i63.c[]{cVarD, cVarD2, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Long l14 = null;
            Long l15 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                        i15 |= 1;
                        break;
                    case 1:
                        l15 = (Long) cVarC.v(eVar2, 1, v0.f117027a, l15);
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
                        str4 = (String) cVarC.v(eVar2, 5, y1.f117048a, str4);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new l(i15, l14, l15, str, str2, str3, str4, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            l lVar = (l) obj;
            lVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l.g(lVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(int i14, Long l14, Long l15, String str, String str2, String str3, String str4, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.guidanceId = null;
        } else {
            this.guidanceId = l14;
        }
        if ((i14 & 2) == 0) {
            this.dailyStatusId = null;
        } else {
            this.dailyStatusId = l15;
        }
        if ((i14 & 4) == 0) {
            this.guidanceType = null;
        } else {
            this.guidanceType = str;
        }
        if ((i14 & 8) == 0) {
            this.guidanceStartTime = null;
        } else {
            this.guidanceStartTime = str2;
        }
        if ((i14 & 16) == 0) {
            this.guidanceEndTime = null;
        } else {
            this.guidanceEndTime = str3;
        }
        if ((i14 & 32) == 0) {
            this.guidanceFeedback = null;
        } else {
            this.guidanceFeedback = str4;
        }
    }

    public static final /* synthetic */ void g(l lVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || lVar.guidanceId != null) {
            dVar.d(eVar, 0, v0.f117027a, lVar.guidanceId);
        }
        if (dVar.C(eVar) || lVar.dailyStatusId != null) {
            dVar.d(eVar, 1, v0.f117027a, lVar.dailyStatusId);
        }
        if (dVar.C(eVar) || lVar.guidanceType != null) {
            dVar.d(eVar, 2, y1.f117048a, lVar.guidanceType);
        }
        if (dVar.C(eVar) || lVar.guidanceStartTime != null) {
            dVar.d(eVar, 3, y1.f117048a, lVar.guidanceStartTime);
        }
        if (dVar.C(eVar) || lVar.guidanceEndTime != null) {
            dVar.d(eVar, 4, y1.f117048a, lVar.guidanceEndTime);
        }
        if (!dVar.C(eVar) && lVar.guidanceFeedback == null) {
            return;
        }
        dVar.d(eVar, 5, y1.f117048a, lVar.guidanceFeedback);
    }

    public final DateTime b() {
        return g22.k.q(this.guidanceEndTime, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    public final DateTime d() {
        return g22.k.q(this.guidanceStartTime, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.guidanceId, lVar.guidanceId) && p005kotlin.jvm.internal.s.g(this.dailyStatusId, lVar.dailyStatusId) && p005kotlin.jvm.internal.s.g(this.guidanceType, lVar.guidanceType) && p005kotlin.jvm.internal.s.g(this.guidanceStartTime, lVar.guidanceStartTime) && p005kotlin.jvm.internal.s.g(this.guidanceEndTime, lVar.guidanceEndTime) && p005kotlin.jvm.internal.s.g(this.guidanceFeedback, lVar.guidanceFeedback);
    }

    public final m f() {
        Object next;
        w13.c cVar = m.f199030h;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            if (h0.R(((m) next).f199031a, this.guidanceType)) {
                return (m) next;
            }
        }
        next = null;
        return (m) next;
    }

    public final int hashCode() {
        Long l14 = this.guidanceId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.dailyStatusId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.guidanceType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.guidanceStartTime;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.guidanceEndTime;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.guidanceFeedback;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.guidanceId;
        Long l15 = this.dailyStatusId;
        String str = this.guidanceType;
        String str2 = this.guidanceStartTime;
        String str3 = this.guidanceEndTime;
        String str4 = this.guidanceFeedback;
        StringBuilder sbJ = f3.j(l14, l15, "JetLagGuidanceDTO(guidanceId=", ", dailyStatusId=", ", guidanceType=");
        sn.a.t(sbJ, str, ", guidanceStartTime=", str2, ", guidanceEndTime=");
        return e5.h(sbJ, str3, ", guidanceFeedback=", str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.guidanceId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.dailyStatusId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.guidanceType);
        parcel.writeString(this.guidanceStartTime);
        parcel.writeString(this.guidanceEndTime);
        parcel.writeString(this.guidanceFeedback);
    }

    /* JADX INFO: renamed from: yr0.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyr0/l$b;", "", "<init>", "()V", "Li63/c;", "Lyr0/l;", "serializer", "()Li63/c;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<l> serializer() {
            return a.f199024a;
        }

        private Companion() {
        }
    }

    public l() {
        this((Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, 63, (p005kotlin.jvm.internal.j) null);
    }

    public l(Long l14, Long l15, String str, String str2, String str3, String str4) {
        this.guidanceId = l14;
        this.dailyStatusId = l15;
        this.guidanceType = str;
        this.guidanceStartTime = str2;
        this.guidanceEndTime = str3;
        this.guidanceFeedback = str4;
    }

    public /* synthetic */ l(Long l14, Long l15, String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4);
    }
}

package yw1;

import com.garmin.android.apps.connectmobile.f3;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014¨\u0006\u0018"}, d2 = {"Lyw1/i;", "", "", "typeId", "activityId", "", "activityName", "activityType", "", "value", "status", "prStartTimeGmt", "activityStartDateTimeLocalFormatted", "prStartTimeLocal", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f199932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f199933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f199935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f199936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f199937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f199938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f199939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f199940i;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/progressreport/FBTPersonalRecordsDTO.$serializer", "Lm63/e0;", "Lyw1/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199941a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199941a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.progressreport.FBTPersonalRecordsDTO", aVar, 9);
            m1Var.j("typeId", false);
            m1Var.j("activityId", false);
            m1Var.j("activityName", false);
            m1Var.j("activityType", false);
            m1Var.j("value", false);
            m1Var.j("status", false);
            m1Var.j("prStartTimeGmt", false);
            m1Var.j("activityStartDateTimeLocalFormatted", false);
            m1Var.j("prStartTimeLocal", false);
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
            return new i63.c[]{cVarD, cVarD2, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(x.f117036a), j63.a.d(y1Var), j63.a.d(v0Var), j63.a.d(y1Var), j63.a.d(v0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            Long l14 = null;
            Long l15 = null;
            Long l16 = null;
            String str = null;
            String str2 = null;
            Double d14 = null;
            String str3 = null;
            Long l17 = null;
            String str4 = null;
            int i15 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        l15 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l15);
                        i15 |= 1;
                        break;
                    case 1:
                        l16 = (Long) cVarC.v(eVar2, 1, v0.f117027a, l16);
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
                        d14 = (Double) cVarC.v(eVar2, 4, x.f117036a, d14);
                        i15 |= 16;
                        break;
                    case 5:
                        str3 = (String) cVarC.v(eVar2, 5, y1.f117048a, str3);
                        i15 |= 32;
                        break;
                    case 6:
                        l17 = (Long) cVarC.v(eVar2, 6, v0.f117027a, l17);
                        i15 |= 64;
                        break;
                    case 7:
                        str4 = (String) cVarC.v(eVar2, 7, y1.f117048a, str4);
                        i15 |= 128;
                        break;
                    case 8:
                        l14 = (Long) cVarC.v(eVar2, 8, v0.f117027a, l14);
                        i15 |= 256;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new i(i15, l15, l16, str, str2, d14, str3, l17, str4, l14, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            v0 v0Var = v0.f117027a;
            dVarC.d(eVar, 0, v0Var, iVar.f199932a);
            dVarC.d(eVar, 1, v0Var, iVar.f199933b);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 2, y1Var, iVar.f199934c);
            dVarC.d(eVar, 3, y1Var, iVar.f199935d);
            dVarC.d(eVar, 4, x.f117036a, iVar.f199936e);
            dVarC.d(eVar, 5, y1Var, iVar.f199937f);
            dVarC.d(eVar, 6, v0Var, iVar.f199938g);
            dVarC.d(eVar, 7, y1Var, iVar.f199939h);
            dVarC.d(eVar, 8, v0Var, iVar.f199940i);
            dVarC.b(eVar);
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199942a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180178i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f199942a = iArr;
        }
    }

    public /* synthetic */ i(int i14, Long l14, Long l15, String str, String str2, Double d14, String str3, Long l16, String str4, Long l17, u1 u1Var) {
        if (511 != (i14 & 511)) {
            k1.h(i14, 511, a.f199941a.getF158591b());
            throw null;
        }
        this.f199932a = l14;
        this.f199933b = l15;
        this.f199934c = str;
        this.f199935d = str2;
        this.f199936e = d14;
        this.f199937f = str3;
        this.f199938g = l16;
        this.f199939h = str4;
        this.f199940i = l17;
    }

    public final LocalDate a() {
        return new DateTime(this.f199939h, DateTimeZone.getDefault()).toLocalDate();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f199932a, iVar.f199932a) && p005kotlin.jvm.internal.s.g(this.f199933b, iVar.f199933b) && p005kotlin.jvm.internal.s.g(this.f199934c, iVar.f199934c) && p005kotlin.jvm.internal.s.g(this.f199935d, iVar.f199935d) && p005kotlin.jvm.internal.s.g(this.f199936e, iVar.f199936e) && p005kotlin.jvm.internal.s.g(this.f199937f, iVar.f199937f) && p005kotlin.jvm.internal.s.g(this.f199938g, iVar.f199938g) && p005kotlin.jvm.internal.s.g(this.f199939h, iVar.f199939h) && p005kotlin.jvm.internal.s.g(this.f199940i, iVar.f199940i);
    }

    public final int hashCode() {
        Long l14 = this.f199932a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f199933b;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.f199934c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f199935d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.f199936e;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str3 = this.f199937f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l16 = this.f199938g;
        int iHashCode7 = (iHashCode6 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str4 = this.f199939h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l17 = this.f199940i;
        return iHashCode8 + (l17 != null ? l17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = f3.j(this.f199932a, this.f199933b, "FBTPersonalRecordsDTO(typeId=", ", activityId=", ", activityName=");
        sn.a.t(sbJ, this.f199934c, ", activityType=", this.f199935d, ", value=");
        b71.i.u(sbJ, this.f199936e, ", status=", this.f199937f, ", prStartTimeGmt=");
        b71.i.q(this.f199938g, ", activityStartDateTimeLocalFormatted=", this.f199939h, ", prStartTimeLocal=", sbJ);
        return p6.b.g(sbJ, this.f199940i, ")");
    }

    /* JADX INFO: renamed from: yw1.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/i$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/i;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f199941a;
        }

        private Companion() {
        }
    }

    public i(Long l14, Long l15, String str, String str2, Double d14, String str3, Long l16, String str4, Long l17) {
        this.f199932a = l14;
        this.f199933b = l15;
        this.f199934c = str;
        this.f199935d = str2;
        this.f199936e = d14;
        this.f199937f = str3;
        this.f199938g = l16;
        this.f199939h = str4;
        this.f199940i = l17;
    }
}

package yw1;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lyw1/h;", "", "", TtmlNode.ATTR_ID, "", Action.KEY_ATTRIBUTE, "", "visible", "sport", "", "maxValue", "minValue", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f199925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f199927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f199928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f199929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f199930f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/progressreport/FBTPersonalRecordTypes.$serializer", "Lm63/e0;", "Lyw1/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199931a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199931a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.progressreport.FBTPersonalRecordTypes", aVar, 6);
            m1Var.j(TtmlNode.ATTR_ID, false);
            m1Var.j(Action.KEY_ATTRIBUTE, false);
            m1Var.j("visible", false);
            m1Var.j("sport", false);
            m1Var.j("maxValue", false);
            m1Var.j("minValue", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(v0.f117027a);
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            i63.c<?> cVarD3 = j63.a.d(m63.g.f116948a);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            x xVar = x.f117036a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, j63.a.d(xVar), j63.a.d(xVar)};
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
            String str = null;
            Boolean bool = null;
            String str2 = null;
            Double d14 = null;
            Double d15 = null;
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
                        str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                        i15 |= 2;
                        break;
                    case 2:
                        bool = (Boolean) cVarC.v(eVar2, 2, m63.g.f116948a, bool);
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
                        d15 = (Double) cVarC.v(eVar2, 5, x.f117036a, d15);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new h(i15, l14, str, bool, str2, d14, d15, null);
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
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.d(eVar, 0, v0.f117027a, hVar.f199925a);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 1, y1Var, hVar.f199926b);
            dVarC.d(eVar, 2, m63.g.f116948a, hVar.f199927c);
            dVarC.d(eVar, 3, y1Var, hVar.f199928d);
            x xVar = x.f117036a;
            dVarC.d(eVar, 4, xVar, hVar.f199929e);
            dVarC.d(eVar, 5, xVar, hVar.f199930f);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ h(int i14, Long l14, String str, Boolean bool, String str2, Double d14, Double d15, u1 u1Var) {
        if (63 != (i14 & 63)) {
            k1.h(i14, 63, a.f199931a.getF158591b());
            throw null;
        }
        this.f199925a = l14;
        this.f199926b = str;
        this.f199927c = bool;
        this.f199928d = str2;
        this.f199929e = d14;
        this.f199930f = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f199925a, hVar.f199925a) && p005kotlin.jvm.internal.s.g(this.f199926b, hVar.f199926b) && p005kotlin.jvm.internal.s.g(this.f199927c, hVar.f199927c) && p005kotlin.jvm.internal.s.g(this.f199928d, hVar.f199928d) && p005kotlin.jvm.internal.s.g(this.f199929e, hVar.f199929e) && p005kotlin.jvm.internal.s.g(this.f199930f, hVar.f199930f);
    }

    public final int hashCode() {
        Long l14 = this.f199925a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f199926b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f199927c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f199928d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.f199929e;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f199930f;
        return iHashCode5 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("FBTPersonalRecordTypes(id=", ", key=", this.f199926b, this.f199925a, ", visible=");
        b71.i.s(sbJ, this.f199927c, ", sport=", this.f199928d, ", maxValue=");
        return sn.a.f(this.f199929e, this.f199930f, ", minValue=", ")", sbJ);
    }

    /* JADX INFO: renamed from: yw1.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/h$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/h;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f199931a;
        }

        private Companion() {
        }
    }

    public h(Long l14, String str, Boolean bool, String str2, Double d14, Double d15) {
        this.f199925a = l14;
        this.f199926b = str;
        this.f199927c = bool;
        this.f199928d = str2;
        this.f199929e = d14;
        this.f199930f = d15;
    }
}

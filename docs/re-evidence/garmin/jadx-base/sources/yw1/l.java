package yw1;

import com.google.firebase.messaging.Constants;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lyw1/l;", "", "", "_from", "series", "_until", "_updatedDate", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f199953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f199954e;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/progressreport/FBTThresholdDTO.$serializer", "Lm63/e0;", "Lyw1/l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f199955a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f199955a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.progressreport.FBTThresholdDTO", aVar, 5);
            m1Var.j(Constants.MessagePayloadKeys.FROM, false);
            m1Var.j("series", false);
            m1Var.j("until", false);
            m1Var.j("updatedDate", false);
            m1Var.j("value", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(x.f117036a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Double d14 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else if (iE == 1) {
                    str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                    i15 |= 2;
                } else if (iE == 2) {
                    str3 = (String) cVarC.v(eVar2, 2, y1.f117048a, str3);
                    i15 |= 4;
                } else if (iE == 3) {
                    str4 = (String) cVarC.v(eVar2, 3, y1.f117048a, str4);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    d14 = (Double) cVarC.v(eVar2, 4, x.f117036a, d14);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new l(i15, str, str2, str3, str4, d14, null);
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
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 0, y1Var, lVar.f199950a);
            dVarC.d(eVar, 1, y1Var, lVar.f199951b);
            dVarC.d(eVar, 2, y1Var, lVar.f199952c);
            dVarC.d(eVar, 3, y1Var, lVar.f199953d);
            dVarC.d(eVar, 4, x.f117036a, lVar.f199954e);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ l(int i14, String str, String str2, String str3, String str4, Double d14, u1 u1Var) {
        if (31 != (i14 & 31)) {
            k1.h(i14, 31, a.f199955a.getF94809a());
            throw null;
        }
        this.f199950a = str;
        this.f199951b = str2;
        this.f199952c = str3;
        this.f199953d = str4;
        this.f199954e = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f199950a, lVar.f199950a) && p005kotlin.jvm.internal.s.g(this.f199951b, lVar.f199951b) && p005kotlin.jvm.internal.s.g(this.f199952c, lVar.f199952c) && p005kotlin.jvm.internal.s.g(this.f199953d, lVar.f199953d) && p005kotlin.jvm.internal.s.g(this.f199954e, lVar.f199954e);
    }

    public final int hashCode() {
        String str = this.f199950a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f199951b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f199952c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f199953d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d14 = this.f199954e;
        return iHashCode4 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FBTThresholdDTO(_from=", this.f199950a, ", series=", this.f199951b, ", _until=");
        sn.a.t(sbI, this.f199952c, ", _updatedDate=", this.f199953d, ", value=");
        return b71.i.g(sbI, this.f199954e, ")");
    }

    /* JADX INFO: renamed from: yw1.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/l$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/l;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<l> serializer() {
            return a.f199955a;
        }

        private Companion() {
        }
    }

    public l(String str, String str2, String str3, String str4, Double d14) {
        this.f199950a = str;
        this.f199951b = str2;
        this.f199952c = str3;
        this.f199953d = str4;
        this.f199954e = d14;
    }
}

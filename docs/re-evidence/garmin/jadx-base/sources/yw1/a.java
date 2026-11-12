package yw1;

import com.google.firebase.messaging.Constants;
import java.util.List;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lyw1/a;", "", "", Constants.MessagePayloadKeys.FROM, "until", "", "Lyw1/l;", "aggregatedResults", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f199894d = {null, null, o13.m.a(o13.n.PUBLICATION, new ya0.j(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<l> f199897c;

    /* JADX INFO: renamed from: yw1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/progressreport/CriticalSwimSpeedDTO.$serializer", "Lm63/e0;", "Lyw1/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C3742a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3742a f199898a;
        private static final k63.e descriptor;

        static {
            C3742a c3742a = new C3742a();
            f199898a = c3742a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.progressreport.CriticalSwimSpeedDTO", c3742a, 3);
            m1Var.j(Constants.MessagePayloadKeys.FROM, false);
            m1Var.j("until", false);
            m1Var.j("aggregatedResults", false);
            descriptor = m1Var;
        }

        private C3742a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = a.f199894d;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[2].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = a.f199894d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String str = null;
            String str2 = null;
            List list = null;
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
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    list = (List) cVarC.v(eVar2, 2, lVarArr[2].getValue(), list);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, str, str2, list, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = a.f199894d;
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 0, y1Var, aVar.f199895a);
            dVarC.d(eVar, 1, y1Var, aVar.f199896b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), aVar.f199897c);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, String str, String str2, List list, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, C3742a.f199898a.getF158591b());
            throw null;
        }
        this.f199895a = str;
        this.f199896b = str2;
        this.f199897c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f199895a, aVar.f199895a) && p005kotlin.jvm.internal.s.g(this.f199896b, aVar.f199896b) && p005kotlin.jvm.internal.s.g(this.f199897c, aVar.f199897c);
    }

    public final int hashCode() {
        String str = this.f199895a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f199896b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<l> list = this.f199897c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return z.c(p6.b.i("CriticalSwimSpeedDTO(from=", this.f199895a, ", until=", this.f199896b, ", aggregatedResults="), this.f199897c, ")");
    }

    /* JADX INFO: renamed from: yw1.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw1/a$b;", "", "<init>", "()V", "Li63/c;", "Lyw1/a;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C3742a.f199898a;
        }

        private Companion() {
        }
    }

    public a(String str, String str2, List<l> list) {
        this.f199895a = str;
        this.f199896b = str2;
        this.f199897c = list;
    }
}

package st2;

import com.garmin.android.gncs.NotificationConstants;
import i63.h;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lst2/b;", "", "", "message", NotificationConstants.KEY_DATA_MIME_TYPE, "name", "value", "correlationId", "", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f160914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f160915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f160916f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/livetrack/settings/dto/ErrorDetail.$serializer", "Lm63/e0;", "Lst2/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f160917a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f160917a = aVar;
            m1 m1Var = new m1("com.garmin.livetrack.settings.dto.ErrorDetail", aVar, 6);
            m1Var.j("message", true);
            m1Var.j(NotificationConstants.KEY_DATA_MIME_TYPE, true);
            m1Var.j("name", true);
            m1Var.j("value", true);
            m1Var.j("correlationId", true);
            m1Var.j("errorCode", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(m0.f116981a)};
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
            String str5 = null;
            Integer num = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                        i15 |= 1;
                        break;
                    case 1:
                        str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                        i15 |= 2;
                        break;
                    case 2:
                        str3 = (String) cVarC.v(eVar2, 2, y1.f117048a, str3);
                        i15 |= 4;
                        break;
                    case 3:
                        str4 = (String) cVarC.v(eVar2, 3, y1.f117048a, str4);
                        i15 |= 8;
                        break;
                    case 4:
                        str5 = (String) cVarC.v(eVar2, 4, y1.f117048a, str5);
                        i15 |= 16;
                        break;
                    case 5:
                        num = (Integer) cVarC.v(eVar2, 5, m0.f116981a, num);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, str, str2, str3, str4, str5, num, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            Integer num = bVar.f160916f;
            String str = bVar.f160915e;
            String str2 = bVar.f160914d;
            String str3 = bVar.f160913c;
            String str4 = bVar.f160912b;
            String str5 = bVar.f160911a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str5 != null) {
                dVarC.d(eVar, 0, y1.f117048a, str5);
            }
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 2, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 3, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 4, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 5, m0.f116981a, num);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ b(int i14, String str, String str2, String str3, String str4, String str5, Integer num, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f160911a = null;
        } else {
            this.f160911a = str;
        }
        if ((i14 & 2) == 0) {
            this.f160912b = null;
        } else {
            this.f160912b = str2;
        }
        if ((i14 & 4) == 0) {
            this.f160913c = null;
        } else {
            this.f160913c = str3;
        }
        if ((i14 & 8) == 0) {
            this.f160914d = null;
        } else {
            this.f160914d = str4;
        }
        if ((i14 & 16) == 0) {
            this.f160915e = null;
        } else {
            this.f160915e = str5;
        }
        if ((i14 & 32) == 0) {
            this.f160916f = null;
        } else {
            this.f160916f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f160911a, bVar.f160911a) && s.g(this.f160912b, bVar.f160912b) && s.g(this.f160913c, bVar.f160913c) && s.g(this.f160914d, bVar.f160914d) && s.g(this.f160915e, bVar.f160915e) && s.g(this.f160916f, bVar.f160916f);
    }

    public final int hashCode() {
        String str = this.f160911a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f160912b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f160913c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f160914d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f160915e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f160916f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ErrorDetail(message=", this.f160911a, ", type=", this.f160912b, ", name=");
        sn.a.t(sbI, this.f160913c, ", value=", this.f160914d, ", correlationId=");
        sbI.append(this.f160915e);
        sbI.append(", errorCode=");
        sbI.append(this.f160916f);
        sbI.append(")");
        return sbI.toString();
    }

    /* JADX INFO: renamed from: st2.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lst2/b$b;", "", "<init>", "()V", "Li63/c;", "Lst2/b;", "serializer", "()Li63/c;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<b> serializer() {
            return a.f160917a;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public b() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 63, (j) null);
    }

    public b(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.f160911a = str;
        this.f160912b = str2;
        this.f160913c = str3;
        this.f160914d = str4;
        this.f160915e = str5;
        this.f160916f = num;
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, Integer num, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : num);
    }
}

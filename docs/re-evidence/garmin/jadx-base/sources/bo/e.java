package bo;

import m63.e0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lbo/e;", "", "", "typeId", "", "typeKey", "parentTypeId", "", "isHidden", "restricted", "trimmable", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f19108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f19109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f19110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f19111f;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activities/history/data/model/ActivityTypeDTO.$serializer", "Lm63/e0;", "Lbo/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19112a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f19112a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.activities.history.data.model.ActivityTypeDTO", aVar, 6);
            m1Var.j("typeId", true);
            m1Var.j("typeKey", true);
            m1Var.j("parentTypeId", true);
            m1Var.j("isHidden", true);
            m1Var.j("restricted", true);
            m1Var.j("trimmable", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            v0 v0Var = v0.f117027a;
            i63.c<?> cVarD = j63.a.d(v0Var);
            i63.c<?> cVarD2 = j63.a.d(y1.f117048a);
            i63.c<?> cVarD3 = j63.a.d(v0Var);
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, j63.a.d(gVar), j63.a.d(gVar), j63.a.d(gVar)};
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
            Long l15 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
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
                        l15 = (Long) cVarC.v(eVar2, 2, v0.f117027a, l15);
                        i15 |= 4;
                        break;
                    case 3:
                        bool = (Boolean) cVarC.v(eVar2, 3, m63.g.f116948a, bool);
                        i15 |= 8;
                        break;
                    case 4:
                        bool2 = (Boolean) cVarC.v(eVar2, 4, m63.g.f116948a, bool2);
                        i15 |= 16;
                        break;
                    case 5:
                        bool3 = (Boolean) cVarC.v(eVar2, 5, m63.g.f116948a, bool3);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new e(i15, l14, str, l15, bool, bool2, bool3, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            e eVar = (e) obj;
            eVar.getClass();
            Boolean bool = eVar.f19111f;
            Boolean bool2 = eVar.f19110e;
            Boolean bool3 = eVar.f19109d;
            Long l14 = eVar.f19108c;
            String str = eVar.f19107b;
            Long l15 = eVar.f19106a;
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            if (dVarC.C(eVar2) || l15 != null) {
                dVarC.d(eVar2, 0, v0.f117027a, l15);
            }
            if (dVarC.C(eVar2) || str != null) {
                dVarC.d(eVar2, 1, y1.f117048a, str);
            }
            if (dVarC.C(eVar2) || l14 != null) {
                dVarC.d(eVar2, 2, v0.f117027a, l14);
            }
            if (dVarC.C(eVar2) || bool3 != null) {
                dVarC.d(eVar2, 3, m63.g.f116948a, bool3);
            }
            if (dVarC.C(eVar2) || bool2 != null) {
                dVarC.d(eVar2, 4, m63.g.f116948a, bool2);
            }
            if (dVarC.C(eVar2) || bool != null) {
                dVarC.d(eVar2, 5, m63.g.f116948a, bool);
            }
            dVarC.b(eVar2);
        }
    }

    public /* synthetic */ e(int i14, Long l14, String str, Long l15, Boolean bool, Boolean bool2, Boolean bool3, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19106a = null;
        } else {
            this.f19106a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f19107b = null;
        } else {
            this.f19107b = str;
        }
        if ((i14 & 4) == 0) {
            this.f19108c = null;
        } else {
            this.f19108c = l15;
        }
        if ((i14 & 8) == 0) {
            this.f19109d = null;
        } else {
            this.f19109d = bool;
        }
        if ((i14 & 16) == 0) {
            this.f19110e = null;
        } else {
            this.f19110e = bool2;
        }
        if ((i14 & 32) == 0) {
            this.f19111f = null;
        } else {
            this.f19111f = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f19106a, eVar.f19106a) && s.g(this.f19107b, eVar.f19107b) && s.g(this.f19108c, eVar.f19108c) && s.g(this.f19109d, eVar.f19109d) && s.g(this.f19110e, eVar.f19110e) && s.g(this.f19111f, eVar.f19111f);
    }

    public final int hashCode() {
        Long l14 = this.f19106a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f19107b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l15 = this.f19108c;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Boolean bool = this.f19109d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f19110e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f19111f;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("ActivityTypeDTO(typeId=", ", typeKey=", this.f19107b, this.f19106a, ", parentTypeId=");
        sbJ.append(this.f19108c);
        sbJ.append(", isHidden=");
        sbJ.append(this.f19109d);
        sbJ.append(", restricted=");
        sbJ.append(this.f19110e);
        sbJ.append(", trimmable=");
        sbJ.append(this.f19111f);
        sbJ.append(")");
        return sbJ.toString();
    }

    /* JADX INFO: renamed from: bo.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/e$b;", "", "<init>", "()V", "Li63/c;", "Lbo/e;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<e> serializer() {
            return a.f19112a;
        }

        private Companion() {
        }
    }

    public e() {
        this((Long) null, (String) null, (Long) null, (Boolean) null, (Boolean) null, (Boolean) null, 63, (p005kotlin.jvm.internal.j) null);
    }

    public e(Long l14, String str, Long l15, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f19106a = l14;
        this.f19107b = str;
        this.f19108c = l15;
        this.f19109d = bool;
        this.f19110e = bool2;
        this.f19111f = bool3;
    }

    public /* synthetic */ e(Long l14, String str, Long l15, Boolean bool, Boolean bool2, Boolean bool3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : l15, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : bool2, (i14 & 32) != 0 ? null : bool3);
    }
}

package jk0;

import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import i3.e5;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Ljk0/m;", "", "Lc80/u;", "gearType", "", "name", "brand", ModelSourceWrapper.TYPE, "<init>", "(Lc80/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILc80/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f99288e = {o13.m.a(o13.n.PUBLICATION, new je0.o(17)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c80.u f99289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f99292d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/data/model/GearConnectionViewDTO.$serializer", "Lm63/e0;", "Ljk0/m;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99293a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f99293a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.data.model.GearConnectionViewDTO", aVar, 4);
            m1Var.j("gearType", false);
            m1Var.j("name", true);
            m1Var.j("brand", true);
            m1Var.j(ModelSourceWrapper.TYPE, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{m.f99288e[0].getValue(), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = m.f99288e;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            c80.u uVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    uVar = (c80.u) cVarC.l(eVar2, 0, lVarArr[0].getValue(), uVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                } else if (iE == 2) {
                    str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    str3 = (String) cVarC.v(eVar2, 3, y1.f117048a, str3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new m(i15, uVar, str, str2, str3, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            m mVar = (m) obj;
            mVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            i63.c<Object> value = m.f99288e[0].getValue();
            c80.u uVar = mVar.f99289a;
            String str = mVar.f99292d;
            String str2 = mVar.f99291c;
            String str3 = mVar.f99290b;
            dVarC.e(eVar, 0, value, uVar);
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 2, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 3, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ m(int i14, c80.u uVar, String str, String str2, String str3, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f99293a.getF158591b());
            throw null;
        }
        this.f99289a = uVar;
        if ((i14 & 2) == 0) {
            this.f99290b = null;
        } else {
            this.f99290b = str;
        }
        if ((i14 & 4) == 0) {
            this.f99291c = null;
        } else {
            this.f99291c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f99292d = null;
        } else {
            this.f99292d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f99289a == mVar.f99289a && p005kotlin.jvm.internal.s.g(this.f99290b, mVar.f99290b) && p005kotlin.jvm.internal.s.g(this.f99291c, mVar.f99291c) && p005kotlin.jvm.internal.s.g(this.f99292d, mVar.f99292d);
    }

    public final int hashCode() {
        int iHashCode = this.f99289a.hashCode() * 31;
        String str = this.f99290b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99291c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99292d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GearConnectionViewDTO(gearType=");
        sb3.append(this.f99289a);
        sb3.append(", name=");
        sb3.append(this.f99290b);
        sb3.append(", brand=");
        return e5.h(sb3, this.f99291c, ", model=", this.f99292d, ")");
    }

    /* JADX INFO: renamed from: jk0.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/m$b;", "", "<init>", "()V", "Li63/c;", "Ljk0/m;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<m> serializer() {
            return a.f99293a;
        }

        private Companion() {
        }
    }

    public m(c80.u uVar, String str, String str2, String str3) {
        uVar.getClass();
        this.f99289a = uVar;
        this.f99290b = str;
        this.f99291c = str2;
        this.f99292d = str3;
    }

    public /* synthetic */ m(c80.u uVar, String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3);
    }
}

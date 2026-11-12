package je0;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lje0/d;", "", "", TtmlNode.ATTR_ID, "", "name", "species", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "b", "a", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98488c;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/domaindogs/data/model/BreedDTO.$serializer", "Lm63/e0;", "Lje0/d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f98489a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f98489a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.domaindogs.data.model.BreedDTO", aVar, 3);
            m1Var.j(TtmlNode.ATTR_ID, false);
            m1Var.j("name", false);
            m1Var.j("species", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{v0.f117027a, y1Var, j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            long jW = 0;
            String strR = null;
            String str = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    jW = cVarC.w(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    strR = cVarC.r(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new d(i15, jW, strR, str, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            d dVar = (d) obj;
            dVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            long j8 = dVar.f98486a;
            String str = dVar.f98488c;
            dVarC.z(eVar, 0, j8);
            dVarC.k(eVar, 1, dVar.f98487b);
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 2, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ d(int i14, long j8, String str, String str2, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f98489a.getF158591b());
            throw null;
        }
        this.f98486a = j8;
        this.f98487b = str;
        if ((i14 & 4) == 0) {
            this.f98488c = null;
        } else {
            this.f98488c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f98486a == dVar.f98486a && p005kotlin.jvm.internal.s.g(this.f98487b, dVar.f98487b) && p005kotlin.jvm.internal.s.g(this.f98488c, dVar.f98488c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f98486a) * 31, 31, this.f98487b);
        String str = this.f98488c;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return v.e0.h(com.airbnb.lottie.animation.keyframe.a.k(this.f98486a, "BreedDTO(id=", ", name=", this.f98487b), ", species=", this.f98488c, ")");
    }

    /* JADX INFO: renamed from: je0.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/d$b;", "", "<init>", "()V", "Li63/c;", "Lje0/d;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f98489a;
        }

        private Companion() {
        }
    }

    public d(long j8, String str, String str2) {
        str.getClass();
        this.f98486a = j8;
        this.f98487b = str;
        this.f98488c = str2;
    }

    public /* synthetic */ d(long j8, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, (i14 & 4) != 0 ? null : str2);
    }
}

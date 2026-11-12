package d90;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Ld90/i;", "Landroid/os/Parcelable;", "Ld90/j;", "tutorialType", "", "tutorialMessage", "<init>", "(Ld90/j;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILd90/j;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f58474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58475b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<i> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58472c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f58473d = {m.a(n.PUBLICATION, new d4.h(22)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/config/model/PairTutorialConfig.$serializer", "Lm63/e0;", "Ld90/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58476a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f58476a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.PairTutorialConfig", aVar, 2);
            m1Var.j("tutorialType", true);
            m1Var.j("tutorialMessage", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{i.f58473d[0].getValue(), y1.f117048a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = i.f58473d;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            j jVar = null;
            String strR = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    jVar = (j) cVarC.l(eVar2, 0, lVarArr[0].getValue(), jVar);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    strR = cVarC.r(eVar2, 1);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, jVar, strR, u1Var);
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
            j jVar = iVar.f58474a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = i.f58473d;
            if (dVarC.C(eVar) || jVar != j.LOTTIE) {
                dVarC.e(eVar, 0, lVarArr[0].getValue(), jVar);
            }
            dVarC.k(eVar, 1, iVar.f58475b);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(j.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(int i14, j jVar, String str, u1 u1Var) {
        if (2 != (i14 & 2)) {
            k1.h(i14, 2, a.f58476a.getF158591b());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f58474a = j.LOTTIE;
        } else {
            this.f58474a = jVar;
        }
        this.f58475b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f58474a == iVar.f58474a && s.g(this.f58475b, iVar.f58475b);
    }

    public final int hashCode() {
        return this.f58475b.hashCode() + (this.f58474a.hashCode() * 31);
    }

    public final String toString() {
        return "PairTutorialConfig(tutorialType=" + this.f58474a + ", tutorialMessage=" + this.f58475b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f58474a.name());
        parcel.writeString(this.f58475b);
    }

    /* JADX INFO: renamed from: d90.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld90/i$b;", "", "<init>", "()V", "Li63/c;", "Ld90/i;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f58476a;
        }

        private Companion() {
        }
    }

    public i(j jVar, String str) {
        jVar.getClass();
        str.getClass();
        this.f58474a = jVar;
        this.f58475b = str;
    }

    public /* synthetic */ i(j jVar, String str, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? j.LOTTIE : jVar, str);
    }
}

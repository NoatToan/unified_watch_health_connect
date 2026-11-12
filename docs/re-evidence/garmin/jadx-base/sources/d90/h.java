package d90;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Ld90/h;", "Landroid/os/Parcelable;", "Ld90/j;", "tutorialType", "", "titleRes", "lastStepTitleRes", "", "gfdiCompleteMsgRequired", "<init>", "(Ld90/j;IIZ)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILd90/j;IIZLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f58467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f58470d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<h> CREATOR = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58465e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f58466f = {m.a(n.PUBLICATION, new d4.h(21)), null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/config/model/GestureTutorialConfig.$serializer", "Lm63/e0;", "Ld90/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58471a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f58471a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.GestureTutorialConfig", aVar, 4);
            m1Var.j("tutorialType", true);
            m1Var.j("titleRes", true);
            m1Var.j("lastStepTitleRes", true);
            m1Var.j("gfdiCompleteMsgRequired", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{h.f58466f[0].getValue(), m0Var, m0Var, m63.g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = h.f58466f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            boolean zG = false;
            j jVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    jVar = (j) cVarC.l(eVar2, 0, lVarArr[0].getValue(), jVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    iA = cVarC.A(eVar2, 1);
                    i15 |= 2;
                } else if (iE == 2) {
                    iA2 = cVarC.A(eVar2, 2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG = cVarC.g(eVar2, 3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new h(i15, jVar, iA, iA2, zG, (u1) null);
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
            boolean z14 = hVar.f58470d;
            int i14 = hVar.f58469c;
            int i15 = hVar.f58468b;
            j jVar = hVar.f58467a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = h.f58466f;
            if (dVarC.C(eVar) || jVar != j.LOTTIE) {
                dVarC.e(eVar, 0, lVarArr[0].getValue(), jVar);
            }
            if (dVarC.C(eVar) || i15 != R.string.common_learn_more) {
                dVarC.v(1, i15, eVar);
            }
            if (dVarC.C(eVar) || i14 != R.string.youre_all_set) {
                dVarC.v(2, i14, eVar);
            }
            if (dVarC.C(eVar) || !z14) {
                dVarC.n(eVar, 3, z14);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(j.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(int i14, j jVar, int i15, int i16, boolean z14, u1 u1Var) {
        this.f58467a = (i14 & 1) == 0 ? j.LOTTIE : jVar;
        if ((i14 & 2) == 0) {
            this.f58468b = R.string.common_learn_more;
        } else {
            this.f58468b = i15;
        }
        if ((i14 & 4) == 0) {
            this.f58469c = R.string.youre_all_set;
        } else {
            this.f58469c = i16;
        }
        if ((i14 & 8) == 0) {
            this.f58470d = true;
        } else {
            this.f58470d = z14;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f58467a == hVar.f58467a && this.f58468b == hVar.f58468b && this.f58469c == hVar.f58469c && this.f58470d == hVar.f58470d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58470d) + q2.d(this.f58469c, q2.d(this.f58468b, this.f58467a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "GestureTutorialConfig(tutorialType=" + this.f58467a + ", titleRes=" + this.f58468b + ", lastStepTitleRes=" + this.f58469c + ", gfdiCompleteMsgRequired=" + this.f58470d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f58467a.name());
        parcel.writeInt(this.f58468b);
        parcel.writeInt(this.f58469c);
        parcel.writeInt(this.f58470d ? 1 : 0);
    }

    /* JADX INFO: renamed from: d90.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld90/h$b;", "", "<init>", "()V", "Li63/c;", "Ld90/h;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f58471a;
        }

        private Companion() {
        }
    }

    public h() {
        this((j) null, 0, 0, false, 15, (p005kotlin.jvm.internal.j) null);
    }

    public h(j jVar, int i14, int i15, boolean z14) {
        jVar.getClass();
        this.f58467a = jVar;
        this.f58468b = i14;
        this.f58469c = i15;
        this.f58470d = z14;
    }

    public /* synthetic */ h(j jVar, int i14, int i15, boolean z14, int i16, p005kotlin.jvm.internal.j jVar2) {
        this((i16 & 1) != 0 ? j.LOTTIE : jVar, (i16 & 2) != 0 ? R.string.common_learn_more : i14, (i16 & 4) != 0 ? R.string.youre_all_set : i15, (i16 & 8) != 0 ? true : z14);
    }
}

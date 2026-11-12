package ww1;

import am.x0;
import am.z0;
import android.os.Parcel;
import android.os.Parcelable;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\f¨\u0006\u0010"}, d2 = {"Lww1/i0;", "Landroid/os/Parcelable;", "", "typeId", "", "typeKey", "parentTypeId", "<init>", "(ILjava/lang/String;I)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IILjava/lang/String;ILm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f187806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f187808c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<i0> CREATOR = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f187805d = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/WorkoutCompatibleActivityDTO.$serializer", "Lm63/e0;", "Lww1/i0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f187809a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f187809a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.WorkoutCompatibleActivityDTO", aVar, 3);
            m1Var.j("typeId", false);
            m1Var.j("typeKey", false);
            m1Var.j("parentTypeId", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{m0Var, y1.f117048a, m0Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            int iA = 0;
            int iA2 = 0;
            String strR = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    strR = cVarC.r(eVar2, 1);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    iA2 = cVarC.A(eVar2, 2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new i0(i15, iA, strR, iA2, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i0 i0Var = (i0) obj;
            i0Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.v(0, i0Var.f187806a, eVar);
            dVarC.k(eVar, 1, i0Var.f187807b);
            dVarC.v(2, i0Var.f187808c, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        public final i0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i0(parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final i0[] newArray(int i14) {
            return new i0[i14];
        }
    }

    public /* synthetic */ i0(int i14, int i15, String str, int i16, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f187809a.getF94809a());
            throw null;
        }
        this.f187806a = i15;
        this.f187807b = str;
        this.f187808c = i16;
    }

    public final x0 b() {
        return z0.k(this.f187806a, x0.f4346x);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f187806a == i0Var.f187806a && p005kotlin.jvm.internal.s.g(this.f187807b, i0Var.f187807b) && this.f187808c == i0Var.f187808c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187808c) + wr.g.j(Integer.hashCode(this.f187806a) * 31, 31, this.f187807b);
    }

    public final String toString() {
        return am.j.q(wr.g.r(this.f187806a, "WorkoutCompatibleActivityDTO(typeId=", ", typeKey=", this.f187807b, ", parentTypeId="), this.f187808c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f187806a);
        parcel.writeString(this.f187807b);
        parcel.writeInt(this.f187808c);
    }

    /* JADX INFO: renamed from: ww1.i0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lww1/i0$b;", "", "<init>", "()V", "Li63/c;", "Lww1/i0;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i0> serializer() {
            return a.f187809a;
        }

        private Companion() {
        }
    }

    public i0(int i14, String str, int i15) {
        str.getClass();
        this.f187806a = i14;
        this.f187807b = str;
        this.f187808c = i15;
    }
}

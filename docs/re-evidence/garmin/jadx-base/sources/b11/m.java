package b11;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lb11/m;", "Landroid/os/Parcelable;", "", "isTimelineView", "Lb11/k;", "meal", "<init>", "(ZLb11/k;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLb11/k;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class m implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14339b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<m> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/common/model/MealViewNavArgs.$serializer", "Lm63/e0;", "Lb11/m;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14340a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f14340a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.presentation.common.model.MealViewNavArgs", aVar, 2);
            m1Var.j("isTimelineView", false);
            m1Var.j("meal", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{m63.g.f116948a, j63.a.d(k.a.f14330a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            k kVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    zG = cVarC.g(eVar2, 0);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    kVar = (k) cVarC.v(eVar2, 1, k.a.f14330a, kVar);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new m(i15, zG, kVar, u1Var);
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
            boolean z14 = mVar.f14338a;
            k kVar = mVar.f14339b;
            dVarC.n(eVar, 0, z14);
            if (dVarC.C(eVar) || kVar != null) {
                dVarC.d(eVar, 1, k.a.f14330a, kVar);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel.readInt() != 0, parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(int i14, boolean z14, k kVar, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f14340a.getF158591b());
            throw null;
        }
        this.f14338a = z14;
        if ((i14 & 2) == 0) {
            this.f14339b = null;
        } else {
            this.f14339b = kVar;
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
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f14338a == mVar.f14338a && p005kotlin.jvm.internal.s.g(this.f14339b, mVar.f14339b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f14338a) * 31;
        k kVar = this.f14339b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "MealViewNavArgs(isTimelineView=" + this.f14338a + ", meal=" + this.f14339b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f14338a ? 1 : 0);
        k kVar = this.f14339b;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: b11.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb11/m$b;", "", "<init>", "()V", "Li63/c;", "Lb11/m;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<m> serializer() {
            return a.f14340a;
        }

        private Companion() {
        }
    }

    public m(boolean z14, k kVar) {
        this.f14338a = z14;
        this.f14339b = kVar;
    }

    public /* synthetic */ m(boolean z14, k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(z14, (i14 & 2) != 0 ? null : kVar);
    }
}

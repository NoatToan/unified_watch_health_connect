package b11;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lb11/k;", "Landroid/os/Parcelable;", "", "mealId", "", "mealName", "Lb63/v;", "startTime", "endTime", "<init>", "(JLjava/lang/String;Lb63/v;Lb63/v;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Lb63/v;Lb63/v;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k implements Parcelable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f14325e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b63.v f14328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.v f14329d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<k> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/common/model/MealSelection.$serializer", "Lm63/e0;", "Lb11/k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14330a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f14330a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.presentation.common.model.MealSelection", aVar, 4);
            m1Var.j("mealId", false);
            m1Var.j("mealName", false);
            m1Var.j("startTime", false);
            m1Var.j("endTime", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = k.f14325e;
            return new i63.c[]{v0.f117027a, y1.f117048a, j63.a.d(lVarArr[2].getValue()), j63.a.d(lVarArr[3].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = k.f14325e;
            int i14 = l63.c.f110557a;
            int i15 = 0;
            long jW = 0;
            String strR = null;
            b63.v vVar = null;
            b63.v vVar2 = null;
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
                } else if (iE == 2) {
                    vVar = (b63.v) cVarC.v(eVar2, 2, lVarArr[2].getValue(), vVar);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    vVar2 = (b63.v) cVarC.v(eVar2, 3, lVarArr[3].getValue(), vVar2);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new k(i15, jW, strR, vVar, vVar2, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            k kVar = (k) obj;
            kVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = k.f14325e;
            dVarC.z(eVar, 0, kVar.f14326a);
            dVarC.k(eVar, 1, kVar.f14327b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), kVar.f14328c);
            dVarC.d(eVar, 3, lVarArr[3].getValue(), kVar.f14329d);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readLong(), parcel.readString(), (b63.v) parcel.readSerializable(), (b63.v) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f14325e = new o13.l[]{null, null, o13.m.a(nVar, new aw1.d(21)), o13.m.a(nVar, new aw1.d(22))};
    }

    public /* synthetic */ k(int i14, long j8, String str, b63.v vVar, b63.v vVar2, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f14330a.getF158591b());
            throw null;
        }
        this.f14326a = j8;
        this.f14327b = str;
        this.f14328c = vVar;
        this.f14329d = vVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f14326a == kVar.f14326a && p005kotlin.jvm.internal.s.g(this.f14327b, kVar.f14327b) && p005kotlin.jvm.internal.s.g(this.f14328c, kVar.f14328c) && p005kotlin.jvm.internal.s.g(this.f14329d, kVar.f14329d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(Long.hashCode(this.f14326a) * 31, 31, this.f14327b);
        b63.v vVar = this.f14328c;
        int iHashCode = (iJ + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        b63.v vVar2 = this.f14329d;
        return iHashCode + (vVar2 != null ? vVar2.f16219a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f14326a, "MealSelection(mealId=", ", mealName=", this.f14327b);
        sbK.append(", startTime=");
        sbK.append(this.f14328c);
        sbK.append(", endTime=");
        sbK.append(this.f14329d);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f14326a);
        parcel.writeString(this.f14327b);
        parcel.writeSerializable(this.f14328c);
        parcel.writeSerializable(this.f14329d);
    }

    /* JADX INFO: renamed from: b11.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb11/k$b;", "", "<init>", "()V", "Li63/c;", "Lb11/k;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f14330a;
        }

        private Companion() {
        }
    }

    public k(long j8, String str, b63.v vVar, b63.v vVar2) {
        str.getClass();
        this.f14326a = j8;
        this.f14327b = str;
        this.f14328c = vVar;
        this.f14329d = vVar2;
    }
}

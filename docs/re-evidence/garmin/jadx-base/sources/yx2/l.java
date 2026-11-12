package yx2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lyx2/l;", "Landroid/os/Parcelable;", "Lyx2/f;", "oneTimeFee", "fee", "Lyx2/e;", FirebaseAnalytics.Param.DISCOUNT, "oneTimeDiscount", "<init>", "(Lyx2/f;Lyx2/f;Lyx2/e;Lyx2/e;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILyx2/f;Lyx2/f;Lyx2/e;Lyx2/e;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class l implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f200117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f200118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f200119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f200120d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<l> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/dto/SubscriptionPricingDTO.$serializer", "Lm63/e0;", "Lyx2/l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200121a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200121a = aVar;
            m1 m1Var = new m1("com.garmin.subscriptions.dto.SubscriptionPricingDTO", aVar, 4);
            m1Var.j("oneTimeFee", true);
            m1Var.j("fee", false);
            m1Var.j(FirebaseAnalytics.Param.DISCOUNT, true);
            m1Var.j("oneTimeDiscount", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            f.a aVar = f.a.f200080a;
            i63.c<?> cVarD = j63.a.d(aVar);
            e.a aVar2 = e.a.f200077a;
            return new i63.c[]{cVarD, aVar, j63.a.d(aVar2), j63.a.d(aVar2)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            f fVar = null;
            f fVar2 = null;
            e eVar3 = null;
            e eVar4 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    fVar = (f) cVarC.v(eVar2, 0, f.a.f200080a, fVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    fVar2 = (f) cVarC.l(eVar2, 1, f.a.f200080a, fVar2);
                    i15 |= 2;
                } else if (iE == 2) {
                    eVar3 = (e) cVarC.v(eVar2, 2, e.a.f200077a, eVar3);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    eVar4 = (e) cVarC.v(eVar2, 3, e.a.f200077a, eVar4);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new l(i15, fVar, fVar2, eVar3, eVar4, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            l lVar = (l) obj;
            lVar.getClass();
            f fVar2 = lVar.f200117a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || fVar2 != null) {
                dVarC.d(eVar, 0, f.a.f200080a, fVar2);
            }
            f.a aVar = f.a.f200080a;
            f fVar3 = lVar.f200118b;
            e eVar2 = lVar.f200120d;
            e eVar3 = lVar.f200119c;
            dVarC.e(eVar, 1, aVar, fVar3);
            if (dVarC.C(eVar) || eVar3 != null) {
                dVarC.d(eVar, 2, e.a.f200077a, eVar3);
            }
            if (dVarC.C(eVar) || eVar2 != null) {
                dVarC.d(eVar, 3, e.a.f200077a, eVar2);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), f.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(int i14, f fVar, f fVar2, e eVar, e eVar2, u1 u1Var) {
        if (2 != (i14 & 2)) {
            k1.h(i14, 2, a.f200121a.getF158591b());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f200117a = null;
        } else {
            this.f200117a = fVar;
        }
        this.f200118b = fVar2;
        if ((i14 & 4) == 0) {
            this.f200119c = null;
        } else {
            this.f200119c = eVar;
        }
        if ((i14 & 8) == 0) {
            this.f200120d = null;
        } else {
            this.f200120d = eVar2;
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f200117a, lVar.f200117a) && s.g(this.f200118b, lVar.f200118b) && s.g(this.f200119c, lVar.f200119c) && s.g(this.f200120d, lVar.f200120d);
    }

    public final int hashCode() {
        f fVar = this.f200117a;
        int iHashCode = (this.f200118b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31;
        e eVar = this.f200119c;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.f200120d;
        return iHashCode2 + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionPricingDTO(oneTimeFee=" + this.f200117a + ", fee=" + this.f200118b + ", discount=" + this.f200119c + ", oneTimeDiscount=" + this.f200120d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f fVar = this.f200117a;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        this.f200118b.writeToParcel(parcel, i14);
        e eVar = this.f200119c;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        e eVar2 = this.f200120d;
        if (eVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar2.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: yx2.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyx2/l$b;", "", "<init>", "()V", "Li63/c;", "Lyx2/l;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<l> serializer() {
            return a.f200121a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public l(f fVar, f fVar2, e eVar, e eVar2) {
        fVar2.getClass();
        this.f200117a = fVar;
        this.f200118b = fVar2;
        this.f200119c = eVar;
        this.f200120d = eVar2;
    }

    public /* synthetic */ l(f fVar, f fVar2, e eVar, e eVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : fVar, fVar2, (i14 & 4) != 0 ? null : eVar, (i14 & 8) != 0 ? null : eVar2);
    }
}

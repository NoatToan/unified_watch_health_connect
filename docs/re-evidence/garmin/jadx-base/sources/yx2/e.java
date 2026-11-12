package yx2;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.x;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lyx2/e;", "Landroid/os/Parcelable;", "", "percent", "", "raw", "", "formatted", "<init>", "(IDLjava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIDLjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class e implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f200074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f200075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200076c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<e> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/dto/DiscountDTO.$serializer", "Lm63/e0;", "Lyx2/e;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200077a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200077a = aVar;
            m1 m1Var = new m1("com.garmin.subscriptions.dto.DiscountDTO", aVar, 3);
            m1Var.j("discountPercent", false);
            m1Var.j("discountRaw", false);
            m1Var.j("discountFormatted", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{m0.f116981a, x.f117036a, j63.a.d(y1.f117048a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            int iA = 0;
            double dT = 0.0d;
            String str = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    dT = cVarC.t(eVar2, 1);
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
            return new e(i15, iA, dT, str, (u1) null);
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
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            int i14 = eVar.f200074a;
            String str = eVar.f200076c;
            dVarC.v(0, i14, eVar2);
            dVarC.B(eVar2, 1, eVar.f200075b);
            if (dVarC.C(eVar2) || str != null) {
                dVarC.d(eVar2, 2, y1.f117048a, str);
            }
            dVarC.b(eVar2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readInt(), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(int i14, int i15, double d14, String str, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f200077a.getF158591b());
            throw null;
        }
        this.f200074a = i15;
        this.f200075b = d14;
        if ((i14 & 4) == 0) {
            this.f200076c = null;
        } else {
            this.f200076c = str;
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f200074a == eVar.f200074a && Double.compare(this.f200075b, eVar.f200075b) == 0 && s.g(this.f200076c, eVar.f200076c);
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(Integer.hashCode(this.f200074a) * 31, 31, this.f200075b);
        String str = this.f200076c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DiscountDTO(percent=");
        sb3.append(this.f200074a);
        sb3.append(", raw=");
        sb3.append(this.f200075b);
        return v.e0.h(sb3, ", formatted=", this.f200076c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f200074a);
        parcel.writeDouble(this.f200075b);
        parcel.writeString(this.f200076c);
    }

    /* JADX INFO: renamed from: yx2.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyx2/e$b;", "", "<init>", "()V", "Li63/c;", "Lyx2/e;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<e> serializer() {
            return a.f200077a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public e(int i14, double d14, String str) {
        this.f200074a = i14;
        this.f200075b = d14;
        this.f200076c = str;
    }

    public /* synthetic */ e(int i14, double d14, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, d14, (i15 & 4) != 0 ? null : str);
    }
}

package uk0;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import uf2.p0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Luk0/a;", "Landroid/os/Parcelable;", "", "uuid", "Lc80/u;", NotificationConstants.KEY_DATA_MIME_TYPE, "name", "brand", ModelSourceWrapper.TYPE, "<init>", "(Ljava/lang/String;Lc80/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lc80/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c80.u f171796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f171797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f171798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f171799e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f171794f = {null, o13.m.a(o13.n.PUBLICATION, new p0(12)), null, null, null};

    /* JADX INFO: renamed from: uk0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/shared/BasicGearData.$serializer", "Lm63/e0;", "Luk0/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C3195a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3195a f171800a;
        private static final k63.e descriptor;

        static {
            C3195a c3195a = new C3195a();
            f171800a = c3195a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.shared.BasicGearData", c3195a, 5);
            m1Var.j("uuid", false);
            m1Var.j(NotificationConstants.KEY_DATA_MIME_TYPE, false);
            m1Var.j("name", false);
            m1Var.j("brand", false);
            m1Var.j(ModelSourceWrapper.TYPE, false);
            descriptor = m1Var;
        }

        private C3195a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = a.f171794f;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, lVarArr[1].getValue(), j63.a.d(y1Var), y1Var, j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = a.f171794f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            c80.u uVar = null;
            String str = null;
            String strR2 = null;
            String str2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    uVar = (c80.u) cVarC.l(eVar2, 1, lVarArr[1].getValue(), uVar);
                    i15 |= 2;
                } else if (iE == 2) {
                    str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                    i15 |= 4;
                } else if (iE == 3) {
                    strR2 = cVarC.r(eVar2, 3);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    str2 = (String) cVarC.v(eVar2, 4, y1.f117048a, str2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, strR, uVar, str, strR2, str2, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = a.f171794f;
            dVarC.k(eVar, 0, aVar.f171795a);
            dVarC.e(eVar, 1, lVarArr[1].getValue(), aVar.f171796b);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 2, y1Var, aVar.f171797c);
            dVarC.k(eVar, 3, aVar.f171798d);
            dVarC.d(eVar, 4, y1Var, aVar.f171799e);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), c80.u.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(int i14, String str, c80.u uVar, String str2, String str3, String str4, u1 u1Var) {
        if (31 != (i14 & 31)) {
            k1.h(i14, 31, C3195a.f171800a.getF116202c());
            throw null;
        }
        this.f171795a = str;
        this.f171796b = uVar;
        this.f171797c = str2;
        this.f171798d = str3;
        this.f171799e = str4;
    }

    public final String b(Context context) {
        context.getClass();
        r.f171870a.getClass();
        return r.a(context, this.f171797c, this.f171798d, this.f171799e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f171795a, aVar.f171795a) && this.f171796b == aVar.f171796b && p005kotlin.jvm.internal.s.g(this.f171797c, aVar.f171797c) && p005kotlin.jvm.internal.s.g(this.f171798d, aVar.f171798d) && p005kotlin.jvm.internal.s.g(this.f171799e, aVar.f171799e);
    }

    public final int hashCode() {
        int iHashCode = (this.f171796b.hashCode() + (this.f171795a.hashCode() * 31)) * 31;
        String str = this.f171797c;
        int iJ = wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f171798d);
        String str2 = this.f171799e;
        return iJ + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BasicGearData(uuid=");
        sb3.append(this.f171795a);
        sb3.append(", type=");
        sb3.append(this.f171796b);
        sb3.append(", name=");
        sn.a.t(sb3, this.f171797c, ", brand=", this.f171798d, ", model=");
        return am.j.o(this.f171799e, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f171795a);
        parcel.writeString(this.f171796b.name());
        parcel.writeString(this.f171797c);
        parcel.writeString(this.f171798d);
        parcel.writeString(this.f171799e);
    }

    /* JADX INFO: renamed from: uk0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luk0/a$b;", "", "<init>", "()V", "Li63/c;", "Luk0/a;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C3195a.f171800a;
        }

        private Companion() {
        }
    }

    public a(String str, c80.u uVar, String str2, String str3, String str4) {
        str.getClass();
        uVar.getClass();
        str3.getClass();
        this.f171795a = str;
        this.f171796b = uVar;
        this.f171797c = str2;
        this.f171798d = str3;
        this.f171799e = str4;
    }
}

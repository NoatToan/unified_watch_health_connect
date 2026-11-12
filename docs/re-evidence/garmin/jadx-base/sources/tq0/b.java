package tq0;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Ltq0/b;", "Landroid/os/Parcelable;", "", "field", "fieldUnit", "localizedField", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f166041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f166042c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/insights/model/ActivityFieldDTO.$serializer", "Lm63/e0;", "Ltq0/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f166043a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f166043a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.insights.model.ActivityFieldDTO", aVar, 3);
            m1Var.j("field", true);
            m1Var.j("fieldUnit", true);
            m1Var.j("localizedField", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else if (iE == 1) {
                    str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    str3 = (String) cVarC.v(eVar2, 2, y1.f117048a, str3);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, str, str2, str3, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            String str = bVar.f166042c;
            String str2 = bVar.f166041b;
            String str3 = bVar.f166040a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 0, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 2, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(int i14, String str, String str2, String str3, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f166040a = null;
        } else {
            this.f166040a = str;
        }
        if ((i14 & 2) == 0) {
            this.f166041b = null;
        } else {
            this.f166041b = str2;
        }
        if ((i14 & 4) == 0) {
            this.f166042c = null;
        } else {
            this.f166042c = str3;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f166040a, bVar.f166040a) && s.g(this.f166041b, bVar.f166041b) && s.g(this.f166042c, bVar.f166042c);
    }

    public final int hashCode() {
        String str = this.f166040a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f166041b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f166042c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.f166042c, ")", p6.b.i("ActivityFieldDTO(field=", this.f166040a, ", fieldUnit=", this.f166041b, ", localizedField="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f166040a);
        parcel.writeString(this.f166041b);
        parcel.writeString(this.f166042c);
    }

    /* JADX INFO: renamed from: tq0.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltq0/b$b;", "", "<init>", "()V", "Li63/c;", "Ltq0/b;", "serializer", "()Li63/c;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f166043a;
        }

        private Companion() {
        }
    }

    public b() {
        this((String) null, (String) null, (String) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public b(String str, String str2, String str3) {
        this.f166040a = str;
        this.f166041b = str2;
        this.f166042c = str3;
    }

    public /* synthetic */ b(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3);
    }
}

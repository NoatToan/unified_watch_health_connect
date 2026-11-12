package tq0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Ltq0/f;", "Landroid/os/Parcelable;", "", FirebaseAnalytics.Param.INDEX, "", "show", "", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(IZLjava/lang/String;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IIZLjava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f166055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f166057c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<f> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/insights/model/InsightActivityPreferenceDTO.$serializer", "Lm63/e0;", "Ltq0/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f166058a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f166058a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.insights.model.InsightActivityPreferenceDTO", aVar, 3);
            m1Var.j(FirebaseAnalytics.Param.INDEX, true);
            m1Var.j("show", true);
            m1Var.j(NotificationConstants.KEY_DATA_MIME_TYPE, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{m0.f116981a, m63.g.f116948a, j63.a.d(y1.f117048a)};
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
            boolean zG = false;
            String str = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    iA = cVarC.A(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    zG = cVarC.g(eVar2, 1);
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
            return new f(i15, iA, zG, str, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            f fVar2 = (f) obj;
            fVar2.getClass();
            String str = fVar2.f166057c;
            boolean z14 = fVar2.f166056b;
            int i14 = fVar2.f166055a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || i14 != 0) {
                dVarC.v(0, i14, eVar);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 1, z14);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 2, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(int i14, int i15, boolean z14, String str, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f166055a = 0;
        } else {
            this.f166055a = i15;
        }
        if ((i14 & 2) == 0) {
            this.f166056b = false;
        } else {
            this.f166056b = z14;
        }
        if ((i14 & 4) == 0) {
            this.f166057c = null;
        } else {
            this.f166057c = str;
        }
    }

    public static f b(f fVar, int i14, boolean z14, int i15) {
        if ((i15 & 1) != 0) {
            i14 = fVar.f166055a;
        }
        if ((i15 & 2) != 0) {
            z14 = fVar.f166056b;
        }
        String str = fVar.f166057c;
        fVar.getClass();
        return new f(i14, z14, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f166055a == fVar.f166055a && this.f166056b == fVar.f166056b && s.g(this.f166057c, fVar.f166057c);
    }

    public final int hashCode() {
        int iG = q6.f.g(Integer.hashCode(this.f166055a) * 31, 31, this.f166056b);
        String str = this.f166057c;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InsightActivityPreferenceDTO(index=");
        sb3.append(this.f166055a);
        sb3.append(", show=");
        sb3.append(this.f166056b);
        sb3.append(", type=");
        return am.j.o(this.f166057c, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f166055a);
        parcel.writeInt(this.f166056b ? 1 : 0);
        parcel.writeString(this.f166057c);
    }

    /* JADX INFO: renamed from: tq0.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltq0/f$b;", "", "<init>", "()V", "Li63/c;", "Ltq0/f;", "serializer", "()Li63/c;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f166058a;
        }

        private Companion() {
        }
    }

    public f() {
        this(0, false, (String) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public f(int i14, boolean z14, String str) {
        this.f166055a = i14;
        this.f166056b = z14;
        this.f166057c = str;
    }

    public /* synthetic */ f(int i14, boolean z14, String str, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? null : str);
    }
}

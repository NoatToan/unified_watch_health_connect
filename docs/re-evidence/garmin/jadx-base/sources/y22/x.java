package y22;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Ly22/x;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "uri", "", "photoId", "", "failedToUpload", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILandroid/net/Uri;Ljava/lang/String;ZLm63/u1;)V", "Companion", "a", "b", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class x implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f194329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f194331c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<x> CREATOR = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f194327d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f194328e = {o13.m.a(o13.n.PUBLICATION, new xh0.d(24)), null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/view/photos/PhotoState.$serializer", "Lm63/e0;", "Ly22/x;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f194332a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f194332a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.view.photos.PhotoState", aVar, 3);
            m1Var.j("uri", false);
            m1Var.j("photoId", true);
            m1Var.j("failedToUpload", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{x.f194328e[0].getValue(), j63.a.d(y1.f117048a), m63.g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = x.f194328e;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            Uri uri = null;
            String str = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    uri = (Uri) cVarC.l(eVar2, 0, lVarArr[0].getValue(), uri);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG = cVarC.g(eVar2, 2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new x(i15, uri, str, zG, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            x xVar = (x) obj;
            xVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            i63.c<Object> value = x.f194328e[0].getValue();
            Uri uri = xVar.f194329a;
            boolean z14 = xVar.f194331c;
            String str = xVar.f194330b;
            dVarC.e(eVar, 0, value, uri);
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 1, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 2, z14);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new x((Uri) parcel.readParcelable(x.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public /* synthetic */ x(int i14, Uri uri, String str, boolean z14, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, a.f194332a.getF116202c());
            throw null;
        }
        this.f194329a = uri;
        if ((i14 & 2) == 0) {
            this.f194330b = null;
        } else {
            this.f194330b = str;
        }
        if ((i14 & 4) == 0) {
            this.f194331c = false;
        } else {
            this.f194331c = z14;
        }
    }

    public static x b(x xVar) {
        Uri uri = xVar.f194329a;
        String str = xVar.f194330b;
        xVar.getClass();
        uri.getClass();
        return new x(uri, str, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p005kotlin.jvm.internal.s.g(this.f194329a, xVar.f194329a) && p005kotlin.jvm.internal.s.g(this.f194330b, xVar.f194330b) && this.f194331c == xVar.f194331c;
    }

    public final int hashCode() {
        int iHashCode = this.f194329a.hashCode() * 31;
        String str = this.f194330b;
        return Boolean.hashCode(this.f194331c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PhotoState(uri=");
        sb3.append(this.f194329a);
        sb3.append(", photoId=");
        sb3.append(this.f194330b);
        sb3.append(", failedToUpload=");
        return hb.a.k(sb3, this.f194331c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f194329a, i14);
        parcel.writeString(this.f194330b);
        parcel.writeInt(this.f194331c ? 1 : 0);
    }

    /* JADX INFO: renamed from: y22.x$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly22/x$b;", "", "<init>", "()V", "Li63/c;", "Ly22/x;", "serializer", "()Li63/c;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<x> serializer() {
            return a.f194332a;
        }

        private Companion() {
        }
    }

    public x(Uri uri, String str, boolean z14) {
        uri.getClass();
        this.f194329a = uri;
        this.f194330b = str;
        this.f194331c = z14;
    }

    public /* synthetic */ x(Uri uri, String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(uri, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? false : z14);
    }
}

package oz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.common.HttpHeaders;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Loz0/i;", "Landroid/os/Parcelable;", "", "kind", HttpHeaders.ETAG, TtmlNode.ATTR_ID, "Loz0/d;", "snippet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loz0/d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Loz0/d;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f134488d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<i> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/newsfeed/model/YoutubeVideoItem.$serializer", "Lm63/e0;", "Loz0/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134489a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f134489a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.newsfeed.model.YoutubeVideoItem", aVar, 4);
            m1Var.j("kind", false);
            m1Var.j(HttpHeaders.ETAG, false);
            m1Var.j(TtmlNode.ATTR_ID, false);
            m1Var.j("snippet", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(d.a.f134467a)};
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
            d dVar = null;
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
                } else if (iE == 2) {
                    str3 = (String) cVarC.v(eVar2, 2, y1.f117048a, str3);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    dVar = (d) cVarC.v(eVar2, 3, d.a.f134467a, dVar);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, str, str2, str3, dVar, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 0, y1Var, iVar.f134485a);
            dVarC.d(eVar, 1, y1Var, iVar.f134486b);
            dVarC.d(eVar, 2, y1Var, iVar.f134487c);
            dVarC.d(eVar, 3, d.a.f134467a, iVar.f134488d);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(int i14, String str, String str2, String str3, d dVar, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f134489a.getF158591b());
            throw null;
        }
        this.f134485a = str;
        this.f134486b = str2;
        this.f134487c = str3;
        this.f134488d = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f134485a, iVar.f134485a) && s.g(this.f134486b, iVar.f134486b) && s.g(this.f134487c, iVar.f134487c) && s.g(this.f134488d, iVar.f134488d);
    }

    public final int hashCode() {
        String str = this.f134485a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f134486b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f134487c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar = this.f134488d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("YoutubeVideoItem(kind=", this.f134485a, ", etag=", this.f134486b, ", id=");
        sbI.append(this.f134487c);
        sbI.append(", snippet=");
        sbI.append(this.f134488d);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f134485a);
        parcel.writeString(this.f134486b);
        parcel.writeString(this.f134487c);
        d dVar = this.f134488d;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: oz0.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loz0/i$b;", "", "<init>", "()V", "Li63/c;", "Loz0/i;", "serializer", "()Li63/c;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f134489a;
        }

        private Companion() {
        }
    }

    public i(String str, String str2, String str3, d dVar) {
        this.f134485a = str;
        this.f134486b = str2;
        this.f134487c = str3;
        this.f134488d = dVar;
    }
}

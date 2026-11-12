package oz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.common.HttpHeaders;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Loz0/h;", "Landroid/os/Parcelable;", "", "kind", HttpHeaders.ETAG, "", "Loz0/i;", FirebaseAnalytics.Param.ITEMS, "Loz0/c;", "pageInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Loz0/c;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Loz0/c;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i> f134482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oz0.c f134483d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<h> CREATOR = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f134479e = {null, null, m.a(n.PUBLICATION, new oe0.e(23)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/newsfeed/model/YoutubeVideoDataDTO.$serializer", "Lm63/e0;", "Loz0/h;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134484a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f134484a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.newsfeed.model.YoutubeVideoDataDTO", aVar, 4);
            m1Var.j("kind", false);
            m1Var.j(HttpHeaders.ETAG, false);
            m1Var.j(FirebaseAnalytics.Param.ITEMS, false);
            m1Var.j("pageInfo", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = h.f134479e;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[2].getValue()), j63.a.d(oz0.c.a.f134453a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = h.f134479e;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String str = null;
            String str2 = null;
            List list = null;
            oz0.c cVar = null;
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
                    list = (List) cVarC.v(eVar2, 2, lVarArr[2].getValue(), list);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    cVar = (oz0.c) cVarC.v(eVar2, 3, oz0.c.a.f134453a, cVar);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new h(i15, str, str2, list, cVar, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            h hVar = (h) obj;
            hVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = h.f134479e;
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 0, y1Var, hVar.f134480a);
            dVarC.d(eVar, 1, y1Var, hVar.f134481b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), hVar.f134482c);
            dVarC.d(eVar, 3, oz0.c.a.f134453a, hVar.f134483d);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(i.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new h(string, string2, arrayList, parcel.readInt() != 0 ? oz0.c.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(int i14, String str, String str2, List list, oz0.c cVar, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f134484a.getF116202c());
            throw null;
        }
        this.f134480a = str;
        this.f134481b = str2;
        this.f134482c = list;
        this.f134483d = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f134480a, hVar.f134480a) && s.g(this.f134481b, hVar.f134481b) && s.g(this.f134482c, hVar.f134482c) && s.g(this.f134483d, hVar.f134483d);
    }

    public final int hashCode() {
        String str = this.f134480a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f134481b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<i> list = this.f134482c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        oz0.c cVar = this.f134483d;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("YoutubeVideoDataDTO(kind=", this.f134480a, ", etag=", this.f134481b, ", items=");
        sbI.append(this.f134482c);
        sbI.append(", pageInfo=");
        sbI.append(this.f134483d);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f134480a);
        parcel.writeString(this.f134481b);
        List<i> list = this.f134482c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((i) itO.next()).writeToParcel(parcel, i14);
            }
        }
        oz0.c cVar = this.f134483d;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: oz0.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loz0/h$b;", "", "<init>", "()V", "Li63/c;", "Loz0/h;", "serializer", "()Li63/c;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return a.f134484a;
        }

        private Companion() {
        }
    }

    public h(String str, String str2, List<i> list, oz0.c cVar) {
        this.f134480a = str;
        this.f134481b = str2;
        this.f134482c = list;
        this.f134483d = cVar;
    }
}

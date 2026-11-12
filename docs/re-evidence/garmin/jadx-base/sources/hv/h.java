package hv;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c22.b0;
import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import o13.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lhv/h;", "Landroid/os/Parcelable;", "Ljava/util/ArrayList;", "Lbm2/c;", "Lkotlin/collections/ArrayList;", "allDevices", "", "userCountry", "", "isMBTesterUser", "shouldDisablePairingConstraints", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;ZZ)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<bm2.c> f85765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f85768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f85769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f85764f = new a(null);
    public static final Parcelable.Creator<h> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD = 0;
            while (iD != i14) {
                iD = u0.d(h.class, parcel, arrayList, iD, 1);
            }
            return new h(arrayList, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(ArrayList<bm2.c> arrayList, String str, boolean z14, boolean z15) {
        arrayList.getClass();
        str.getClass();
        this.f85765a = arrayList;
        this.f85766b = str;
        this.f85767c = z14;
        this.f85768d = z15;
        final int i14 = 0;
        o13.m.b(new e23.a(this) { // from class: hv.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f85763b;

            {
                this.f85763b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                h hVar = this.f85763b;
                switch (i15) {
                    case 0:
                        h.a aVar = h.f85764f;
                        ArrayList<bm2.c> arrayList2 = hVar.f85765a;
                        String str2 = hVar.f85766b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            bm2.c cVar = (bm2.c) obj;
                            if (cVar.f18928p && i.a(zb0.k.f(cVar), str2, false)) {
                                arrayList3.add(obj);
                            }
                        }
                        return new ArrayList(arrayList3);
                    default:
                        h.a aVar2 = h.f85764f;
                        ArrayList<bm2.c> arrayList4 = hVar.f85765a;
                        String str3 = hVar.f85766b;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : arrayList4) {
                            if (i.a(zb0.k.f((bm2.c) obj2), str3, false)) {
                                arrayList5.add(obj2);
                            }
                        }
                        return new ArrayList(arrayList5);
                }
            }
        });
        final int i15 = 1;
        this.f85769e = o13.m.b(new e23.a(this) { // from class: hv.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f85763b;

            {
                this.f85763b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                h hVar = this.f85763b;
                switch (i16) {
                    case 0:
                        h.a aVar = h.f85764f;
                        ArrayList<bm2.c> arrayList2 = hVar.f85765a;
                        String str2 = hVar.f85766b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            bm2.c cVar = (bm2.c) obj;
                            if (cVar.f18928p && i.a(zb0.k.f(cVar), str2, false)) {
                                arrayList3.add(obj);
                            }
                        }
                        return new ArrayList(arrayList3);
                    default:
                        h.a aVar2 = h.f85764f;
                        ArrayList<bm2.c> arrayList4 = hVar.f85765a;
                        String str3 = hVar.f85766b;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : arrayList4) {
                            if (i.a(zb0.k.f((bm2.c) obj2), str3, false)) {
                                arrayList5.add(obj2);
                            }
                        }
                        return new ArrayList(arrayList5);
                }
            }
        });
    }

    public final bm2.c b(String str) {
        Object next;
        str.getClass();
        Iterator it = ((ArrayList) this.f85769e.getValue()).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (s.g(((bm2.c) next).f18897a, str)) {
                return (bm2.c) next;
            }
        }
        next = null;
        return (bm2.c) next;
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
        return s.g(this.f85765a, hVar.f85765a) && s.g(this.f85766b, hVar.f85766b) && this.f85767c == hVar.f85767c && this.f85768d == hVar.f85768d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85768d) + q6.f.g(wr.g.j(this.f85765a.hashCode() * 31, 31, this.f85766b), 31, this.f85767c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GarminDevices(allDevices=");
        sb3.append(this.f85765a);
        sb3.append(", userCountry=");
        sb3.append(this.f85766b);
        sb3.append(", isMBTesterUser=");
        return com.airbnb.lottie.animation.keyframe.a.f(", shouldDisablePairingConstraints=", ")", sb3, this.f85767c, this.f85768d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        ArrayList<bm2.c> arrayList = this.f85765a;
        parcel.writeInt(arrayList.size());
        Iterator<bm2.c> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i14);
        }
        parcel.writeString(this.f85766b);
        parcel.writeInt(this.f85767c ? 1 : 0);
        parcel.writeInt(this.f85768d ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhv/h$a;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h a() {
            qd2.a aVarB = qd2.a.b();
            String[] strArrD = aVarB != null ? aVarB.d(qd2.a.b.ALL_DEVICES) : null;
            if (strArrD != null && !TextUtils.isEmpty(strArrD[1])) {
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONArray jSONArray = new JSONObject(strArrD[1]).getJSONArray("devices");
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        for (int i14 = 0; i14 < length; i14++) {
                            bm2.c cVarD = bm2.c.d(jSONArray.getJSONObject(i14));
                            if (cVarD != null) {
                                arrayList.add(cVarD);
                            }
                        }
                    }
                    return new h(arrayList, b0.b(null), false, false, 12, null);
                } catch (JSONException e4) {
                    i2.f36769a.getClass();
                    i2.a.f(a2.BIC, "GarminDevices", "Failed to retrieve ALL_DEVICES from cache: " + e4);
                }
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(ArrayList arrayList, String str, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            s3.f23252a.getClass();
            z14 = s3.a("ROLE_MBTESTER");
        }
        if ((i14 & 8) != 0) {
            f12.l.f68084a.getClass();
            z15 = f12.l.a.a().I2();
        }
        this(arrayList, str, z14, z15);
    }
}

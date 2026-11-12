package og1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Log1/e;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "", "Log1/g;", "mDisplayedActivitiesListDTO", "<init>", "(Ljava/util/List;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e extends s1 implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<g> f131999a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(g.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new e(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && s.g(this.f131999a, ((e) obj).f131999a);
    }

    public final int hashCode() {
        List<g> list = this.f131999a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        jSONObject.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void m(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (this.f131999a == null) {
            this.f131999a = new ArrayList();
        }
        List<g> list = this.f131999a;
        list.getClass();
        list.clear();
        int length = jSONArray.length();
        for (int i14 = 0; i14 < length; i14++) {
            g gVar = new g(null, null, null, null, 15, null);
            gVar.k(jSONArray.getJSONObject(i14));
            List<g> list2 = this.f131999a;
            list2.getClass();
            list2.add(gVar);
        }
    }

    public final String toString() {
        return k.h("ActivityOptionsListDTO(mDisplayedActivitiesListDTO=", ")", this.f131999a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<g> list = this.f131999a;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((g) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public e(List<g> list) {
        this.f131999a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

package yg1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class j extends s1 implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f196933a;

    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f196933a = arrayList;
        parcel.readTypedList(arrayList, g.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void m(String str) {
        JSONArray jSONArray = new JSONArray(str);
        if (this.f196933a == null) {
            this.f196933a = new ArrayList();
        }
        this.f196933a.clear();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            g gVar = new g();
            gVar.k(jSONArray.getJSONObject(i14));
            this.f196933a.add(gVar);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeTypedList(this.f196933a);
    }

    public j() {
    }
}

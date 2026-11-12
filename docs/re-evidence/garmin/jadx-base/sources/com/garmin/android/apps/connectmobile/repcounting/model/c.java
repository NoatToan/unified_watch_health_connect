package com.garmin.android.apps.connectmobile.repcounting.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.gncs.NotificationConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import o13.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\f\rB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0003\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "exercisesList", "([Lcom/garmin/android/apps/connectmobile/repcounting/model/d;)V", "c", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f41095b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41096c = 8;
    public static final Parcelable.Creator<c> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/repcounting/model/c$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.repcounting.model.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/c$c;", "Landroid/os/Parcelable;", "", "category", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "item", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/repcounting/model/d;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0779c implements Parcelable {
        public static final Parcelable.Creator<C0779c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f41099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f41100c;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.repcounting.model.c$c$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C0779c> {
            @Override // android.os.Parcelable.Creator
            public final C0779c createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new C0779c(parcel.readString(), parcel.readString(), d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final C0779c[] newArray(int i14) {
                return new C0779c[i14];
            }
        }

        public C0779c(String str, String str2, d dVar) {
            str2.getClass();
            dVar.getClass();
            this.f41098a = str;
            this.f41099b = str2;
            this.f41100c = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0779c)) {
                return false;
            }
            C0779c c0779c = (C0779c) obj;
            return s.g(this.f41098a, c0779c.f41098a) && this.f41099b.equals(c0779c.f41099b) && this.f41100c.equals(c0779c.f41100c);
        }

        public final int hashCode() {
            String str = this.f41098a;
            return this.f41100c.hashCode() + wr.g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.f41099b);
        }

        public final String toString() {
            StringBuilder sbI = p6.b.i("Exercise(category=", this.f41098a, ", type=", this.f41099b, ", item=");
            sbI.append(this.f41100c);
            sbI.append(")");
            return sbI.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.getClass();
            parcel.writeString(this.f41098a);
            parcel.writeString(this.f41099b);
            this.f41100c.writeToParcel(parcel, i14);
        }
    }

    public c(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f41097a = arrayList;
        if (parcel != null) {
            parcel.writeParcelableArray((Parcelable[]) arrayList.toArray(new C0779c[0]), 0);
        }
    }

    public final void C(d[] dVarArr) {
        dVarArr.getClass();
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (d dVar : dVarArr) {
            String str = dVar.f41102a;
            String str2 = dVar.f41106e;
            if (str2 == null) {
                str2 = str == null ? "" : str;
            }
            arrayList.add(new C0779c(str, str2, dVar));
        }
        this.f41097a.addAll(arrayList);
    }

    public final d D(String str, String str2) {
        d dVar;
        Iterator it = this.f41097a.iterator();
        do {
            dVar = null;
            if (!it.hasNext()) {
                break;
            }
            C0779c c0779c = (C0779c) it.next();
            String str3 = c0779c.f41098a;
            String str4 = c0779c.f41099b;
            d dVar2 = c0779c.f41100c;
            if (s.g(str3, str) && str4.equals(str2)) {
                dVar = dVar2;
            }
        } while (dVar == null);
        return dVar;
    }

    public final d[] F() {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f41097a) {
            C0779c c0779c = (C0779c) obj;
            if (hashSet.add(new p(c0779c.f41098a, c0779c.f41099b))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0779c) it.next()).f41100c);
        }
        return (d[]) arrayList2.toArray(new d[0]);
    }

    public final String G(String str, String str2) {
        String str3;
        d dVarD = D(str, str2);
        return (dVarD == null || (str3 = dVarD.f41107f) == null) ? "" : str3;
    }

    public final boolean H(String str, String str2) {
        d dVarD = D(str, str2);
        return dVarD != null && dVarD.f41105d;
    }

    public final void I(d[] dVarArr) {
        dVarArr.getClass();
        this.f41097a.clear();
        C(dVarArr);
    }

    public final String M() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f41097a.iterator();
        while (it.hasNext()) {
            d dVar = ((C0779c) it.next()).f41100c;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", dVar.f41102a);
                jSONObject.put("categoryTranslation", dVar.f41103b);
                jSONObject.put("counterpart", dVar.f41104c);
                jSONObject.put("isBodyWeight", dVar.f41105d);
                jSONObject.put("exercise", dVar.f41106e);
                jSONObject.put("exerciseTranslation", dVar.f41107f);
            } catch (JSONException e4) {
                i2.a.j(i2.f36769a, "ExerciseListItemDTO", "toJson: " + e4.getMessage());
            }
            String string = jSONObject.toString();
            string.getClass();
            jSONArray.put(string);
        }
        String string2 = jSONArray.toString();
        string2.getClass();
        return string2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayNames;
        JSONArray jSONArrayNames2;
        jSONObject.getClass();
        ArrayList arrayList = this.f41097a;
        arrayList.clear();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("categories");
        if (jSONObjectOptJSONObject == null || (jSONArrayNames = jSONObjectOptJSONObject.names()) == null) {
            return;
        }
        int length = jSONArrayNames.length();
        for (int i14 = 0; i14 < length; i14++) {
            String string = jSONArrayNames.getString(i14);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.getJSONObject(string).optJSONObject("exercises");
            if (jSONObjectOptJSONObject2 != null && (jSONArrayNames2 = jSONObjectOptJSONObject2.names()) != null) {
                int length2 = jSONArrayNames2.length();
                int i15 = 0;
                while (i15 < length2) {
                    String string2 = jSONArrayNames2.getString(i15);
                    JSONObject jSONObject2 = jSONObjectOptJSONObject2.getJSONObject(string2);
                    int i16 = length2;
                    d dVar = new d(string, null, jSONObject2.optString("counterpart"), jSONObject2.optBoolean("isBodyWeight", false), string2, null);
                    string2.getClass();
                    arrayList.add(new C0779c(string, string2, dVar));
                    i15++;
                    length2 = i16;
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeTypedArray((Parcelable[]) this.f41097a.toArray(new C0779c[0]), 0);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/repcounting/model/c$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CATEGORIES_KEY", "EXERCISES_KEY", "COUNTERPART_KEY", "IS_BODY_WEIGHT_KEY", "PRIMARY_MUSCLES_KEY", "SECONDARY_MUSCLES_KEY", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        public static c a(String str) {
            boolean z14;
            try {
                StringBuilder sb3 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
                while (true) {
                    String line = bufferedReader.readLine();
                    String str2 = line == null ? "" : line;
                    z14 = false;
                    if (line == null) {
                        break;
                    }
                    if (str2.length() > 0) {
                        int length = str2.length() - 1;
                        int i14 = 0;
                        boolean z15 = false;
                        while (i14 <= length) {
                            boolean z16 = s.h(str2.charAt(!z15 ? i14 : length), 32) <= 0;
                            if (z15) {
                                if (!z16) {
                                    break;
                                }
                                length--;
                            } else if (z16) {
                                i14++;
                            } else {
                                z15 = true;
                            }
                        }
                        sb3.append(str2.subSequence(i14, length + 1).toString());
                    }
                }
                ArrayList arrayList = new ArrayList();
                try {
                    JSONObject jSONObject = new JSONObject(sb3.toString()).getJSONObject("categories");
                    jSONObject.getClass();
                    JSONArray jSONArrayNames = jSONObject.names();
                    int length2 = jSONArrayNames.length();
                    int i15 = 0;
                    while (i15 < length2) {
                        String string = jSONArrayNames.getString(i15);
                        JSONObject jSONObject2 = jSONObject.getJSONObject(string);
                        JSONObject jSONObject3 = jSONObject.getJSONObject(string).getJSONObject("exercises");
                        jSONObject3.getClass();
                        JSONArray jSONArrayNames2 = jSONObject3.names();
                        if (!jSONObject3.has(string)) {
                            d dVar = new d();
                            dVar.f41102a = string;
                            dVar.f41103b = string;
                            dVar.f41106e = string;
                            dVar.f41107f = string;
                            dVar.f41104c = "";
                            dVar.f41105d = z14;
                            b bVar = c.f41095b;
                            Iterable iterableY = s1.y(jSONObject2, "primaryMuscles");
                            Collection collection = dVar.f41108g;
                            if (collection == null) {
                                collection = j0.f134944a;
                            }
                            if (iterableY == null) {
                                iterableY = j0.f134944a;
                            }
                            dVar.f41108g = h0.b1(h0.f1(h0.C0(collection, iterableY)));
                            Iterable iterableY2 = s1.y(jSONObject2, "secondaryMuscles");
                            Collection collection2 = dVar.f41109h;
                            if (collection2 == null) {
                                collection2 = j0.f134944a;
                            }
                            if (iterableY2 == null) {
                                iterableY2 = j0.f134944a;
                            }
                            dVar.f41109h = h0.b1(h0.f1(h0.C0(collection2, iterableY2)));
                            arrayList.add(dVar);
                        }
                        int length3 = jSONArrayNames2.length();
                        int i16 = 0;
                        while (i16 < length3) {
                            JSONObject jSONObject4 = jSONObject3.getJSONObject(jSONArrayNames2.getString(i16));
                            jSONObject4.getClass();
                            d dVar2 = new d();
                            dVar2.f41102a = string;
                            dVar2.f41103b = string;
                            JSONObject jSONObject5 = jSONObject;
                            dVar2.f41106e = jSONArrayNames2.getString(i16);
                            dVar2.f41107f = jSONArrayNames2.getString(i16);
                            dVar2.f41104c = jSONObject4.optString("counterpart");
                            JSONArray jSONArray = jSONArrayNames;
                            dVar2.f41105d = jSONObject4.optBoolean("isBodyWeight", false);
                            b bVar2 = c.f41095b;
                            Iterable iterableY3 = s1.y(jSONObject4, "primaryMuscles");
                            Collection collection3 = dVar2.f41108g;
                            if (collection3 == null) {
                                collection3 = j0.f134944a;
                            }
                            if (iterableY3 == null) {
                                iterableY3 = j0.f134944a;
                            }
                            dVar2.f41108g = h0.b1(h0.f1(h0.C0(collection3, iterableY3)));
                            Iterable iterableY4 = s1.y(jSONObject4, "secondaryMuscles");
                            Collection collection4 = dVar2.f41109h;
                            if (collection4 == null) {
                                collection4 = j0.f134944a;
                            }
                            if (iterableY4 == null) {
                                iterableY4 = j0.f134944a;
                            }
                            dVar2.f41109h = h0.b1(h0.f1(h0.C0(collection4, iterableY4)));
                            arrayList.add(dVar2);
                            i16++;
                            jSONObject = jSONObject5;
                            jSONArrayNames = jSONArray;
                        }
                        i15++;
                        z14 = false;
                    }
                    return new c((d[]) arrayList.toArray(new d[0]));
                } catch (JSONException e4) {
                    i2.a.j(i2.f36769a, "ExerciseListDTO", e4.getMessage());
                    return null;
                }
            } catch (IOException e14) {
                i2.a.j(i2.f36769a, "ExerciseListDTO", e14.getMessage());
                return null;
            }
        }

        private b() {
        }
    }

    public c() {
        this.f41097a = new ArrayList();
    }

    public c(d[] dVarArr) {
        dVarArr.getClass();
        this.f41097a = new ArrayList();
        I(dVarArr);
    }
}

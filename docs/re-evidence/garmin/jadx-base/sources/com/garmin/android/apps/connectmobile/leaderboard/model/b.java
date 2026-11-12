package com.garmin.android.apps.connectmobile.leaderboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/b;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends s1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f38079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f38080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0675b f38076f = new C0675b(null);
    public static final Parcelable.Creator<b> CREATOR = new a();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/model/b$a", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/b;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Parcel parcel) {
        parcel.getClass();
        this.f38077a = parcel.readString();
        this.f38078b = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.f38079c = arrayList;
        parcel.readStringList(arrayList);
        this.f38080d = Double.valueOf(parcel.readDouble());
    }

    public final t C() {
        t.a aVar = t.f38321d;
        int i14 = this.f38078b;
        aVar.getClass();
        for (t tVar : t.values()) {
            if (tVar.f38343a == i14) {
                return tVar;
            }
        }
        return t.f38322e;
    }

    public final JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adHocChallengeUuid", this.f38077a);
            jSONObject.put("alternateChallengeAwardTypeId", this.f38078b);
            if (this.f38079c != null) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = this.f38079c;
                arrayList.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put("userProfileIds", jSONArray);
            }
            jSONObject.put("result", this.f38080d);
            return jSONObject;
        } catch (JSONException e4) {
            sn.a.s("toJson: ", e4.getMessage(), i2.f36769a, a2.CHALLENGES, "AdHocChallengeAwardDTO");
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f38077a = s1.u(jSONObject, "adHocChallengeUuid");
            this.f38078b = jSONObject.optInt("alternateChallengeAwardTypeId");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("userProfileIds");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    String string = jSONArrayOptJSONArray.getString(i14);
                    string.getClass();
                    arrayList.add(string);
                }
            }
            this.f38079c = arrayList;
            this.f38080d = Double.valueOf(jSONObject.optDouble("result"));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f38077a);
        parcel.writeInt(this.f38078b);
        parcel.writeStringList(this.f38079c);
        Double d14 = this.f38080d;
        d14.getClass();
        parcel.writeDouble(d14.doubleValue());
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.leaderboard.model.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/model/b$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/b;", "CREATOR", "Landroid/os/Parcelable$Creator;", "AD_HOC_CHALLENGE_UUID_PK", "ALTERNATE_CHALLENGE_AWARD_TYPE_ID_PK", "USER_PROFILE_IDS_PK", "RESULT_PK", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0675b {
        public /* synthetic */ C0675b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0675b() {
        }
    }

    public b() {
    }
}

package hd1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import i3.e5;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lhd1/k0;", "Lhd1/q;", "Landroid/os/Parcelable;", "", FirebaseAnalytics.Param.SCORE, "level", "phrase", "validSleep", "<init>", "(IIII)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k0 extends q implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83389e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<k0> {
        @Override // android.os.Parcelable.Creator
        public final k0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final k0[] newArray(int i14) {
            return new k0[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ k0(int i14, int i15, int i16, int i17, int i18, p005kotlin.jvm.internal.j jVar) {
        this((i18 & 1) != 0 ? -1 : i14, (i18 & 2) != 0 ? -1 : i15, (i18 & 4) != 0 ? -1 : i16, (i18 & 8) != 0 ? -1 : i17);
    }

    public final void b(JSONObject jSONObject) {
        this.f83386b = jSONObject.optInt(FirebaseAnalytics.Param.SCORE, -1);
        this.f83387c = jSONObject.optInt("level", -1);
        this.f83388d = jSONObject.optInt("phrase", -1);
        this.f83389e = jSONObject.optInt("validSleep", -1);
        this.f83396a = jSONObject.optLong("lastUpdated", -1L);
    }

    @Override // pd2.b
    public final boolean d(String str) {
        try {
            b(new JSONObject(str));
            return true;
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "RealTimeTrainingReadinessDTO", e4);
            return false;
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
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f83386b == k0Var.f83386b && this.f83387c == k0Var.f83387c && this.f83388d == k0Var.f83388d && this.f83389e == k0Var.f83389e;
    }

    @Override // pd2.b
    public final String h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FirebaseAnalytics.Param.SCORE, this.f83386b);
            jSONObject.put("level", this.f83387c);
            jSONObject.put("phrase", this.f83388d);
            jSONObject.put("validSleep", this.f83388d);
            jSONObject.put("lastUpdated", this.f83396a);
        } catch (JSONException e4) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.g(a2Var, "RealTimeTrainingReadinessDTO", e4);
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83389e) + q2.d(this.f83388d, q2.d(this.f83387c, Integer.hashCode(this.f83386b) * 31, 31), 31);
    }

    public final String toString() {
        return androidx.core.view.j.e(this.f83388d, this.f83389e, ", validSleep=", ")", e5.j(this.f83386b, this.f83387c, "RealTimeTrainingReadinessDTO(score=", ", level=", ", phrase="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f83386b);
        parcel.writeInt(this.f83387c);
        parcel.writeInt(this.f83388d);
        parcel.writeInt(this.f83389e);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lhd1/k0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SCORE_KEY", "LEVEL_KEY", "PHRASE_KEY", "VALID_SLEEP_KEY", "LAST_UPDATED", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public k0(int i14, int i15, int i16, int i17) {
        this.f83386b = i14;
        this.f83387c = i15;
        this.f83388d = i16;
        this.f83389e = i17;
    }

    public k0() {
        this(0, 0, 0, 0, 15, null);
    }
}

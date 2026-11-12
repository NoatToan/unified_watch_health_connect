package vk1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\t"}, d2 = {"Lvk1/f;", "Lcom/garmin/android/apps/connectmobile/s1;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "b", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends s1 implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f178611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f178612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f178613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f178614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f178615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f178616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f178617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f178618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f178619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f178620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f178621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f178622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f178623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f178624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f178625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f178626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f178627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f178628r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f178629t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f178630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f178631w;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"vk1/f$a", "Landroid/os/Parcelable$Creator;", "Lvk1/f;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f178632a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.LACTATE_THRESHOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.HR_RESERVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.HR_MAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f178632a = iArr;
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public f(Parcel parcel) {
        parcel.getClass();
        this.f178611a = parcel.readString();
        this.f178612b = parcel.readString();
        this.f178613c = parcel.readInt();
        this.f178614d = parcel.readInt();
        this.f178615e = parcel.readInt();
        this.f178616f = parcel.readInt();
        this.f178617g = parcel.readInt();
        this.f178618h = parcel.readInt();
        this.f178619i = parcel.readInt();
        this.f178621k = parcel.readInt();
        this.f178623m = parcel.readInt();
        this.f178624n = parcel.readInt();
        this.f178625o = parcel.readInt();
        this.f178626p = parcel.readInt();
        this.f178627q = parcel.readInt();
        this.f178628r = parcel.readInt();
        this.f178620j = parcel.readString();
        this.f178622l = parcel.readInt() == 1;
        this.f178629t = parcel.readInt() == 1;
        this.f178631w = parcel.readInt() == 1;
        this.f178630v = parcel.readInt();
    }

    public final f C(String str) {
        f fVar = new f();
        fVar.f178622l = false;
        fVar.f178611a = this.f178611a;
        fVar.f178612b = str;
        fVar.f178613c = this.f178613c;
        fVar.f178614d = this.f178614d;
        fVar.f178615e = this.f178615e;
        fVar.f178616f = this.f178616f;
        fVar.f178617g = this.f178617g;
        fVar.f178618h = this.f178618h;
        fVar.f178619i = this.f178619i;
        fVar.f178621k = this.f178621k;
        fVar.f178620j = this.f178620j;
        fVar.f178623m = this.f178623m;
        fVar.f178624n = this.f178624n;
        fVar.f178625o = this.f178625o;
        fVar.f178626p = this.f178626p;
        fVar.f178627q = this.f178627q;
        fVar.f178628r = this.f178628r;
        fVar.f178629t = this.f178629t;
        fVar.f178631w = this.f178631w;
        fVar.f178630v = this.f178630v;
        return fVar;
    }

    public final f D() {
        f fVar = new f();
        fVar.f178622l = this.f178622l;
        fVar.f178611a = this.f178611a;
        fVar.f178612b = this.f178612b;
        fVar.f178613c = this.f178613c;
        fVar.f178614d = this.f178614d;
        fVar.f178615e = this.f178615e;
        fVar.f178616f = this.f178616f;
        fVar.f178617g = this.f178617g;
        fVar.f178618h = this.f178618h;
        fVar.f178619i = this.f178619i;
        fVar.f178621k = this.f178621k;
        fVar.f178620j = this.f178620j;
        fVar.f178629t = this.f178629t;
        fVar.f178631w = this.f178631w;
        fVar.f178630v = this.f178630v;
        return fVar;
    }

    public final JSONObject F() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trainingMethod", this.f178611a);
        jSONObject.put("sport", this.f178612b);
        j jVarG = vk1.c.g(this);
        int i14 = jVarG == null ? -1 : c.f178632a[jVarG.ordinal()];
        if (i14 == 1) {
            jSONObject.put("lactateThresholdHeartRateUsed", this.f178614d);
        } else if (i14 == 2) {
            jSONObject.put("restingHeartRateUsed", this.f178613c);
        }
        jSONObject.put("zone1Floor", this.f178615e);
        jSONObject.put("zone2Floor", this.f178616f);
        jSONObject.put("zone3Floor", this.f178617g);
        jSONObject.put("zone4Floor", this.f178618h);
        jSONObject.put("zone5Floor", this.f178619i);
        jSONObject.put("changeState", this.f178620j);
        jSONObject.put("maxHeartRateUsed", this.f178621k);
        jSONObject.put("restingHrAutoUpdateUsed", this.f178629t);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class.equals(obj.getClass())) {
            f fVar = (f) obj;
            if (this.f178613c != fVar.f178613c || this.f178614d != fVar.f178614d || this.f178615e != fVar.f178615e || this.f178616f != fVar.f178616f || this.f178617g != fVar.f178617g || this.f178618h != fVar.f178618h || this.f178619i != fVar.f178619i || this.f178621k != fVar.f178621k || this.f178622l != fVar.f178622l || this.f178629t != fVar.f178629t || this.f178630v != fVar.f178630v || this.f178631w != fVar.f178631w) {
                return false;
            }
            String str = this.f178611a;
            String str2 = fVar.f178611a;
            if (str == null ? str2 != null : !s.g(str, str2)) {
                return false;
            }
            String str3 = this.f178612b;
            String str4 = fVar.f178612b;
            if (str3 == null ? str4 != null : !s.g(str3, str4)) {
                return false;
            }
            String str5 = this.f178620j;
            String str6 = fVar.f178620j;
            if (str5 != null) {
                return s.g(str5, str6);
            }
            if (str6 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f178611a;
        int iHashCode = 0;
        int iHashCode2 = ((str == null || str == null) ? 0 : str.hashCode()) * 31;
        String str2 = this.f178612b;
        int iHashCode3 = (((((((((((((((iHashCode2 + ((str2 == null || str2 == null) ? 0 : str2.hashCode())) * 31) + this.f178613c) * 31) + this.f178614d) * 31) + this.f178615e) * 31) + this.f178616f) * 31) + this.f178617g) * 31) + this.f178618h) * 31) + this.f178619i) * 31;
        String str3 = this.f178620j;
        if (str3 != null && str3 != null) {
            iHashCode = str3.hashCode();
        }
        return ((((((((((iHashCode3 + iHashCode) * 31) + this.f178621k) * 31) + (this.f178622l ? 1 : 0)) * 31) + (this.f178629t ? 1 : 0)) * 31) + (this.f178631w ? 1 : 0)) * 31) + this.f178630v;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f178611a = jSONObject.optString("trainingMethod");
            this.f178612b = jSONObject.getString("sport");
            this.f178613c = jSONObject.optInt("restingHeartRateUsed", 0);
            this.f178614d = jSONObject.optInt("lactateThresholdHeartRateUsed", 0);
            this.f178615e = jSONObject.optInt("zone1Floor", 0);
            this.f178616f = jSONObject.optInt("zone2Floor", 0);
            this.f178617g = jSONObject.optInt("zone3Floor", 0);
            this.f178618h = jSONObject.optInt("zone4Floor", 0);
            this.f178619i = jSONObject.optInt("zone5Floor", 0);
            this.f178620j = jSONObject.optString("changeState");
            this.f178621k = jSONObject.optInt("maxHeartRateUsed", 0);
            this.f178629t = jSONObject.optBoolean("restingHrAutoUpdateUsed");
            this.f178622l = true;
            vk1.a.e(this);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f178611a);
        parcel.writeString(this.f178612b);
        parcel.writeInt(this.f178613c);
        parcel.writeInt(this.f178614d);
        parcel.writeInt(this.f178615e);
        parcel.writeInt(this.f178616f);
        parcel.writeInt(this.f178617g);
        parcel.writeInt(this.f178618h);
        parcel.writeInt(this.f178619i);
        parcel.writeInt(this.f178621k);
        parcel.writeInt(this.f178623m);
        parcel.writeInt(this.f178624n);
        parcel.writeInt(this.f178625o);
        parcel.writeInt(this.f178626p);
        parcel.writeInt(this.f178627q);
        parcel.writeInt(this.f178628r);
        parcel.writeString(this.f178620j);
        parcel.writeInt(this.f178622l ? 1 : 0);
        parcel.writeInt(this.f178629t ? 1 : 0);
        parcel.writeInt(this.f178631w ? 1 : 0);
        parcel.writeInt(this.f178630v);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"Lvk1/f$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lvk1/f;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "JSON_KEY_TRAINING_METHOD", "Ljava/lang/String;", "JSON_KEY_SPORT", "JSON_KEY_RESTING_HR_USED", "JSON_KEY_LACTATE_THRESHOLD_HR_USED", "JSON_KEY_ZONE_1_FLOOR", "JSON_KEY_ZONE_2_FLOOR", "JSON_KEY_ZONE_3_FLOOR", "JSON_KEY_ZONE_4_FLOOR", "JSON_KEY_ZONE_5_FLOOR", "JSON_KEY_MAX_HR_USED", "JSON_KEY_CHANGE_STATE", "JSON_KEY_RESTING_HR_AUTO_UPDATE_USED", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public f() {
    }
}

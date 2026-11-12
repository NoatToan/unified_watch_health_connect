package com.garmin.android.apps.connectmobile.golf.truswing.model;

import android.os.Parcel;
import android.os.Parcelable;
import bs2.qs;
import bs2.ve;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class k extends s1 implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ve f35954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qs f35955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f35956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f35962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f35963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f35964m;

    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(Parcel parcel) {
        this.f35952a = parcel.readLong();
        this.f35953b = parcel.readString();
        this.f35954c = ve.a(Short.valueOf((short) parcel.readInt()));
        this.f35955d = qs.a(Short.valueOf((short) parcel.readInt()));
        this.f35956e = parcel.readFloat();
        this.f35957f = parcel.readInt();
        this.f35958g = parcel.readInt();
        this.f35959h = parcel.readByte() != 0;
        this.f35960i = parcel.readByte() != 0;
        this.f35961j = parcel.readString();
        this.f35962k = parcel.readLong();
        this.f35963l = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f35964m = (n) parcel.readParcelable(n.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        this.f35952a = jSONObject.optLong(TtmlNode.ATTR_ID, 0L);
        this.f35953b = jSONObject.optString("name", "");
        this.f35954c = ve.a(Short.valueOf((short) jSONObject.optInt("clubTypeId", 0)));
        this.f35955d = qs.a(Short.valueOf((short) jSONObject.optInt("flexTypeId", 0)));
        this.f35956e = (float) jSONObject.optDouble("shaftLength", 0.0d);
        this.f35957f = jSONObject.optInt("averageDistance", 0);
        this.f35958g = jSONObject.optInt("adviceDistance", 0);
        this.f35959h = jSONObject.optBoolean("retired", true);
        this.f35960i = jSONObject.optBoolean("deleted", false);
        this.f35961j = jSONObject.optString("lastModifiedTime");
        this.f35962k = jSONObject.optLong("swingCount", 0L);
        l lVar = new l();
        lVar.k(jSONObject.optJSONObject("clubStats"));
        this.f35963l = lVar;
        n nVar = new n();
        nVar.k(jSONObject.optJSONObject("virtualStats"));
        this.f35964m = nVar;
    }

    public final String toString() {
        return "clubId:" + this.f35952a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f35952a);
        parcel.writeString(this.f35953b);
        parcel.writeInt(this.f35954c.f20622a);
        parcel.writeInt(this.f35955d.f20440a);
        parcel.writeFloat(this.f35956e);
        parcel.writeInt(this.f35957f);
        parcel.writeInt(this.f35958g);
        parcel.writeByte(this.f35959h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35960i ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f35961j);
        parcel.writeLong(this.f35962k);
        parcel.writeParcelable(this.f35963l, i14);
        parcel.writeParcelable(this.f35964m, i14);
    }

    public k() {
    }
}

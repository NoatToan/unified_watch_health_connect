package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a0 extends s1 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f48074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f48075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f48076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f48077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f48078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f48079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f48080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f48081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f48082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ps.a f48083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f48084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f48085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f48086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f48087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Long f48088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f48089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f48090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f48091r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f48092t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f48093v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f48094w;

    public class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    }

    public enum b {
        /* JADX INFO: Fake field, exist only in values array */
        CUSTOM(1, "Custom"),
        /* JADX INFO: Fake field, exist only in values array */
        BEGINNER(2, "Beginner"),
        /* JADX INFO: Fake field, exist only in values array */
        INTERMEDIATE(3, "Intermediate"),
        /* JADX INFO: Fake field, exist only in values array */
        ADVANCED(4, "Advanced");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48096a;

        b(long j8, String str) {
            this.f48096a = j8;
        }
    }

    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        SCHEDULED(1, "Scheduled"),
        /* JADX INFO: Fake field, exist only in values array */
        COMPLETED(2, "Completed"),
        /* JADX INFO: Fake field, exist only in values array */
        DRAFT(3, "Draft"),
        /* JADX INFO: Fake field, exist only in values array */
        PUBLISHED(4, "Published"),
        /* JADX INFO: Fake field, exist only in values array */
        EXPIRED(5, "Expired");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48098a;

        c(long j8, String str) {
            this.f48098a = j8;
        }
    }

    public enum d {
        /* JADX INFO: Fake field, exist only in values array */
        _5K(20, "5k"),
        /* JADX INFO: Fake field, exist only in values array */
        _10K(21, "10k"),
        /* JADX INFO: Fake field, exist only in values array */
        HALF_MARATHON(22, "HalfMarathon"),
        /* JADX INFO: Fake field, exist only in values array */
        MARATHON(23, "Marathon"),
        /* JADX INFO: Fake field, exist only in values array */
        ULTRA_MARATHON(24, "UltraMarathon"),
        /* JADX INFO: Fake field, exist only in values array */
        OTHER(25, "Other"),
        /* JADX INFO: Fake field, exist only in values array */
        CENTURY(30, "Century"),
        /* JADX INFO: Fake field, exist only in values array */
        ROAD_CYCLING(31, "RoadCycling"),
        /* JADX INFO: Fake field, exist only in values array */
        MOUNTAIN_BIKING(32, "MountainBiking"),
        /* JADX INFO: Fake field, exist only in values array */
        TIME_TRIAL(33, "TimeTrial"),
        /* JADX INFO: Fake field, exist only in values array */
        SPRINT(40, "Sprint"),
        /* JADX INFO: Fake field, exist only in values array */
        OLYMPIC(41, "Olympic"),
        /* JADX INFO: Fake field, exist only in values array */
        HALF_IRON_MAN(42, "HalfIronMan"),
        /* JADX INFO: Fake field, exist only in values array */
        IRON_MAN(43, "IronMan");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48100a;

        d(long j8, String str) {
            this.f48100a = j8;
        }
    }

    public enum e {
        /* JADX INFO: Fake field, exist only in values array */
        GENERIC(1, "Generic"),
        /* JADX INFO: Fake field, exist only in values array */
        RUNNING(2, "Running"),
        /* JADX INFO: Fake field, exist only in values array */
        CYCLING(3, "Cycling"),
        /* JADX INFO: Fake field, exist only in values array */
        TRIATHLON(4, "Triathlon");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48102a;

        e(long j8, String str) {
            this.f48102a = j8;
        }
    }

    public enum f {
        /* JADX INFO: Fake field, exist only in values array */
        GENERIC(1, "Generic"),
        /* JADX INFO: Fake field, exist only in values array */
        SPEED(2, "Speed"),
        /* JADX INFO: Fake field, exist only in values array */
        PACE(3, "Pace"),
        /* JADX INFO: Fake field, exist only in values array */
        HEART_RATE(4, "HeartRate"),
        /* JADX INFO: Fake field, exist only in values array */
        TIME(5, "Time"),
        /* JADX INFO: Fake field, exist only in values array */
        DISTANCE(6, "Distance"),
        /* JADX INFO: Fake field, exist only in values array */
        POWER(7, "Power");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48104a;

        f(long j8, String str) {
            this.f48104a = j8;
        }
    }

    public a0(Parcel parcel) {
        c cVar;
        e eVar;
        d dVar;
        b bVar;
        f fVar;
        this.f48074a = Long.valueOf(parcel.readLong());
        long j8 = parcel.readLong();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        int i14 = 0;
        while (true) {
            cVar = null;
            if (i14 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i14];
            if (j8 == eVar.f48102a) {
                break;
            } else {
                i14++;
            }
        }
        this.f48075b = eVar;
        long j14 = parcel.readLong();
        d[] dVarArrValues = d.values();
        int length2 = dVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length2) {
                dVar = null;
                break;
            }
            dVar = dVarArrValues[i15];
            if (j14 == dVar.f48100a) {
                break;
            } else {
                i15++;
            }
        }
        this.f48076c = dVar;
        long j15 = parcel.readLong();
        b[] bVarArrValues = b.values();
        int length3 = bVarArrValues.length;
        int i16 = 0;
        while (true) {
            if (i16 >= length3) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i16];
            if (j15 == bVar.f48096a) {
                break;
            } else {
                i16++;
            }
        }
        this.f48077d = bVar;
        long j16 = parcel.readLong();
        f[] fVarArrValues = f.values();
        int length4 = fVarArrValues.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length4) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i17];
            if (j16 == fVar.f48104a) {
                break;
            } else {
                i17++;
            }
        }
        this.f48078e = fVar;
        this.f48079f = (h) parcel.readParcelable(h.class.getClassLoader());
        this.f48080g = Long.valueOf(parcel.readLong());
        this.f48081h = parcel.readString();
        long j17 = parcel.readLong();
        for (c cVar2 : c.values()) {
            if (j17 == cVar2.f48098a) {
                cVar = cVar2;
                break;
            }
        }
        this.f48082i = cVar;
        this.f48083j = (ps.a) parcel.readParcelable(getClass().getClassLoader());
        this.f48084k = parcel.readString();
        this.f48085l = parcel.readString();
        this.f48086m = Integer.valueOf(parcel.readInt());
        this.f48087n = Integer.valueOf(parcel.readInt());
        this.f48088o = Long.valueOf(parcel.readLong());
        this.f48089p = parcel.readString();
        this.f48090q = parcel.readString();
        this.f48091r = parcel.readString();
        this.f48092t = parcel.readString();
        this.f48093v = parcel.readString();
        this.f48094w = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        f fVar;
        b bVar;
        d dVar;
        e eVar;
        this.f48074a = Long.valueOf(jSONObject.optLong("trainingPlanId"));
        c cVar = null;
        if (!jSONObject.isNull("trainingType")) {
            long jOptLong = jSONObject.optJSONObject("trainingType").optLong("typeId", -1L);
            e[] eVarArrValues = e.values();
            int length = eVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    eVar = null;
                    break;
                }
                eVar = eVarArrValues[i14];
                if (jOptLong == eVar.f48102a) {
                    break;
                } else {
                    i14++;
                }
            }
            this.f48075b = eVar;
        }
        if (!jSONObject.isNull("trainingSubType")) {
            long jOptLong2 = jSONObject.optJSONObject("trainingSubType").optLong("subTypeId", -1L);
            d[] dVarArrValues = d.values();
            int length2 = dVarArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrValues[i15];
                if (jOptLong2 == dVar.f48100a) {
                    break;
                } else {
                    i15++;
                }
            }
            this.f48076c = dVar;
        }
        if (!jSONObject.isNull("trainingLevel")) {
            long jOptLong3 = jSONObject.optJSONObject("trainingLevel").optLong("levelId", -1L);
            b[] bVarArrValues = b.values();
            int length3 = bVarArrValues.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length3) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i16];
                if (jOptLong3 == bVar.f48096a) {
                    break;
                } else {
                    i16++;
                }
            }
            this.f48077d = bVar;
        }
        if (!jSONObject.isNull("trainingVersion")) {
            long jOptLong4 = jSONObject.optJSONObject("trainingVersion").optLong("versionId", -1L);
            f[] fVarArrValues = f.values();
            int length4 = fVarArrValues.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length4) {
                    fVar = null;
                    break;
                }
                fVar = fVarArrValues[i17];
                if (jOptLong4 == fVar.f48104a) {
                    break;
                } else {
                    i17++;
                }
            }
            this.f48078e = fVar;
        }
        if (!jSONObject.isNull("formatLocale")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("formatLocale");
            h hVar = new h();
            this.f48079f = hVar;
            hVar.k(jSONObjectOptJSONObject);
        }
        this.f48080g = Long.valueOf(jSONObject.optLong("ownerId"));
        this.f48081h = jSONObject.optString("ownerDisplayName");
        if (!jSONObject.isNull("trainingStatus")) {
            long jOptLong5 = jSONObject.optJSONObject("trainingStatus").optLong("statusId", -1L);
            for (c cVar2 : c.values()) {
                if (jOptLong5 == cVar2.f48098a) {
                    cVar = cVar2;
                    break;
                }
            }
            this.f48082i = cVar;
        }
        if (!jSONObject.isNull("privacyRule")) {
            this.f48083j = (ps.a) GsonUtil.f47253b.fromJson(String.valueOf(jSONObject.optJSONObject("privacyRule")), ps.a.class);
        }
        this.f48084k = jSONObject.optString("name");
        this.f48085l = jSONObject.optString("description");
        this.f48086m = Integer.valueOf(jSONObject.optInt("durationInWeeks"));
        this.f48087n = Integer.valueOf(jSONObject.optInt("avgWeeklyWorkouts"));
        this.f48088o = Long.valueOf(jSONObject.optLong("parentPlanId"));
        this.f48089p = jSONObject.optString("createDate");
        this.f48090q = jSONObject.optString("publishDate");
        this.f48091r = jSONObject.optString("expireDate");
        this.f48092t = jSONObject.optString("startDate");
        this.f48093v = jSONObject.optString("endDate");
        this.f48094w = jSONObject.optString("trainingPlanCategory");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f48074a.longValue());
        e eVar = this.f48075b;
        parcel.writeLong(eVar == null ? -1L : eVar.f48102a);
        d dVar = this.f48076c;
        parcel.writeLong(dVar == null ? -1L : dVar.f48100a);
        b bVar = this.f48077d;
        parcel.writeLong(bVar == null ? -1L : bVar.f48096a);
        f fVar = this.f48078e;
        parcel.writeLong(fVar == null ? -1L : fVar.f48104a);
        parcel.writeParcelable(this.f48079f, 0);
        parcel.writeLong(this.f48080g.longValue());
        parcel.writeString(this.f48081h);
        c cVar = this.f48082i;
        parcel.writeLong(cVar != null ? cVar.f48098a : -1L);
        parcel.writeParcelable(this.f48083j, 0);
        parcel.writeString(this.f48084k);
        parcel.writeString(this.f48085l);
        parcel.writeInt(this.f48086m.intValue());
        parcel.writeInt(this.f48087n.intValue());
        parcel.writeLong(this.f48088o.longValue());
        parcel.writeString(this.f48089p);
        parcel.writeString(this.f48090q);
        parcel.writeString(this.f48091r);
        parcel.writeString(this.f48092t);
        parcel.writeString(this.f48093v);
        parcel.writeString(this.f48094w);
    }

    public a0() {
    }
}

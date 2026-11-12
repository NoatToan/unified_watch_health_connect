package com.garmin.android.apps.connectmobile.activities.model;

import am.x0;
import am.z0;
import android.os.Parcel;
import android.os.Parcelable;
import bb2.d;
import c22.j0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.repcounting.model.g;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.userprofile.model.ProfileInfoJsonAdapter;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.IllegalInstantException;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ps.h;
import ps.j;
import ps.m;
import ps.o1;
import ps.p0;
import ps.u0;
import ps.z1;
import to.o;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(ActivityListItemDeserializer.class)
public class ActivityListItemDTO extends s1 implements Parcelable, Comparable {
    public static final Parcelable.Creator<ActivityListItemDTO> CREATOR = new a();
    public int A;
    public double A1;
    public String B;
    public int B1;
    public String C;
    public long C1;
    public String D;
    public u0 D1;
    public String E;
    public ArrayList E1;
    public String F;
    public double F1;
    public double G1;
    public int H0;
    public double H1;
    public String I;
    public int I0;
    public String I1;
    public int J0;
    public double J1;
    public int K0;
    public long K1;
    public int L0;
    public String L1;
    public int M0;
    public ArrayList M1;
    public int N0;
    public ArrayList N1;
    public int O0;
    public long O1;
    public String P;
    public String P0;
    public Integer P1;
    public List<j> Q0;
    public double Q1;
    public ConversationCommentDTO R0;
    public double R1;
    public int S0;
    public double S1;
    public double T;
    public int T0;
    public double T1;
    public int U0;
    public double U1;
    public boolean V0;
    public Double V1;
    public ArrayList W0;
    public int W1;
    public double X;
    public ArrayList X0;
    public int X1;
    public double Y;
    public ArrayList Y0;
    public Map<Integer, l> Y1;
    public double Z;
    public ArrayList Z0;
    public String Z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29247a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public ps.a f29248a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public String f29249a2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29250b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public double f29251b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public double f29252b2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29253c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public z1 f29254c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public int f29255c2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29256d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f29257d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public double f29258d2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29259e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f29260e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public String f29261e2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29262f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public String f29263f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public boolean f29264f2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x0 f29265g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public long f29266g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public String f29267g2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p0 f29268h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public double f29269h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public String f29270h2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f29271i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public double f29272i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f29273j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f29274j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f29275k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public double f29276k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public d f29277k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f29278l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public double f29279l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f29280m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public double f29281m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f29282n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public double f29283n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f29284o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f29285o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f29286p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f29287p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double f29288q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public double f29289q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f29290r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f29291r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public long f29292s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public double f29293t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public double f29294t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public long f29295u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f29296v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public double f29297v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f29298w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f29299w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f29300x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f29301x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f29302y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public double f29303y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f29304z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public double f29305z1;

    public static class ActivityListItemDeserializer implements JsonDeserializer<ActivityListItemDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final ActivityListItemDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                ActivityListItemDTO activityListItemDTO = new ActivityListItemDTO();
                activityListItemDTO.k(new JSONObject(jsonElement.toString()));
                return activityListItemDTO;
            } catch (Exception e4) {
                i2.g(e4, "ActivityListItemDTO");
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<ActivityListItemDTO> {
        @Override // android.os.Parcelable.Creator
        public final ActivityListItemDTO createFromParcel(Parcel parcel) {
            return new ActivityListItemDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityListItemDTO[] newArray(int i14) {
            return new ActivityListItemDTO[i14];
        }
    }

    public ActivityListItemDTO(Parcel parcel) {
        this.f29265g = x0.f4346x;
        this.T = Double.NaN;
        this.X = Double.NaN;
        this.Z = Double.NaN;
        this.f29276k0 = Double.NaN;
        this.O0 = -1;
        this.Q1 = Double.NaN;
        this.R1 = Double.NaN;
        this.S1 = Double.NaN;
        this.T1 = Double.NaN;
        this.U1 = Double.NaN;
        this.W1 = -1;
        this.X1 = -1;
        this.Y1 = new HashMap();
        this.f29247a = parcel.readString();
        this.f29250b = parcel.readLong();
        this.f29253c = parcel.readString();
        this.f29256d = parcel.readString();
        this.f29259e = parcel.readString();
        this.f29262f = parcel.readString();
        this.f29265g = z0.m(parcel.readString());
        this.f29268h = (p0) parcel.readParcelable(p0.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.f29271i = arrayList;
        parcel.readList(arrayList, to.d.class.getClassLoader());
        this.f29273j = parcel.readDouble();
        this.f29275k = parcel.readDouble();
        this.f29278l = parcel.readDouble();
        this.f29280m = parcel.readDouble();
        this.f29282n = parcel.readDouble();
        this.f29284o = parcel.readDouble();
        this.f29286p = parcel.readDouble();
        this.f29288q = parcel.readDouble();
        this.f29290r = parcel.readDouble();
        this.f29293t = parcel.readDouble();
        this.f29296v = parcel.readDouble();
        this.f29298w = parcel.readInt() == 1;
        this.f29300x = (m) parcel.readParcelable(m.class.getClassLoader());
        this.f29302y = parcel.readInt() == 1;
        this.f29304z = (h) parcel.readParcelable(h.class.getClassLoader());
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.I = parcel.readString();
        this.P = parcel.readString();
        this.T = parcel.readDouble();
        this.X = parcel.readDouble();
        this.Y = parcel.readDouble();
        this.Z = parcel.readDouble();
        this.f29276k0 = parcel.readDouble();
        this.H0 = parcel.readInt();
        this.I0 = parcel.readInt();
        this.J0 = parcel.readInt();
        this.K0 = parcel.readInt();
        this.L0 = parcel.readInt();
        this.M0 = parcel.readInt();
        this.N0 = parcel.readInt();
        this.O0 = parcel.readInt();
        this.P0 = parcel.readString();
        List arrayList2 = new ArrayList();
        this.Q0 = arrayList2;
        parcel.readList(arrayList2, j.class.getClassLoader());
        this.R0 = (ConversationCommentDTO) parcel.readParcelable(ConversationCommentDTO.class.getClassLoader());
        this.S0 = parcel.readInt();
        this.T0 = parcel.readInt();
        this.U0 = parcel.readInt();
        this.V0 = parcel.readInt() == 1;
        ArrayList arrayList3 = new ArrayList();
        this.W0 = arrayList3;
        parcel.readStringList(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        this.X0 = arrayList4;
        parcel.readStringList(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        this.Y0 = arrayList5;
        parcel.readStringList(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        this.Z0 = arrayList6;
        parcel.readStringList(arrayList6);
        this.f29248a1 = (ps.a) parcel.readParcelable(wi1.a.class.getClassLoader());
        this.f29251b1 = parcel.readDouble();
        this.f29254c1 = (z1) parcel.readParcelable(z1.class.getClassLoader());
        this.f29257d1 = parcel.readInt() == 1;
        this.f29260e1 = parcel.readInt() == 1;
        this.f29263f1 = parcel.readString();
        this.f29266g1 = parcel.readLong();
        this.f29269h1 = parcel.readDouble();
        this.f29277k1 = (d) parcel.readParcelable(d.class.getClassLoader());
        this.f29274j1 = parcel.readInt() == 1;
        this.f29272i1 = parcel.readDouble();
        this.f29279l1 = parcel.readDouble();
        this.f29281m1 = parcel.readDouble();
        this.f29283n1 = parcel.readDouble();
        this.f29285o1 = parcel.readInt();
        this.f29287p1 = parcel.readInt();
        this.f29289q1 = parcel.readDouble();
        this.f29291r1 = parcel.readInt() == 1;
        this.f29292s1 = parcel.readLong();
        this.f29294t1 = parcel.readDouble();
        this.f29297v1 = parcel.readDouble();
        this.f29299w1 = parcel.readInt();
        this.f29301x1 = parcel.readInt();
        this.f29303y1 = parcel.readDouble();
        this.C1 = parcel.readLong();
        this.D1 = (u0) parcel.readParcelable(u0.class.getClassLoader());
        ArrayList arrayList7 = new ArrayList();
        this.E1 = arrayList7;
        parcel.readList(arrayList7, o1.class.getClassLoader());
        this.F1 = parcel.readDouble();
        this.G1 = parcel.readDouble();
        this.H1 = parcel.readDouble();
        this.J1 = parcel.readDouble();
        this.I1 = parcel.readString();
        this.W1 = parcel.readInt();
        this.X1 = parcel.readInt();
        this.f29305z1 = parcel.readDouble();
        ArrayList arrayList8 = new ArrayList();
        this.M1 = arrayList8;
        parcel.readList(arrayList8, g.class.getClassLoader());
        this.A1 = parcel.readDouble();
        this.B1 = parcel.readInt();
        this.Z1 = parcel.readString();
        this.P1 = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.Q1 = parcel.readDouble();
        this.R1 = parcel.readDouble();
        this.S1 = parcel.readDouble();
        this.T1 = parcel.readDouble();
        this.f29249a2 = parcel.readString();
        this.f29252b2 = parcel.readDouble();
        this.f29255c2 = parcel.readInt();
        this.f29258d2 = parcel.readDouble();
        this.U1 = parcel.readDouble();
        this.V1 = (Double) parcel.readValue(Double.class.getClassLoader());
        ArrayList arrayList9 = new ArrayList();
        this.N1 = arrayList9;
        parcel.readList(arrayList9, Integer.class.getClassLoader());
        parcel.readMap(this.Y1, l.class.getClassLoader());
        this.f29261e2 = parcel.readString();
        this.f29264f2 = parcel.readInt() == 1;
        this.f29267g2 = parcel.readString();
        this.f29270h2 = parcel.readString();
    }

    public final LocalDate C() {
        DateTime dateTimeN = j0.N(this.f29262f, true);
        if (dateTimeN != null) {
            return dateTimeN.toLocalDate();
        }
        return null;
    }

    public final am.l D() {
        Object next;
        ps.a aVar = this.f29248a1;
        if (aVar == null) {
            return am.l.f4051g;
        }
        int iD = aVar.getTypeId();
        am.l.f4047c.getClass();
        Iterator<T> it = am.l.f4053i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((am.l) next).f4055b != iD);
        am.l lVar = (am.l) next;
        return lVar == null ? am.l.f4051g : lVar;
    }

    public final void F(m mVar) {
        this.f29300x = mVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        DateTime dateTime;
        String str = "";
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        DateTime dateTime2 = null;
        try {
            str = this.f29262f;
            dateTime = DateTime.parse(str, dateTimeFormatterForPattern);
            try {
                str = ((ActivityListItemDTO) obj).f29262f;
                dateTime2 = DateTime.parse(str, dateTimeFormatterForPattern);
            } catch (IllegalInstantException e4) {
                e = e4;
                a2 a2Var = a2.ACTIVITIES;
                StringBuilder sbL = hb.a.l("Illegal instant [", str, "] ");
                sbL.append(e.getLocalizedMessage());
                i2.f(a2Var, "ActivityListItemDTO", sbL.toString());
            } catch (IllegalArgumentException e14) {
                e = e14;
                a2 a2Var2 = a2.ACTIVITIES;
                StringBuilder sbL2 = hb.a.l("Illegal Input [", str, "] ");
                sbL2.append(e.getLocalizedMessage());
                i2.f(a2Var2, "ActivityListItemDTO", sbL2.toString());
            }
        } catch (IllegalInstantException e15) {
            e = e15;
            dateTime = null;
        } catch (IllegalArgumentException e16) {
            e = e16;
            dateTime = null;
        }
        if (dateTime == null && dateTime2 == null) {
            return 0;
        }
        if (dateTime == null) {
            return 1;
        }
        if (dateTime2 == null) {
            return -1;
        }
        return dateTime.compareTo((ReadableInstant) dateTime2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        this.f29247a = jSONObject.toString();
        if (!jSONObject.isNull("activityId")) {
            this.f29250b = jSONObject.getLong("activityId");
        }
        if (!jSONObject.isNull("activityName")) {
            this.f29253c = jSONObject.getString("activityName");
        }
        if (!jSONObject.isNull("description")) {
            this.f29256d = jSONObject.getString("description");
        }
        if (!jSONObject.isNull("startTimeLocal")) {
            this.f29259e = jSONObject.getString("startTimeLocal");
        }
        if (!jSONObject.isNull("startTimeGMT")) {
            this.f29262f = jSONObject.getString("startTimeGMT");
        }
        if (!jSONObject.isNull("activityType")) {
            this.f29265g = z0.l(x0.f4346x, new o(jSONObject.getJSONObject("activityType")).j());
        }
        if (!jSONObject.isNull("eventType")) {
            this.f29268h = new p0(jSONObject.getJSONObject("eventType"));
        }
        if (!jSONObject.isNull("comments")) {
            this.f29271i = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("comments");
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                ArrayList arrayList = this.f29271i;
                to.d dVar = new to.d();
                JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                if (jSONObject2.has("activityCommentPk") && !jSONObject2.isNull("activityCommentPk")) {
                    dVar.f165762a = jSONObject2.getInt("activityCommentPk");
                }
                if (jSONObject2.has("authorSocProfilePk") && !jSONObject2.isNull("authorSocProfilePk")) {
                    dVar.f165763b = jSONObject2.getInt("authorSocProfilePk");
                }
                if (jSONObject2.has("authorDisplayName") && !jSONObject2.isNull("authorDisplayName")) {
                    dVar.f165764c = jSONObject2.getString("authorDisplayName");
                }
                if (jSONObject2.has("authorUserProfilePk") && !jSONObject2.isNull("authorUserProfilePk")) {
                    dVar.f165765d = jSONObject2.getInt("authorUserProfilePk");
                }
                if (jSONObject2.has("authorImageUrl") && !jSONObject2.isNull("authorImageUrl")) {
                    dVar.f165766e = jSONObject2.getString("authorImageUrl");
                }
                if (jSONObject2.has(TtmlNode.TAG_BODY) && !jSONObject2.isNull(TtmlNode.TAG_BODY)) {
                    dVar.f165767f = jSONObject2.getString(TtmlNode.TAG_BODY);
                }
                if (jSONObject2.has("activityId") && !jSONObject2.isNull("activityId")) {
                    dVar.f165768g = jSONObject2.getLong("activityId");
                }
                if (jSONObject2.has("activityCommentLikeCount") && !jSONObject2.isNull("activityCommentLikeCount")) {
                    dVar.f165769h = jSONObject2.getInt("activityCommentLikeCount");
                }
                if (jSONObject2.has("requestorCanEdit") && !jSONObject2.isNull("requestorCanEdit")) {
                    dVar.f165770i = jSONObject2.getBoolean("requestorCanEdit");
                }
                if (jSONObject2.has("requestorCanDelete") && !jSONObject2.isNull("requestorCanDelete")) {
                    dVar.f165771j = jSONObject2.getBoolean("requestorCanDelete");
                }
                if (jSONObject2.has("createDate") && !jSONObject2.isNull("createDate")) {
                    dVar.f165772k = jSONObject2.getLong("createDate");
                }
                if (jSONObject2.has("lastUpdatedDate") && !jSONObject2.isNull("lastUpdatedDate")) {
                    dVar.f165773l = jSONObject2.getInt("lastUpdatedDate");
                }
                if (jSONObject2.has("activityCommentLikedByUser") && !jSONObject2.isNull("activityCommentLikedByUser")) {
                    dVar.f165774m = jSONObject2.getBoolean("activityCommentLikedByUser");
                }
                if (jSONObject2.has("activityCommentLikesDisplayNames") && !jSONObject2.isNull("activityCommentLikesDisplayNames")) {
                    dVar.f165775n = new ArrayList();
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("activityCommentLikesDisplayNames");
                    for (int i15 = 0; i15 < jSONArray2.length(); i15++) {
                        dVar.f165775n.add(jSONArray2.getString(i15));
                    }
                }
                if (jSONObject2.has("authorRoles") && !jSONObject2.isNull("authorRoles")) {
                    dVar.f165776o = new ArrayList();
                    JSONArray jSONArray3 = jSONObject2.getJSONArray("authorRoles");
                    for (int i16 = 0; i16 < jSONArray3.length(); i16++) {
                        dVar.f165776o.add(jSONArray3.getString(i16));
                    }
                }
                if (jSONObject2.has("groupPk") && !jSONObject2.isNull("groupPk")) {
                    dVar.f165777p = jSONObject2.getInt("groupPk");
                }
                if (jSONObject2.has("authorPro") && !jSONObject2.isNull("authorPro")) {
                    dVar.f165778q = jSONObject2.getBoolean("authorPro");
                }
                arrayList.add(dVar);
            }
        }
        if (!jSONObject.isNull("distance")) {
            this.f29273j = jSONObject.getDouble("distance");
        }
        if (!jSONObject.isNull("duration")) {
            this.f29275k = jSONObject.getDouble("duration");
        }
        if (!jSONObject.isNull("elapsedDuration")) {
            this.f29278l = jSONObject.getDouble("elapsedDuration");
        }
        if (!jSONObject.isNull("elevationGain")) {
            this.f29280m = jSONObject.getDouble("elevationGain");
        }
        if (!jSONObject.isNull("elevationLoss")) {
            this.f29282n = jSONObject.getDouble("elevationLoss");
        }
        if (!jSONObject.isNull("averageSpeed")) {
            this.f29284o = jSONObject.getDouble("averageSpeed");
        }
        if (!jSONObject.isNull("maxSpeed")) {
            this.f29286p = jSONObject.getDouble("maxSpeed");
        }
        if (jSONObject.isNull("startLatitude")) {
            this.f29288q = Double.NaN;
        } else {
            this.f29288q = jSONObject.getDouble("startLatitude");
        }
        if (jSONObject.isNull("startLongitude")) {
            this.f29290r = Double.NaN;
        } else {
            this.f29290r = jSONObject.getDouble("startLongitude");
        }
        if (jSONObject.isNull("endLatitude")) {
            this.f29293t = Double.NaN;
        } else {
            this.f29293t = jSONObject.getDouble("endLatitude");
        }
        if (jSONObject.isNull("endLongitude")) {
            this.f29296v = Double.NaN;
        } else {
            this.f29296v = jSONObject.getDouble("endLongitude");
        }
        if (!jSONObject.isNull("hasPolyline")) {
            this.f29298w = jSONObject.getBoolean("hasPolyline");
        }
        if (!jSONObject.isNull("polyline") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("polyline")) != null) {
            this.f29300x = (m) GsonUtil.f47253b.fromJson(jSONObjectOptJSONObject2.toString(), m.class);
        }
        if (!jSONObject.isNull("hasHeatMap")) {
            this.f29302y = jSONObject.getBoolean("hasHeatMap");
        }
        if (!jSONObject.isNull("heatmap") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("heatmap")) != null) {
            this.f29304z = (h) GsonUtil.f47253b.fromJson(jSONObjectOptJSONObject.toString(), h.class);
        }
        if (!jSONObject.isNull("ownerId")) {
            this.A = jSONObject.getInt("ownerId");
        }
        if (!jSONObject.isNull("ownerDisplayName")) {
            this.B = jSONObject.getString("ownerDisplayName");
        }
        if (!jSONObject.isNull("ownerFullName")) {
            this.C = jSONObject.getString("ownerFullName");
        }
        if (!jSONObject.isNull("ownerProfileImageUrlSmall")) {
            this.D = jSONObject.getString("ownerProfileImageUrlSmall");
        }
        if (!jSONObject.isNull("ownerProfileImageUrlMedium")) {
            this.E = jSONObject.getString("ownerProfileImageUrlMedium");
        }
        if (!jSONObject.isNull("ownerProfileImageUrlLarge")) {
            this.F = jSONObject.getString("ownerProfileImageUrlLarge");
        }
        if (!jSONObject.isNull("ownerCoverImageUrl")) {
            this.I = jSONObject.getString("ownerCoverImageUrl");
        }
        if (!jSONObject.isNull("ownerProfilePk")) {
            this.P = jSONObject.getString("ownerProfilePk");
        }
        if (!jSONObject.isNull("calories")) {
            this.T = jSONObject.getDouble("calories");
        }
        if (!jSONObject.isNull("averageHR")) {
            this.X = jSONObject.getDouble("averageHR");
        }
        if (!jSONObject.isNull("avgPower")) {
            this.f29276k0 = jSONObject.getDouble("avgPower");
        }
        if (!jSONObject.isNull("maxHR")) {
            this.Y = jSONObject.getDouble("maxHR");
        }
        if (!jSONObject.isNull("avgStress")) {
            this.Z = jSONObject.getDouble("avgStress");
        }
        if (!jSONObject.isNull("averageRunningCadenceInStepsPerMinute")) {
            this.H0 = jSONObject.getInt("averageRunningCadenceInStepsPerMinute");
        }
        if (!jSONObject.isNull("maxRunningCadenceInStepsPerMinute")) {
            this.I0 = jSONObject.getInt("maxRunningCadenceInStepsPerMinute");
        }
        if (!jSONObject.isNull("averageBikingCadenceInRevPerMinute")) {
            this.J0 = jSONObject.getInt("averageBikingCadenceInRevPerMinute");
        }
        if (!jSONObject.isNull("maxBikingCadenceInRevPerMinute")) {
            this.K0 = jSONObject.getInt("maxBikingCadenceInRevPerMinute");
        }
        if (!jSONObject.isNull("averageSwimCadenceInStrokesPerMinute")) {
            this.L0 = jSONObject.getInt("averageSwimCadenceInStrokesPerMinute");
        }
        if (!jSONObject.isNull("minSwimCadenceInStrokesPerMinute")) {
            this.M0 = jSONObject.getInt("minSwimCadenceInStrokesPerMinute");
        }
        if (!jSONObject.isNull("activeLengths")) {
            this.N0 = jSONObject.getInt("activeLengths");
        }
        if (!jSONObject.isNull("steps")) {
            this.O0 = jSONObject.getInt("steps");
        }
        if (!jSONObject.isNull("videoUrl")) {
            this.P0 = jSONObject.getString("videoUrl");
        }
        if (!jSONObject.isNull("activityImages")) {
            this.Q0 = new ArrayList();
            JSONArray jSONArray4 = jSONObject.getJSONArray("activityImages");
            for (int i17 = 0; i17 < jSONArray4.length(); i17++) {
                this.Q0.add(new j(jSONArray4.getJSONObject(i17)));
            }
        }
        if (!jSONObject.isNull("highlightedComment")) {
            ConversationCommentDTO conversationCommentDTO = new ConversationCommentDTO();
            conversationCommentDTO.k(jSONObject.getJSONObject("highlightedComment"));
            this.R0 = conversationCommentDTO;
        }
        if (!jSONObject.isNull("numberOfActivityLikes")) {
            this.S0 = jSONObject.getInt("numberOfActivityLikes");
        }
        if (!jSONObject.isNull("numberOfActivityComments")) {
            this.T0 = jSONObject.getInt("numberOfActivityComments");
        }
        if (!jSONObject.isNull("numberOfActivityImages")) {
            this.U0 = jSONObject.getInt("numberOfActivityImages");
        }
        if (!jSONObject.isNull("likedByUser")) {
            this.V0 = jSONObject.getBoolean("likedByUser");
        }
        if (!jSONObject.isNull("activityLikeDisplayNames")) {
            this.W0 = new ArrayList();
            JSONArray jSONArray5 = jSONObject.getJSONArray("activityLikeDisplayNames");
            for (int i18 = 0; i18 < jSONArray5.length(); i18++) {
                this.W0.add(jSONArray5.getString(i18));
            }
        }
        if (!jSONObject.isNull("activityLikeFullNames")) {
            this.X0 = new ArrayList();
            JSONArray jSONArray6 = jSONObject.getJSONArray("activityLikeFullNames");
            for (int i19 = 0; i19 < jSONArray6.length(); i19++) {
                this.X0.add(jSONArray6.getString(i19));
            }
        }
        if (!jSONObject.isNull("activityLikeProfileImageUrls")) {
            this.Y0 = new ArrayList();
            JSONArray jSONArray7 = jSONObject.getJSONArray("activityLikeProfileImageUrls");
            for (int i24 = 0; i24 < jSONArray7.length(); i24++) {
                this.Y0.add(jSONArray7.getString(i24));
            }
        }
        if (!jSONObject.isNull("userRoles")) {
            this.Z0 = new ArrayList();
            JSONArray jSONArray8 = jSONObject.getJSONArray("userRoles");
            for (int i25 = 0; i25 < jSONArray8.length(); i25++) {
                this.Z0.add(jSONArray8.getString(i25));
            }
        }
        if (!jSONObject.isNull("privacy")) {
            this.f29248a1 = (ps.a) GsonUtil.f47253b.fromJson(String.valueOf(jSONObject.getJSONObject("privacy")), ps.a.class);
        }
        if (!jSONObject.isNull("poolLength")) {
            this.f29251b1 = jSONObject.getDouble("poolLength");
        }
        if (!jSONObject.isNull("unitOfPoolLength")) {
            this.f29254c1 = (z1) GsonUtil.f47253b.fromJson(jSONObject.getJSONObject("unitOfPoolLength").toString(), z1.class);
        }
        if (!jSONObject.isNull("favorite")) {
            this.f29257d1 = jSONObject.getBoolean("favorite");
        }
        if (!jSONObject.isNull("pr")) {
            this.f29260e1 = jSONObject.getBoolean("pr");
        }
        if (!jSONObject.isNull("maxDepth")) {
            this.f29272i1 = jSONObject.getDouble("maxDepth");
        }
        if (!jSONObject.isNull("decoDive")) {
            this.f29274j1 = jSONObject.getBoolean("decoDive");
        }
        if (!jSONObject.isNull("summarizedDiveInfo")) {
            d dVar2 = new d();
            this.f29277k1 = dVar2;
            dVar2.k(jSONObject.getJSONObject("summarizedDiveInfo"));
        }
        if (!jSONObject.isNull("bottomTime")) {
            this.f29279l1 = jSONObject.getDouble("bottomTime");
        }
        if (!jSONObject.isNull("maxBottomTime")) {
            this.f29281m1 = jSONObject.getDouble("maxBottomTime");
        }
        if (!jSONObject.isNull("surfaceInterval")) {
            this.f29283n1 = jSONObject.getDouble("surfaceInterval");
        }
        if (!jSONObject.isNull("lapCount")) {
            this.f29285o1 = jSONObject.getInt("lapCount");
        }
        if (!jSONObject.isNull("floorsClimbed")) {
            this.f29287p1 = jSONObject.getInt("floorsClimbed");
        }
        if (!jSONObject.isNull("avgVerticalSpeed")) {
            this.f29289q1 = jSONObject.getDouble("avgVerticalSpeed");
        }
        if (!jSONObject.isNull("strokes")) {
            this.f29294t1 = jSONObject.getInt("strokes");
        }
        this.f29297v1 = jSONObject.optDouble("avgRespirationRate");
        this.f29299w1 = jSONObject.optInt("totalSets", 0);
        this.f29301x1 = jSONObject.optInt("activeSets", 0);
        this.f29303y1 = jSONObject.optDouble("movingDuration");
        this.f29263f1 = s1.u(jSONObject, "conversationUuid");
        this.f29266g1 = jSONObject.optLong("conversationPk");
        this.f29269h1 = jSONObject.optDouble("averageSwolf");
        this.f29292s1 = jSONObject.optLong("workoutId");
        this.f29291r1 = jSONObject.optBoolean("atpActivity");
        if (!jSONObject.isNull("minActivityLapDuration")) {
            double dOptDouble = jSONObject.optDouble("minActivityLapDuration", -1.0d);
            if (dOptDouble != -1.0d) {
                this.f29295u1 = Math.round(dOptDouble * 1000.0d);
            }
        }
        this.C1 = jSONObject.optLong("noOfSplits", 0L);
        if (jSONObject.has("maxGradeValue")) {
            this.D1 = (u0) new Gson().fromJson(jSONObject.getString("maxGradeValue"), u0.class);
        }
        if (!jSONObject.isNull("splitSummaries")) {
            this.E1 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("splitSummaries");
            for (int i26 = 0; i26 < jSONArrayOptJSONArray.length(); i26++) {
                this.E1.add((o1) GsonUtil.f47253b.fromJson(jSONArrayOptJSONArray.getString(i26), o1.class));
            }
        }
        this.F1 = jSONObject.optDouble("maxSplitDistance");
        this.G1 = jSONObject.optDouble("maxSplitSpeed");
        this.H1 = jSONObject.optDouble("activeSplitSummaryDuration");
        this.J1 = jSONObject.optDouble("totalAscent");
        this.I1 = jSONObject.optString("splitSummaryMode");
        if (!jSONObject.isNull("calendarEventId")) {
            this.K1 = jSONObject.optLong("calendarEventId");
        }
        if (!jSONObject.isNull("calendarEventUuid")) {
            this.L1 = jSONObject.optString("calendarEventUuid");
        }
        if (!jSONObject.isNull("summarizedExerciseSets")) {
            this.M1 = new ArrayList();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("summarizedExerciseSets");
            for (int i27 = 0; i27 < jSONArrayOptJSONArray2.length(); i27++) {
                this.M1.add((g) GsonUtil.f47253b.fromJson(jSONArrayOptJSONArray2.getString(i27), g.class));
            }
        }
        this.W1 = jSONObject.optInt("moderateIntensityMinutes", -1);
        this.X1 = jSONObject.optInt("vigorousIntensityMinutes", -1);
        this.f29305z1 = jSONObject.optDouble("avgGradeAdjustedSpeed");
        this.A1 = jSONObject.optDouble("differenceStress");
        this.B1 = jSONObject.optInt("differenceBodyBattery");
        if (!jSONObject.isNull("parentId")) {
            this.O1 = jSONObject.optLong("parentId");
        }
        if (!jSONObject.isNull("locationName")) {
            this.Z1 = jSONObject.getString("locationName");
        }
        try {
            this.P1 = Integer.valueOf(jSONObject.getInt("totalReps"));
        } catch (JSONException unused) {
            this.P1 = null;
        }
        this.Q1 = jSONObject.optDouble("avgJumpRopeCadence", Double.NaN);
        this.R1 = jSONObject.optDouble("maxJumpRopeCadence", Double.NaN);
        this.S1 = jSONObject.optDouble("activeSplitSummaryDistance", Double.NaN);
        this.T1 = jSONObject.optDouble("activeSplitSummaryElevationLoss", Double.NaN);
        if (!jSONObject.isNull("cloudPositioningStatus")) {
            this.f29249a2 = jSONObject.getString("cloudPositioningStatus");
        }
        this.f29252b2 = jSONObject.optDouble("longestPoolApneaInterval", Double.NaN);
        this.f29255c2 = jSONObject.optInt("diveCount", 0);
        this.f29258d2 = jSONObject.optDouble("maxDuration", Double.NaN);
        if (!jSONObject.isNull("beginPackWeight")) {
            this.U1 = jSONObject.getDouble("beginPackWeight");
        }
        if (!jSONObject.isNull("maxPackWeight")) {
            this.V1 = Double.valueOf(jSONObject.getDouble("maxPackWeight"));
        }
        if (!jSONObject.isNull("activityLikeUserIds")) {
            this.N1 = new ArrayList();
            JSONArray jSONArray9 = jSONObject.getJSONArray("activityLikeUserIds");
            for (int i28 = 0; i28 < jSONArray9.length(); i28++) {
                this.N1.add(Integer.valueOf(jSONArray9.getInt(i28)));
            }
        }
        if ((jSONObject.opt("profileInfos") instanceof JSONObject) && jSONObject.getJSONObject("profileInfos").names() != null) {
            JsonElement string = JsonParser.parseString(jSONObject.getJSONObject("profileInfos").toString());
            new ProfileInfoJsonAdapter();
            this.Y1 = ProfileInfoJsonAdapter.a(string);
        }
        this.f29261e2 = jSONObject.optString("speedDeviceDisplayMeasure");
        if (!jSONObject.isNull("qualifyingDive")) {
            this.f29264f2 = jSONObject.getBoolean("qualifyingDive");
        }
        if (!jSONObject.isNull("endTimeGMT")) {
            this.f29267g2 = jSONObject.getString("endTimeGMT");
        }
        if (jSONObject.isNull("generatedImageUrl")) {
            return;
        }
        this.f29270h2 = jSONObject.getString("generatedImageUrl");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Activity [activityId=");
        sb3.append(this.f29250b);
        sb3.append(", activityName=");
        sb3.append(this.f29253c);
        sb3.append(", description=");
        sb3.append(this.f29256d);
        sb3.append(", startTimeLocal=");
        sb3.append(this.f29259e);
        sb3.append(", startTimeGMT=");
        sb3.append(this.f29262f);
        sb3.append(", activityType=");
        sb3.append(this.f29265g);
        sb3.append(", eventType=");
        sb3.append(this.f29268h);
        sb3.append(", comments=");
        sb3.append(this.f29271i);
        sb3.append(", parentId=");
        sb3.append(this.O1);
        sb3.append(", distance=");
        sb3.append(this.f29273j);
        sb3.append(", duration=");
        sb3.append(this.f29275k);
        sb3.append(", elevationGain=");
        sb3.append(this.f29280m);
        sb3.append(", elevationLoss=");
        sb3.append(this.f29282n);
        sb3.append(", averageSpeed=");
        sb3.append(this.f29284o);
        sb3.append(", maxSpeed=");
        sb3.append(this.f29286p);
        sb3.append(", startLatitude=");
        sb3.append(this.f29288q);
        sb3.append(", satartLongitude=");
        sb3.append(this.f29290r);
        sb3.append(", ownerId=");
        sb3.append(this.A);
        sb3.append(", ownerDisplayName=");
        sb3.append(this.B);
        sb3.append(", ownerProfileImageUrlSmall=");
        sb3.append(this.D);
        sb3.append(", ownerProfileImageUrlMedium=");
        sb3.append(this.E);
        sb3.append(", ownerProfileImageUrlLarge=");
        sb3.append(this.F);
        sb3.append(", ownerCoverImageUrl=");
        sb3.append(this.I);
        sb3.append(", ownerProfilePk=");
        sb3.append(this.P);
        sb3.append(", calories=");
        sb3.append(this.T);
        sb3.append(", averageHR=");
        sb3.append(this.X);
        sb3.append(", maxHR=");
        sb3.append(this.Y);
        sb3.append(", avgStress=");
        sb3.append(this.Z);
        sb3.append(", averageRunningCadenceInStepsPerMinute=");
        sb3.append(this.H0);
        sb3.append(", maxRunningCadenceInStepsPerMinute=");
        sb3.append(this.I0);
        sb3.append(", averageBikingCadenceInRevPerMinute=");
        sb3.append(this.J0);
        sb3.append(", maxBikingCadenceInRevPerMinute=");
        sb3.append(this.K0);
        sb3.append(", averageSwimCadenceInStrokesPerMinute=");
        sb3.append(this.L0);
        sb3.append(", minSwimCadenceInStrokesPerMinute=");
        sb3.append(this.M0);
        sb3.append(", activeLengths=");
        sb3.append(this.N0);
        sb3.append(", steps=");
        sb3.append(this.O0);
        sb3.append(", numberOfActivityLikes=");
        sb3.append(this.S0);
        sb3.append(", numberOfActivityComments=");
        sb3.append(this.T0);
        sb3.append(", likedByUser=");
        sb3.append(this.V0);
        sb3.append(", activityLikeDisplayNames=");
        sb3.append(this.W0);
        sb3.append(", activityLikeFullNames=");
        sb3.append(this.X0);
        sb3.append(", activityLikeProfileImageUrls=");
        sb3.append(this.Y0);
        sb3.append(", userRoles=");
        sb3.append(this.Z0);
        sb3.append(", poolLength=");
        sb3.append(this.f29251b1);
        sb3.append(", unitOfPoolLength=");
        sb3.append(this.f29254c1);
        sb3.append(", favorite=");
        sb3.append(this.f29257d1);
        sb3.append(", pr=");
        sb3.append(this.f29260e1);
        sb3.append(", avgSwolf");
        sb3.append(this.f29269h1);
        sb3.append(", summarizedDiveInfo=");
        sb3.append(this.f29277k1);
        sb3.append(", decoDive=");
        sb3.append(this.f29274j1);
        sb3.append(", bottomTime=");
        sb3.append(this.f29279l1);
        sb3.append(", maxBottomTime=");
        sb3.append(this.f29281m1);
        sb3.append(", surfaceInterval=");
        sb3.append(this.f29283n1);
        sb3.append(", lapCount=");
        sb3.append(this.f29285o1);
        sb3.append(", floorsClimbed=");
        sb3.append(this.f29287p1);
        sb3.append(", avgVerticalSpeed=");
        sb3.append(this.f29289q1);
        sb3.append(", strokes=");
        sb3.append(this.f29294t1);
        sb3.append(", avgRespirationRate=");
        sb3.append(this.f29297v1);
        sb3.append(", totalSets=");
        sb3.append(this.f29299w1);
        sb3.append(", activeSets=");
        sb3.append(this.f29301x1);
        sb3.append(", movingDuration=");
        sb3.append(this.f29303y1);
        sb3.append(", noOfSplits = ");
        sb3.append(this.C1);
        sb3.append(", maxGrade = ");
        sb3.append(this.D1);
        sb3.append(", averagePower = ");
        sb3.append(this.f29276k0);
        sb3.append(", moderateIntensityMinutes = ");
        sb3.append(this.W1);
        sb3.append(", vigorousIntensityMinutes = ");
        sb3.append(this.X1);
        sb3.append(", avgGradeAdjustedSpeed = ");
        sb3.append(this.f29305z1);
        sb3.append(", differenceStress = ");
        sb3.append(this.A1);
        sb3.append(", totalReps = ");
        sb3.append(this.P1);
        sb3.append(", avgJumpRopeCadence = ");
        sb3.append(this.Q1);
        sb3.append(", maxJumpRopeCadence = ");
        sb3.append(this.R1);
        sb3.append(", activeSplitSummaryDistance = ");
        sb3.append(this.S1);
        sb3.append(", activeSplitSummaryElevationLoss = ");
        sb3.append(this.T1);
        sb3.append(", longestPoolApneaInterval = ");
        sb3.append(this.f29252b2);
        sb3.append(", diveCount = ");
        sb3.append(this.f29255c2);
        sb3.append(", packWeight = ");
        sb3.append(this.U1);
        sb3.append(", maxPackWeight = ");
        sb3.append(this.V1);
        sb3.append(", speedDeviceDisplayMeasure = ");
        sb3.append(this.f29261e2);
        sb3.append(", qualifyingDive = ");
        sb3.append(this.f29264f2);
        sb3.append(", endTimeGMT = ");
        sb3.append(this.f29267g2);
        sb3.append(", generatedImageUrl= ");
        return am.j.o(this.f29270h2, "]", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f29247a);
        parcel.writeLong(this.f29250b);
        parcel.writeString(this.f29253c);
        parcel.writeString(this.f29256d);
        parcel.writeString(this.f29259e);
        parcel.writeString(this.f29262f);
        parcel.writeString(this.f29265g.f4358a);
        parcel.writeParcelable(this.f29268h, 0);
        parcel.writeList(this.f29271i);
        parcel.writeDouble(this.f29273j);
        parcel.writeDouble(this.f29275k);
        parcel.writeDouble(this.f29278l);
        parcel.writeDouble(this.f29280m);
        parcel.writeDouble(this.f29282n);
        parcel.writeDouble(this.f29284o);
        parcel.writeDouble(this.f29286p);
        parcel.writeDouble(this.f29288q);
        parcel.writeDouble(this.f29290r);
        parcel.writeDouble(this.f29293t);
        parcel.writeDouble(this.f29296v);
        parcel.writeInt(this.f29298w ? 1 : 0);
        parcel.writeParcelable(this.f29300x, 0);
        parcel.writeInt(this.f29302y ? 1 : 0);
        parcel.writeParcelable(this.f29304z, 0);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.I);
        parcel.writeString(this.P);
        parcel.writeDouble(this.T);
        parcel.writeDouble(this.X);
        parcel.writeDouble(this.Y);
        parcel.writeDouble(this.Z);
        parcel.writeDouble(this.f29276k0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeInt(this.J0);
        parcel.writeInt(this.K0);
        parcel.writeInt(this.L0);
        parcel.writeInt(this.M0);
        parcel.writeInt(this.N0);
        parcel.writeInt(this.O0);
        parcel.writeString(this.P0);
        parcel.writeList(this.Q0);
        parcel.writeParcelable(this.R0, i14);
        parcel.writeInt(this.S0);
        parcel.writeInt(this.T0);
        parcel.writeInt(this.U0);
        parcel.writeInt(this.V0 ? 1 : 0);
        parcel.writeStringList(this.W0);
        parcel.writeStringList(this.X0);
        parcel.writeStringList(this.Y0);
        parcel.writeStringList(this.Z0);
        parcel.writeParcelable(this.f29248a1, i14);
        parcel.writeDouble(this.f29251b1);
        parcel.writeParcelable(this.f29254c1, i14);
        parcel.writeInt(this.f29257d1 ? 1 : 0);
        parcel.writeInt(this.f29260e1 ? 1 : 0);
        parcel.writeString(this.f29263f1);
        parcel.writeLong(this.f29266g1);
        parcel.writeDouble(this.f29269h1);
        parcel.writeParcelable(this.f29277k1, i14);
        parcel.writeInt(this.f29274j1 ? 1 : 0);
        parcel.writeDouble(this.f29272i1);
        parcel.writeDouble(this.f29279l1);
        parcel.writeDouble(this.f29281m1);
        parcel.writeDouble(this.f29283n1);
        parcel.writeInt(this.f29285o1);
        parcel.writeInt(this.f29287p1);
        parcel.writeDouble(this.f29289q1);
        parcel.writeInt(this.f29291r1 ? 1 : 0);
        parcel.writeLong(this.f29292s1);
        parcel.writeDouble(this.f29294t1);
        parcel.writeDouble(this.f29297v1);
        parcel.writeInt(this.f29299w1);
        parcel.writeInt(this.f29301x1);
        parcel.writeDouble(this.f29303y1);
        parcel.writeLong(this.C1);
        parcel.writeParcelable(this.D1, 0);
        parcel.writeList(this.E1);
        parcel.writeDouble(this.F1);
        parcel.writeDouble(this.G1);
        parcel.writeDouble(this.H1);
        parcel.writeDouble(this.J1);
        parcel.writeString(this.I1);
        parcel.writeInt(this.W1);
        parcel.writeInt(this.X1);
        parcel.writeDouble(this.f29305z1);
        parcel.writeList(this.M1);
        parcel.writeDouble(this.A1);
        parcel.writeInt(this.B1);
        parcel.writeString(this.Z1);
        parcel.writeValue(this.P1);
        parcel.writeDouble(this.Q1);
        parcel.writeDouble(this.R1);
        parcel.writeDouble(this.S1);
        parcel.writeDouble(this.T1);
        parcel.writeString(this.f29249a2);
        parcel.writeDouble(this.f29252b2);
        parcel.writeInt(this.f29255c2);
        parcel.writeDouble(this.f29258d2);
        parcel.writeDouble(this.U1);
        parcel.writeValue(this.V1);
        parcel.writeList(this.N1);
        parcel.writeMap(this.Y1);
        parcel.writeString(this.f29261e2);
        parcel.writeInt(this.f29264f2 ? 1 : 0);
        parcel.writeString(this.f29267g2);
        parcel.writeString(this.f29270h2);
    }

    public ActivityListItemDTO() {
        this.f29265g = x0.f4346x;
        this.T = Double.NaN;
        this.X = Double.NaN;
        this.Z = Double.NaN;
        this.f29276k0 = Double.NaN;
        this.O0 = -1;
        this.Q1 = Double.NaN;
        this.R1 = Double.NaN;
        this.S1 = Double.NaN;
        this.T1 = Double.NaN;
        this.U1 = Double.NaN;
        this.W1 = -1;
        this.X1 = -1;
        this.Y1 = new HashMap();
    }
}

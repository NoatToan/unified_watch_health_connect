package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(GroupSerializer.class)
public class GroupDTO extends s1 implements Parcelable, Cloneable {
    public static final Parcelable.Creator<GroupDTO> CREATOR = new a();
    public List<String> A;
    public List<String> B;
    public boolean C;
    public String D;
    public String E;
    public String F;
    public String I;
    public final boolean P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f31566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f31567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f31568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f31569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f31570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f31571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f31572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f31573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f31574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f31575r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f31576t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f31577v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f31578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GroupAnnouncementDTO f31579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f31580y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f31581z;

    public static class GroupSerializer implements JsonSerializer<GroupDTO>, JsonDeserializer<GroupDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final GroupDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                GroupDTO groupDTO = new GroupDTO();
                groupDTO.k(new JSONObject(jsonElement.getAsJsonObject().toString()));
                return groupDTO;
            } catch (JSONException unused) {
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(GroupDTO groupDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            try {
                return JsonParser.parseString(groupDTO.F());
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<GroupDTO> {
        @Override // android.os.Parcelable.Creator
        public final GroupDTO createFromParcel(Parcel parcel) {
            return new GroupDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupDTO[] newArray(int i14) {
            return new GroupDTO[i14];
        }
    }

    public enum b {
        CALENDAR(R.string.lbl_calendar),
        COURSES(R.string.concept_courses),
        SEGMENTS(R.string.card_segments_title),
        LEADERBOARD(R.string.concept_leaderboard);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31587a;

        b(int i14) {
            this.f31587a = i14;
        }
    }

    public enum c {
        NOT_DEFINED,
        MEMBER,
        OWNER,
        ADMIN,
        REQUEST_SENT,
        INVITE_SENT
    }

    public enum d {
        NOT_DEFINED(0),
        PUBLIC(R.string.lbl_join_instantly),
        PRIVATE(R.string.lbl_approval_required),
        INVITE(R.string.lbl_by_invitation_only);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31600a;

        d(int i14) {
            this.f31600a = i14;
        }
    }

    public enum e {
        NOT_DEFINED(0),
        HIDDEN(R.string.lbl_only_group_members),
        VISIBLE(R.string.privacy_everyone);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31605a;

        e(int i14) {
            this.f31605a = i14;
        }
    }

    public GroupDTO(Parcel parcel) {
        this.f31567j = e.NOT_DEFINED;
        this.f31568k = d.NOT_DEFINED;
        this.f31578w = c.NOT_DEFINED;
        ClassLoader classLoader = getClass().getClassLoader();
        this.f31558a = parcel.readString();
        this.f31559b = parcel.readString();
        this.f31560c = parcel.readString();
        this.f31561d = parcel.readString();
        this.f31562e = parcel.readString();
        this.f31563f = parcel.readString();
        this.f31564g = parcel.readString();
        this.f31565h = parcel.readString();
        this.f31566i = parcel.readString();
        this.f31567j = e.values()[parcel.readInt()];
        this.f31568k = d.values()[parcel.readInt()];
        this.f31569l = parcel.readString();
        this.f31570m = parcel.readString();
        this.f31571n = parcel.readString();
        this.f31572o = parcel.readString();
        int[] iArrCreateIntArray = parcel.createIntArray();
        this.f31573p = new ArrayList(iArrCreateIntArray.length);
        for (int i14 : iArrCreateIntArray) {
            ArrayList arrayList = this.f31573p;
            com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.f31644o.get(i14);
            if (eVar == null) {
                eVar = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_NOT_DEFINED;
            }
            arrayList.add(eVar);
        }
        this.f31574q = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        this.f31575r = new ArrayList();
        for (int i15 = 0; i15 < strArrCreateStringArray.length; i15++) {
            String str = strArrCreateStringArray[i15];
            j10.d.f96350d.getClass();
            if (j10.d.a.a(str) != null) {
                this.f31575r.add(j10.d.a.a(strArrCreateStringArray[i15]));
            }
        }
        String[] strArrCreateStringArray2 = parcel.createStringArray();
        this.f31576t = new ArrayList(iArrCreateIntArray.length);
        for (String str2 : strArrCreateStringArray2) {
            this.f31576t.add(b.valueOf(str2));
        }
        this.f31577v = parcel.createTypedArrayList(com.garmin.android.apps.connectmobile.connections.groups.services.model.a.CREATOR);
        this.f31578w = c.values()[parcel.readInt()];
        this.P = parcel.readInt() == 1;
        this.f31579x = (GroupAnnouncementDTO) parcel.readParcelable(classLoader);
        this.f31580y = parcel.readInt();
        this.f31581z = parcel.readInt();
        this.A = new ArrayList();
        this.B = new ArrayList();
        parcel.readStringList(this.A);
        parcel.readStringList(this.B);
        this.C = parcel.readInt() == 1;
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.I = parcel.readString();
    }

    public static ArrayList C(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i14);
            if (jSONObject != null) {
                GroupDTO groupDTO = new GroupDTO();
                groupDTO.k(jSONObject);
                arrayList.add(groupDTO);
            }
        }
        return arrayList;
    }

    public final void D(ArrayList arrayList) {
        arrayList.sort(new com.garmin.android.apps.connectmobile.connections.groups.services.model.d());
        this.f31575r = arrayList;
    }

    public final String F() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TtmlNode.ATTR_ID, this.f31558a);
            jSONObject.put("ownerId", this.f31561d);
            jSONObject.put("groupVisibility", this.f31567j);
            jSONObject.put("groupPrivacy", this.f31568k);
            jSONObject.put("groupName", this.f31559b);
            jSONObject.put("groupDescription", this.f31560c);
            jSONObject.put(FirebaseAnalytics.Param.LOCATION, this.f31569l);
            jSONObject.put("profileImageId", this.f31562e);
            jSONObject.put("profileImageUploaderUserId", this.f31563f);
            jSONObject.put("profileImageUrlLarge", this.f31564g);
            jSONObject.put("profileImageUrlMedium", this.f31565h);
            jSONObject.put("profileImageUrlSmall", this.f31566i);
            jSONObject.put("facebookUrl", this.f31571n);
            jSONObject.put("twitterUrl", this.f31572o);
            jSONObject.put("websiteUrl", this.f31570m);
            jSONObject.put("isCorporateWellness", this.C);
            jSONObject.put("programName", this.D);
            jSONObject.put("programTextColor", this.E);
            jSONObject.put("programBackgroundColor", this.F);
            jSONObject.put("defaultImageName", this.I);
            if (this.f31577v != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i14 = 0; i14 < this.f31577v.size(); i14++) {
                    jSONArray.put(((com.garmin.android.apps.connectmobile.connections.groups.services.model.a) this.f31577v.get(i14)).G());
                }
                jSONObject.put("activityFeedTypes", jSONArray);
            }
            if (this.f31573p != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i15 = 0; i15 < this.f31573p.size(); i15++) {
                    jSONArray2.put(((com.garmin.android.apps.connectmobile.connections.groups.services.model.e) this.f31573p.get(i15)).f31648c);
                }
                jSONObject.put("primaryActivities", jSONArray2);
            }
            jSONObject.put("otherPrimaryActivity", this.f31574q);
            if (this.f31575r != null) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i16 = 0; i16 < this.f31575r.size(); i16++) {
                    jSONArray3.put(this.f31575r.get(i16));
                }
                jSONObject.put("leaderboardTypes", jSONArray3);
            }
            if (this.f31576t != null) {
                JSONArray jSONArray4 = new JSONArray();
                for (int i17 = 0; i17 < this.f31576t.size(); i17++) {
                    jSONArray4.put(this.f31576t.get(i17));
                }
                jSONObject.put("featureTypes", jSONArray4);
            }
        } catch (JSONException e4) {
            i2.a(a2.CONNECTIONS, "GroupDTO", "Error while converting to JSON object: " + e4.toString());
        }
        return jSONObject.toString();
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupDTO groupDTO = (GroupDTO) obj;
        if (this.f31580y != groupDTO.f31580y || this.f31581z != groupDTO.f31581z || !Objects.equals(this.A, groupDTO.A) || !Objects.equals(this.B, groupDTO.B) || this.P != groupDTO.P) {
            return false;
        }
        String str = this.f31558a;
        String str2 = groupDTO.f31558a;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        String str3 = this.f31559b;
        String str4 = groupDTO.f31559b;
        if (str3 != null) {
            if (!str3.equals(str4)) {
                return false;
            }
        } else if (str4 != null) {
            return false;
        }
        String str5 = this.f31560c;
        String str6 = groupDTO.f31560c;
        if (str5 != null) {
            if (!str5.equals(str6)) {
                return false;
            }
        } else if (str6 != null) {
            return false;
        }
        String str7 = this.f31561d;
        String str8 = groupDTO.f31561d;
        if (str7 != null) {
            if (!str7.equals(str8)) {
                return false;
            }
        } else if (str8 != null) {
            return false;
        }
        String str9 = this.f31562e;
        String str10 = groupDTO.f31562e;
        if (str9 != null) {
            if (!str9.equals(str10)) {
                return false;
            }
        } else if (str10 != null) {
            return false;
        }
        String str11 = this.f31563f;
        String str12 = groupDTO.f31563f;
        if (str11 != null) {
            if (!str11.equals(str12)) {
                return false;
            }
        } else if (str12 != null) {
            return false;
        }
        String str13 = this.f31564g;
        String str14 = groupDTO.f31564g;
        if (str13 != null) {
            if (!str13.equals(str14)) {
                return false;
            }
        } else if (str14 != null) {
            return false;
        }
        String str15 = this.f31565h;
        String str16 = groupDTO.f31565h;
        if (str15 != null) {
            if (!str15.equals(str16)) {
                return false;
            }
        } else if (str16 != null) {
            return false;
        }
        String str17 = this.f31566i;
        String str18 = groupDTO.f31566i;
        if (str17 != null) {
            if (!str17.equals(str18)) {
                return false;
            }
        } else if (str18 != null) {
            return false;
        }
        if (this.f31567j != groupDTO.f31567j || this.f31568k != groupDTO.f31568k) {
            return false;
        }
        String str19 = this.f31569l;
        String str20 = groupDTO.f31569l;
        if (str19 != null) {
            if (!str19.equals(str20)) {
                return false;
            }
        } else if (str20 != null) {
            return false;
        }
        String str21 = this.f31570m;
        String str22 = groupDTO.f31570m;
        if (str21 != null) {
            if (!str21.equals(str22)) {
                return false;
            }
        } else if (str22 != null) {
            return false;
        }
        String str23 = this.f31571n;
        String str24 = groupDTO.f31571n;
        if (str23 != null) {
            if (!str23.equals(str24)) {
                return false;
            }
        } else if (str24 != null) {
            return false;
        }
        String str25 = this.f31572o;
        String str26 = groupDTO.f31572o;
        if (str25 != null) {
            if (!str25.equals(str26)) {
                return false;
            }
        } else if (str26 != null) {
            return false;
        }
        ArrayList arrayList = this.f31573p;
        ArrayList arrayList2 = groupDTO.f31573p;
        if (arrayList != null) {
            if (!arrayList.equals(arrayList2)) {
                return false;
            }
        } else if (arrayList2 != null) {
            return false;
        }
        String str27 = this.f31574q;
        String str28 = groupDTO.f31574q;
        if (str27 != null) {
            if (!str27.equals(str28)) {
                return false;
            }
        } else if (str28 != null) {
            return false;
        }
        ArrayList arrayList3 = this.f31575r;
        ArrayList arrayList4 = groupDTO.f31575r;
        if (arrayList3 != null) {
            if (!arrayList3.equals(arrayList4)) {
                return false;
            }
        } else if (arrayList4 != null) {
            return false;
        }
        ArrayList arrayList5 = this.f31576t;
        ArrayList arrayList6 = groupDTO.f31576t;
        if (arrayList5 != null) {
            if (!arrayList5.equals(arrayList6)) {
                return false;
            }
        } else if (arrayList6 != null) {
            return false;
        }
        ArrayList arrayList7 = this.f31577v;
        if (arrayList7 == null && groupDTO.f31577v != null) {
            return false;
        }
        if (arrayList7 != null && groupDTO.f31577v == null) {
            return false;
        }
        if ((arrayList7 != null && groupDTO.f31577v != null && (arrayList7.size() != groupDTO.f31577v.size() || !new HashSet(this.f31577v).containsAll(groupDTO.f31577v))) || this.f31578w != groupDTO.f31578w || this.C != groupDTO.C) {
            return false;
        }
        String str29 = this.D;
        String str30 = groupDTO.D;
        if (str29 != null) {
            if (!str29.equals(str30)) {
                return false;
            }
        } else if (str30 != null) {
            return false;
        }
        String str31 = this.E;
        String str32 = groupDTO.E;
        if (str31 != null) {
            if (str31.equals(str32)) {
                return false;
            }
        } else if (str32 != null) {
            return false;
        }
        String str33 = this.F;
        String str34 = groupDTO.F;
        if (str33 != null) {
            if (!str33.equals(str34)) {
                return false;
            }
        } else if (str34 != null) {
            return false;
        }
        String str35 = this.I;
        String str36 = groupDTO.I;
        if (str35 != null) {
            if (!str35.equals(str36)) {
                return false;
            }
        } else if (str36 != null) {
            return false;
        }
        GroupAnnouncementDTO groupAnnouncementDTO = this.f31579x;
        GroupAnnouncementDTO groupAnnouncementDTO2 = groupDTO.f31579x;
        if (groupAnnouncementDTO != null) {
            return groupAnnouncementDTO.equals(groupAnnouncementDTO2);
        }
        return groupAnnouncementDTO2 == null;
    }

    public final int hashCode() {
        String str = this.f31558a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31559b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f31560c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f31561d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f31562e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f31563f;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f31564g;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f31565h;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f31566i;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        e eVar = this.f31567j;
        int iHashCode10 = (iHashCode9 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        d dVar = this.f31568k;
        int iHashCode11 = (iHashCode10 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str10 = this.f31569l;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f31570m;
        int iHashCode13 = (iHashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f31571n;
        int iHashCode14 = (iHashCode13 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f31572o;
        int iHashCode15 = (iHashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31;
        ArrayList arrayList = this.f31573p;
        int iHashCode16 = (iHashCode15 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str14 = this.f31574q;
        int iHashCode17 = (iHashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
        ArrayList arrayList2 = this.f31575r;
        int iHashCode18 = (iHashCode17 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        ArrayList arrayList3 = this.f31576t;
        int iHashCode19 = (iHashCode18 + (arrayList3 != null ? arrayList3.hashCode() : 0)) * 31;
        ArrayList arrayList4 = this.f31577v;
        int iHashCode20 = (iHashCode19 + (arrayList4 != null ? arrayList4.hashCode() : 0)) * 31;
        c cVar = this.f31578w;
        int iHashCode21 = (iHashCode20 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        GroupAnnouncementDTO groupAnnouncementDTO = this.f31579x;
        int iHashCode22 = (((((iHashCode21 + (groupAnnouncementDTO != null ? groupAnnouncementDTO.hashCode() : 0)) * 31) + this.f31580y) * 31) + this.f31581z) * 31;
        List<String> list = this.A;
        int iHashCode23 = (iHashCode22 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.B;
        int iHashCode24 = (((((iHashCode23 + (list2 != null ? list2.hashCode() : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31;
        String str15 = this.D;
        int iHashCode25 = (iHashCode24 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.E;
        int iHashCode26 = (iHashCode25 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.F;
        int iHashCode27 = (iHashCode26 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.I;
        return iHashCode27 + (str18 != null ? str18.hashCode() : 0);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public void k(JSONObject jSONObject) throws JSONException {
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar;
        if (jSONObject != null) {
            this.f31558a = s1.u(jSONObject, TtmlNode.ATTR_ID);
            this.f31559b = s1.u(jSONObject, "groupName");
            this.f31560c = s1.u(jSONObject, "groupDescription");
            this.f31561d = s1.u(jSONObject, "ownerId");
            this.f31562e = s1.u(jSONObject, "profileImageId");
            this.f31563f = s1.u(jSONObject, "profileImageUploaderUserId");
            this.f31564g = s1.u(jSONObject, "profileImageUrlLarge");
            this.f31565h = s1.u(jSONObject, "profileImageUrlMedium");
            this.f31566i = s1.u(jSONObject, "profileImageUrlSmall");
            String strU = s1.u(jSONObject, "groupVisibility");
            this.f31567j = TextUtils.isEmpty(strU) ? e.NOT_DEFINED : e.valueOf(strU);
            String strU2 = s1.u(jSONObject, "groupPrivacy");
            this.f31568k = TextUtils.isEmpty(strU2) ? d.NOT_DEFINED : d.valueOf(strU2);
            this.f31569l = s1.u(jSONObject, FirebaseAnalytics.Param.LOCATION);
            this.f31570m = s1.u(jSONObject, "websiteUrl");
            this.f31571n = s1.u(jSONObject, "facebookUrl");
            this.f31572o = s1.u(jSONObject, "twitterUrl");
            List<String> listY = s1.y(jSONObject, "primaryActivities");
            if (listY == null || listY.size() <= 0) {
                this.f31573p = new ArrayList(0);
            } else {
                ArrayList arrayList = new ArrayList(listY.size());
                for (int i14 = 0; i14 < listY.size(); i14++) {
                    String str = listY.get(i14);
                    com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar2 = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_OTHER;
                    if (TextUtils.isEmpty(str) || (eVar = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.f31643n.get(str)) == null) {
                        eVar = com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_NOT_DEFINED;
                    }
                    arrayList.add(eVar);
                }
                this.f31573p = arrayList;
            }
            this.f31574q = s1.u(jSONObject, "otherPrimaryActivity");
            List<String> listY2 = s1.y(jSONObject, "leaderboardTypes");
            if (listY2.isEmpty()) {
                D(new ArrayList(0));
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (int i15 = 0; i15 < listY2.size(); i15++) {
                    String str2 = listY2.get(i15);
                    j10.d.f96350d.getClass();
                    j10.d dVarA = j10.d.a.a(str2);
                    if (dVarA != null) {
                        arrayList2.add(dVarA);
                    }
                }
                D(arrayList2);
            }
            List<String> listY3 = s1.y(jSONObject, "featureTypes");
            if (listY3.isEmpty()) {
                this.f31576t = new ArrayList(0);
            } else {
                ArrayList arrayList3 = new ArrayList(listY3.size());
                for (int i16 = 0; i16 < listY3.size(); i16++) {
                    arrayList3.add(b.valueOf(listY3.get(i16)));
                }
                this.f31576t = arrayList3;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("activityFeedTypes");
            if (jSONArray != null) {
                this.f31577v = com.garmin.android.apps.connectmobile.connections.groups.services.model.a.F(jSONArray);
            }
            String strU3 = s1.u(jSONObject, "membershipStatus");
            this.f31578w = TextUtils.isEmpty(strU3) ? c.NOT_DEFINED : c.valueOf(strU3);
            String strU4 = s1.u(jSONObject, "groupLatestAnnouncement");
            long jOptLong = jSONObject.optLong("announcementDate");
            if (strU4 != null) {
                GroupAnnouncementDTO groupAnnouncementDTO = new GroupAnnouncementDTO();
                groupAnnouncementDTO.f31505d = strU4;
                groupAnnouncementDTO.f31507f = jOptLong;
                groupAnnouncementDTO.f31503b = this.f31558a;
                this.f31579x = groupAnnouncementDTO;
            }
            this.f31580y = jSONObject.optInt("groupMemberCount");
            this.f31581z = jSONObject.optInt("groupMemberConnectionCount");
            this.A = s1.y(jSONObject, "profileImageSmallList");
            this.B = s1.y(jSONObject, "userProfileIdList");
            this.C = jSONObject.optBoolean("isCorporateWellness");
            this.D = jSONObject.optString("programName");
            this.E = jSONObject.optString("programTextColor");
            this.F = jSONObject.optString("programBackgroundColor");
            this.I = s1.u(jSONObject, "defaultImageName");
        }
    }

    public final String toString() {
        return this.f31559b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f31558a);
        parcel.writeString(this.f31559b);
        parcel.writeString(this.f31560c);
        parcel.writeString(this.f31561d);
        parcel.writeString(this.f31562e);
        parcel.writeString(this.f31563f);
        parcel.writeString(this.f31564g);
        parcel.writeString(this.f31565h);
        parcel.writeString(this.f31566i);
        parcel.writeInt(this.f31567j.ordinal());
        parcel.writeInt(this.f31568k.ordinal());
        parcel.writeString(this.f31569l);
        parcel.writeString(this.f31570m);
        parcel.writeString(this.f31571n);
        parcel.writeString(this.f31572o);
        ArrayList arrayList = this.f31573p;
        if (arrayList != null) {
            int[] iArr = new int[arrayList.size()];
            for (int i15 = 0; i15 < this.f31573p.size(); i15++) {
                iArr[i15] = ((com.garmin.android.apps.connectmobile.connections.groups.services.model.e) this.f31573p.get(i15)).f31646a;
            }
            parcel.writeIntArray(iArr);
        } else {
            parcel.writeIntArray(new int[0]);
        }
        parcel.writeString(this.f31574q);
        ArrayList arrayList2 = this.f31575r;
        if (arrayList2 != null) {
            String[] strArr = new String[arrayList2.size()];
            for (int i16 = 0; i16 < this.f31575r.size(); i16++) {
                strArr[i16] = ((j10.d) this.f31575r.get(i16)).name();
            }
            parcel.writeStringArray(strArr);
        } else {
            parcel.writeStringArray(new String[0]);
        }
        ArrayList arrayList3 = this.f31576t;
        if (arrayList3 != null) {
            String[] strArr2 = new String[arrayList3.size()];
            for (int i17 = 0; i17 < this.f31576t.size(); i17++) {
                strArr2[i17] = ((b) this.f31576t.get(i17)).name();
            }
            parcel.writeStringArray(strArr2);
        } else {
            parcel.writeStringArray(new String[0]);
        }
        parcel.writeTypedList(this.f31577v);
        parcel.writeInt(this.f31578w.ordinal());
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeParcelable(this.f31579x, 0);
        parcel.writeInt(this.f31580y);
        parcel.writeInt(this.f31581z);
        parcel.writeStringList(this.A);
        parcel.writeStringList(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.I);
    }

    public GroupDTO() {
        this.f31567j = e.NOT_DEFINED;
        this.f31568k = d.NOT_DEFINED;
        this.f31578w = c.NOT_DEFINED;
    }
}

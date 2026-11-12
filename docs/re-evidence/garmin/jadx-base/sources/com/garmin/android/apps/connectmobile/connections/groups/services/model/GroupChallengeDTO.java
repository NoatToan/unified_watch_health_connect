package com.garmin.android.apps.connectmobile.connections.groups.services.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.s;
import com.garmin.android.apps.connectmobile.s1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@JsonAdapter(GroupChallengeDeserializer.class)
public class GroupChallengeDTO extends s1 implements Parcelable {
    public static final Parcelable.Creator<GroupChallengeDTO> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f31513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f31514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f31519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f31520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f31521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f31525n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f31527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f31528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public GroupChallengePlayerDTO f31529r;

    public static class GroupChallengeDeserializer implements JsonDeserializer<GroupChallengeDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final GroupChallengeDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                GroupChallengeDTO groupChallengeDTO = new GroupChallengeDTO();
                groupChallengeDTO.k(new JSONObject(jsonElement.toString()));
                return groupChallengeDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class a implements Parcelable.Creator<GroupChallengeDTO> {
        @Override // android.os.Parcelable.Creator
        public final GroupChallengeDTO createFromParcel(Parcel parcel) {
            return new GroupChallengeDTO(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupChallengeDTO[] newArray(int i14) {
            return new GroupChallengeDTO[i14];
        }
    }

    public enum b {
        UPCOMING(0, R.string.lbl_upcoming),
        IN_PROGRESS(1, R.string.lbl_in_progress),
        STOPPED(2, R.string.no_value),
        LOCKED(3, R.string.no_value),
        COMPLETED(4, R.string.lbl_completed);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f31536a;

        b(int i14, int i15) {
            this.f31536a = i14;
        }
    }

    public GroupChallengeDTO(Parcel parcel) {
        this.f31512a = parcel.readString();
        int i14 = parcel.readInt();
        for (b bVar : b.values()) {
            if (bVar.f31536a == i14) {
                this.f31513b = bVar;
                this.f31514c = s.b(parcel.readInt());
                this.f31515d = parcel.readLong();
                this.f31516e = parcel.readString();
                this.f31517f = parcel.readString();
                this.f31518g = parcel.readString();
                this.f31520i = parcel.readString();
                this.f31521j = parcel.readString();
                this.f31519h = parcel.createTypedArrayList(GroupChallengePlayerDTO.CREATOR);
                this.f31522k = parcel.readInt();
                this.f31523l = parcel.readInt();
                this.f31524m = parcel.readInt();
                this.f31525n = parcel.readDouble();
                this.f31526o = parcel.readInt();
                this.f31527p = parcel.readDouble();
                this.f31528q = parcel.readInt();
                this.f31529r = (GroupChallengePlayerDTO) parcel.readParcelable(GroupChallengePlayerDTO.class.getClassLoader());
            }
        }
        bVar = b.UPCOMING;
        this.f31513b = bVar;
        this.f31514c = s.b(parcel.readInt());
        this.f31515d = parcel.readLong();
        this.f31516e = parcel.readString();
        this.f31517f = parcel.readString();
        this.f31518g = parcel.readString();
        this.f31520i = parcel.readString();
        this.f31521j = parcel.readString();
        this.f31519h = parcel.createTypedArrayList(GroupChallengePlayerDTO.CREATOR);
        this.f31522k = parcel.readInt();
        this.f31523l = parcel.readInt();
        this.f31524m = parcel.readInt();
        this.f31525n = parcel.readDouble();
        this.f31526o = parcel.readInt();
        this.f31527p = parcel.readDouble();
        this.f31528q = parcel.readInt();
        this.f31529r = (GroupChallengePlayerDTO) parcel.readParcelable(GroupChallengePlayerDTO.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        b bVar;
        ArrayList arrayList;
        Double dValueOf = Double.valueOf(0.0d);
        Integer num = -1;
        if (jSONObject != null) {
            this.f31512a = s1.u(jSONObject, "groupId");
            int iOptInt = jSONObject.optInt("groupChallengeStatusId");
            b[] bVarArrValues = b.values();
            int length = bVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    bVar = b.UPCOMING;
                    break;
                }
                bVar = bVarArrValues[i14];
                if (bVar.f31536a == iOptInt) {
                    break;
                } else {
                    i14++;
                }
            }
            this.f31513b = bVar;
            this.f31514c = s.b(jSONObject.optInt("groupChallengeActivityTypeId"));
            this.f31515d = jSONObject.optInt("ownerUserProfileId");
            this.f31516e = s1.u(jSONObject, "groupChallengeName");
            this.f31517f = s1.u(jSONObject, "groupChallengeDesc");
            this.f31518g = s1.u(jSONObject, "uuid");
            this.f31520i = s1.u(jSONObject, "startDate");
            this.f31521j = s1.u(jSONObject, "endDate");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("players");
            if (jSONArrayOptJSONArray != null) {
                Parcelable.Creator<GroupChallengePlayerDTO> creator = GroupChallengePlayerDTO.CREATOR;
                if (jSONArrayOptJSONArray.length() == 0) {
                    arrayList = new ArrayList();
                } else {
                    int length2 = jSONArrayOptJSONArray.length();
                    ArrayList arrayList2 = new ArrayList(length2);
                    for (int i15 = 0; i15 < length2; i15++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i15);
                        if (jSONObject2 != null) {
                            GroupChallengePlayerDTO groupChallengePlayerDTO = new GroupChallengePlayerDTO();
                            groupChallengePlayerDTO.k(jSONObject2);
                            arrayList2.add(groupChallengePlayerDTO);
                        }
                    }
                    arrayList = arrayList2;
                }
                this.f31519h = arrayList;
            }
            Integer numR = s1.r(jSONObject, "userIndex");
            if (numR == null) {
                numR = num;
            }
            this.f31522k = numR.intValue();
            Integer numR2 = s1.r(jSONObject, "userRanking");
            if (numR2 == null) {
                numR2 = num;
            }
            this.f31523l = numR2.intValue();
            Integer numR3 = s1.r(jSONObject, "firstRank");
            if (numR3 == null) {
                numR3 = num;
            }
            this.f31524m = numR3.intValue();
            Double dQ = s1.q(jSONObject, "firstTotalNumber");
            if (dQ == null) {
                dQ = dValueOf;
            }
            this.f31525n = dQ.doubleValue();
            Integer numR4 = s1.r(jSONObject, "lastRank");
            this.f31526o = (numR4 != null ? numR4 : -1).intValue();
            Double dQ2 = s1.q(jSONObject, "lastTotalNumber");
            if (dQ2 != null) {
                dValueOf = dQ2;
            }
            this.f31527p = dValueOf.doubleValue();
            Integer numR5 = s1.r(jSONObject, "playerCount");
            if (numR5 == null) {
                numR5 = 0;
            }
            this.f31528q = numR5.intValue();
            if (!jSONObject.has("user") || jSONObject.isNull("user")) {
                return;
            }
            GroupChallengePlayerDTO groupChallengePlayerDTO2 = new GroupChallengePlayerDTO();
            groupChallengePlayerDTO2.k(jSONObject.getJSONObject("user"));
            this.f31529r = groupChallengePlayerDTO2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f31512a);
        parcel.writeInt(this.f31513b.f31536a);
        s sVar = this.f31514c;
        if (sVar != null) {
            parcel.writeInt(sVar.f38319a);
        } else {
            parcel.writeInt(-1);
        }
        parcel.writeLong(this.f31515d);
        parcel.writeString(this.f31516e);
        parcel.writeString(this.f31517f);
        parcel.writeString(this.f31518g);
        parcel.writeString(this.f31520i);
        parcel.writeString(this.f31521j);
        parcel.writeTypedList(this.f31519h);
        parcel.writeInt(this.f31522k);
        parcel.writeInt(this.f31523l);
        parcel.writeInt(this.f31524m);
        parcel.writeDouble(this.f31525n);
        parcel.writeInt(this.f31526o);
        parcel.writeDouble(this.f31527p);
        parcel.writeInt(this.f31528q);
        parcel.writeParcelable(this.f31529r, i14);
    }

    public GroupChallengeDTO() {
    }
}

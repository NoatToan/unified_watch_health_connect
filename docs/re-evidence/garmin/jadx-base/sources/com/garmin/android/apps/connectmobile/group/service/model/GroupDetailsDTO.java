package com.garmin.android.apps.connectmobile.group.service.model;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupAnnouncementDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.e;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s1;
import com.garmin.android.apps.connectmobile.t1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.y;

/* JADX INFO: loaded from: classes8.dex */
@JsonAdapter(Deserializer.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;", "Lcom/garmin/android/apps/connectmobile/t1$a;", "<init>", "()V", "Deserializer", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupDetailsDTO extends GroupDTO implements t1.a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO$Deserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Deserializer implements JsonDeserializer<GroupDetailsDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final GroupDetailsDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            com.nimbusds.jose.shaded.gson.internal.a.p(jsonElement, type, jsonDeserializationContext);
            try {
                GroupDetailsDTO groupDetailsDTO = new GroupDetailsDTO();
                groupDetailsDTO.k(new JSONObject(jsonElement.toString()));
                return groupDetailsDTO;
            } catch (JSONException e4) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.g(a2Var, "GroupDetailsDTO", e4);
                return null;
            }
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.t1.a
    public final boolean b(ArrayList arrayList, ArrayList arrayList2) throws JSONException {
        GroupDTO.e eVarValueOf;
        GroupDTO.d dVarValueOf;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        GroupDTO.c cVarValueOf;
        e eVar;
        JSONObject jSONObject;
        List<String> listAsList;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t1.d dVar = (t1.d) it.next();
            int i14 = 0;
            if (s.g(dVar.f45035a, "Group")) {
                if (!dVar.f45036b) {
                    return false;
                }
                JSONObject jSONObject2 = dVar.f45038c;
                if (jSONObject2 != null) {
                    this.f31558a = s1.u(jSONObject2, TtmlNode.ATTR_ID);
                    this.f31559b = s1.u(jSONObject2, "groupName");
                    this.f31560c = s1.u(jSONObject2, "groupDescription");
                    this.f31561d = s1.u(jSONObject2, "ownerId");
                    this.f31562e = s1.u(jSONObject2, "profileImageId");
                    this.f31563f = s1.u(jSONObject2, "profileImageUploaderUserId");
                    this.f31564g = s1.u(jSONObject2, "profileImageUrlLarge");
                    this.f31565h = s1.u(jSONObject2, "profileImageUrlMedium");
                    this.f31566i = s1.u(jSONObject2, "profileImageUrlSmall");
                    String strU = s1.u(jSONObject2, "groupVisibility");
                    if (TextUtils.isEmpty(strU)) {
                        eVarValueOf = GroupDTO.e.NOT_DEFINED;
                    } else {
                        strU.getClass();
                        eVarValueOf = GroupDTO.e.valueOf(strU);
                    }
                    this.f31567j = eVarValueOf;
                    String strU2 = s1.u(jSONObject2, "groupPrivacy");
                    if (TextUtils.isEmpty(strU2)) {
                        dVarValueOf = GroupDTO.d.NOT_DEFINED;
                    } else {
                        strU2.getClass();
                        dVarValueOf = GroupDTO.d.valueOf(strU2);
                    }
                    this.f31568k = dVarValueOf;
                    this.f31569l = s1.u(jSONObject2, FirebaseAnalytics.Param.LOCATION);
                    this.f31570m = s1.u(jSONObject2, "websiteUrl");
                    this.f31571n = s1.u(jSONObject2, "facebookUrl");
                    this.f31572o = s1.u(jSONObject2, "twitterUrl");
                    this.I = s1.u(jSONObject2, "defaultImageName");
                    List<String> listY = s1.y(jSONObject2, "primaryActivities");
                    if (listY == null || listY.size() <= 0) {
                        arrayList3 = new ArrayList(0);
                    } else {
                        arrayList3 = new ArrayList(listY.size());
                        int size = listY.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            String str = listY.get(i15);
                            e eVar2 = e.ACT_OTHER;
                            if (TextUtils.isEmpty(str) || (eVar = e.f31643n.get(str)) == null) {
                                eVar = e.ACT_NOT_DEFINED;
                            }
                            eVar.getClass();
                            arrayList3.add(eVar);
                        }
                    }
                    this.f31573p = arrayList3;
                    this.f31574q = s1.u(jSONObject2, "otherPrimaryActivity");
                    List<String> listY2 = s1.y(jSONObject2, "leaderboardTypes");
                    listY2.getClass();
                    if (listY2.isEmpty()) {
                        arrayList4 = new ArrayList(0);
                    } else {
                        arrayList4 = new ArrayList();
                        int size2 = listY2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            j10.d.a aVar = j10.d.f96350d;
                            String str2 = listY2.get(i16);
                            aVar.getClass();
                            j10.d dVarA = j10.d.a.a(str2);
                            if (dVarA != null) {
                                arrayList4.add(dVarA);
                            }
                        }
                    }
                    D(arrayList4);
                    List<String> listY3 = s1.y(jSONObject2, "featureTypes");
                    listY3.getClass();
                    if (listY3.isEmpty()) {
                        arrayList5 = new ArrayList(0);
                    } else {
                        arrayList5 = new ArrayList(listY3.size());
                        int size3 = listY3.size();
                        while (i14 < size3) {
                            String str3 = listY3.get(i14);
                            str3.getClass();
                            arrayList5.add(GroupDTO.b.valueOf(str3));
                            i14++;
                        }
                    }
                    this.f31576t = arrayList5;
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("activityFeedTypes");
                    if (jSONArrayOptJSONArray != null) {
                        this.f31577v = com.garmin.android.apps.connectmobile.connections.groups.services.model.a.F(jSONArrayOptJSONArray);
                    }
                    String strU3 = s1.u(jSONObject2, "membershipStatus");
                    if (TextUtils.isEmpty(strU3)) {
                        cVarValueOf = GroupDTO.c.NOT_DEFINED;
                    } else {
                        strU3.getClass();
                        cVarValueOf = GroupDTO.c.valueOf(strU3);
                    }
                    this.f31578w = cVarValueOf;
                }
            } else if (s.g(dVar.f45035a, "GroupAnnouncement")) {
                JSONObject jSONObject3 = dVar.f45038c;
                if (jSONObject3 != null) {
                    GroupAnnouncementDTO groupAnnouncementDTO = new GroupAnnouncementDTO();
                    groupAnnouncementDTO.k(jSONObject3);
                    this.f31579x = groupAnnouncementDTO;
                }
            } else if (s.g(dVar.f45035a, "GroupInfo") && (jSONObject = dVar.f45038c) != null) {
                this.f31580y = jSONObject.optInt("groupMemberCount");
                this.f31581z = jSONObject.optInt("groupMemberConnectionCount");
                ArrayList arrayList6 = null;
                if (jSONObject.isNull("profileImageSmallList")) {
                    listAsList = null;
                } else {
                    JSONArray jSONArray = jSONObject.getJSONArray("profileImageSmallList");
                    String[] strArr = new String[jSONArray.length()];
                    while (i14 < jSONArray.length()) {
                        Object obj = jSONArray.get(i14);
                        strArr[i14] = obj instanceof String ? (String) obj : null;
                        i14++;
                    }
                    listAsList = Arrays.asList(strArr);
                }
                this.A = listAsList;
                ArrayList arrayListS = s1.s(jSONObject, "userProfileIdList");
                if (arrayListS != null) {
                    arrayList6 = new ArrayList(y.r(arrayListS, 10));
                    Iterator it3 = arrayListS.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(String.valueOf((Integer) it3.next()));
                    }
                }
                this.B = arrayList6;
            }
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO, com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        t1.a(new String[]{"Group", "GroupAnnouncement", "GroupInfo"}, null, jSONObject, this);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO$a;", "", "<init>", "()V", "", "GROUP_INFO_PK", "Ljava/lang/String;", "GROUP_ANNOUNCEMENT_PK", "GROUP_PK", "TAG", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package com.garmin.android.apps.connectmobile.group.service.model;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.s1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@JsonAdapter(JoinGroupResponseDeserializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/JoinGroupResponseDTO;", "Lcom/garmin/android/apps/connectmobile/s1;", "<init>", "()V", "JoinGroupResponseDeserializer", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JoinGroupResponseDTO extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroupDTO.c f36394a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/JoinGroupResponseDTO$JoinGroupResponseDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/garmin/android/apps/connectmobile/group/service/model/JoinGroupResponseDTO;", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class JoinGroupResponseDeserializer implements JsonDeserializer<JoinGroupResponseDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final JoinGroupResponseDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                JoinGroupResponseDTO joinGroupResponseDTO = new JoinGroupResponseDTO();
                joinGroupResponseDTO.k(new JSONObject(String.valueOf(jsonElement)));
                return joinGroupResponseDTO;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w13.c f36395a = w13.b.g(GroupDTO.c.values());
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        Object next;
        GroupDTO.c cVar;
        if (jSONObject != null) {
            s1.u(jSONObject, TtmlNode.ATTR_ID);
            s1.u(jSONObject, "groupId");
            s1.u(jSONObject, "userProfileId");
            s1.u(jSONObject, "displayName");
            jSONObject.optLong("joinDate");
            s1.u(jSONObject, FirebaseAnalytics.Param.LOCATION);
            String strU = s1.u(jSONObject, "groupRole");
            if (TextUtils.isEmpty(strU)) {
                cVar = GroupDTO.c.NOT_DEFINED;
            } else {
                w13.c cVar2 = b.f36395a;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
                do {
                    if (!bVarN.hasNext()) {
                        next = null;
                        break;
                    }
                    next = bVarN.next();
                } while (!s.g(((GroupDTO.c) next).name(), strU));
                cVar = (GroupDTO.c) next;
                if (cVar == null) {
                    cVar = GroupDTO.c.NOT_DEFINED;
                }
            }
            this.f36394a = cVar;
            s1.u(jSONObject, "fullName");
            s1.u(jSONObject, "profileImageLarge");
            s1.u(jSONObject, "profileImageMedium");
            s1.u(jSONObject, "profileImageSmall");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/JoinGroupResponseDTO$a;", "", "<init>", "()V", "", "ID_PK", "Ljava/lang/String;", "GROUP_ID_PK", "USER_PROFILE_ID_PK", "DISPLAY_NAME_PK", "LOCATION_PK", "JOIN_DATE_PK", "GROUP_ROLE_PK", "FULL_NAME_PK", "PRIFILE_IMAGE_L_PK", "PROFILE_IMAGE_M_PK", "PROFILE_IMAGE_S_PK", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

package com.garmin.android.apps.connectmobile.social.conversationservice.model;

import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.annotations.JsonAdapter;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@JsonAdapter(ConversationCommentTypeAdapter.class)
public class VivoKidChallengeConversationCommentDTO extends ConversationCommentDTO {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f44563r;

    public static class ConversationCommentTypeAdapter implements JsonDeserializer<VivoKidChallengeConversationCommentDTO>, JsonSerializer<VivoKidChallengeConversationCommentDTO> {
        @Override // com.google.gson.JsonDeserializer
        public final VivoKidChallengeConversationCommentDTO deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            try {
                VivoKidChallengeConversationCommentDTO vivoKidChallengeConversationCommentDTO = new VivoKidChallengeConversationCommentDTO();
                vivoKidChallengeConversationCommentDTO.k(new JSONObject(jsonElement.toString()));
                return vivoKidChallengeConversationCommentDTO;
            } catch (Exception e4) {
                i2.g(e4, "VivoKidChallengeConversationCommentDTO");
                return null;
            }
        }

        @Override // com.google.gson.JsonSerializer
        public final JsonElement serialize(VivoKidChallengeConversationCommentDTO vivoKidChallengeConversationCommentDTO, Type type, JsonSerializationContext jsonSerializationContext) {
            try {
                return JsonParser.parseString(vivoKidChallengeConversationCommentDTO.C());
            } catch (Exception e4) {
                i2.g(e4, "VivoKidChallengeConversationCommentDTO");
                return null;
            }
        }
    }

    public VivoKidChallengeConversationCommentDTO() {
        this.f44559n = null;
    }

    @Override // com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO, com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.k(jSONObject);
            this.f44563r = jSONObject.optInt("avatarId", -1);
        }
    }
}

package com.xiaomi.ai.track;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import org.cybergarage.upnp.UPnP;

/* JADX INFO: loaded from: classes18.dex */
public abstract class a {
    private ObjectNode a;

    public a(com.xiaomi.ai.core.a aVar) {
        a(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a1  */
    private void a(com.xiaomi.ai.core.a aVar) {
        String str;
        AivsConfig aivsConfig = aVar.getAivsConfig();
        ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        this.a = objectNodeCreateObjectNode;
        objectNodeCreateObjectNode.put("app_id", aivsConfig.getString(AivsConfig.Auth.CLIENT_ID));
        if (aVar.getClientInfo().getDeviceId().isPresent()) {
            this.a.put("did", aVar.getClientInfo().getDeviceId().get());
        }
        ObjectNode objectNodeCreateObjectNode2 = APIUtils.getObjectMapper().createObjectNode();
        this.a.set("env", objectNodeCreateObjectNode2);
        objectNodeCreateObjectNode2.put("log.version", UPnP.VERSION);
        int i = aivsConfig.getInt(AivsConfig.ENV);
        if (i == 2) {
            str = "staging";
        } else if (i == 1) {
            str = "preview";
        } else {
            if (i != 0) {
                if (i == 3) {
                    str = "preview4test";
                }
                objectNodeCreateObjectNode2.put("authmode", aVar.getAuthProvider().b());
                objectNodeCreateObjectNode2.put("sdk.type", "java");
                objectNodeCreateObjectNode2.put("sdk.vad.type", aivsConfig.getInt(AivsConfig.Asr.VAD_TYPE));
                if (aVar.getClientInfo().getEngineId().isPresent()) {
                    objectNodeCreateObjectNode2.put("engine.id", aVar.getClientInfo().getEngineId().get());
                }
                this.a.set("data", APIUtils.getObjectMapper().createArrayNode());
            }
            str = "production";
        }
        objectNodeCreateObjectNode2.put("cloud", str);
        objectNodeCreateObjectNode2.put("authmode", aVar.getAuthProvider().b());
        objectNodeCreateObjectNode2.put("sdk.type", "java");
        objectNodeCreateObjectNode2.put("sdk.vad.type", aivsConfig.getInt(AivsConfig.Asr.VAD_TYPE));
        if (aVar.getClientInfo().getEngineId().isPresent()) {
            objectNodeCreateObjectNode2.put("engine.id", aVar.getClientInfo().getEngineId().get());
        }
        this.a.set("data", APIUtils.getObjectMapper().createArrayNode());
    }

    public TrackData a() {
        ArrayNode arrayNodeCreateArrayNode;
        TrackData trackData;
        synchronized (this) {
            if (this.a.path("data").isArray()) {
                arrayNodeCreateArrayNode = (ArrayNode) this.a.path("data");
            } else {
                arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                this.a.set("data", arrayNodeCreateArrayNode);
            }
            trackData = new TrackData(this, true);
            arrayNodeCreateArrayNode.add(trackData.getJsonNode());
        }
        return trackData;
    }

    public void a(TrackData trackData) {
        ArrayNode arrayNodeCreateArrayNode;
        synchronized (this) {
            if (this.a.path("data").isArray()) {
                arrayNodeCreateArrayNode = (ArrayNode) this.a.path("data");
            } else {
                arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                this.a.set("data", arrayNodeCreateArrayNode);
            }
            arrayNodeCreateArrayNode.add(trackData.getJsonNode());
        }
    }

    public void a(String str, int i) {
        synchronized (this) {
            ((ObjectNode) this.a.path("env")).put(str, i);
        }
    }

    public void a(String str, String str2) {
        synchronized (this) {
            ((ObjectNode) this.a.path("env")).put(str, str2);
        }
    }

    public void c() {
        synchronized (this) {
            if (this.a.path("data").isArray()) {
                this.a.remove("data");
            }
        }
    }

    public int d() {
        int size;
        synchronized (this) {
            size = this.a.path("data").isArray() ? this.a.path("data").size() : 0;
        }
        return size;
    }

    public JsonNode e() {
        return this.a;
    }

    public String toString() {
        String jsonString;
        synchronized (this) {
            try {
                try {
                    jsonString = APIUtils.toJsonString(this.a);
                } catch (JsonProcessingException e) {
                    Logger.d("TrackInfo", Logger.throwableToString(e));
                    return super.toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jsonString;
    }
}

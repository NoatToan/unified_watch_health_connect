package com.xiaomi.ai.track;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.log.Logger;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class TrackData {
    private ObjectNode a;
    private a b;
    private boolean c;

    public TrackData(a aVar) {
        this.b = aVar;
        ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        this.a = objectNodeCreateObjectNode;
        objectNodeCreateObjectNode.put("type", "client.perf.log.keep-alive");
    }

    public TrackData(a aVar, boolean z) {
        this.b = aVar;
        ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
        this.a = objectNodeCreateObjectNode;
        objectNodeCreateObjectNode.put("type", "client.perf.log.keep-alive");
        this.c = z;
    }

    public void addConnectProcess(ObjectNode objectNode) {
        ArrayNode arrayNodeCreateArrayNode;
        synchronized (this) {
            if (this.a.path("sdk.connect.process").isArray()) {
                arrayNodeCreateArrayNode = (ArrayNode) this.a.path("sdk.connect.process");
            } else {
                arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                this.a.set("sdk.connect.process", arrayNodeCreateArrayNode);
            }
            arrayNodeCreateArrayNode.add(objectNode);
        }
    }

    public void finishTrack() {
        Logger.b("TrackData", "finishTrack:mFinished=" + this.c);
        synchronized (this) {
            if (!this.c) {
                this.c = true;
                this.b.a(this);
            }
        }
    }

    public JsonNode getJsonNode() {
        return this.a;
    }

    public String getString(String str) {
        synchronized (this) {
            JsonNode jsonNodePath = this.a.path(str);
            if (jsonNodePath == null || !jsonNodePath.isTextual()) {
                return null;
            }
            return jsonNodePath.asText();
        }
    }

    public long getTimestamp(String str) {
        synchronized (this) {
            if (!this.a.path("timestamps").isObject()) {
                return 0L;
            }
            return ((ObjectNode) this.a.path("timestamps")).path(str).asLong(0L);
        }
    }

    public a getTrackInfo() {
        return this.b;
    }

    public boolean isFinished() {
        return this.c;
    }

    public void mergeAppData(ObjectNode objectNode) {
        synchronized (this) {
            if (objectNode.path("timestamps").isObject()) {
                Iterator<Map.Entry<String, JsonNode>> itFields = objectNode.path("timestamps").fields();
                while (itFields.hasNext()) {
                    Map.Entry<String, JsonNode> next = itFields.next();
                    setTimestamp(next.getKey(), next.getValue().asLong());
                }
            }
            if (objectNode.path("result").isObject()) {
                this.a.set("result", objectNode.path("result"));
            }
        }
    }

    public void set(String str, int i) {
        synchronized (this) {
            this.a.put(str, i);
        }
    }

    public void set(String str, String str2) {
        synchronized (this) {
            this.a.put(str, str2);
        }
    }

    public void setTimestamp(String str, long j) {
        ObjectNode objectNodeCreateObjectNode;
        synchronized (this) {
            if (this.a.path("timestamps").isObject()) {
                objectNodeCreateObjectNode = (ObjectNode) this.a.path("timestamps");
            } else {
                objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                this.a.set("timestamps", objectNodeCreateObjectNode);
            }
            objectNodeCreateObjectNode.put(str, j);
        }
    }

    public String toString() {
        String string;
        synchronized (this) {
            string = this.b.toString();
        }
        return string;
    }
}

package com.xiaomi.ai.android.capability;

import android.util.Log;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.core.d;
import com.xiaomi.ai.android.core.j;
import com.xiaomi.ai.android.utils.a;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public abstract class TrackCapability implements Capability {
    public d a;
    public volatile boolean b = false;
    private String c;
    private boolean d;

    public TrackCapability(Engine engine) {
        this.d = false;
        d dVar = (d) engine;
        this.a = dVar;
        int i = dVar.b().getInt(AivsConfig.ENV);
        this.c = i == 2 ? "staging" : i == 1 ? "preview" : "production";
        this.d = this.a.b().getBoolean(AivsConfig.LimitedDiskCache.ENABLE);
    }

    private ArrayNode a(String str) {
        ArrayNode arrayNodeCreateArrayNode;
        synchronized (j.class) {
            arrayNodeCreateArrayNode = null;
            String strB = b(str);
            if (f.a(strB)) {
                removeKeyValue(str);
            } else {
                try {
                    arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                    ArrayNode arrayNode = (ArrayNode) APIUtils.getObjectMapper().readTree(strB);
                    if (arrayNode != null && arrayNode.size() > 0) {
                        Iterator<JsonNode> it2 = arrayNode.iterator();
                        while (it2.hasNext()) {
                            arrayNodeCreateArrayNode.addAll((ArrayNode) APIUtils.getObjectMapper().readTree(it2.next().asText()));
                        }
                    }
                    Logger.b("TrackCapability", "readLocal  key:" + str + " ,size = " + arrayNodeCreateArrayNode.size());
                } catch (IOException e) {
                    Logger.d("TrackCapability", Log.getStackTraceString(e));
                }
                removeKeyValue(str);
            }
            throw th;
        }
        return arrayNodeCreateArrayNode;
    }

    private void a(String str, String str2) {
        com.xiaomi.ai.android.track.f.a().a(this.a.a(), "aivs_track", this.c + str, str2, this.d);
    }

    private boolean a(String str, String str2, ArrayNode arrayNode) {
        synchronized (j.class) {
            if (f.a(str)) {
                Logger.b("TrackCapability", "saveTrackData :empty key");
                return false;
            }
            if (f.a(str2) && (arrayNode == null || arrayNode.size() == 0)) {
                Logger.b("TrackCapability", "saveTrackData :empty");
                return false;
            }
            ArrayNode arrayNodeCreateArrayNode = null;
            String strB = b(str);
            if (!f.a(strB)) {
                try {
                    arrayNodeCreateArrayNode = (ArrayNode) APIUtils.getObjectMapper().readTree(strB);
                } catch (IOException e) {
                    removeKeyValue(str);
                    Logger.d("TrackCapability", Log.getStackTraceString(e));
                }
            }
            if (arrayNodeCreateArrayNode == null) {
                arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
            }
            if (!f.a(str2)) {
                arrayNodeCreateArrayNode.add(str2);
            }
            if (arrayNode != null && arrayNode.size() > 0) {
                arrayNodeCreateArrayNode.addAll(arrayNode);
            }
            long j = this.a.b().getLong(AivsConfig.Track.MAX_LOCAL_TRACK_LENGTH);
            Logger.a("TrackCapability", "saveTrackData " + str + " maxLocalTackLength: " + j);
            if (a.a(arrayNodeCreateArrayNode) > j) {
                Logger.c("TrackCapability", str + ",save error: cache full !!! ");
                return false;
            }
            a(str, arrayNodeCreateArrayNode.toString());
            Logger.a("TrackCapability", str + ",save success: array:" + arrayNodeCreateArrayNode);
            return true;
        }
    }

    private String b(String str) {
        return com.xiaomi.ai.android.track.f.a().a(this.a.a(), "aivs_track", this.c + str, this.d);
    }

    public abstract boolean onEventTrack(String str);

    public ArrayNode readLocalCache() {
        return a("track_cached_info");
    }

    public ArrayNode readLocalFailData() {
        ArrayNode arrayNodeA = a("track_failed_info");
        this.b = false;
        return arrayNodeA;
    }

    public void removeKeyValue(String str) {
        com.xiaomi.ai.android.track.f.a().b(this.a.a(), "aivs_track", this.c + str, this.d);
    }

    public void saveFailData(String str) {
        if (a("track_failed_info", str, null)) {
            this.b = true;
        }
    }

    public boolean saveTrackData(ArrayNode arrayNode) {
        return a("track_cached_info", null, arrayNode);
    }
}

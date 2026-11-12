package com.xiaomi.ai.android.track;

import android.text.TextUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment;
import com.xiaomi.ai.android.capability.TrackCapability;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class d extends b {
    private com.xiaomi.ai.track.a e;
    private final ArrayNode f;
    private com.xiaomi.ai.android.core.d g;
    private int h;

    public d(com.xiaomi.ai.android.core.d dVar, com.xiaomi.ai.track.a aVar, b.c cVar) {
        super(dVar.b().getInt(AivsConfig.Track.CACHE_PERIOD_CHECK_INTERVAL, 10), dVar.b().getInt(AivsConfig.Track.DISK_PERIOD_CHECK_INTERVAL, SleepDetailFragment.START_VALID_INTO_TIME), true, cVar);
        this.g = dVar;
        this.e = aVar;
        this.f = APIUtils.getObjectMapper().createArrayNode();
        this.h = dVar.b().getInt(AivsConfig.Track.MAX_TRACK_DATA_SIZE);
    }

    private Boolean a(JsonNode jsonNode) {
        if (jsonNode == null || TextUtils.isEmpty(jsonNode.textValue())) {
            return Boolean.TRUE;
        }
        Logger.b("InternalTrackStrategy", "sendTrackInfo: ");
        TrackCapability trackCapability = (TrackCapability) this.g.a(TrackCapability.class);
        if (trackCapability != null) {
            return Boolean.valueOf(trackCapability.onEventTrack(jsonNode.textValue()));
        }
        Logger.d("InternalTrackStrategy", "TrackCapability was not registered");
        return Boolean.FALSE;
    }

    private ArrayNode h() {
        ArrayNode arrayNodeCreateArrayNode;
        String string;
        synchronized (this.f) {
            if (this.e.d() > 0) {
                this.f.add(this.e.e().deepCopy());
                this.e.c();
            }
            arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
            if (this.f.size() > this.h) {
                ArrayNode arrayNodeCreateArrayNode2 = APIUtils.getObjectMapper().createArrayNode();
                Iterator<JsonNode> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    arrayNodeCreateArrayNode2.add(it2.next());
                    if (arrayNodeCreateArrayNode2.size() == this.h) {
                        arrayNodeCreateArrayNode.add(arrayNodeCreateArrayNode2.toString());
                        arrayNodeCreateArrayNode2.removeAll();
                    }
                }
                if (arrayNodeCreateArrayNode2.size() > 0) {
                    string = arrayNodeCreateArrayNode2.toString();
                }
                this.f.removeAll();
            } else {
                string = this.f.toString();
            }
            arrayNodeCreateArrayNode.add(string);
            this.f.removeAll();
        }
        return arrayNodeCreateArrayNode;
    }

    private int i() {
        if (this.e.d() >= this.g.b().getInt(AivsConfig.Track.MAX_TRACK_INTERNAL_DATA_SIZE)) {
            this.f.add(this.e.e().deepCopy());
            this.e.c();
        }
        return this.f.size();
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean b() {
        return i() < this.h;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean c() {
        ArrayNode arrayNodeH = h();
        if (arrayNodeH == null || arrayNodeH.size() == 0) {
            return true;
        }
        while (true) {
            boolean z = true;
            for (JsonNode jsonNode : arrayNodeH) {
                if (!z || !a(jsonNode).booleanValue()) {
                    z = false;
                }
            }
            return false;
        }
    }

    @Override // com.xiaomi.ai.android.track.b
    public void d() {
        Logger.a("InternalTrackStrategy", "readLocalCache");
        TrackCapability trackCapability = (TrackCapability) this.g.a(TrackCapability.class);
        if (trackCapability == null) {
            Logger.b("InternalTrackStrategy", "readLocalCache error:empty TrackCapability ");
            throw new IllegalArgumentException("readLocalCache error: TrackCapability was not registered");
        }
        ArrayNode localCache = trackCapability.readLocalCache();
        if (localCache == null || localCache.size() <= 0) {
            return;
        }
        this.f.addAll(localCache);
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean e() {
        TrackCapability trackCapability = (TrackCapability) this.g.a(TrackCapability.class);
        if (trackCapability == null) {
            throw new IllegalArgumentException("readLocalTrackData error:TrackCapability null");
        }
        ArrayNode localFailData = trackCapability.readLocalFailData();
        if (localFailData == null || localFailData.size() <= 0) {
            return false;
        }
        this.f.addAll(localFailData);
        return true;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean f() {
        int iD = this.e.d();
        int size = this.f.size();
        Logger.a("InternalTrackStrategy", "isTrackDataEmpty ,bufferedTrackDataNum=" + iD + ",bufferedTrackInfoNum=" + size);
        return iD == 0 && size == 0;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean g() {
        ArrayNode arrayNodeH = h();
        TrackCapability trackCapability = (TrackCapability) this.g.a(TrackCapability.class);
        if (trackCapability != null) {
            return trackCapability.saveTrackData(arrayNodeH);
        }
        return false;
    }
}

package com.xiaomi.ai.android.track;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huami.sleep.daysleep.daydetail.ui.SleepDetailFragment;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
public class i extends b {
    public volatile boolean e;
    private final g f;
    private final ArrayNode g;
    private h h;
    private Context i;
    private final long j;
    private final int k;
    private final String l;
    private final String m;
    private final String n;
    private j o;
    private boolean p;
    private Runnable q;

    public i(com.xiaomi.ai.android.core.d dVar) {
        super(dVar.b().getInt(AivsConfig.InternalLogUpload.CACHE_PERIOD_CHECK_INTERVAL, 10), dVar.b().getInt(AivsConfig.InternalLogUpload.DISK_PERIOD_CHECK_INTERVAL, SleepDetailFragment.START_VALID_INTO_TIME), false, null);
        this.e = false;
        this.p = false;
        this.q = new Runnable() { // from class: com.xiaomi.ai.android.track.i.1
            @Override // java.lang.Runnable
            public void run() {
                i.this.h.a();
                i.this.o.a();
                i.this.a();
            }
        };
        this.p = dVar.b().getBoolean(AivsConfig.LimitedDiskCache.ENABLE);
        this.j = dVar.b().getLong(AivsConfig.InternalLogUpload.MAX_LOCAL_TRACK_LENGTH, 2097152L);
        int i = dVar.b().getInt(AivsConfig.InternalLogUpload.MAX_TRACK_DATA_SIZE, 1000);
        this.k = i;
        this.i = dVar.a().getApplicationContext();
        this.h = new h(dVar, this);
        this.g = APIUtils.getObjectMapper().createArrayNode();
        this.f = new g(i);
        this.l = dVar.b().getString("user_id");
        this.m = dVar.m().getDeviceId().isPresent() ? dVar.m().getDeviceId().get() : null;
        this.n = dVar.b().getString(AivsConfig.Auth.CLIENT_ID);
        this.o = new j(this.i, dVar.b().getInt(AivsConfig.InternalLogUpload.MAX_ENTRANCE_TRACK_TIMES), "aivs_log_upload_info", "log_upload_entrance_track_times");
        com.xiaomi.ai.b.c.b.execute(this.q);
    }

    private synchronized ArrayNode a(Context context, String str) {
        IOException e;
        ArrayNode arrayNode;
        ArrayNode arrayNode2 = null;
        try {
            if (context == null) {
                Logger.c("LogUploadStrategy", "readLocal error : empty context", this.d);
                return null;
            }
            if (TextUtils.isEmpty(str)) {
                Logger.c("LogUploadStrategy", "readLocal error : empty key", this.d);
                return null;
            }
            String strB = b(str);
            if (TextUtils.isEmpty(strB)) {
                Logger.a("LogUploadStrategy", "readLocal  key:" + str + " :null", this.d);
            } else {
                try {
                    arrayNode = (ArrayNode) APIUtils.getObjectMapper().readTree(strB);
                    try {
                        Logger.a("LogUploadStrategy", "readLocal  key:" + str + " ,size = " + arrayNode.size(), this.d);
                    } catch (IOException e2) {
                        e = e2;
                        Logger.c("LogUploadStrategy", Log.getStackTraceString(e), this.d);
                    }
                } catch (IOException e3) {
                    e = e3;
                    arrayNode = null;
                }
                arrayNode2 = arrayNode;
            }
            c(str);
            return arrayNode2;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(ArrayNode arrayNode) {
        synchronized (this.g) {
            this.g.addAll(arrayNode);
        }
    }

    private void a(String str, String str2) {
        f.a().a(this.i, "aivs_log_upload_info", str, str2, this.p);
    }

    private synchronized boolean a(Context context, String str, JsonNode jsonNode, ArrayNode arrayNode) {
        if (TextUtils.isEmpty(str)) {
            Logger.b("LogUploadStrategy", "saveTrackData :empty key", this.d);
            return false;
        }
        if (context == null) {
            Logger.b("LogUploadStrategy", "saveTrackData :empty mContext", this.d);
            return false;
        }
        if ((jsonNode != null && !jsonNode.isNull()) || (arrayNode != null && arrayNode.size() != 0)) {
            String strB = b(str);
            ArrayNode arrayNodeCreateArrayNode = null;
            if (!TextUtils.isEmpty(strB)) {
                try {
                    arrayNodeCreateArrayNode = (ArrayNode) APIUtils.getObjectMapper().readTree(strB);
                } catch (IOException e) {
                    c(str);
                    Logger.c("LogUploadStrategy", Log.getStackTraceString(e), this.d);
                }
            }
            if (arrayNodeCreateArrayNode == null) {
                arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
            }
            if (jsonNode != null && !jsonNode.isNull()) {
                arrayNodeCreateArrayNode.add(jsonNode);
            }
            if (arrayNode != null && arrayNode.size() > 0) {
                arrayNodeCreateArrayNode.addAll(arrayNode);
            }
            Logger.a("LogUploadStrategy", "saveTrackData: " + str + " mMaxLocalTackLength: " + this.j);
            if (com.xiaomi.ai.android.utils.a.a(arrayNodeCreateArrayNode) > this.j) {
                Logger.c("LogUploadStrategy", str + ",save error: cache full !!! ");
                return false;
            }
            a(str, arrayNodeCreateArrayNode.toString());
            Logger.a("LogUploadStrategy", str + ",save: success  array:" + arrayNodeCreateArrayNode);
            return true;
        }
        Logger.b("LogUploadStrategy", "saveTrackData :empty", this.d);
        return false;
    }

    private String b(String str) {
        return f.a().a(this.i, "aivs_log_upload_info", str, this.p);
    }

    private void c(String str) {
        f.a().b(this.i, "aivs_log_upload_info", str, this.p);
    }

    public boolean a(JsonNode jsonNode) {
        if (!a(this.i, "track_failed_info", jsonNode, null)) {
            return false;
        }
        this.e = true;
        return true;
    }

    public boolean a(String str) {
        if (this.o.c()) {
            Logger.a("LogUploadStrategy", "add log: error, track times limit !", this.d);
            return false;
        }
        this.f.a(str);
        return true;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean b() {
        return this.f.a() < this.k;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean c() {
        boolean zA;
        ArrayNode arrayNodeDeepCopy;
        this.o.b();
        ObjectNode objectNodeC = this.f.c();
        if (objectNodeC == null) {
            zA = true;
        } else {
            String str = this.l;
            if (str == null) {
                str = "unknown";
            }
            objectNodeC.put("uid", str);
            String str2 = this.m;
            if (str2 == null) {
                str2 = "unknown";
            }
            objectNodeC.put("did", str2);
            String str3 = this.n;
            if (str3 == null) {
                str3 = "unknown";
            }
            objectNodeC.put("appId", str3);
            zA = this.h.a(objectNodeC);
        }
        synchronized (this.g) {
            arrayNodeDeepCopy = this.g.deepCopy();
            this.g.removeAll();
        }
        Iterator<JsonNode> it2 = arrayNodeDeepCopy.iterator();
        while (it2.hasNext()) {
            zA = zA && this.h.a(it2.next());
        }
        return zA;
    }

    @Override // com.xiaomi.ai.android.track.b
    public void d() {
        this.f.a(a(this.i, "track_cached_info"));
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean e() {
        if (this.o.c()) {
            Logger.a("LogUploadStrategy", "readFailedData: reach max track times!", this.d);
            return false;
        }
        this.e = false;
        ArrayNode arrayNodeA = a(this.i, "track_failed_info");
        if (arrayNodeA == null || arrayNodeA.size() <= 0) {
            return false;
        }
        a(arrayNodeA);
        return true;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean f() {
        int size;
        synchronized (this.g) {
            size = this.g.size();
        }
        return this.f.a() == 0 && size == 0;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean g() {
        return a(this.i, "track_cached_info", null, this.f.b());
    }
}

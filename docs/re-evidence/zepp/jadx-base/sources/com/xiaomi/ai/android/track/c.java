package com.xiaomi.ai.android.track;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes18.dex */
public class c extends b {
    private int e;
    private Context f;
    private AivsConfig g;
    private String h;
    private String i;
    private final ArrayNode j;
    private OkHttpClient k;
    private int l;
    private volatile boolean m;
    private boolean n;

    public c(Context context, String str, AivsConfig aivsConfig, b.c cVar) {
        super(aivsConfig.getInt(AivsConfig.GeneralTrack.CACHE_PERIOD_CHECK_INTERVAL, 10), aivsConfig.getInt(AivsConfig.GeneralTrack.DISK_PERIOD_CHECK_INTERVAL, 300), true, cVar);
        this.m = false;
        this.n = false;
        this.f = context;
        this.h = str;
        this.g = aivsConfig;
        this.j = APIUtils.getObjectMapper().createArrayNode();
        this.e = this.g.getInt(AivsConfig.GeneralTrack.MAX_TRACK_DATA_SIZE);
        if (TextUtils.isEmpty(this.h)) {
            Logger.d("GeneralTrackStrategy", "TrackHelper:authorization is empty");
        }
        this.i = new com.xiaomi.ai.core.c(this.g).i();
        Logger.b("GeneralTrackStrategy", "mTrackUrl:" + this.i);
        this.k = new OkHttpClient.Builder().addInterceptor(new com.xiaomi.ai.transport.a()).connectTimeout((long) this.g.getInt(AivsConfig.Connection.CONNECT_TIMEOUT), TimeUnit.SECONDS).build();
        this.n = aivsConfig.getBoolean(AivsConfig.LimitedDiskCache.ENABLE);
        k();
    }

    private synchronized ArrayNode a(Context context, String str) {
        ArrayNode arrayNodeCreateArrayNode = null;
        if (context == null) {
            Logger.d("GeneralTrackStrategy", "readLocal error : empty context");
            return null;
        }
        if (com.xiaomi.ai.b.f.a(str)) {
            Logger.d("GeneralTrackStrategy", "readLocal error : empty key");
            return null;
        }
        String strC = c(str);
        if (com.xiaomi.ai.b.f.a(strC)) {
            Logger.b("GeneralTrackStrategy", "readLocal  key:" + str + " :null");
        } else {
            try {
                arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
                ArrayNode arrayNode = (ArrayNode) APIUtils.getObjectMapper().readTree(strC);
                if (arrayNode != null && arrayNode.size() > 0) {
                    Iterator<JsonNode> it2 = arrayNode.iterator();
                    while (it2.hasNext()) {
                        arrayNodeCreateArrayNode.addAll((ArrayNode) APIUtils.getObjectMapper().readTree(it2.next().asText()));
                    }
                }
                Logger.a("GeneralTrackStrategy", "readLocal  key:" + str + " ,size = " + arrayNodeCreateArrayNode.size());
            } catch (IOException e) {
                Logger.d("GeneralTrackStrategy", Log.getStackTraceString(e));
            }
        }
        d(str);
        return arrayNodeCreateArrayNode;
    }

    private void a(ArrayNode arrayNode) {
        synchronized (this.j) {
            this.j.addAll(arrayNode);
        }
    }

    private void a(String str, String str2) {
        f.a().a(this.f, "aivs_track", str, str2, this.n);
    }

    private synchronized boolean a(Context context, String str, String str2, ArrayNode arrayNode) {
        if (com.xiaomi.ai.b.f.a(str)) {
            Logger.c("GeneralTrackStrategy", "saveTrackData :empty key");
            return false;
        }
        if (context == null) {
            Logger.c("GeneralTrackStrategy", "saveTrackData :empty mContext");
            return false;
        }
        if (com.xiaomi.ai.b.f.a(str2) && (arrayNode == null || arrayNode.size() == 0)) {
            Logger.c("GeneralTrackStrategy", "saveTrackData :empty");
            return false;
        }
        String strC = c(str);
        ArrayNode arrayNodeCreateArrayNode = null;
        if (!com.xiaomi.ai.b.f.a(strC)) {
            try {
                arrayNodeCreateArrayNode = (ArrayNode) APIUtils.getObjectMapper().readTree(strC);
            } catch (IOException e) {
                d(str);
                Logger.d("GeneralTrackStrategy", Log.getStackTraceString(e));
            }
        }
        if (arrayNodeCreateArrayNode == null) {
            arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
        }
        if (!com.xiaomi.ai.b.f.a(str2)) {
            arrayNodeCreateArrayNode.add(str2);
        }
        if (arrayNode != null && arrayNode.size() > 0) {
            arrayNodeCreateArrayNode.addAll(arrayNode);
        }
        long j = this.g.getLong(AivsConfig.GeneralTrack.MAX_LOCAL_TRACK_LENGTH);
        Logger.a("GeneralTrackStrategy", "saveTrackData: " + str + " maxLocalTackLength: " + j);
        if (com.xiaomi.ai.android.utils.a.a(arrayNodeCreateArrayNode) > j) {
            Logger.c("GeneralTrackStrategy", str + ",save error: cache full !!! ");
            return false;
        }
        a(str, arrayNodeCreateArrayNode.toString());
        Logger.a("GeneralTrackStrategy", str + ",save: success  array:" + arrayNodeCreateArrayNode);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        a(this.f, "track_failed_info", str, null);
        this.m = true;
    }

    private boolean b(JsonNode jsonNode) {
        int i = this.g.getInt(AivsConfig.GeneralTrack.MAX_TRACK_TIMES);
        if (NetworkUtils.b(this.f) == Network.NetworkType.DATA && this.l > i) {
            Logger.c("GeneralTrackStrategy", "postTrackData: reach max track time " + i + " in 4g");
            return false;
        }
        final String strTextValue = jsonNode.textValue();
        if (!NetworkUtils.a(this.f)) {
            Logger.d("GeneralTrackStrategy", "postTrackData:network is not available");
            b(strTextValue);
            return true;
        }
        Logger.a("GeneralTrackStrategy", "postTrackData:" + strTextValue);
        if (TextUtils.isEmpty(this.h)) {
            Logger.d("GeneralTrackStrategy", "postTrackData: mAuthorization is empty");
            b(strTextValue);
            return false;
        }
        FirebasePerfOkHttpClient.enqueue(this.k.newCall(new Request.Builder().url(this.i).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), strTextValue)).addHeader("Authorization", this.h).build()), new Callback() { // from class: com.xiaomi.ai.android.track.c.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                Logger.a("GeneralTrackStrategy", "postTrackData: onFailure " + strTextValue);
                if (iOException != null) {
                    Logger.d("GeneralTrackStrategy", Log.getStackTraceString(iOException));
                }
                c.this.b(strTextValue);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                if (response == null) {
                    Logger.c("GeneralTrackStrategy", "postTrackData: failed");
                    return;
                }
                if (response.isSuccessful()) {
                    try {
                        Logger.b("GeneralTrackStrategy", "postTrackData: success");
                        if (c.this.m) {
                            c.this.a();
                        }
                    } catch (Exception e) {
                        Logger.d("GeneralTrackStrategy", Log.getStackTraceString(e));
                    }
                    if (NetworkUtils.b(c.this.f) == Network.NetworkType.DATA) {
                        c.this.l();
                    } else {
                        Logger.a("GeneralTrackStrategy", "postTrackData: not using 4g");
                    }
                } else {
                    Logger.d("GeneralTrackStrategy", "postTrackData: failed, code=" + response.code() + ", msg:" + response.toString());
                    if (response.code() == 401) {
                        c cVar = c.this;
                        b.c cVar2 = cVar.c;
                        if (cVar2 != null) {
                            cVar2.a(new AivsError(401, "authorization fail"));
                        } else {
                            cVar.b(strTextValue);
                        }
                    }
                }
                try {
                    response.close();
                } catch (Exception e2) {
                    Logger.d("GeneralTrackStrategy", Log.getStackTraceString(e2));
                }
            }
        });
        return true;
    }

    private String c(String str) {
        return f.a().a(this.f, "aivs_track", str, this.n);
    }

    private void d(String str) {
        f.a().b(this.f, "aivs_track", str, this.n);
    }

    private int j() {
        int size;
        synchronized (this.j) {
            size = this.j.size();
        }
        return size;
    }

    private synchronized void k() {
        ObjectNode objectNode;
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        String strC = c("track_times");
        Logger.a("GeneralTrackStrategy", "trackRecord:" + strC);
        try {
            if (!TextUtils.isEmpty(strC) && (objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(strC)) != null) {
                JsonNode jsonNodePath = objectNode.path(str);
                if (jsonNodePath != null && jsonNodePath.isNumber()) {
                    this.l = jsonNodePath.asInt();
                    Logger.b("GeneralTrackStrategy", "load track times:" + this.l + " at " + str);
                    return;
                }
                d("track_times");
            }
        } catch (IOException e) {
            Logger.d("GeneralTrackStrategy", Log.getStackTraceString(e));
        }
        this.l = 0;
        Logger.b("GeneralTrackStrategy", "no track times recorded : at " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        this.l++;
        ObjectNode objectNodeCreateObjectNode = new ObjectMapper().createObjectNode();
        objectNodeCreateObjectNode.put(str, this.l);
        a("track_times", objectNodeCreateObjectNode.toString());
        Logger.b("GeneralTrackStrategy", "addTrackTimes:" + this.l + " at " + str);
    }

    public void a(JsonNode jsonNode) {
        synchronized (this.j) {
            this.j.add(jsonNode);
        }
    }

    public void a(String str) {
        this.h = str;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean b() {
        return j() < this.e;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean c() {
        Iterator<JsonNode> it2 = h().iterator();
        while (true) {
            boolean z = true;
            while (it2.hasNext()) {
                boolean zB = b(it2.next());
                if (!z || !zB) {
                    z = false;
                }
            }
            return z;
        }
    }

    @Override // com.xiaomi.ai.android.track.b
    public void d() {
        ArrayNode arrayNodeA = a(this.f, "track_cached_info");
        if (arrayNodeA == null || arrayNodeA.size() <= 0) {
            return;
        }
        a(arrayNodeA);
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean e() {
        this.m = false;
        ArrayNode arrayNodeA = a(this.f, "track_failed_info");
        if (arrayNodeA == null || arrayNodeA.size() <= 0) {
            return false;
        }
        a(arrayNodeA);
        return true;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean f() {
        boolean z;
        synchronized (this.j) {
            z = this.j.size() == 0;
        }
        return z;
    }

    @Override // com.xiaomi.ai.android.track.b
    public boolean g() {
        return a(this.f, "track_cached_info", null, h());
    }

    public ArrayNode h() {
        ArrayNode arrayNodeCreateArrayNode;
        String string;
        synchronized (this.j) {
            arrayNodeCreateArrayNode = APIUtils.getObjectMapper().createArrayNode();
            if (this.j.size() > this.e) {
                ArrayNode arrayNodeCreateArrayNode2 = APIUtils.getObjectMapper().createArrayNode();
                Iterator<JsonNode> it2 = this.j.iterator();
                while (it2.hasNext()) {
                    arrayNodeCreateArrayNode2.add(it2.next());
                    if (arrayNodeCreateArrayNode2.size() == this.e) {
                        arrayNodeCreateArrayNode.add(arrayNodeCreateArrayNode2.toString());
                        arrayNodeCreateArrayNode2.removeAll();
                    }
                }
                if (arrayNodeCreateArrayNode2.size() > 0) {
                    string = arrayNodeCreateArrayNode2.toString();
                }
                this.j.removeAll();
            } else {
                string = this.j.toString();
            }
            arrayNodeCreateArrayNode.add(string);
            this.j.removeAll();
        }
        return arrayNodeCreateArrayNode;
    }

    public synchronized void i() {
        f.a().a(this.f, "aivs_track", this.n);
    }
}

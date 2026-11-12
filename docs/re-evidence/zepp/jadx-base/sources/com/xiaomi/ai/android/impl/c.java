package com.xiaomi.ai.android.impl;

import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.xiaomi.ai.android.capability.StorageCapability;
import com.xiaomi.ai.android.capability.TrackCapability;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.log.Logger;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
public class c extends TrackCapability {
    private int c;
    private OkHttpClient d;

    public c(Engine engine) {
        super(engine);
        this.d = new OkHttpClient.Builder().addInterceptor(new com.xiaomi.ai.transport.a()).connectTimeout(this.a.b().getInt(AivsConfig.Connection.CONNECT_TIMEOUT), TimeUnit.SECONDS).build();
        a();
    }

    private void a() {
        ObjectNode objectNode;
        StorageCapability storageCapability = (StorageCapability) this.a.a(StorageCapability.class);
        if (storageCapability == null) {
            Logger.d("TrackCapabilityImpl", "loadTrackTimes: StorageCapability not register");
            return;
        }
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        String keyValue = storageCapability.readKeyValue("track_times");
        try {
            if (!TextUtils.isEmpty(keyValue) && (objectNode = (ObjectNode) APIUtils.getObjectMapper().readTree(keyValue)) != null) {
                JsonNode jsonNodePath = objectNode.path(str);
                if (jsonNodePath != null && jsonNodePath.isNumber()) {
                    this.c = jsonNodePath.asInt();
                    Logger.a("TrackCapabilityImpl", "load track times:" + this.c + " at " + str);
                    return;
                }
                storageCapability.removeKeyValue("track_times");
            }
        } catch (IOException e) {
            Logger.d("TrackCapabilityImpl", Log.getStackTraceString(e));
        }
        this.c = 0;
        Logger.a("TrackCapabilityImpl", "no track times recorded : at " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        StorageCapability storageCapability = (StorageCapability) this.a.a(StorageCapability.class);
        if (storageCapability == null) {
            Logger.d("TrackCapabilityImpl", "addTrackTimes: StorageCapability not register");
            return;
        }
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        this.c++;
        ObjectNode objectNodeCreateObjectNode = new ObjectMapper().createObjectNode();
        objectNodeCreateObjectNode.put(str, this.c);
        storageCapability.writeKeyValue("track_times", objectNodeCreateObjectNode.toString());
        Logger.a("TrackCapabilityImpl", "addTrackTimes:" + this.c + " at " + str);
    }

    @Override // com.xiaomi.ai.android.capability.TrackCapability
    public boolean onEventTrack(final String str) {
        if (NetworkUtils.b(this.a.a()) == Network.NetworkType.DATA && this.c > this.a.b().getInt(AivsConfig.Track.MAX_TRACK_TIMES)) {
            Logger.b("TrackCapabilityImpl", "onEventTrack: reach max track time " + this.a.b().getInt(AivsConfig.Track.MAX_TRACK_TIMES) + " in 4g");
            return false;
        }
        if (!NetworkUtils.a(this.a.a())) {
            Logger.d("TrackCapabilityImpl", "onEventTrack:network is not available");
            saveFailData(str);
            return true;
        }
        Logger.a("TrackCapabilityImpl", "onEventTrack:" + str);
        FirebasePerfOkHttpClient.enqueue(this.d.newCall(new Request.Builder().url(new com.xiaomi.ai.core.c(this.a.b()).h()).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str)).build()), new Callback() { // from class: com.xiaomi.ai.android.impl.c.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                Logger.d("TrackCapabilityImpl", "onEventTrack: onFailure");
                if (iOException != null) {
                    Logger.d("TrackCapabilityImpl", Log.getStackTraceString(iOException));
                }
                c.this.saveFailData(str);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                if (response == null || !response.isSuccessful()) {
                    Logger.d("TrackCapabilityImpl", "onEventTrack: onResponse " + response + ", " + str);
                    c.this.saveFailData(str);
                } else {
                    Logger.b("TrackCapabilityImpl", "onEventTrack: success");
                    if (NetworkUtils.b(c.this.a.a()) == Network.NetworkType.DATA) {
                        c.this.b();
                    } else {
                        Logger.a("TrackCapabilityImpl", "onEventTrack: not using 4g");
                    }
                    if (c.this.b) {
                        c.this.a.j().a();
                    }
                }
                if (response != null) {
                    try {
                        response.close();
                    } catch (Exception e) {
                        Logger.d("TrackCapabilityImpl", Log.getStackTraceString(e));
                    }
                }
            }
        });
        return true;
    }
}

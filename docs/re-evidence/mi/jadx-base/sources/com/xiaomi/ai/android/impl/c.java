package com.xiaomi.ai.android.impl;

import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaomi.ai.android.capability.StorageCapability;
import com.xiaomi.ai.android.capability.TrackCapability;
import com.xiaomi.ai.android.core.Engine;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.common.APIUtils;
import defpackage.c4h;
import defpackage.d2s;
import defpackage.d3s;
import defpackage.wpe;
import defpackage.zsd;
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

/* JADX INFO: loaded from: classes6.dex */
public class c extends TrackCapability {
    private int e;
    private final OkHttpClient f;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f10965a;

        public a(String str) {
            this.f10965a = str;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            wpe.e("TrackCapabilityImpl", "onEventTrack: onFailure");
            if (iOException != null) {
                wpe.e("TrackCapabilityImpl", Log.getStackTraceString(iOException));
            }
            c.this.saveFailData(this.f10965a);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response == null || !response.isSuccessful()) {
                wpe.e("TrackCapabilityImpl", "onEventTrack: onResponse " + response + ", " + this.f10965a);
                c.this.saveFailData(this.f10965a);
            } else {
                wpe.h("TrackCapabilityImpl", "onEventTrack: success");
                if (NetworkUtils.getBriefNetworkType(((TrackCapability) c.this).f10870a.j()) == Network.NetworkType.DATA) {
                    c.this.a();
                } else {
                    wpe.b("TrackCapabilityImpl", "onEventTrack: not using 4g");
                }
                if (((TrackCapability) c.this).d) {
                    ((TrackCapability) c.this).f10870a.r().e();
                }
            }
            if (response != null) {
                try {
                    response.close();
                } catch (Exception e) {
                    wpe.e("TrackCapabilityImpl", Log.getStackTraceString(e));
                }
            }
        }
    }

    public c(Engine engine) {
        super(engine);
        this.f = new OkHttpClient.Builder().addInterceptor(new d2s()).connectTimeout(this.f10870a.i().e("connection.connect_timeout"), TimeUnit.SECONDS).build();
        b();
    }

    private void b() {
        c4h c4hVar;
        StorageCapability storageCapability = (StorageCapability) this.f10870a.a(StorageCapability.class);
        if (storageCapability == null) {
            wpe.e("TrackCapabilityImpl", "loadTrackTimes: StorageCapability not register");
            return;
        }
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        String keyValue = storageCapability.readKeyValue("track_times");
        try {
            if (!TextUtils.isEmpty(keyValue) && (c4hVar = (c4h) APIUtils.getObjectMapper().readTree(keyValue)) != null) {
                zsd zsdVarT = c4hVar.T(str);
                if (zsdVarT != null && zsdVarT.G()) {
                    this.e = zsdVarT.h();
                    wpe.b("TrackCapabilityImpl", "load track times:" + this.e + " at " + str);
                    return;
                }
                storageCapability.removeKeyValue("track_times");
            }
        } catch (IOException e) {
            wpe.e("TrackCapabilityImpl", Log.getStackTraceString(e));
        }
        this.e = 0;
        wpe.b("TrackCapabilityImpl", "no track times recorded : at " + str);
    }

    @Override // com.xiaomi.ai.android.capability.TrackCapability
    public boolean onEventTrack(String str) {
        if (NetworkUtils.getBriefNetworkType(this.f10870a.j()) == Network.NetworkType.DATA && this.e > this.f10870a.i().e("track.max_track_times")) {
            wpe.h("TrackCapabilityImpl", "onEventTrack: reach max track time " + this.f10870a.i().e("track.max_track_times") + " in 4g");
            return false;
        }
        if (!NetworkUtils.isNetworkAvailable(this.f10870a.j())) {
            wpe.e("TrackCapabilityImpl", "onEventTrack:network is not available");
            saveFailData(str);
            return true;
        }
        wpe.b("TrackCapabilityImpl", "onEventTrack:" + str);
        this.f.newCall(new Request.Builder().url(new d3s(this.f10870a.i()).m()).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str)).build()).enqueue(new a(str));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        StorageCapability storageCapability = (StorageCapability) this.f10870a.a(StorageCapability.class);
        if (storageCapability == null) {
            wpe.e("TrackCapabilityImpl", "addTrackTimes: StorageCapability not register");
            return;
        }
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        this.e++;
        c4h c4hVarCreateObjectNode = new ObjectMapper().createObjectNode();
        c4hVarCreateObjectNode.g0(str, this.e);
        storageCapability.writeKeyValue("track_times", c4hVarCreateObjectNode.toString());
        wpe.b("TrackCapabilityImpl", "addTrackTimes:" + this.e + " at " + str);
    }
}

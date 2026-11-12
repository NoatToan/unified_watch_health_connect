package com.xiaomi.ai.android.core;

import android.content.Context;
import android.os.Bundle;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.ai.android.capability.ResourceCapability;
import com.xiaomi.ai.android.rpcclient.core.TransportClient;
import com.xiaomi.ai.android.rpcclient.log.LoggerHooker;
import com.xiaomi.ai.android.rpcclient.log.RLogger;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.SpeechRecognizer;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.bf8;
import defpackage.c4h;
import defpackage.dcd;
import defpackage.e01;
import defpackage.f01;
import defpackage.gt3;
import defpackage.klp;
import defpackage.lt3;
import defpackage.tq1;
import defpackage.ues;
import defpackage.wpe;
import defpackage.yrs;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class h extends gt3 implements TransportClient.ResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10896b;
    private TransportClient c;
    private c4h d;
    private volatile boolean e;
    private e f;
    private f01 g;

    public class a implements LoggerHooker {
        public a(h hVar) {
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TransportClient f10897a;

        public b(h hVar, TransportClient transportClient) {
            this.f10897a = transportClient;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TransportClient transportClient = this.f10897a;
                if (transportClient != null) {
                    transportClient.stop();
                }
            } catch (Exception e) {
                wpe.e("OfflineChannel", wpe.o(e));
            }
        }
    }

    public h(Context context, e01 e01Var, Settings.ClientInfo clientInfo, int i, lt3 lt3Var, e eVar) {
        super(e01Var, clientInfo, i, lt3Var);
        this.g = new f01(StdStatuses.CONNECTION_INTERRUPT, "Network disconnected");
        this.f = eVar;
        a(context);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    private void a(int i, String str) {
        c4h c4hVar = this.d;
        if (c4hVar != null) {
            c4hVar.j0("msg", "code=" + i + ", msg=" + str);
        }
        klp klpVar = this.mTrackData;
        if (klpVar != null) {
            klpVar.h("sdk.connect.error.msg", "code=" + i + ", msg=" + str);
        }
        wpe.e("OfflineChannel", "onError: code=" + i + ", msg=" + str);
        if (this.e) {
            if (i == 801 || i == 802 || i == 803) {
                if (NetworkUtils.isNetworkAvailable(this.f10895a)) {
                    i = 851;
                } else {
                    i = 850;
                }
            } else if (i == 820) {
                if (NetworkUtils.isNetworkAvailable(this.f10895a)) {
                    i = 852;
                } else {
                    i = 850;
                }
            }
            this.g = new f01(i, str);
            getListener().onDisconnected(this);
        }
        if (this.e) {
            stop();
        } else {
            synchronized (this) {
                notifyAll();
            }
        }
    }

    public boolean b(int i, String str) {
        if (!isConnected()) {
            wpe.h("OfflineChannel", "updateResource: is not connected");
            return false;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    wpe.e("OfflineChannel", "updateResource: mTransportClient is null");
                    stop();
                    return false;
                }
                wpe.h("OfflineChannel", "updateResource: type=" + i);
                Bundle bundle = new Bundle();
                bundle.putInt("type", i);
                bundle.putString(TSMAuthContants.PARAM_RESOURCE, str);
                this.c.updateResource(bundle);
                return true;
            } catch (Exception e) {
                wpe.e("OfflineChannel", wpe.o(e));
            }
        }
    }

    @Override // defpackage.gt3
    public String getChannelType() {
        return ThirdPartAccessConstants.GOOGLE_FIT_ACCESS_TYPE;
    }

    @Override // defpackage.gt3
    public f01 getError() {
        return this.g;
    }

    @Override // defpackage.gt3
    public int getErrorCode() {
        return 0;
    }

    @Override // defpackage.gt3
    public int getFailureCode() {
        return 0;
    }

    @Override // defpackage.gt3
    public int getType() {
        return 3;
    }

    @Override // defpackage.gt3
    public boolean isConnected() {
        return this.e;
    }

    public void onBinary(Bundle bundle) {
        if (bundle == null) {
            wpe.e("OfflineChannel", "onMessage: bundle is null");
            return;
        }
        byte[] byteArray = bundle.getByteArray("binary");
        StringBuilder sb = new StringBuilder();
        sb.append("onBinary：");
        sb.append(byteArray == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(byteArray.length));
        wpe.h("OfflineChannel", sb.toString());
        this.mListener.onBinaryMessage(this, byteArray);
    }

    public void onConnected() {
        this.e = true;
        getListener().onConnected(this);
        synchronized (this) {
            notify();
        }
    }

    public void onDisconnected() {
        a(StdStatuses.CONNECTION_INTERRUPT, "connect fail");
    }

    public void onError(Bundle bundle) {
        if (bundle == null) {
            wpe.e("OfflineChannel", "onError: bundle is null");
        } else {
            a(bundle.getInt("code"), bundle.getString("msg"));
        }
    }

    public Bundle onGetResource(Bundle bundle) {
        JSONObject jSONObjectOnGetAppList;
        if (bundle == null) {
            wpe.e("OfflineChannel", "onGetResource: bundle is null");
            return null;
        }
        int i = bundle.getInt("type");
        ResourceCapability resourceCapability = (ResourceCapability) this.f.a(ResourceCapability.class);
        if (resourceCapability == null) {
            return null;
        }
        if (i == 1) {
            jSONObjectOnGetAppList = resourceCapability.onGetAppList();
        } else if (i == 2) {
            jSONObjectOnGetAppList = resourceCapability.onGetContactList();
        } else if (i == 3) {
            jSONObjectOnGetAppList = resourceCapability.onGetSkillList();
        } else if (i == 4) {
            jSONObjectOnGetAppList = resourceCapability.onGetTopContactList();
        } else if (i != 5) {
            wpe.e("OfflineChannel", "onGetResource: tye is unkown. type is" + i);
            jSONObjectOnGetAppList = null;
        } else {
            jSONObjectOnGetAppList = resourceCapability.onGetIotData();
        }
        if (jSONObjectOnGetAppList == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(TSMAuthContants.PARAM_RESOURCE, jSONObjectOnGetAppList.toString());
        return bundle2;
    }

    public Bundle onGetToken(Bundle bundle) {
        if (bundle == null) {
            wpe.e("OfflineChannel", "onGetToken: bundle is null");
            return null;
        }
        int i = bundle.getInt("type");
        boolean z = bundle.getBoolean("forceRefresh");
        wpe.h("OfflineChannel", "onGetToken: authType=" + i + ", forceRefresh=" + z);
        String authHeader = this.mAuthProvider.getAuthHeader(z, false, null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("token", authHeader);
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMessage(Bundle bundle) {
        String str;
        if (bundle == null) {
            str = "onMessage: bundle is null";
        } else {
            String string = bundle.getString("instruction");
            String string2 = bundle.getString("dialogId");
            String string3 = bundle.getString("transactionId");
            if (!yrs.b(string)) {
                try {
                    Instruction instruction = APIUtils.readInstruction(string);
                    if (!yrs.b(string2)) {
                        instruction.setDialogId(string2);
                    }
                    if (!yrs.b(string3)) {
                        instruction.getHeader().setTransactionId(string3);
                    }
                    if (AIApiConstants.SpeechRecognizer.RecognizeResult.equals(instruction.getFullName())) {
                        String string4 = bundle.getString("isFinal");
                        if (!yrs.b(string4)) {
                            ((SpeechRecognizer.RecognizeResult) instruction.getPayload()).setIsFinal(Boolean.parseBoolean(string4));
                        }
                    }
                    wpe.h("OfflineChannel", "onInstruction: " + instruction.getFullName() + "," + (instruction.getDialogId().c() ? instruction.getDialogId().b() : ""));
                    this.mListener.onInstruction(this, new dcd(instruction, string));
                    return;
                } catch (IOException e) {
                    wpe.e("OfflineChannel", wpe.o(e));
                    return;
                }
            }
            str = "onMessage: msg is null";
        }
        wpe.e("OfflineChannel", str);
    }

    @Override // defpackage.gt3
    public boolean postData(byte[] bArr) {
        if (!isConnected()) {
            wpe.h("OfflineChannel", "postData: is not connected");
            return false;
        }
        synchronized (this) {
            try {
                try {
                    if (this.c == null) {
                        wpe.e("OfflineChannel", "postData1: mTransportClient is null");
                        stop();
                        return false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("postData: ");
                    sb.append(bArr != null ? bArr.length : 0);
                    wpe.h("OfflineChannel", sb.toString());
                    Bundle bundle = new Bundle();
                    bundle.putLong("time", System.currentTimeMillis());
                    bundle.putByteArray("binary", bArr);
                    this.c.sendBinary(bundle);
                    return true;
                } catch (Exception e) {
                    wpe.e("OfflineChannel", wpe.o(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gt3
    public boolean postEvent(bf8 bf8Var) {
        if (!isConnected()) {
            wpe.h("OfflineChannel", "postEvent: is not connected");
            return false;
        }
        Event<?> eventA = bf8Var.a();
        wpe.h("OfflineChannel", "postEvent:" + eventA.getFullName() + "," + eventA.getId());
        synchronized (this) {
            try {
                if (this.c == null) {
                    wpe.e("OfflineChannel", "postEvent: mTransportClient is null");
                    stop();
                    return false;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("time", System.currentTimeMillis());
                bundle.putString("event", bf8Var.b());
                this.c.sendMessage(bundle);
                return true;
            } catch (Exception e) {
                wpe.e("OfflineChannel", wpe.o(e));
            }
        }
    }

    @Override // defpackage.gt3
    public boolean startConnect(boolean z) {
        String jsonString;
        wpe.h("OfflineChannel", "startConnect");
        if (isConnected()) {
            return false;
        }
        if (this.mAivsConfig.b("track.enable")) {
            klp klpVar = new klp(this.mTrackInfo);
            this.mTrackData = klpVar;
            this.mListener.onSetTrackData(this, klpVar);
            updateTrackTimestamp("sdk.connect.start", System.currentTimeMillis());
            c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
            this.d = c4hVarCreateObjectNode;
            c4hVarCreateObjectNode.j0("type", "connect");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("aivs.env", this.mAivsConfig.e("aivs.env"));
        bundle.putInt("auth.auth_type", this.mAuthType);
        bundle.putString("connection.device_id", this.mClientInfo.getDeviceId().b());
        bundle.putString("connection.user_agent", this.mAivsConfig.i("connection.user_agent"));
        bundle.putString("auth.client_id", this.mAivsConfig.i("auth.client_id"));
        bundle.putBoolean("connection.speech_only_offline", this.mAivsConfig.b("connection.speech_only_offline"));
        bundle.putInt("capability.version", this.mAivsConfig.e("capability.version"));
        bundle.putInt("log.level", wpe.l());
        bundle.putBoolean("enable.debug", this.mAivsConfig.b("enable.debug"));
        try {
            jsonString = getInitEvent().toJsonString();
        } catch (JsonProcessingException e) {
            wpe.e("OfflineChannel", wpe.o(e));
            jsonString = null;
        }
        if (jsonString != null) {
            bundle.putString("connection.global_config", jsonString);
        }
        String strI = this.mAivsConfig.i("connection.engine_mode");
        if (!yrs.b(strI)) {
            bundle.putString("connection.engine_mode", strI);
        }
        TransportClient transportClient = new TransportClient(this.f10895a, this.f10896b);
        this.c = transportClient;
        transportClient.registerCallback(this);
        this.c.setBundle(bundle);
        if (this.c.start()) {
            int iF = this.mAivsConfig.f("connection.offline_connect_timeout", 3);
            synchronized (this) {
                try {
                    wait(((long) iF) * 1000);
                } catch (InterruptedException e2) {
                    wpe.e("OfflineChannel", wpe.o(e2));
                }
            }
            if (!this.e) {
                wpe.e("OfflineChannel", "start failed");
                c4h c4hVar = this.d;
                if (c4hVar != null) {
                    c4hVar.g0("result", -1);
                    this.d.h0("timestamp", System.currentTimeMillis());
                    if (!this.d.A("msg")) {
                        this.d.j0("msg", "connection time out");
                    }
                    klp klpVar2 = this.mTrackData;
                    if (klpVar2 != null && !klpVar2.c().A("sdk.connect.error.msg")) {
                        updateTrack("sdk.connect.error.msg", "connection time out");
                    }
                    addTrackProcess(this.d);
                    updateTrack("sdk.connect.error.step", "connect");
                    updateTrackTimestamp("sdk.disconnect", System.currentTimeMillis());
                    this.d = null;
                }
                stop();
            } else if (this.d != null) {
                updateTrackTimestamp("sdk.connect.finish", System.currentTimeMillis());
                this.d.g0("result", 0);
                this.d.h0("timestamp", System.currentTimeMillis());
                addTrackProcess(this.d);
                this.d = null;
            }
        } else {
            c4h c4hVar2 = this.d;
            if (c4hVar2 != null) {
                c4hVar2.g0("result", -1);
                this.d.h0("timestamp", System.currentTimeMillis());
                if (!this.d.A("msg")) {
                    this.d.j0("msg", "bind service error");
                }
                klp klpVar3 = this.mTrackData;
                if (klpVar3 != null && !klpVar3.c().A("sdk.connect.error.msg")) {
                    updateTrack("sdk.connect.error.msg", "bind service error");
                }
                addTrackProcess(this.d);
                updateTrack("sdk.connect.error.step", "connect");
                updateTrackTimestamp("sdk.disconnect", System.currentTimeMillis());
                this.d = null;
            }
            this.e = false;
        }
        updateTrack("sdk.connect.result", this.e ? "success" : "failed");
        klp klpVar4 = this.mTrackData;
        if (klpVar4 != null) {
            klpVar4.b();
        }
        return this.e;
    }

    @Override // defpackage.gt3
    public void stop() {
        wpe.h("OfflineChannel", BroadcastsKt.SILENT_PUSHING_STOP);
        if (this.c == null) {
            wpe.h("OfflineChannel", "stop: mTransportClient is null");
        }
        ues.f35695a.execute(new b(this, this.c));
        if (!this.e) {
            synchronized (this) {
                notify();
            }
        }
        this.c = null;
        this.e = false;
    }

    public h(Context context, e01 e01Var, Settings.ClientInfo clientInfo, tq1 tq1Var, lt3 lt3Var, e eVar) {
        super(e01Var, clientInfo, tq1Var, lt3Var);
        this.g = new f01(StdStatuses.CONNECTION_INTERRUPT, "Network disconnected");
        this.f = eVar;
        a(context);
    }

    private void a(Context context) {
        this.f10895a = context;
        String strI = this.mAivsConfig.i("connection.offline_service_package");
        this.f10896b = strI;
        if (yrs.b(strI)) {
            throw new IllegalArgumentException("servicePackage is null!");
        }
        RLogger.setLogHooker(new a(this));
    }

    @Override // defpackage.gt3
    public boolean postData(byte[] bArr, int i, int i2) {
        if (!isConnected()) {
            wpe.h("OfflineChannel", "postData2: is not connected");
            return false;
        }
        synchronized (this) {
            try {
                try {
                    if (this.c == null) {
                        wpe.e("OfflineChannel", "postData2: mTransportClient is null");
                        stop();
                        return false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("postData2: ");
                    sb.append(bArr != null ? bArr.length : 0);
                    wpe.h("OfflineChannel", sb.toString());
                    System.arraycopy(bArr, i, new byte[i2], 0, i2);
                    Bundle bundle = new Bundle();
                    bundle.putLong("time", System.currentTimeMillis());
                    bundle.putByteArray("binary", bArr);
                    this.c.sendBinary(bundle);
                    return true;
                } catch (Exception e) {
                    wpe.e("OfflineChannel", wpe.o(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gt3
    public boolean postEvent(Event event) {
        try {
            return postEvent(new bf8(event, event.toJsonString()));
        } catch (JsonProcessingException unused) {
            wpe.e("OfflineChannel", "send: event failed, required field not set");
            getListener().onError(this, new f01(StdStatuses.MISSING_PARAMETER, "required field not set"));
            return false;
        }
    }
}

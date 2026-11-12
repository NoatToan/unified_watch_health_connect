package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.miui.circulate.api.protocol.audio.support.MediaMetaData;
import com.smarthome.core.modelconfig.PluginDeviceState;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.CoreError;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.account.MiJiaAccountManager;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.core.server.internal.apiparser.CoreJsonParser;
import com.xiaomi.smarthome.core.server.internal.apiparser.CoreSmartHomeApiParser;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingManager;
import com.xiaomi.smarthome.core.server.internal.util.LocaleUtil;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class l1i implements quc {
    public static final Object c = new Object();
    public static volatile l1i d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PluginDeviceState f24521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f24522b;

    public class a implements NetCallback<NetResult, NetError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CoreAsyncCallback f24523a;

        public a(CoreAsyncCallback coreAsyncCallback) {
            this.f24523a = coreAsyncCallback;
        }

        public static /* synthetic */ q1i b(JSONObject jSONObject) throws JSONException {
            return q1i.c(jSONObject, true, true);
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onCache(NetResult netResult) {
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onFailure(NetError netError) {
            this.f24523a.sendFailureMessage(new CoreError(netError.getCode(), netError.getDetail()));
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(NetResult netResult) {
            CoreSmartHomeApiParser.getInstance().parse(netResult, new CoreJsonParser() { // from class: k1i
                @Override // com.xiaomi.smarthome.core.server.internal.apiparser.CoreJsonParser
                public final Object parse(JSONObject jSONObject) {
                    return l1i.a.b(jSONObject);
                }
            }, this.f24523a);
        }
    }

    public class b implements NetCallback<NetResult, NetError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CoreAsyncCallback f24525a;

        public b(CoreAsyncCallback coreAsyncCallback) {
            this.f24525a = coreAsyncCallback;
        }

        public static /* synthetic */ HashMap b(JSONObject jSONObject) throws JSONException {
            return p1i.b(jSONObject.optJSONArray("result"));
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onCache(NetResult netResult) {
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onFailure(NetError netError) {
            this.f24525a.sendFailureMessage(new CoreError(netError.getCode(), netError.getDetail()));
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(NetResult netResult) {
            CoreSmartHomeApiParser.getInstance().parse(netResult, new CoreJsonParser() { // from class: m1i
                @Override // com.xiaomi.smarthome.core.server.internal.apiparser.CoreJsonParser
                public final Object parse(JSONObject jSONObject) {
                    return l1i.b.b(jSONObject);
                }
            }, this.f24525a);
        }
    }

    public l1i(Context context) {
        this.f24522b = context;
    }

    public static l1i d(Context context) {
        if (d == null) {
            synchronized (c) {
                try {
                    if (d == null) {
                        d = new l1i(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // defpackage.quc
    public PluginDeviceState a(boolean z) {
        String miId = MiJiaAccountManager.getInstance().getMiId();
        PluginDeviceState pluginDeviceState = this.f24521a;
        if (pluginDeviceState == null || z || !TextUtils.equals(pluginDeviceState.getMiId(), miId)) {
            ServerBean server = GlobalDynamicSettingManager.getInstance().getServer();
            if (server == null) {
                server = ServerCompact.CN_SERVER();
            }
            this.f24521a = new PluginDeviceState(miId, LocaleUtil.getCurrentLocale(this.f24522b), server);
            MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, "PluginSmartHomeApi", "create state " + z + " " + this.f24521a.getServer() + " " + this.f24521a.getLocale());
        }
        return this.f24521a;
    }

    @Override // defpackage.quc
    public void b(PluginDeviceState pluginDeviceState, int i, String str, CoreAsyncCallback<q1i, CoreError> coreAsyncCallback) {
        MiJiaLog.onlyLogcat("PluginSmartHomeApi", "getPluginConfigNew " + pluginDeviceState);
        if (TextUtils.isEmpty(pluginDeviceState.getMiId()) || "0".equals(pluginDeviceState.getMiId())) {
            coreAsyncCallback.sendFailureMessage(new CoreError(-2, "not login"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devices_last_modify", pluginDeviceState.getDeviceInfoLastModify());
            jSONObject.put("developers_last_modify", pluginDeviceState.getDeveloperInfoLastModify());
            jSONObject.put("app_version", i);
            jSONObject.put(OneTrack.Param.APP_PLATFORM, str);
            jSONObject.put(MediaMetaData.IS_LOCAL, false);
            jSONObject.put("v", 2);
            arrayList.add(new KeyValuePair("data", jSONObject.toString()));
            SmartHomeRc4Api.getInstance().sendRequest(new NetRequest.Builder().method("POST").path("/v2/plugin/get_config_info_new").addQueries(arrayList).build(), new a(coreAsyncCallback));
        } catch (JSONException unused) {
            if (coreAsyncCallback != null) {
                coreAsyncCallback.sendFailureMessage(new CoreError(-1, ""));
            }
        }
    }

    @Override // defpackage.quc
    public void c(PluginDeviceState pluginDeviceState, int i, String str, CoreAsyncCallback<HashMap<String, wb6>, CoreError> coreAsyncCallback) {
        MiJiaLog.onlyLogcat("PluginSmartHomeApi", "getLanguageConfig " + pluginDeviceState);
        if (TextUtils.isEmpty(pluginDeviceState.getMiId()) || "0".equals(pluginDeviceState.getMiId())) {
            coreAsyncCallback.sendFailureMessage(new CoreError(-2, "not login"));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("models", new JSONArray());
            jSONObject.put("keys", new JSONArray().put("cate_name").put("desc").put("name").put("icon_bluetooth_pairing"));
            jSONObject.put("app_version", i);
            jSONObject.put(OneTrack.Param.APP_PLATFORM, str);
        } catch (JSONException unused) {
        }
        SmartHomeRc4Api.getInstance().sendRequest(new NetRequest.Builder().method("POST").path("/v2/productconfig/single_pull").addQueries(Collections.singletonList(new KeyValuePair("data", jSONObject.toString()))).build(), new b(coreAsyncCallback));
    }
}

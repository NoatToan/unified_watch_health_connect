package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.miot.provider.inject.bean.UserInfo;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.device.api.DeviceStat;
import com.xiaomi.smarthome.device.api.Parser;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.http.Error;
import com.xiaomi.smarthome.library.http.HttpApi;
import com.xiaomi.smarthome.library.http.Request;
import com.xiaomi.smarthome.library.http.async.AsyncHandler;
import com.xiaomi.smarthome.setting.ServerRouteUtil;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import okhttp3.Call;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class yuk implements IRnPluginHostApiProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Parser<String> f40583a = new a();

    public class a implements pfh<String> {
        @Override // com.xiaomi.smarthome.device.api.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String parse(String str) throws JSONException {
            return str;
        }
    }

    public class b extends AsyncHandler<String, Error> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f40584a;

        public b(Callback callback) {
            this.f40584a = callback;
        }

        @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
        public void onFailure(Error error, Exception exc, Response response) {
            if (error == null) {
                this.f40584a.invoke(Boolean.FALSE, -1, "");
            } else {
                this.f40584a.invoke(Boolean.FALSE, Integer.valueOf(error.getCode()), error.getDetail());
            }
        }

        @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
        public void processFailure(Call call, IOException iOException) {
            this.f40584a.invoke(Boolean.FALSE, -1, Log.getStackTraceString(iOException));
        }

        @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
        public void processResponse(Response response) {
            try {
                this.f40584a.invoke(Boolean.TRUE, response.body().string());
            } catch (Throwable unused) {
                this.f40584a.invoke(Boolean.FALSE, Integer.valueOf(response.code()), response.message());
            }
        }

        @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
        public void onSuccess(String str, Response response) {
            this.f40584a.invoke(Boolean.TRUE, str);
        }
    }

    public class c implements ya3<UserInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f40586a;

        public c(Callback callback) {
            this.f40586a = callback;
        }

        @Override // defpackage.ya3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(UserInfo userInfo) {
            if (userInfo == null) {
                this.f40586a.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "getUserInfo null"));
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("id", userInfo.f10203a);
            writableMapCreateMap.putString("nickName", userInfo.f10204b);
            writableMapCreateMap.putString("avatarURL", userInfo.c);
            writableMapCreateMap.putString(MedicalIdSPContract.PREF_BIRTHDAY, userInfo.i);
            writableMapCreateMap.putString("email", userInfo.g);
            writableMapCreateMap.putString("phone", userInfo.f);
            writableMapCreateMap.putString("sex", userInfo.h);
            writableMapCreateMap.putString("shareTime", String.valueOf(userInfo.e));
            this.f40586a.invoke(Boolean.TRUE, writableMapCreateMap);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void addNewRoomWithName(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void callMethod(DeviceStat deviceStat, String str, String str2, String str3, String str4, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void callMethodFromCloud(DeviceStat deviceStat, String str, String str2, String str3, String str4, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void callMethodFromLocal(DeviceStat deviceStat, String str, String str2, String str3, String str4, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void callSmartHomeAPI(ReactApplicationContext reactApplicationContext, String str, String str2, String str3, Callback callback) {
        Request requestBuild;
        if (!"/service/getappconfig".equals(str2)) {
            hkg.c().b(str, str2, str3, callback);
            return;
        }
        try {
            requestBuild = new Request.Builder().method("GET").url(ServerRouteUtil.buildSmartHomeHost(reactApplicationContext) + "/app/service/getappconfig?data=" + URLEncoder.encode(str3, "UTF-8")).build();
        } catch (Throwable unused) {
            requestBuild = null;
        }
        HttpApi.sendRequestDefault(requestBuild, new b(callback));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public <T> void callSmartHomeApi(String str, String str2, String str3, com.xiaomi.smarthome.device.api.Callback<T> callback, Parser<T> parser) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void createExecutor(ReactApplicationContext reactApplicationContext, String str, String str2, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void delDataWhileRevokeLicense(PluginPackageInfo pluginPackageInfo, DeviceStat deviceStat) {
        if (deviceStat == null) {
            return;
        }
        ush.a(deviceStat.model, deviceStat.did);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void delDeviceNativeData(String str) {
        vsh.a(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void delScenes(String str, List<String> list, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void editRoom(String str, String str2, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void editSceneV2(String str, int i, String str2, String str3, String str4, String str5, JSONObject jSONObject, JSONArray jSONArray, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void executeMethod(String str, String str2, String str3, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public String getAccountId() {
        return mvk.e().d().getCurrentAccountId();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public List<DeviceStat> getBleGatewayDeviceList() {
        return mvk.e().c().getBleGatewayDeviceList();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void getBleGatewaySubDevices(List<String> list, List<String> list2, com.xiaomi.smarthome.device.api.Callback<List<DeviceStat>> callback) {
        mvk.e().c().getBleGatewaySubDevices(list, list2, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public String getBusinessType() {
        return mvk.e().d().getBusinessType();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public String getCurrentServer() {
        ServerBean currentServer = ServerCompact.getCurrentServer(MiJiaEnvironment.getAppContext());
        if (currentServer != null) {
            return currentServer.name;
        }
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public DeviceStat getDeviceByDid(String str) {
        return mvk.e().c().getDeviceByDid(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public List<DeviceStat> getDeviceList() {
        return mvk.e().c().getDeviceList();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public JSONArray getDeviceProp(String str) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public String getHomeDeviceList() {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public String getHomeList() {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public String getNativePrivacyConfirmationVersion(String str) {
        return vsh.b(str);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public Parser<String> getParserForRawResult() {
        return f40583a;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void getRecommendScenes(String str, String str2, com.xiaomi.smarthome.device.api.Callback<JSONObject> callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void getRoomList(boolean z, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public List<String> getRoomNames(List<String> list) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public int getSdkApiLevel() {
        return mvk.e().d().getSdkApiLevel();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void getSubDevice(String str, String[] strArr, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public int getUsePreviewConfig() {
        return 0;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void getVersion(DeviceStat deviceStat, boolean z, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public String getVirtualGroupStatus(String str) {
        return null;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void hasSetDeviceCall(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public boolean isLocalControlCanUse(String str) {
        return false;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public boolean isOutNetEnabled() {
        return true;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void jumpToThirdPartApp(Activity activity, Intent intent, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void loadAccountInfo(String str, Callback callback) {
        mvk.e().d().getUserInfo(str, new c(callback));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void localPingWithCallback(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void modDeviceName(String str, String str2, com.xiaomi.smarthome.device.api.Callback<Void> callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void openDevice(Context context, String str, String str2, ReadableMap readableMap, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void openPluginPage(Activity activity, String str, String str2, ReadableMap readableMap, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void reportDeviceGPSInfo(DeviceStat deviceStat, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void requestAuthorizedDeviceListData(String str, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void saveStringToNotesAppOnMIUI(String str, com.xiaomi.smarthome.device.api.Callback<Void> callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void setCommonUseDeviceSwitch(List<String> list, boolean z, com.xiaomi.smarthome.device.api.Callback<Boolean> callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void setNativePrivacyConfirmationVersion(String str, String str2) {
        vsh.c(str, str2);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void setPrivacyConfirmation(String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, Callback callback) {
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void subscribeMessages(ReactApplicationContext reactApplicationContext, String str, int i, ReadableArray readableArray, Callback callback) {
        wno.c().e(reactApplicationContext, str, i, readableArray, callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnPluginHostApiProvider
    public void unsubscribeMessages(String str, ReadableArray readableArray, int i, String str2, Callback callback) {
    }
}

package com.xiaomi.smarthome.server.api;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.smarthome.StdPluginCommonUtils;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.CoreAsyncHandle;
import com.xiaomi.smarthome.core.server.internal.CoreError;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.core.server.internal.apiparser.CoreJsonParser;
import com.xiaomi.smarthome.core.server.internal.apiparser.CoreSmartHomeApiParser;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.server.PluginUpdateProviderManager;
import com.xiaomi.smarthome.server.entity.PluginUpdateInfoResult;
import com.xiaomi.smarthome.server.util.PluginPackageUtils;
import com.xiaomi.smarthome.setting.PluginSetting;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PluginUpdateApi {
    public static final String MODEL_TO_REPLACE_ALL_PLUGIN = "ModelToReplaceAllPluginForTestOnly";
    private static final String USE_OLD_PLUGIN_ONLY = "old_plugin_only";
    private static volatile PluginUpdateApi sInstance;
    private static final Object sLock = new Object();

    private PluginUpdateApi() {
    }

    private void checkLooper() {
        if (Looper.myLooper() == null) {
            throw new RuntimeException("Async Callback must have Looper");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONArray getFullDefinePluginInfo(JSONObject jSONObject, String str) {
        if (PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().isWhiteListContained(str)) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("increment_plugin_info");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("full_define_plugin_info");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
            return null;
        }
        return jSONArrayOptJSONArray2;
    }

    public static PluginUpdateApi getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new PluginUpdateApi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static final String getModelToReplaceAllPluginForTestOnly(Context context) {
        byte[] file;
        if (context == null && (context = MiJiaEnvironment.getAppContext()) == null) {
            return "";
        }
        File file2 = new File(FileUtils.getAppFilesDir(context), MODEL_TO_REPLACE_ALL_PLUGIN);
        return (file2.exists() && (file = FileUtils.readFile(file2)) != null && file.length >= 1) ? new String(file) : "";
    }

    public static final boolean isUseOldPluginOnly(Context context) {
        return USE_OLD_PLUGIN_ONLY.equals(getModelToReplaceAllPluginForTestOnly(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreHomePageType(String str, int i) {
        if (TextUtils.isEmpty(str) || i != 4) {
            return;
        }
        String mid = PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().getMid();
        if (StdPluginCommonUtils.getHomePageType(str, mid) == 1) {
            StdPluginCommonUtils.setHomePageType(str, mid, 0);
        }
    }

    public static final void setModelToReplaceAllPluginForTestOnly(Context context, String str) {
        if (context == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        FileUtils.writeFile(new File(FileUtils.getAppFilesDir(context), MODEL_TO_REPLACE_ALL_PLUGIN), str.getBytes());
    }

    public static final void setUseOldPluginOnly(Context context, boolean z) {
        setModelToReplaceAllPluginForTestOnly(context, z ? USE_OLD_PLUGIN_ONLY : "");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0063  */
    public CoreAsyncHandle updatePlugin(final JSONArray jSONArray, int i, String str, final CoreAsyncCallback<List<PluginUpdateInfoResult>, CoreError> coreAsyncCallback) {
        CoreAsyncCallback<List<PluginUpdateInfoResult>, CoreError> coreAsyncCallback2;
        boolean z;
        String strOptString;
        checkLooper();
        ArrayList arrayList = new ArrayList();
        final String modelToReplaceAllPluginForTestOnly = getModelToReplaceAllPluginForTestOnly(null);
        final boolean zEquals = USE_OLD_PLUGIN_ONLY.equals(modelToReplaceAllPluginForTestOnly);
        final HashSet hashSet = new HashSet();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api_version", PluginSetting.RN_NATIVE_API_LEVEL);
            jSONObject2.put(OneTrack.Param.APP_PLATFORM, YRNConstants.PLATFORM);
            ServerBean globalSettingServer = PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().getGlobalSettingServer();
            if (globalSettingServer == null) {
                globalSettingServer = ServerCompact.CN_SERVER();
            }
            jSONObject2.put("region", globalSettingServer.countryCode);
            if (zEquals) {
                jSONObject2.put("plugins", jSONArray);
            } else {
                try {
                    if (modelToReplaceAllPluginForTestOnly.isEmpty()) {
                        jSONObject2.put("plugins", jSONArray);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            hashSet.add(jSONArray.optJSONObject(i2).optString("model"));
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("model", modelToReplaceAllPluginForTestOnly);
                        jSONArray2.put(jSONObject3);
                        jSONObject2.put("plugins", jSONArray2);
                    }
                } catch (JSONException unused) {
                    coreAsyncCallback2 = coreAsyncCallback;
                    if (coreAsyncCallback2 != null) {
                        coreAsyncCallback2.sendFailureMessage(new CoreError(-1, ""));
                    }
                    return new CoreAsyncHandle(null);
                }
            }
            jSONObject2.put("package_type", "");
            jSONObject.put("latest_req", jSONObject2);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("plugins", jSONArray);
            jSONObject4.put("api_level", i);
            jSONObject4.put(OneTrack.Param.APP_PLATFORM, str);
            jSONObject.put("backup_req", jSONObject4);
            boolean z2 = true;
            if (jSONArray == null || jSONArray.length() != 1) {
                z = false;
                strOptString = null;
            } else {
                z = false;
                strOptString = jSONArray.optJSONObject(0).optString("model");
            }
            if (!PluginPackageUtils.isGetStdPluginByVersion() || !PluginPackageUtils.isStdPluginParentModel(strOptString)) {
                z2 = z;
            }
            if (z2) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("api_version", PluginSetting.RN_NATIVE_API_LEVEL);
                jSONObject5.put(OneTrack.Param.APP_PLATFORM, YRNConstants.PLATFORM);
                JSONArray jSONArray3 = new JSONArray();
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("version", Integer.valueOf(PluginPackageUtils.getStdPluginVersion()));
                jSONObject6.put("model", strOptString);
                jSONArray3.put(jSONObject6);
                jSONObject5.put("stand_plugins", jSONArray3);
                jSONObject.put("stand_plugins", jSONObject5);
            }
            arrayList.add(new KeyValuePair("data", jSONObject.toString()));
            NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/v2/plugin/fetch_plugin").addQueries(arrayList).build();
            final boolean z3 = z2;
            final CoreJsonParser<List<PluginUpdateInfoResult>> coreJsonParser = new CoreJsonParser<List<PluginUpdateInfoResult>>() { // from class: com.xiaomi.smarthome.server.api.PluginUpdateApi.3
                @Override // com.xiaomi.smarthome.core.server.internal.apiparser.CoreJsonParser
                public List<PluginUpdateInfoResult> parse(JSONObject jSONObject7) throws JSONException {
                    JSONObject jSONObject8;
                    int i3;
                    JSONArray jSONArrayOptJSONArray;
                    String str2;
                    String str3;
                    String str4;
                    int i4;
                    String str5;
                    String str6;
                    String str7;
                    String str8;
                    int i5;
                    LogType logType = LogType.PLUGIN;
                    MiJiaLog.writeLogOnAll(logType, "fetch_plugin", "", "plugin info : " + jSONObject7);
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArrayOptJSONArray2 = jSONObject7.optJSONArray("stand_plugin_info");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        MiJiaLog.writeLogOnAll(logType, "fetch_plugin", "std_plugin_info", jSONArrayOptJSONArray2.toString());
                    }
                    boolean z4 = z3;
                    String str9 = MediaStoreUtil.MediaInfo.SIZE;
                    String str10 = "force_update_status";
                    String str11 = "sdk_version";
                    String str12 = "plugin_package_id";
                    String str13 = "rn";
                    String str14 = "dev_mode";
                    String str15 = "change_log";
                    if (z4) {
                        int length = jSONArrayOptJSONArray2.length();
                        int i6 = 0;
                        while (i6 < length) {
                            int i7 = length;
                            PluginUpdateInfoResult pluginUpdateInfoResult = new PluginUpdateInfoResult();
                            JSONArray jSONArray4 = jSONArrayOptJSONArray2;
                            JSONObject jSONObject9 = (JSONObject) jSONArrayOptJSONArray2.get(i6);
                            pluginUpdateInfoResult.mPackgeType = str13;
                            String str16 = str13;
                            String strOptString2 = jSONObject9.optString("model");
                            pluginUpdateInfoResult.mModel = strOptString2;
                            if (TextUtils.isEmpty(strOptString2)) {
                                i5 = i6;
                            } else {
                                i5 = i6;
                                long jOptLong = jSONObject9.optLong("plugin_id");
                                pluginUpdateInfoResult.mPluginId = jOptLong;
                                if (PluginPackageConstant.IS_VALID_RN_PLUGIN_ID(jOptLong)) {
                                    long jOptLong2 = jSONObject9.optLong("plugin_package_id");
                                    pluginUpdateInfoResult.mPackageId = jOptLong2;
                                    if (PluginPackageConstant.IS_VALID_RN_PACKAGE_ID(jOptLong2)) {
                                        String strOptString3 = jSONObject9.optString("download_url");
                                        pluginUpdateInfoResult.mDownloadUrl = strOptString3;
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            pluginUpdateInfoResult.rnSdkApiLevel = jSONObject9.optInt("sdk_version");
                                            pluginUpdateInfoResult.mVersion = jSONObject9.optInt("version");
                                            pluginUpdateInfoResult.mNewVersion = 1;
                                            pluginUpdateInfoResult.mChangeLog = jSONObject9.optString("change_log");
                                            pluginUpdateInfoResult.mForce = jSONObject9.optInt("force_update_status");
                                            pluginUpdateInfoResult.mLength = jSONObject9.optLong(str9);
                                            pluginUpdateInfoResult.mDevMode = jSONObject9.optInt("dev_mode");
                                            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "std_plugin:", " fetch_plugin ", pluginUpdateInfoResult.mModel + " , new version : " + pluginUpdateInfoResult.mNewVersion + " , version : " + pluginUpdateInfoResult.mVersion + " ,pluginId : " + pluginUpdateInfoResult.mPluginId + " , packageId : " + pluginUpdateInfoResult.mPackageId);
                                            arrayList2.add(pluginUpdateInfoResult);
                                        }
                                    }
                                }
                                i6 = i5 + 1;
                                length = i7;
                                jSONArrayOptJSONArray2 = jSONArray4;
                                str13 = str16;
                                str9 = str9;
                            }
                            i6 = i5 + 1;
                            length = i7;
                            jSONArrayOptJSONArray2 = jSONArray4;
                            str13 = str16;
                            str9 = str9;
                        }
                        return arrayList2;
                    }
                    String str17 = MediaStoreUtil.MediaInfo.SIZE;
                    if (zEquals) {
                        jSONObject8 = jSONObject7;
                        jSONArrayOptJSONArray = null;
                        i3 = 0;
                    } else {
                        jSONObject8 = jSONObject7;
                        i3 = 0;
                        jSONArrayOptJSONArray = jSONObject8.optJSONArray("latest_info");
                    }
                    HashMap map = new HashMap();
                    JSONArray jSONArray5 = jSONArray;
                    if (jSONArray5 != null && jSONArrayOptJSONArray != null) {
                        JSONArray fullDefinePluginInfo = PluginUpdateApi.this.getFullDefinePluginInfo(jSONObject8, jSONArray5.optJSONObject(i3).optString("model"));
                        if (fullDefinePluginInfo != null && fullDefinePluginInfo.length() > 0) {
                            jSONArrayOptJSONArray = fullDefinePluginInfo;
                        }
                    }
                    if (zEquals || jSONArrayOptJSONArray == null) {
                        str2 = "change_log";
                        str3 = "dev_mode";
                    } else {
                        int length2 = jSONArrayOptJSONArray.length();
                        int i8 = 0;
                        PluginUpdateInfoResult pluginUpdateInfoResult2 = null;
                        while (i8 < length2) {
                            int i9 = length2;
                            PluginUpdateInfoResult pluginUpdateInfoResult3 = new PluginUpdateInfoResult();
                            JSONArray jSONArray6 = jSONArrayOptJSONArray;
                            JSONObject jSONObject10 = (JSONObject) jSONArrayOptJSONArray.get(i8);
                            PluginUpdateInfoResult pluginUpdateInfoResult4 = pluginUpdateInfoResult2;
                            pluginUpdateInfoResult3.mPackgeType = "rn";
                            String strOptString4 = jSONObject10.optString("model");
                            pluginUpdateInfoResult3.mModel = strOptString4;
                            if (TextUtils.isEmpty(strOptString4)) {
                                i4 = i8;
                            } else {
                                map.put(pluginUpdateInfoResult3.mModel, pluginUpdateInfoResult3);
                                i4 = i8;
                                long jOptLong3 = jSONObject10.optLong("plugin_id");
                                pluginUpdateInfoResult3.mPluginId = jOptLong3;
                                if (PluginPackageConstant.IS_VALID_RN_PLUGIN_ID(jOptLong3)) {
                                    long jOptLong4 = jSONObject10.optLong(str12);
                                    pluginUpdateInfoResult3.mPackageId = jOptLong4;
                                    if (PluginPackageConstant.IS_VALID_RN_PACKAGE_ID(jOptLong4)) {
                                        String strOptString5 = jSONObject10.optString("download_url");
                                        pluginUpdateInfoResult3.mDownloadUrl = strOptString5;
                                        if (!TextUtils.isEmpty(strOptString5)) {
                                            pluginUpdateInfoResult3.rnSdkApiLevel = jSONObject10.optInt(str11);
                                            pluginUpdateInfoResult3.mVersion = jSONObject10.optInt("version");
                                            pluginUpdateInfoResult3.mNewVersion = 1;
                                            pluginUpdateInfoResult3.mChangeLog = jSONObject10.optString("change_log");
                                            pluginUpdateInfoResult3.mForce = jSONObject10.optInt(str10);
                                            str5 = str10;
                                            String str18 = str17;
                                            str6 = str11;
                                            pluginUpdateInfoResult3.mLength = jSONObject10.optLong(str18);
                                            int iOptInt = jSONObject10.optInt("dev_mode");
                                            pluginUpdateInfoResult3.mDevMode = iOptInt;
                                            PluginUpdateApi.this.restoreHomePageType(pluginUpdateInfoResult3.mModel, iOptInt);
                                            str7 = str18;
                                            str8 = str12;
                                            PluginSetting.RnSdkLog("fetch plugin:", pluginUpdateInfoResult3.mModel, Long.valueOf(pluginUpdateInfoResult3.rnSdkApiLevel), Long.valueOf(pluginUpdateInfoResult3.mPluginId), Long.valueOf(pluginUpdateInfoResult3.mPackageId));
                                            if (modelToReplaceAllPluginForTestOnly.isEmpty() || !TextUtils.equals(modelToReplaceAllPluginForTestOnly, pluginUpdateInfoResult3.mModel)) {
                                                arrayList2.add(pluginUpdateInfoResult3);
                                            }
                                        }
                                        pluginUpdateInfoResult3 = pluginUpdateInfoResult4;
                                    }
                                }
                                i8 = i4 + 1;
                                str12 = str8;
                                str10 = str5;
                                str11 = str6;
                                jSONArrayOptJSONArray = jSONArray6;
                                str17 = str7;
                                pluginUpdateInfoResult2 = pluginUpdateInfoResult3;
                                length2 = i9;
                            }
                            str5 = str10;
                            str8 = str12;
                            str7 = str17;
                            str6 = str11;
                            pluginUpdateInfoResult3 = pluginUpdateInfoResult4;
                            i8 = i4 + 1;
                            str12 = str8;
                            str10 = str5;
                            str11 = str6;
                            jSONArrayOptJSONArray = jSONArray6;
                            str17 = str7;
                            pluginUpdateInfoResult2 = pluginUpdateInfoResult3;
                            length2 = i9;
                        }
                        PluginUpdateInfoResult pluginUpdateInfoResult5 = pluginUpdateInfoResult2;
                        if (pluginUpdateInfoResult5 != null) {
                            for (String str19 : hashSet) {
                                PluginUpdateInfoResult pluginUpdateInfoResult6 = new PluginUpdateInfoResult();
                                pluginUpdateInfoResult6.mModel = str19;
                                pluginUpdateInfoResult6.mDownloadUrl = pluginUpdateInfoResult5.mDownloadUrl;
                                pluginUpdateInfoResult6.rnSdkApiLevel = pluginUpdateInfoResult5.rnSdkApiLevel;
                                pluginUpdateInfoResult6.mLength = pluginUpdateInfoResult5.mLength;
                                pluginUpdateInfoResult6.mNewVersion = pluginUpdateInfoResult5.mNewVersion;
                                long j = pluginUpdateInfoResult5.mPluginId;
                                pluginUpdateInfoResult6.mPluginId = j;
                                String str20 = str14;
                                pluginUpdateInfoResult6.mPackageId = pluginUpdateInfoResult5.mPackageId;
                                pluginUpdateInfoResult6.mVersion = pluginUpdateInfoResult5.mVersion;
                                pluginUpdateInfoResult6.mChangeLog = pluginUpdateInfoResult5.mChangeLog;
                                String str21 = pluginUpdateInfoResult5.mPackgeType;
                                pluginUpdateInfoResult6.mPackgeType = str21;
                                pluginUpdateInfoResult6.mDevMode = pluginUpdateInfoResult5.mDevMode;
                                PluginSetting.RnSdkLog("FETCH OLD plugin:", str19, str21, Long.valueOf(j), Long.valueOf(pluginUpdateInfoResult6.mPackageId));
                                arrayList2.add(pluginUpdateInfoResult6);
                                str14 = str20;
                                str15 = str15;
                            }
                        }
                        str2 = str15;
                        str3 = str14;
                        if (!modelToReplaceAllPluginForTestOnly.isEmpty()) {
                            return arrayList2;
                        }
                    }
                    JSONArray jSONArrayOptJSONArray3 = jSONObject7.optJSONArray("backup_info");
                    if (jSONArrayOptJSONArray3 != null) {
                        int length3 = jSONArrayOptJSONArray3.length();
                        int i10 = 0;
                        while (i10 < length3) {
                            PluginUpdateInfoResult pluginUpdateInfoResult7 = new PluginUpdateInfoResult();
                            JSONObject jSONObject11 = (JSONObject) jSONArrayOptJSONArray3.get(i10);
                            String strOptString6 = jSONObject11.optString("model");
                            pluginUpdateInfoResult7.mModel = strOptString6;
                            if (((PluginUpdateInfoResult) map.get(strOptString6)) != null) {
                                System.out.println("INFO: OLD PLUGIN INFO OF " + pluginUpdateInfoResult7.mModel);
                            } else {
                                String strOptString7 = jSONObject11.optString("download_url");
                                pluginUpdateInfoResult7.mDownloadUrl = strOptString7;
                                if (StringUtil.isEmpty(strOptString7)) {
                                    System.out.println("WARN: EMPTY PLUGIN INFO OF " + pluginUpdateInfoResult7.mModel);
                                } else {
                                    pluginUpdateInfoResult7.mNewVersion = jSONObject11.optInt("new_version");
                                    pluginUpdateInfoResult7.mPluginId = jSONObject11.optLong("plugin_id");
                                    pluginUpdateInfoResult7.mPackageId = jSONObject11.optLong("package_id");
                                    pluginUpdateInfoResult7.mForce = jSONObject11.optInt("force");
                                    pluginUpdateInfoResult7.mVersion = jSONObject11.optInt("version");
                                    str4 = str2;
                                    pluginUpdateInfoResult7.mChangeLog = jSONObject11.optString(str4);
                                    pluginUpdateInfoResult7.mSafeUrl = jSONObject11.optString("safe_url");
                                    pluginUpdateInfoResult7.mLength = jSONObject11.optLong("length");
                                    pluginUpdateInfoResult7.mPackgeType = jSONObject11.optString("type");
                                    pluginUpdateInfoResult7.mDevMode = jSONObject11.optInt(str3);
                                    arrayList2.add(pluginUpdateInfoResult7);
                                }
                                i10++;
                                jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                                str2 = str4;
                            }
                            str4 = str2;
                            i10++;
                            jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                            str2 = str4;
                        }
                    }
                    return arrayList2;
                }
            };
            return new CoreAsyncHandle(SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.server.api.PluginUpdateApi.4
                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onCache(NetResult netResult) {
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onFailure(NetError netError) {
                    if (jSONArray != null) {
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            jSONArray.optJSONObject(i3).optString("model");
                        }
                    }
                    coreAsyncCallback.sendFailureMessage(new CoreError(netError.getCode(), netError.getDetail()));
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onSuccess(NetResult netResult) {
                    CoreSmartHomeApiParser.getInstance().parse(netResult, coreJsonParser, coreAsyncCallback);
                }
            }));
        } catch (JSONException unused2) {
            coreAsyncCallback2 = coreAsyncCallback;
        }
    }

    public CoreAsyncHandle updatePluginOld(Context context, final JSONArray jSONArray, int i, int i2, String str, final CoreAsyncCallback<List<PluginUpdateInfoResult>, CoreError> coreAsyncCallback) {
        checkLooper();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("plugins", jSONArray);
            jSONObject.put("api_level", i);
            jSONObject.put("app_version", i2);
            jSONObject.put(OneTrack.Param.APP_PLATFORM, str);
            arrayList.add(new KeyValuePair("data", jSONObject.toString()));
            NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/plugin/update_plugin").addQueries(arrayList).build();
            final CoreJsonParser<List<PluginUpdateInfoResult>> coreJsonParser = new CoreJsonParser<List<PluginUpdateInfoResult>>() { // from class: com.xiaomi.smarthome.server.api.PluginUpdateApi.5
                @Override // com.xiaomi.smarthome.core.server.internal.apiparser.CoreJsonParser
                public List<PluginUpdateInfoResult> parse(JSONObject jSONObject2) throws JSONException {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("plugins");
                    int length = jSONArrayOptJSONArray.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        PluginUpdateInfoResult pluginUpdateInfoResult = new PluginUpdateInfoResult();
                        JSONObject jSONObject3 = (JSONObject) jSONArrayOptJSONArray.get(i3);
                        pluginUpdateInfoResult.mModel = jSONObject3.optString("model");
                        pluginUpdateInfoResult.mNewVersion = jSONObject3.optInt("new_version");
                        pluginUpdateInfoResult.mPluginId = jSONObject3.optLong("plugin_id");
                        pluginUpdateInfoResult.mPackageId = jSONObject3.optLong("package_id");
                        pluginUpdateInfoResult.mForce = jSONObject3.optInt("force");
                        pluginUpdateInfoResult.mVersion = jSONObject3.optInt("version");
                        pluginUpdateInfoResult.mChangeLog = jSONObject3.optString("change_log");
                        pluginUpdateInfoResult.mDownloadUrl = jSONObject3.optString("download_url");
                        pluginUpdateInfoResult.mSafeUrl = jSONObject3.optString("safe_url");
                        pluginUpdateInfoResult.mLength = jSONObject3.optLong("length");
                        pluginUpdateInfoResult.mPackgeType = jSONObject3.optString("type");
                        arrayList2.add(pluginUpdateInfoResult);
                    }
                    return arrayList2;
                }
            };
            return new CoreAsyncHandle(SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.server.api.PluginUpdateApi.6
                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onCache(NetResult netResult) {
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onFailure(NetError netError) {
                    if (jSONArray != null) {
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            jSONArray.optJSONObject(i3).optString("model");
                        }
                    }
                    coreAsyncCallback.sendFailureMessage(new CoreError(netError.getCode(), netError.getDetail()));
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onSuccess(NetResult netResult) {
                    CoreSmartHomeApiParser.getInstance().parse(netResult, coreJsonParser, coreAsyncCallback);
                }
            }));
        } catch (JSONException unused) {
            if (coreAsyncCallback != null) {
                coreAsyncCallback.sendFailureMessage(new CoreError(-1, ""));
            }
            return new CoreAsyncHandle(null);
        }
    }

    public CoreAsyncHandle updateRnSdk(Context context, JSONArray jSONArray, final CoreAsyncCallback<JSONArray, CoreError> coreAsyncCallback) {
        checkLooper();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", YRNConstants.PLATFORM);
            jSONObject.put("sdk_version", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/v2/plugin/fetch_sdk").addQueries(arrayList).build();
        final CoreJsonParser<JSONArray> coreJsonParser = new CoreJsonParser<JSONArray>() { // from class: com.xiaomi.smarthome.server.api.PluginUpdateApi.1
            @Override // com.xiaomi.smarthome.core.server.internal.apiparser.CoreJsonParser
            public JSONArray parse(JSONObject jSONObject2) throws JSONException {
                return jSONObject2.getJSONArray("info");
            }
        };
        return new CoreAsyncHandle(SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.server.api.PluginUpdateApi.2
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                coreAsyncCallback.sendFailureMessage(new CoreError(netError.getCode(), netError.getDetail()));
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                PluginSetting.RnSdkLog("fetch sdk info", netResult.mResponse);
                CoreSmartHomeApiParser.getInstance().parse(netResult, coreJsonParser, coreAsyncCallback);
            }
        }));
    }
}

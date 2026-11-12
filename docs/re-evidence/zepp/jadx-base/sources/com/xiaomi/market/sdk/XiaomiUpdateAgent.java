package com.xiaomi.market.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class XiaomiUpdateAgent {
    private static final String TAG = "MarketUpdateAgent";
    private static LocalAppInfo mAppInfo = null;
    private static boolean mIsInited = false;
    private static boolean mIsLoading = false;
    private static UpdateInfo mUpdateInfo;
    private static XiaomiUpdateListener mUpdateListener;
    private static Constants.UpdateMethod mUpdateMethod;
    private static boolean sDebug;
    private static WeakReference<Context> mContext = new WeakReference<>(null);
    private static boolean mAutoPopup = true;
    private static boolean mCheckUpdateOnlyWifi = false;
    private static boolean mIsPathcerLibraryLoaded = false;
    private static boolean sUseImeiMd5AsIdentifier = false;

    public static class CheckUpdateTask extends AsyncTask<Void, Void, Integer> {

        public static class CheckDownloadTask extends AsyncTask<Void, Void, Boolean> {
            private CheckDownloadTask() {
            }

            @Override // android.os.AsyncTask
            public Boolean doInBackground(Void... voidArr) {
                Context context = (Context) XiaomiUpdateAgent.mContext.get();
                return context == null ? Boolean.FALSE : Boolean.valueOf(DownloadInstallManager.getManager(context).isDownloading(XiaomiUpdateAgent.mAppInfo));
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Boolean bool) {
                if (bool.booleanValue()) {
                    return;
                }
                CheckUpdateTask.showUpdateDialog();
            }
        }

        private CheckUpdateTask() {
        }

        private String getFilterParams() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Constants.JSON_SCREEN_SIZE, Client.DISPLAY_WIDTH + "*" + Client.DISPLAY_HEIGHT);
                jSONObject.put("resolution", Client.DISPLAY_RESOLUTION);
                jSONObject.put(Constants.JSON_DENSITY, Client.DISPLAY_DENSITY);
                jSONObject.put(Constants.JSON_TOUCH_SCREEN, Client.TOUCH_SCREEN);
                jSONObject.put(Constants.JSON_GLES_VERSION, Client.GLES_VERSION);
                jSONObject.put(Constants.JSON_FEATURE, Client.FEATURE);
                jSONObject.put(Constants.JSON_LIBRARY, Client.LIBRARY);
                jSONObject.put(Constants.JSON_GL_EXTENSION, Client.GL_EXTENSION);
                jSONObject.put("sdk", Client.SDK_VERSION);
                jSONObject.put("version", Client.SYSTEM_VERSION);
                jSONObject.put("release", Client.RELEASE);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return "";
            }
        }

        private UpdateInfo parseUpdateInfo(JSONObject jSONObject) {
            if (jSONObject == null) {
                Log.e(XiaomiUpdateAgent.TAG, "update info json obj null");
                return null;
            }
            if (Utils.DEBUG) {
                Log.d(XiaomiUpdateAgent.TAG, "updateInfo : " + jSONObject.toString());
            }
            UpdateInfo updateInfo = new UpdateInfo();
            try {
                updateInfo.host = jSONObject.getString("host");
                updateInfo.fitness = jSONObject.getInt("fitness");
                updateInfo.source = jSONObject.getInt("source");
                updateInfo.updateLog = jSONObject.getString(Constants.UPDATE_LOG);
                updateInfo.versionCode = jSONObject.getInt("versionCode");
                updateInfo.versionName = jSONObject.getString("versionName");
                updateInfo.apkUrl = jSONObject.getString(Constants.APK_URL);
                updateInfo.apkHash = jSONObject.getString("apkHash");
                updateInfo.apkSize = jSONObject.getLong(Constants.APK_SIZE);
                if (XiaomiUpdateAgent.mIsPathcerLibraryLoaded) {
                    updateInfo.diffUrl = jSONObject.getString(Constants.DIFF_URL);
                    updateInfo.diffHash = jSONObject.getString(Constants.DIFF_HASH);
                    updateInfo.diffSize = jSONObject.getLong(Constants.DIFF_SIZE);
                }
                return updateInfo;
            } catch (JSONException e) {
                Log.e(XiaomiUpdateAgent.TAG, "get update info failed : " + e.toString());
                Log.e(XiaomiUpdateAgent.TAG, "original content : " + jSONObject.toString());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void showUpdateDialog() {
            Context context = (Context) XiaomiUpdateAgent.mContext.get();
            if (context == null) {
                return;
            }
            if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
                Log.e(XiaomiUpdateAgent.TAG, "activity not running!");
            } else {
                new AlertDialog.Builder(context).setTitle(context.getString(R.string.xiaomi_update_sdk_dialog_title, XiaomiUpdateAgent.mAppInfo.displayName)).setMessage(TextUtils.isEmpty(XiaomiUpdateAgent.mUpdateInfo.diffUrl) ? context.getString(R.string.xiaomi_update_sdk_dialog_message, XiaomiUpdateAgent.mUpdateInfo.versionName, Utils.getByteString(XiaomiUpdateAgent.mUpdateInfo.apkSize, context)) : context.getString(R.string.xiaomi_update_sdk_dialog_message_diff, XiaomiUpdateAgent.mUpdateInfo.versionName, Utils.getByteString(XiaomiUpdateAgent.mUpdateInfo.diffSize, context))).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.xiaomi.market.sdk.XiaomiUpdateAgent.CheckUpdateTask.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        XiaomiUpdateAgent.openMarketOrArrange();
                    }
                }).show();
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            Log.d(XiaomiUpdateAgent.TAG, "start to check update");
            if (XiaomiUpdateAgent.mIsPathcerLibraryLoaded) {
                return;
            }
            boolean unused = XiaomiUpdateAgent.mIsPathcerLibraryLoaded = Patcher.tryLoadLibrary();
        }

        @Override // android.os.AsyncTask
        public Integer doInBackground(Void... voidArr) {
            Context context = (Context) XiaomiUpdateAgent.mContext.get();
            if (context == null) {
                return 4;
            }
            if (!Utils.isConnected(context)) {
                return 3;
            }
            if (!Utils.isWifiConnected(context) && XiaomiUpdateAgent.mCheckUpdateOnlyWifi) {
                return 2;
            }
            LocalAppInfo unused = XiaomiUpdateAgent.mAppInfo = XiaomiUpdateAgent.getAppInfo(context);
            if (XiaomiUpdateAgent.mAppInfo == null) {
                return 5;
            }
            Connection connection = new Connection(Constants.UPDATE_URL);
            Connection.Parameter parameter = new Connection.Parameter(connection);
            parameter.add("info", getFilterParams());
            parameter.add("packageName", XiaomiUpdateAgent.mAppInfo.packageName);
            parameter.add("versionCode", XiaomiUpdateAgent.mAppInfo.versionCode + "");
            parameter.add("apkHash", XiaomiUpdateAgent.mAppInfo.sourceMD5);
            parameter.add("signature", XiaomiUpdateAgent.mAppInfo.signature);
            parameter.add("sdk", String.valueOf(Client.SDK_VERSION));
            parameter.add(Constants.JSON_VERSION, Client.SYSTEM_VERSION);
            parameter.add(Constants.JSON_LANGUAGE, Client.getLanguage());
            parameter.add(Constants.JSON_COUNTRY, Client.getCountry());
            parameter.add(Constants.JSON_REGION, Client.getRegion());
            parameter.add(Constants.JSON_ANDROID_ID, Client.ANDROID_ID);
            parameter.add("device", Client.getDevice());
            parameter.add("deviceType", String.valueOf(Client.getDeviceType()));
            parameter.add(Constants.JSON_CPU_ARCH, Client.getCpuArch());
            parameter.add("model", Client.getModel());
            parameter.add(Constants.JSON_XIAOMI_SDK_VERSION, "6");
            parameter.add("debug", XiaomiUpdateAgent.sDebug ? "1" : "0");
            parameter.add(Constants.JSON_MIUI_BIG_VERSION_NAME, Client.getMiuiBigVersionName());
            parameter.add(Constants.JSON_MIUI_BIG_VERSION_CODE, Client.getMiuiBigVersionCode());
            if (XiaomiUpdateAgent.sUseImeiMd5AsIdentifier) {
                parameter.add("imei", Client.getImeiMd5());
            }
            if (Connection.NetworkError.OK == connection.requestJSON()) {
                UpdateInfo unused2 = XiaomiUpdateAgent.mUpdateInfo = parseUpdateInfo(connection.getResponse());
                if (XiaomiUpdateAgent.mUpdateInfo != null) {
                    Log.i(XiaomiUpdateAgent.TAG, XiaomiUpdateAgent.mUpdateInfo.toString());
                    return Integer.valueOf(XiaomiUpdateAgent.mUpdateInfo.fitness == 0 ? 0 : 1);
                }
            }
            return 4;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Integer num) {
            boolean unused = XiaomiUpdateAgent.mIsLoading = false;
            Context context = (Context) XiaomiUpdateAgent.mContext.get();
            if (context == null) {
                return;
            }
            if (XiaomiUpdateAgent.mAutoPopup && (context instanceof Activity)) {
                if (num.intValue() != 0) {
                    return;
                }
                new CheckDownloadTask().execute(new Void[0]);
                return;
            }
            UpdateResponse updateResponse = new UpdateResponse();
            if (num.intValue() == 0) {
                updateResponse.updateLog = XiaomiUpdateAgent.mUpdateInfo.updateLog;
                updateResponse.versionCode = XiaomiUpdateAgent.mUpdateInfo.versionCode;
                updateResponse.versionName = XiaomiUpdateAgent.mUpdateInfo.versionName;
                updateResponse.apkSize = XiaomiUpdateAgent.mUpdateInfo.apkSize;
                updateResponse.apkHash = XiaomiUpdateAgent.mUpdateInfo.apkHash;
                updateResponse.diffSize = XiaomiUpdateAgent.mUpdateInfo.diffSize;
                updateResponse.path = Connection.connect(XiaomiUpdateAgent.mUpdateInfo.host, XiaomiUpdateAgent.mUpdateInfo.apkUrl);
            }
            if (XiaomiUpdateAgent.mUpdateListener != null) {
                XiaomiUpdateAgent.mUpdateListener.onUpdateReturned(num.intValue(), updateResponse);
            }
        }
    }

    public static class UpdateInfo {
        public String apkHash;
        public long apkSize;
        public String apkUrl;
        public long diffSize;
        public int fitness;
        public String host;
        public int source;
        public String updateLog;
        public int versionCode;
        public String versionName;
        public String diffUrl = "";
        public String diffHash = "";

        public String toString() {
            return "UpdateInfo:\nhost = " + this.host + "\nfitness = " + this.fitness + "\nupdateLog = " + this.updateLog + "\nversionCode = " + this.versionCode + "\nversionName = " + this.versionName + "\napkUrl = " + this.apkUrl + "\napkHash = " + this.apkHash + "\napkSize = " + this.apkSize + "\ndiffUrl = " + this.diffUrl + "\ndiffHash = " + this.diffHash + "\ndiffSize = " + this.diffSize;
        }
    }

    static {
        mUpdateMethod = Utils.isMiuiPad() ? Constants.UpdateMethod.DOWNLOAD_MANAGER : Constants.UpdateMethod.MARKET;
    }

    public static void arrange() {
        Context context = mContext.get();
        if (context == null) {
            return;
        }
        Client.init(context);
        openMarketOrArrange();
    }

    public static LocalAppInfo getAppInfo(Context context) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        LocalAppInfo localAppInfo = LocalAppInfo.get(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        try {
            packageInfo = packageManager.getPackageInfo(localAppInfo.packageName, 64);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "get package info failed");
            packageInfo = null;
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
            return null;
        }
        localAppInfo.displayName = packageManager.getApplicationLabel(applicationInfo).toString();
        localAppInfo.versionCode = packageInfo.versionCode;
        localAppInfo.versionName = packageInfo.versionName;
        localAppInfo.signature = Coder.encodeMD5(String.valueOf(packageInfo.signatures[0].toChars()));
        localAppInfo.sourceDir = packageInfo.applicationInfo.sourceDir;
        localAppInfo.sourceMD5 = Coder.encodeMD5(new File(localAppInfo.sourceDir));
        return localAppInfo;
    }

    public static Context getContext() {
        return mContext.get();
    }

    public static long getDownloadId() {
        return DownloadInstallManager.getManager(AppGlobal.getContext()).getDowloadId();
    }

    public static int getSDKVersion() {
        return 6;
    }

    public static void openMarketOrArrange() {
        ActivityInfo activityInfo;
        Context context = mContext.get();
        if (context == null || mUpdateInfo == null || mAppInfo == null) {
            return;
        }
        if (mUpdateMethod.equals(Constants.UpdateMethod.MARKET) && mUpdateInfo.source != 1 && Utils.isMiuiMarketExisted(context)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?ref=update_sdk&back=true&id=" + mAppInfo.packageName));
            intent.setPackage(Utils.getMarketPackageName());
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() == 1 && (activityInfo = listQueryIntentActivities.get(0).activityInfo) != null && activityInfo.exported && activityInfo.enabled) {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return;
            }
        }
        DownloadInstallManager.getManager(context).arrange(mAppInfo, mUpdateInfo);
    }

    public static void setCheckUpdateOnlyWifi(boolean z) {
        mCheckUpdateOnlyWifi = z;
    }

    public static void setUpdateAutoPopup(boolean z) {
        mAutoPopup = z;
    }

    public static void setUpdateListener(XiaomiUpdateListener xiaomiUpdateListener) {
        mUpdateListener = xiaomiUpdateListener;
    }

    public static void setUpdateMethod(Constants.UpdateMethod updateMethod) {
        mUpdateMethod = updateMethod;
    }

    public static void setUseImeiMd5AsIdentifier(boolean z) {
        sUseImeiMd5AsIdentifier = z;
    }

    public static void setUseInternationalHost(boolean z) {
        Constants.setUseInternalProductUrl(z);
        Constants.configURL();
    }

    public static synchronized void update(Context context) {
        boolean z;
        try {
            Class<?> cls = Class.forName(context.getPackageName() + ".BuildConfig");
            z = cls.getDeclaredField("DEBUG").getBoolean(cls);
        } catch (Exception unused) {
            z = false;
        }
        update(context, z);
    }

    public static synchronized void update(Context context, boolean z) {
        if (context != null) {
            if (!mIsLoading) {
                Utils.DEBUG |= z;
                AppGlobal.setContext(context);
                sDebug = z;
                mIsLoading = true;
                Client.init(context);
                mContext = new WeakReference<>(context);
                if (!mIsInited) {
                    mAppInfo = null;
                    mUpdateInfo = null;
                    Constants.configURL();
                    mIsInited = true;
                }
                new CheckUpdateTask().execute(new Void[0]);
            }
        }
    }
}

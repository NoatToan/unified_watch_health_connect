package ohos.stage.ability.adapter;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Process;
import android.os.Trace;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.AceEnv;
import ohos.ace.adapter.AcePlatformCapability;
import ohos.ace.adapter.AppModeConfig;
import ohos.ace.adapter.ILogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class StageApplicationDelegate {
    private static final String APP_VERSION_CODE = "versionCode";
    private static final String ARCH_ARM = "armeabi-v7a";
    private static final String ARCH_ARM64 = "arm64-v8a";
    private static final String ARCH_X86 = "x86_64";
    private static final String ARKUIX_JSON = "arkui-x.json";
    private static final String ARKUIX_LIBS = "/arkui-x/libs/";
    private static final String ARKUIX_LIB_NAME = "/libarkui_android.so";
    private static final String ASSETS_PATH_KEY = "assets_path_key";
    private static final String ASSETS_SUB_PATH = "arkui-x";
    private static final String CACERT_FILE = "/cacert.ca";
    private static final int COUNT_ONE = 1;
    private static final int COUNT_ZERO = 0;
    private static final String DATABASE_DIR = "/database";
    private static final int DEFAULT_VERSION_CODE = -1;
    private static final int ERR_INVALID_PARAMETERS = -1;
    private static final int ERR_OK = 0;
    private static final String FILES_DIR = "/files";
    private static final String KEY_LANGUAGE = "app_language";
    private static final String LANGUAGE_SHARE_PREFERENCE = "language_prefs";
    private static final String LOAD_MODULE_PATH_REGEX = "^\\./ets/([^/]+/)*[^/]+$";
    private static final int LOG_MAX = 4;
    private static final int LOG_MIN = 0;
    private static final String LOG_TAG = "StageApplicationDelegate";
    private static final String PREFERENCE_DIR = "/preference";
    private static final String RESOURCES_DIR = "resources";
    private static final String SHARED_PREFERENCES_NAME = "assets_path";
    private static final String SYSTEMRES_DIR = "systemres";
    private static final String TEMP_DIR = "/temp";
    private static final String WANT_PARAMS = "params";
    private static boolean isCopyNativeLibs = false;
    private static boolean isCopyResources = false;
    private static boolean isInitialized = false;
    private Application stageApplication = null;
    private volatile Activity topActivity = null;
    private AcePlatformCapability platformCapability = null;
    private AtomicInteger activityCount = new AtomicInteger(0);
    private boolean isBackground = false;
    private String assetsModulePath = "";
    private boolean shouldLoadUI = true;
    private ContentObserver fontScaleObserver = new ContentObserver(new Handler()) { // from class: ohos.stage.ability.adapter.StageApplicationDelegate.1
        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            if (StageApplicationDelegate.this.stageApplication != null) {
                float f = Settings.System.getFloat(StageApplicationDelegate.this.stageApplication.getContentResolver(), "font_scale", 1.0f);
                Configuration configuration = StageApplicationDelegate.this.stageApplication.getResources().getConfiguration();
                configuration.fontScale = f;
                StageApplicationDelegate.this.onConfigurationChanged(configuration);
                return;
            }
            ALog.e(StageApplicationDelegate.LOG_TAG, "stageApplication is null");
        }
    };

    private native void nativeAttachStageApplicationDelegate(StageApplicationDelegate stageApplicationDelegate);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDispatchApplicationOnBackground();

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDispatchApplicationOnForeground();

    private native void nativeInitConfiguration(String str);

    private native void nativeLaunchApplication(boolean z, boolean z2);

    protected static native void nativeLoadModule(String str, String str2);

    private native void nativeOnConfigurationChanged(String str);

    protected static native void nativePreloadModule(String str, String str2);

    private native void nativeSetAppLibDir(String str);

    private native void nativeSetAssetManager(Object obj);

    private native void nativeSetAssetsFileRelativePath(String str);

    private native void nativeSetCacheDir(String str);

    private native void nativeSetFileDir(String str);

    private native void nativeSetHapPath(String str);

    private native void nativeSetIsDynamicLoadLibs(boolean z);

    private native void nativeSetLocale(String str, String str2, String str3);

    private native void nativeSetLogLevel(int i);

    private native void nativeSetLogger(Object obj);

    private native void nativeSetPackageName(String str);

    private native void nativeSetPidAndUid(int i, int i2);

    private native void nativeSetResourcesFilePrefixPath(String str);

    public StageApplicationDelegate() {
        ALog.i(LOG_TAG, "Constructor called.");
    }

    public boolean loadLibraryFromAppData() {
        String str;
        try {
            String str2 = this.stageApplication.getApplicationContext().getApplicationInfo().nativeLibraryDir;
            String strSubstring = str2.substring(str2.lastIndexOf(47) + 1);
            if ("arm64".equals(strSubstring)) {
                str = ARCH_ARM64;
            } else if ("arm".equals(strSubstring)) {
                str = ARCH_ARM;
            } else {
                str = ARCH_X86;
            }
            ALog.i(LOG_TAG, "Current system CPU architecture : ".concat(str));
            String str3 = this.stageApplication.getApplicationContext().getFilesDir().getPath() + ARKUIX_LIBS + str + ARKUIX_LIB_NAME;
            ALog.i(LOG_TAG, "Dynamically loading path : " + str3);
            System.load(str3);
            return true;
        } catch (UnsatisfiedLinkError e) {
            ALog.e(LOG_TAG, "System.load failed " + e.getMessage());
            return false;
        }
    }

    public void initApplication(Application application) {
        ALog.i(LOG_TAG, "init application.");
        if (isInitialized) {
            if (isCopyResources) {
                return;
            }
            ALog.i(LOG_TAG, "The application is initialized, but copy resource failed.");
            this.stageApplication = application;
            copyAllModuleResources();
            return;
        }
        isInitialized = true;
        this.stageApplication = application;
        boolean zIsDynamicUpdateLibs = isDynamicUpdateLibs();
        if (zIsDynamicUpdateLibs) {
            if (!loadLibraryFromAppData()) {
                AceEnv.getInstance().isLibraryLoaded();
            }
        } else if (!AceEnv.getInstance().isLibraryLoaded()) {
            loadLibraryFromAppData();
        }
        Trace.beginSection("initApplication");
        AppModeConfig.initAppMode();
        if (ALog.getLogger() != null) {
            nativeSetLogger(ALog.getLogger());
            nativeSetLogLevel(ALog.getLoggerLevel());
        }
        attachStageApplication();
        Context applicationContext = this.stageApplication.getApplicationContext();
        setPidAndUid(Process.myPid(), getUid(applicationContext));
        Trace.beginSection("prepareAssets");
        setIsDynamicLoadLibs(zIsDynamicUpdateLibs);
        setHapPath(applicationContext.getPackageCodePath());
        setNativeAssetManager(this.stageApplication.getAssets());
        nativeSetAppLibDir(applicationContext.getApplicationInfo().nativeLibraryDir);
        createStagePath();
        try {
            if (this.stageApplication.getAssets().list(ASSETS_SUB_PATH).length != 0) {
                copyAllModuleResources();
                setAssetsFileRelativePath(this.assetsModulePath);
            }
        } catch (Exception e) {
            ALog.e(LOG_TAG, "get Assets path failed, error: " + e.getMessage());
        }
        setResourcesFilePrefixPath(this.stageApplication.getApplicationContext().getFilesDir().getPath() + "/arkui-x");
        setLocaleInfo();
        Trace.endSection();
        launchApplication();
        initConfiguration();
        setPackageName();
        File externalFilesDir = this.stageApplication.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            createCacertFile(externalFilesDir.getAbsolutePath());
        }
        initActivity();
        initPlatformCapability(applicationContext);
        this.stageApplication.getContentResolver().registerContentObserver(Settings.System.getUriFor("font_scale"), true, this.fontScaleObserver);
        Trace.endSection();
    }

    private void initActivity() {
        this.stageApplication.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: ohos.stage.ability.adapter.StageApplicationDelegate.2
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                StageApplicationDelegate.this.activityCount.getAndIncrement();
                if (StageApplicationDelegate.this.activityCount.get() == 1 && StageApplicationDelegate.this.isBackground) {
                    StageApplicationDelegate.this.isBackground = false;
                    StageApplicationDelegate.this.nativeDispatchApplicationOnForeground();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                StageApplicationDelegate.this.topActivity = activity;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                StageApplicationDelegate.this.activityCount.getAndDecrement();
                if (StageApplicationDelegate.this.activityCount.get() <= 0 && !StageApplicationDelegate.this.isBackground) {
                    StageApplicationDelegate.this.isBackground = true;
                    StageApplicationDelegate.this.nativeDispatchApplicationOnBackground();
                }
                if (StageApplicationDelegate.this.topActivity == activity) {
                    StageApplicationDelegate.this.topActivity = null;
                }
            }
        });
    }

    private int getUid(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                ALog.d(LOG_TAG, "get uid when package manager is null");
                return 0;
            }
            return packageManager.getApplicationInfo(this.stageApplication.getPackageName(), 128).uid;
        } catch (PackageManager.NameNotFoundException e) {
            ALog.e(LOG_TAG, "get uid failed, error: " + e.getMessage());
            return 0;
        }
    }

    private String getAssetsPath(boolean z) {
        Application application = this.stageApplication;
        if (application == null) {
            ALog.e(LOG_TAG, "stageApplication is null");
            return "";
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        if (sharedPreferences == null) {
            ALog.e(LOG_TAG, "sharedPreferences is null");
            return "";
        }
        String string = sharedPreferences.getString(ASSETS_PATH_KEY, "");
        if (!string.isEmpty() && !z) {
            return string;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit == null) {
            ALog.e(LOG_TAG, "edit is null");
            return "";
        }
        String strRouterTraverseAssets = routerTraverseAssets(ASSETS_SUB_PATH);
        editorEdit.putString(ASSETS_PATH_KEY, strRouterTraverseAssets);
        editorEdit.commit();
        return strRouterTraverseAssets;
    }

    public String routerTraverseAssets(String str) {
        ArrayList arrayList = new ArrayList();
        traverseAssets(arrayList, str);
        Iterator<String> it = arrayList.iterator();
        String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + it.next() + ";";
        }
        return str2;
    }

    private void traverseAssets(List<String> list, String str) {
        String str2;
        try {
            String[] list2 = this.stageApplication.getAssets().list(str);
            if (list2 != null && list2.length > 0) {
                for (int i = 0; i < list2.length; i++) {
                    if (list2[i].contains(".")) {
                        list.add(str + "/" + list2[i]);
                    }
                    if ("".equals(str)) {
                        str2 = list2[i];
                    } else {
                        if (!RESOURCES_DIR.equals(list2[i]) && !SYSTEMRES_DIR.equals(list2[i])) {
                            str2 = str + "/" + list2[i];
                        }
                    }
                    traverseAssets(list, str2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void makeNewDir(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    private void createStagePath() {
        String path = this.stageApplication.getApplicationContext().getFilesDir().getPath();
        String[] strArr = {TEMP_DIR, FILES_DIR, PREFERENCE_DIR, DATABASE_DIR, "/arkui-x"};
        for (int i = 0; i < 5; i++) {
            makeNewDir(path + strArr[i]);
        }
        setFileDir(path);
        setCacheDir(this.stageApplication.getApplicationContext().getCacheDir().getPath());
    }

    private void copyAllModuleResources() throws Throwable {
        if (this.stageApplication == null) {
            ALog.e(LOG_TAG, "stageApplication is null");
            return;
        }
        int appVersionCode = getAppVersionCode();
        if (appVersionCode == -1) {
            ALog.e(LOG_TAG, "Getting app version code failed.");
            return;
        }
        SharedPreferences sharedPreferences = this.stageApplication.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        if (sharedPreferences == null) {
            ALog.e(LOG_TAG, "sharedPreferences is null");
            return;
        }
        isCopyResources = true;
        int i = sharedPreferences.getInt("versionCode", -1);
        boolean zIsApkInDebug = isApkInDebug(this.stageApplication);
        ALog.i(LOG_TAG, "Old version code is: " + i + ", current version code is: " + appVersionCode + ", apk is debug: " + zIsApkInDebug);
        if (!zIsApkInDebug && i >= appVersionCode) {
            this.assetsModulePath = getAssetsPath(false);
            ALog.i(LOG_TAG, "The resource has been copied.");
            return;
        }
        isCopyNativeLibs = true;
        this.assetsModulePath = getAssetsPath(true);
        ALog.i(LOG_TAG, "Start copying resources.");
        AssetManager assets = this.stageApplication.getAssets();
        ArrayList<String> arrayList = new ArrayList();
        try {
            for (String str : assets.list(ASSETS_SUB_PATH)) {
                if (SYSTEMRES_DIR.equals(str)) {
                    arrayList.add(str);
                } else {
                    arrayList.add(str + "/resources");
                    arrayList.add(str + "/resources.index");
                }
            }
        } catch (IOException e) {
            ALog.e(LOG_TAG, "read resources err: " + e.getMessage());
            isCopyResources = false;
        }
        if (arrayList.isEmpty()) {
            ALog.e(LOG_TAG, "The moduleResources is empty.");
        }
        for (String str2 : arrayList) {
            copyFilesFromAssets("arkui-x/" + str2, this.stageApplication.getApplicationContext().getFilesDir().getPath() + "/arkui-x/" + str2);
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (editorEdit == null) {
            ALog.e(LOG_TAG, "edit is null");
        } else if (isCopyResources) {
            ALog.i(LOG_TAG, "resource copy success.");
            editorEdit.putInt("versionCode", appVersionCode);
            editorEdit.commit();
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[SYNTHETIC] */
    private void copyFilesFromAssets(String str, String str2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException e;
        InputStream inputStreamOpen;
        StringBuilder sb;
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            String[] list = this.stageApplication.getAssets().list(str);
            File file = new File(str2);
            if (list.length > 0) {
                if (!file.exists()) {
                    file.mkdirs();
                }
                for (String str3 : list) {
                    copyFilesFromAssets(str + "/" + str3, str2 + "/" + str3);
                }
                fileOutputStream = null;
            } else {
                inputStreamOpen = this.stageApplication.getAssets().open(str);
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStreamOpen.read(bArr);
                                if (i == -1) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                sb.append(e.getMessage());
                                ALog.e(LOG_TAG, sb.toString());
                                return;
                            }
                            fileOutputStream.flush();
                            inputStream2 = inputStreamOpen;
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream2 = fileOutputStream;
                            ALog.e(LOG_TAG, "read or write data err: " + e.getMessage());
                            isCopyResources = false;
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException e3) {
                                    ALog.e(LOG_TAG, "InputStream close err: " + e3.getMessage());
                                }
                            }
                            if (fileOutputStream2 == null) {
                                return;
                            }
                            try {
                                fileOutputStream2.close();
                                return;
                            } catch (IOException e4) {
                                e = e4;
                                sb = new StringBuilder("FileOutputStream close err: ");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStreamOpen;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e5) {
                                    ALog.e(LOG_TAG, "InputStream close err: " + e5.getMessage());
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException e6) {
                                    ALog.e(LOG_TAG, "FileOutputStream close err: " + e6.getMessage());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e7) {
                        e = e7;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                }
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e8) {
                    ALog.e(LOG_TAG, "InputStream close err: " + e8.getMessage());
                }
            }
            if (fileOutputStream == null) {
                return;
            }
            try {
                fileOutputStream.close();
            } catch (IOException e9) {
                e = e9;
                sb = new StringBuilder("FileOutputStream close err: ");
            }
        } catch (IOException e10) {
            e = e10;
            inputStreamOpen = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
                throw th;
            }
            throw th;
        }
    }

    private void initConfiguration() {
        ALog.i(LOG_TAG, "StageApplication initConfiguration called");
        float f = Settings.System.getFloat(this.stageApplication.getContentResolver(), "font_scale", 1.0f);
        Configuration configuration = this.stageApplication.getResources().getConfiguration();
        configuration.fontScale = f;
        nativeInitConfiguration(StageConfiguration.convertConfiguration(configuration, getDeviceTypeByPhysicalSize()).toString());
    }

    private void initPlatformCapability(Context context) {
        this.platformCapability = new AcePlatformCapability(context);
    }

    private double getDeviceTypeByPhysicalSize() {
        WindowManager windowManager = (WindowManager) this.stageApplication.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (windowManager == null) {
            return 0.0d;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d));
    }

    public Object getRunningProcessInfo() {
        ArrayList arrayList = new ArrayList();
        ActivityManager activityManager = (ActivityManager) this.stageApplication.getSystemService("activity");
        if (activityManager == null) {
            ALog.e(LOG_TAG, "activityMgr is null");
            return arrayList;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            ALog.e(LOG_TAG, "processList is null");
            return arrayList;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            RunningProcessInfo runningProcessInfo = new RunningProcessInfo();
            runningProcessInfo.pid = runningAppProcessInfo.pid;
            runningProcessInfo.processName = runningAppProcessInfo.processName;
            runningProcessInfo.pkgList = Arrays.asList(runningAppProcessInfo.pkgList);
            arrayList.add(runningProcessInfo);
        }
        return arrayList;
    }

    public int finishUserTest() {
        ALog.i(LOG_TAG, "Finish user test called");
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        this.stageApplication.getApplicationContext().startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(0);
        return 0;
    }

    public String getTopActivity() {
        if (this.topActivity == null || !(this.topActivity instanceof StageActivity)) {
            return null;
        }
        return ((StageActivity) this.topActivity).getInstanceName();
    }

    public void print(String str) {
        if (str.length() <= 1000) {
            ALog.i(LOG_TAG, "print message: " + str);
            return;
        }
        ALog.w(LOG_TAG, "print: The total length of the message exceed 1000 characters.");
    }

    public int startActivity(String str, String str2, String str3) {
        ComponentName componentName;
        ALog.i(LOG_TAG, "startActivity called, bundleName: " + str + ", activityName: " + str2);
        try {
            Intent intent = new Intent();
            if (this.stageApplication.getApplicationContext().getPackageName().equals(str)) {
                componentName = new ComponentName(this.stageApplication.getApplicationContext(), str2);
            } else {
                componentName = new ComponentName(str, str2);
            }
            intent.setComponent(componentName);
            intent.putExtra("params", str3);
            intent.addFlags(268435456);
            this.stageApplication.getApplicationContext().startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException unused) {
            ALog.e("StageApplication", "start activity err.");
            return -1;
        }
    }

    public void setIsDynamicLoadLibs(boolean z) {
        nativeSetIsDynamicLoadLibs(z);
    }

    public void setNativeAssetManager(AssetManager assetManager) {
        nativeSetAssetManager(assetManager);
    }

    public void setHapPath(String str) {
        nativeSetHapPath(str);
    }

    public void setAssetsFileRelativePath(String str) {
        nativeSetAssetsFileRelativePath(str);
    }

    public void launchApplication() {
        ALog.i(LOG_TAG, "isCopyNativeLibs is " + isCopyNativeLibs);
        Application application = this.stageApplication;
        if (application != null && (application instanceof StageApplication)) {
            this.shouldLoadUI = ((StageApplication) application).onShouldLoadUI();
        }
        nativeLaunchApplication(isCopyNativeLibs, this.shouldLoadUI);
    }

    public void setCacheDir(String str) {
        nativeSetCacheDir(str);
    }

    public void setFileDir(String str) {
        nativeSetFileDir(str);
    }

    public void setResourcesFilePrefixPath(String str) {
        nativeSetResourcesFilePrefixPath(str);
    }

    public void setPidAndUid(int i, int i2) {
        nativeSetPidAndUid(i, i2);
    }

    public void onConfigurationChanged(Configuration configuration) {
        Application application = this.stageApplication;
        if (application != null) {
            configuration.fontScale = Settings.System.getFloat(application.getContentResolver(), "font_scale", 1.0f);
        }
        setLocaleInfo();
        nativeOnConfigurationChanged(StageConfiguration.convertConfiguration(configuration, -1.0d).toString());
    }

    public void setLocale(String str, String str2, String str3) {
        nativeSetLocale(str, str2, str3);
    }

    public void attachStageApplication() {
        nativeAttachStageApplicationDelegate(this);
    }

    private void setPackageName() {
        String packageName = this.stageApplication.getApplicationContext().getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        nativeSetPackageName(packageName);
    }

    private void setLocaleInfo() {
        String script;
        Locale localeForLanguageTag = Resources.getSystem().getConfiguration().getLocales().get(0);
        String appPreferredLanguage = getAppPreferredLanguage(this.stageApplication.getApplicationContext());
        if (!appPreferredLanguage.isEmpty()) {
            localeForLanguageTag = Locale.forLanguageTag(appPreferredLanguage);
        }
        String language = localeForLanguageTag.getLanguage();
        ALog.i(LOG_TAG, "language: " + language);
        language.hashCode();
        if (language.equals("bo")) {
            script = "Tibt";
        } else if (language.equals("ug")) {
            script = "Arab";
        } else {
            script = localeForLanguageTag.getScript();
        }
        setLocale(language, localeForLanguageTag.getCountry(), script);
    }

    private void readFile(BufferedWriter bufferedWriter, File file) {
        if (!file.isFile() || !file.canRead()) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getPath()));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                    } else {
                        bufferedReader.close();
                        return;
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            }
        } catch (FileNotFoundException e) {
            ALog.e(LOG_TAG, "read cacert err: " + e.getMessage());
        } catch (IOException e2) {
            ALog.e(LOG_TAG, "read cacert err: " + e2.getMessage());
        }
    }

    private void createCacertFile(String str) {
        try {
            File file = new File(str + CACERT_FILE);
            if (file.exists()) {
                file.deleteOnExit();
            }
            if (!file.createNewFile()) {
                return;
            }
        } catch (IOException e) {
            ALog.e(LOG_TAG, "write cacert err: " + e.getMessage());
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str + CACERT_FILE));
            try {
                File[] fileArrListFiles = new File("/system/etc/security/cacerts/").listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        readFile(bufferedWriter, file2);
                    }
                }
                bufferedWriter.close();
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            ALog.e(LOG_TAG, "read cacert err: " + e2.getMessage());
        } catch (IOException e3) {
            ALog.e(LOG_TAG, "read cacert err: " + e3.getMessage());
        }
    }

    private int getAppVersionCode() {
        try {
            return this.stageApplication.getApplicationContext().getPackageManager().getPackageInfo(this.stageApplication.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            ALog.e(LOG_TAG, "Getting package info err: " + e.getMessage());
            return -1;
        }
    }

    private boolean isApkInDebug(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            ALog.e(LOG_TAG, "Getting is apk in debug err: " + e.getMessage());
            return false;
        }
    }

    public void setLogger(ILogger iLogger, int i) {
        if (i < 0 || i > 4) {
            ALog.e(LOG_TAG, "logLevel is invalid.");
        } else {
            ALog.setLogger(iLogger);
            ALog.setLoggerLevel(i);
        }
    }

    public void setLogInterface(ILogger iLogger) {
        try {
            ALog.setLogger(iLogger);
            nativeSetLogger(iLogger);
        } catch (UnsatisfiedLinkError unused) {
            ALog.e(LOG_TAG, "logInterface: JNI is not registered.");
        }
    }

    public void setLogLevel(int i) {
        try {
            if (i < 0 || i > 4) {
                ALog.e(LOG_TAG, "logLevel is invalid.");
            } else {
                ALog.setLoggerLevel(i);
                nativeSetLogLevel(i);
            }
        } catch (UnsatisfiedLinkError unused) {
            ALog.e(LOG_TAG, "logInterface: JNI is not registered.");
        }
    }

    private boolean isDynamicUpdateLibs() {
        String strExtractJsonPathsFromAssets = extractJsonPathsFromAssets();
        if (strExtractJsonPathsFromAssets.isEmpty()) {
            return false;
        }
        String assetsFile = readAssetsFile(strExtractJsonPathsFromAssets);
        String jsonFile = readJsonFile(this.stageApplication.getApplicationContext().getFilesDir().getPath() + "/" + strExtractJsonPathsFromAssets);
        if (assetsFile == null || jsonFile == null) {
            ALog.w(LOG_TAG, "File JsonContent is null");
            return false;
        }
        String strExtractVersionFromJson = extractVersionFromJson(assetsFile);
        String strExtractVersionFromJson2 = extractVersionFromJson(jsonFile);
        if (strExtractVersionFromJson.isEmpty() || strExtractVersionFromJson2.isEmpty()) {
            return false;
        }
        return compareVersion(strExtractVersionFromJson, strExtractVersionFromJson2);
    }

    private boolean compareVersion(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 < i3) {
                    return true;
                }
                if (i2 > i3) {
                    return false;
                }
            } catch (NumberFormatException e) {
                ALog.e(LOG_TAG, "Error NumberFormat : " + e.getMessage());
                return false;
            }
        }
        return strArrSplit.length < strArrSplit2.length;
    }

    private String extractVersionFromJson(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                String strOptString = new JSONObject(str).optString("version", "");
                if (!strOptString.isEmpty()) {
                    return strOptString;
                }
            } catch (JSONException e) {
                ALog.e(LOG_TAG, "Error JSON : " + e.getMessage());
            }
        }
        return "";
    }

    private String extractJsonPathsFromAssets() {
        String assetsPath = getAssetsPath(true);
        if (assetsPath != null && !assetsPath.isEmpty()) {
            for (String str : assetsPath.split(";")) {
                if (str.contains(ARKUIX_JSON)) {
                    return str;
                }
            }
            return "";
        }
        return "";
    }

    private String readAssetsFile(String str) {
        try {
            InputStream inputStreamOpen = this.stageApplication.getAssets().open(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        try {
                            throw th;
                        } catch (Throwable th) {
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    return string;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            th3.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        } catch (IOException e) {
            ALog.e(LOG_TAG, "assets reading err: " + e.getMessage());
            return null;
        }
    }

    private String readJsonFile(String str) {
        File file = new File(str);
        if (!file.exists()) {
            ALog.e(LOG_TAG, "File does not exist: " + str);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        String string = sb.toString();
                        bufferedReader.close();
                        return string;
                    }
                    ALog.e(LOG_TAG, "reading err: " + e.getMessage());
                    return null;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            ALog.e(LOG_TAG, "reading err: " + e.getMessage());
            return null;
        }
    }

    public static Context attachLanguageContext(Context context) {
        String appPreferredLanguage = getAppPreferredLanguage(context);
        if (context.getResources() == null || appPreferredLanguage.isEmpty()) {
            return context;
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(appPreferredLanguage);
        Configuration configuration = new Configuration();
        configuration.setLocale(localeForLanguageTag);
        configuration.setLocales(new LocaleList(localeForLanguageTag));
        return context.createConfigurationContext(configuration);
    }

    private static String getAppPreferredLanguage(Context context) {
        String string = context.getSharedPreferences(LANGUAGE_SHARE_PREFERENCE, 0).getString(KEY_LANGUAGE, null);
        return (string == null || string.isEmpty()) ? "" : string;
    }

    public void initApplication(Application application, boolean z) {
        this.shouldLoadUI = z;
        initApplication(application);
    }

    public static void loadModule(String str, String str2) {
        if (!isInitialized) {
            ALog.e(LOG_TAG, "Application is not initialized.");
            return;
        }
        if (str == null || str.isEmpty()) {
            ALog.e(LOG_TAG, "moduleName is invalid.");
        } else if (str2 == null || str2.isEmpty() || !str2.matches(LOAD_MODULE_PATH_REGEX)) {
            ALog.e(LOG_TAG, "entryFile is invalid.");
        } else {
            nativeLoadModule(str, str2);
        }
    }
}

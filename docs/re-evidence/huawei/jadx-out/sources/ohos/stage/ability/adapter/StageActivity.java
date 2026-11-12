package ohos.stage.ability.adapter;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.FileUriExposedException;
import android.os.Trace;
import android.webkit.MimeTypeMap;
import androidx.core.util.Consumer;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.AceEnv;
import ohos.ace.adapter.AcePlatformPlugin;
import ohos.ace.adapter.ArkUIXPluginRegistry;
import ohos.ace.adapter.FoldManager;
import ohos.ace.adapter.FoldManager$$ExternalSyntheticLambda2;
import ohos.ace.adapter.FoldManager$$ExternalSyntheticLambda3;
import ohos.ace.adapter.PluginContext;
import ohos.ace.adapter.WindowViewAospInterface;
import ohos.ace.adapter.WindowViewBuilder;
import ohos.ace.adapter.WindowViewInterface;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.grantresult.GrantResult;
import ohos.ace.adapter.capability.keyboard.KeyboardHeightObserver;
import ohos.ace.adapter.capability.keyboard.KeyboardHeightProvider;
import ohos.ace.adapter.capability.platformview.AcePlatformViewPluginAosp;
import ohos.ace.adapter.capability.platformview.PlatformViewFactory;
import ohos.ace.adapter.capability.video.AceVideoPluginAosp;
import ohos.ace.adapter.capability.web.AceWebPluginAosp;
import ohos.ace.adapter.capability.web.AceWebPluginBase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class StageActivity extends Activity implements KeyboardHeightObserver {
    private static final Map<String, String> ACTION_MAPPING;
    private static final int ANDROID_API_31 = 31;
    private static final String ARKUI_X_DIR = "arkui-x";
    private static final Map<String, String> ENTITY_MAPPING;
    private static final int ERR_INVALID_PARAMETERS = -1;
    private static final int ERR_OK = 0;
    private static final String FILE_ALL_TYPE = "*/*";
    private static final String FILE_PICKER = "com.ohos.filepicker";
    private static final String FILE_URI_KEY = "ability.params.stream";
    private static final String INSTANCE_DEFAULT_NAME = "default";
    private static final String LOG_TAG = "StageActivity";
    private static final String MULTIPLE = "multipleselect";
    private static final String PHOTO_PICKER = "com.ohos.photos";
    private static final String PHOTO_URI_KEY = "select-item-list";
    private static final String PHOTO_VIDEO_TYPE = "image/*;video/*";
    private static final int RESULTCODE_ERROR = 1;
    private static final int RESULTCODE_OK = 0;
    private static final int RESULT_OK = -1;
    private static final String TEST_PARAMS = "test";
    private static final String WANT_PARAMS = "params";
    private static final int WANT_PARAMS_TYPE = 10;
    private static boolean isForResult;
    private static boolean isFrist;
    private String abilityName;
    private String bundleName;
    private String instanceName;
    private KeyboardHeightProvider keyboardHeightProvider;
    private String moduleName;
    private int requestCode = 0;
    private int instanceId = InstanceIdGenerator.getAndIncrement();
    private StageActivityDelegate activityDelegate = null;
    private WindowViewAospInterface windowView = null;
    private AcePlatformPlugin platformPlugin = null;
    private BridgeManager bridgeManager = null;
    private Set<String> pluginList = new HashSet();
    private ArkUIXPluginRegistry arkUIXPluginRegistry = null;
    private PluginContext pluginContext = null;
    private AcePlatformViewPluginAosp platformViewPluginAosp = null;
    private WindowInfoTrackerCallbackAdapter foldWindowInfoCallback = null;
    private Consumer<WindowLayoutInfo> foldConsumer = null;

    public boolean isUseSurfaceView() {
        return true;
    }

    @Override // ohos.ace.adapter.capability.keyboard.KeyboardHeightObserver
    public void onAvoidAreaChanged() {
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ACTION_MAPPING = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        ENTITY_MAPPING = concurrentHashMap2;
        isForResult = true;
        isFrist = false;
        concurrentHashMap.put("ohos.want.action.viewData", CommonConstant.ACTION.HWID_SCHEME_URL);
        concurrentHashMap2.put("entity.system.browsable", "android.intent.category.BROWSABLE");
    }

    @Override // ohos.ace.adapter.capability.keyboard.KeyboardHeightObserver
    public void onKeyboardHeightChanged(int i) {
        WindowViewAospInterface windowViewAospInterface = this.windowView;
        if (windowViewAospInterface != null) {
            windowViewAospInterface.keyboardHeightChanged(i);
        }
        AcePlatformPlugin acePlatformPlugin = this.platformPlugin;
        if (acePlatformPlugin != null) {
            acePlatformPlugin.keyboardHeightChanged(i);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        ALog.i(LOG_TAG, "StageActivity onCreate called");
        super.onCreate(bundle);
        Trace.beginSection("StageActivity::onCreate");
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("params")) == null) {
            stringExtra = "";
        }
        StageActivityDelegate stageActivityDelegate = new StageActivityDelegate();
        this.activityDelegate = stageActivityDelegate;
        stageActivityDelegate.attachStageActivity(getInstanceName(), this);
        getIntentToCreateDelegator(intent);
        Trace.beginSection("createWindowView");
        this.windowView = WindowViewBuilder.makeWindowViewAosp(this, this.instanceId, isUseSurfaceView());
        Trace.endSection();
        this.windowView.setInstanceId(this.instanceId);
        initPlatformPlugin(this, this.instanceId, this.windowView);
        initArkUIXPluginRegistry();
        Trace.beginSection("setContentView");
        setContentView(this.windowView.getView());
        Trace.endSection();
        this.activityDelegate.setWindowView(getInstanceName(), this.windowView);
        this.activityDelegate.dispatchOnCreate(getInstanceName(), stringExtra);
        Trace.endSection();
        this.keyboardHeightProvider = new KeyboardHeightProvider(this);
        this.windowView.getView().post(new Runnable() { // from class: ohos.stage.ability.adapter.StageActivity.1
            @Override // java.lang.Runnable
            public void run() {
                StageActivity.this.keyboardHeightProvider.start();
            }
        });
    }

    @Override // android.app.Activity
    protected void onStart() {
        ALog.i(LOG_TAG, "StageActivity onStart called");
        super.onStart();
        Trace.beginSection("StageActivity::onStart");
        this.activityDelegate.dispatchOnForeground(getInstanceName(), this);
        this.windowView.foreground();
        AcePlatformPlugin acePlatformPlugin = this.platformPlugin;
        if (acePlatformPlugin != null) {
            acePlatformPlugin.notifyLifecycleChanged(false);
        }
        Trace.endSection();
        this.keyboardHeightProvider.setKeyboardHeightObserver(this);
        SubWindowManager.keepSystemUiVisibility(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        ALog.i(LOG_TAG, "StageActivity onResume called");
        super.onResume();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        String stringExtra;
        ALog.i(LOG_TAG, "StageActivity onNewIntent called");
        super.onNewIntent(intent);
        if (intent == null || (stringExtra = intent.getStringExtra("params")) == null) {
            stringExtra = "";
        }
        this.activityDelegate.dispatchOnNewWant(getInstanceName(), stringExtra);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        ALog.i(LOG_TAG, "StageActivity onRestart called");
        super.onRestart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        ALog.i(LOG_TAG, "StageActivity onStop called");
        super.onStop();
        this.activityDelegate.dispatchOnBackground(getInstanceName());
        this.windowView.background();
        AcePlatformPlugin acePlatformPlugin = this.platformPlugin;
        if (acePlatformPlugin != null) {
            acePlatformPlugin.notifyLifecycleChanged(true);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        ALog.i(LOG_TAG, "StageActivity onDestroy called");
        this.activityDelegate.dispatchOnDestroy(getInstanceName());
        this.windowView.destroy();
        this.arkUIXPluginRegistry.unRegistryAllPlugins();
        this.keyboardHeightProvider.close();
        this.bridgeManager = null;
        AcePlatformPlugin acePlatformPlugin = this.platformPlugin;
        if (acePlatformPlugin != null) {
            acePlatformPlugin.release();
            ALog.i(LOG_TAG, "StageActivity onDestroy platformPlugin release called");
        }
        super.onDestroy();
        ALog.i(LOG_TAG, "StageActivity onDestroy end");
        offFoldStatusChange();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ALog.i(LOG_TAG, "StageActivity onBackPressed called");
        if (this.windowView.backPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ALog.i(LOG_TAG, "StageActivity dump called");
        AceEnv.dump(this.instanceId, str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (!FILE_PICKER.equals(this.bundleName) && !PHOTO_PICKER.equals(this.bundleName)) {
            handleNonPickerActivityResult(i, i2, intent);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (intent == null) {
            return;
        }
        List<String> listExtractUriList = extractUriList(intent);
        if (listExtractUriList.isEmpty()) {
            ALog.w(LOG_TAG, "No data or clip data found in the intent");
        } else {
            this.activityDelegate.dispatchOnActivityResult(getInstanceName(), i, i2 == -1 ? 0 : 1, buildResultJson(listExtractUriList), intent);
        }
    }

    private void handleNonPickerActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        ALog.i(LOG_TAG, "onActivityResult called");
        super.onActivityResult(i, i2, intent);
        if (intent == null || (stringExtra = intent.getStringExtra("params")) == null) {
            stringExtra = "";
        }
        this.activityDelegate.dispatchOnActivityResult(getInstanceName(), i, i2, stringExtra, intent);
    }

    private List<String> extractUriList(Intent intent) {
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        if (data != null) {
            arrayList.add(data.toString());
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            for (int i = 0; i < clipData.getItemCount(); i++) {
                Uri uri = clipData.getItemAt(i).getUri();
                if (uri != null) {
                    arrayList.add(uri.toString());
                }
            }
        }
        return arrayList;
    }

    private String buildResultJson(List<String> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(MedalConstants.EVENT_KEY, PHOTO_PICKER.equals(this.bundleName) ? PHOTO_URI_KEY : FILE_URI_KEY);
            jSONObject2.put("type", 10);
            jSONObject2.put("value", jSONArray.toString());
            jSONObject.put("params", new JSONArray((Collection) Arrays.asList(jSONObject2)));
        } catch (JSONException e) {
            ALog.e(LOG_TAG, "Error creating JSON object: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    public void setInstanceName(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String str2 = str + String.valueOf(this.instanceId);
        this.instanceName = str2;
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length >= 3) {
            this.bundleName = strArrSplit[0];
            this.moduleName = strArrSplit[1];
            this.abilityName = strArrSplit[2];
            String str3 = this.bundleName + "." + this.moduleName;
            if (!isExistDir("arkui-x/" + str3) || strArrSplit.length < 4) {
                return;
            }
            this.moduleName = str3;
            this.instanceName = strArrSplit[0] + ":" + str3 + ":" + strArrSplit[2] + ":" + strArrSplit[3];
        }
    }

    private boolean isExistDir(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        File file = new File(getFilesDir(), str);
        return file.exists() && file.isDirectory();
    }

    public BridgeManager getBridgeManager() {
        if (this.bridgeManager == null) {
            this.bridgeManager = BridgeManager.getInstance();
        }
        return this.bridgeManager;
    }

    public int getInstanceId() {
        return this.instanceId;
    }

    public String getInstanceName() {
        String str = this.instanceName;
        return str == null ? "default" : str;
    }

    private void getIntentToCreateDelegator(Intent intent) {
        if (intent == null) {
            ALog.w(LOG_TAG, "Intent is null.");
            return;
        }
        boolean zHasExtra = intent.hasExtra("test");
        String stringExtra = intent.getStringExtra("bundleName");
        String stringExtra2 = intent.getStringExtra("moduleName");
        String stringExtra3 = intent.getStringExtra("unittest");
        String stringExtra4 = intent.getStringExtra("timeout");
        boolean z = (stringExtra == null || stringExtra2 == null || stringExtra3 == null || stringExtra4 == null) ? false : true;
        if (!zHasExtra || isFrist || !z) {
            ALog.i(LOG_TAG, "No need to start creating abilityDelegate");
            return;
        }
        ALog.i(LOG_TAG, "Start creating abilityDelegate");
        this.activityDelegate.createAbilityDelegator(stringExtra, stringExtra2, stringExtra3, stringExtra4);
        isFrist = true;
    }

    public int startActivity(String str, String str2, String str3) {
        ComponentName componentName;
        ALog.i(LOG_TAG, "startActivity called, bundleName: " + str + ", activityName: " + str2);
        try {
            Intent intent = new Intent();
            String packageName = getApplicationContext().getPackageName();
            ALog.i(LOG_TAG, "Current package name: " + packageName);
            if (packageName.equals(str)) {
                componentName = new ComponentName(getBaseContext(), str2);
            } else {
                componentName = new ComponentName(str, str2);
            }
            intent.setComponent(componentName);
            intent.putExtra("params", str3);
            startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException e) {
            ALog.e("StageApplication", "start activity err: " + e.getMessage());
            return -1;
        }
    }

    public int startActivity(String str, String str2, String str3, String str4) {
        String string;
        isForResult = false;
        try {
            JSONArray jSONArray = new JSONObject(str4).getJSONArray("params");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if ("uri".equals(jSONObject.getString(MedalConstants.EVENT_KEY))) {
                    string = jSONObject.getString("value");
                    return createPicker(str, str3, string);
                }
            }
            string = "";
            return createPicker(str, str3, string);
        } catch (JSONException e) {
            ALog.e(LOG_TAG, "json parse error: " + e.getMessage());
            return -1;
        }
    }

    public int startActivity(String str, String str2, String[] strArr) {
        try {
            String strResolveAction = resolveAction(str);
            if (strResolveAction == null) {
                ALog.e(LOG_TAG, "Unknown action: " + str);
                return -1;
            }
            Intent intent = new Intent(strResolveAction);
            Uri uri = Uri.parse(str2);
            String mimeType = getMimeType(this, uri);
            if (mimeType != null) {
                intent.setDataAndType(uri, mimeType);
            } else {
                intent.setData(uri);
            }
            addCategoriesFromEntities(intent, strArr);
            intent.addFlags(268435456);
            startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException | FileUriExposedException | NullPointerException unused) {
            ALog.w(LOG_TAG, "No available app found for implicit start");
            return -1;
        }
    }

    private int createPicker(String str, String str2, String str3) {
        Intent intent;
        try {
            if (PHOTO_PICKER.equals(str)) {
                intent = new Intent("android.intent.action.PICK");
                if (str2.isEmpty()) {
                    str2 = PHOTO_VIDEO_TYPE;
                }
                intent.setType(str2);
            } else {
                if (!FILE_PICKER.equals(str)) {
                    return -1;
                }
                intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                if (str2.isEmpty()) {
                    str2 = FILE_ALL_TYPE;
                }
                intent.setType(str2);
            }
            if (MULTIPLE.equals(str3)) {
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            }
            if (isForResult) {
                startActivityForResult(intent, this.requestCode);
                return 0;
            }
            startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException e) {
            ALog.e(LOG_TAG, "Activity not found: " + e.getMessage());
            return -1;
        }
    }

    public int startActivityForResult(String str, String str2, String str3, int i) {
        ComponentName componentName;
        ALog.i(LOG_TAG, "startActivityForResult called, bundleName: " + str + ", activityName: " + str2 + ", requestCode: " + i);
        try {
            Intent intent = new Intent();
            String packageName = getApplicationContext().getPackageName();
            ALog.i(LOG_TAG, "Current package name: " + packageName);
            if (packageName.equals(str)) {
                componentName = new ComponentName(getBaseContext(), str2);
            } else {
                componentName = new ComponentName(str, str2);
            }
            intent.setComponent(componentName);
            intent.putExtra("params", str3);
            startActivityForResult(intent, i);
            return 0;
        } catch (ActivityNotFoundException e) {
            ALog.e(LOG_TAG, "start activity for result err: " + e.getMessage());
            return -1;
        }
    }

    public int startActivityForResult(String str, String str2, String str3, String str4, int i) {
        String string;
        this.requestCode = i;
        this.bundleName = str;
        isForResult = true;
        try {
            JSONArray jSONArray = new JSONObject(str4).getJSONArray("params");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if ("uri".equals(jSONObject.getString(MedalConstants.EVENT_KEY))) {
                    string = jSONObject.getString("value");
                    return createPicker(str, str3, string);
                }
            }
            string = "";
            return createPicker(str, str3, string);
        } catch (JSONException e) {
            ALog.e(LOG_TAG, "json parse error: " + e.getMessage());
            return -1;
        }
    }

    public void terminateActivityWithResult(String str, int i) {
        ALog.i(LOG_TAG, "terminateActivityWithResult called, resultCode: " + i);
        Intent intent = new Intent();
        intent.putExtra("params", str);
        setResult(i, intent);
        finish();
    }

    public int doActivityForeground() {
        ALog.i(LOG_TAG, "doActivityForeground called");
        try {
            Intent intent = new Intent(getApplicationContext(), getClass());
            intent.setFlags(131072);
            startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException unused) {
            ALog.e(LOG_TAG, "switch foreground err.");
            return -1;
        }
    }

    public int doActivityBackground() {
        ALog.i(LOG_TAG, "doActivityBackground called");
        try {
            Intent intent = new Intent(getApplicationContext(), getClass());
            intent.setFlags(131072);
            startActivity(intent);
            return 0;
        } catch (ActivityNotFoundException unused) {
            ALog.e(LOG_TAG, "switch background err.");
            return -1;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        ALog.i(LOG_TAG, "StageActivity finish called");
        super.finish();
    }

    private void initPlatformPlugin(Context context, int i, WindowViewInterface windowViewInterface) {
        Trace.beginSection("StageActivity::initPlatformPlugin");
        AcePlatformPlugin acePlatformPlugin = new AcePlatformPlugin(context, i, windowViewInterface.getView());
        this.platformPlugin = acePlatformPlugin;
        windowViewInterface.setInputConnectionClient(acePlatformPlugin);
        this.platformPlugin.initTexturePlugin(i);
        this.platformPlugin.addResourcePlugin(AceVideoPluginAosp.createRegister(context, this.instanceName));
        AceWebPluginBase aceWebPluginBaseCreateRegister = AceWebPluginAosp.createRegister(context, windowViewInterface.getView());
        windowViewInterface.setWebPlugin(aceWebPluginBaseCreateRegister);
        this.platformPlugin.addResourcePlugin(aceWebPluginBaseCreateRegister);
        AcePlatformViewPluginAosp acePlatformViewPluginAospCreateRegister = AcePlatformViewPluginAosp.createRegister(context);
        this.platformViewPluginAosp = acePlatformViewPluginAospCreateRegister;
        this.platformPlugin.addResourcePlugin(acePlatformViewPluginAospCreateRegister);
        windowViewInterface.setPlatformViewPlugin(this.platformViewPluginAosp);
        this.platformPlugin.initSurfacePlugin(context, i);
        Trace.endSection();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        synchronized (this) {
            new GrantResult(getApplicationContext()).onRequestPremissionCallback(strArr, iArr);
        }
    }

    public void addPlugin(String str) {
        if (str == null) {
            ALog.e(LOG_TAG, "plugin name is null!");
            return;
        }
        ALog.d(LOG_TAG, "add plugin: " + str);
        this.pluginList.add(str);
    }

    private void initArkUIXPluginRegistry() {
        Trace.beginSection("StageActivity::intitArkUIXPlugins");
        ArkUIXPluginRegistry arkUIXPluginRegistry = new ArkUIXPluginRegistry(getPluginContext());
        this.arkUIXPluginRegistry = arkUIXPluginRegistry;
        arkUIXPluginRegistry.registryPlugins(this.pluginList);
        Trace.endSection();
    }

    public PluginContext getPluginContext() {
        if (this.pluginContext == null) {
            this.pluginContext = new PluginContext(this, getBridgeManager(), this.moduleName);
        }
        return this.pluginContext;
    }

    public void reportDrawnCompleted() {
        ALog.i(LOG_TAG, "Report fully drawn start." + System.nanoTime());
        reportFullyDrawn();
        ALog.i(LOG_TAG, "Report fully drawn end." + System.nanoTime());
    }

    public void registerPlatformViewFactory(PlatformViewFactory platformViewFactory) {
        AcePlatformViewPluginAosp acePlatformViewPluginAosp = this.platformViewPluginAosp;
        if (acePlatformViewPluginAosp == null) {
            ALog.i(LOG_TAG, "PlatformViewPluginAosp is null");
        } else if (platformViewFactory == null) {
            ALog.i(LOG_TAG, "PlatformViewFactory is null");
        } else {
            acePlatformViewPluginAosp.registerPlatformViewFactory(platformViewFactory);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        WindowViewAospInterface windowViewAospInterface;
        super.onConfigurationChanged(configuration);
        if ((configuration.orientation == 2 || configuration.orientation == 1) && (windowViewAospInterface = this.windowView) != null) {
            windowViewAospInterface.setWindowOrientation(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleFoldStatusChange, reason: merged with bridge method [inline-methods] */
    public void m2062lambda$null$1$ohosstageabilityadapterStageActivity(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getDisplayFeatures().stream().filter(new FoldManager$$ExternalSyntheticLambda2(FoldingFeature.class)).map(new FoldManager$$ExternalSyntheticLambda3(FoldingFeature.class)).findFirst().ifPresent(new java.util.function.Consumer() { // from class: ohos.stage.ability.adapter.StageActivity$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.m2061x4eabe3d((FoldingFeature) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$handleFoldStatusChange$0$ohos-stage-ability-adapter-StageActivity, reason: not valid java name */
    /* synthetic */ void m2061x4eabe3d(FoldingFeature foldingFeature) {
        FoldManager.setFoldable(true);
        int statusFromFeature = FoldManager.getStatusFromFeature(this, foldingFeature);
        FoldManager.setFoldStatus(statusFromFeature);
        this.activityDelegate.dispatchFoldStatusChange(getInstanceName(), statusFromFeature);
    }

    private Consumer<WindowLayoutInfo> getfoldConsumer() {
        Consumer<WindowLayoutInfo> consumer = this.foldConsumer;
        if (consumer != null) {
            return consumer;
        }
        Consumer<WindowLayoutInfo> consumer2 = new Consumer() { // from class: ohos.stage.ability.adapter.StageActivity$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.m2060x15721193((WindowLayoutInfo) obj);
            }
        };
        this.foldConsumer = consumer2;
        return consumer2;
    }

    /* JADX INFO: renamed from: lambda$getfoldConsumer$2$ohos-stage-ability-adapter-StageActivity, reason: not valid java name */
    /* synthetic */ void m2060x15721193(final WindowLayoutInfo windowLayoutInfo) {
        runOnUiThread(new Runnable() { // from class: ohos.stage.ability.adapter.StageActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2062lambda$null$1$ohosstageabilityadapterStageActivity(windowLayoutInfo);
            }
        });
    }

    public String onFoldStatusChange() {
        if (Build.VERSION.SDK_INT < 31) {
            ALog.e(LOG_TAG, "Android SDK needs to be greater than 31!");
            return null;
        }
        if (this.foldWindowInfoCallback != null && this.foldConsumer != null) {
            return this.instanceName;
        }
        try {
            WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter = new WindowInfoTrackerCallbackAdapter(WindowInfoTracker.getOrCreate(this));
            this.foldWindowInfoCallback = windowInfoTrackerCallbackAdapter;
            windowInfoTrackerCallbackAdapter.addWindowLayoutInfoListener(this, new StageActivity$$ExternalSyntheticLambda0(this), getfoldConsumer());
            return this.instanceName;
        } catch (NoClassDefFoundError e) {
            this.foldWindowInfoCallback = null;
            this.foldConsumer = null;
            ALog.e(LOG_TAG, "androidx.window is not support!\n" + e.toString());
            return null;
        }
    }

    public FoldingFeature getFoldingFeatureFromListener() {
        AtomicReference atomicReference = new AtomicReference();
        if (this.foldWindowInfoCallback != null) {
            Consumer<WindowLayoutInfo> consumerWindowLayout = FoldManager.getConsumerWindowLayout(this, atomicReference);
            this.foldWindowInfoCallback.addWindowLayoutInfoListener(this, new StageActivity$$ExternalSyntheticLambda0(this), consumerWindowLayout);
            this.foldWindowInfoCallback.removeWindowLayoutInfoListener(consumerWindowLayout);
        }
        return (FoldingFeature) atomicReference.get();
    }

    public void offFoldStatusChange() {
        Consumer<WindowLayoutInfo> consumer;
        WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter = this.foldWindowInfoCallback;
        if (windowInfoTrackerCallbackAdapter == null || (consumer = this.foldConsumer) == null) {
            return;
        }
        windowInfoTrackerCallbackAdapter.removeWindowLayoutInfoListener(consumer);
        this.foldConsumer = null;
        this.foldWindowInfoCallback = null;
    }

    public WindowInfoTrackerCallbackAdapter getFoldWindowInfoCallback() {
        return this.foldWindowInfoCallback;
    }

    private String resolveAction(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return ACTION_MAPPING.get(str);
    }

    private void addCategoriesFromEntities(Intent intent, String[] strArr) {
        String str;
        if (intent == null || strArr == null) {
            return;
        }
        for (String str2 : strArr) {
            if (str2 != null && (str = ENTITY_MAPPING.get(str2)) != null) {
                intent.addCategory(str);
            }
        }
    }

    private String getMimeType(Context context, Uri uri) {
        if (context == null || uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if ("content".equals(scheme)) {
            return getMimeTypeFromContent(context, uri);
        }
        if ("file".equals(scheme)) {
            return getMimeTypeFromFilePath(uri.toString());
        }
        return null;
    }

    private String getMimeTypeFromContent(Context context, Uri uri) {
        if (context == null || uri == null) {
            return null;
        }
        String type = context.getContentResolver().getType(uri);
        return type == null ? getMimeTypeFromFilePath(uri.toString()) : type;
    }

    private String getMimeTypeFromFilePath(String str) {
        String fileExtensionFromUrl;
        if (str == null || str.isEmpty() || (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str)) == null || fileExtensionFromUrl.isEmpty()) {
            return null;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase(Locale.ROOT));
    }
}

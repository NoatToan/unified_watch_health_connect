package ohos.stage.ability.adapter;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.FileUriExposedException;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.AceEnv;
import ohos.ace.adapter.AcePlatformPlugin;
import ohos.ace.adapter.ArkUIXPluginRegistry;
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

/* JADX INFO: loaded from: classes.dex */
public class StageFragment extends Fragment implements KeyboardHeightObserver {
    private static final Map<String, String> ACTION_MAPPING;
    private static final Map<String, String> ENTITY_MAPPING;
    private static final int ERR_INVALID_PARAMETERS = -1;
    private static final int ERR_OK = 0;
    private static final String FILE_ALL_TYPE = "*/*";
    private static final String FILE_PICKER = "com.ohos.filepicker";
    private static final String FILE_URI_KEY = "ability.params.stream";
    private static final String INSTANCE_DEFAULT_NAME = "default";
    private static final String LOG_TAG = "StageFragment";
    private static final String MULTIPLE = "multipleselect";
    private static final String PHOTO_PICKER = "com.ohos.photos";
    private static final String PHOTO_URI_KEY = "select-item-list";
    private static final String PHOTO_VIDEO_TYPE = "image/*;video/*";
    private static final int RESULTCODE_ERROR = 1;
    private static final int RESULTCODE_OK = 0;
    private static final int RESULT_OK = -1;
    private static final String WANT_PARAMS = "params";
    private static final int WANT_PARAMS_TYPE = 10;
    private static boolean isForResult;
    private String abilityName;
    private String bundleName;
    private FrameLayout framelayout;
    private String instanceName;
    private boolean isToResume;
    private KeyboardHeightProvider keyboardHeightProvider;
    private String moduleName;
    private int requestCode = 0;
    private int instanceId = InstanceIdGenerator.getAndIncrement();
    private StageFragmentDelegate fragmentDelegate = null;
    private WindowViewAospInterface windowView = null;
    private AcePlatformPlugin platformPlugin = null;
    private BridgeManager bridgeManager = null;
    private Set<String> pluginList = new HashSet();
    private ArkUIXPluginRegistry arkUIXPluginRegistry = null;
    private PluginContext pluginContext = null;
    private AcePlatformViewPluginAosp platformViewPluginAosp = null;
    private boolean isBackground = true;

    @Override // ohos.ace.adapter.capability.keyboard.KeyboardHeightObserver
    public void onAvoidAreaChanged() {
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ACTION_MAPPING = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        ENTITY_MAPPING = concurrentHashMap2;
        isForResult = true;
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

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        ALog.i(LOG_TAG, "OnCreate called, instance name:" + getInstanceName());
        super.onCreate(bundle);
        Trace.beginSection("StageFragment::onCreate");
        StageFragmentDelegate stageFragmentDelegate = new StageFragmentDelegate();
        this.fragmentDelegate = stageFragmentDelegate;
        stageFragmentDelegate.attachStageFragment(getInstanceName(), this);
        Trace.beginSection("createWindowView");
        WindowViewAospInterface windowViewAospInterfaceMakeWindowViewAosp = WindowViewBuilder.makeWindowViewAosp(getActivity(), this.instanceId, true);
        this.windowView = windowViewAospInterfaceMakeWindowViewAosp;
        windowViewAospInterfaceMakeWindowViewAosp.setInstanceId(this.instanceId);
        Trace.endSection();
        this.fragmentDelegate.setWindowView(getInstanceName(), this.windowView);
        if (getArguments() == null || (string = getArguments().getString("params")) == null) {
            string = "";
        }
        this.fragmentDelegate.dispatchOnCreate(getInstanceName(), string);
        initPlatformPlugin(getActivity(), this.instanceId, this.windowView);
        initArkUIXPluginRegistry();
        Trace.endSection();
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(getActivity());
        this.keyboardHeightProvider = keyboardHeightProvider;
        keyboardHeightProvider.setKeyboardHeightObserver(this);
        this.windowView.getView().post(new Runnable() { // from class: ohos.stage.ability.adapter.StageFragment.1
            @Override // java.lang.Runnable
            public void run() {
                StageFragment.this.keyboardHeightProvider.start();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ALog.i(LOG_TAG, "OnCreateView called, instance name:" + getInstanceName());
        if (this.framelayout == null) {
            this.framelayout = new FrameLayout(getActivity());
            this.framelayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.framelayout.addView(this.windowView.getView(), 0);
        }
        return this.framelayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        ALog.i(LOG_TAG, "OnResume called, instance name:" + getInstanceName());
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        ALog.i(LOG_TAG, "onStart called, instance name:" + getInstanceName());
        super.onStart();
        if (isHidden()) {
            ALog.i(LOG_TAG, "onStart called, isHidden");
            this.isToResume = true;
        } else {
            this.isToResume = false;
            foreground();
        }
    }

    private void foreground() {
        if (this.isBackground) {
            this.isBackground = false;
            Trace.beginSection("StageFragment::foreground");
            this.fragmentDelegate.dispatchOnForeground(getInstanceName(), this);
            this.windowView.foreground();
            AcePlatformPlugin acePlatformPlugin = this.platformPlugin;
            if (acePlatformPlugin != null) {
                acePlatformPlugin.notifyLifecycleChanged(false);
            }
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        ALog.i(LOG_TAG, "onHiddenChanged called, isHidden:" + z);
        Trace.beginSection("StageFragment::onHiddenChanged");
        if (z) {
            background();
        } else {
            foreground();
        }
        Trace.endSection();
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getView() == null || this.windowView == null) {
            return;
        }
        Trace.beginSection("StageFragment::setUserVisibleHint");
        if (z) {
            ALog.i(LOG_TAG, "StageFragment isVisible to User, instance name:" + getInstanceName());
            AcePlatformPlugin acePlatformPlugin = this.platformPlugin;
            if (acePlatformPlugin != null) {
                acePlatformPlugin.notifyLifecycleChanged(false);
            }
        } else {
            ALog.i(LOG_TAG, "StageFragment is not visible to User, instance name:" + getInstanceName());
            AcePlatformPlugin acePlatformPlugin2 = this.platformPlugin;
            if (acePlatformPlugin2 != null) {
                acePlatformPlugin2.notifyLifecycleChanged(true);
            }
        }
        Trace.endSection();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        ALog.i(LOG_TAG, "OnStop called, instance name:" + getInstanceName());
        super.onStop();
        background();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        ALog.i(LOG_TAG, "onPause called, instance name:" + getInstanceName());
        super.onPause();
    }

    private void background() {
        if (this.isBackground) {
            return;
        }
        this.isBackground = true;
        this.fragmentDelegate.dispatchOnBackground(getInstanceName());
        this.windowView.background();
        AcePlatformPlugin acePlatformPlugin = this.platformPlugin;
        if (acePlatformPlugin != null) {
            acePlatformPlugin.notifyLifecycleChanged(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ALog.i(LOG_TAG, "OnDestroy called, instance name:" + getInstanceName());
        super.onDestroy();
        this.fragmentDelegate.dispatchOnDestroy(getInstanceName());
        this.windowView.destroy();
        this.arkUIXPluginRegistry.unRegistryAllPlugins();
        this.keyboardHeightProvider.close();
        AcePlatformPlugin acePlatformPlugin = this.platformPlugin;
        if (acePlatformPlugin != null) {
            acePlatformPlugin.release();
            ALog.i(LOG_TAG, "StageFragment onDestroy releseResRegister called");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ALog.i(LOG_TAG, "StageFragment dump called");
        AceEnv.dump(this.instanceId, str, fileDescriptor, printWriter, strArr);
    }

    public boolean onBackPressed() {
        ALog.i(LOG_TAG, "StageFragment onBackPressed called");
        return !this.windowView.backPressed();
    }

    public void setWindowOnTop(boolean z) {
        ALog.i(LOG_TAG, "setWindowOnTop " + z);
        WindowViewAospInterface windowViewAospInterface = this.windowView;
        if (windowViewAospInterface != null) {
            windowViewAospInterface.setHide(!z);
        }
    }

    public int startActivity(String str, String str2, String str3) {
        ComponentName componentName;
        ALog.i(LOG_TAG, "startActivity called, bundleName: " + str + ", activityName: " + str2);
        try {
            Intent intent = new Intent();
            String packageName = getActivity().getApplicationContext().getPackageName();
            ALog.i(LOG_TAG, "Current package name: " + packageName);
            if (packageName.equals(str)) {
                componentName = new ComponentName(getActivity().getBaseContext(), str2);
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
            if (getActivity() == null) {
                ALog.e(LOG_TAG, "Fragment getActivity is null");
                return -1;
            }
            String mimeType = getMimeType(getActivity().getBaseContext(), uri);
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
            String packageName = getActivity().getApplicationContext().getPackageName();
            ALog.i(LOG_TAG, "Current package name: " + packageName);
            if (packageName.equals(str)) {
                componentName = new ComponentName(getActivity().getBaseContext(), str2);
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
        }
    }

    public String getInstanceName() {
        String str = this.instanceName;
        return str == null ? "default" : str;
    }

    public void registerPlatformViewFactory(PlatformViewFactory platformViewFactory) {
        AcePlatformViewPluginAosp acePlatformViewPluginAosp = this.platformViewPluginAosp;
        if (acePlatformViewPluginAosp == null) {
            ALog.w(LOG_TAG, "PlatformViewPluginAosp is null");
        } else if (platformViewFactory == null) {
            ALog.w(LOG_TAG, "PlatformViewFactory is null");
        } else {
            acePlatformViewPluginAosp.registerPlatformViewFactory(platformViewFactory);
        }
    }

    private void initPlatformPlugin(Context context, int i, WindowViewInterface windowViewInterface) {
        Trace.beginSection("StageFragment::initPlatformPlugin");
        AcePlatformPlugin acePlatformPlugin = new AcePlatformPlugin(context, i, windowViewInterface.getView());
        this.platformPlugin = acePlatformPlugin;
        windowViewInterface.setInputConnectionClient(acePlatformPlugin);
        this.platformPlugin.initTexturePlugin(i);
        this.platformPlugin.addResourcePlugin(AceVideoPluginAosp.createRegister(context, this.moduleName));
        AceWebPluginBase aceWebPluginBaseCreateRegister = AceWebPluginAosp.createRegister(context, windowViewInterface.getView());
        windowViewInterface.setWebPlugin(aceWebPluginBaseCreateRegister);
        this.platformPlugin.addResourcePlugin(aceWebPluginBaseCreateRegister);
        this.platformPlugin.initSurfacePlugin(context, i);
        AcePlatformViewPluginAosp acePlatformViewPluginAospCreateRegister = AcePlatformViewPluginAosp.createRegister(context);
        this.platformViewPluginAosp = acePlatformViewPluginAospCreateRegister;
        this.platformPlugin.addResourcePlugin(acePlatformViewPluginAospCreateRegister);
        windowViewInterface.setPlatformViewPlugin(this.platformViewPluginAosp);
        Trace.endSection();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        synchronized (this) {
            ALog.i(LOG_TAG, "onRequestPermissionsResult");
            new GrantResult(getActivity().getApplicationContext()).onRequestPremissionCallback(strArr, iArr);
        }
    }

    private void initArkUIXPluginRegistry() {
        Trace.beginSection("StageFragment::intitArkUIXPlugins");
        ArkUIXPluginRegistry arkUIXPluginRegistry = new ArkUIXPluginRegistry(getPluginContext());
        this.arkUIXPluginRegistry = arkUIXPluginRegistry;
        arkUIXPluginRegistry.registryPlugins(this.pluginList);
        Trace.endSection();
    }

    public BridgeManager getBridgeManager() {
        if (this.bridgeManager == null) {
            this.bridgeManager = BridgeManager.getInstance();
        }
        return this.bridgeManager;
    }

    public PluginContext getPluginContext() {
        if (this.pluginContext == null) {
            this.pluginContext = new PluginContext(getActivity(), getBridgeManager(), this.moduleName);
        }
        return this.pluginContext;
    }

    public void finish() {
        ALog.i(LOG_TAG, "StageFragment finish called.");
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

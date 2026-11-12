package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.view.View;
import androidx.collection.ArrayMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.Systrace;
import defpackage.bvq;
import defpackage.c9i;
import defpackage.cm8;
import defpackage.e4f;
import defpackage.exh;
import defpackage.g9p;
import defpackage.iz6;
import defpackage.mej;
import defpackage.n0s;
import defpackage.ndj;
import defpackage.nwg;
import defpackage.oej;
import defpackage.p7q;
import defpackage.pd8;
import defpackage.pyo;
import defpackage.q7q;
import defpackage.r7q;
import defpackage.s7q;
import defpackage.wxq;
import defpackage.ycj;
import defpackage.yej;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = UIManagerModule.NAME)
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    private static final boolean DEBUG = c9i.a().b(ycj.f);
    public static final String NAME = "UIManager";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final pd8 mEventDispatcher;
    private final List<s7q> mListeners;
    private final e mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final com.facebook.react.uimanager.b mUIImplementation;
    private Map<String, WritableMap> mViewManagerConstantsCache;
    private volatile int mViewManagerConstantsCacheSize;
    private final com.facebook.react.uimanager.f mViewManagerRegistry;

    public class a implements d {
        public a() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.d
        public String a(String str) {
            Map map = (Map) UIManagerModule.this.mCustomDirectEvents.get(str);
            return map != null ? (String) map.get("registrationName") : str;
        }
    }

    public class b extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f7481b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReactContext reactContext, int i, Object obj) {
            super(reactContext);
            this.f7480a = i;
            this.f7481b = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.setViewLocalData(this.f7480a, this.f7481b);
        }
    }

    public class c extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7483b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReactContext reactContext, int i, int i2, int i3) {
            super(reactContext);
            this.f7482a = i;
            this.f7483b = i2;
            this.c = i3;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.updateRootView(this.f7482a, this.f7483b, this.c);
            UIManagerModule.this.mUIImplementation.dispatchViewUpdates(-1);
        }
    }

    public interface d {
        String a(String str);
    }

    public class e implements ComponentCallbacks2 {
        public e() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i >= 60) {
                n0s.a().a();
            }
        }

        public /* synthetic */ e(UIManagerModule uIManagerModule, a aVar) {
            this();
        }
    }

    public interface f {
        List<String> a();

        ViewManager b(String str);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, f fVar, int i) {
        this(reactApplicationContext, fVar, new com.facebook.react.uimanager.c(), i);
    }

    private WritableMap computeConstantsForViewManager(String str) {
        ViewManager viewManagerResolveViewManager = str != null ? this.mUIImplementation.resolveViewManager(str) : null;
        if (viewManagerResolveViewManager == null) {
            return null;
        }
        pyo.a(0L, "UIManagerModule.getConstantsForViewManager").b("ViewManager", viewManagerResolveViewManager.getName()).b("Lazy", Boolean.TRUE).c();
        try {
            Map<String, Object> mapC = com.facebook.react.uimanager.d.c(viewManagerResolveViewManager, null, null, null, this.mCustomDirectEvents);
            if (mapC != null) {
                return Arguments.makeNativeMap(mapC);
            }
            return null;
        } finally {
            pyo.b(0L).c();
        }
    }

    private static Map<String, Object> createConstants(f fVar) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        pyo.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.TRUE).c();
        try {
            return com.facebook.react.uimanager.d.a(fVar);
        } finally {
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t) {
        return addRootView(t, null, null);
    }

    public void addUIBlock(p7q p7qVar) {
        this.mUIImplementation.addUIBlock(p7qVar);
    }

    public void addUIManagerListener(s7q s7qVar) {
        this.mListeners.add(s7qVar);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.clearJSResponder();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.configureNextLayoutAnimation(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            cm8.b("ReactNative", str2);
            c9i.a().a(ycj.f, str2);
        }
        this.mUIImplementation.createView(i, str, i2, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.dismissPopupMenu();
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i, i2, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        if (dynamic.getType() == ReadableType.Number) {
            q7q.a(getReactApplicationContext(), wxq.a(i)).dispatchCommand(i, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            q7q.a(getReactApplicationContext(), wxq.a(i)).dispatchCommand(i, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.findSubviewIn(i, Math.round(exh.b(readableArray.getDouble(0))), Math.round(exh.b(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        Map<String, WritableMap> map = this.mViewManagerConstantsCache;
        if (map == null || !map.containsKey(str)) {
            return computeConstantsForViewManager(str);
        }
        WritableMap writableMap = this.mViewManagerConstantsCache.get(str);
        int i = this.mViewManagerConstantsCacheSize - 1;
        this.mViewManagerConstantsCacheSize = i;
        if (i <= 0) {
            this.mViewManagerConstantsCache = null;
        }
        return writableMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(com.facebook.react.uimanager.d.d());
    }

    public d getDirectEventNamesResolver() {
        return new a();
    }

    public pd8 getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.getProfiledBatchPerfCounters();
    }

    public com.facebook.react.uimanager.b getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public com.facebook.react.uimanager.f getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.registerEventEmitter(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i) {
        oej oejVarResolveShadowNode = this.mUIImplementation.resolveShadowNode(i);
        if (oejVarResolveShadowNode != null) {
            oejVarResolveShadowNode.dirty();
            this.mUIImplementation.dispatchViewUpdates(-1);
        } else {
            cm8.C("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i);
        }
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            cm8.b("ReactNative", str);
            c9i.a().a(ycj.f, str);
        }
        this.mUIImplementation.manageChildren(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.measure(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.measureInWindow(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayout(i, i2, callback, callback2);
    }

    @ReactMethod
    @Deprecated
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayoutRelativeToParent(i, callback, callback2);
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        pyo.a(0L, "onBatchCompleteUI").a("BatchId", i).c();
        Iterator<s7q> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.dispatchViewUpdates(i);
        } finally {
            Systrace.g(0L);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.onCatalystInstanceDestroyed();
        this.mUIImplementation.onCatalystInstanceDestroyed();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        n0s.a().a();
        bvq.a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.onHostDestroy();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.onHostPause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.onHostResume();
    }

    @ReactMethod
    @Deprecated
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    @Deprecated
    public void preComputeConstantsForViewManager(List<String> list) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : list) {
            WritableMap writableMapComputeConstantsForViewManager = computeConstantsForViewManager(str);
            if (writableMapComputeConstantsForViewManager != null) {
                arrayMap.put(str, writableMapComputeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(arrayMap);
    }

    public void prependUIBlock(p7q p7qVar) {
        this.mUIImplementation.prependUIBlock(p7qVar);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.profileNextBatch();
    }

    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.removeRootView(i);
    }

    @ReactMethod
    @Deprecated
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.removeSubviewsFromContainerWithID(i);
    }

    public void removeUIManagerListener(s7q s7qVar) {
        this.mListeners.remove(s7qVar);
    }

    @ReactMethod
    @Deprecated
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.replaceExistingNonRootView(i, i2);
    }

    public int resolveRootTagFromReactTag(int i) {
        return wxq.b(i) ? i : this.mUIImplementation.resolveRootTagFromReactTag(i);
    }

    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.getUIViewOperationQueue().O().x(i);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        this.mUIImplementation.sendAccessibilityEvent(i, i2);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i + ", children: " + readableArray;
            cm8.b("ReactNative", str);
            c9i.a().a(ycj.f, str);
        }
        this.mUIImplementation.setChildren(i, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.setJSResponder(i, z);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.setLayoutAnimationEnabledExperimental(z);
    }

    public void setViewHierarchyUpdateDebugListener(nwg nwgVar) {
        this.mUIImplementation.setViewHierarchyUpdateDebugListener(nwgVar);
    }

    public void setViewLocalData(int i, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i, obj));
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.showPopupMenu(i, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        int iA = wxq.a(i);
        if (iA == 2) {
            q7q.a(getReactApplicationContext(), iA).synchronouslyUpdateViewOnUIThread(i, readableMap);
        } else {
            this.mUIImplementation.synchronouslyUpdateViewOnUIThread(i, new yej(readableMap));
        }
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.updateNodeSize(i, i2, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new c(reactApplicationContext, i, i2, i3));
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            cm8.b("ReactNative", str2);
            c9i.a().a(ycj.f, str2);
        }
        int iA = wxq.a(i);
        if (iA == 2) {
            q7q.a(getReactApplicationContext(), iA).synchronouslyUpdateViewOnUIThread(i, readableMap);
        } else {
            this.mUIImplementation.updateView(i, str, readableMap);
        }
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.viewIsDescendantOf(i, i2, callback);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        this(reactApplicationContext, list, new com.facebook.react.uimanager.c(), i);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap, String str) {
        Systrace.c(0L, "UIManagerModule.addRootView");
        int iA = mej.a();
        this.mUIImplementation.registerRootView(t, iA, new g9p(getReactApplicationContext(), t.getContext()));
        Systrace.g(0L);
        return iA;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i, str, readableArray);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, f fVar, com.facebook.react.uimanager.c cVar, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        iz6.h(reactApplicationContext);
        pd8 pd8Var = new pd8(reactApplicationContext);
        this.mEventDispatcher = pd8Var;
        this.mModuleConstants = createConstants(fVar);
        this.mCustomDirectEvents = r7q.c();
        com.facebook.react.uimanager.f fVar2 = new com.facebook.react.uimanager.f(fVar);
        this.mViewManagerRegistry = fVar2;
        this.mUIImplementation = cVar.createUIImplementation(reactApplicationContext, fVar2, pd8Var, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        pyo.a(0L, "CreateUIManagerConstants").b("Lazy", Boolean.FALSE).c();
        try {
            return com.facebook.react.uimanager.d.b(list, map, map2);
        } finally {
            Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, com.facebook.react.uimanager.c cVar, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new e(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        iz6.h(reactApplicationContext);
        pd8 pd8Var = new pd8(reactApplicationContext);
        this.mEventDispatcher = pd8Var;
        HashMap mapB = e4f.b();
        this.mCustomDirectEvents = mapB;
        this.mModuleConstants = createConstants(list, null, mapB);
        com.facebook.react.uimanager.f fVar = new com.facebook.react.uimanager.f(list);
        this.mViewManagerRegistry = fVar;
        this.mUIImplementation = cVar.createUIImplementation(reactApplicationContext, fVar, pd8Var, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }
}

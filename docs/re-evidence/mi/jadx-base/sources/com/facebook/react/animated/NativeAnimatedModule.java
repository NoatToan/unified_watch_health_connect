package com.facebook.react.animated;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.ec1;
import defpackage.l4b;
import defpackage.ndj;
import defpackage.p7q;
import defpackage.s7q;
import defpackage.sk1;
import defpackage.zhg;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = NativeAnimatedModule.NAME)
public class NativeAnimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, s7q {
    public static final String NAME = "NativeAnimatedModule";
    private final l4b mAnimatedFrameCallback;
    private com.facebook.react.animated.a mNodesManager;
    private ArrayList<v> mOperations;
    private ArrayList<v> mPreOperations;
    private final ReactChoreographer mReactChoreographer;

    public class a implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double f7177b;

        public a(int i, double d) {
            this.f7176a = i;
            this.f7177b = d;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.r(this.f7176a, this.f7177b);
        }
    }

    public class b implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7178a;

        public b(int i) {
            this.f7178a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.k(this.f7178a);
        }
    }

    public class c implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7180a;

        public c(int i) {
            this.f7180a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.j(this.f7180a);
        }
    }

    public class d implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7183b;
        public final /* synthetic */ ReadableMap c;
        public final /* synthetic */ Callback d;

        public d(int i, int i2, ReadableMap readableMap, Callback callback) {
            this.f7182a = i;
            this.f7183b = i2;
            this.c = readableMap;
            this.d = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.t(this.f7182a, this.f7183b, this.c, this.d);
        }
    }

    public class e implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7184a;

        public e(int i) {
            this.f7184a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.v(this.f7184a);
        }
    }

    public class f implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7187b;

        public f(int i, int i2) {
            this.f7186a = i;
            this.f7187b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.e(this.f7186a, this.f7187b);
        }
    }

    public class g implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7189b;

        public g(int i, int i2) {
            this.f7188a = i;
            this.f7189b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.h(this.f7188a, this.f7189b);
        }
    }

    public class h implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7191b;

        public h(int i, int i2) {
            this.f7190a = i;
            this.f7191b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.d(this.f7190a, this.f7191b);
        }
    }

    public class i implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7193b;

        public i(int i, int i2) {
            this.f7192a = i;
            this.f7193b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.p(this.f7192a, this.f7193b);
        }
    }

    public class j implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7195b;

        public j(int i, int i2) {
            this.f7194a = i;
            this.f7195b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.g(this.f7194a, this.f7195b);
        }
    }

    public class k extends l4b {
        public k(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // defpackage.l4b
        public void c(long j) {
            com.facebook.react.animated.a nodesManager = NativeAnimatedModule.this.getNodesManager();
            if (nodesManager.n()) {
                nodesManager.q(j);
            }
            ((ReactChoreographer) sk1.c(NativeAnimatedModule.this.mReactChoreographer)).m(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, NativeAnimatedModule.this.mAnimatedFrameCallback);
        }
    }

    public class l implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7197b;
        public final /* synthetic */ ReadableMap c;

        public l(int i, String str, ReadableMap readableMap) {
            this.f7196a = i;
            this.f7197b = str;
            this.c = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.c(this.f7196a, this.f7197b, this.c);
        }
    }

    public class m implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7199b;
        public final /* synthetic */ int c;

        public m(int i, String str, int i2) {
            this.f7198a = i;
            this.f7199b = str;
            this.c = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.o(this.f7198a, this.f7199b, this.c);
        }
    }

    public class n implements p7q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7200a;

        public n(ArrayList arrayList) {
            this.f7200a = arrayList;
        }

        @Override // defpackage.p7q
        public void execute(zhg zhgVar) {
            com.facebook.react.animated.a nodesManager = NativeAnimatedModule.this.getNodesManager();
            Iterator it = this.f7200a.iterator();
            while (it.hasNext()) {
                ((v) it.next()).a(nodesManager);
            }
        }
    }

    public class o implements p7q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7202a;

        public o(ArrayList arrayList) {
            this.f7202a = arrayList;
        }

        @Override // defpackage.p7q
        public void execute(zhg zhgVar) {
            com.facebook.react.animated.a nodesManager = NativeAnimatedModule.this.getNodesManager();
            Iterator it = this.f7202a.iterator();
            while (it.hasNext()) {
                ((v) it.next()).a(nodesManager);
            }
        }
    }

    public class p implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableMap f7205b;

        public p(int i, ReadableMap readableMap) {
            this.f7204a = i;
            this.f7205b = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.f(this.f7204a, this.f7205b);
        }
    }

    public class q implements ec1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7206a;

        public q(int i) {
            this.f7206a = i;
        }

        @Override // defpackage.ec1
        public void a(double d) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("tag", this.f7206a);
            writableMapCreateMap.putDouble("value", d);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) NativeAnimatedModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", writableMapCreateMap);
        }
    }

    public class r implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ec1 f7209b;

        public r(int i, ec1 ec1Var) {
            this.f7208a = i;
            this.f7209b = ec1Var;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.u(this.f7208a, this.f7209b);
        }
    }

    public class s implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7210a;

        public s(int i) {
            this.f7210a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.x(this.f7210a);
        }
    }

    public class t implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7212a;

        public t(int i) {
            this.f7212a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.i(this.f7212a);
        }
    }

    public class u implements v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double f7215b;

        public u(int i, double d) {
            this.f7214a = i;
            this.f7215b = d;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.a aVar) {
            aVar.s(this.f7214a, this.f7215b);
        }
    }

    public interface v {
        void a(com.facebook.react.animated.a aVar);
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
        this.mPreOperations = new ArrayList<>();
        this.mReactChoreographer = ReactChoreographer.i();
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void clearFrameCallback() {
        ((ReactChoreographer) sk1.c(this.mReactChoreographer)).o(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void enqueueFrameCallback() {
        ((ReactChoreographer) sk1.c(this.mReactChoreographer)).m(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.react.animated.a getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new com.facebook.react.animated.a((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class));
        }
        return this.mNodesManager;
    }

    @ReactMethod
    public void addAnimatedEventToView(int i2, String str, ReadableMap readableMap) {
        this.mOperations.add(new l(i2, str, readableMap));
    }

    @ReactMethod
    public void connectAnimatedNodeToView(int i2, int i3) {
        this.mOperations.add(new h(i2, i3));
    }

    @ReactMethod
    public void connectAnimatedNodes(int i2, int i3) {
        this.mOperations.add(new f(i2, i3));
    }

    @ReactMethod
    public void createAnimatedNode(int i2, ReadableMap readableMap) {
        this.mOperations.add(new p(i2, readableMap));
    }

    @ReactMethod
    public void disconnectAnimatedNodeFromView(int i2, int i3) {
        this.mPreOperations.add(new i(i2, i3));
        this.mOperations.add(new j(i2, i3));
    }

    @ReactMethod
    public void disconnectAnimatedNodes(int i2, int i3) {
        this.mOperations.add(new g(i2, i3));
    }

    @ReactMethod
    public void dropAnimatedNode(int i2) {
        this.mOperations.add(new t(i2));
    }

    @ReactMethod
    public void extractAnimatedNodeOffset(int i2) {
        this.mOperations.add(new c(i2));
    }

    @ReactMethod
    public void flattenAnimatedNodeOffset(int i2) {
        this.mOperations.add(new b(i2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        reactApplicationContext.addLifecycleEventListener(this);
        uIManagerModule.addUIManagerListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @ReactMethod
    public void removeAnimatedEventFromView(int i2, String str, int i3) {
        this.mOperations.add(new m(i2, str, i3));
    }

    @ReactMethod
    public void setAnimatedNodeOffset(int i2, double d2) {
        this.mOperations.add(new a(i2, d2));
    }

    @ReactMethod
    public void setAnimatedNodeValue(int i2, double d2) {
        this.mOperations.add(new u(i2, d2));
    }

    public void setNodesManager(com.facebook.react.animated.a aVar) {
        this.mNodesManager = aVar;
    }

    @ReactMethod
    public void startAnimatingNode(int i2, int i3, ReadableMap readableMap, Callback callback) {
        this.mOperations.add(new d(i2, i3, readableMap, callback));
    }

    @ReactMethod
    public void startListeningToAnimatedNodeValue(int i2) {
        this.mOperations.add(new r(i2, new q(i2)));
    }

    @ReactMethod
    public void stopAnimation(int i2) {
        this.mOperations.add(new e(i2));
    }

    @ReactMethod
    public void stopListeningToAnimatedNodeValue(int i2) {
        this.mOperations.add(new s(i2));
    }

    @Override // defpackage.s7q
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty() && this.mPreOperations.isEmpty()) {
            return;
        }
        ArrayList<v> arrayList = this.mPreOperations;
        ArrayList<v> arrayList2 = this.mOperations;
        this.mPreOperations = new ArrayList<>();
        this.mOperations = new ArrayList<>();
        uIManagerModule.prependUIBlock(new n(arrayList));
        uIManagerModule.addUIBlock(new o(arrayList2));
    }
}

package com.swmansion.reanimated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import defpackage.ndj;
import defpackage.p7q;
import defpackage.s7q;
import defpackage.svg;
import defpackage.yzp;
import defpackage.zhg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = ReanimatedModule.NAME)
public class ReanimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, s7q {
    public static final String NAME = "ReanimatedModule";
    private svg mNodesManager;
    private ArrayList<m> mOperations;
    private yzp mTransitionManager;

    public class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f10633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f10634b;

        public a(Set set, Set set2) {
            this.f10633a = set;
            this.f10634b = set2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.f(this.f10633a, this.f10634b);
        }
    }

    public class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f10636b;

        public b(int i, Callback callback) {
            this.f10635a = i;
            this.f10636b = callback;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.q(this.f10635a, this.f10636b);
        }
    }

    public class c implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Double f10638b;

        public c(int i, Double d) {
            this.f10637a = i;
            this.f10638b = d;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.y(this.f10637a, this.f10638b);
        }
    }

    public class d implements p7q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f10639a;

        public d(ArrayList arrayList) {
            this.f10639a = arrayList;
        }

        @Override // defpackage.p7q
        public void execute(zhg zhgVar) {
            svg nodesManager = ReanimatedModule.this.getNodesManager();
            Iterator it = this.f10639a.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(nodesManager);
            }
        }
    }

    public class e implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableMap f10642b;

        public e(int i, ReadableMap readableMap) {
            this.f10641a = i;
            this.f10642b = readableMap;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.i(this.f10641a, this.f10642b);
        }
    }

    public class f implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10643a;

        public f(int i) {
            this.f10643a = i;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.m(this.f10643a);
        }
    }

    public class g implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10646b;

        public g(int i, int i2) {
            this.f10645a = i;
            this.f10646b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.h(this.f10645a, this.f10646b);
        }
    }

    public class h implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10648b;

        public h(int i, int i2) {
            this.f10647a = i;
            this.f10648b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.l(this.f10647a, this.f10648b);
        }
    }

    public class i implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10650b;

        public i(int i, int i2) {
            this.f10649a = i;
            this.f10650b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.g(this.f10649a, this.f10650b);
        }
    }

    public class j implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f10652b;

        public j(int i, int i2) {
            this.f10651a = i;
            this.f10652b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.k(this.f10651a, this.f10652b);
        }
    }

    public class k implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10654b;
        public final /* synthetic */ int c;

        public k(int i, String str, int i2) {
            this.f10653a = i;
            this.f10654b = str;
            this.c = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.e(this.f10653a, this.f10654b, this.c);
        }
    }

    public class l implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10656b;
        public final /* synthetic */ int c;

        public l(int i, String str, int i2) {
            this.f10655a = i;
            this.f10656b = str;
            this.c = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(svg svgVar) {
            svgVar.j(this.f10655a, this.f10656b, this.c);
        }
    }

    public interface m {
        void a(svg svgVar);
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public svg getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new svg(getReactApplicationContext());
        }
        return this.mNodesManager;
    }

    @ReactMethod
    public void animateNextTransition(int i2, ReadableMap readableMap) {
        this.mTransitionManager.a(i2, readableMap);
    }

    @ReactMethod
    public void attachEvent(int i2, String str, int i3) {
        this.mOperations.add(new k(i2, str, i3));
    }

    @ReactMethod
    public void configureProps(ReadableArray readableArray, ReadableArray readableArray2) {
        int size = readableArray.size();
        HashSet hashSet = new HashSet(size);
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(readableArray.getString(i2));
        }
        int size2 = readableArray2.size();
        HashSet hashSet2 = new HashSet(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            hashSet2.add(readableArray2.getString(i3));
        }
        this.mOperations.add(new a(hashSet, hashSet2));
    }

    @ReactMethod
    public void connectNodeToView(int i2, int i3) {
        this.mOperations.add(new i(i2, i3));
    }

    @ReactMethod
    public void connectNodes(int i2, int i3) {
        this.mOperations.add(new g(i2, i3));
    }

    @ReactMethod
    public void createNode(int i2, ReadableMap readableMap) {
        this.mOperations.add(new e(i2, readableMap));
    }

    @ReactMethod
    public void detachEvent(int i2, String str, int i3) {
        this.mOperations.add(new l(i2, str, i3));
    }

    @ReactMethod
    public void disconnectNodeFromView(int i2, int i3) {
        this.mOperations.add(new j(i2, i3));
    }

    @ReactMethod
    public void disconnectNodes(int i2, int i3) {
        this.mOperations.add(new h(i2, i3));
    }

    @ReactMethod
    public void dropNode(int i2) {
        this.mOperations.add(new f(i2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getValue(int i2, Callback callback) {
        this.mOperations.add(new b(i2, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        reactApplicationContext.addLifecycleEventListener(this);
        uIManagerModule.addUIManagerListener(this);
        this.mTransitionManager = new yzp(uIManagerModule);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        svg svgVar = this.mNodesManager;
        if (svgVar != null) {
            svgVar.t();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        svg svgVar = this.mNodesManager;
        if (svgVar != null) {
            svgVar.u();
        }
    }

    @ReactMethod
    public void setValue(int i2, Double d2) {
        this.mOperations.add(new c(i2, d2));
    }

    @Override // defpackage.s7q
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        ArrayList<m> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        uIManagerModule.addUIBlock(new d(arrayList));
    }
}

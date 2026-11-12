package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.systrace.Systrace;
import com.facebook.yoga.YogaDirection;
import defpackage.aig;
import defpackage.asq;
import defpackage.cm8;
import defpackage.exh;
import defpackage.g9p;
import defpackage.m2m;
import defpackage.nwg;
import defpackage.o0d;
import defpackage.oej;
import defpackage.p7q;
import defpackage.pd8;
import defpackage.pej;
import defpackage.poc;
import defpackage.pyo;
import defpackage.sk1;
import defpackage.y8h;
import defpackage.yej;
import defpackage.zhg;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    private static final String TAG_NO_SHADOW_NODE = "UIImplementationNullShadowNode";
    protected final pd8 mEventDispatcher;
    private long mLastCalculateLayoutTime;
    protected InterfaceC0170b mLayoutUpdateListener;
    private final int[] mMeasureBuffer;
    private final aig mNativeViewHierarchyOptimizer;
    private final e mOperationsQueue;
    protected final ReactApplicationContext mReactContext;
    protected final m2m mShadowNodeRegistry;
    private final f mViewManagers;
    private volatile boolean mViewOperationsEnabled;
    protected Object uiImplementationThreadLock;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ oej f7485a;

        public a(oej oejVar) {
            this.f7485a = oejVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.mShadowNodeRegistry.b(this.f7485a);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.b$b, reason: collision with other inner class name */
    public interface InterfaceC0170b {
    }

    public b(ReactApplicationContext reactApplicationContext, UIManagerModule.f fVar, pd8 pd8Var, int i) {
        this(reactApplicationContext, new f(fVar), pd8Var, i);
    }

    private void assertNodeDoesNotNeedCustomLayoutForChildren(oej oejVar) {
        NativeModule nativeModule = (ViewManager) sk1.c(this.mViewManagers.a(oejVar.getViewClass()));
        if (!(nativeModule instanceof o0d)) {
            throw new IllegalViewOperationException("Trying to use view " + oejVar.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        o0d o0dVar = (o0d) nativeModule;
        if (o0dVar == null || !o0dVar.needsCustomLayoutForChildren()) {
            return;
        }
        throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + oejVar.getViewClass() + "). Use measure instead.");
    }

    private void assertViewExists(int i, String str) {
        if (this.mShadowNodeRegistry.c(i) == null) {
            if (handleNullShadowNodeExceptionSelf()) {
                handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: assertViewExists() reactTag:" + i + ", operationNameForExceptionMessage:" + str));
                return;
            }
            throw new IllegalViewOperationException("Unable to execute operation " + str + " on view with tag: " + i + ", since the view does not exists");
        }
    }

    private void dispatchViewUpdatesIfNeeded() {
        if (this.mOperationsQueue.Q()) {
            dispatchViewUpdates(-1);
        }
    }

    private void handleNullShadowNodeException(NullShadowNodeException nullShadowNodeException) {
        ReactApplicationContext reactApplicationContext = this.mReactContext;
        if (reactApplicationContext == null || reactApplicationContext.getNullShadowNodeExceptionHandler() == null) {
            return;
        }
        this.mReactContext.getNullShadowNodeExceptionHandler().handleException(nullShadowNodeException);
    }

    private boolean handleNullShadowNodeExceptionSelf() {
        ReactApplicationContext reactApplicationContext = this.mReactContext;
        return (reactApplicationContext == null || reactApplicationContext.getNullShadowNodeExceptionHandler() == null || !this.mReactContext.getNullShadowNodeExceptionHandler().handleSelf()) ? false : true;
    }

    private void measureLayoutRelativeToVerifiedAncestor(oej oejVar, oej oejVar2, int[] iArr) {
        int iRound;
        int iRound2;
        if (oejVar != oejVar2) {
            iRound = Math.round(oejVar.getLayoutX());
            iRound2 = Math.round(oejVar.getLayoutY());
            for (oej parent = oejVar.getParent(); parent != oejVar2; parent = parent.getParent()) {
                sk1.c(parent);
                assertNodeDoesNotNeedCustomLayoutForChildren(parent);
                iRound += Math.round(parent.getLayoutX());
                iRound2 += Math.round(parent.getLayoutY());
            }
            assertNodeDoesNotNeedCustomLayoutForChildren(oejVar2);
        } else {
            iRound = 0;
            iRound2 = 0;
        }
        iArr[0] = iRound;
        iArr[1] = iRound2;
        iArr[2] = oejVar.getScreenWidth();
        iArr[3] = oejVar.getScreenHeight();
    }

    private void notifyOnBeforeLayoutRecursive(oej oejVar) {
        if (oejVar.hasUpdates()) {
            for (int i = 0; i < oejVar.getChildCount(); i++) {
                notifyOnBeforeLayoutRecursive(oejVar.getChildAt(i));
            }
            oejVar.onBeforeLayout(this.mNativeViewHierarchyOptimizer);
        }
    }

    private void removeShadowNodeRecursive(oej oejVar) {
        aig.j(oejVar);
        this.mShadowNodeRegistry.g(oejVar.getReactTag());
        for (int childCount = oejVar.getChildCount() - 1; childCount >= 0; childCount--) {
            removeShadowNodeRecursive(oejVar.getChildAt(childCount));
        }
        oejVar.removeAndDisposeAllChildren();
    }

    public void addUIBlock(p7q p7qVar) {
        this.mOperationsQueue.J(p7qVar);
    }

    public void applyUpdatesRecursive(oej oejVar, float f, float f2) {
        if (oejVar.hasUpdates()) {
            Iterable<? extends oej> iterableCalculateLayoutOnChildren = oejVar.calculateLayoutOnChildren();
            if (iterableCalculateLayoutOnChildren != null) {
                Iterator<? extends oej> it = iterableCalculateLayoutOnChildren.iterator();
                while (it.hasNext()) {
                    applyUpdatesRecursive(it.next(), oejVar.getLayoutX() + f, oejVar.getLayoutY() + f2);
                }
            }
            int reactTag = oejVar.getReactTag();
            if (!this.mShadowNodeRegistry.f(reactTag) && oejVar.dispatchUpdates(f, f2, this.mOperationsQueue, this.mNativeViewHierarchyOptimizer) && oejVar.shouldNotifyOnLayout()) {
                this.mEventDispatcher.dispatchEvent(y8h.b(reactTag, oejVar.getScreenX(), oejVar.getScreenY(), oejVar.getScreenWidth(), oejVar.getScreenHeight()));
            }
            oejVar.markUpdateSeen();
            this.mNativeViewHierarchyOptimizer.p(oejVar);
        }
    }

    public void calculateRootLayout(oej oejVar) {
        pyo.a(0L, "cssRoot.calculateLayout").a("rootTag", oejVar.getReactTag()).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int iIntValue = oejVar.getWidthMeasureSpec().intValue();
            int iIntValue2 = oejVar.getHeightMeasureSpec().intValue();
            float size = Float.NaN;
            float size2 = View.MeasureSpec.getMode(iIntValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(iIntValue);
            if (View.MeasureSpec.getMode(iIntValue2) != 0) {
                size = View.MeasureSpec.getSize(iIntValue2);
            }
            oejVar.calculateLayout(size2, size);
        } finally {
            Systrace.g(0L);
            this.mLastCalculateLayoutTime = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    public void clearJSResponder() {
        this.mOperationsQueue.u();
    }

    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mOperationsQueue.v(readableMap, callback);
    }

    public oej createRootShadowNode() {
        pej pejVar = new pej();
        if (poc.d().g(this.mReactContext)) {
            pejVar.setLayoutDirection(YogaDirection.RTL);
        }
        pejVar.setViewClassName("Root");
        return pejVar;
    }

    public oej createShadowNode(String str) {
        return this.mViewManagers.a(str).createShadowNodeInstance(this.mReactContext);
    }

    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        yej yejVar;
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    oej oejVarC = this.mShadowNodeRegistry.c(i2);
                    if (oejVarC == null && handleNullShadowNodeExceptionSelf()) {
                        handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: createView() mShadowNodeRegistry.getNode(rootViewTag):" + i2));
                        return;
                    }
                    sk1.d(oejVarC, "Root node with tag " + i2 + " doesn't exist");
                    oej oejVarCreateShadowNode = createShadowNode(str);
                    oejVarCreateShadowNode.setReactTag(i);
                    oejVarCreateShadowNode.setViewClassName(str);
                    oejVarCreateShadowNode.setRootTag(oejVarC.getReactTag());
                    oejVarCreateShadowNode.setThemedContext(oejVarC.getThemedContext());
                    this.mShadowNodeRegistry.a(oejVarCreateShadowNode);
                    if (readableMap != null) {
                        yejVar = new yej(readableMap);
                        oejVarCreateShadowNode.updateProperties(yejVar);
                    } else {
                        yejVar = null;
                    }
                    handleCreateView(oejVarCreateShadowNode, i2, yejVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void dismissPopupMenu() {
        this.mOperationsQueue.x();
    }

    @Deprecated
    public void dispatchViewManagerCommand(int i, int i2, ReadableArray readableArray) {
        assertViewExists(i, "dispatchViewManagerCommand");
        this.mOperationsQueue.y(i, i2, readableArray);
    }

    public void dispatchViewUpdates(int i) {
        pyo.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            updateViewHierarchy();
            this.mNativeViewHierarchyOptimizer.o();
            this.mOperationsQueue.t(i, jUptimeMillis, this.mLastCalculateLayoutTime);
        } finally {
            Systrace.g(0L);
        }
    }

    public void findSubviewIn(int i, float f, float f2, Callback callback) {
        this.mOperationsQueue.A(i, f, f2, callback);
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        return this.mOperationsQueue.P();
    }

    public e getUIViewOperationQueue() {
        return this.mOperationsQueue;
    }

    public void handleCreateView(oej oejVar, int i, yej yejVar) {
        if (oejVar.isVirtual()) {
            return;
        }
        this.mNativeViewHierarchyOptimizer.g(oejVar, oejVar.getThemedContext(), yejVar);
    }

    public void handleUpdateView(oej oejVar, String str, yej yejVar) {
        if (oejVar.isVirtual()) {
            return;
        }
        this.mNativeViewHierarchyOptimizer.m(oejVar, str, yejVar);
    }

    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int[] iArr;
        oej oejVar;
        int[] iArr2;
        ReadableArray readableArray6 = readableArray;
        synchronized (this.uiImplementationThreadLock) {
            try {
                if (this.mViewOperationsEnabled) {
                    oej oejVarC = this.mShadowNodeRegistry.c(i);
                    if (oejVarC == null && handleNullShadowNodeExceptionSelf()) {
                        handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: manageChildren() mShadowNodeRegistry.getNode(viewTag):" + i));
                        return;
                    }
                    int size = readableArray6 == null ? 0 : readableArray.size();
                    int size2 = readableArray3 == null ? 0 : readableArray3.size();
                    int size3 = readableArray5 == null ? 0 : readableArray5.size();
                    if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                        throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
                    }
                    if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                        throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
                    }
                    int i2 = size + size2;
                    asq[] asqVarArr = new asq[i2];
                    int i3 = size + size3;
                    int[] iArr3 = new int[i3];
                    try {
                        int[] iArr4 = new int[i3];
                        int[] iArr5 = new int[size3];
                        int[] iArr6 = new int[size3];
                        if (size > 0) {
                            sk1.c(readableArray);
                            sk1.c(readableArray2);
                            int i4 = 0;
                            while (i4 < size) {
                                int[] iArr7 = iArr6;
                                int i5 = readableArray6.getInt(i4);
                                int reactTag = oejVarC.getChildAt(i5).getReactTag();
                                asqVarArr[i4] = new asq(reactTag, readableArray2.getInt(i4));
                                iArr3[i4] = i5;
                                iArr4[i4] = reactTag;
                                i4++;
                                readableArray6 = readableArray;
                                iArr6 = iArr7;
                                iArr5 = iArr5;
                                oejVarC = oejVarC;
                            }
                            iArr = iArr6;
                            oejVar = oejVarC;
                            iArr2 = iArr5;
                        } else {
                            iArr = iArr6;
                            oejVar = oejVarC;
                            iArr2 = iArr5;
                        }
                        if (size2 > 0) {
                            sk1.c(readableArray3);
                            sk1.c(readableArray4);
                            for (int i6 = 0; i6 < size2; i6++) {
                                asqVarArr[size + i6] = new asq(readableArray3.getInt(i6), readableArray4.getInt(i6));
                            }
                        }
                        if (size3 > 0) {
                            sk1.c(readableArray5);
                            int i7 = 0;
                            while (i7 < size3) {
                                int i8 = readableArray5.getInt(i7);
                                oej oejVar2 = oejVar;
                                int reactTag2 = oejVar2.getChildAt(i8).getReactTag();
                                int i9 = size + i7;
                                iArr3[i9] = i8;
                                iArr4[i9] = reactTag2;
                                iArr2[i7] = reactTag2;
                                iArr[i7] = i8;
                                i7++;
                                oejVar = oejVar2;
                            }
                        }
                        oej oejVar3 = oejVar;
                        Arrays.sort(asqVarArr, asq.c);
                        Arrays.sort(iArr3);
                        int i10 = -1;
                        for (int i11 = i3 - 1; i11 >= 0; i11--) {
                            int i12 = iArr3[i11];
                            if (i12 == i10) {
                                throw new IllegalViewOperationException("Repeated indices in Removal list for view tag: " + i);
                            }
                            oejVar3.removeChildAt(i12);
                            i10 = iArr3[i11];
                        }
                        int[] iArr8 = iArr;
                        int i13 = 0;
                        while (i13 < i2) {
                            asq asqVar = asqVarArr[i13];
                            int[] iArr9 = iArr4;
                            oej oejVarC2 = this.mShadowNodeRegistry.c(asqVar.f3422a);
                            if (oejVarC2 == null) {
                                if (!handleNullShadowNodeExceptionSelf()) {
                                    throw new IllegalViewOperationException("Trying to add unknown view tag: " + asqVar.f3422a);
                                }
                                handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: manageChildren() mShadowNodeRegistry.getNode(viewAtIndex.mTag):" + asqVar.f3422a));
                                return;
                            }
                            oejVar3.addChildAt(oejVarC2, asqVar.f3423b);
                            i13++;
                            iArr4 = iArr9;
                        }
                        int[] iArr10 = iArr2;
                        int i14 = size3;
                        this.mNativeViewHierarchyOptimizer.i(oejVar3, iArr3, iArr4, asqVarArr, iArr10, iArr8);
                        for (int i15 = 0; i15 < i14; i15++) {
                            oej oejVarC3 = this.mShadowNodeRegistry.c(iArr10[i15]);
                            if (oejVarC3 != null) {
                                removeShadowNode(oejVarC3);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void measure(int i, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.C(i, callback);
        }
    }

    public void measureInWindow(int i, Callback callback) {
        if (this.mViewOperationsEnabled) {
            this.mOperationsQueue.D(i, callback);
        }
    }

    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayout(i, i2, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(exh.a(this.mMeasureBuffer[0])), Float.valueOf(exh.a(this.mMeasureBuffer[1])), Float.valueOf(exh.a(this.mMeasureBuffer[2])), Float.valueOf(exh.a(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e) {
                callback.invoke(e.getMessage());
            }
        }
    }

    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        if (this.mViewOperationsEnabled) {
            try {
                measureLayoutRelativeToParent(i, this.mMeasureBuffer);
                callback2.invoke(Float.valueOf(exh.a(this.mMeasureBuffer[0])), Float.valueOf(exh.a(this.mMeasureBuffer[1])), Float.valueOf(exh.a(this.mMeasureBuffer[2])), Float.valueOf(exh.a(this.mMeasureBuffer[3])));
            } catch (IllegalViewOperationException e) {
                callback.invoke(e.getMessage());
            }
        }
    }

    public void onCatalystInstanceDestroyed() {
        this.mViewOperationsEnabled = false;
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mOperationsQueue.R();
    }

    public void onHostResume() {
        this.mOperationsQueue.U();
    }

    public void prependUIBlock(p7q p7qVar) {
        this.mOperationsQueue.S(p7qVar);
    }

    public void profileNextBatch() {
        this.mOperationsQueue.T();
    }

    public <T extends View> void registerRootView(T t, int i, g9p g9pVar) {
        synchronized (this.uiImplementationThreadLock) {
            oej oejVarCreateRootShadowNode = createRootShadowNode();
            oejVarCreateRootShadowNode.setReactTag(i);
            oejVarCreateRootShadowNode.setThemedContext(g9pVar);
            g9pVar.runOnNativeModulesQueueThread(new a(oejVarCreateRootShadowNode));
            this.mOperationsQueue.s(i, t);
        }
    }

    public void removeLayoutUpdateListener() {
    }

    public void removeRootShadowNode(int i) {
        synchronized (this.uiImplementationThreadLock) {
            this.mShadowNodeRegistry.h(i);
        }
    }

    public void removeRootView(int i) {
        removeRootShadowNode(i);
        this.mOperationsQueue.E(i);
    }

    public final void removeShadowNode(oej oejVar) {
        removeShadowNodeRecursive(oejVar);
        oejVar.dispose();
    }

    public void removeSubviewsFromContainerWithID(int i) {
        oej oejVarC = this.mShadowNodeRegistry.c(i);
        if (oejVarC != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i2 = 0; i2 < oejVarC.getChildCount(); i2++) {
                writableArrayCreateArray.pushInt(i2);
            }
            manageChildren(i, null, null, null, null, writableArrayCreateArray);
            return;
        }
        if (!handleNullShadowNodeExceptionSelf()) {
            throw new IllegalViewOperationException("Trying to remove subviews of an unknown view tag: " + i);
        }
        handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: removeSubviewsFromContainerWithID() mShadowNodeRegistry.getNode(containerTag):" + i));
    }

    public void replaceExistingNonRootView(int i, int i2) {
        if (this.mShadowNodeRegistry.f(i) || this.mShadowNodeRegistry.f(i2)) {
            throw new IllegalViewOperationException("Trying to add or replace a root tag!");
        }
        oej oejVarC = this.mShadowNodeRegistry.c(i);
        if (oejVarC == null) {
            if (!handleNullShadowNodeExceptionSelf()) {
                throw new IllegalViewOperationException("Trying to replace unknown view tag: " + i);
            }
            handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: replaceExistingNonRootView() mShadowNodeRegistry.getNode(oldTag):" + i));
            return;
        }
        oej parent = oejVarC.getParent();
        if (parent == null) {
            throw new IllegalViewOperationException("Node is not attached to a parent: " + i);
        }
        int iIndexOf = parent.indexOf(oejVarC);
        if (iIndexOf < 0) {
            throw new IllegalStateException("Didn't find child tag in parent");
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i2);
        WritableArray writableArrayCreateArray2 = Arguments.createArray();
        writableArrayCreateArray2.pushInt(iIndexOf);
        WritableArray writableArrayCreateArray3 = Arguments.createArray();
        writableArrayCreateArray3.pushInt(iIndexOf);
        manageChildren(parent.getReactTag(), null, null, writableArrayCreateArray, writableArrayCreateArray2, writableArrayCreateArray3);
    }

    public int resolveRootTagFromReactTag(int i) {
        if (this.mShadowNodeRegistry.f(i)) {
            return i;
        }
        oej oejVarResolveShadowNode = resolveShadowNode(i);
        if (oejVarResolveShadowNode != null) {
            return oejVarResolveShadowNode.getRootTag();
        }
        cm8.C("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i);
        return 0;
    }

    public final oej resolveShadowNode(int i) {
        return this.mShadowNodeRegistry.c(i);
    }

    public final ViewManager resolveViewManager(String str) {
        return this.mViewManagers.a(str);
    }

    public void sendAccessibilityEvent(int i, int i2) {
        this.mOperationsQueue.F(i, i2);
    }

    public void setChildren(int i, ReadableArray readableArray) {
        if (this.mViewOperationsEnabled) {
            synchronized (this.uiImplementationThreadLock) {
                try {
                    oej oejVarC = this.mShadowNodeRegistry.c(i);
                    if (oejVarC == null && handleNullShadowNodeExceptionSelf()) {
                        handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: setChildren() mShadowNodeRegistry.getNode(viewTag):" + i));
                        return;
                    }
                    for (int i2 = 0; i2 < readableArray.size(); i2++) {
                        oej oejVarC2 = this.mShadowNodeRegistry.c(readableArray.getInt(i2));
                        if (oejVarC2 == null) {
                            if (!handleNullShadowNodeExceptionSelf()) {
                                throw new IllegalViewOperationException("Trying to add unknown view tag: " + readableArray.getInt(i2));
                            }
                            handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: setChildren() mShadowNodeRegistry.getNode(childrenTags.getInt(i)):" + readableArray.getInt(i2)));
                            return;
                        }
                        oejVarC.addChildAt(oejVarC2, i2);
                    }
                    this.mNativeViewHierarchyOptimizer.k(oejVarC, readableArray);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setJSResponder(int i, boolean z) {
        oej oejVarC = this.mShadowNodeRegistry.c(i);
        if (oejVarC == null) {
            return;
        }
        while (oejVarC.getNativeKind() == NativeKind.NONE) {
            oejVarC = oejVarC.getParent();
        }
        this.mOperationsQueue.G(oejVarC.getReactTag(), i, z);
    }

    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mOperationsQueue.H(z);
    }

    public void setLayoutUpdateListener(InterfaceC0170b interfaceC0170b) {
    }

    public void setViewHierarchyUpdateDebugListener(nwg nwgVar) {
        this.mOperationsQueue.V(nwgVar);
    }

    public void setViewLocalData(int i, Object obj) {
        oej oejVarC = this.mShadowNodeRegistry.c(i);
        if (oejVarC != null) {
            oejVarC.setLocalData(obj);
            dispatchViewUpdatesIfNeeded();
        } else {
            cm8.C("ReactNative", "Attempt to set local data for view with unknown tag: " + i);
        }
    }

    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        assertViewExists(i, "showPopupMenu");
        this.mOperationsQueue.I(i, readableArray, callback, callback2);
    }

    public void synchronouslyUpdateViewOnUIThread(int i, yej yejVar) {
        UiThreadUtil.assertOnUiThread();
        this.mOperationsQueue.O().F(i, yejVar);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        oej oejVarC = this.mShadowNodeRegistry.c(i);
        if (oejVarC != null) {
            oejVarC.setStyleWidth(i2);
            oejVarC.setStyleHeight(i3);
            dispatchViewUpdatesIfNeeded();
        } else {
            cm8.C("ReactNative", "Tried to update size of non-existent tag: " + i);
        }
    }

    public void updateRootView(int i, int i2, int i3) {
        oej oejVarC = this.mShadowNodeRegistry.c(i);
        if (oejVarC != null) {
            updateRootView(oejVarC, i2, i3);
            return;
        }
        cm8.C("ReactNative", "Tried to update non-existent root tag: " + i);
    }

    public void updateView(int i, String str, ReadableMap readableMap) {
        if (this.mViewOperationsEnabled) {
            if (this.mViewManagers.a(str) == null) {
                throw new IllegalViewOperationException("Got unknown view type: " + str);
            }
            oej oejVarC = this.mShadowNodeRegistry.c(i);
            if (oejVarC != null) {
                if (readableMap != null) {
                    yej yejVar = new yej(readableMap);
                    oejVarC.updateProperties(yejVar);
                    handleUpdateView(oejVarC, str, yejVar);
                    return;
                }
                return;
            }
            if (!handleNullShadowNodeExceptionSelf()) {
                throw new IllegalViewOperationException("Trying to update non-existent view with tag " + i);
            }
            handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: updateView() mShadowNodeRegistry.getNode(tag):" + i));
        }
    }

    public void updateViewHierarchy() {
        Systrace.c(0L, "UIImplementation.updateViewHierarchy");
        for (int i = 0; i < this.mShadowNodeRegistry.d(); i++) {
            try {
                int iE = this.mShadowNodeRegistry.e(i);
                oej oejVarC = this.mShadowNodeRegistry.c(iE);
                if (oejVarC == null && handleNullShadowNodeExceptionSelf()) {
                    handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: updateViewHierarchy() mShadowNodeRegistry.getNode(tag):" + iE));
                    Systrace.g(0L);
                    return;
                }
                if (oejVarC.getWidthMeasureSpec() != null && oejVarC.getHeightMeasureSpec() != null) {
                    pyo.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", oejVarC.getReactTag()).c();
                    try {
                        notifyOnBeforeLayoutRecursive(oejVarC);
                        Systrace.g(0L);
                        calculateRootLayout(oejVarC);
                        pyo.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", oejVarC.getReactTag()).c();
                        try {
                            applyUpdatesRecursive(oejVarC, 0.0f, 0.0f);
                            Systrace.g(0L);
                        } catch (Throwable th) {
                            Systrace.g(0L);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Systrace.g(0L);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Systrace.g(0L);
                throw th3;
            }
        }
        Systrace.g(0L);
    }

    @Deprecated
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        oej oejVarC = this.mShadowNodeRegistry.c(i);
        oej oejVarC2 = this.mShadowNodeRegistry.c(i2);
        if (oejVarC == null || oejVarC2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(oejVarC.isDescendantOf(oejVarC2)));
        }
    }

    public b(ReactApplicationContext reactApplicationContext, List<ViewManager> list, pd8 pd8Var, int i) {
        this(reactApplicationContext, new f(list), pd8Var, i);
    }

    public b(ReactApplicationContext reactApplicationContext, f fVar, pd8 pd8Var, int i) {
        this(reactApplicationContext, fVar, new e(reactApplicationContext, new zhg(fVar), i), pd8Var);
    }

    public void dispatchViewManagerCommand(int i, String str, ReadableArray readableArray) {
        assertViewExists(i, "dispatchViewManagerCommand");
        this.mOperationsQueue.z(i, str, readableArray);
    }

    public b(ReactApplicationContext reactApplicationContext, f fVar, e eVar, pd8 pd8Var) {
        this.uiImplementationThreadLock = new Object();
        m2m m2mVar = new m2m();
        this.mShadowNodeRegistry = m2mVar;
        this.mMeasureBuffer = new int[4];
        this.mLastCalculateLayoutTime = 0L;
        this.mViewOperationsEnabled = true;
        this.mReactContext = reactApplicationContext;
        this.mViewManagers = fVar;
        this.mOperationsQueue = eVar;
        this.mNativeViewHierarchyOptimizer = new aig(eVar, m2mVar);
        this.mEventDispatcher = pd8Var;
    }

    public void updateRootView(oej oejVar, int i, int i2) {
        oejVar.setMeasureSpecs(i, i2);
    }

    private void measureLayout(int i, int i2, int[] iArr) {
        oej oejVarC = this.mShadowNodeRegistry.c(i);
        oej oejVarC2 = this.mShadowNodeRegistry.c(i2);
        if (oejVarC != null && oejVarC2 != null) {
            if (oejVarC != oejVarC2) {
                for (oej parent = oejVarC.getParent(); parent != oejVarC2; parent = parent.getParent()) {
                    if (parent == null) {
                        throw new IllegalViewOperationException("Tag " + i2 + " is not an ancestor of tag " + i);
                    }
                }
            }
            measureLayoutRelativeToVerifiedAncestor(oejVarC, oejVarC2, iArr);
            return;
        }
        if (!handleNullShadowNodeExceptionSelf()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tag ");
            if (oejVarC != null) {
                i = i2;
            }
            sb.append(i);
            sb.append(" does not exist");
            throw new IllegalViewOperationException(sb.toString());
        }
        handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: measureLayout() node == null || ancestor == null"));
    }

    private void measureLayoutRelativeToParent(int i, int[] iArr) {
        oej oejVarC = this.mShadowNodeRegistry.c(i);
        if (oejVarC == null) {
            if (handleNullShadowNodeExceptionSelf()) {
                handleNullShadowNodeException(new NullShadowNodeException("UIImplementationNullShadowNode: measureLayoutRelativeToParent() mShadowNodeRegistry.getNode(tag):" + i));
                return;
            }
            throw new IllegalViewOperationException("No native view for tag " + i + " exists!");
        }
        oej parent = oejVarC.getParent();
        if (parent != null) {
            measureLayoutRelativeToVerifiedAncestor(oejVarC, parent, iArr);
            return;
        }
        throw new IllegalViewOperationException("View with tag " + i + " doesn't have a parent!");
    }
}

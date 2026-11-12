package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import l7.f;
import l7.g;
import p1.b0;
import p1.l1;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final androidx.customview.widget.b.a<f> NODE_ADAPTER = new C0090a();
    private static final androidx.customview.widget.b.InterfaceC0091b<l1<f>, f> SPARSE_VALUES_ADAPTER = new b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: androidx.customview.widget.a$a, reason: collision with other inner class name */
    public class C0090a implements androidx.customview.widget.b.a<f> {
    }

    public class b implements androidx.customview.widget.b.InterfaceC0091b<l1<f>, f> {
    }

    public class c extends g {
        public c() {
        }

        @Override // l7.g
        public final f b(int i14) {
            return f.j(a.this.obtainAccessibilityNodeInfo(i14));
        }

        @Override // l7.g
        public final f c(int i14) {
            a aVar = a.this;
            int i15 = i14 == 2 ? aVar.mAccessibilityFocusedVirtualViewId : aVar.mKeyboardFocusedVirtualViewId;
            if (i15 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i15);
        }

        @Override // l7.g
        public final boolean d(int i14, int i15, Bundle bundle) {
            return a.this.performAction(i14, i15, bundle);
        }
    }

    public a(View view2) {
        if (view2 == null) {
            h.s("View may not be null");
            throw null;
        }
        this.mHost = view2;
        this.mManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        view2.setFocusable(true);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (view2.getImportantForAccessibility() == 0) {
            view2.setImportantForAccessibility(1);
        }
    }

    private boolean clearAccessibilityFocus(int i14) {
        if (this.mAccessibilityFocusedVirtualViewId != i14) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i14, 65536);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i14 = this.mKeyboardFocusedVirtualViewId;
        return i14 != Integer.MIN_VALUE && onPerformActionForVirtualView(i14, 16, null);
    }

    private AccessibilityEvent createEvent(int i14, int i15) {
        return i14 != -1 ? createEventForChild(i14, i15) : createEventForHost(i15);
    }

    private AccessibilityEvent createEventForChild(int i14, int i15) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i15);
        f fVarObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i14);
        accessibilityEventObtain.getText().add(fVarObtainAccessibilityNodeInfo.g());
        AccessibilityNodeInfo accessibilityNodeInfo = fVarObtainAccessibilityNodeInfo.f110563a;
        accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i14, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            kg.f.n("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain.setSource(this.mHost, i14);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i14) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i14);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private f createNodeForChild(int i14) {
        f fVarH = f.h();
        AccessibilityNodeInfo accessibilityNodeInfo = fVarH.f110563a;
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocusable(true);
        fVarH.n(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        accessibilityNodeInfo.setBoundsInParent(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        View view2 = this.mHost;
        fVarH.f110564b = -1;
        accessibilityNodeInfo.setParent(view2);
        onPopulateNodeForVirtualView(i14, fVarH);
        if (fVarH.g() == null && accessibilityNodeInfo.getContentDescription() == null) {
            kg.f.n("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        fVarH.f(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            kg.f.n("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfo.getActions();
        if ((actions & 64) != 0) {
            kg.f.n("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            kg.f.n("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfo.setPackageName(this.mHost.getContext().getPackageName());
        View view3 = this.mHost;
        fVarH.f110565c = i14;
        accessibilityNodeInfo.setSource(view3, i14);
        if (this.mAccessibilityFocusedVirtualViewId == i14) {
            accessibilityNodeInfo.setAccessibilityFocused(true);
            fVarH.a(128);
        } else {
            accessibilityNodeInfo.setAccessibilityFocused(false);
            fVarH.a(64);
        }
        boolean z14 = this.mKeyboardFocusedVirtualViewId == i14;
        if (z14) {
            fVarH.a(2);
        } else if (accessibilityNodeInfo.isFocusable()) {
            fVarH.a(1);
        }
        accessibilityNodeInfo.setFocused(z14);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        accessibilityNodeInfo.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            fVarH.f(this.mTempScreenRect);
            if (fVarH.f110564b != -1) {
                f fVarH2 = f.h();
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVarH2.f110563a;
                for (int i15 = fVarH.f110564b; i15 != -1; i15 = fVarH2.f110564b) {
                    View view4 = this.mHost;
                    fVarH2.f110564b = -1;
                    accessibilityNodeInfo2.setParent(view4, -1);
                    accessibilityNodeInfo2.setBoundsInParent(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i15, fVarH2);
                    fVarH2.f(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                accessibilityNodeInfo.setBoundsInScreen(this.mTempScreenRect);
                if (isVisibleToUser(this.mTempScreenRect)) {
                    accessibilityNodeInfo.setVisibleToUser(true);
                }
            }
        }
        return fVarH;
    }

    private f createNodeForHost() {
        f fVarI = f.i(this.mHost);
        View view2 = this.mHost;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVarI.f110563a;
        view2.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (accessibilityNodeInfo.getChildCount() > 0 && arrayList.size() > 0) {
            kg.f.n("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            accessibilityNodeInfo.addChild(this.mHost, ((Integer) arrayList.get(i14)).intValue());
        }
        return fVarI;
    }

    private l1<f> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        l1<f> l1Var = new l1<>();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            l1Var.e(((Integer) arrayList.get(i14)).intValue(), createNodeForChild(((Integer) arrayList.get(i14)).intValue()));
        }
        return l1Var;
    }

    private void getBoundsInParent(int i14, Rect rect) {
        obtainAccessibilityNodeInfo(i14).f(rect);
    }

    private static Rect guessPreviouslyFocusedRect(View view2, int i14, Rect rect) {
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (i14 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i14 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i14 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i14 == 130) {
            rect.set(0, -1, width, -1);
            return rect;
        }
        h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return null;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                return false;
            }
            parent = view2.getParent();
        }
        return parent != null;
    }

    private static int keyToDirection(int i14) {
        if (i14 == 19) {
            return 33;
        }
        if (i14 != 21) {
            return i14 != 22 ? 130 : 66;
        }
        return 17;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x0147  */
    private boolean moveFocus(int i14, Rect rect) {
        Object obj;
        f fVar;
        l1<f> allNodes = getAllNodes();
        int i15 = this.mKeyboardFocusedVirtualViewId;
        int iD = Integer.MIN_VALUE;
        f fVarC = i15 == Integer.MIN_VALUE ? null : allNodes.c(i15);
        int i16 = -1;
        if (i14 == 1 || i14 == 2) {
            View view2 = this.mHost;
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            boolean z14 = view2.getLayoutDirection() == 1;
            androidx.customview.widget.b.InterfaceC0091b<l1<f>, f> interfaceC0091b = SPARSE_VALUES_ADAPTER;
            androidx.customview.widget.b.a<f> aVar = NODE_ADAPTER;
            ((b) interfaceC0091b).getClass();
            int iF = allNodes.f();
            ArrayList arrayList = new ArrayList(iF);
            for (int i17 = 0; i17 < iF; i17++) {
                arrayList.add(allNodes.g(i17));
            }
            Collections.sort(arrayList, new androidx.customview.widget.b.c(z14, aVar));
            if (i14 == 1) {
                int size = arrayList.size();
                if (fVarC != null) {
                    size = arrayList.indexOf(fVarC);
                }
                int i18 = size - 1;
                if (i18 >= 0) {
                    obj = arrayList.get(i18);
                } else {
                    obj = null;
                }
            } else {
                if (i14 != 2) {
                    h.s("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList.size();
                int iLastIndexOf = (fVarC == null ? -1 : arrayList.lastIndexOf(fVarC)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            fVar = (f) obj;
        } else {
            if (i14 != 17 && i14 != 33 && i14 != 66 && i14 != 130) {
                h.s("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i19 = this.mKeyboardFocusedVirtualViewId;
            if (i19 != Integer.MIN_VALUE) {
                getBoundsInParent(i19, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i14, rect2);
            }
            androidx.customview.widget.b.InterfaceC0091b<l1<f>, f> interfaceC0091b2 = SPARSE_VALUES_ADAPTER;
            androidx.customview.widget.b.a<f> aVar2 = NODE_ADAPTER;
            Rect rect3 = new Rect(rect2);
            if (i14 == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i14 == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i14 == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i14 != 130) {
                    h.s("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            ((b) interfaceC0091b2).getClass();
            int iF2 = allNodes.f();
            Rect rect4 = new Rect();
            fVar = null;
            for (int i24 = 0; i24 < iF2; i24++) {
                f fVarG = allNodes.g(i24);
                if (fVarG != fVarC) {
                    ((C0090a) aVar2).getClass();
                    fVarG.f(rect4);
                    if (androidx.customview.widget.b.c(i14, rect2, rect4)) {
                        if (!androidx.customview.widget.b.c(i14, rect2, rect3) || androidx.customview.widget.b.a(i14, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            fVar = fVarG;
                        } else if (!androidx.customview.widget.b.a(i14, rect2, rect3, rect4)) {
                            int iD2 = androidx.customview.widget.b.d(i14, rect2, rect4);
                            int iE = androidx.customview.widget.b.e(i14, rect2, rect4);
                            int i25 = (iE * iE) + (iD2 * 13 * iD2);
                            int iD3 = androidx.customview.widget.b.d(i14, rect2, rect3);
                            int iE2 = androidx.customview.widget.b.e(i14, rect2, rect3);
                            if (i25 < (iE2 * iE2) + (iD3 * 13 * iD3)) {
                                rect3.set(rect4);
                                fVar = fVarG;
                            }
                        }
                    }
                }
            }
        }
        f fVar2 = fVar;
        if (fVar2 != null) {
            if (allNodes.f134764a) {
                b0.a(allNodes);
            }
            int i26 = allNodes.f134767d;
            for (int i27 = 0; i27 < i26; i27++) {
                if (allNodes.f134766c[i27] == fVar2) {
                    i16 = i27;
                    break;
                }
            }
            iD = allNodes.d(i16);
        }
        return requestKeyboardFocusForVirtualView(iD);
    }

    private boolean performActionForChild(int i14, int i15, Bundle bundle) {
        if (i15 == 1) {
            return requestKeyboardFocusForVirtualView(i14);
        }
        if (i15 == 2) {
            return clearKeyboardFocusForVirtualView(i14);
        }
        if (i15 != 64) {
            return i15 != 128 ? onPerformActionForVirtualView(i14, i15, bundle) : clearAccessibilityFocus(i14);
        }
        return requestAccessibilityFocus(i14);
    }

    private boolean performActionForHost(int i14, Bundle bundle) {
        View view2 = this.mHost;
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        return view2.performAccessibilityAction(i14, bundle);
    }

    private boolean requestAccessibilityFocus(int i14) {
        int i15;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i15 = this.mAccessibilityFocusedVirtualViewId) == i14) {
            return false;
        }
        if (i15 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i15);
        }
        this.mAccessibilityFocusedVirtualViewId = i14;
        this.mHost.invalidate();
        sendEventForVirtualView(i14, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i14) {
        int i15 = this.mHoveredVirtualViewId;
        if (i15 == i14) {
            return;
        }
        this.mHoveredVirtualViewId = i14;
        sendEventForVirtualView(i14, 128);
        sendEventForVirtualView(i15, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i14) {
        if (this.mKeyboardFocusedVirtualViewId != i14) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i14, false);
        sendEventForVirtualView(i14, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                updateHoveredVirtualView(Integer.MIN_VALUE);
                return true;
            }
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(virtualViewAt);
            if (virtualViewAt != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i14 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iKeyToDirection = keyToDirection(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z14 = false;
                                while (i14 < repeatCount && moveFocus(iKeyToDirection, null)) {
                                    i14++;
                                    z14 = true;
                                }
                                return z14;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                clickKeyboardFocusedVirtualView();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    clickKeyboardFocusedVirtualView();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return moveFocus(1, null);
                }
            }
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.a
    public g getAccessibilityNodeProvider(View view2) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new c();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f14, float f15);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i14, int i15) {
        ViewParent parent;
        if (i14 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i14, 2048);
        accessibilityEventCreateEvent.setContentChangeTypes(i15);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventCreateEvent);
    }

    public f obtainAccessibilityNodeInfo(int i14) {
        return i14 == -1 ? createNodeForHost() : createNodeForChild(i14);
    }

    public final void onFocusChanged(boolean z14, int i14, Rect rect) {
        int i15 = this.mKeyboardFocusedVirtualViewId;
        if (i15 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i15);
        }
        if (z14) {
            moveFocus(i14, rect);
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view2, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view2, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view2, f fVar) {
        super.onInitializeAccessibilityNodeInfo(view2, fVar);
        onPopulateNodeForHost(fVar);
    }

    public abstract boolean onPerformActionForVirtualView(int i14, int i15, Bundle bundle);

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i14, AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(f fVar) {
    }

    public abstract void onPopulateNodeForVirtualView(int i14, f fVar);

    public void onVirtualViewKeyboardFocusChanged(int i14, boolean z14) {
    }

    public boolean performAction(int i14, int i15, Bundle bundle) {
        return i14 != -1 ? performActionForChild(i14, i15, bundle) : performActionForHost(i15, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i14) {
        int i15;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i15 = this.mKeyboardFocusedVirtualViewId) == i14) {
            return false;
        }
        if (i15 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i15);
        }
        if (i14 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i14;
        onVirtualViewKeyboardFocusChanged(i14, true);
        sendEventForVirtualView(i14, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i14, int i15) {
        ViewParent parent;
        if (i14 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i14, i15));
    }

    public final void invalidateVirtualView(int i14) {
        invalidateVirtualView(i14, 0);
    }
}

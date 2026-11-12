package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.SparseArrayCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class mj8 extends androidx.core.view.a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final nz9.a<m80> NODE_ADAPTER = new a();
    private static final nz9.b<SparseArrayCompat<m80>, m80> SPARSE_VALUES_ADAPTER = new b();
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

    public class a implements nz9.a<m80> {
        @Override // nz9.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m80 m80Var, Rect rect) {
            m80Var.k(rect);
        }
    }

    public class b implements nz9.b<SparseArrayCompat<m80>, m80> {
        @Override // nz9.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public m80 a(SparseArrayCompat<m80> sparseArrayCompat, int i) {
            return sparseArrayCompat.valueAt(i);
        }

        @Override // nz9.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(SparseArrayCompat<m80> sparseArrayCompat) {
            return sparseArrayCompat.size();
        }
    }

    public class c extends n80 {
        public c() {
        }

        @Override // defpackage.n80
        public m80 b(int i) {
            return m80.W(mj8.this.obtainAccessibilityNodeInfo(i));
        }

        @Override // defpackage.n80
        public m80 d(int i) {
            int i2 = i == 2 ? mj8.this.mAccessibilityFocusedVirtualViewId : mj8.this.mKeyboardFocusedVirtualViewId;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // defpackage.n80
        public boolean f(int i, int i2, Bundle bundle) {
            return mj8.this.performAction(i, i2, bundle);
        }
    }

    public mj8(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (androidx.core.view.c.y(view) == 0) {
            androidx.core.view.c.C0(view, 1);
        }
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        return i != -1 ? createEventForChild(i, i2) : createEventForHost(i2);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        m80 m80VarObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(m80VarObtainAccessibilityNodeInfo.y());
        accessibilityEventObtain.setContentDescription(m80VarObtainAccessibilityNodeInfo.r());
        accessibilityEventObtain.setScrollable(m80VarObtainAccessibilityNodeInfo.Q());
        accessibilityEventObtain.setPassword(m80VarObtainAccessibilityNodeInfo.P());
        accessibilityEventObtain.setEnabled(m80VarObtainAccessibilityNodeInfo.J());
        accessibilityEventObtain.setChecked(m80VarObtainAccessibilityNodeInfo.G());
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(m80VarObtainAccessibilityNodeInfo.o());
        o80.c(accessibilityEventObtain, this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private m80 createNodeForChild(int i) {
        m80 m80VarV = m80.V();
        m80VarV.o0(true);
        m80VarV.q0(true);
        m80VarV.i0(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        m80VarV.d0(rect);
        m80VarV.e0(rect);
        m80VarV.A0(this.mHost);
        onPopulateNodeForVirtualView(i, m80VarV);
        if (m80VarV.y() == null && m80VarV.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        m80VarV.k(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int i2 = m80VarV.i();
        if ((i2 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((i2 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        m80VarV.y0(this.mHost.getContext().getPackageName());
        m80VarV.J0(this.mHost, i);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            m80VarV.b0(true);
            m80VarV.a(128);
        } else {
            m80VarV.b0(false);
            m80VarV.a(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            m80VarV.a(2);
        } else if (m80VarV.K()) {
            m80VarV.a(1);
        }
        m80VarV.r0(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        m80VarV.l(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            m80VarV.k(this.mTempScreenRect);
            if (m80VarV.f25862b != -1) {
                m80 m80VarV2 = m80.V();
                for (int i3 = m80VarV.f25862b; i3 != -1; i3 = m80VarV2.f25862b) {
                    m80VarV2.B0(this.mHost, -1);
                    m80VarV2.d0(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i3, m80VarV2);
                    m80VarV2.k(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                m80VarV2.Z();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                m80VarV.e0(this.mTempScreenRect);
                if (isVisibleToUser(this.mTempScreenRect)) {
                    m80VarV.N0(true);
                }
            }
        }
        return m80VarV;
    }

    private m80 createNodeForHost() {
        m80 m80VarX = m80.X(this.mHost);
        androidx.core.view.c.d0(this.mHost, m80VarX);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (m80VarX.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m80VarX.d(this.mHost, ((Integer) arrayList.get(i)).intValue());
        }
        return m80VarX;
    }

    private SparseArrayCompat<m80> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        SparseArrayCompat<m80> sparseArrayCompat = new SparseArrayCompat<>();
        for (int i = 0; i < arrayList.size(); i++) {
            sparseArrayCompat.put(arrayList.get(i).intValue(), createNodeForChild(arrayList.get(i).intValue()));
        }
        return sparseArrayCompat;
    }

    private void getBoundsInParent(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).k(rect);
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int keyToDirection(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean moveFocus(int i, Rect rect) {
        m80 m80Var;
        SparseArrayCompat<m80> allNodes = getAllNodes();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        m80 m80Var2 = i2 == Integer.MIN_VALUE ? null : allNodes.get(i2);
        if (i == 1 || i == 2) {
            m80Var = (m80) nz9.d(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, m80Var2, i, androidx.core.view.c.A(this.mHost) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i3 = this.mKeyboardFocusedVirtualViewId;
            if (i3 != Integer.MIN_VALUE) {
                getBoundsInParent(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i, rect2);
            }
            m80Var = (m80) nz9.c(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, m80Var2, rect2, i);
        }
        return requestKeyboardFocusForVirtualView(m80Var != null ? allNodes.keyAt(allNodes.indexOfValue(m80Var)) : Integer.MIN_VALUE);
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? onPerformActionForVirtualView(i, i2, bundle) : clearAccessibilityFocus(i);
        }
        return requestAccessibilityFocus(i);
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        return androidx.core.view.c.f0(this.mHost, i, bundle);
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(virtualViewAt);
            return virtualViewAt != Integer.MIN_VALUE;
        }
        if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
            return false;
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return moveFocus(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return moveFocus(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iKeyToDirection = keyToDirection(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i < repeatCount && moveFocus(iKeyToDirection, null)) {
                        i++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        clickKeyboardFocusedVirtualView();
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.a
    public n80 getAccessibilityNodeProvider(View view) {
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

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public m80 obtainAccessibilityNodeInfo(int i) {
        return i == -1 ? createNodeForHost() : createNodeForChild(i);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
        super.onInitializeAccessibilityNodeInfo(view, m80Var);
        onPopulateNodeForHost(m80Var);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    public void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(m80 m80Var) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, m80 m80Var);

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return i != -1 ? performActionForChild(i, i2, bundle) : performActionForHost(i2, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i, i2));
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, 2048);
        t70.b(accessibilityEventCreateEvent, i2);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventCreateEvent);
    }
}

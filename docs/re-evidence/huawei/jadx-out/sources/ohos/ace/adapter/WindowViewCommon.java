package ohos.ace.adapter;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.huawei.hms.ads.jsb.constant.Constant;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ohos.ace.adapter.capability.platformview.AcePlatformViewBase;
import ohos.ace.adapter.capability.platformview.AcePlatformViewPluginBase;
import ohos.ace.adapter.capability.web.AceWebBase;
import ohos.ace.adapter.capability.web.AceWebPluginBase;

/* JADX INFO: loaded from: classes20.dex */
public class WindowViewCommon {
    private static final int AVOID_TYPE_CUTOUT = 1;
    private static final int AVOID_TYPE_KEYBOARD = 3;
    private static final int AVOID_TYPE_NAVIGATION_INDICATOR = 4;
    private static final int AVOID_TYPE_SYSTEM = 0;
    private static final int AVOID_TYPE_SYSTEM_GESTURE = 2;
    private static final String TAG = "WindowViewCommon";
    private static boolean sAndroidXAvailable;
    private static boolean sAndroidXVersionSupportedGetInsets;
    private AcePlatformViewPluginBase acePlatformViewPluginBase;
    private AceWebPluginBase aceWebPluginBase;
    private WindowViewInterface windowViewInterface;
    private long nativeWindowPtr = 0;
    private int surfaceWidth = 0;
    private int surfaceHeight = 0;
    private int lastMouseButtonState = 0;
    private int lastMouseActionKey = 0;
    private float density = 0.0f;
    private float lastMouseX = 0.0f;
    private float lastMouseY = 0.0f;
    private boolean delayNotifySurfaceChanged = false;
    private boolean delayNotifySurfaceDestroyed = false;
    private boolean delayNotifyForeground = false;
    private boolean delayNotifyAvoidAreaChanged = false;
    private boolean enterPressed = false;
    private boolean numpadEnterPressed = false;
    private boolean isWindowOrientationChanging = false;
    private boolean keyboardVisible = false;
    private InputConnectionClient inputClient = null;
    private Surface delayNotifyCreateSurface = null;
    private HashMap<Integer, AvoidArea> avoidAreaRects = new HashMap<>();

    /* JADX INFO: loaded from: classes46.dex */
    public interface LocationCallback {
        void onLocationReceived(Rect rect);
    }

    private native void nativeAvoidAreaChanged(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    private native boolean nativeBackPressed(long j);

    private native void nativeBackground(long j);

    private native void nativeDestroy(long j);

    private native boolean nativeDispatchKeyEvent(long j, int i, int i2, int i3, long j2, long j3, int i4, int i5, int i6);

    private native boolean nativeDispatchMouseDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native boolean nativeDispatchPointerDataPacket(long j, ByteBuffer byteBuffer, int i);

    private native void nativeForeground(long j);

    private native void nativeKeyboardHeightChanged(long j, int i);

    private native void nativeOnWindowFocusChanged(long j, boolean z);

    private native void nativeSurfaceChanged(long j, int i, int i2, float f);

    private native void nativeSurfaceCreated(long j, Surface surface);

    private native void nativeSurfaceDestroyed(long j);

    private native void nativeWindowSizeChanged(long j, int i, int i2);

    /* JADX INFO: loaded from: classes46.dex */
    static class Size {
        public int height;
        public int width;

        public Size(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    static {
        boolean z = true;
        try {
            Class.forName("androidx.core.view.ViewCompat");
            Class.forName("androidx.core.view.WindowInsetsCompat");
            Class.forName("androidx.core.view.WindowInsetsCompat$Type");
            sAndroidXAvailable = true;
        } catch (ClassNotFoundException unused) {
            sAndroidXAvailable = false;
        }
        try {
            if (Class.forName("androidx.core.view.WindowInsetsCompat").getMethod("getInsets", Integer.TYPE) == null) {
                z = false;
            }
            sAndroidXVersionSupportedGetInsets = z;
        } catch (Exception unused2) {
            sAndroidXVersionSupportedGetInsets = false;
        }
    }

    public WindowViewCommon(WindowViewInterface windowViewInterface) {
        this.windowViewInterface = null;
        this.windowViewInterface = windowViewInterface;
    }

    public void setInputConnectionClient(InputConnectionClient inputConnectionClient) {
        this.inputClient = inputConnectionClient;
    }

    public void registerWindow(long j) {
        this.nativeWindowPtr = j;
        setupWindowInsetsListener();
        delayNotifyIfNeeded();
    }

    public void unRegisterWindow() {
        this.nativeWindowPtr = 0L;
    }

    public void setWebPlugin(AceWebPluginBase aceWebPluginBase) {
        this.aceWebPluginBase = aceWebPluginBase;
    }

    public void setPlatformViewPlugin(AcePlatformViewPluginBase acePlatformViewPluginBase) {
        this.acePlatformViewPluginBase = acePlatformViewPluginBase;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnectionClient inputConnectionClient = this.inputClient;
        if (inputConnectionClient != null) {
            WindowViewInterface windowViewInterface = this.windowViewInterface;
            if (windowViewInterface instanceof WindowViewSurface) {
                return inputConnectionClient.onCreateInputConnection((WindowViewSurface) windowViewInterface, editorInfo);
            }
            if (windowViewInterface instanceof WindowViewTexture) {
                return inputConnectionClient.onCreateInputConnection((WindowViewTexture) windowViewInterface, editorInfo);
            }
            return null;
        }
        ALog.i(TAG, "onCreateInputConnection");
        return this.windowViewInterface.superOnCreateInputConnection(editorInfo);
    }

    public void surfaceCreated(Surface surface) {
        if (this.nativeWindowPtr == 0) {
            ALog.w(TAG, "surfaceCreated nativeWindow not ready, delay notify");
            this.delayNotifyCreateSurface = surface;
        } else {
            ALog.i(TAG, "surfaceCreated");
            nativeSurfaceCreated(this.nativeWindowPtr, surface);
        }
    }

    public void surfaceSizeChanged(int i, int i2, float f) {
        this.surfaceWidth = i;
        this.surfaceHeight = i2;
        this.density = f;
        if (this.nativeWindowPtr == 0) {
            ALog.w(TAG, "surfaceChanged nativeWindow not ready, delay notify");
            this.delayNotifySurfaceChanged = true;
            return;
        }
        ALog.i(TAG, "surfaceChanged w=" + this.surfaceWidth + " h=" + this.surfaceHeight);
        nativeSurfaceChanged(this.nativeWindowPtr, this.surfaceWidth, this.surfaceHeight, this.density);
    }

    public void surfaceDestroyed() {
        if (this.nativeWindowPtr == 0) {
            ALog.w(TAG, "surfaceDestroyed nativeWindow not ready, delay notify");
            this.delayNotifySurfaceDestroyed = true;
        } else {
            ALog.i(TAG, "surfaceDestroyed");
            nativeSurfaceDestroyed(this.nativeWindowPtr);
        }
    }

    public void keyboardHeightChanged(int i) {
        ALog.i(TAG, "keyboardHeightChanged call");
        this.keyboardVisible = i > 0;
        long j = this.nativeWindowPtr;
        if (j == 0) {
            ALog.w(TAG, "keyboardHeightChanged nativeWindow not ready.");
        } else {
            nativeKeyboardHeightChanged(j, i);
        }
    }

    public void onInsetsAreaChanged(final WindowInsetsCompat windowInsetsCompat) {
        if (!sAndroidXAvailable) {
            ALog.w(TAG, "AndroidX is not available.");
            return;
        }
        ALog.d(TAG, "WindowonInsetsAreaChanged" + this.nativeWindowPtr);
        getLocationOnScreen(new LocationCallback() { // from class: ohos.ace.adapter.WindowViewCommon.1
            @Override // ohos.ace.adapter.WindowViewCommon.LocationCallback
            public void onLocationReceived(Rect rect) {
                WindowViewCommon.this.processAvoidAreas(windowInsetsCompat, rect);
            }
        });
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.nativeWindowPtr == 0) {
            ALog.w(TAG, "onWindowFocusChanged: nativeWindow is null");
        } else {
            ALog.i(TAG, "onWindowFocusChanged call");
            nativeOnWindowFocusChanged(this.nativeWindowPtr, z);
        }
    }

    public void foreground() {
        if (this.nativeWindowPtr == 0) {
            ALog.w(TAG, "foreground: nativeWindow is null, delay notify");
            this.delayNotifyForeground = true;
        } else {
            ALog.i(TAG, "foreground call");
            nativeForeground(this.nativeWindowPtr);
        }
    }

    public void background() {
        if (this.nativeWindowPtr == 0) {
            ALog.w(TAG, "background: nativeWindow is null");
        } else {
            ALog.i(TAG, "background call");
            nativeBackground(this.nativeWindowPtr);
        }
    }

    public void destroy() {
        if (this.nativeWindowPtr == 0) {
            ALog.w(TAG, "destroy: nativeWindow is null");
        } else {
            ALog.i(TAG, "destroy call");
            nativeDestroy(this.nativeWindowPtr);
        }
    }

    public boolean backPressed() {
        if (this.nativeWindowPtr == 0) {
            ALog.w(TAG, "backPressed: nativeWindow is null");
            return false;
        }
        ALog.i(TAG, "backPressed call");
        return nativeBackPressed(this.nativeWindowPtr);
    }

    public void setWindowOrientation(boolean z) {
        this.isWindowOrientationChanging = z;
    }

    public boolean getWindowOrientation() {
        return this.isWindowOrientationChanging;
    }

    public boolean onHoverEventAosp(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (this.nativeWindowPtr == 0) {
            return this.windowViewInterface.superOnTouchEvent(motionEvent);
        }
        setWebTouchEvent(motionEvent);
        setPlatformViewTouchEvent(motionEvent);
        try {
            if (motionEvent.getSource() == 8194) {
                this.lastMouseX = motionEvent.getX(motionEvent.getActionIndex());
                this.lastMouseY = motionEvent.getY(motionEvent.getActionIndex());
                ByteBuffer byteBufferProcessMouseEvent = AceEventProcessorAosp.processMouseEvent(motionEvent, getActionKey(motionEvent.getActionMasked(), motionEvent.getButtonState()), this.lastMouseX, this.lastMouseY);
                nativeDispatchMouseDataPacket(this.nativeWindowPtr, byteBufferProcessMouseEvent, byteBufferProcessMouseEvent.position());
            }
            ByteBuffer byteBufferProcessHoverTouchEvent = AceEventProcessorAosp.processHoverTouchEvent(motionEvent);
            nativeDispatchPointerDataPacket(this.nativeWindowPtr, byteBufferProcessHoverTouchEvent, byteBufferProcessHoverTouchEvent.position());
            return true;
        } catch (AssertionError e) {
            ALog.e(TAG, "process touch event failed: " + e.getMessage());
            return false;
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (this.nativeWindowPtr == 0) {
            return this.windowViewInterface.superOnHoverEvent(motionEvent);
        }
        try {
            this.lastMouseX = motionEvent.getX(motionEvent.getActionIndex());
            this.lastMouseY = motionEvent.getY(motionEvent.getActionIndex());
            ByteBuffer byteBufferProcessMouseEvent = AceEventProcessorAosp.processMouseEvent(motionEvent, getActionKey(motionEvent.getActionMasked(), motionEvent.getButtonState()), this.lastMouseX, this.lastMouseY);
            nativeDispatchMouseDataPacket(this.nativeWindowPtr, byteBufferProcessMouseEvent, byteBufferProcessMouseEvent.position());
            return true;
        } catch (AssertionError e) {
            ALog.e(TAG, "process hover event failed: " + e.getMessage());
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (this.nativeWindowPtr == 0) {
            return this.windowViewInterface.superOnTouchEvent(motionEvent);
        }
        setWebTouchEvent(motionEvent);
        setPlatformViewTouchEvent(motionEvent);
        try {
            if (motionEvent.getSource() == 8194) {
                this.lastMouseX = motionEvent.getX(motionEvent.getActionIndex());
                this.lastMouseY = motionEvent.getY(motionEvent.getActionIndex());
                int actionMasked = motionEvent.getActionMasked();
                int buttonState = motionEvent.getButtonState();
                int i = this.lastMouseButtonState;
                ByteBuffer byteBufferProcessMouseEvent = AceEventProcessorAosp.processMouseEvent(motionEvent, getActionKey(actionMasked, buttonState), this.lastMouseX, this.lastMouseY);
                nativeDispatchMouseDataPacket(this.nativeWindowPtr, byteBufferProcessMouseEvent, byteBufferProcessMouseEvent.position());
                boolean z = actionMasked == 0 || actionMasked == 1 || actionMasked == 2;
                boolean z2 = (i & 1) != 0;
                if ((z && (buttonState == 1 || z2)) || (actionMasked == 3 && z2)) {
                    ByteBuffer byteBufferProcessTouchEvent = AceEventProcessorAosp.processTouchEvent(motionEvent);
                    nativeDispatchPointerDataPacket(this.nativeWindowPtr, byteBufferProcessTouchEvent, byteBufferProcessTouchEvent.position());
                }
                return true;
            }
            ByteBuffer byteBufferProcessTouchEvent2 = AceEventProcessorAosp.processTouchEvent(motionEvent);
            nativeDispatchPointerDataPacket(this.nativeWindowPtr, byteBufferProcessTouchEvent2, byteBufferProcessTouchEvent2.position());
            return true;
        } catch (AssertionError e) {
            ALog.e(TAG, "process touch event failed: " + e.getMessage());
            return false;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if (this.nativeWindowPtr == 0) {
            return this.windowViewInterface.superOnKeyDown(i, keyEvent);
        }
        if (filterNumpadKeyCode(i, keyEvent.getAction())) {
            return this.windowViewInterface.superOnKeyDown(i, keyEvent);
        }
        int source = keyEvent.getSource();
        if (source == 8194 && (i == 125 || i == 4)) {
            ByteBuffer byteBufferProcessMouseEvent = AceEventProcessorAosp.processMouseEvent(keyEvent, this.lastMouseX, this.lastMouseY);
            nativeDispatchMouseDataPacket(this.nativeWindowPtr, byteBufferProcessMouseEvent, byteBufferProcessMouseEvent.position());
            return true;
        }
        markdownNumpadKeyStatus(i, keyEvent.getAction());
        int modifierKeys = AceEventProcessorAosp.getModifierKeys(keyEvent);
        if (nativeDispatchKeyEvent(this.nativeWindowPtr, keyEvent.getKeyCode(), keyEvent.getAction(), keyEvent.getRepeatCount(), keyEvent.getEventTime(), keyEvent.getDownTime(), AceEventProcessorAosp.eventSourceTransKeySource(source), keyEvent.getDeviceId(), modifierKeys)) {
            return true;
        }
        return this.windowViewInterface.superOnKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if (this.nativeWindowPtr == 0) {
            return this.windowViewInterface.superOnKeyUp(i, keyEvent);
        }
        if (filterNumpadKeyCode(i, keyEvent.getAction())) {
            return this.windowViewInterface.superOnKeyUp(i, keyEvent);
        }
        int source = keyEvent.getSource();
        if (source == 8194 && (i == 125 || i == 4)) {
            ByteBuffer byteBufferProcessMouseEvent = AceEventProcessorAosp.processMouseEvent(keyEvent, this.lastMouseX, this.lastMouseY);
            nativeDispatchMouseDataPacket(this.nativeWindowPtr, byteBufferProcessMouseEvent, byteBufferProcessMouseEvent.position());
            return true;
        }
        markdownNumpadKeyStatus(i, keyEvent.getAction());
        int modifierKeys = AceEventProcessorAosp.getModifierKeys(keyEvent);
        if (nativeDispatchKeyEvent(this.nativeWindowPtr, keyEvent.getKeyCode(), keyEvent.getAction(), keyEvent.getRepeatCount(), keyEvent.getEventTime(), keyEvent.getDownTime(), AceEventProcessorAosp.eventSourceTransKeySource(source), keyEvent.getDeviceId(), modifierKeys)) {
            return true;
        }
        return this.windowViewInterface.superOnKeyUp(i, keyEvent);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent, Context context) {
        if (i == 4 && keyEvent.getAction() == 1 && this.keyboardVisible && !this.inputClient.isStopBackPress()) {
            if (!(context instanceof Activity)) {
                ALog.e(TAG, "cannot get activity.");
                return this.windowViewInterface.superOnKeyPreIme(i, keyEvent);
            }
            ((Activity) context).onBackPressed();
            return true;
        }
        return this.windowViewInterface.superOnKeyPreIme(i, keyEvent);
    }

    private void setupWindowInsetsListener() {
        if (!sAndroidXAvailable) {
            ALog.w(TAG, "AndroidX is not available.");
            return;
        }
        WindowViewInterface windowViewInterface = this.windowViewInterface;
        if (windowViewInterface == null || windowViewInterface.getView() == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this.windowViewInterface.getView().getRootView(), new WindowInsetsListener());
    }

    private void removeWindowInsetsListener() {
        WindowViewInterface windowViewInterface;
        if (!sAndroidXAvailable || (windowViewInterface = this.windowViewInterface) == null || windowViewInterface.getView() == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(this.windowViewInterface.getView().getRootView(), null);
    }

    private void adjustToWindowCoordinate(AvoidArea avoidArea, Rect rect) {
        if (avoidArea == null || rect == null) {
            return;
        }
        Rect[] rectArr = {avoidArea.leftRect, avoidArea.topRect, avoidArea.rightRect, avoidArea.bottomRect};
        for (int i = 0; i < 4; i++) {
            Rect rect2 = rectArr[i];
            if (rect2 != null && !rect2.isEmpty()) {
                rect2.offset(-rect.left, -rect.top);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAvoidAreas(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        if (rect == null) {
            ALog.w(TAG, "Window processAvoidAreas: windowRect is null");
            return;
        }
        Size rootViewSize = getRootViewSize();
        for (int i = 0; i <= 4; i++) {
            if (i != 2) {
                if (!sAndroidXVersionSupportedGetInsets) {
                    ALog.e(TAG, "window please update your androidx version to 1.8.0 or higher.");
                    return;
                }
                onAvoidAreaChanged(i, windowInsetsCompat.getInsets(avoidTypeToType(i)), rootViewSize.width, rootViewSize.height, rect);
                ALog.d(TAG, "WindowscreenWidth:" + rootViewSize.width + "screenHeight:" + rootViewSize.height);
                ALog.d(TAG, "Windowrect:" + rect.left + "," + rect.top + "," + rect.width() + "," + rect.height() + "," + rect.bottom);
                StringBuilder sb = new StringBuilder("Window");
                sb.append(i);
                sb.append("left");
                sb.append(windowInsetsCompat.getInsets(avoidTypeToType(i)).left);
                ALog.d(TAG, sb.toString());
                StringBuilder sb2 = new StringBuilder("Window");
                sb2.append(i);
                sb2.append(Constant.MAP_KEY_TOP);
                sb2.append(windowInsetsCompat.getInsets(avoidTypeToType(i)).top);
                ALog.d(TAG, sb2.toString());
                ALog.d(TAG, "Window" + i + "right" + windowInsetsCompat.getInsets(avoidTypeToType(i)).right);
                ALog.d(TAG, "Window" + i + "bottom" + windowInsetsCompat.getInsets(avoidTypeToType(i)).bottom);
            }
        }
    }

    private void onAvoidAreaChanged(int i, Insets insets, int i2, int i3, Rect rect) {
        AvoidArea avoidArea = new AvoidArea(getIntersection(rect, new Rect(0, 0, insets.left, i3)), getIntersection(rect, new Rect(0, 0, i2, insets.top)), getIntersection(rect, new Rect(i2 - insets.right, 0, i2, i3)), getIntersection(rect, new Rect(0, i3 - insets.bottom, i2, i3)));
        adjustToWindowCoordinate(avoidArea, rect);
        if (this.avoidAreaRects.containsKey(Integer.valueOf(i)) && avoidArea.isEqualTo(this.avoidAreaRects.get(Integer.valueOf(i)))) {
            return;
        }
        this.avoidAreaRects.put(Integer.valueOf(i), avoidArea);
        ALog.d(TAG, "WindowonAvoidAreaChanged call");
        long j = this.nativeWindowPtr;
        if (j == 0) {
            this.delayNotifyAvoidAreaChanged = true;
            ALog.w(TAG, "WindowavoidAreaChanged nativeWindow not ready.");
        } else {
            nativeAvoidAreaChanged(j, i, avoidArea.leftRect.left, avoidArea.leftRect.top, avoidArea.leftRect.width(), avoidArea.leftRect.height(), avoidArea.topRect.left, avoidArea.topRect.top, avoidArea.topRect.width(), avoidArea.topRect.height(), avoidArea.rightRect.left, avoidArea.rightRect.top, avoidArea.rightRect.width(), avoidArea.rightRect.height(), avoidArea.bottomRect.left, avoidArea.bottomRect.top, avoidArea.bottomRect.width(), avoidArea.bottomRect.height());
        }
    }

    private Size getRootViewSize() {
        Size size = new Size(0, 0);
        WindowViewInterface windowViewInterface = this.windowViewInterface;
        if (windowViewInterface != null && windowViewInterface.getView() != null) {
            size.width = this.windowViewInterface.getView().getRootView().getWidth();
            size.height = this.windowViewInterface.getView().getRootView().getHeight();
        }
        return size;
    }

    private Rect getIntersection(Rect rect, Rect rect2) {
        if (rect == null || rect2 == null) {
            return new Rect(0, 0, 0, 0);
        }
        Rect rect3 = new Rect();
        if (rect3.setIntersect(rect, rect2) && rect3.width() > 0 && rect3.height() > 0) {
            return rect3;
        }
        rect3.setEmpty();
        return rect3;
    }

    private void getLocationOnScreen(final LocationCallback locationCallback) {
        ALog.d(TAG, "WindowgetLocationOnScreen");
        WindowViewInterface windowViewInterface = this.windowViewInterface;
        if (windowViewInterface == null || windowViewInterface.getView() == null) {
            if (locationCallback != null) {
                locationCallback.onLocationReceived(new Rect(0, 0, 0, 0));
            }
            ALog.e(TAG, "WindowwindowViewInterface == null || windowViewInterface.getView() == null");
            return;
        }
        View view = this.windowViewInterface.getView();
        if (view.getWindowToken() == null || !view.isAttachedToWindow()) {
            ALog.d(TAG, "WindowView is not attached to window, returning default rect");
            if (locationCallback != null) {
                locationCallback.onLocationReceived(new Rect(0, 0, 0, 0));
                return;
            }
            return;
        }
        view.post(new Runnable() { // from class: ohos.ace.adapter.WindowViewCommon.2
            @Override // java.lang.Runnable
            public void run() {
                Rect rect = new Rect();
                if (WindowViewCommon.this.windowViewInterface != null && WindowViewCommon.this.windowViewInterface.getView() != null) {
                    View view2 = WindowViewCommon.this.windowViewInterface.getView();
                    int[] iArr = new int[2];
                    view2.getLocationInWindow(iArr);
                    rect.left = iArr[0];
                    rect.top = iArr[1];
                    rect.right = rect.left + view2.getWidth();
                    rect.bottom = rect.top + view2.getHeight();
                    ALog.d(WindowViewCommon.TAG, "WindowgetLocationOnScreen delayed: left=" + rect.left + ", top=" + rect.top);
                }
                LocationCallback locationCallback2 = locationCallback;
                if (locationCallback2 != null) {
                    locationCallback2.onLocationReceived(rect);
                }
            }
        });
    }

    private int avoidTypeFromType(int i) {
        if (i == WindowInsetsCompat.Type.systemBars()) {
            return 0;
        }
        if (i == WindowInsetsCompat.Type.displayCutout()) {
            return 1;
        }
        if (i == WindowInsetsCompat.Type.navigationBars()) {
            return 4;
        }
        return i == WindowInsetsCompat.Type.ime() ? 3 : -1;
    }

    private int avoidTypeToType(int i) {
        if (i == 0) {
            return WindowInsetsCompat.Type.systemBars();
        }
        if (i == 1) {
            return WindowInsetsCompat.Type.displayCutout();
        }
        if (i == 4) {
            return WindowInsetsCompat.Type.navigationBars();
        }
        if (i == 3) {
            return WindowInsetsCompat.Type.ime();
        }
        return -1;
    }

    /* JADX INFO: loaded from: classes46.dex */
    static class WindowInsetsListener implements OnApplyWindowInsetsListener {
        private WindowInsetsListener() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            ALog.d(WindowViewCommon.TAG, "WindowonApplyWindowInsets");
            WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
            if (view instanceof WindowViewInterface) {
                ALog.d(WindowViewCommon.TAG, "Windowview instanceof WindowViewInterface");
                return windowInsetsCompatOnApplyWindowInsets;
            }
            ALog.d(WindowViewCommon.TAG, "Windowview not instanceof WindowViewInterface");
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.content);
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                KeyEvent.Callback childAt = viewGroup.getChildAt(i);
                if (childAt instanceof WindowViewInterface) {
                    ALog.d(WindowViewCommon.TAG, "Windowview is instanceof WindowViewInterface");
                    ((WindowViewInterface) childAt).onInsetsAreaChanged(windowInsetsCompat);
                }
            }
            return windowInsetsCompatOnApplyWindowInsets;
        }
    }

    private void delayNotifyIfNeeded() {
        boolean z;
        String str;
        WindowViewCommon windowViewCommon;
        WindowViewCommon windowViewCommon2 = this;
        long j = windowViewCommon2.nativeWindowPtr;
        String str2 = TAG;
        if (j == 0) {
            ALog.e(TAG, "delay notify, nativeWindow is invalid!");
            return;
        }
        boolean z2 = false;
        if (windowViewCommon2.delayNotifySurfaceDestroyed) {
            ALog.i(TAG, "delay notify surfaceDestroyed");
            windowViewCommon2.nativeSurfaceDestroyed(windowViewCommon2.nativeWindowPtr);
            windowViewCommon2.delayNotifySurfaceDestroyed = false;
        }
        if (windowViewCommon2.delayNotifyCreateSurface != null) {
            ALog.i(TAG, "delay notify surfaceCreated");
            windowViewCommon2.nativeSurfaceCreated(windowViewCommon2.nativeWindowPtr, windowViewCommon2.delayNotifyCreateSurface);
            windowViewCommon2.delayNotifyCreateSurface = null;
        }
        if (windowViewCommon2.delayNotifySurfaceChanged) {
            ALog.i(TAG, "delay notify surface changed w=" + windowViewCommon2.surfaceWidth + " h=" + windowViewCommon2.surfaceHeight);
            nativeSurfaceChanged(windowViewCommon2.nativeWindowPtr, windowViewCommon2.surfaceWidth, windowViewCommon2.surfaceHeight, windowViewCommon2.density);
            windowViewCommon2.delayNotifySurfaceChanged = false;
        }
        if (windowViewCommon2.delayNotifyAvoidAreaChanged) {
            ALog.i(TAG, "delay notify Insets changed");
            for (Map.Entry<Integer, AvoidArea> entry : windowViewCommon2.avoidAreaRects.entrySet()) {
                Integer key = entry.getKey();
                AvoidArea value = entry.getValue();
                nativeAvoidAreaChanged(windowViewCommon2.nativeWindowPtr, windowViewCommon2.avoidTypeFromType(key.intValue()), value.leftRect.left, value.leftRect.top, value.leftRect.width(), value.leftRect.height(), value.topRect.left, value.topRect.top, value.topRect.width(), value.topRect.height(), value.rightRect.left, value.rightRect.top, value.rightRect.width(), value.rightRect.height(), value.bottomRect.left, value.bottomRect.top, value.bottomRect.width(), value.bottomRect.height());
                z2 = false;
                windowViewCommon2 = this;
                str2 = str2;
            }
            z = z2;
            str = str2;
            windowViewCommon = windowViewCommon2;
            windowViewCommon.delayNotifyAvoidAreaChanged = z;
        } else {
            z = false;
            str = TAG;
            windowViewCommon = windowViewCommon2;
        }
        if (windowViewCommon.delayNotifyForeground) {
            ALog.i(str, "delay notify foreground");
            windowViewCommon.nativeForeground(windowViewCommon.nativeWindowPtr);
            windowViewCommon.delayNotifyForeground = z;
        }
    }

    private void setWebTouchEvent(MotionEvent motionEvent) {
        Map<Long, AceWebBase> objectMap;
        if (this.aceWebPluginBase == null || (objectMap = AceWebPluginBase.getObjectMap()) == null) {
            return;
        }
        Iterator<Map.Entry<Long, AceWebBase>> it = objectMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setTouchEvent(motionEvent);
        }
    }

    private void setPlatformViewTouchEvent(MotionEvent motionEvent) {
        Map<Long, AcePlatformViewBase> objectMap;
        AcePlatformViewPluginBase acePlatformViewPluginBase = this.acePlatformViewPluginBase;
        if (acePlatformViewPluginBase == null || (objectMap = acePlatformViewPluginBase.getObjectMap()) == null) {
            return;
        }
        Iterator<Map.Entry<Long, AcePlatformViewBase>> it = objectMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().setTouchEvent(motionEvent);
        }
    }

    private void markdownNumpadKeyStatus(int i, int i2) {
        if (i == 160) {
            if (i2 == 0) {
                this.numpadEnterPressed = true;
                return;
            } else {
                this.numpadEnterPressed = false;
                return;
            }
        }
        if (i == 66) {
            if (i2 == 0) {
                this.enterPressed = true;
            } else {
                this.enterPressed = false;
            }
        }
    }

    private boolean filterNumpadKeyCode(int i, int i2) {
        if (i != 66) {
            return false;
        }
        if (i2 == 0) {
            return this.numpadEnterPressed;
        }
        return !this.enterPressed;
    }

    private int getActionKey(int i, int i2) {
        int i3 = this.lastMouseButtonState;
        int i4 = i3 ^ i2;
        if (i == 0) {
            this.lastMouseButtonState = i2;
            this.lastMouseActionKey = i4;
        } else if (i == 1) {
            this.lastMouseButtonState = i3 ^ i4;
        } else if (i == 2) {
            if (i2 < i3) {
                this.lastMouseButtonState = i3 ^ i4;
                i = 1;
            } else if (i2 > i3) {
                this.lastMouseButtonState = i2;
                this.lastMouseActionKey = i4;
                i = 0;
            } else {
                i4 = this.lastMouseActionKey;
            }
        }
        return (i4 << 4) + i;
    }
}

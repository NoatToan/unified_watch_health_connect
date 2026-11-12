package ohos.stage.ability.adapter;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.util.Arrays;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.AcePlatformPlugin;
import ohos.ace.adapter.WindowViewAospInterface;
import ohos.ace.adapter.WindowViewBuilder;

/* JADX INFO: loaded from: classes46.dex */
public class SubWindow {
    private static final String TAG = "SubWindow";
    private View contentView;
    private Rect[] hotAreas;
    private View mainView;
    private int mainWindowX;
    private int mainWindowY;
    private String name;
    private int parentId;
    private Activity rootActivity;
    private View rootView;
    private PopupSubWindow subWindowView;
    private int windowMode;
    private int windowTag;
    private int windowType;
    private long nativeSubWindowPtr = 0;
    private int windowId = InstanceIdGenerator.getAndIncrement();
    private boolean isFocusable = true;
    private boolean isFullScreen = false;
    private WindowParam windowParam = new WindowParam();

    public static class WindowParam {
        public int backgroundColor = 0;
        public int width = 100;
        public int height = 100;
        public int x = 0;
        public int y = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnSubWindowHide(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnWindowTouchOutside(long j);

    public class PopupSubWindow extends PopupWindow {
        private static final String TAG = "PopupSubWindow";

        public PopupSubWindow() {
        }

        @Override // android.widget.PopupWindow
        public void dismiss() {
            StackTraceElement[] stackTrace = new Exception().getStackTrace();
            if (stackTrace.length < 2 || !"onTouchEvent".equals(stackTrace[1].getMethodName())) {
                super.dismiss();
                if (SubWindow.this.nativeSubWindowPtr != 0) {
                    SubWindow subWindow = SubWindow.this;
                    subWindow.nativeOnSubWindowHide(subWindow.nativeSubWindowPtr);
                }
            }
        }

        public void shutdown() {
            KeyEvent.Callback contentView = getContentView();
            if (contentView != null && (contentView instanceof WindowViewAospInterface)) {
                ((WindowViewAospInterface) contentView).destroyAosp();
            }
            super.dismiss();
        }
    }

    public SubWindow(Activity activity, String str) {
        this.name = str;
        this.rootActivity = activity;
        this.rootView = activity.getWindow().getDecorView();
    }

    public void createSubWindow(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        updateWindowParam(i, i2, i3, i4, i5, i6, i7, i8);
        createSubWindow(this.windowParam);
    }

    public void createSubWindow(WindowParam windowParam) {
        ALog.d(TAG, "createSubwindow called. name=" + this.name);
        PopupSubWindow popupSubWindow = new PopupSubWindow();
        this.subWindowView = popupSubWindow;
        popupSubWindow.setOutsideTouchable(true);
        this.subWindowView.setFocusable(this.isFocusable);
        this.subWindowView.setTouchable(true);
        WindowViewAospInterface windowViewAospInterfaceMakeWindowViewAosp = WindowViewBuilder.makeWindowViewAosp(this.rootActivity, this.windowId, true);
        AcePlatformPlugin acePlatformPlugin = new AcePlatformPlugin(this.rootActivity, this.windowId, windowViewAospInterfaceMakeWindowViewAosp.getView());
        windowViewAospInterfaceMakeWindowViewAosp.setInputConnectionClient(acePlatformPlugin);
        acePlatformPlugin.initTexturePlugin(this.windowId);
        acePlatformPlugin.initSurfacePlugin(this.rootActivity, this.windowId);
        setContentView(windowViewAospInterfaceMakeWindowViewAosp.getView());
        this.subWindowView.setTouchInterceptor(new View.OnTouchListener() { // from class: ohos.stage.ability.adapter.SubWindow.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                ALog.d(SubWindow.TAG, "subWindowView onTouch. event.getAction()=" + motionEvent.getAction() + ", x=" + x + ", y=" + y);
                if (motionEvent.getAction() != 4 && (motionEvent.getAction() != 0 || (x >= 0 && x <= SubWindow.this.subWindowView.getWidth() && y >= 0 && y <= SubWindow.this.subWindowView.getHeight()))) {
                    if (SubWindow.this.hotAreas != null) {
                        Rect[] rectArr = SubWindow.this.hotAreas;
                        int length = rectArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (rectArr[i].contains(x, y)) {
                                    break;
                                }
                                i++;
                            } else {
                                if (motionEvent.getAction() == 0 && SubWindow.this.nativeSubWindowPtr != 0) {
                                    SubWindow subWindow = SubWindow.this;
                                    subWindow.nativeOnWindowTouchOutside(subWindow.nativeSubWindowPtr);
                                }
                                return SubWindow.this.dispatchTouchEventToMainWindow(motionEvent);
                            }
                        }
                    }
                    if (motionEvent.getAction() == 0) {
                        SubWindow.this.getFocus();
                    }
                } else {
                    ALog.d(SubWindow.TAG, "touch outside");
                    if (SubWindow.this.nativeSubWindowPtr != 0) {
                        SubWindow subWindow2 = SubWindow.this;
                        subWindow2.nativeOnWindowTouchOutside(subWindow2.nativeSubWindowPtr);
                    }
                    SubWindow.this.releaseFocus();
                }
                return false;
            }
        });
        this.mainView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ohos.stage.ability.adapter.SubWindow.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int[] iArr = new int[2];
                SubWindow.this.mainView.getLocationInWindow(iArr);
                SubWindow.this.mainWindowX = iArr[0];
                SubWindow.this.mainWindowY = iArr[1];
                if (SubWindow.this.isFullScreen) {
                    SubWindow.this.windowParam.x = 0;
                    SubWindow.this.windowParam.y = 0;
                    SubWindow.this.windowParam.width = SubWindow.this.mainView.getWidth();
                    SubWindow.this.windowParam.height = SubWindow.this.mainView.getHeight();
                }
                SubWindow.this.updateWindow();
            }
        });
    }

    public boolean dispatchTouchEventToMainWindow(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), ((int) motionEvent.getX()) + this.windowParam.x, ((int) motionEvent.getY()) + this.windowParam.y, motionEvent.getMetaState());
        this.mainView.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void updateWindowParam(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.windowType = i;
        this.windowMode = i2;
        this.windowTag = i3;
        this.parentId = i4;
        this.windowParam.x = i5;
        this.windowParam.y = i6;
        if (i7 > 0) {
            this.windowParam.width = i7;
        }
        if (i8 > 0) {
            this.windowParam.height = i8;
        }
        View viewFindViewById = this.rootView.findViewById(R.id.content);
        this.mainView = viewFindViewById;
        int[] iArr = new int[2];
        viewFindViewById.getLocationInWindow(iArr);
        this.mainWindowX = iArr[0];
        this.mainWindowY = iArr[1];
    }

    public void showWindow() {
        this.subWindowView.setWidth(this.windowParam.width);
        this.subWindowView.setHeight(this.windowParam.height);
        this.subWindowView.setElevation(0.0f);
        this.subWindowView.setContentView(this.contentView);
        int i = this.windowParam.x + this.mainWindowX;
        int i2 = this.windowParam.y + this.mainWindowY;
        ALog.d(TAG, "showWindow called. x=" + this.windowParam.x + ", y=" + this.windowParam.y + ", screenX=" + i + ", screenY=" + i2 + ", width=" + this.windowParam.width + ", height=" + this.windowParam.height);
        this.subWindowView.showAtLocation(this.rootView, 8388659, i, i2);
        getFocus();
    }

    public void updateWindow() {
        int i = this.windowParam.x + this.mainWindowX;
        int i2 = this.windowParam.y + this.mainWindowY;
        ALog.d(TAG, "updateWindow called. x=" + this.windowParam.x + ", y=" + this.windowParam.y + ", screenX=" + i + ", screenY=" + i2 + ", width=" + this.windowParam.width + ", height=" + this.windowParam.height);
        this.subWindowView.update(i, i2, this.windowParam.width, this.windowParam.height, true);
    }

    public void showWindow(View view) {
        this.subWindowView.showAsDropDown(view);
    }

    public void showWindow(View view, int i, int i2) {
        this.subWindowView.showAsDropDown(view, i, i2);
    }

    public void resize(int i, int i2) {
        if (this.isFullScreen) {
            return;
        }
        this.windowParam.width = i;
        this.windowParam.height = i2;
        updateWindow();
    }

    public void moveWindowTo(int i, int i2) {
        if (this.isFullScreen) {
            return;
        }
        this.windowParam.x = i;
        this.windowParam.y = i2;
        updateWindow();
    }

    public void destroyWindow() {
        this.subWindowView.shutdown();
    }

    public void setFocusable(boolean z) {
        this.subWindowView.setFocusable(z);
        this.isFocusable = z;
    }

    public void setTouchable(boolean z) {
        this.subWindowView.setTouchable(z);
    }

    public boolean requestFocus() {
        if (!this.subWindowView.isShowing()) {
            ALog.e(TAG, "not showing.");
            return false;
        }
        if (!this.isFocusable) {
            ALog.e(TAG, "not focusable.");
            return false;
        }
        getFocus();
        return true;
    }

    public void getFocus() {
        ALog.d(TAG, "getFocus(), isFocusable=" + this.isFocusable);
        if (this.isFocusable) {
            this.subWindowView.setFocusable(true);
            this.subWindowView.update();
        }
    }

    public void releaseFocus() {
        ALog.d(TAG, "releaseFocus(), isFocusable=" + this.isFocusable);
        if (this.isFocusable) {
            this.subWindowView.setFocusable(false);
            this.subWindowView.update();
        }
    }

    public void setTouchHotArea(Rect[] rectArr) {
        ALog.d(TAG, "setTouchHotArea(), rectArray:");
        for (Rect rect : rectArr) {
            ALog.d(TAG, "left=" + rect.left + ", top=" + rect.top + ", right=" + rect.right + ", bottom=" + rect.bottom);
        }
        this.hotAreas = (Rect[]) Arrays.copyOf(rectArr, rectArr.length);
    }

    public boolean setFullScreen(boolean z) {
        if (z) {
            this.windowParam.x = 0;
            this.windowParam.y = 0;
            this.windowParam.width = this.mainView.getWidth();
            this.windowParam.height = this.mainView.getHeight();
            this.isFullScreen = true;
        } else {
            this.isFullScreen = false;
        }
        updateWindow();
        return true;
    }

    public void setOnTop(boolean z) {
        if (z) {
            this.subWindowView.setWindowLayoutType(1002);
        } else {
            this.subWindowView.setWindowLayoutType(1000);
        }
    }

    public int getWindowTag() {
        return this.windowTag;
    }

    public void setWindowTag(int i) {
        this.windowTag = i;
    }

    public PopupSubWindow getSubWindowView() {
        return this.subWindowView;
    }

    public void setSubWindowView(PopupSubWindow popupSubWindow) {
        this.subWindowView = popupSubWindow;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getWindowId() {
        return this.windowId;
    }

    public void setWindowId(int i) {
        this.windowId = i;
    }

    public int getParentId() {
        return this.parentId;
    }

    public void setParentId(int i) {
        this.parentId = i;
    }

    public int getWindowMode() {
        return this.windowMode;
    }

    public void setWindowMode(int i) {
        this.windowMode = i;
    }

    public int getWindowType() {
        return this.windowType;
    }

    public void setWindowType(int i) {
        this.windowType = i;
    }

    public View getContentView() {
        return this.contentView;
    }

    public void setContentView(View view) {
        this.contentView = view;
    }

    public WindowParam getWindowParam() {
        return this.windowParam;
    }

    public void setWindowParam(WindowParam windowParam) {
        this.windowParam = windowParam;
    }

    public Activity getRootActivity() {
        return this.rootActivity;
    }

    public void setRootActivity(Activity activity) {
        this.rootActivity = activity;
    }

    public View getRootView() {
        return this.rootView;
    }

    public void setRootView(View view) {
        this.rootView = view;
    }

    public void registerSubWindow(long j) {
        this.nativeSubWindowPtr = j;
    }

    public void unregisterSubWindow() {
        this.nativeSubWindowPtr = 0L;
    }
}

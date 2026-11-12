package ohos.ace.adapter;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.WindowInsetsCompat;
import ohos.ace.adapter.capability.platformview.AcePlatformViewPluginBase;
import ohos.ace.adapter.capability.web.AceWebPluginBase;

/* JADX INFO: loaded from: classes20.dex */
public class WindowViewSurface extends SurfaceView implements SurfaceHolder.Callback, WindowViewInterface {
    private static final String TAG = "WindowViewSurface";
    private boolean isFocused;
    private WindowViewCommon windowViewCommon;

    public View getView() {
        return this;
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void setInstanceId(int i) {
    }

    public WindowViewSurface(Context context) {
        super(context);
        this.isFocused = true;
        initView();
        this.windowViewCommon = getWindowViewCommon();
    }

    private void initView() {
        ALog.i(TAG, "WindowView created");
        setFocusableInTouchMode(true);
        getHolder().addCallback(this);
        setZOrderOnTop(true);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void registerWindow(long j) {
        this.windowViewCommon.registerWindow(j);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void unRegisterWindow() {
        this.windowViewCommon.unRegisterWindow();
    }

    private WindowViewCommon getWindowViewCommon() {
        return new WindowViewCommon(this);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void setWebPlugin(AceWebPluginBase aceWebPluginBase) {
        this.windowViewCommon.setWebPlugin(aceWebPluginBase);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void setPlatformViewPlugin(AcePlatformViewPluginBase acePlatformViewPluginBase) {
        this.windowViewCommon.setPlatformViewPlugin(acePlatformViewPluginBase);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void setInputConnectionClient(InputConnectionClient inputConnectionClient) {
        this.windowViewCommon.setInputConnectionClient(inputConnectionClient);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void keyboardHeightChanged(int i) {
        this.windowViewCommon.keyboardHeightChanged(i);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void onInsetsAreaChanged(WindowInsetsCompat windowInsetsCompat) {
        this.windowViewCommon.onInsetsAreaChanged(windowInsetsCompat);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        setFocusable(true);
        if (this.isFocused) {
            requestFocus();
        }
        surfaceHolder.setFormat(-3);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null) {
            this.windowViewCommon.surfaceCreated(surface);
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.windowViewCommon.surfaceSizeChanged(i2, i3, getResources().getDisplayMetrics().density);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.isFocused = hasFocus();
        this.windowViewCommon.surfaceDestroyed();
    }

    @Override // android.view.View, ohos.ace.adapter.WindowViewInterface
    public void onWindowFocusChanged(boolean z) {
        this.windowViewCommon.onWindowFocusChanged(z);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public InputConnection superOnCreateInputConnection(EditorInfo editorInfo) {
        return super.onCreateInputConnection(editorInfo);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.windowViewCommon.onCreateInputConnection(editorInfo);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void setHide(boolean z) {
        if (Build.VERSION.SDK_INT < 30) {
            setZOrderMediaOverlay(!z);
        } else {
            setZOrderOnTop(!z);
        }
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void foreground() {
        this.windowViewCommon.foreground();
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void background() {
        this.windowViewCommon.background();
    }

    public void destroy() {
        this.windowViewCommon.destroy();
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public boolean backPressed() {
        return this.windowViewCommon.backPressed();
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public boolean onHoverEventAosp(MotionEvent motionEvent) {
        return this.windowViewCommon.onHoverEventAosp(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return this.windowViewCommon.onHoverEvent(motionEvent);
    }

    public boolean superOnHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public boolean superOnTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.windowViewCommon.onTouchEvent(motionEvent);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public boolean superOnKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.windowViewCommon.onKeyDown(i, keyEvent);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public boolean superOnKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.windowViewCommon.onKeyUp(i, keyEvent);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public void setWindowOrientation(boolean z) {
        this.windowViewCommon.setWindowOrientation(z);
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public boolean getWindowOrientation() {
        return this.windowViewCommon.getWindowOrientation();
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return this.windowViewCommon.onKeyPreIme(i, keyEvent, getContext());
    }

    @Override // ohos.ace.adapter.WindowViewInterface
    public boolean superOnKeyPreIme(int i, KeyEvent keyEvent) {
        return super.onKeyPreIme(i, keyEvent);
    }
}

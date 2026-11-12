package ohos.ace.adapter;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.WindowInsetsCompat;
import ohos.ace.adapter.capability.platformview.AcePlatformViewPluginBase;
import ohos.ace.adapter.capability.web.AceWebPluginBase;

/* JADX INFO: loaded from: classes20.dex */
public interface WindowViewInterface {
    boolean backPressed();

    void background();

    void destroy();

    void foreground();

    View getView();

    boolean getWindowOrientation();

    void keyboardHeightChanged(int i);

    boolean onHoverEventAosp(MotionEvent motionEvent);

    void onInsetsAreaChanged(WindowInsetsCompat windowInsetsCompat);

    void onWindowFocusChanged(boolean z);

    void registerWindow(long j);

    void setHide(boolean z);

    void setInputConnectionClient(InputConnectionClient inputConnectionClient);

    void setInstanceId(int i);

    void setPlatformViewPlugin(AcePlatformViewPluginBase acePlatformViewPluginBase);

    void setWebPlugin(AceWebPluginBase aceWebPluginBase);

    void setWindowOrientation(boolean z);

    InputConnection superOnCreateInputConnection(EditorInfo editorInfo);

    boolean superOnHoverEvent(MotionEvent motionEvent);

    boolean superOnKeyDown(int i, KeyEvent keyEvent);

    boolean superOnKeyPreIme(int i, KeyEvent keyEvent);

    boolean superOnKeyUp(int i, KeyEvent keyEvent);

    boolean superOnTouchEvent(MotionEvent motionEvent);

    void unRegisterWindow();
}

package ohos.ace.adapter;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes20.dex */
public interface InputConnectionClient {
    boolean isStopBackPress();

    InputConnection onCreateInputConnection(View view, EditorInfo editorInfo);
}

package com.huami.midong.webview.nativejsapi;

import android.util.SparseArray;
import com.huami.midong.webview.widget.WebToolBar;

/* JADX INFO: loaded from: classes11.dex */
public interface IJsBridgeTitleCallback {
    void onBackClick();

    void onCancelAuth(String str);

    void onExit();

    void onProgressChange(int i);

    void onRefresh();

    void onResize();

    void onShare(Object obj);

    void setMenu(SparseArray<WebToolBar.MenuData> sparseArray);

    void setTitleBarBackgroundColor(int i);

    void setTitleFgColor(int i);

    void setTitleText(String str);

    void setTitleVisibility(boolean z);
}

package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;

/* JADX INFO: loaded from: classes10.dex */
public interface iqc {
    void finishForResult(Intent intent);

    void finishFromWeb();

    void hideNoNetView();

    boolean isInValid();

    void loadUrl(String str);

    void onProgressChanged(int i);

    void onVideoScreenModeChanged(boolean z, View view);

    void openCamera(ValueCallback<Uri[]> valueCallback);

    void openFileChooser(ValueCallback<Uri[]> valueCallback);

    void popHistory();

    void setWebTitle(String str);

    void showNoNetView();

    void showServerErrorView();
}

package com.huawei.health.knit.data;

import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
public interface IKnitLifeCycle {
    void onActivityResult(int i, int i2, Intent intent);

    void onConfigurationChanged();

    void onCreate();

    void onDestroy();

    void onMultiWindowModeChanged();

    void onPause();

    void onResume();

    void onStop();

    void setUserVisibleHint(boolean z);
}

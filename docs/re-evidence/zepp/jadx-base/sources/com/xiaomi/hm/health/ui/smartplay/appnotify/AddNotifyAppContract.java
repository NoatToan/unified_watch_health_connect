package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.widget.BaseAdapter;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes22.dex */
class AddNotifyAppContract {

    public interface View {
        void setPresenter(a aVar);

        void showAppList(BaseAdapter baseAdapter);

        void showToast(String str);

        void startLoading();

        void stopLoading();
    }

    public interface a {
        void initAppInfo();

        void onChecked(int i, CheckBox checkBox);

        void start();
    }
}

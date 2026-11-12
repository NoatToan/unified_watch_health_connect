package com.huawei.ui.homewear21.home.datasync;

import defpackage.tom;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface DataSyncSwitchContract {

    public interface Presenter extends BasePresenter {
        void onDestroy();

        void startQueryData(String str);
    }

    public interface View extends BaseView<Presenter> {
        void refreshList(List<tom> list);
    }
}

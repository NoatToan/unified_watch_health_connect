package com.zhouyou.recyclerview.refresh;

import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public interface IMoreFooter {
    public static final int STATE_COMPLETE = 1;
    public static final int STATE_LOADING = 0;
    public static final int STATE_NOMORE = 2;

    View getFooterView();

    boolean isLoadingMore();

    void setLoadingDoneHint(String str);

    void setLoadingHint(String str);

    void setNoMoreHint(String str);

    void setProgressStyle(int i);

    void setState(int i);
}

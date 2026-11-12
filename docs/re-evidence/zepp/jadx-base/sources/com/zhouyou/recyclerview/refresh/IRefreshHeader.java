package com.zhouyou.recyclerview.refresh;

import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public interface IRefreshHeader {
    public static final int STATE_DONE = 3;
    public static final int STATE_NORMAL = 0;
    public static final int STATE_REFRESHING = 2;
    public static final int STATE_RELEASE_TO_REFRESH = 1;

    View getHeaderView();

    int getState();

    int getVisibleHeight();

    boolean isRefreshHreader();

    void onMove(float f);

    void refreshComplete();

    boolean releaseAction();

    void setArrowImageView(int i);

    void setProgressStyle(int i);

    void setState(int i);
}

package com.scwang.smartrefresh.layout.api;

/* JADX INFO: loaded from: classes18.dex */
public interface RefreshFooter extends RefreshInternal {
    void onPullReleasing(float f, int i, int i2, int i3);

    void onPullingUp(float f, int i, int i2, int i3);

    boolean setLoadmoreFinished(boolean z);
}

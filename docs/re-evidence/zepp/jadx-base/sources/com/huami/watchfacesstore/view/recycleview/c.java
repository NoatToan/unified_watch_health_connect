package com.huami.watchfacesstore.view.recycleview;

import androidx.recyclerview.widget.RecyclerView;
import com.huami.watchfacesstore.view.recycleview.animation.BaseAnimation;

/* JADX INFO: loaded from: classes17.dex */
interface c {
    void addLoadAnimation(RecyclerView.ViewHolder holder);

    void cancelLoadAnimation();

    void enableLoadAnimation();

    void enableLoadAnimation(long duration, BaseAnimation animation);

    void setOnlyOnce(boolean onlyOnce);
}

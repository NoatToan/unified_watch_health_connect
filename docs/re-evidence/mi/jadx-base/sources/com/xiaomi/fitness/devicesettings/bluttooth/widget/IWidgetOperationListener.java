package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/IWidgetOperationListener;", "", "", "idx", "", "onWidgetRemove", "(I)V", "Landroidx/recyclerview/widget/RecyclerView$d0;", "viewHolder", "doDrag", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface IWidgetOperationListener {
    void doDrag(@NotNull RecyclerView.d0 viewHolder);

    void onWidgetRemove(int idx);
}

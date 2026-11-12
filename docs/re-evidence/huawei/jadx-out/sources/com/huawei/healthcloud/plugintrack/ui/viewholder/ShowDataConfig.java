package com.huawei.healthcloud.plugintrack.ui.viewholder;

import android.util.SparseArray;
import com.huawei.healthcloud.plugintrack.ui.adapter.TrackGridViewAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface ShowDataConfig {
    SparseArray<TrackMainFragmentShowType> getConfigFromLocal(int i, int i2);

    SparseArray<TrackMainFragmentShowType> getDefaultConfig(int i);

    List<TrackMainFragmentShowType> getPriorityConfig(int i, boolean z);

    List<TrackGridViewAdapter.b> getValueHolderList(int i, int i2, boolean z, boolean z2);

    void saveConfigToLocal(SparseArray<TrackMainFragmentShowType> sparseArray, int i, int i2);
}

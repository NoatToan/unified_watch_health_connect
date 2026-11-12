package com.huawei.maps.offlinedata.health.init;

import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface OnDownloadByWearListener {
    void onResult(List<MapOfflineDataItemEntity> list);
}

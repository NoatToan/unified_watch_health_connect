package com.huawei.maps.offlinedata.service.cloud.dto;

import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.WorldMapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.network.d;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class OfflineMapResponseDto extends d {
    private String backupUrl;
    private WorldMapOfflineDataItemEntity dataItem;
    private List<MapOfflineDataItemEntity> dataItemList;
    private List<MapOfflineDataItemEntity> regions;
    private String url;

    public String getBackupUrl() {
        return this.backupUrl;
    }

    public WorldMapOfflineDataItemEntity getDataItem() {
        return this.dataItem;
    }

    public List<MapOfflineDataItemEntity> getDataItemList() {
        return this.dataItemList;
    }

    public List<MapOfflineDataItemEntity> getRegions() {
        return this.regions;
    }

    public String getUrl() {
        return this.url;
    }

    public void setBackupUrl(String str) {
        this.backupUrl = str;
    }

    public void setDataItem(WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity) {
        this.dataItem = worldMapOfflineDataItemEntity;
    }

    public void setDataItemList(List<MapOfflineDataItemEntity> list) {
        this.dataItemList = list;
    }

    public void setRegions(List<MapOfflineDataItemEntity> list) {
        this.regions = list;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}

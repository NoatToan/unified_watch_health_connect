package com.huawei.maps.offlinedata.handler.dto.persist;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class OfflineDataTaskEntity {
    private String cityId;
    private String cityName;
    private String countryId;
    private String countryName;
    private String dataType;
    private Integer downloadProgress;
    private String id;
    private String lastModifyTime;
    private String political;
    private String regionId;
    private String regionName;
    private String taskId;
    private Integer transmitProgress;
    private String version;
    private String taskState = "";
    private String itemState = "";
    private Integer downloadType = 0;
    private boolean manualPause = false;

    public static final class Builder {
        private String cityId;
        private String countryId;
        private String dataType;
        private String id;
        private String political;
        private String regionId;
        private String version;

        private Builder() {
        }

        public static Builder create() {
            return new Builder();
        }

        public OfflineDataTaskEntity build() {
            OfflineDataTaskEntity offlineDataTaskEntity = new OfflineDataTaskEntity();
            offlineDataTaskEntity.setId(this.id);
            offlineDataTaskEntity.setDataType(this.dataType);
            offlineDataTaskEntity.setCountryId(this.countryId);
            offlineDataTaskEntity.setRegionId(this.regionId);
            offlineDataTaskEntity.setCityId(this.cityId);
            offlineDataTaskEntity.setPolitical(this.political);
            offlineDataTaskEntity.setVersion(this.version);
            return offlineDataTaskEntity;
        }

        public Builder fromMapInfo(MapOfflineDataItemEntity mapOfflineDataItemEntity) {
            this.id = String.valueOf(mapOfflineDataItemEntity.getId());
            this.dataType = mapOfflineDataItemEntity.getDataType();
            this.countryId = mapOfflineDataItemEntity.getCountryId();
            this.regionId = mapOfflineDataItemEntity.getRegionId();
            this.cityId = mapOfflineDataItemEntity.getCityId();
            this.political = mapOfflineDataItemEntity.getPolitical();
            this.version = mapOfflineDataItemEntity.getVersion();
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OfflineDataTaskEntity)) {
            return false;
        }
        OfflineDataTaskEntity offlineDataTaskEntity = (OfflineDataTaskEntity) obj;
        return Objects.equals(this.cityId, offlineDataTaskEntity.getCityId()) && Objects.equals(this.regionId, offlineDataTaskEntity.getRegionId()) && Objects.equals(this.countryId, offlineDataTaskEntity.getCountryId()) && Objects.equals(this.dataType, offlineDataTaskEntity.getDataType());
    }

    public String getCityId() {
        return this.cityId;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getCountryId() {
        return this.countryId;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getDataType() {
        return this.dataType;
    }

    public Integer getDownloadProgress() {
        return this.downloadProgress;
    }

    public Integer getDownloadType() {
        return this.downloadType;
    }

    public String getId() {
        return this.id;
    }

    public String getIndexId() {
        if (isGlobal()) {
            return "global";
        }
        if (isSki()) {
            return "ski";
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.countryId)) {
            arrayList.add(this.countryId);
        }
        if (!TextUtils.isEmpty(this.regionId)) {
            arrayList.add(this.regionId);
        }
        if (!TextUtils.isEmpty(this.cityId)) {
            arrayList.add(this.cityId);
        }
        return TextUtils.join("_", arrayList);
    }

    public String getItemState() {
        return this.itemState;
    }

    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    public int getMapType() {
        if (isGlobal()) {
            return 2;
        }
        if (TextUtils.equals("watch_map", this.dataType)) {
            return 0;
        }
        if (TextUtils.equals("watch_map_contour", this.dataType)) {
            return 1;
        }
        return TextUtils.equals("watch_map_ski", this.dataType) ? 3 : 0;
    }

    public String getPolitical() {
        return this.political;
    }

    public String getPrintId() {
        if (isGlobal()) {
            return "global";
        }
        if (isSki()) {
            return "ski";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.cityId);
        arrayList.add(this.dataType);
        return TextUtils.join("_", arrayList);
    }

    public String getPrintState() {
        if (isGlobal()) {
            return "global";
        }
        if (isSki()) {
            return "ski";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.cityId);
        arrayList.add(this.dataType);
        arrayList.add(this.taskId);
        arrayList.add(this.itemState);
        arrayList.add(this.taskState);
        return TextUtils.join("_", arrayList);
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getTaskState() {
        return this.taskState;
    }

    public Integer getTransmitProgress() {
        return this.transmitProgress;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(getCountryId(), getRegionId(), getCityId(), getDataType());
    }

    public boolean isGlobal() {
        return TextUtils.isEmpty(this.countryId) && TextUtils.isEmpty(this.regionId) && TextUtils.isEmpty(this.cityId) && !"watch_map_ski".equals(this.dataType);
    }

    public boolean isManualPause() {
        return this.manualPause;
    }

    public boolean isSki() {
        return "watch_map_ski".equals(this.dataType);
    }

    public void setCityId(String str) {
        this.cityId = str;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setCountryId(String str) {
        this.countryId = str;
    }

    public void setCountryName(String str) {
        this.countryName = str;
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public void setDownloadProgress(Integer num) {
        this.downloadProgress = num;
    }

    public void setDownloadType(Integer num) {
        this.downloadType = num;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setItemState(String str) {
        this.itemState = str;
    }

    public void setLastModifyTime(String str) {
        this.lastModifyTime = str;
    }

    public void setManualPause(boolean z) {
        this.manualPause = z;
    }

    public void setPolitical(String str) {
        this.political = str;
    }

    public void setRegionId(String str) {
        this.regionId = str;
    }

    public void setRegionName(String str) {
        this.regionName = str;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setTaskState(String str) {
        this.taskState = str;
    }

    public void setTransmitProgress(Integer num) {
        this.transmitProgress = num;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}

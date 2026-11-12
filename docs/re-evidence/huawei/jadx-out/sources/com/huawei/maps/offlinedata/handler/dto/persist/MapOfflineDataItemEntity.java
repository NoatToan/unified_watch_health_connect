package com.huawei.maps.offlinedata.handler.dto.persist;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public class MapOfflineDataItemEntity {
    private String cityId;
    private String cityName;
    private String countryCode;
    private String countryId;
    private String countryName;
    private String dataType;
    private String fileCheck;
    private String fileId;
    private long id;
    private String lastModifiedTime;
    private String lat;
    private String lon;
    private String maxLat;
    private String maxLon;
    private String minLat;
    private String minLon;
    private String originalSize;
    private String packageSize;
    private String political;
    private String regionId;
    private String regionName;
    private String version;

    public MapOfflineDataItemEntity() {
    }

    public String getCityId() {
        return this.cityId;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getCountryCode() {
        return this.countryCode;
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

    public String getFileCheck() {
        return this.fileCheck;
    }

    public String getFileId() {
        return this.fileId;
    }

    public long getId() {
        return this.id;
    }

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public String getLat() {
        return this.lat;
    }

    public String getLon() {
        return this.lon;
    }

    public String getMaxLat() {
        return this.maxLat;
    }

    public String getMaxLon() {
        return this.maxLon;
    }

    public String getMinLat() {
        return this.minLat;
    }

    public String getMinLon() {
        return this.minLon;
    }

    public String getOriginalSize() {
        return this.originalSize;
    }

    public String getPackageSize() {
        return this.packageSize;
    }

    public String getPolitical() {
        return this.political;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isGlobal() {
        return TextUtils.isEmpty(this.countryId) && TextUtils.isEmpty(this.regionId) && TextUtils.isEmpty(this.cityId) && !"watch_map_ski".equals(this.dataType);
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

    public void setCountryCode(String str) {
        this.countryCode = str;
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

    public void setFileCheck(String str) {
        this.fileCheck = str;
    }

    public void setFileId(String str) {
        this.fileId = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setLastModifiedTime(String str) {
        this.lastModifiedTime = str;
    }

    public void setLat(String str) {
        this.lat = str;
    }

    public void setLon(String str) {
        this.lon = str;
    }

    public void setMaxLat(String str) {
        this.maxLat = str;
    }

    public void setMaxLon(String str) {
        this.maxLon = str;
    }

    public void setMinLat(String str) {
        this.minLat = str;
    }

    public void setMinLon(String str) {
        this.minLon = str;
    }

    public void setOriginalSize(String str) {
        this.originalSize = str;
    }

    public void setPackageSize(String str) {
        this.packageSize = str;
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

    public void setVersion(String str) {
        this.version = str;
    }

    public MapOfflineDataItemEntity(WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity) {
        this.id = worldMapOfflineDataItemEntity.getId();
        this.countryId = worldMapOfflineDataItemEntity.getCountryId();
        this.countryName = worldMapOfflineDataItemEntity.getCountryName();
        this.regionId = worldMapOfflineDataItemEntity.getRegionId();
        this.regionName = worldMapOfflineDataItemEntity.getRegionName();
        this.cityId = worldMapOfflineDataItemEntity.getCityId();
        this.cityName = worldMapOfflineDataItemEntity.getCityName();
        this.fileCheck = worldMapOfflineDataItemEntity.getFileCheck();
        this.originalSize = worldMapOfflineDataItemEntity.getOriginalSize();
        this.packageSize = worldMapOfflineDataItemEntity.getPackageSize();
        this.version = worldMapOfflineDataItemEntity.getVersion();
        this.political = worldMapOfflineDataItemEntity.getPolitical();
        this.fileId = worldMapOfflineDataItemEntity.getFileId();
        this.lastModifiedTime = worldMapOfflineDataItemEntity.getLastModifiedTime();
    }
}

package com.xiaomi.fitness.userinfo.collect;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/userinfo/collect/UserInfoReportWrapper;", "", "<init>", "()V", "gpsData", "Lcom/xiaomi/fitness/userinfo/collect/ReportItemData;", "getGpsData", "()Lcom/xiaomi/fitness/userinfo/collect/ReportItemData;", "setGpsData", "(Lcom/xiaomi/fitness/userinfo/collect/ReportItemData;)V", "phoneInfoMap", "", "", "getPhoneInfoMap", "()Ljava/util/Map;", "setPhoneInfoMap", "(Ljava/util/Map;)V", "emailInfoMap", "getEmailInfoMap", "setEmailInfoMap", "deviceModelInfoMap", "getDeviceModelInfoMap", "setDeviceModelInfoMap", "osVerInfoMap", "getOsVerInfoMap", "setOsVerInfoMap", "deviceSettingInfoMap", "getDeviceSettingInfoMap", "setDeviceSettingInfoMap", "deviceIdInfoMap", "getDeviceIdInfoMap", "setDeviceIdInfoMap", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserInfoReportWrapper {

    @Nullable
    private Map<String, ReportItemData> deviceIdInfoMap;

    @Nullable
    private Map<String, ReportItemData> deviceModelInfoMap;

    @Nullable
    private Map<String, ReportItemData> deviceSettingInfoMap;

    @Nullable
    private Map<String, ReportItemData> emailInfoMap;

    @Nullable
    private ReportItemData gpsData;

    @Nullable
    private Map<String, ReportItemData> osVerInfoMap;

    @Nullable
    private Map<String, ReportItemData> phoneInfoMap;

    @Nullable
    public final Map<String, ReportItemData> getDeviceIdInfoMap() {
        return this.deviceIdInfoMap;
    }

    @Nullable
    public final Map<String, ReportItemData> getDeviceModelInfoMap() {
        return this.deviceModelInfoMap;
    }

    @Nullable
    public final Map<String, ReportItemData> getDeviceSettingInfoMap() {
        return this.deviceSettingInfoMap;
    }

    @Nullable
    public final Map<String, ReportItemData> getEmailInfoMap() {
        return this.emailInfoMap;
    }

    @Nullable
    public final ReportItemData getGpsData() {
        return this.gpsData;
    }

    @Nullable
    public final Map<String, ReportItemData> getOsVerInfoMap() {
        return this.osVerInfoMap;
    }

    @Nullable
    public final Map<String, ReportItemData> getPhoneInfoMap() {
        return this.phoneInfoMap;
    }

    public final void setDeviceIdInfoMap(@Nullable Map<String, ReportItemData> map) {
        this.deviceIdInfoMap = map;
    }

    public final void setDeviceModelInfoMap(@Nullable Map<String, ReportItemData> map) {
        this.deviceModelInfoMap = map;
    }

    public final void setDeviceSettingInfoMap(@Nullable Map<String, ReportItemData> map) {
        this.deviceSettingInfoMap = map;
    }

    public final void setEmailInfoMap(@Nullable Map<String, ReportItemData> map) {
        this.emailInfoMap = map;
    }

    public final void setGpsData(@Nullable ReportItemData reportItemData) {
        this.gpsData = reportItemData;
    }

    public final void setOsVerInfoMap(@Nullable Map<String, ReportItemData> map) {
        this.osVerInfoMap = map;
    }

    public final void setPhoneInfoMap(@Nullable Map<String, ReportItemData> map) {
        this.phoneInfoMap = map;
    }
}

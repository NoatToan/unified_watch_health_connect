package com.xiaomi.hm.health.databases.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class Device implements Serializable {
    private static final long serialVersionUID = 1;
    private Long A;
    private String B;
    private String C;
    private Long D;
    private Long E;
    private Long F;
    private Long G;
    private Long H;
    private Long I;
    private Long J;
    private Long K;
    private Long L;
    private Long M;
    private Long N;
    private Long O;
    private Long P;
    private Long Q;
    private String a;
    private String b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Long f;
    private Long g;
    private Long h;
    private String i;
    private Integer j;
    private Integer k;
    private String l;
    private String m;
    private String n;
    private Integer o;
    private String p;
    private Integer q;
    private Long r;
    private Long s;
    private Integer t;
    private String u;
    private Integer v;
    private Integer w;
    private Integer x;
    private String y;
    private Long z;

    public Device(String str) {
        this.a = str;
    }

    public Long getAccSyncTime() {
        return this.J;
    }

    public Long getAccSyncTimeZone() {
        return this.K;
    }

    public Integer getActiveStatus() {
        return this.t;
    }

    public String getAdditionalInfo() {
        return this.B;
    }

    public Long getAfResultSyncTime() {
        return this.D;
    }

    public Long getAfResultSyncTimeZone() {
        return this.G;
    }

    public String getAuthkey() {
        return this.i;
    }

    public Integer getBrandType() {
        Integer num = this.x;
        if (num == null) {
            return -1;
        }
        return num;
    }

    public String getDevice_address() {
        return this.b;
    }

    public Integer getDevice_bind_status() {
        return this.e;
    }

    public Long getDevice_bind_time() {
        return this.f;
    }

    public String getDevice_id() {
        return this.a;
    }

    public Integer getDevice_source() {
        return this.d;
    }

    public Long getDevice_sync_data_time() {
        return this.g;
    }

    public Long getDevice_sync_data_time_hr() {
        return this.h;
    }

    public Integer getDevice_type() {
        return this.c;
    }

    public String getDisplayName() {
        return this.u;
    }

    public Long getEcgSyncTime() {
        return this.P;
    }

    public Long getEcgSyncTimeZone() {
        return this.Q;
    }

    public String getFirmware_version() {
        return this.n;
    }

    public Long getGps_sync_time() {
        return this.r;
    }

    public Long getGps_sync_timezone() {
        return this.s;
    }

    public String getHardwareVersion() {
        return this.y;
    }

    public String getHr_firmware_version() {
        return this.m;
    }

    public String getLastBindingPlatform() {
        return this.C;
    }

    public Integer getMigrate_device() {
        return this.o;
    }

    public Long getOdiSyncTime() {
        return this.O;
    }

    public Long getOsaEventSyncTime() {
        return this.N;
    }

    public Long getOsaSpo2SyncTime() {
        return this.M;
    }

    public Long getPSpo2SyncTime() {
        return this.L;
    }

    public Long getPaiSyncTime() {
        return this.z;
    }

    public Long getPaiSyncTimeZone() {
        return this.A;
    }

    public Long getPpgSyncTime() {
        return this.F;
    }

    public Long getPpgSyncTimeZone() {
        return this.I;
    }

    public Integer getProductId() {
        return this.v;
    }

    public Integer getProductVersion() {
        return this.w;
    }

    public Long getRrIntervalSyncTime() {
        return this.E;
    }

    public Long getRrIntervalSyncTimeZone() {
        return this.H;
    }

    public String getSn() {
        return this.l;
    }

    public Integer getStatus() {
        return this.q;
    }

    public Integer getTime_zone() {
        return this.j;
    }

    public Integer getTime_zone_sync_hr() {
        return this.k;
    }

    public String getUserId() {
        return this.p;
    }

    public void setAccSyncTime(Long l) {
        this.J = l;
    }

    public void setAccSyncTimeZone(Long l) {
        this.K = l;
    }

    public void setActiveStatus(Integer num) {
        this.t = num;
    }

    public void setAdditionalInfo(String str) {
        this.B = str;
    }

    public void setAfResultSyncTime(Long l) {
        this.D = l;
    }

    public void setAfResultSyncTimeZone(Long l) {
        this.G = l;
    }

    public void setAuthkey(String str) {
        this.i = str;
    }

    public void setBrandType(Integer num) {
        this.x = num;
    }

    public void setDevice_address(String str) {
        this.b = str;
    }

    public void setDevice_bind_status(Integer num) {
        this.e = num;
    }

    public void setDevice_bind_time(Long l) {
        this.f = l;
    }

    public void setDevice_id(String str) {
        this.a = str;
    }

    public void setDevice_source(Integer num) {
        this.d = num;
    }

    public void setDevice_sync_data_time(Long l) {
        this.g = l;
    }

    public void setDevice_sync_data_time_hr(Long l) {
        this.h = l;
    }

    public void setDevice_type(Integer num) {
        this.c = num;
    }

    public void setDisplayName(String str) {
        this.u = str;
    }

    public void setEcgSyncTime(Long l) {
        this.P = l;
    }

    public void setEcgSyncTimeZone(Long l) {
        this.Q = l;
    }

    public void setFirmware_version(String str) {
        this.n = str;
    }

    public void setGps_sync_time(Long l) {
        this.r = l;
    }

    public void setGps_sync_timezone(Long l) {
        this.s = l;
    }

    public void setHardwareVersion(String str) {
        this.y = str;
    }

    public void setHr_firmware_version(String str) {
        this.m = str;
    }

    public void setLastBindingPlatform(String str) {
        this.C = str;
    }

    public void setMigrate_device(Integer num) {
        this.o = num;
    }

    public void setOdiSyncTime(Long l) {
        this.O = l;
    }

    public void setOsaEventSyncTime(Long l) {
        this.N = l;
    }

    public void setOsaSpo2SyncTime(Long l) {
        this.M = l;
    }

    public void setPSpo2SyncTime(Long l) {
        this.L = l;
    }

    public void setPaiSyncTime(Long l) {
        this.z = l;
    }

    public void setPaiSyncTimeZone(Long l) {
        this.A = l;
    }

    public void setPpgSyncTime(Long l) {
        this.F = l;
    }

    public void setPpgSyncTimeZone(Long l) {
        this.I = l;
    }

    public void setProductId(Integer num) {
        this.v = num;
    }

    public void setProductVersion(Integer num) {
        this.w = num;
    }

    public void setRrIntervalSyncTime(Long l) {
        this.E = l;
    }

    public void setRrIntervalSyncTimeZone(Long l) {
        this.H = l;
    }

    public void setSn(String str) {
        this.l = str;
    }

    public void setStatus(Integer num) {
        this.q = num;
    }

    public void setTime_zone(Integer num) {
        this.j = num;
    }

    public void setTime_zone_sync_hr(Integer num) {
        this.k = num;
    }

    public void setUserId(String str) {
        this.p = str;
    }

    public Device() {
    }

    public Device(String str, String str2, Integer num, Integer num2, Integer num3, Long l, Long l2, Long l3, String str3, Integer num4, Integer num5, String str4, String str5, String str6, Integer num6, String str7, Integer num7, Long l4, Long l5, Integer num8, String str8, Integer num9, Integer num10, Integer num11, String str9, Long l6, Long l7, String str10, String str11, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l20, Long l21) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = l;
        this.g = l2;
        this.h = l3;
        this.i = str3;
        this.j = num4;
        this.k = num5;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = num6;
        this.p = str7;
        this.q = num7;
        this.r = l4;
        this.s = l5;
        this.t = num8;
        this.u = str8;
        this.v = num9;
        this.w = num10;
        this.x = num11;
        this.y = str9;
        this.z = l6;
        this.A = l7;
        this.B = str10;
        this.C = str11;
        this.D = l8;
        this.E = l9;
        this.F = l10;
        this.G = l11;
        this.H = l12;
        this.I = l13;
        this.J = l14;
        this.K = l15;
        this.L = l16;
        this.M = l17;
        this.N = l18;
        this.O = l19;
        this.P = l20;
        this.Q = l21;
    }
}

package com.xiaomi.hm.health.databases.model;

import java.util.List;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: loaded from: classes20.dex */
public class LabAction {
    private Long a;
    private String b;
    private Integer c;
    private Integer d;
    private String e;
    private Integer f;
    private String g;
    private String h;
    private String i;
    private Integer j;
    private Integer k;
    private Long l;
    private Long m;
    private List<SensorData> n;
    private transient DaoSession o;
    private transient LabActionDao p;

    public LabAction(Long l, String str, Integer num, Integer num2, String str2, Integer num3, String str3, String str4, String str5, Integer num4, Integer num5, Long l2, Long l3) {
        this.a = l;
        this.b = str;
        this.c = num;
        this.d = num2;
        this.e = str2;
        this.f = num3;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = num4;
        this.k = num5;
        this.l = l2;
        this.m = l3;
    }

    public void __setDaoSession(DaoSession daoSession) {
        this.o = daoSession;
        this.p = daoSession != null ? daoSession.getLabActionDao() : null;
    }

    public void delete() {
        LabActionDao labActionDao = this.p;
        if (labActionDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        labActionDao.delete(this);
    }

    public String getBehaviorName() {
        return this.g;
    }

    public String getCustomizeBehaviorName() {
        return this.h;
    }

    public String getDeviceId() {
        return this.e;
    }

    public Integer getDeviceSource() {
        return this.f;
    }

    public Long getEndBehaviorTime() {
        return this.m;
    }

    public Long getLabActionId() {
        return this.a;
    }

    public Integer getProductVersion() {
        return this.c;
    }

    public Integer getProtocolVersion() {
        return this.d;
    }

    public List<SensorData> getSensorDatas() {
        if (this.n == null) {
            DaoSession daoSession = this.o;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            List<SensorData> list_queryLabAction_SensorDatas = daoSession.getSensorDataDao()._queryLabAction_SensorDatas(this.a);
            synchronized (this) {
                if (this.n == null) {
                    this.n = list_queryLabAction_SensorDatas;
                }
            }
        }
        return this.n;
    }

    public Long getStartBehaviorTime() {
        return this.l;
    }

    public Integer getTimeZone() {
        return this.k;
    }

    public Integer getUploadStatus() {
        return this.j;
    }

    public String getUserId() {
        return this.b;
    }

    public String getZipFileName() {
        return this.i;
    }

    public void refresh() {
        LabActionDao labActionDao = this.p;
        if (labActionDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        labActionDao.refresh(this);
    }

    public synchronized void resetSensorDatas() {
        this.n = null;
    }

    public void setBehaviorName(String str) {
        this.g = str;
    }

    public void setCustomizeBehaviorName(String str) {
        this.h = str;
    }

    public void setDeviceId(String str) {
        this.e = str;
    }

    public void setDeviceSource(Integer num) {
        this.f = num;
    }

    public void setEndBehaviorTime(Long l) {
        this.m = l;
    }

    public void setLabActionId(Long l) {
        this.a = l;
    }

    public void setProductVersion(Integer num) {
        this.c = num;
    }

    public void setProtocolVersion(Integer num) {
        this.d = num;
    }

    public void setStartBehaviorTime(Long l) {
        this.l = l;
    }

    public void setTimeZone(Integer num) {
        this.k = num;
    }

    public void setUploadStatus(Integer num) {
        this.j = num;
    }

    public void setUserId(String str) {
        this.b = str;
    }

    public void setZipFileName(String str) {
        this.i = str;
    }

    public void update() {
        LabActionDao labActionDao = this.p;
        if (labActionDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        labActionDao.update(this);
    }

    public LabAction() {
    }
}

package com.huami.mifit.sportlib.gpx.data;

import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class GPXBasePoint extends GPXBaseEntity {
    private static final String l = "GPXBasePoint";
    private Float a;
    private Float b;
    private Float c = null;
    private Float d = null;
    private Float e = null;
    private Date f = null;
    private String g = null;
    private String h = null;
    private String i = null;
    private Float j = null;
    private Float k = null;

    public static class XML {
        public static final String ATTR_LAT = "lat";
        public static final String ATTR_LON = "lon";
        public static final String TAG_CAD = "ns3:cad";
        public static final String TAG_DESC = "desc";
        public static final String TAG_ELE = "ele";
        public static final String TAG_HDOP = "hdop";
        public static final String TAG_NAME = "name";
        public static final String TAG_SPEED = "ns3:speed";
        public static final String TAG_TIME = "time";
        public static final String TAG_TYPE = "type";
        public static final String TAG_VDOP = "vdop";
    }

    public GPXBasePoint(float f, float f2) {
        this.a = null;
        this.b = null;
        this.a = Float.valueOf(f);
        this.b = Float.valueOf(f2);
    }

    public Float getCadence() {
        return this.k;
    }

    public String getDescription() {
        return this.h;
    }

    public Float getElevation() {
        return this.e;
    }

    public Float getHDop() {
        return this.c;
    }

    public Float getLatitude() {
        return this.a;
    }

    public Float getLongitude() {
        return this.b;
    }

    public String getName() {
        return this.g;
    }

    public Float getSpeed() {
        return this.j;
    }

    public Date getTimeStamp() {
        return this.f;
    }

    public String getType() {
        return this.i;
    }

    public Float getVDop() {
        return this.d;
    }

    public void setCadence(Float f) {
        this.k = f;
    }

    public void setDescription(String str) {
        this.h = str;
    }

    public void setElevation(float f) {
        this.e = Float.valueOf(f);
    }

    public void setHDop(Float f) {
        this.c = f;
    }

    public void setLatitude(float f) {
        this.a = Float.valueOf(f);
    }

    public void setLongitude(float f) {
        this.b = Float.valueOf(f);
    }

    public void setName(String str) {
        this.g = str;
    }

    public void setSpeed(Float f) {
        this.j = f;
    }

    public void setTimeStamp(Date date) {
        this.f = date;
    }

    public void setType(String str) {
        this.i = str;
    }

    public void setVDop(Float f) {
        this.d = f;
    }
}

package com.xiaomi.hm.health.baseutil;

import com.xiaomi.hm.health.manager.UnitManager;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes19.dex */
public class UnitUtils {
    public static final float CM_PER_INCH = 0.3937008f;
    public static final double KG_PER_JIN = 0.5d;
    public static final float KG_PER_POUND = 2.2046225f;
    public static final float KM_PER_MILE = 0.6213712f;
    public static final float METER_TO_FOOT = 3.28084f;
    public static final float METER_TO_KILOMETER = 1000.0f;
    public static final float MILE_PER_KM = 1.609344f;
    public static final int MINUTE_TO_HOUR = 60;
    public static final int PER_KILOMETER = 1000;
    public static final int SECOND_TO_HOUR = 3600;

    public static float cm2inch(int i, int i2) {
        return scaleFloat(i * 0.3937008f, i2);
    }

    public static int foot2inch(int i) {
        return i * 12;
    }

    public static float inch2m(Float f) {
        return Math.round(((double) f.floatValue()) * 0.3048d);
    }

    public static float kg2jin(float f) {
        return f * 2.0f;
    }

    public static float kg2pound(float f) {
        return scaleFloat(f * 2.2046225f, 2);
    }

    public static float km2mile(float f) {
        return Math.round(f * 0.6213712f);
    }

    public static float m2foot(float f, int i) {
        return scaleFloat(f * 3.28084f, i);
    }

    public static float m2inch(Float f) {
        return Math.round(((double) f.floatValue()) * 3.2808d);
    }

    public static float m2mile(int i) {
        return m2mile(i, 1);
    }

    public static float m2mileNew(float f, int i) {
        return (f * 0.6213712f) / 1000.0f;
    }

    public static int mile2foot(int i) {
        return i * UnitManager.ONE_MILE_FEET;
    }

    public static float scaleFloat(float f, int i) {
        return new BigDecimal(f).setScale(i, 4).floatValue();
    }

    public static float sj2kg(float f) {
        return f / 2.0f;
    }

    public static float sj2yb(float f) {
        return scaleFloat(f * 1.10231f, 2);
    }

    public static float yb2kg(float f) {
        return scaleFloat(f * 0.45359f, 2);
    }

    public static float yb2sj(float f) {
        return scaleFloat(f * 0.90718f, 2);
    }

    public static float km2mile(float f, int i) {
        return scaleFloat(f * 0.6213712f, i);
    }

    public static float m2mile(float f, int i) {
        return scaleFloat((f * 0.6213712f) / 1000.0f, i);
    }
}

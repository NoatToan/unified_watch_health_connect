package com.xiaomi.hm.health.bt.sdk.fw;

import defpackage.yd;

/* JADX INFO: loaded from: classes11.dex */
public enum FwType {
    FIRMWARE,
    FONT,
    RESOURCE_COMPRESS,
    RESOURCE_BASE,
    FIRMWARE_GPS,
    RESOURCE_EXTERNAL,
    FIRMWARE_BATCH;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13577a;

        static {
            int[] iArr = new int[yd.values().length];
            f13577a = iArr;
            try {
                iArr[yd.FIRMWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13577a[yd.RESOURCE_BASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13577a[yd.RESOURCE_COMPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13577a[yd.FONT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13577a[yd.FIRMWARE_GPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13577a[yd.RESOURCE_EXTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13577a[yd.FIRMWARE_BATCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static FwType get(yd ydVar) {
        switch (a.f13577a[ydVar.ordinal()]) {
            case 1:
                return FIRMWARE;
            case 2:
                return RESOURCE_BASE;
            case 3:
                return RESOURCE_COMPRESS;
            case 4:
                return FONT;
            case 5:
                return FIRMWARE_GPS;
            case 6:
                return RESOURCE_EXTERNAL;
            case 7:
                return FIRMWARE_BATCH;
            default:
                throw new IllegalArgumentException("type error");
        }
    }
}

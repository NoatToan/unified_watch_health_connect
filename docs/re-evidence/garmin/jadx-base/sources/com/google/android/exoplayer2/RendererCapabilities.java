package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
public interface RendererCapabilities {
    public static final int ADAPTIVE_NOT_SEAMLESS = 8;
    public static final int ADAPTIVE_NOT_SUPPORTED = 0;
    public static final int ADAPTIVE_SEAMLESS = 16;
    public static final int ADAPTIVE_SUPPORT_MASK = 24;
    public static final int DECODER_SUPPORT_FALLBACK = 0;
    public static final int DECODER_SUPPORT_PRIMARY = 128;

    @Deprecated
    public static final int FORMAT_EXCEEDS_CAPABILITIES = 3;

    @Deprecated
    public static final int FORMAT_HANDLED = 4;
    public static final int FORMAT_SUPPORT_MASK = 7;

    @Deprecated
    public static final int FORMAT_UNSUPPORTED_DRM = 2;

    @Deprecated
    public static final int FORMAT_UNSUPPORTED_SUBTYPE = 1;

    @Deprecated
    public static final int FORMAT_UNSUPPORTED_TYPE = 0;
    public static final int HARDWARE_ACCELERATION_NOT_SUPPORTED = 0;
    public static final int HARDWARE_ACCELERATION_SUPPORTED = 64;
    public static final int HARDWARE_ACCELERATION_SUPPORT_MASK = 64;
    public static final int MODE_SUPPORT_MASK = 128;
    public static final int TUNNELING_NOT_SUPPORTED = 0;
    public static final int TUNNELING_SUPPORTED = 32;
    public static final int TUNNELING_SUPPORT_MASK = 32;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdaptiveSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Capabilities {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FormatSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HardwareAccelerationSupport {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TunnelingSupport {
    }

    static int create(int i14, int i15, int i16) {
        return create(i14, i15, i16, 0, 128);
    }

    @SuppressLint({"WrongConstant"})
    static int getAdaptiveSupport(int i14) {
        return i14 & 24;
    }

    @SuppressLint({"WrongConstant"})
    static int getDecoderSupport(int i14) {
        return i14 & 128;
    }

    @SuppressLint({"WrongConstant"})
    static int getFormatSupport(int i14) {
        return i14 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int getHardwareAccelerationSupport(int i14) {
        return i14 & 64;
    }

    @SuppressLint({"WrongConstant"})
    static int getTunnelingSupport(int i14) {
        return i14 & 32;
    }

    String getName();

    int getTrackType();

    int supportsFormat(Format format);

    int supportsMixedMimeTypeAdaptation();

    static int create(int i14) {
        return create(i14, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    static int create(int i14, int i15, int i16, int i17, int i18) {
        return i14 | i15 | i16 | i17 | i18;
    }
}

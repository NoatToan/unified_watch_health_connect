package com.xiaomi.fitness.eco.detail.util;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J \u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0007J \u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/eco/detail/util/EcoNumberUtil;", "", "<init>", "()V", "DECIMAL_POINT_NUMBER_ONE", "", "DECIMAL_POINT_NUMBER_ZERO", "DECIMAL_POINT_NUMBER_TWO", "add", "", "d1", "d2", "sub", "mul", "decimalPoint", "divRoundDown", "divRoundUp", "divRoundUpBackInt", "divWithMul", "value", "divValue", "mulValue", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoNumberUtil {
    public static final int DECIMAL_POINT_NUMBER_ONE = 1;
    public static final int DECIMAL_POINT_NUMBER_TWO = 2;
    public static final int DECIMAL_POINT_NUMBER_ZERO = 0;

    @NotNull
    public static final EcoNumberUtil INSTANCE = new EcoNumberUtil();

    private EcoNumberUtil() {
    }

    @JvmStatic
    public static final double add(int d1, int d2) {
        return new BigDecimal(d1).add(new BigDecimal(d2)).setScale(1, 1).doubleValue();
    }

    @JvmStatic
    public static final double divRoundDown(int d1, int d2) {
        return new BigDecimal(d1).divide(new BigDecimal(d2), 1, 1).doubleValue();
    }

    @JvmStatic
    public static final double divRoundUp(int d1, int d2) {
        return new BigDecimal(d1).divide(new BigDecimal(d2), 1, 0).doubleValue();
    }

    @JvmStatic
    public static final int divRoundUpBackInt(int d1, int d2) {
        return new BigDecimal(d1).divide(new BigDecimal(d2), 1, 0).intValue();
    }

    @JvmStatic
    public static final double divWithMul(int value, int divValue, int mulValue) {
        return new BigDecimal(value).divide(new BigDecimal(divValue)).multiply(new BigDecimal(mulValue)).setScale(0, 0).doubleValue();
    }

    @JvmStatic
    public static final double mul(int d1, int d2, int decimalPoint) {
        return new BigDecimal(d1).multiply(new BigDecimal(d2)).setScale(decimalPoint, 1).doubleValue();
    }

    @JvmStatic
    public static final double sub(int d1, int d2) {
        return new BigDecimal(d1).subtract(new BigDecimal(d2)).setScale(1, 1).doubleValue();
    }
}

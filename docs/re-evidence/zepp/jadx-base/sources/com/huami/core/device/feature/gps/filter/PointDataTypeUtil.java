package com.huami.core.device.feature.gps.filter;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/PointDataTypeUtil;", "", "", "value", "", "encodeValue", "decodeValue", "", "a", "F", "timeMod", "b", LogUtil.D, "dateFormatMut", "c", "pointValueFormatterMut", "<init>", "()V", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
public final class PointDataTypeUtil {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final float timeMod = 1000.0f;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final double pointValueFormatterMut = 3000000.0d;
    public static final PointDataTypeUtil INSTANCE = new PointDataTypeUtil();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final double dateFormatMut = Math.pow(10.0d, 8.0d);

    private PointDataTypeUtil() {
    }

    public final double decodeValue(int value) {
        return ((double) value) / 3000000.0d;
    }

    public final int encodeValue(double value) {
        return (int) (value * 3000000.0d);
    }
}

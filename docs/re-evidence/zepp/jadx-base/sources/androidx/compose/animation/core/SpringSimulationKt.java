package androidx.compose.animation.core;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u001c\u0010\t\u001a\u00020\u00008\u0000@\u0000X\u0080D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"", "value", "velocity", "Landroidx/compose/animation/core/Motion;", StatEvent.EventParams.MOTION, "(FF)J", "", "VelocityThresholdMultiplier", LogUtil.D, "UNSET", "F", "getUNSET", "()F", "animation-core_release"}, k = 2, mv = {1, 5, 1})
public final class SpringSimulationKt {
    private static final float UNSET = Float.MAX_VALUE;
    private static final double VelocityThresholdMultiplier = 62.5d;

    public static final long Motion(float f, float f2) {
        return Motion.m86constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final float getUNSET() {
        return UNSET;
    }
}

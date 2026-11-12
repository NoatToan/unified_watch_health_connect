package androidx.media3.effect;

import android.content.Context;
import androidx.media3.common.util.TimestampConsumer;

/* JADX INFO: loaded from: classes21.dex */
public final class TimestampAdjustment implements GlEffect {
    private final TimestampMap timestampMap;

    public interface TimestampMap {
        void calculateOutputTimeUs(long j, TimestampConsumer timestampConsumer);
    }

    public TimestampAdjustment(TimestampMap timestampMap) {
        this.timestampMap = timestampMap;
    }

    @Override // androidx.media3.effect.GlEffect
    public GlShaderProgram toGlShaderProgram(Context context, boolean z) {
        return new TimestampAdjustmentShaderProgram(this.timestampMap);
    }
}

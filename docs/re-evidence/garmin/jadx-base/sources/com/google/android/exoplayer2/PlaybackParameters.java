package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes13.dex */
public final class PlaybackParameters implements Bundleable {
    private static final int FIELD_PITCH = 1;
    private static final int FIELD_SPEED = 0;
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    public static final Bundleable.Creator<PlaybackParameters> CREATOR = new v(17);

    public PlaybackParameters(float f14, float f15) {
        Assertions.checkArgument(f14 > 0.0f);
        Assertions.checkArgument(f15 > 0.0f);
        this.speed = f14;
        this.pitch = f15;
        this.scaledUsPerMs = Math.round(f14 * 1000.0f);
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ PlaybackParameters lambda$static$0(Bundle bundle) {
        return new PlaybackParameters(bundle.getFloat(keyForField(0), 1.0f), bundle.getFloat(keyForField(1), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j8) {
        return j8 * ((long) this.scaledUsPerMs);
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.pitch) + ((Float.floatToRawIntBits(this.speed) + 527) * 31);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(keyForField(0), this.speed);
        bundle.putFloat(keyForField(1), this.pitch);
        return bundle;
    }

    public String toString() {
        return Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.speed), Float.valueOf(this.pitch));
    }

    public PlaybackParameters withSpeed(float f14) {
        return new PlaybackParameters(f14, this.pitch);
    }

    public PlaybackParameters(float f14) {
        this(f14, 1.0f);
    }
}

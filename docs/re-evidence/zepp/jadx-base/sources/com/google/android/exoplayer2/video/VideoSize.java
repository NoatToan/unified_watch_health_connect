package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.video.VideoSize;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoSize implements Bundleable {
    private static final int a = 0;
    private static final int b = 0;
    private static final int c = 0;
    private static final float d = 1.0f;
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;

    @IntRange(from = 0)
    public final int height;

    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float pixelWidthHeightRatio;

    @IntRange(from = 0, to = 359)
    public final int unappliedRotationDegrees;

    @IntRange(from = 0)
    public final int width;
    public static final VideoSize UNKNOWN = new VideoSize(0, 0);
    public static final Bundleable.Creator<VideoSize> CREATOR = new Bundleable.Creator() { // from class: ab8
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return VideoSize.c(bundle);
        }
    };

    public VideoSize(@IntRange(from = 0) int width, @IntRange(from = 0) int height) {
        this(width, height, 0, 1.0f);
    }

    private static String b(int field) {
        return Integer.toString(field, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ VideoSize c(Bundle bundle) {
        return new VideoSize(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0), bundle.getFloat(b(3), 1.0f));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.width == videoSize.width && this.height == videoSize.height && this.unappliedRotationDegrees == videoSize.unappliedRotationDegrees && this.pixelWidthHeightRatio == videoSize.pixelWidthHeightRatio;
    }

    public int hashCode() {
        return ((((((217 + this.width) * 31) + this.height) * 31) + this.unappliedRotationDegrees) * 31) + Float.floatToRawIntBits(this.pixelWidthHeightRatio);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), this.width);
        bundle.putInt(b(1), this.height);
        bundle.putInt(b(2), this.unappliedRotationDegrees);
        bundle.putFloat(b(3), this.pixelWidthHeightRatio);
        return bundle;
    }

    public VideoSize(@IntRange(from = 0) int width, @IntRange(from = 0) int height, @IntRange(from = 0, to = 359) int unappliedRotationDegrees, @FloatRange(from = 0.0d, fromInclusive = false) float pixelWidthHeightRatio) {
        this.width = width;
        this.height = height;
        this.unappliedRotationDegrees = unappliedRotationDegrees;
        this.pixelWidthHeightRatio = pixelWidthHeightRatio;
    }
}

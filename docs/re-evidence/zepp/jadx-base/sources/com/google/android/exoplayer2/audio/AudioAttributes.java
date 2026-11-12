package com.google.android.exoplayer2.audio;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioAttributes implements Bundleable {
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;

    @Nullable
    private android.media.AudioAttributes a;
    public final int allowedCapturePolicy;
    public final int contentType;
    public final int flags;
    public final int usage;
    public static final AudioAttributes DEFAULT = new Builder().build();
    public static final Bundleable.Creator<AudioAttributes> CREATOR = new Bundleable.Creator() { // from class: hj
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return AudioAttributes.c(bundle);
        }
    };

    public static final class Builder {
        private int a = 0;
        private int b = 0;
        private int c = 1;
        private int d = 1;

        public AudioAttributes build() {
            return new AudioAttributes(this.a, this.b, this.c, this.d);
        }

        public Builder setAllowedCapturePolicy(int allowedCapturePolicy) {
            this.d = allowedCapturePolicy;
            return this;
        }

        public Builder setContentType(int contentType) {
            this.a = contentType;
            return this;
        }

        public Builder setFlags(int flags) {
            this.b = flags;
            return this;
        }

        public Builder setUsage(int usage) {
            this.c = usage;
            return this;
        }
    }

    private static String b(int field) {
        return Integer.toString(field, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AudioAttributes c(Bundle bundle) {
        Builder builder = new Builder();
        if (bundle.containsKey(b(0))) {
            builder.setContentType(bundle.getInt(b(0)));
        }
        if (bundle.containsKey(b(1))) {
            builder.setFlags(bundle.getInt(b(1)));
        }
        if (bundle.containsKey(b(2))) {
            builder.setUsage(bundle.getInt(b(2)));
        }
        if (bundle.containsKey(b(3))) {
            builder.setAllowedCapturePolicy(bundle.getInt(b(3)));
        }
        return builder.build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        return this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy;
    }

    @RequiresApi(21)
    public android.media.AudioAttributes getAudioAttributesV21() {
        if (this.a == null) {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(this.contentType).setFlags(this.flags).setUsage(this.usage);
            if (Util.SDK_INT >= 29) {
                usage.setAllowedCapturePolicy(this.allowedCapturePolicy);
            }
            this.a = usage.build();
        }
        return this.a;
    }

    public int hashCode() {
        return ((((((527 + this.contentType) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), this.contentType);
        bundle.putInt(b(1), this.flags);
        bundle.putInt(b(2), this.usage);
        bundle.putInt(b(3), this.allowedCapturePolicy);
        return bundle;
    }

    private AudioAttributes(int contentType, int flags, int usage, int allowedCapturePolicy) {
        this.contentType = contentType;
        this.flags = flags;
        this.usage = usage;
        this.allowedCapturePolicy = allowedCapturePolicy;
    }
}

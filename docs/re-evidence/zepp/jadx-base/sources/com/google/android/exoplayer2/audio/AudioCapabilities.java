package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioCapabilities {
    private static final int c = 8;
    private static final int d = 48000;
    private static final String g = "external_surround_sound_enabled";
    private final int[] a;
    private final int b;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(new int[]{2}, 8);
    private static final AudioCapabilities e = new AudioCapabilities(new int[]{2, 5, 6}, 8);
    private static final int[] f = {5, 6, 18, 17, 14, 7, 8};

    @RequiresApi(29)
    public static final class a {
        private a() {
        }

        @DoNotInline
        public static int[] a() {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i : AudioCapabilities.f) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    builder.add(Integer.valueOf(i));
                }
            }
            builder.add(2);
            return Ints.toArray(builder.build());
        }
    }

    public AudioCapabilities(@Nullable int[] supportedEncodings, int maxChannelCount) {
        if (supportedEncodings != null) {
            int[] iArrCopyOf = Arrays.copyOf(supportedEncodings, supportedEncodings.length);
            this.a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.a = new int[0];
        }
        this.b = maxChannelCount;
    }

    private static boolean b() {
        if (Util.SDK_INT >= 17) {
            String str = Util.MANUFACTURER;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    public static AudioCapabilities c(Context context, @Nullable Intent intent) {
        if (b() && Settings.Global.getInt(context.getContentResolver(), g, 0) == 1) {
            return e;
        }
        if (Util.SDK_INT < 29 || !Util.isTv(context)) {
            return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? DEFAULT_AUDIO_CAPABILITIES : new AudioCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return new AudioCapabilities(a.a(), 8);
    }

    @Nullable
    public static Uri d() {
        if (b()) {
            return Settings.Global.getUriFor(g);
        }
        return null;
    }

    public static AudioCapabilities getCapabilities(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) other;
        return Arrays.equals(this.a, audioCapabilities.a) && this.b == audioCapabilities.b;
    }

    public int getMaxChannelCount() {
        return this.b;
    }

    public int hashCode() {
        return this.b + (Arrays.hashCode(this.a) * 31);
    }

    public boolean supportsEncoding(int encoding) {
        return Arrays.binarySearch(this.a, encoding) >= 0;
    }

    public String toString() {
        int i = this.b;
        String string = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}

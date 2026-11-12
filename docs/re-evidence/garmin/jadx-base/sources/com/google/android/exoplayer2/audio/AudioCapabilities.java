package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class AudioCapabilities {
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final int DEFAULT_SAMPLE_RATE_HZ = 48000;
    private static final String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private final int maxChannelCount;
    private final int[] supportedEncodings;
    public static final AudioCapabilities DEFAULT_AUDIO_CAPABILITIES = new AudioCapabilities(new int[]{2}, 8);
    private static final AudioCapabilities EXTERNAL_SURROUND_SOUND_CAPABILITIES = new AudioCapabilities(new int[]{2, 5, 6}, 8);
    private static final int[] ALL_SURROUND_ENCODINGS = {5, 6, 18, 17, 14, 7, 8};

    public static final class Api29 {
        private Api29() {
        }

        public static int[] getDirectPlaybackSupportedEncodings() {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i14 : AudioCapabilities.ALL_SURROUND_ENCODINGS) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i14).setSampleRate(48000).build(), new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    builder.add(Integer.valueOf(i14));
                }
            }
            builder.add(2);
            return Ints.toArray(builder.build());
        }
    }

    public AudioCapabilities(int[] iArr, int i14) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.supportedEncodings = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.supportedEncodings = new int[0];
        }
        this.maxChannelCount = i14;
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        if (Util.SDK_INT < 17) {
            return false;
        }
        String str = Util.MANUFACTURER;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    @SuppressLint({"InlinedApi"})
    public static AudioCapabilities getCapabilities(Context context, Intent intent) {
        if (deviceMaySetExternalSurroundSoundGlobalSetting() && Settings.Global.getInt(context.getContentResolver(), EXTERNAL_SURROUND_SOUND_KEY, 0) == 1) {
            return EXTERNAL_SURROUND_SOUND_CAPABILITIES;
        }
        if (Util.SDK_INT < 29 || !(Util.isTv(context) || Util.isAutomotive(context))) {
            return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? DEFAULT_AUDIO_CAPABILITIES : new AudioCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return new AudioCapabilities(Api29.getDirectPlaybackSupportedEncodings(), 8);
    }

    public static Uri getExternalSurroundSoundGlobalSettingUri() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor(EXTERNAL_SURROUND_SOUND_KEY);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioCapabilities)) {
            return false;
        }
        AudioCapabilities audioCapabilities = (AudioCapabilities) obj;
        return Arrays.equals(this.supportedEncodings, audioCapabilities.supportedEncodings) && this.maxChannelCount == audioCapabilities.maxChannelCount;
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.supportedEncodings) * 31) + this.maxChannelCount;
    }

    public boolean supportsEncoding(int i14) {
        return Arrays.binarySearch(this.supportedEncodings, i14) >= 0;
    }

    public String toString() {
        int i14 = this.maxChannelCount;
        String string = Arrays.toString(this.supportedEncodings);
        StringBuilder sb3 = new StringBuilder(v.a(67, string));
        sb3.append("AudioCapabilities[maxChannelCount=");
        sb3.append(i14);
        sb3.append(", supportedEncodings=");
        sb3.append(string);
        sb3.append("]");
        return sb3.toString();
    }

    public static AudioCapabilities getCapabilities(Context context) {
        return getCapabilities(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }
}

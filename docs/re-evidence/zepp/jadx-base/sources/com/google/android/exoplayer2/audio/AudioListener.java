package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface AudioListener {
    void onAudioAttributesChanged(AudioAttributes audioAttributes);

    void onAudioSessionIdChanged(int audioSessionId);

    void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled);

    void onVolumeChanged(float volume);
}

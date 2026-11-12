package com.xiaomi.hm.health.training.media.audio.player;

import android.content.Context;
import android.media.MediaPlayer;
import com.xiaomi.hm.health.training.media.audio.model.AudioRes;
import com.xiaomi.hm.health.training.media.audio.model.AudioSetting;
import com.xiaomi.hm.health.training.media.audio.model.IPlayerListener;

/* JADX INFO: loaded from: classes21.dex */
public class AudioPlayerCreator {
    public static MediaPlayer play(Context context, AudioRes audioRes, IPlayerListener iPlayerListener) {
        MediaPlayer mediaPlayerCreate;
        try {
            if (audioRes.getAudioRawId() == -1) {
                mediaPlayerCreate = new MediaPlayer();
                mediaPlayerCreate.setDataSource(context, audioRes.getAudioUri());
            } else {
                mediaPlayerCreate = MediaPlayer.create(context, audioRes.getAudioRawId());
            }
            AudioSetting audioSetting = audioRes.getAudioSetting();
            mediaPlayerCreate.setAudioStreamType(audioSetting.getStreamType());
            mediaPlayerCreate.setLooping(audioSetting.isLooping());
            mediaPlayerCreate.setVolume(audioSetting.getLeftVolume(), audioSetting.getRightVolume());
            if (audioRes.getAudioRawId() == -1) {
                mediaPlayerCreate.prepare();
            }
            AudioPlayerListener audioPlayerListener = new AudioPlayerListener(iPlayerListener, audioRes);
            mediaPlayerCreate.setOnCompletionListener(audioPlayerListener);
            mediaPlayerCreate.setOnErrorListener(audioPlayerListener);
            mediaPlayerCreate.start();
            return mediaPlayerCreate;
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.huami.musiccontrol.musicview;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.musiccontrol.bean.VolumeInfo;
import com.huami.sky.lib.constant.WebConstant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0014"}, d2 = {"Lcom/huami/musiccontrol/musicview/IDeviceMusicView;", "", "Lcom/huami/musiccontrol/bean/MusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "", "showMusic", "showNoPermission", "Lcom/huami/musiccontrol/bean/VolumeInfo;", "volume", "showVolume", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "playInfo", "showPlayState", "showMusicAndState", "supportMusicControl", "Lcom/huami/musiccontrol/musicview/IDeviceMusicView$IDeviceMusicViewListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setViewListener", "IDeviceMusicViewListener", "music_control_release"}, k = 1, mv = {1, 4, 1})
public interface IDeviceMusicView {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/huami/musiccontrol/musicview/IDeviceMusicView$IDeviceMusicViewListener;", "", "", "onNextClick", "onPreClick", "onPauseClick", "onPlayClick", "onVolumeUpClick", "onVolumeDownClick", "onEnterControlView", "onExitControlView", "music_control_release"}, k = 1, mv = {1, 4, 1})
    public interface IDeviceMusicViewListener {
        void onEnterControlView();

        void onExitControlView();

        void onNextClick();

        void onPauseClick();

        void onPlayClick();

        void onPreClick();

        void onVolumeDownClick();

        void onVolumeUpClick();
    }

    void setViewListener(@NotNull IDeviceMusicViewListener listener);

    boolean showMusic(@NotNull MusicInfo music);

    boolean showMusicAndState(@NotNull MusicInfo music, @NotNull MusicPlayInfo playInfo);

    boolean showNoPermission();

    boolean showPlayState(@NotNull MusicPlayInfo playInfo);

    boolean showVolume(@NotNull VolumeInfo volume);

    boolean supportMusicControl();
}

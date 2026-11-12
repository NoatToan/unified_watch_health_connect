package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface;
import com.huawei.health.suggestion.ui.fitness.module.OnTracksChangedListener;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class LongMediaHelper extends VideoMediaHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PlayerHelper.OnPreparedListener f9335c;
    private OnTracksChangedListener h;

    public LongMediaHelper(Context context) {
        super(context);
        a();
        b(false);
    }

    public LongMediaHelper(int i) {
        super(i);
        b(false);
        if (i == 1) {
            e();
            this.f9334b = false;
        } else {
            a();
        }
    }

    private void a() {
        b();
        t();
        d();
        c();
    }

    private void b() {
        p().getPlayer().setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.LongMediaHelper.5
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                if (LongMediaHelper.this.f9335c != null) {
                    LongMediaHelper.this.f9335c.onPrepared();
                }
                LogUtil.a("Suggestion_LongMedia3Helper", "onPrepared");
            }
        });
    }

    private void t() {
        p().getPlayer().setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.LongMediaHelper.2
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(MediaPlayer mediaPlayer) {
                if (LongMediaHelper.this.f9335c != null) {
                    LongMediaHelper.this.f9335c.onSeekComplete();
                }
            }
        });
    }

    private void d() {
        p().getPlayer().setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.LongMediaHelper.3
            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                LongMediaHelper.this.e(i);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (i == 701) {
            PlayerHelper.OnPreparedListener onPreparedListener = this.f9335c;
            if (onPreparedListener != null) {
                onPreparedListener.onBufferingStart();
            }
            LogUtil.d("Suggestion_LongMedia3Helper", "MEDIA_INFO_BUFFERING_START");
            return;
        }
        if (i != 702) {
            return;
        }
        PlayerHelper.OnPreparedListener onPreparedListener2 = this.f9335c;
        if (onPreparedListener2 != null) {
            onPreparedListener2.onBufferingEnd();
        }
        LogUtil.d("Suggestion_LongMedia3Helper", "MEDIA_INFO_BUFFERING_END");
    }

    private void c() {
        p().getPlayer().setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.LongMediaHelper.1
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                if (LongMediaHelper.this.f9335c != null) {
                    LongMediaHelper.this.f9335c.onVideoError();
                }
                ReleaseLogUtil.a("Suggestion_LongMedia3Helper", "onError() media player error:", ", what=", Integer.valueOf(i), ", extra=", Integer.valueOf(i2));
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i) {
        PlayerHelper.OnPreparedListener onPreparedListener;
        if (i == 2) {
            PlayerHelper.OnPreparedListener onPreparedListener2 = this.f9335c;
            if (onPreparedListener2 != null) {
                onPreparedListener2.onBufferingStart();
            }
            LogUtil.d("Suggestion_LongMedia3Helper", "MEDIA_INFO_BUFFERING_START");
            return;
        }
        if (i == 3 && (onPreparedListener = this.f9335c) != null) {
            if (this.f9334b) {
                onPreparedListener.onBufferingEnd();
                LogUtil.a("Suggestion_LongMedia3Helper", "onBufferingEnd");
                OnTracksChangedListener onTracksChangedListener = this.h;
                if (onTracksChangedListener != null) {
                    onTracksChangedListener.onBufferingEnd();
                    return;
                }
                return;
            }
            onPreparedListener.onPrepared();
            this.f9334b = true;
            LogUtil.a("Suggestion_LongMedia3Helper", "onPrepared");
        }
    }

    private void e() {
        p().getExoPlayer().addListener(new Player.Listener() { // from class: com.huawei.health.suggestion.ui.fitness.helper.LongMediaHelper.4
            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int i) {
                LogUtil.a("Suggestion_LongMedia3Helper", "onPlaybackStateChanged", ", what=", Integer.valueOf(i));
                LongMediaHelper.this.j(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException playbackException) {
                if (LongMediaHelper.this.f9335c != null) {
                    LongMediaHelper.this.f9335c.onVideoError();
                }
                ReleaseLogUtil.a("Suggestion_LongMedia3Helper", "onError() exoPlayer error:", playbackException.getMessage(), "errorCodeName:", playbackException.getErrorCodeName());
                LogUtil.a("Suggestion_LongMedia3Helper", "onError() exoPlayer  cause:", playbackException.getCause());
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                if (i != 1 || LongMediaHelper.this.f9335c == null) {
                    return;
                }
                LongMediaHelper.this.f9335c.onSeekComplete();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onTracksChanged(Tracks tracks) {
                LogUtil.a("Suggestion_LongMedia3Helper", "onTracksChanged");
                if (LongMediaHelper.this.h != null) {
                    LongMediaHelper.this.h.onTracksChanged(tracks);
                }
            }
        });
    }

    public void a(int i) {
        p().seekTo(i);
    }

    public void e(PlayerHelper.OnPreparedListener onPreparedListener) {
        this.f9335c = onPreparedListener;
    }

    public void e(OnTracksChangedListener onTracksChangedListener) {
        this.h = onTracksChangedListener;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.helper.VideoMediaHelper, com.huawei.health.suggestion.ui.fitness.helper.MediaHelper, com.huawei.health.suggestion.ui.fitness.helper.inter.VideoInterface
    public VideoInterface videoContinue() {
        LogUtil.a("Suggestion_LongMedia3Helper", "videoContinue");
        if (p() != null) {
            p().play();
        }
        return this;
    }
}

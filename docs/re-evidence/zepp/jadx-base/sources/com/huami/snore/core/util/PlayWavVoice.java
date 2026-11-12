package com.huami.snore.core.util;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.snore.core.util.PlayWavVoice;
import com.huami.snore.core.vo.VoiceShowInfo;
import com.huami.snore.ui.adapter.WrapVoiceInfo;
import com.huami.tools.analytics.DbUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/huami/snore/core/util/PlayWavVoice;", "", "<init>", "()V", "Companion", "VoicePlayListener", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class PlayWavVoice {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static MediaPlayer a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/snore/core/util/PlayWavVoice$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/snore/ui/adapter/WrapVoiceInfo;", "info", "Lcom/huami/snore/core/util/PlayWavVoice$VoicePlayListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "playVoice", "stopPlay", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/media/MediaPlayer;", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(VoicePlayListener voicePlayListener, WrapVoiceInfo wrapVoiceInfo, MediaPlayer mediaPlayer) {
            voicePlayListener.onCompletion(wrapVoiceInfo);
        }

        public final void playVoice(@NotNull Context context, @Nullable final WrapVoiceInfo info, @NotNull final VoicePlayListener listener) {
            VoiceShowInfo voiceInfo;
            VoiceShowInfo voiceInfo2;
            String filePath = null;
            File file = new File((info == null || (voiceInfo = info.getVoiceInfo()) == null) ? null : voiceInfo.getFilePath());
            if (info != null && (voiceInfo2 = info.getVoiceInfo()) != null) {
                filePath = voiceInfo2.getFilePath();
            }
            if (!(filePath == null || filePath.length() == 0) && file.isFile() && file.exists()) {
                PlayWavVoice.a = MediaPlayer.create(context, Uri.fromFile(file));
                MediaPlayer mediaPlayer = PlayWavVoice.a;
                if (mediaPlayer == null) {
                    return;
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: b16
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                        PlayWavVoice.Companion.b(listener, info, mediaPlayer2);
                    }
                });
                mediaPlayer.start();
            }
        }

        public final void stopPlay() {
            try {
                MediaPlayer mediaPlayer = PlayWavVoice.a;
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/snore/core/util/PlayWavVoice$VoicePlayListener;", "", "Lcom/huami/snore/ui/adapter/WrapVoiceInfo;", "info", "", "onCompletion", "snore_release"}, k = 1, mv = {1, 5, 1})
    public interface VoicePlayListener {
        void onCompletion(@Nullable WrapVoiceInfo info);
    }
}

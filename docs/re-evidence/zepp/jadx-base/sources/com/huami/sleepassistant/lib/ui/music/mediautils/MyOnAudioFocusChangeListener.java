package com.huami.sleepassistant.lib.ui.music.mediautils;

import android.media.AudioManager;
import com.huami.sleepassistant.lib.ui.music.MediaPlayService;
import com.huami.sleepassistant.lib.ui.music.MusicWebCallback;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/mediautils/MyOnAudioFocusChangeListener;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "", "a", "", "focusChange", "onAudioFocusChange", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService;", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService;", "service", "", "b", "Z", "isNotFocus", "<init>", "(Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MyOnAudioFocusChangeListener implements AudioManager.OnAudioFocusChangeListener {

    @NotNull
    private static final String c = "MyOnAudioFocusChangeListener";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private MediaPlayService service;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isNotFocus;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "AUDIO_FOCUS_LOSS_TRANSIENT...  ";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "AUDIO_FOCUS_GAIN...  ";
        }
    }

    public MyOnAudioFocusChangeListener(@NotNull MediaPlayService mediaPlayService) {
        this.service = mediaPlayService;
    }

    private final void a() {
        String str;
        MusicWebCallback musicWebCallback = this.service.getMusicWebCallback();
        if (musicWebCallback == null) {
            return;
        }
        if (this.service.isPlaying()) {
            str = this.service.getPlayType() == MediaMusicPlayUtils1.PlayType.LIST_LOOP_AUDIO ? "7" : "0";
        } else {
            str = this.service.getPlayType() == MediaMusicPlayUtils1.PlayType.LIST_LOOP_AUDIO ? "8" : "1";
        }
        musicWebCallback.onResult(str);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        if (focusChange == -3 || focusChange == -2) {
            if (this.service.isPlaying() && !this.isNotFocus) {
                this.service.allPause();
                this.isNotFocus = true;
                a();
            }
            HMLog.info(c, a.a);
            return;
        }
        if (focusChange == -1) {
            this.service.abandonAudioFocus();
            if (this.service.isPlaying()) {
                this.service.allPause();
                a();
                return;
            }
            return;
        }
        if (focusChange != 1) {
            return;
        }
        if (!this.service.isPlaying() && this.isNotFocus) {
            this.service.allRestart();
            this.isNotFocus = false;
            a();
        }
        HMLog.info(c, b.a);
    }
}

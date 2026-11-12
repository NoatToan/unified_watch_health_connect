package com.huami.sky.ui.play;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import com.huami.sky.service.PlayState;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/sky/ui/play/SkyMediaSessionCallback;", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "Landroid/content/Intent;", "mediaButtonEvent", "", "onMediaButtonEvent", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyMediaSessionCallback extends MediaSessionCompat.Callback {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ KeyEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KeyEvent keyEvent) {
            super(0);
            this.a = keyEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            KeyEvent keyEvent = this.a;
            return "onMediaButtonEvent: " + (keyEvent == null ? null : Integer.valueOf(keyEvent.getKeyCode()));
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
            return "接收到媒体按键信息：KEYCODE_MEDIA_PAUSE";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "接收到媒体按键信息：KEYCODE_MEDIA_PLAY";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayState a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PlayState playState) {
            super(0);
            this.a = playState;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "接收到媒体按键信息：KEYCODE_MEDIA_NEXT, " + this.a;
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.Callback
    public boolean onMediaButtonEvent(@Nullable Intent mediaButtonEvent) {
        if (mediaButtonEvent != null) {
            KeyEvent keyEvent = (KeyEvent) mediaButtonEvent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            HMLog.info("SkyMediaSessionCallback", new a(keyEvent));
            if (keyEvent != null && keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (127 == keyCode) {
                    HMLog.info("SkyMediaSessionCallback", b.a);
                    if (SkyServiceHelperKt.getSkyService().isPlaying()) {
                        SkyServiceHelperKt.getSkyService().pause();
                    }
                } else if (126 == keyCode || 85 == keyCode) {
                    HMLog.info("SkyMediaSessionCallback", c.a);
                    SkyServiceHelperKt.getSkyService().playOrPause();
                } else if (87 == keyCode) {
                    PlayState playState = SkyServiceHelperKt.getSkyService().getPlayState();
                    HMLog.info("SkyMediaSessionCallback", new d(playState));
                    if (playState != PlayState.PLAY && playState != PlayState.PROGRESSING) {
                        SkyServiceHelperKt.getSkyService().changeLikeState(false);
                    }
                }
            }
        }
        return super.onMediaButtonEvent(mediaButtonEvent);
    }
}

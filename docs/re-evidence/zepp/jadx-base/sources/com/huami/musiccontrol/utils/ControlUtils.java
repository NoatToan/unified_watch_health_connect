package com.huami.musiccontrol.utils;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.huami.musiccontrol.MusicControllerModule;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/musiccontrol/utils/ControlUtils;", "", "", "keyCode", "", "b", "Landroid/view/KeyEvent;", "event", "a", "nextMusic", "preMusic", "pause", "play", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "music_control_release"}, k = 1, mv = {1, 4, 1})
public final class ControlUtils {

    @NotNull
    public static final ControlUtils INSTANCE = new ControlUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "ControlUtils";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "send music key dispatch event down: " + this.a + "; up: " + this.b;
        }
    }

    private ControlUtils() {
    }

    private final boolean a(KeyEvent event) {
        Context appContext = MusicControllerModule.INSTANCE.getInstance().getAppContext();
        AudioManager audioManager = (AudioManager) (appContext != null ? appContext.getSystemService("audio") : null);
        if (audioManager == null) {
            return false;
        }
        try {
            audioManager.dispatchMediaKeyEvent(event);
            return true;
        } catch (Exception e) {
            HMLog.info(TAG, new a(e));
            return false;
        }
    }

    private final boolean b(int keyCode) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        KeyEvent keyEvent = new KeyEvent(jUptimeMillis, jUptimeMillis, 0, keyCode, 0);
        boolean zA = a(keyEvent);
        boolean zA2 = a(KeyEvent.changeAction(keyEvent, 1));
        HMLog.info(TAG, new b(zA, zA2));
        return zA && zA2;
    }

    public final boolean nextMusic() {
        return b(87);
    }

    public final boolean pause() {
        return b(127);
    }

    public final boolean play() {
        return b(126);
    }

    public final boolean preMusic() {
        return b(88);
    }
}

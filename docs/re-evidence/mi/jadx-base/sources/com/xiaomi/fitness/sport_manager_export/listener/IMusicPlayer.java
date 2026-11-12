package com.xiaomi.fitness.sport_manager_export.listener;

import android.content.Context;
import android.os.Bundle;
import com.mibi.sdk.component.params.SdkContants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u001a\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H&J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0013H&J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\tH&J\b\u0010\u001b\u001a\u00020\tH&¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer;", "", "executeAsync", "", "action", "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "force", "", "callback", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicCallback;", "bindXiaomiPlayerService", "context", "Landroid/content/Context;", "Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicServiceListener;", "unBindXiaomiPlayerService", "goQQPlayer", "mode", "", "setOnPlayerListener", "Lcom/xiaomi/fitness/sport_manager_export/listener/IPlayerEventListener;", "setBPM", "bpm", "isShowMusicPlyer", "()Ljava/lang/Boolean;", "isHasSportPlaylist", "hasBindService", "Companion", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IMusicPlayer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/IMusicPlayer$Companion;", "", "<init>", "()V", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void executeAsync$default(IMusicPlayer iMusicPlayer, String str, Bundle bundle, boolean z, IMusicCallback iMusicCallback, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeAsync");
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            iMusicPlayer.executeAsync(str, bundle, z, iMusicCallback);
        }

        public static /* synthetic */ void goQQPlayer$default(IMusicPlayer iMusicPlayer, Context context, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goQQPlayer");
            }
            if ((i2 & 2) != 0) {
                i = 1;
            }
            iMusicPlayer.goQQPlayer(context, i);
        }
    }

    void bindXiaomiPlayerService(@NotNull Context context, @NotNull IMusicServiceListener callback);

    void executeAsync(@NotNull String action, @Nullable Bundle bundle, boolean force, @Nullable IMusicCallback callback);

    void goQQPlayer(@NotNull Context context, int mode);

    boolean hasBindService();

    boolean isHasSportPlaylist();

    @Nullable
    Boolean isShowMusicPlyer();

    void setBPM(int bpm);

    void setOnPlayerListener(@Nullable IPlayerEventListener callback);

    void unBindXiaomiPlayerService(@NotNull Context context);
}

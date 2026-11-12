package com.huami.sky.ui.service;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.sky.lib.properties.SkyIntroManager;
import com.huami.sky.service.PlayState;
import com.huami.sky.service.SkyService;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.koin.SkyServiceKoinScopeKt;
import com.huami.sky.ui.play.SkyPlayConstant;
import com.huami.sky.ui.play.SkyPlayService;
import com.huami.sky.ui.play.SkyPlayServiceHelper;
import com.huami.sky.ui.play.control.PlaybackManager;
import com.huami.sky.ui.play.notification.SkyPlayNotification;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/sky/ui/service/SkyServiceImpl;", "Lcom/huami/sky/service/SkyService;", "", "a", "b", "playOrPause", "pause", "restart", "logoutSkyService", "", SkyPlayNotification.SKY_NOTIFICATION_LIKE, "changeLikeState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/service/PlayState;", "listenPlayState", "listenLikeState", "getPlayState", "getLikeState", "getServiceState", "isPlaying", "", "getMusicId", "isFirstEnterSky", "getPlaySessionId", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyServiceImpl implements SkyService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public SkyServiceImpl(@NotNull Context context) {
        this.context = context;
    }

    private final void a() {
        Intent intent = new Intent();
        intent.setAction(SkyPlayConstant.SKY_LIKE_ACTION);
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
    }

    private final void b() {
        Intent intent = new Intent();
        intent.setAction(SkyPlayConstant.SKY_NOT_LIKE_ACTION);
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
    }

    @Override // com.huami.sky.service.SkyService
    public void changeLikeState(boolean like) {
        if (like) {
            a();
        } else {
            b();
        }
    }

    @Override // com.huami.sky.service.SkyService
    public boolean getLikeState() {
        return PlaybackManager.INSTANCE.getInstance().getCurrentMusicLiked();
    }

    @Override // com.huami.sky.service.SkyService
    @NotNull
    public String getMusicId() {
        return PlaybackManager.INSTANCE.getInstance().getPlayingMusicId();
    }

    @Override // com.huami.sky.service.SkyService
    @NotNull
    public String getPlaySessionId() {
        return ((SkyPlayServiceHelper) SkyServiceKoinScopeKt.skyServiceScope().get(Reflection.getOrCreateKotlinClass(SkyPlayServiceHelper.class), null, null)).getEventSessionId().getValue();
    }

    @Override // com.huami.sky.service.SkyService
    @NotNull
    public PlayState getPlayState() {
        return PlaybackManager.INSTANCE.getInstance().getPlayState();
    }

    @Override // com.huami.sky.service.SkyService
    public boolean getServiceState() {
        return PlaybackManager.INSTANCE.getInstance().musicListNotEmpty();
    }

    @Override // com.huami.sky.service.SkyService
    public boolean isFirstEnterSky() {
        return SkyIntroManager.INSTANCE.isFirstEnter();
    }

    @Override // com.huami.sky.service.SkyService
    public boolean isPlaying() {
        return PlaybackManager.INSTANCE.getInstance().isPlaying();
    }

    @Override // com.huami.sky.service.SkyService
    @NotNull
    public Flow<Boolean> listenLikeState() {
        return PlaybackManager.INSTANCE.getInstance().getLikeChangeFlow();
    }

    @Override // com.huami.sky.service.SkyService
    @NotNull
    public Flow<PlayState> listenPlayState() {
        return PlaybackManager.INSTANCE.getInstance().getPlayStateChangeFlow();
    }

    @Override // com.huami.sky.service.SkyService
    public void logoutSkyService() {
        Intent intent = new Intent();
        intent.setAction(SkyPlayConstant.SKY_LOGOUT_ACTION);
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
    }

    @Override // com.huami.sky.service.SkyService
    public void pause() {
        Intent intent = new Intent();
        intent.setAction(SkyPlayConstant.SKY_PAUSE_ACTION);
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
    }

    @Override // com.huami.sky.service.SkyService
    public void playOrPause() {
        if (getServiceState()) {
            Intent intent = new Intent();
            intent.setAction(SkyPlayConstant.SKY_PLAY_PAUSE_ACTION);
            LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
        } else {
            Intent intent2 = new Intent(this.context, (Class<?>) SkyPlayService.class);
            intent2.putExtra(SkyPlayConstant.SKY_SERVICE_ACTION, SkyPlayConstant.SKY_PLAY_PAUSE_ACTION);
            SkyExtKt.startServiceCatch(this.context, intent2);
        }
    }

    @Override // com.huami.sky.service.SkyService
    public void restart() {
        Intent intent = new Intent();
        intent.setAction(SkyPlayConstant.SKY_RESTART_ACTION);
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
    }
}

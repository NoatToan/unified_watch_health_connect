package com.huami.sleepassistant.lib.service;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.sleepassistant.apilib.bean.PlayBean;
import com.huami.sleepassistant.apilib.db.SleepAssistantDb;
import com.huami.sleepassistant.lib.jsbridge.MiSleepServiceHandler;
import com.huami.sleepassistant.lib.jsbridge.SleepServiceHandler;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.sleepassistant.lib.ui.music.mediautils.MediaMusicPlayUtils1;
import com.huami.sleepassistant.lib.ui.notification.NotificationManagersKt;
import com.huami.sleepassistant.servicelib.service.SleepAidService;
import com.huami.tools.analytics.DbUtils;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u000b\u001a\u00020\u00022\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00020\bj\u0002`\tH\u0016J\u001a\u0010\f\u001a\u00020\u00022\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00020\bj\u0002`\tH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/sleepassistant/lib/service/SleepAidServiceImpl;", "Lcom/huami/sleepassistant/servicelib/service/SleepAidService;", "", "playOrPauseMusic", "", "getMusicTitle", "", "isMusicPlaying", "Lkotlin/Function0;", "Lcom/huami/sleepassistant/servicelib/service/OnPlayStatusChange;", "playStatusChange", "addPlayStatusChange", "removePlayStatusChange", "logoutSleepService", "content", "jumpToAlarm", "data", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "pushNotice", "pushMiNotice", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "startMusicPlayer", "startMiMusicPlayer", "a", "Landroid/content/Context;", "Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "b", "Lkotlin/Lazy;", "()Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "mMediaPlayUtils", "<init>", "(Landroid/content/Context;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SleepAidServiceImpl implements SleepAidService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMediaPlayUtils = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/mediautils/MediaMusicPlayUtils1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MediaMusicPlayUtils1> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaMusicPlayUtils1 invoke() {
            return MediaMusicPlayUtils1.INSTANCE.getInstance(SleepAidServiceImpl.this.context);
        }
    }

    public SleepAidServiceImpl(@NotNull Context context) {
        this.context = context;
    }

    private final MediaMusicPlayUtils1 a() {
        return (MediaMusicPlayUtils1) this.mMediaPlayUtils.getValue();
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public void addPlayStatusChange(@NotNull Function0<Unit> playStatusChange) {
        a().addPlayStatusChange(playStatusChange);
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    @NotNull
    public String getMusicTitle() {
        return a().getMusicTitle();
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public boolean isMusicPlaying() {
        return a().isPlaying();
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public void jumpToAlarm(@NotNull String content) {
        new SleepServiceHandler().handleData(content);
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public void logoutSleepService() {
        Intent intent = new Intent();
        intent.setAction("com.huami.sleep.breathonpause");
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
        SleepAssistantDb companion = SleepAssistantDb.INSTANCE.getInstance();
        if (companion == null) {
            return;
        }
        companion.clean();
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public void playOrPauseMusic() {
        EventBus.getDefault().post(new PlayBean(NotificationManagersKt.TOGGLE_PAUSE_ACTION));
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public void pushMiNotice(@NotNull String data, @NotNull JsCallBackFunction function) {
        new MiSleepServiceHandler().handleData(data, function);
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public void pushNotice(@NotNull String data, @NotNull JsCallBackFunction function) {
        new SleepServiceHandler().handleData(data, function);
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public void removePlayStatusChange(@NotNull Function0<Unit> playStatusChange) {
        a().removePlayStatusChange(playStatusChange);
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public void startMiMusicPlayer(@NotNull Context context) {
        Navigator.INSTANCE.startMiMusicPlayer(context);
    }

    @Override // com.huami.sleepassistant.servicelib.service.SleepAidService
    public void startMusicPlayer(@NotNull Context context) {
        Navigator.INSTANCE.startMusicPlayer(context);
    }
}

package com.huami.sleepassistant.lib.ui.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huami.sleepassistant.apilib.bean.PlayBean;
import com.huami.sleepassistant.lib.ui.music.mediautils.MediaMusicPlayUtils1;
import com.huami.sleepassistant.lib.ui.notification.NotificationManagersKt;
import com.huami.tools.analytics.DbUtils;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/music/HeadsetReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class HeadsetReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (intent != null && Intrinsics.areEqual(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY") && context != null && MediaMusicPlayUtils1.INSTANCE.getInstance(context).isPlaying()) {
            EventBus.getDefault().post(new PlayBean(NotificationManagersKt.TOGGLE_PAUSE_ACTION));
        }
    }
}

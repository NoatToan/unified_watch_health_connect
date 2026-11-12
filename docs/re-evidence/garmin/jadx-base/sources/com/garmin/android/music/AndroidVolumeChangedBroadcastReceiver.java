package com.garmin.android.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import o13.l;
import o13.m;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/music/AndroidVolumeChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lorg/slf4j/Logger;", "logger$delegate", "Lo13/l;", "getLogger", "()Lorg/slf4j/Logger;", "logger", "Companion", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidVolumeChangedBroadcastReceiver extends BroadcastReceiver {
    private static final String ANDROID_CURRENT_VOLUME_INTENT_EXTRA = "android.media.EXTRA_VOLUME_STREAM_VALUE";
    private static final String STREAM_TYPE_EXTRA = "android.media.EXTRA_VOLUME_STREAM_TYPE";

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final l logger = m.b(AndroidVolumeChangedBroadcastReceiver$logger$2.INSTANCE);

    private final Logger getLogger() {
        return (Logger) this.logger.getValue();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (!intent.hasExtra(STREAM_TYPE_EXTRA)) {
            getLogger().error("Intent missing extra [android.media.EXTRA_VOLUME_STREAM_TYPE]. Cannot determine stream type.");
            return;
        }
        if (intent.getIntExtra(STREAM_TYPE_EXTRA, 0) != 3) {
            getLogger().debug("Volume change not for Music , ignoring. ");
            return;
        }
        if (!intent.hasExtra(ANDROID_CURRENT_VOLUME_INTENT_EXTRA)) {
            getLogger().error("intent missing extra [android.media.EXTRA_VOLUME_STREAM_VALUE]");
            return;
        }
        int intExtra = intent.getIntExtra(ANDROID_CURRENT_VOLUME_INTENT_EXTRA, 0);
        getLogger().debug("updating volume to " + intExtra);
        MusicManager.getInstance().setCurrentVolume(intExtra);
    }
}

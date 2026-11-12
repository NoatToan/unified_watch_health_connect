package com.xiaomi.fitness.lyra.keep_alive;

import android.content.Intent;
import com.xiaomi.continuity.ContinuityListenerService;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/lyra/keep_alive/LyraKeepAliveService;", "Lcom/xiaomi/continuity/ContinuityListenerService;", "<init>", "()V", "onNotify", "", "intent", "Landroid/content/Intent;", "Companion", "keep-alive_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LyraKeepAliveService extends ContinuityListenerService {

    @NotNull
    private static final String TAG = "LyraService";

    @Override // com.xiaomi.continuity.ContinuityListenerService
    public void onNotify(@Nullable Intent intent) {
        super.onNotify(intent);
        Logger.i(TAG, "onNotify() called with: intent = " + (intent != null ? intent.getAction() : null));
    }
}

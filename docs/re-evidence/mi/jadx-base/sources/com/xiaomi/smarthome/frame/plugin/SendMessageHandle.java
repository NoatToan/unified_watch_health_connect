package com.xiaomi.smarthome.frame.plugin;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.smarthome.frame.cancel.LifeCycleCancelHandle;

/* JADX INFO: loaded from: classes2.dex */
public class SendMessageHandle extends LifeCycleCancelHandle {
    /* JADX WARN: Multi-variable type inference failed */
    public SendMessageHandle(Context context) {
        if (context instanceof LifecycleOwner) {
            bind(((LifecycleOwner) context).getLifecycle());
        }
    }
}

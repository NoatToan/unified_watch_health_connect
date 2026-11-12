package com.huami.watch.wifi;

import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/wifi/IEventReceiver;", "", "Landroid/content/Intent;", "intent", "", "onReceive", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public interface IEventReceiver {
    void onReceive(@Nullable Intent intent);
}

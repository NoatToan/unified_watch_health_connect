package com.xiaomi.fitness.common.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.NetworkStateUtil$mNetworkChangeReceiver$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/xiaomi/fitness/common/utils/NetworkStateUtil$mNetworkChangeReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkStateUtil$mNetworkChangeReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ NetworkStateUtil this$0;

    public NetworkStateUtil$mNetworkChangeReceiver$1(NetworkStateUtil networkStateUtil) {
        this.this$0 = networkStateUtil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$0(NetworkStateUtil this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        NetworkStateUtil.updateNetworkState$default(this$0, context, false, 2, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (this.this$0.mAccessNetworkEnable) {
            final NetworkStateUtil networkStateUtil = this.this$0;
            ExecutorHelper.runInBackground(new Runnable() { // from class: pkg
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkStateUtil$mNetworkChangeReceiver$1.onReceive$lambda$0(networkStateUtil, context);
                }
            });
        }
    }
}

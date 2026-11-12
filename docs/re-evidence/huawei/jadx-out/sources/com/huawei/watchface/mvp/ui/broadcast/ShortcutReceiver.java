package com.huawei.watchface.mvp.ui.broadcast;

import android.content.Context;
import android.content.Intent;
import androidx.core.graphics.drawable.IconCompat;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import com.huawei.watchface.R;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes45.dex */
public class ShortcutReceiver extends SafeBroadcastReceiver {
    private static final String TAG = "ShortcutReceiver";

    static /* synthetic */ void lambda$onReceiveMsg$0(Context context) {
        if (HwWatchFaceApi.getInstance(context).isExistShortCut("watchface_supermarket")) {
            HwWatchFaceApi.getInstance(context).updatePinnedShortcut("watchface_supermarket", DensityUtil.getStringById(R.string.dial_market_new), IconCompat.createWithResource(context, R.drawable.watchface_ic_shortcut));
        } else {
            HwLog.i(TAG, "isExistShortCut false");
        }
    }

    @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
    public void onReceiveMsg(final Context context, Intent intent) {
        String action = intent.getAction();
        HwLog.i(TAG, "onReceiveMsg action = " + action);
        if ("android.intent.action.LOCALE_CHANGED".equals(action)) {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.mvp.ui.broadcast.ShortcutReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ShortcutReceiver.lambda$onReceiveMsg$0(context);
                }
            });
        } else {
            HwLog.i(TAG, "onReceiveMsg action is not ACTION_LOCALE_CHANGED");
        }
    }
}

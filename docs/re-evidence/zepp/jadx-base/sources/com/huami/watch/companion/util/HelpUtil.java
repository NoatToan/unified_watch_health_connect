package com.huami.watch.companion.util;

import android.content.Context;
import android.text.TextUtils;
import com.huami.midong.webview.ui.JsBridgeActivity;
import com.huami.watch.companion.R;
import com.huami.watch.companion.cloud.Cloud;

/* JADX INFO: loaded from: classes16.dex */
public class HelpUtil {
    public static final int HELP_CONNECTION = 4;
    public static final int HELP_SYNCING_DATA_HELP = 5;
    public static final int HELP_UNLOCK_FAILED = 3;
    private static final int a = 2;

    public static void toHelpPage(Context context, int i) {
        String string;
        if (context == null) {
            return;
        }
        String strUrlUnlockFailedHelp = "";
        if (i == 3) {
            strUrlUnlockFailedHelp = Cloud.urlUnlockFailedHelp();
            string = context.getString(R.string.unlock_failed_help);
        } else if (i == 4) {
            strUrlUnlockFailedHelp = Cloud.urlConnectionHelp();
            string = context.getString(R.string.device_connection_help);
        } else if (i != 5) {
            string = "";
        } else {
            strUrlUnlockFailedHelp = Cloud.urlSyncingDataHelp();
            string = context.getString(R.string.device_syncing_data_help);
        }
        if (TextUtils.isEmpty(strUrlUnlockFailedHelp) || TextUtils.isEmpty(string)) {
            return;
        }
        JsBridgeActivity.load(context, strUrlUnlockFailedHelp, string, true);
    }
}

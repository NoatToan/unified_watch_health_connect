package com.xiaomi.hm.health.training.ui.helper;

import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.ui.helper.NetworkConfirmHelper;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;

/* JADX INFO: loaded from: classes21.dex */
public class NetworkConfirmHelper {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Runnable runnable, DialogInterface dialogInterface, int i) {
        runnable.run();
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.COURSE_NETWORK_STATUS).addExtra(TrainingAnalytics.ParamKey.CONTINUE_PLAYING, TrainingAnalytics.ParamValue.ContinuePlaying.YES));
    }

    public static void checkNetworkAvailableThenDo(@NonNull FragmentActivity fragmentActivity, @NonNull final Runnable runnable) {
        if (!NetUtil.isNetworkConnected(fragmentActivity)) {
            IconToast.showError(fragmentActivity, R.string.net_not_work);
        } else if (NetUtil.isWifiConnected(fragmentActivity)) {
            runnable.run();
        } else {
            new AlertDialogFragment.Builder(fragmentActivity).setTitle(R.string.tr_prompt).setMessage(R.string.tr_watch_video_not_in_wifi).setPositiveButton(R.string.tr_btn_confirm, new DialogInterface.OnClickListener() { // from class: xd5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    NetworkConfirmHelper.c(runnable, dialogInterface, i);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: yd5
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    NetworkConfirmHelper.d(dialogInterface, i);
                }
            }).create().show(fragmentActivity.getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.COURSE_NETWORK_STATUS).addExtra(TrainingAnalytics.ParamKey.CONTINUE_PLAYING, "No"));
    }
}

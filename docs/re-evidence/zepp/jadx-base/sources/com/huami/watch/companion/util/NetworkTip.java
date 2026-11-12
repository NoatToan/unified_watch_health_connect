package com.huami.watch.companion.util;

import android.app.Activity;
import android.view.View;
import com.huami.watch.companion.R;
import com.huami.watch.hmwatchmanager.view.AlertDialogFragment;
import com.huami.watch.util.NetworkUtil;

/* JADX INFO: loaded from: classes16.dex */
public final class NetworkTip {
    private static final String a = "UI-NetworkTip";

    public class a implements View.OnClickListener {
        public final /* synthetic */ AlertDialogFragment a;

        public a(AlertDialogFragment alertDialogFragment) {
            this.a = alertDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismissAllowingStateLoss();
        }
    }

    private static void a(Activity activity) {
        AlertDialogFragment alertDialogFragmentNewInstance = AlertDialogFragment.newInstance(1);
        alertDialogFragmentNewInstance.setMessage(activity.getString(R.string.no_network_plz_retry));
        alertDialogFragmentNewInstance.setNeutral(activity.getString(R.string.btn_known), new a(alertDialogFragmentNewInstance));
        alertDialogFragmentNewInstance.show(activity.getFragmentManager(), a);
    }

    public static boolean checkIsOffline(Activity activity) {
        if (!NetworkUtil.isOffline(activity)) {
            return false;
        }
        a(activity);
        return true;
    }
}

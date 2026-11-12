package com.huawei.ui.thirdpartservice.activity.base;

import android.app.Activity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.activity.BaseConnectActivity;
import com.huawei.ui.thirdpartservice.syncdata.callback.ReferenceCheckConnectCallback;
import defpackage.qpx;

/* JADX INFO: loaded from: classes20.dex */
public abstract class CheckConnectCallback extends ReferenceCheckConnectCallback<Activity> {
    private static final String TAG = "CheckConnectCallback";

    /* JADX INFO: loaded from: classes3.dex */
    public interface Interrupt {
        default boolean isFinish() {
            return false;
        }

        void onStatusGot();
    }

    protected abstract void startToConnectActivity(Activity activity);

    protected abstract void startToDisConnectActivity(Activity activity);

    public CheckConnectCallback(Activity activity) {
        super(activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.thirdpartservice.syncdata.callback.ReferenceCheckConnectCallback
    public void connectResultWhenReferenceNotNull(final Activity activity, final boolean z, final boolean z2) {
        LogUtil.a(TAG, "connectResultWhenReferenceNotNull", Boolean.valueOf(z2));
        activity.runOnUiThread(new Runnable() { // from class: wwx
            @Override // java.lang.Runnable
            public final void run() {
                this.f52565b.lambda$connectResultWhenReferenceNotNull$0(activity, z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$connectResultWhenReferenceNotNull$0(Activity activity, boolean z, boolean z2) {
        boolean z3 = activity instanceof Interrupt;
        if (z3) {
            ((Interrupt) activity).onStatusGot();
        }
        if (!z) {
            qpx.e(activity, R.string.IDS_network_connect_error);
            return;
        }
        LogUtil.a(TAG, "jump activity", Boolean.valueOf(z2));
        if (z2) {
            startToDisConnectActivity(activity);
            if (!z3 || ((Interrupt) activity).isFinish()) {
                activity.finish();
                return;
            }
            return;
        }
        if (activity instanceof BaseConnectActivity) {
            return;
        }
        startToConnectActivity(activity);
    }
}

package yw2;

import android.app.Activity;
import android.app.Dialog;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyw2/a;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cx2.h f199989a = new cx2.h("MessageDisplayer", null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Dialog f199990b;

    public final void a(Activity activity, Dialog dialog) {
        activity.getClass();
        dialog.getClass();
        dialog.setOwnerActivity(activity);
        Dialog dialog2 = this.f199990b;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        this.f199990b = null;
        Activity ownerActivity = dialog.getOwnerActivity();
        if (ownerActivity == null || ownerActivity.isFinishing()) {
            Logger logger = cx2.h.f56678c;
            this.f199989a.getClass();
        } else {
            this.f199990b = dialog;
            dialog.show();
        }
    }
}

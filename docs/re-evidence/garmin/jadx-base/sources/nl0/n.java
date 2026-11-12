package nl0;

import android.app.Activity;
import android.content.DialogInterface;
import c22.n1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnl0/n;", "Lnl0/a;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/app/Activity;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f126499a;

    public n(Activity activity) {
        activity.getClass();
        this.f126499a = activity;
    }

    @Override // nl0.a
    public final void execute() {
        final int i14 = 0;
        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(this.f126499a).setTitle(R.string.lbl_garmin_golf_app).setCancelable(false).setMessage(R.string.update_golf_app_info_message).setPositiveButton(R.string.lbl_update, new DialogInterface.OnClickListener(this) { // from class: nl0.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f126498b;

            {
                this.f126498b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i14) {
                    case 0:
                        dialogInterface.getClass();
                        Activity activity = this.f126498b.f126499a;
                        new n1(activity, hb2.g.a.GARMIN_GOLF).a();
                        dialogInterface.dismiss();
                        activity.finish();
                        break;
                    default:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        this.f126498b.f126499a.finish();
                        break;
                }
            }
        });
        final int i15 = 1;
        androidx.appcompat.app.e eVarCreate = positiveButton.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener(this) { // from class: nl0.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f126498b;

            {
                this.f126498b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                switch (i15) {
                    case 0:
                        dialogInterface.getClass();
                        Activity activity = this.f126498b.f126499a;
                        new n1(activity, hb2.g.a.GARMIN_GOLF).a();
                        dialogInterface.dismiss();
                        activity.finish();
                        break;
                    default:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        this.f126498b.f126499a.finish();
                        break;
                }
            }
        }).create();
        eVarCreate.getClass();
        eVarCreate.show();
    }
}

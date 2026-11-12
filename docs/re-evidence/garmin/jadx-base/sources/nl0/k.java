package nl0;

import android.app.Activity;
import android.content.DialogInterface;
import c22.n1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnl0/k;", "Lnl0/a;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "activityFinish", "", "message", "<init>", "(Landroid/app/Activity;ZLjava/lang/String;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f126493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f126494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f126495c;

    public k(Activity activity, boolean z14, String str) {
        activity.getClass();
        str.getClass();
        this.f126493a = activity;
        this.f126494b = z14;
        this.f126495c = str;
    }

    @Override // nl0.a
    public final void execute() {
        final int i14 = 0;
        androidx.appcompat.app.e.a positiveButton = new androidx.appcompat.app.e.a(this.f126493a).setTitle(R.string.golf_lbl_download_garmin_golf).setCancelable(false).setMessage(this.f126495c).setPositiveButton(R.string.lbl_download, new DialogInterface.OnClickListener(this) { // from class: nl0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f126492b;

            {
                this.f126492b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i14) {
                    case 0:
                        dialogInterface.getClass();
                        Activity activity = this.f126492b.f126493a;
                        new n1(activity, hb2.g.a.GARMIN_GOLF).a();
                        dialogInterface.dismiss();
                        activity.finish();
                        break;
                    default:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        k kVar = this.f126492b;
                        if (kVar.f126494b) {
                            kVar.f126493a.finish();
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        androidx.appcompat.app.e eVarCreate = positiveButton.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: nl0.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f126492b;

            {
                this.f126492b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i16) {
                switch (i15) {
                    case 0:
                        dialogInterface.getClass();
                        Activity activity = this.f126492b.f126493a;
                        new n1(activity, hb2.g.a.GARMIN_GOLF).a();
                        dialogInterface.dismiss();
                        activity.finish();
                        break;
                    default:
                        dialogInterface.getClass();
                        dialogInterface.dismiss();
                        k kVar = this.f126492b;
                        if (kVar.f126494b) {
                            kVar.f126493a.finish();
                        }
                        break;
                }
            }
        }).create();
        eVarCreate.getClass();
        eVarCreate.show();
        oe2.f.e(eVarCreate, 1.5f);
    }
}

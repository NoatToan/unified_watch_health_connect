package aj1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.ResetLivetrackShareMethods;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3433b;

    public /* synthetic */ f(Context context, int i14) {
        this.f3432a = i14;
        this.f3433b = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f3432a;
        Context context = this.f3433b;
        switch (i15) {
            case 0:
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                dialogInterface.getClass();
                String string = context.getString(R.string.rts_pairing_issue_FAQ_url_path);
                string.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                dialogInterface.dismiss();
                break;
            case 1:
                ResetLivetrackShareMethods.handleClick$lambda$1(context, dialogInterface, i14);
                break;
            case 2:
                context.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(context.getString(R.string.rts_pairing_issue_FAQ_url_path))));
                dialogInterface.dismiss();
                break;
        }
    }
}

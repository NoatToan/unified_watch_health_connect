package x10;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.connectiq.settings.ConnectIQAppSettingsActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectIQAppSettingsActivity f188373b;

    public /* synthetic */ b(ConnectIQAppSettingsActivity connectIQAppSettingsActivity, int i14) {
        this.f188372a = i14;
        this.f188373b = connectIQAppSettingsActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f188372a;
        ConnectIQAppSettingsActivity connectIQAppSettingsActivity = this.f188373b;
        switch (i15) {
            case 0:
                ConnectIQAppSettingsActivity.a aVar = ConnectIQAppSettingsActivity.f32003k;
                dialogInterface.dismiss();
                connectIQAppSettingsActivity.finish();
                break;
            default:
                ConnectIQAppSettingsActivity.a aVar2 = ConnectIQAppSettingsActivity.f32003k;
                dialogInterface.dismiss();
                connectIQAppSettingsActivity.setResult(0);
                connectIQAppSettingsActivity.finish();
                break;
        }
    }
}

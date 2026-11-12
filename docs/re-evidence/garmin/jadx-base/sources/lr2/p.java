package lr2;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.garmin.feature.garminpay.ui.devicesettings.LostWatchActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LostWatchActivity f114427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f114428c;

    public /* synthetic */ p(LostWatchActivity lostWatchActivity, String str, int i14) {
        this.f114426a = i14;
        this.f114427b = lostWatchActivity;
        this.f114428c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f114426a;
        String str = this.f114428c;
        LostWatchActivity lostWatchActivity = this.f114427b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        LostWatchActivity.a aVar = LostWatchActivity.f52015j;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                lostWatchActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                break;
            default:
                dialogInterface.getClass();
                lostWatchActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                dialogInterface.dismiss();
                break;
        }
        return Unit.INSTANCE;
    }
}

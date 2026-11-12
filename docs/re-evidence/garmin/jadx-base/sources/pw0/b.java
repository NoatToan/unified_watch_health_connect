package pw0;

import android.content.DialogInterface;
import android.net.Uri;
import c22.q0;
import com.garmin.android.apps.connectmobile.lteconnect.LteConnectionActivity;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LteConnectionActivity f141703b;

    public /* synthetic */ b(LteConnectionActivity lteConnectionActivity, int i14) {
        this.f141702a = i14;
        this.f141703b = lteConnectionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f141702a;
        LteConnectionActivity lteConnectionActivity = this.f141703b;
        switch (i15) {
            case 0:
                LteConnectionActivity.a aVar = LteConnectionActivity.f38695j;
                q0.f23203a.getClass();
                q0.a.b(lteConnectionActivity, "com.vzw.hss.myverizon");
                dialogInterface.dismiss();
                break;
            case 1:
                LteConnectionActivity.a aVar2 = LteConnectionActivity.f38695j;
                q0.f23203a.getClass();
                q0.a.b(lteConnectionActivity, "com.vzw.hss.myverizon");
                dialogInterface.dismiss();
                break;
            default:
                LteConnectionActivity.a aVar3 = LteConnectionActivity.f38695j;
                dialogInterface.dismiss();
                Uri uri = Uri.parse("https://www.verizonwireless.com/my-verizon/");
                uri.getClass();
                g22.a.c(lteConnectionActivity, uri);
                break;
        }
    }
}

package tb1;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import p005kotlin.Unit;
import ro0.l;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f163749b;

    public /* synthetic */ g(m mVar) {
        this.f163748a = 0;
        this.f163749b = mVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f163748a;
        m mVar = this.f163749b;
        switch (i14) {
            case 0:
                HelpActivity.a.e(HelpActivity.f36653a, this.f163749b, l.PREGNANCY_SETTINGS_HELP, "Training and Performance", null, 8);
                break;
            case 1:
                int i15 = ue2.e.f170268c;
                String packageName = mVar.getPackageName();
                try {
                    mVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
                } catch (ActivityNotFoundException unused) {
                    mVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
                }
                break;
            default:
                int i16 = ue2.e.f170268c;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms"));
                intent.setPackage("com.android.vending");
                try {
                    mVar.startActivity(intent);
                } catch (ActivityNotFoundException unused2) {
                    mVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.gms")));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(ue2.e eVar, m mVar, int i14) {
        this.f163748a = i14;
        this.f163749b = mVar;
    }
}

package q31;

import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.onboarding.komoot.KomootConsentActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KomootConsentActivity f142414b;

    public /* synthetic */ d(KomootConsentActivity komootConsentActivity, int i14) {
        this.f142413a = i14;
        this.f142414b = komootConsentActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f142413a;
        KomootConsentActivity komootConsentActivity = this.f142414b;
        switch (i14) {
            case 0:
                KomootConsentActivity.a aVar = KomootConsentActivity.f39717c;
                komootConsentActivity.onBackPressed();
                break;
            case 1:
                KomootConsentActivity.a aVar2 = KomootConsentActivity.f39717c;
                komootConsentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://x.bndspn.com/v1/ex-w82c82")));
                c.f142410a.getClass();
                c.a();
                break;
            case 2:
                KomootConsentActivity.a aVar3 = KomootConsentActivity.f39717c;
                komootConsentActivity.onBackPressed();
                break;
            default:
                KomootConsentActivity.a aVar4 = KomootConsentActivity.f39717c;
                komootConsentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://x.bndspn.com/v1/ex-w82c82")));
                c.f142410a.getClass();
                c.a();
                break;
        }
        return Unit.INSTANCE;
    }
}

package z10;

import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.a f200879b;

    public /* synthetic */ a(com.garmin.android.apps.connectmobile.consent.a aVar, int i14) {
        this.f200878a = i14;
        this.f200879b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f200878a;
        com.garmin.android.apps.connectmobile.consent.a aVar = this.f200879b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                int i15 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                if (bool != null) {
                    aVar.ta();
                    aVar.hideProgressOverlay();
                }
                break;
            case 1:
                Fragment fragment = (Fragment) obj;
                int i16 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                fragment.getClass();
                androidx.fragment.app.v supportFragmentManager = aVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                aVar2.l(R.id.content_frame, fragment, null);
                aVar2.e();
                break;
            default:
                Fragment fragment2 = (Fragment) obj;
                int i17 = com.garmin.android.apps.connectmobile.consent.a.f32246n;
                fragment2.getClass();
                androidx.fragment.app.v supportFragmentManager2 = aVar.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                aVar3.l(R.id.content_frame, fragment2, null);
                aVar3.e();
                break;
        }
        return Unit.INSTANCE;
    }
}

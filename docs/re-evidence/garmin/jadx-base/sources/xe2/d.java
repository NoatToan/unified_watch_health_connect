package xe2;

import androidx.fragment.app.Fragment;
import com.garmin.android.library.mobileauth.ui.AuthenticateAndFetchCustomerGUIDActivity;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthenticateAndFetchCustomerGUIDActivity f190457b;

    public /* synthetic */ d(AuthenticateAndFetchCustomerGUIDActivity authenticateAndFetchCustomerGUIDActivity, int i14) {
        this.f190456a = i14;
        this.f190457b = authenticateAndFetchCustomerGUIDActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragmentG;
        int i14 = this.f190456a;
        AuthenticateAndFetchCustomerGUIDActivity authenticateAndFetchCustomerGUIDActivity = this.f190457b;
        switch (i14) {
            case 0:
                int i15 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                authenticateAndFetchCustomerGUIDActivity.setResult(0);
                authenticateAndFetchCustomerGUIDActivity.finish();
                break;
            case 1:
                int i16 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                authenticateAndFetchCustomerGUIDActivity.setResult(1);
                authenticateAndFetchCustomerGUIDActivity.finish();
                break;
            default:
                int i17 = AuthenticateAndFetchCustomerGUIDActivity.f50337n;
                i0 i0Var = authenticateAndFetchCustomerGUIDActivity.f50417f;
                if (i0Var != null && (fragmentG = authenticateAndFetchCustomerGUIDActivity.getSupportFragmentManager().G(i0Var.name())) != null) {
                    androidx.fragment.app.v supportFragmentManager = authenticateAndFetchCustomerGUIDActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.k(fragmentG);
                    aVar.s(true, true);
                    authenticateAndFetchCustomerGUIDActivity.f50417f = null;
                    break;
                }
                break;
        }
    }
}

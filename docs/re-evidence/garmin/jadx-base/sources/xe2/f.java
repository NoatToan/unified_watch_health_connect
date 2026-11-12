package xe2;

import android.content.DialogInterface;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthenticationActivity f190468b;

    public /* synthetic */ f(AuthenticationActivity authenticationActivity, int i14) {
        this.f190467a = i14;
        this.f190468b = authenticationActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i14 = this.f190467a;
        AuthenticationActivity authenticationActivity = this.f190468b;
        switch (i14) {
            case 0:
                AuthenticationActivity.a aVar = AuthenticationActivity.f50343v;
                authenticationActivity.Q9().postAtFrontOfQueue(new v.b0(authenticationActivity, 22));
                break;
            case 1:
                i0 i0Var = i0.WELCOME;
                AuthenticationActivity.a aVar2 = AuthenticationActivity.f50343v;
                authenticationActivity.ca(i0Var, null);
                break;
            default:
                i0 i0Var2 = i0.WELCOME;
                AuthenticationActivity.a aVar3 = AuthenticationActivity.f50343v;
                authenticationActivity.ca(i0Var2, null);
                break;
        }
    }
}

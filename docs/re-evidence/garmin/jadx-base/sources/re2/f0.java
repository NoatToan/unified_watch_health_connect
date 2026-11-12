package re2;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.library.mobileauth.ui.AuthenticationActivity;
import p005kotlin.Metadata;
import te2.j2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lre2/f0;", "Landroid/accounts/AbstractAccountAuthenticator;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 extends AbstractAccountAuthenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f152288a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context) {
        super(context);
        context.getClass();
        this.f152288a = context;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(this.f152288a, (Class<?>) AuthenticationActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        j2.f164115a.getClass();
        String str3 = j2.f164120f;
        if (str3 == null) {
            p005kotlin.jvm.internal.s.m("systemAccountName");
            throw null;
        }
        intent.putExtra("authAccount", str3);
        intent.putExtra("accountType", str);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        return new Bundle();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return new Bundle();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        if (account == null) {
            return new Bundle();
        }
        Context context = this.f152288a;
        String strPeekAuthToken = AccountManager.get(context).peekAuthToken(account, str);
        if (!TextUtils.isEmpty(strPeekAuthToken)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("authAccount", account.name);
            bundle2.putString("accountType", account.type);
            bundle2.putString("authtoken", strPeekAuthToken);
            return bundle2;
        }
        Intent intent = new Intent(context, (Class<?>) AuthenticationActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        intent.putExtra("accountType", account.type);
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("intent", intent);
        return bundle3;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final String getAuthTokenLabel(String str) {
        return "Garmin";
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        return new Bundle();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        return new Bundle();
    }
}

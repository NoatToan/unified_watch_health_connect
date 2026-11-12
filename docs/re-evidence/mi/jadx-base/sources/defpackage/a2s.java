package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.mibi.sdk.account.AccountProviderImpl;
import com.mibi.sdk.account.BuildConfig;
import com.mibi.sdk.common.Client;
import com.mibi.sdk.common.account.AccountRegistry;
import com.mibi.sdk.common.account.IAccountProvider;
import com.mibi.sdk.common.account.IServiceTokenFuture;
import com.mibi.sdk.common.account.IServiceTokenResult;
import com.mibi.sdk.common.utils.MibiLog;
import com.mipay.sdk.IMipayAccountProvider;
import java.lang.reflect.Constructor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class a2s {

    public class a implements IMipayAccountProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IAccountProvider f556a;

        /* JADX INFO: renamed from: a2s$a$a, reason: collision with other inner class name */
        public class C0002a implements AccountManagerFuture<Bundle> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ IServiceTokenFuture f557a;

            public C0002a(IServiceTokenFuture iServiceTokenFuture) {
                this.f557a = iServiceTokenFuture;
            }

            @Override // android.accounts.AccountManagerFuture
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Bundle getResult() {
                return getResult(30L, TimeUnit.SECONDS);
            }

            @Override // android.accounts.AccountManagerFuture
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Bundle getResult(long j, TimeUnit timeUnit) {
                return c(this.f557a.get(j, timeUnit));
            }

            public final Bundle c(IServiceTokenResult iServiceTokenResult) {
                Bundle bundle = new Bundle();
                if (TextUtils.isEmpty(iServiceTokenResult.getSecurity())) {
                    bundle.putString("authtoken", iServiceTokenResult.getServiceToken());
                } else {
                    bundle.putString("authtoken", iServiceTokenResult.getServiceToken() + "," + iServiceTokenResult.getSecurity());
                }
                bundle.putParcelable("intent", iServiceTokenResult.getIntent());
                bundle.putString("authAccount", iServiceTokenResult.getUserId());
                return bundle;
            }

            @Override // android.accounts.AccountManagerFuture
            public boolean cancel(boolean z) {
                return false;
            }

            @Override // android.accounts.AccountManagerFuture
            public boolean isCancelled() {
                return this.f557a.isCancelled();
            }

            @Override // android.accounts.AccountManagerFuture
            public boolean isDone() {
                return this.f557a.isDone();
            }
        }

        public a(IAccountProvider iAccountProvider) {
            this.f556a = iAccountProvider;
        }

        public final AccountManagerFuture<Bundle> a(String str, AccountManagerCallback<Bundle> accountManagerCallback) {
            C0002a c0002a = new C0002a(this.f556a.getServiceToken(Client.getContext(), str));
            if (accountManagerCallback != null) {
                accountManagerCallback.run(c0002a);
            }
            return c0002a;
        }

        @Override // com.mipay.sdk.IMipayAccountProvider
        public AccountManagerFuture<Bundle> addAccount(String str, String str2, String[] strArr, Bundle bundle, Activity activity, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
            return null;
        }

        @Override // com.mipay.sdk.IMipayAccountProvider
        public Account[] getAccounts() {
            return new Account[]{this.f556a.getAccount()};
        }

        @Override // com.mipay.sdk.IMipayAccountProvider
        public Account[] getAccountsByType(String str) {
            return new Account[]{this.f556a.getAccount()};
        }

        @Override // com.mipay.sdk.IMipayAccountProvider
        public AccountManagerFuture<Bundle> getAuthToken(Account account, String str, Bundle bundle, Activity activity, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
            return a(str, accountManagerCallback);
        }

        @Override // com.mipay.sdk.IMipayAccountProvider
        public void invalidateAuthToken(String str, String str2) {
        }

        @Override // com.mipay.sdk.IMipayAccountProvider
        public boolean isUseSystem() {
            return a2s.c() && this.f556a.isUseSystem();
        }

        @Override // com.mipay.sdk.IMipayAccountProvider
        public AccountManagerFuture<Bundle> getAuthToken(Account account, String str, Bundle bundle, boolean z, AccountManagerCallback<Bundle> accountManagerCallback, Handler handler) {
            return a(str, accountManagerCallback);
        }
    }

    public static IMipayAccountProvider a(Context context) {
        try {
            int i = AccountProviderImpl.f10075a;
            Constructor constructor = AccountProviderImpl.class.getConstructor(Context.class);
            IAccountProvider accountProvider = AccountRegistry.getAccountProvider();
            if (accountProvider == null) {
                accountProvider = (IAccountProvider) constructor.newInstance(context);
            }
            return new a(accountProvider);
        } catch (Exception e) {
            MibiLog.d("AccountUtil", "no account module", e);
            return null;
        }
    }

    public static boolean c() {
        try {
            return BuildConfig.class.getField("ACCOUNT_MODULE_EXIST").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }
}

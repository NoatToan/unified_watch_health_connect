package defpackage;

import android.accounts.AccountsException;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.SortedParameter;
import com.mibi.sdk.common.account.AccountRegistry;
import com.mibi.sdk.common.account.ILoginProvider;
import com.mibi.sdk.common.exception.AccountException;
import com.mibi.sdk.common.exception.ConnectionException;
import com.mibi.sdk.common.exception.PaymentException;
import com.mibi.sdk.task.RxTask;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class v2s extends RxTask<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f36421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SortedParameter f36422b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f36423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36424b;
    }

    public v2s(Activity activity) {
        super(a.class);
        this.f36421a = activity;
    }

    @Override // com.mibi.sdk.task.RxTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doLoad(a aVar) throws PaymentException {
        String string = this.f36422b.getString(CommonConstants.KEY_USER_NAME);
        String string2 = this.f36422b.getString("password");
        ILoginProvider loginProvider = AccountRegistry.getLoginProvider();
        if (loginProvider == null) {
            throw new IllegalStateException("account pay should not use this task");
        }
        try {
            aVar.f36423a = loginProvider.getStsUrl(this.f36421a, string, string2, CommonConstants.SERVICE_ID);
            aVar.f36424b = 0;
        } catch (AuthenticatorException e) {
            aVar.f36424b = 1;
            throw new AccountException(e);
        } catch (OperationCanceledException unused) {
            aVar.f36424b = 2;
        } catch (AccountsException e2) {
            aVar.f36424b = 1;
            throw new AccountException(e2);
        } catch (IOException e3) {
            aVar.f36424b = 2;
            throw new AccountException(new ConnectionException(e3));
        } catch (Exception e4) {
            aVar.f36424b = 1;
            throw new AccountException(e4);
        }
    }

    public void b(SortedParameter sortedParameter) {
        if (sortedParameter == null) {
            sortedParameter = new SortedParameter();
        }
        this.f36422b = sortedParameter;
    }
}

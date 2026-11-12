package com.huami.watch.companion.account;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.huami.ecg.EcgDataRepo;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.sync.SyncCenter;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.util.Log;
import io.reactivex.ObservableEmitter;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes16.dex */
public class AccountLogoutHelper {
    public static final int STATE_FAIL = -4;
    public static final int STATE_LOGOUT = 3;
    public static final int STATE_NONE = 0;
    public static final int STATE_SUCCESS = -3;
    private static final String e = "Account-LogoutHelper";
    private static AccountLogoutHelper f;
    private Consumer<Integer> a;
    private int b;
    private Disposable c;
    private ObservableEmitter<? super Integer> d;

    public class a implements Consumer<Integer> {
        public a() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NonNull Integer num) throws Exception {
            Log.d(AccountLogoutHelper.e, "OnLogoutStateChanged : " + num, new Object[0]);
            if (-3 == num.intValue()) {
                AccountLogoutHelper.this.release();
            }
        }
    }

    public class b implements IAccount.Callback<String, ErrorCode> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ boolean b;

        public b(Context context, boolean z) {
            this.a = context;
            this.b = z;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(ErrorCode errorCode) {
            Log.w(AccountLogoutHelper.e, "Logout Failed : " + errorCode, new Object[0]);
            if (errorCode.getErrorCode() == null || !"0105,0108".contains(errorCode.getErrorCode())) {
                AccountLogoutHelper.this.b = -4;
                AccountLogoutHelper.this.notifyStateChanged();
                AccountLogoutHelper.this.d();
            } else {
                AccountLogoutHelper.this.b = -3;
                AccountLogoutHelper.this.notifyStateChanged();
                AccountCallback.onLogoutSuccess(this.a, this.b);
            }
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            Log.d(AccountLogoutHelper.e, "Logout Success : " + str, new Object[0]);
            AccountLogoutHelper.this.b = -3;
            AccountLogoutHelper.this.notifyStateChanged();
            AccountCallback.onLogoutSuccess(this.a, this.b);
        }
    }

    private AccountLogoutHelper() {
    }

    private void c(FragmentActivity fragmentActivity, boolean z, @NonNull Consumer<Integer> consumer) {
        this.a = consumer;
        this.b = 3;
        notifyStateChanged();
        AccountManager.getDefault(fragmentActivity).logout(fragmentActivity, new b(fragmentActivity, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
    }

    public static AccountLogoutHelper getHelper() {
        if (f == null) {
            f = new AccountLogoutHelper();
        }
        return f;
    }

    public void logout(FragmentActivity fragmentActivity, boolean z) {
        if (this.a == null) {
            this.a = new a();
        }
        Log.i(e, "Logout...", new Object[0]);
        c(fragmentActivity, z, this.a);
    }

    public void notifyStateChanged() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            ObservableEmitter<? super Integer> observableEmitter = this.d;
            if (observableEmitter != null) {
                observableEmitter.onNext(Integer.valueOf(this.b));
                return;
            }
            return;
        }
        Consumer<Integer> consumer = this.a;
        if (consumer != null) {
            try {
                consumer.accept(Integer.valueOf(this.b));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public boolean onSyncData(Context context) {
        Log.i(e, "Logout Syncing Data Start...", new Object[0]);
        DeviceManager.getManager(context);
        boolean zStart = UserSettingsManager.getManager(context).syncAllToCloud().success;
        if (zStart) {
            zStart = SyncCenter.getCenter(context).types(3).silent(true).start();
        }
        new EcgDataRepo().checkData(true);
        Log.i(e, "Logout Syncing Data End : " + zStart, new Object[0]);
        return zStart;
    }

    public void release() {
        this.a = null;
        this.b = 0;
        Disposable disposable = this.c;
        if (disposable != null) {
            disposable.dispose();
            this.c = null;
        }
        this.d = null;
    }
}

package com.huami.watch.companion.cloud;

import android.content.Context;
import com.huami.passport.AccountManager;
import com.huami.passport.ErrorCode;
import com.huami.passport.IAccount;
import com.huami.passport.entity.NextActions;
import com.huami.passport.entity.Token;
import com.huami.watch.util.Log;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class CloudUtil {
    private static final String a = "CloudUtil";
    private static ObservableEmitter<Context> b;

    public class a implements IAccount.Callback<Token, ErrorCode> {
        public final /* synthetic */ e a;
        public final /* synthetic */ AccountManager b;

        public a(e eVar, AccountManager accountManager) {
            this.a = eVar;
            this.b = accountManager;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(ErrorCode errorCode) {
            Log.d(CloudUtil.a, "Force RefreshToken Fail : " + errorCode, new Object[0]);
            e eVar = this.a;
            eVar.a = false;
            eVar.b = errorCode;
        }

        @Override // com.huami.passport.IAccount.Callback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Token token) {
            Log.d(CloudUtil.a, "Force RefreshToken Success : " + token, new Object[0]);
            e eVar = this.a;
            eVar.a = true;
            eVar.c = this.b.getToken();
        }
    }

    public class b implements Observer<e> {
        @Override // io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(e eVar) {
            List<NextActions> nextActions = eVar.a ? eVar.c.getNextActions() : eVar.b.getNextActions();
            CloudClient.ConfigCallback configCallback = CloudClient.sConfigCallback;
            if (configCallback != null) {
                configCallback.onNextActions(eVar.d, nextActions);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Log.w(CloudUtil.a, "ForceRefreshTokenErr", th, new Object[0]);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    public class c implements Function<Context, e> {
        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e apply(Context context) {
            e eVarB = CloudUtil.b(context);
            eVarB.d = context;
            return eVarB;
        }
    }

    public class d implements ObservableOnSubscribe<Context> {
        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Context> observableEmitter) {
            ObservableEmitter unused = CloudUtil.b = observableEmitter;
        }
    }

    public static class e {
        public boolean a = true;
        public ErrorCode b = new ErrorCode();
        public Token c = new Token();
        public Context d;
    }

    private CloudUtil() {
    }

    public static e b(Context context) {
        Log.d(a, "Force RefreshToken...", new Object[0]);
        e eVar = new e();
        AccountManager accountManager = AccountManager.getDefault(context);
        accountManager.syncRefreshToken(new a(eVar, accountManager));
        return eVar;
    }

    public static void forceRefreshTokenAsync(Context context) {
        if (b == null) {
            Observable.create(new d()).observeOn(Schedulers.io()).map(new c()).throttleFirst(10L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).safeSubscribe(new b());
        }
        ObservableEmitter<Context> observableEmitter = b;
        if (observableEmitter != null) {
            observableEmitter.onNext(context);
        }
    }
}

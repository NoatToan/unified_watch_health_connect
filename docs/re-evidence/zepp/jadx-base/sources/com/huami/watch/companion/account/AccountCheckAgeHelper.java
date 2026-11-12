package com.huami.watch.companion.account;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.huami.watch.companion.account.AccountCheckAgeHelper;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.util.Rx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes16.dex */
public class AccountCheckAgeHelper {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Activity activity, ObservableEmitter observableEmitter) throws Exception {
        SyncUtil.syncUserInfoToCloud(activity, UserInfoManager.get());
        observableEmitter.onNext(AccountApi.checkDisneyUserAge(activity));
    }

    public static void checkBindAge(final Activity activity, @NonNull Consumer<String> consumer) {
        Rx.io(new ObservableOnSubscribe() { // from class: d3
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                AccountCheckAgeHelper.b(activity, observableEmitter);
            }
        }).safeSubscribe(consumer);
    }
}

package com.xiaomi.hm.health.nfc;

import com.huami.account.XiaomiTokenMananger;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.passport.ErrorCode;
import com.xiaomi.hm.health.nfc.MiUserInfoKt;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"", "getMiId", "getMiToken", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class MiUserInfoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final FlowableEmitter flowableEmitter) {
        XiaomiTokenMananger.getAppXiaomiAccessToken(new XiaomiTokenMananger.OnGetTokenCallback() { // from class: com.xiaomi.hm.health.nfc.MiUserInfoKt$getMiToken$1$1
            @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
            public void empty() {
                flowableEmitter.onNext("");
                flowableEmitter.onComplete();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
            public void onError(@Nullable ErrorCode errorCode) {
                flowableEmitter.onNext("");
                flowableEmitter.onComplete();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
            public void onRefreshFaild(@Nullable String oldAccessToken) {
                flowableEmitter.onNext("");
                flowableEmitter.onComplete();
            }

            @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
            public void onSuccess(@Nullable String newAccessToken) {
                FlowableEmitter<String> flowableEmitter2 = flowableEmitter;
                if (newAccessToken == null) {
                    newAccessToken = "";
                }
                flowableEmitter2.onNext(newAccessToken);
                flowableEmitter.onComplete();
            }
        }, false);
    }

    @Nullable
    public static final String getMiId() {
        return HMAccountKeeper.INSTANCE.getXiaomiUserIdOrEmpty();
    }

    @Nullable
    public static final String getMiToken() {
        return (String) Flowable.create(new FlowableOnSubscribe() { // from class: z45
            @Override // io.reactivex.FlowableOnSubscribe
            public final void subscribe(FlowableEmitter flowableEmitter) {
                MiUserInfoKt.b(flowableEmitter);
            }
        }, BackpressureStrategy.LATEST).blockingFirst("");
    }
}

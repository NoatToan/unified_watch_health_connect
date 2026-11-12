package com.xiaomi.fitness.user.info.export.callback;

import com.google.android.gms.common.Scopes;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/user/info/export/callback/SendProfileCallBack;", "", "onSendSuccess", "", Scopes.PROFILE, "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "onSendError", "code", "", "onProfileToDBSuccess", "result", "", "user-info-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SendProfileCallBack {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onSendError(@NotNull SendProfileCallBack sendProfileCallBack, int i) {
        }
    }

    void onProfileToDBSuccess(boolean result);

    void onSendError();

    void onSendError(int code);

    void onSendSuccess(@Nullable UserProfile profile);
}

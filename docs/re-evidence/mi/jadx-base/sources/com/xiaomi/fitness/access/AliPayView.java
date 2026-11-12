package com.xiaomi.fitness.access;

import com.miui.tsmclient.net.TSMAuthContants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/access/AliPayView;", "", "", "showLoadingDialog", "()V", "hideLoadingDialog", "loadStatusError", "unBindError", "", "isBind", "setBind", "(Z)V", "", "erroMsgReid", "bindError", "(Ljava/lang/Integer;)V", "", TSMAuthContants.PARAM_AUTH_CODE, "userId", "showBindOtherDialog", "(Ljava/lang/String;Ljava/lang/String;)V", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface AliPayView {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void bindError$default(AliPayView aliPayView, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindError");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            aliPayView.bindError(num);
        }
    }

    void bindError(@Nullable Integer erroMsgReid);

    /* synthetic */ boolean cancelLoading();

    /* synthetic */ void goBack();

    void hideLoadingDialog();

    /* synthetic */ boolean isInValid();

    void loadStatusError();

    void setBind(boolean isBind);

    void showBindOtherDialog(@NotNull String authCode, @NotNull String userId);

    /* synthetic */ void showLoading();

    /* synthetic */ void showLoading(int i);

    /* synthetic */ void showLoading(boolean z);

    /* synthetic */ void showLoading(boolean z, int i);

    void showLoadingDialog();

    void unBindError();
}

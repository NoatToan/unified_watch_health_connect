package com.huami.account.ui.legal;

import android.os.Bundle;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.bean.LegalInfoType;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "使用 StartupLegalUnifyDialog 替换")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/account/ui/legal/UserAgreementStartUpFragment;", "Lcom/huami/account/ui/legal/BaseAgreementConfirmFragment;", "", "getAgreementUrl", "()Ljava/lang/String;", "agreementUrl", "<init>", "()V", "Companion", "OnDialogListener", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class UserAgreementStartUpFragment extends BaseAgreementConfirmFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String k = "paramLegalType";

    @NotNull
    private static final String l = "paramAreaCode";

    @NotNull
    private static final String m = "paramDelaySeconds";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/account/ui/legal/UserAgreementStartUpFragment$Companion;", "", "Lcom/huami/account/bean/LegalInfoType;", "legalType", "", "areaCode", "", "delaySeconds", "Lcom/huami/account/ui/legal/UserAgreementStartUpFragment;", "newInstance", "PARAM_AREA_CODE", "Ljava/lang/String;", "PARAM_DELAY_SECONDS", "PARAM_LEGAL_TYPE", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UserAgreementStartUpFragment newInstance(@NotNull LegalInfoType legalType, @NotNull String areaCode, int delaySeconds) {
            Bundle bundle = new Bundle();
            bundle.putString(UserAgreementStartUpFragment.l, areaCode);
            bundle.putSerializable(UserAgreementStartUpFragment.k, legalType);
            bundle.putInt(UserAgreementStartUpFragment.m, delaySeconds);
            UserAgreementStartUpFragment userAgreementStartUpFragment = new UserAgreementStartUpFragment();
            userAgreementStartUpFragment.setArguments(bundle);
            return userAgreementStartUpFragment;
        }
    }

    @Deprecated(message = "替换为 BaseAgreementConfirmFragment.OnDialogListener")
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/huami/account/ui/legal/UserAgreementStartUpFragment$OnDialogListener;", "Lcom/huami/account/ui/legal/BaseAgreementConfirmFragment$OnDialogListener;", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public interface OnDialogListener extends BaseAgreementConfirmFragment.OnDialogListener {
    }

    @Override // com.huami.account.ui.legal.BaseAgreementConfirmFragment
    @NotNull
    public String getAgreementUrl() {
        Object obj = requireArguments().get(k);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.huami.account.bean.LegalInfoType");
        Object obj2 = requireArguments().get(l);
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        return UserLegalInfoManager.getAgreementUrl((LegalInfoType) obj, (String) obj2);
    }
}

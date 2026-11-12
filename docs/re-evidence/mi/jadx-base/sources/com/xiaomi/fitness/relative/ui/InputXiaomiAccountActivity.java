package com.xiaomi.fitness.relative.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.TextView;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.server.model.AccountUserInfo;
import com.xiaomi.fitness.relative.ui.InputXiaomiAccountActivity;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import defpackage.t0j;
import defpackage.vsl;
import defpackage.xui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/InputXiaomiAccountActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Lvsl;", "", "checkValidityAndGoToConfirmUserInfoPage", "()V", "", "inviteeUidStr", "", "inviteeIsMyself", "(Ljava/lang/String;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "accountIdStr", "Ljava/lang/String;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class InputXiaomiAccountActivity extends Hilt_InputXiaomiAccountActivity<RelativeCareViewModel, vsl> {

    @NotNull
    public static final String TAG = "SendInvitationWithXiaomiAccountActivity";

    @Nullable
    private String accountIdStr;

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkValidityAndGoToConfirmUserInfoPage() {
        if (!NetUtil.INSTANCE.getNetWorkAvailable(this)) {
            ToastExtKt.toastShort(this, t0j.d0);
            return;
        }
        Editable text = ((vsl) getMBinding()).C.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        String string = StringsKt__StringsKt.trim(text).toString();
        if (StringsKt__StringsKt.isBlank(StringsKt__StringsKt.trim((CharSequence) string).toString()) || string.length() > 18 || inviteeIsMyself(string)) {
            ToastExtKt.toastShort(this, t0j.O);
            return;
        }
        final long j = Long.parseLong(string);
        Logger.i(TAG, "checkValidityAndGoToConfirmUserInfoPage uidLong=" + j);
        RelativeCareViewModel.getUserInfoByUid$default((RelativeCareViewModel) getMViewModel(), Long.valueOf(j), null, null, 6, null).observe(this, new InputXiaomiAccountActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ibd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputXiaomiAccountActivity.checkValidityAndGoToConfirmUserInfoPage$lambda$3(this.f20968a, j, (RelativeResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkValidityAndGoToConfirmUserInfoPage$lambda$3(InputXiaomiAccountActivity this$0, long j, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!relativeResult.isSuccess() || relativeResult.getData() == null) {
            ToastExtKt.toastShort(this$0, t0j.z0);
            Logger.i(TAG, "getInvitationResultLiveData failed. errorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
        } else {
            Logger.i(TAG, "getUserInfoByUid accountUserInfo=" + relativeResult.getData());
            Intent intent = new Intent(this$0, (Class<?>) ConfirmUserInfoActivity.class);
            intent.putExtra("key_relative_uid", j);
            Object data = relativeResult.getData();
            Intrinsics.checkNotNull(data);
            AccountUserInfo accountUserInfo = (AccountUserInfo) data;
            intent.putExtra(RelativeCareConstants.KEY_ACCOUNT_NICKNAME, accountUserInfo.getNickName());
            intent.putExtra(RelativeCareConstants.KEY_ACCOUNT_ICON, accountUserInfo.getIcon());
            this$0.startActivity(intent);
        }
        return Unit.INSTANCE;
    }

    private final boolean inviteeIsMyself(String inviteeUidStr) {
        return Intrinsics.areEqual(inviteeUidStr, this.accountIdStr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(InputXiaomiAccountActivity this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.accountIdStr = accountCoreInfo != null ? accountCoreInfo.getUserId() : null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(InputXiaomiAccountActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.checkValidityAndGoToConfirmUserInfoPage();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return xui.f39484r;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.relative.ui.Hilt_InputXiaomiAccountActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(t0j.L);
        ((RelativeCareViewModel) getMViewModel()).getMyUserInfoLiveData().observe(this, new InputXiaomiAccountActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jbd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputXiaomiAccountActivity.onCreate$lambda$0(this.f22616a, (AccountCoreInfo) obj);
            }
        }));
        ViewExtKt.clickWithTrigger$default(((vsl) getMBinding()).A, 0L, new Function1() { // from class: kbd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InputXiaomiAccountActivity.onCreate$lambda$1(this.f23682a, (TextView) obj);
            }
        }, 1, null);
    }
}

package com.xiaomi.fitness.relative.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.export.RelativeResult;
import com.xiaomi.fitness.relative.server.model.AccountUserInfo;
import com.xiaomi.fitness.relative.ui.ConfirmUserInfoActivity;
import com.xiaomi.fitness.relative.ui.model.RelativeCareInvitationApproach;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.relative.ui.util.RelativeCareUtil;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.t0j;
import defpackage.udk;
import defpackage.xui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\"\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/ConfirmUserInfoActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Ludk;", "", "loadUserInfo", "()V", "", "relativeIdFromLink", "accountUidStr", "", "invitationApproach", "", "checkIfMyselfAndToastIfNeed", "(Ljava/lang/String;Ljava/lang/String;I)Z", "checkIfQrCodeExpired", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "relativeUid", "J", "inviteLinkId", "qrCodeId", "isThirdPartyInvitation", "Z", "accountIdStr", "Ljava/lang/String;", "tokenExpired", "I", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ConfirmUserInfoActivity extends Hilt_ConfirmUserInfoActivity<RelativeCareViewModel, udk> {

    @NotNull
    public static final String TAG = "ConfirmUserInfoActivity";

    @Nullable
    private String accountIdStr;
    private int invitationApproach;
    private long inviteLinkId;
    private boolean isThirdPartyInvitation;
    private long qrCodeId;
    private long relativeUid;
    private boolean tokenExpired;

    private final boolean checkIfMyselfAndToastIfNeed(String relativeIdFromLink, String accountUidStr, @RelativeCareInvitationApproach int invitationApproach) {
        if (invitationApproach == 0 || !Intrinsics.areEqual(relativeIdFromLink, accountUidStr)) {
            return false;
        }
        if (invitationApproach == 1) {
            ToastExtKt.toastShort(this, t0j.M);
        } else if (invitationApproach == 2) {
            ToastExtKt.toastShort(this, t0j.N);
        }
        return true;
    }

    public static /* synthetic */ boolean checkIfMyselfAndToastIfNeed$default(ConfirmUserInfoActivity confirmUserInfoActivity, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return confirmUserInfoActivity.checkIfMyselfAndToastIfNeed(str, str2, i);
    }

    private final boolean checkIfQrCodeExpired() {
        if (!this.tokenExpired) {
            return false;
        }
        int i = this.invitationApproach;
        if (i == 2) {
            ToastExtKt.toastShort(this, t0j.i0);
        } else if (i == 1) {
            ToastExtKt.toastShort(this, t0j.Z);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, java.lang.String] */
    private final void loadUserInfo() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        if (this.qrCodeId != 0) {
            RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
            TextView noNetwork = ((udk) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(noNetwork, "noNetwork");
            ConstraintLayout content = ((udk) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            relativeCareUtil.handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetwork, content, new Function0() { // from class: td4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConfirmUserInfoActivity.loadUserInfo$lambda$3(this.f34585a, objectRef, objectRef2);
                }
            });
        } else if (this.inviteLinkId != 0) {
            this.invitationApproach = 1;
            RelativeCareUtil relativeCareUtil2 = RelativeCareUtil.INSTANCE;
            TextView noNetwork2 = ((udk) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(noNetwork2, "noNetwork");
            ConstraintLayout content2 = ((udk) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(content2, "content");
            relativeCareUtil2.handleUnavailableNetworkAndShowFallbackPageIfNeed(noNetwork2, content2, new Function0() { // from class: ud4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConfirmUserInfoActivity.loadUserInfo$lambda$5(this.f35648a, objectRef, objectRef2);
                }
            });
        } else if (this.relativeUid != 0) {
            this.invitationApproach = 0;
            ConstraintLayout content3 = ((udk) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(content3, "content");
            ViewExtKt.visible(content3);
            TextView noNetwork3 = ((udk) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(noNetwork3, "noNetwork");
            ViewExtKt.gone(noNetwork3);
            ((udk) getMBinding()).F.setText(getString(t0j.y0, String.valueOf(this.relativeUid)));
            objectRef.element = String.valueOf(getIntent().getStringExtra(RelativeCareConstants.KEY_ACCOUNT_NICKNAME));
            objectRef2.element = String.valueOf(getIntent().getStringExtra(RelativeCareConstants.KEY_ACCOUNT_ICON));
            ((udk) getMBinding()).E.setText((CharSequence) objectRef.element);
            RelativeCareUtil relativeCareUtil3 = RelativeCareUtil.INSTANCE;
            RoundImageView relativeAvatar = ((udk) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(relativeAvatar, "relativeAvatar");
            RelativeCareUtil.loadImageWithUrl$default(relativeCareUtil3, relativeAvatar, (String) objectRef2.element, 0, 4, null);
        }
        String stringExtra = getIntent().getStringExtra("origin");
        if (this.qrCodeId != 0 || this.inviteLinkId != 0 || Intrinsics.areEqual(stringExtra, "origin")) {
            this.isThirdPartyInvitation = true;
        } else if (this.relativeUid != 0) {
            this.isThirdPartyInvitation = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadUserInfo$lambda$3(final ConfirmUserInfoActivity this$0, final Ref.ObjectRef nickName, final Ref.ObjectRef iconUrl) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nickName, "$nickName");
        Intrinsics.checkNotNullParameter(iconUrl, "$iconUrl");
        this$0.invitationApproach = 2;
        RelativeCareViewModel.getUserInfoByUid$default((RelativeCareViewModel) this$0.getMViewModel(), null, null, Long.valueOf(this$0.qrCodeId), 3, null).observe(this$0, new ConfirmUserInfoActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sd4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConfirmUserInfoActivity.loadUserInfo$lambda$3$lambda$2(this.f33522a, nickName, iconUrl, (RelativeResult) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, java.lang.String] */
    public static final Unit loadUserInfo$lambda$3$lambda$2(ConfirmUserInfoActivity this$0, Ref.ObjectRef nickName, Ref.ObjectRef iconUrl, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nickName, "$nickName");
        Intrinsics.checkNotNullParameter(iconUrl, "$iconUrl");
        if (!relativeResult.isSuccess() || relativeResult.getData() == null) {
            if (relativeResult.getErrorCode() == -4002003) {
                ToastExtKt.toastShort(this$0, t0j.i0);
                this$0.tokenExpired = true;
            } else {
                ToastExtKt.toastShort(this$0, t0j.e0);
            }
            Logger.i(TAG, "getUserInfoByUid failed. errorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
        } else {
            Logger.d(TAG, "getUserInfoByUid succeed. accountUserInfo=" + relativeResult.getData());
            Object data = relativeResult.getData();
            Intrinsics.checkNotNull(data);
            long uid = ((AccountUserInfo) data).getUid();
            this$0.relativeUid = uid;
            this$0.checkIfMyselfAndToastIfNeed(String.valueOf(uid), this$0.accountIdStr, this$0.invitationApproach);
            Object data2 = relativeResult.getData();
            Intrinsics.checkNotNull(data2);
            nickName.element = ((AccountUserInfo) data2).getNickName();
            Object data3 = relativeResult.getData();
            Intrinsics.checkNotNull(data3);
            iconUrl.element = ((AccountUserInfo) data3).getIcon();
            ((udk) this$0.getMBinding()).E.setText((CharSequence) nickName.element);
            RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
            RoundImageView relativeAvatar = ((udk) this$0.getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(relativeAvatar, "relativeAvatar");
            RelativeCareUtil.loadImageWithUrl$default(relativeCareUtil, relativeAvatar, (String) iconUrl.element, 0, 4, null);
            ((udk) this$0.getMBinding()).F.setText(this$0.getString(t0j.y0, String.valueOf(this$0.relativeUid)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadUserInfo$lambda$5(final ConfirmUserInfoActivity this$0, final Ref.ObjectRef nickName, final Ref.ObjectRef iconUrl) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nickName, "$nickName");
        Intrinsics.checkNotNullParameter(iconUrl, "$iconUrl");
        RelativeCareViewModel.getUserInfoByUid$default((RelativeCareViewModel) this$0.getMViewModel(), null, Long.valueOf(this$0.inviteLinkId), null, 5, null).observe(this$0, new ConfirmUserInfoActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pd4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConfirmUserInfoActivity.loadUserInfo$lambda$5$lambda$4(this.f30282a, nickName, iconUrl, (RelativeResult) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, java.lang.String] */
    public static final Unit loadUserInfo$lambda$5$lambda$4(ConfirmUserInfoActivity this$0, Ref.ObjectRef nickName, Ref.ObjectRef iconUrl, RelativeResult relativeResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nickName, "$nickName");
        Intrinsics.checkNotNullParameter(iconUrl, "$iconUrl");
        if (!relativeResult.isSuccess() || relativeResult.getData() == null) {
            if (relativeResult.getErrorCode() == -4002003) {
                ToastExtKt.toastShort(this$0, t0j.Z);
                this$0.tokenExpired = true;
            } else {
                ToastExtKt.toastShort(this$0, t0j.e0);
            }
            Logger.i(TAG, "getUserInfoByUid failed. errorCode=" + relativeResult.getErrorCode() + " errorMsg=" + relativeResult.getErrorMsg());
        } else {
            Object data = relativeResult.getData();
            Intrinsics.checkNotNull(data);
            long uid = ((AccountUserInfo) data).getUid();
            this$0.relativeUid = uid;
            this$0.checkIfMyselfAndToastIfNeed(String.valueOf(uid), this$0.accountIdStr, this$0.invitationApproach);
            Object data2 = relativeResult.getData();
            Intrinsics.checkNotNull(data2);
            nickName.element = ((AccountUserInfo) data2).getNickName();
            Object data3 = relativeResult.getData();
            Intrinsics.checkNotNull(data3);
            iconUrl.element = ((AccountUserInfo) data3).getIcon();
            ((udk) this$0.getMBinding()).E.setText((CharSequence) nickName.element);
            RelativeCareUtil relativeCareUtil = RelativeCareUtil.INSTANCE;
            RoundImageView relativeAvatar = ((udk) this$0.getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(relativeAvatar, "relativeAvatar");
            RelativeCareUtil.loadImageWithUrl$default(relativeCareUtil, relativeAvatar, (String) iconUrl.element, 0, 4, null);
            ((udk) this$0.getMBinding()).F.setText(this$0.getString(t0j.y0, String.valueOf(this$0.relativeUid)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(ConfirmUserInfoActivity this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.accountIdStr = accountCoreInfo != null ? accountCoreInfo.getUserId() : null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(ConfirmUserInfoActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!this$0.checkIfMyselfAndToastIfNeed(String.valueOf(this$0.relativeUid), this$0.accountIdStr, this$0.invitationApproach) && !this$0.checkIfQrCodeExpired()) {
            Intent intent = new Intent(this$0, (Class<?>) DataAccessibleToTAActivity.class);
            intent.putExtra("key_relative_uid", this$0.relativeUid);
            intent.putExtra(RelativeCareConstants.KEY_INVITE_LINK_ID, this$0.inviteLinkId);
            intent.putExtra(RelativeCareConstants.KEY_IS_THIRD_PARTY_INVITATION, this$0.isThirdPartyInvitation);
            this$0.startActivity(intent);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return xui.f39481a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.relative.ui.Hilt_ConfirmUserInfoActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(t0j.s);
        this.relativeUid = getIntent().getLongExtra("key_relative_uid", 0L);
        this.inviteLinkId = getIntent().getLongExtra(RelativeCareConstants.KEY_INVITE_LINK_ID, 0L);
        long longExtra = getIntent().getLongExtra(RelativeCareConstants.KEY_QR_CODE_ID, 0L);
        this.qrCodeId = longExtra;
        Logger.i(TAG, "relativeUid=" + this.relativeUid + " inviteLinkId=" + this.inviteLinkId + " qrCodeId=" + longExtra);
        loadUserInfo();
        ((RelativeCareViewModel) getMViewModel()).getMyUserInfoLiveData().observe(this, new ConfirmUserInfoActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qd4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConfirmUserInfoActivity.onCreate$lambda$0(this.f31403a, (AccountCoreInfo) obj);
            }
        }));
        ViewExtKt.clickWithTrigger$default(((udk) getMBinding()).A, 0L, new Function1() { // from class: rd4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ConfirmUserInfoActivity.onCreate$lambda$1(this.f32432a, (TextView) obj);
            }
        }, 1, null);
    }
}

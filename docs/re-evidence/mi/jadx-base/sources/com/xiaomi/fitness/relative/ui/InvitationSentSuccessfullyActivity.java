package com.xiaomi.fitness.relative.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.relative.ui.InvitationSentSuccessfullyActivity;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import defpackage.aoi;
import defpackage.nfk;
import defpackage.t0j;
import defpackage.wc0;
import defpackage.xui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/InvitationSentSuccessfullyActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/relative/ui/RelativeCareViewModel;", "Lnfk;", "", "goBackToHomePage", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "", "isThirdPartyInvitation", "Z", "", "origin", "Ljava/lang/String;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class InvitationSentSuccessfullyActivity extends BaseBindingActivity<RelativeCareViewModel, nfk> {

    @NotNull
    public static final String ORIGIN_ACCOUNT_APP = "account";

    @NotNull
    public static final String TAG = "InvitationSentSuccessfullyActivity";
    private boolean isThirdPartyInvitation;

    @Nullable
    private String origin;

    private final void goBackToHomePage() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(RelativeCareConstants.KEY_IS_THIRD_PARTY_INVITATION, this.isThirdPartyInvitation);
        RelativeCareHomePageActivity.INSTANCE.goToAddRelativePageWithClearTopFlagOrNewTask(this, 2, bundle);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(InvitationSentSuccessfullyActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(InvitationSentSuccessfullyActivity this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(this$0.origin, "account")) {
            this$0.isThirdPartyInvitation = true;
        }
        this$0.lambda$onCreate$0();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return xui.i;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        if (Intrinsics.areEqual(this.origin, "account")) {
            super.lambda$onCreate$0();
        } else {
            goBackToHomePage();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(t0j.S);
        String stringExtra = getIntent().getStringExtra("origin");
        this.origin = stringExtra;
        Logger.d(TAG, "origin=" + stringExtra);
        this.isThirdPartyInvitation = getIntent().getBooleanExtra(RelativeCareConstants.KEY_IS_THIRD_PARTY_INVITATION, false);
        getMBinding().B.setText(t0j.R);
        if (Intrinsics.areEqual(this.origin, "account")) {
            TextView wayOfApproving = getMBinding().C;
            Intrinsics.checkNotNullExpressionValue(wayOfApproving, "wayOfApproving");
            ViewExtKt.visible(wayOfApproving);
        } else {
            TextView wayOfApproving2 = getMBinding().C;
            Intrinsics.checkNotNullExpressionValue(wayOfApproving2, "wayOfApproving");
            ViewExtKt.gone(wayOfApproving2);
        }
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setDisplayHomeAsUpEnabled(false);
        }
        IActionBar.DefaultImpls.setStartView$default(this, 0, aoi.f3300b, getString(t0j.f34173a), new View.OnClickListener() { // from class: lhd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InvitationSentSuccessfullyActivity.onCreate$lambda$0(this.f25075a, view);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(getMBinding().A, 0L, new Function1() { // from class: mhd
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return InvitationSentSuccessfullyActivity.onCreate$lambda$1(this.f26182a, (TextView) obj);
            }
        }, 1, null);
    }
}

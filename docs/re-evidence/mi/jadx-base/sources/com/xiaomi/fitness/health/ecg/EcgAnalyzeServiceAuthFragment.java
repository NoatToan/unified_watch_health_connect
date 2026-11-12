package com.xiaomi.fitness.health.ecg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.ecg.EcgAnalyzeServiceAuthFragment;
import com.xiaomi.fitness.health.ecg.util.EcgTrackHelper;
import defpackage.c0j;
import defpackage.jui;
import defpackage.mub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgAnalyzeServiceAuthFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Lmub;", "", "initView", "()V", "dealAgreeAction", "dealDisagreeAction", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcgAnalyzeServiceAuthFragment extends Hilt_EcgAnalyzeServiceAuthFragment<EcgViewModel, mub> {

    @NotNull
    public static final String KEY_APP_AGREEMENT_ACCEPTED = "agreement_accepted";
    public static final int RESULT_CODE_APP_AUTH = 123;

    public EcgAnalyzeServiceAuthFragment() {
        super(jui.x3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void dealAgreeAction() {
        ((EcgViewModel) getMViewModel()).setEcgPrivacyLivaData().observe(getViewLifecycleOwner(), new EcgAnalyzeServiceAuthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ma7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EcgAnalyzeServiceAuthFragment.dealAgreeAction$lambda$2(this.f25940a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dealAgreeAction$lambda$2(EcgAnalyzeServiceAuthFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra(KEY_APP_AGREEMENT_ACCEPTED, true);
            this$0.requireActivity().setResult(123, intent);
            this$0.finish();
        } else {
            ToastUtil.showShortToast(c0j.common_network_error_retry_later);
        }
        return Unit.INSTANCE;
    }

    private final void dealDisagreeAction() {
        Logger.i(BaseFragment.TAG, "dealDisagreeAction triggered.");
        Intent intent = new Intent();
        intent.putExtra(KEY_APP_AGREEMENT_ACCEPTED, false);
        requireActivity().setResult(123, intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((mub) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: na7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgAnalyzeServiceAuthFragment.initView$lambda$0(this.f27706a, view);
            }
        });
        ((mub) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: oa7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgAnalyzeServiceAuthFragment.initView$lambda$1(this.f28917a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(EcgAnalyzeServiceAuthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(BaseFragment.TAG, "tvAgree clicked");
        this$0.dealAgreeAction();
        EcgTrackHelper.INSTANCE.trackAppAuthorizeResult(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(EcgAnalyzeServiceAuthFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(BaseFragment.TAG, "tvDisagree clicked");
        this$0.dealDisagreeAction();
        EcgTrackHelper.INSTANCE.trackAppAuthorizeResult(false);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        Logger.i(BaseFragment.TAG, "onBackPressed running");
        dealDisagreeAction();
        return super.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.pa);
        initView();
    }
}

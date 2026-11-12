package com.xiaomi.fitness.nfc.ui.issued;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CardReturnResultFragment;
import defpackage.bog;
import defpackage.ld8;
import defpackage.o0j;
import defpackage.pli;
import defpackage.rji;
import defpackage.sui;
import defpackage.wni;
import defpackage.yl3;
import defpackage.zl3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0015\u0010\u0006J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnResultFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnNoticeViewModel;", "Lbog;", "", "onSuccess", "()V", "onFailed", "", "isNeedCardInfo", "()Z", "Landroid/os/Bundle;", "args", "setArguments", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "exeSuccess", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "mIsSuccess", "Z", "", "mMsg", "Ljava/lang/String;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardReturnResultFragment extends BaseCardFragment<CardReturnNoticeViewModel, bog> {
    private boolean mIsSuccess;

    @Nullable
    private String mMsg;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String KEY_IS_SUCCESS = "is_success";

    @NotNull
    private static final String KEY_HINT_MSG = Constants.EXTRA_RESULT_MSG;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnResultFragment$Companion;", "", "<init>", "()V", "KEY_IS_SUCCESS", "", "getKEY_IS_SUCCESS", "()Ljava/lang/String;", "KEY_HINT_MSG", "getKEY_HINT_MSG", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getKEY_HINT_MSG() {
            return CardReturnResultFragment.KEY_HINT_MSG;
        }

        @NotNull
        public final String getKEY_IS_SUCCESS() {
            return CardReturnResultFragment.KEY_IS_SUCCESS;
        }
    }

    public CardReturnResultFragment() {
        super(sui.F, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onFailed() {
        ((bog) getMBinding()).C.setImageResource(wni.f38163k);
        ((bog) getMBinding()).F.setTextColor(getResources().getColor(rji.i));
        ((bog) getMBinding()).F.setText(o0j.g6);
        ((bog) getMBinding()).B.setText(this.mMsg);
        ((bog) getMBinding()).E.setText(o0j.z2);
        ((bog) getMBinding()).E.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSuccess() {
        ((bog) getMBinding()).C.setImageResource(wni.l);
        ((bog) getMBinding()).F.setTextColor(getResources().getColor(rji.h));
        ((bog) getMBinding()).F.setText(o0j.a6);
        ((bog) getMBinding()).B.setText(this.mMsg);
        ((bog) getMBinding()).A.setVisibility(8);
        ((bog) getMBinding()).E.setText(o0j.common_complete);
        exeSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(CardReturnResultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.setResult(0);
        }
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(CardReturnResultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mIsSuccess) {
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                mActivity.setResult(0);
            }
            this$0.finish();
            return;
        }
        FragmentActivity mActivity2 = this$0.getMActivity();
        if (mActivity2 != null) {
            mActivity2.setResult(1);
        }
        this$0.finish();
    }

    public final void exeSuccess() {
        zl3 zl3VarG = zl3.g();
        zl3VarG.d.remove(getCardWrapper());
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper != null) {
            cardWrapper.mHasIssue = false;
        }
        zl3VarG.d.add(getCardWrapper());
        zl3VarG.e.remove(getCardWrapper());
        zl3VarG.r();
        ld8.c().l(new yl3(getCardWrapper(), false));
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((bog) getMBinding()).D.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.c6);
        if (this.mIsSuccess) {
            onSuccess();
        } else {
            onFailed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);
        if (args != null) {
            this.mIsSuccess = args.getBoolean(KEY_IS_SUCCESS, false);
            this.mMsg = args.getString(KEY_HINT_MSG);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((bog) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: mr3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardReturnResultFragment.setListener$lambda$0(this.f27118a, view);
            }
        });
        ((bog) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: nr3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardReturnResultFragment.setListener$lambda$1(this.f28279a, view);
            }
        });
    }
}

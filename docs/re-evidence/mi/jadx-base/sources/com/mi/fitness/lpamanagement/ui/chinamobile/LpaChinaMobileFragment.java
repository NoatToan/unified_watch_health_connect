package com.mi.fitness.lpamanagement.ui.chinamobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.mi.fitness.lpamanagement.ui.chinamobile.LpaChinaMobileFragment;
import com.mi.fitness.lpamanagement.ui.webview.LpaWebviewActivity;
import com.mi.fitness.lpamanagement.util.CarrierEntryUtil;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.azi;
import defpackage.dih;
import defpackage.h9a;
import defpackage.pti;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/chinamobile/LpaChinaMobileFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/lpamanagement/ui/chinamobile/LpaChinaMobileViewModel;", "Lh9a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LpaChinaMobileFragment extends BaseBindingFragment<LpaChinaMobileViewModel, h9a> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(LpaChinaMobileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(azi.l);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = "https://watch.iot.mi.com/html/esim/index.html?locale=" + LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null) + "#/cm_dual.md";
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) LpaWebviewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, string);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra("URL", str);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(LpaChinaMobileFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dih.a().e(this$0.getContext(), new FragmentParams.b().e(LpaChinaMobileProvisionFragment.class).c(new Bundle()).b());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pti.f30758b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(azi.h);
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: bue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LpaChinaMobileFragment.onViewCreated$lambda$1(this.f4614a, view2);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: cue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LpaChinaMobileFragment.onViewCreated$lambda$2(this.f14723a, view2);
            }
        });
        CarrierEntryUtil carrierEntryUtil = CarrierEntryUtil.INSTANCE;
        if (carrierEntryUtil.isSupportCmInd()) {
            RightArrowTwoLineTextView individual = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(individual, "individual");
            ViewExtKt.visible(individual);
        } else {
            RightArrowTwoLineTextView individual2 = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(individual2, "individual");
            ViewExtKt.gone(individual2);
        }
        if (carrierEntryUtil.isSupportCmDual()) {
            RightArrowTwoLineTextView doubleTerminal = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(doubleTerminal, "doubleTerminal");
            ViewExtKt.visible(doubleTerminal);
        } else {
            RightArrowTwoLineTextView doubleTerminal2 = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(doubleTerminal2, "doubleTerminal");
            ViewExtKt.gone(doubleTerminal2);
        }
    }
}

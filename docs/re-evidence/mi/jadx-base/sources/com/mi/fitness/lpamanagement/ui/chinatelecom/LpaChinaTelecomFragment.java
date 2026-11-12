package com.mi.fitness.lpamanagement.ui.chinatelecom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.mi.fitness.lpamanagement.ui.chinatelecom.LpaChinaTelecomFragment;
import com.mi.fitness.lpamanagement.ui.webview.LpaWebviewActivity;
import com.mi.fitness.lpamanagement.util.CarrierEntryUtil;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import defpackage.azi;
import defpackage.j9a;
import defpackage.pti;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/chinatelecom/LpaChinaTelecomFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/lpamanagement/ui/chinatelecom/LpaChinaTelecomViewModel;", "Lj9a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "", "getLayoutId", "()I", "layoutId", "<init>", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LpaChinaTelecomFragment extends BaseBindingFragment<LpaChinaTelecomViewModel, j9a> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$1(LpaChinaTelecomFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(azi.n);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = "https://watch.iot.mi.com/html/esim/index.html?locale=" + LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null) + "#/ct_ind.md";
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) LpaWebviewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, string);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra("URL", str);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(LpaChinaTelecomFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(azi.l);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = "https://watch.iot.mi.com/html/esim/index.html?locale=" + LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null) + "#/ct_dual.md";
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) LpaWebviewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, string);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra("URL", str);
        this$0.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pti.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(azi.i);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: fue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaChinaTelecomFragment.setListener$lambda$1(this.f18249a, view);
            }
        });
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: gue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaChinaTelecomFragment.setListener$lambda$3(this.f19338a, view);
            }
        });
        CarrierEntryUtil carrierEntryUtil = CarrierEntryUtil.INSTANCE;
        if (carrierEntryUtil.isSupportCtDual()) {
            RightArrowTwoLineTextView doubleTerminal = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(doubleTerminal, "doubleTerminal");
            ViewExtKt.visible(doubleTerminal);
        } else {
            RightArrowTwoLineTextView doubleTerminal2 = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(doubleTerminal2, "doubleTerminal");
            ViewExtKt.gone(doubleTerminal2);
        }
        if (carrierEntryUtil.isSupportCtInd()) {
            RightArrowTwoLineTextView individual = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(individual, "individual");
            ViewExtKt.visible(individual);
        } else {
            RightArrowTwoLineTextView individual2 = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(individual2, "individual");
            ViewExtKt.gone(individual2);
        }
    }
}

package com.mi.fitness.lpamanagement.ui.chinaunicon.provision;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.mi.fitness.lpamanagement.ui.chinaunicon.provision.LpaChinaUniconProvisionFragment;
import com.mi.fitness.lpamanagement.ui.chinaunicon.provision.wechat.LpaCUWechatFragment;
import com.mi.fitness.lpamanagement.ui.webview.LpaWebviewActivity;
import com.mi.fitness.lpamanagement.util.CarrierEntryUtil;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.azi;
import defpackage.dih;
import defpackage.pti;
import defpackage.r9a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/mi/fitness/lpamanagement/ui/chinaunicon/provision/LpaChinaUniconProvisionFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/mi/fitness/lpamanagement/ui/chinaunicon/provision/LpaChinaUniconProvisionViewModel;", "Lr9a;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "", "isIndividual", "Z", "()Z", "setIndividual", "(Z)V", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "lpa-management_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LpaChinaUniconProvisionFragment extends BaseBindingFragment<LpaChinaUniconProvisionViewModel, r9a> {

    @NotNull
    public static final String KEY_PROVISION_IS_INDIVIDUAL = "key_provision_is_individual";
    private boolean isIndividual;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$0(LpaChinaUniconProvisionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dih.a().e(this$0.getContext(), new FragmentParams.b().e(LpaCUWechatFragment.class).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(LpaChinaUniconProvisionFragment this$0, View view) {
        StringBuilder sb;
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(this$0.isIndividual ? azi.n : azi.l);
        Intrinsics.checkNotNull(string);
        if (this$0.isIndividual) {
            String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
            sb = new StringBuilder();
            sb.append("https://watch.iot.mi.com/html/esim/index.html?locale=");
            sb.append(currentLocale$default);
            str = "#/cu_ind_android.md";
        } else {
            String currentLocale$default2 = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
            sb = new StringBuilder();
            sb.append("https://watch.iot.mi.com/html/esim/index.html?locale=");
            sb.append(currentLocale$default2);
            str = "#/cu_dual_android.md";
        }
        sb.append(str);
        String string2 = sb.toString();
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) LpaWebviewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, string);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra("URL", string2);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(LpaChinaUniconProvisionFragment this$0, View view) {
        StringBuilder sb;
        String str;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String string = this$0.getString(this$0.isIndividual ? azi.n : azi.l);
        Intrinsics.checkNotNull(string);
        if (this$0.isIndividual) {
            String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
            sb = new StringBuilder();
            sb.append("https://watch.iot.mi.com/html/esim/index.html?locale=");
            sb.append(currentLocale$default);
            str = "#/cu_ind_hall.md";
        } else {
            String currentLocale$default2 = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
            sb = new StringBuilder();
            sb.append("https://watch.iot.mi.com/html/esim/index.html?locale=");
            sb.append(currentLocale$default2);
            str = "#/cu_dual_hall.md";
        }
        sb.append(str);
        String string2 = sb.toString();
        Intent intent = new Intent(ApplicationExtKt.getApplication(), (Class<?>) LpaWebviewActivity.class);
        intent.putExtra(WebViewActivity.TITLE, string);
        intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, true);
        intent.putExtra("URL", string2);
        this$0.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pti.g;
    }

    /* JADX INFO: renamed from: isIndividual, reason: from getter */
    public final boolean getIsIndividual() {
        return this.isIndividual;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.isIndividual = arguments != null ? arguments.getBoolean(KEY_PROVISION_IS_INDIVIDUAL, false) : false;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.isIndividual) {
            setTitle(azi.n);
        } else {
            setTitle(azi.l);
        }
    }

    public final void setIndividual(boolean z) {
        this.isIndividual = z;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: jue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaChinaUniconProvisionFragment.setListener$lambda$0(this.f23139a, view);
            }
        });
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: kue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaChinaUniconProvisionFragment.setListener$lambda$2(this.f24301a, view);
            }
        });
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: lue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LpaChinaUniconProvisionFragment.setListener$lambda$4(this.f25440a, view);
            }
        });
        if (this.isIndividual) {
            CarrierEntryUtil carrierEntryUtil = CarrierEntryUtil.INSTANCE;
            if (carrierEntryUtil.isSupportCuIndApp()) {
                RightArrowSingleLineTextView cuProvisionMethodApp = getMBinding().A;
                Intrinsics.checkNotNullExpressionValue(cuProvisionMethodApp, "cuProvisionMethodApp");
                ViewExtKt.visible(cuProvisionMethodApp);
            } else {
                RightArrowSingleLineTextView cuProvisionMethodApp2 = getMBinding().A;
                Intrinsics.checkNotNullExpressionValue(cuProvisionMethodApp2, "cuProvisionMethodApp");
                ViewExtKt.gone(cuProvisionMethodApp2);
            }
            if (carrierEntryUtil.isSupportCuIndScan()) {
                RightArrowSingleLineTextView cuProvisionMethodQrcode = getMBinding().B;
                Intrinsics.checkNotNullExpressionValue(cuProvisionMethodQrcode, "cuProvisionMethodQrcode");
                ViewExtKt.visible(cuProvisionMethodQrcode);
                return;
            } else {
                RightArrowSingleLineTextView cuProvisionMethodQrcode2 = getMBinding().B;
                Intrinsics.checkNotNullExpressionValue(cuProvisionMethodQrcode2, "cuProvisionMethodQrcode");
                ViewExtKt.gone(cuProvisionMethodQrcode2);
                return;
            }
        }
        CarrierEntryUtil carrierEntryUtil2 = CarrierEntryUtil.INSTANCE;
        if (carrierEntryUtil2.isSupportCuDualApp()) {
            RightArrowSingleLineTextView cuProvisionMethodApp3 = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(cuProvisionMethodApp3, "cuProvisionMethodApp");
            ViewExtKt.visible(cuProvisionMethodApp3);
        } else {
            RightArrowSingleLineTextView cuProvisionMethodApp4 = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(cuProvisionMethodApp4, "cuProvisionMethodApp");
            ViewExtKt.gone(cuProvisionMethodApp4);
        }
        if (carrierEntryUtil2.isSupportCuDualScan()) {
            RightArrowSingleLineTextView cuProvisionMethodQrcode3 = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(cuProvisionMethodQrcode3, "cuProvisionMethodQrcode");
            ViewExtKt.visible(cuProvisionMethodQrcode3);
        } else {
            RightArrowSingleLineTextView cuProvisionMethodQrcode4 = getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(cuProvisionMethodQrcode4, "cuProvisionMethodQrcode");
            ViewExtKt.gone(cuProvisionMethodQrcode4);
        }
    }
}

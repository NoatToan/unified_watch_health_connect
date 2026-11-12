package com.xiaomi.fitness.pay.order;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.pay.order.PaymentOrderOtherFragment;
import defpackage.tnh;
import defpackage.uui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderOtherFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListViewModel;", "Ltnh;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PaymentOrderOtherFragment extends BaseBindingFragment<PaymentOrderPageListViewModel, tnh> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(View view, View it) {
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(it, "it");
        IHealthPage healthPageExtKt = HealthPageExtKt.getInstance(IHealthPage.INSTANCE);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        healthPageExtKt.goToHealthVisitDoctorPage(context, 6);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return uui.j;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TabFragmentUtilKt.setUpBasicUi(this);
        ViewExtKt.clickWithTrigger$default(getMBinding().A.getRoot(), 0L, new Function1() { // from class: kph
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaymentOrderOtherFragment.onViewCreated$lambda$0(view, (View) obj);
            }
        }, 1, null);
    }
}

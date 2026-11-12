package com.xiaomi.fitness.nfc.ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.CouponFragment;
import defpackage.gak;
import defpackage.o0j;
import defpackage.pli;
import defpackage.pog;
import defpackage.sui;
import defpackage.x4n;
import defpackage.zl3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\"\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0007J\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CouponFragment;", "Lcom/xiaomi/fitness/nfc/ui/BaseRechargeFragment;", "Lcom/xiaomi/fitness/nfc/ui/CouponViewModel;", "Lpog;", "Lcom/xiaomi/fitness/nfc/ui/j$b;", "", "resetEmptyView", "()V", "", "isEmpty", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "setListener", "Lcom/miui/tsmclient/sesdk/OrderData$Coupon;", "couponInfo", "onItemClick", "(Lcom/miui/tsmclient/sesdk/OrderData$Coupon;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/nfc/ui/j;", "couponListAdapter", "Lcom/xiaomi/fitness/nfc/ui/j;", "getCouponListAdapter", "()Lcom/xiaomi/fitness/nfc/ui/j;", "setCouponListAdapter", "(Lcom/xiaomi/fitness/nfc/ui/j;)V", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CouponFragment extends BaseRechargeFragment<CouponViewModel, pog> implements j.b {

    @Nullable
    private j couponListAdapter;

    public CouponFragment() {
        super(sui.M, 0, true);
    }

    private final boolean isEmpty() {
        return zl3.g().f41419b == null || zl3.g().f41419b.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$1(CouponFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zl3.g().f41419b.clear();
        if (list != null) {
            zl3.g().f41419b.addAll(list);
        }
        j jVar = this$0.couponListAdapter;
        if (jVar != null) {
            jVar.l(list);
        }
        this$0.resetEmptyView();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$2(CouponFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.INSTANCE.showToast(o0j.common_load_fail);
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetEmptyView() {
        if (isEmpty()) {
            ((pog) getMBinding()).E.setVisibility(8);
            ((pog) getMBinding()).A.setVisibility(8);
            ((pog) getMBinding()).B.setVisibility(0);
        } else {
            ((pog) getMBinding()).E.setVisibility(0);
            ((pog) getMBinding()).A.setVisibility(0);
            ((pog) getMBinding()).B.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(CouponFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            mActivity.finish();
        }
    }

    @Nullable
    public final j getCouponListAdapter() {
        return this.couponListAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        CouponViewModel couponViewModel = (CouponViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        couponViewModel.queryCoupons(cardWrapper, new Function1() { // from class: cm4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CouponFragment.loadData$lambda$1(this.f5477a, (List) obj);
            }
        }, new Function0() { // from class: dm4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CouponFragment.loadData$lambda$2(this.f15678a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.p);
        ((pog) getMBinding()).D.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // com.xiaomi.fitness.nfc.ui.j.b
    public void onItemClick(@Nullable OrderData.Coupon couponInfo) {
        OrderData.Coupon coupon = zl3.g().f41418a;
        if (coupon == null || couponInfo == null || coupon.getCouponId() != couponInfo.getCouponId()) {
            zl3.g().f41418a = couponInfo;
        } else {
            zl3.g().f41418a = null;
        }
        j jVar = this.couponListAdapter;
        if (jVar != null) {
            jVar.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.N4);
        ((pog) getMBinding()).E.setLayoutManager(new LinearLayoutManager(getMActivity()));
        ((pog) getMBinding()).E.addItemDecoration(new gak(DisplayUtil.dip2px(0.0f), DisplayUtil.dip2px(5.0f), false));
        j jVar = new j(getMActivity());
        this.couponListAdapter = jVar;
        jVar.setListener(this);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        ((pog) getMBinding()).E.addItemDecoration(new x4n(mActivity.getResources().getDimensionPixelSize(pli.g)));
        ((pog) getMBinding()).E.setAdapter(this.couponListAdapter);
        resetEmptyView();
    }

    public final void setCouponListAdapter(@Nullable j jVar) {
        this.couponListAdapter = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((pog) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: em4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CouponFragment.setListener$lambda$3(this.f16800a, view);
            }
        });
    }
}

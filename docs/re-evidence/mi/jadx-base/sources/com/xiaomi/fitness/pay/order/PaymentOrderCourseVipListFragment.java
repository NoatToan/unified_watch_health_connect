package com.xiaomi.fitness.pay.order;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.OrderInfo;
import com.xiaomi.fitness.pay.order.PaymentOrderCourseVipListFragment;
import com.xiaomi.fitness.pay.order.PaymentOrderPageListViewModel;
import defpackage.pnh;
import defpackage.r0j;
import defpackage.uui;
import defpackage.yni;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b$\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\nR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseVipListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListViewModel;", "Lpnh;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListViewModel$OrderPageData;", "data", "", "onDataOK", "(Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListViewModel$OrderPageData;)V", "onError", "()V", "onNoNet", "", "index", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", TSMAuthContants.PARAM_ORDER_INFO, "onOrderClick", "(ILcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", "onOrderToPay", "(Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", "orderInfoList", "Ljava/util/List;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseListAdapter;", "mAdapter", "Lcom/xiaomi/fitness/pay/order/PaymentOrderCourseListAdapter;", "getLayoutId", "()I", "layoutId", "<init>", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PaymentOrderCourseVipListFragment extends Hilt_PaymentOrderCourseVipListFragment<PaymentOrderPageListViewModel, pnh> {
    private PaymentOrderCourseListAdapter mAdapter;

    @NotNull
    private final List<OrderInfo> orderInfoList = new ArrayList();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateData.Status.values().length];
            try {
                iArr[StateData.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateData.Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateData.Status.NO_NET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.order.PaymentOrderCourseVipListFragment$onViewCreated$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Integer, OrderInfo, Unit> {
        public AnonymousClass1(Object obj) {
            super(2, obj, PaymentOrderCourseVipListFragment.class, "onOrderClick", "onOrderClick(ILcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, OrderInfo orderInfo) {
            invoke(num.intValue(), orderInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, OrderInfo p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((PaymentOrderCourseVipListFragment) this.receiver).onOrderClick(i, p1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.order.PaymentOrderCourseVipListFragment$onViewCreated$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<OrderInfo, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, PaymentOrderCourseVipListFragment.class, "onOrderToPay", "onOrderToPay(Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(OrderInfo orderInfo) {
            invoke2(orderInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OrderInfo p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PaymentOrderCourseVipListFragment) this.receiver).onOrderToPay(p0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ PaymentOrderPageListViewModel access$getMViewModel(PaymentOrderCourseVipListFragment paymentOrderCourseVipListFragment) {
        return (PaymentOrderPageListViewModel) paymentOrderCourseVipListFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOK(PaymentOrderPageListViewModel.OrderPageData data) {
        PaymentOrderCourseListAdapter paymentOrderCourseListAdapter = null;
        MoreRecyclerView.setStatus$default(((pnh) getMBinding()).A, data.getHasNext() ? Status.MORE : Status.DONE, false, 2, null);
        if (data.getRefresh()) {
            this.orderInfoList.clear();
        }
        List<OrderInfo> list = data.getList();
        if (list == null || list.isEmpty()) {
            if (data.getRefresh()) {
                MoreRecyclerView rcvPayCourse = ((pnh) getMBinding()).A;
                Intrinsics.checkNotNullExpressionValue(rcvPayCourse, "rcvPayCourse");
                ViewExtKt.gone(rcvPayCourse);
                TextView stateView = ((pnh) getMBinding()).B;
                Intrinsics.checkNotNullExpressionValue(stateView, "stateView");
                ViewExtKt.visible(stateView);
                ((pnh) getMBinding()).B.setText(getString(r0j.common_data_empty));
                ((pnh) getMBinding()).B.setCompoundDrawablesWithIntrinsicBounds(0, yni.c, 0, 0);
                return;
            }
            return;
        }
        MoreRecyclerView rcvPayCourse2 = ((pnh) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(rcvPayCourse2, "rcvPayCourse");
        ViewExtKt.visible(rcvPayCourse2);
        TextView stateView2 = ((pnh) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(stateView2, "stateView");
        ViewExtKt.gone(stateView2);
        this.orderInfoList.addAll(data.getList());
        PaymentOrderCourseListAdapter paymentOrderCourseListAdapter2 = this.mAdapter;
        if (paymentOrderCourseListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            paymentOrderCourseListAdapter = paymentOrderCourseListAdapter2;
        }
        paymentOrderCourseListAdapter.submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) this.orderInfoList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onError() {
        MoreRecyclerView rcvPayCourse = ((pnh) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(rcvPayCourse, "rcvPayCourse");
        ViewExtKt.gone(rcvPayCourse);
        TextView stateView = ((pnh) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(stateView, "stateView");
        ViewExtKt.visible(stateView);
        ((pnh) getMBinding()).B.setText(getString(r0j.common_hint_unkonwn_error));
        ((pnh) getMBinding()).B.setCompoundDrawablesWithIntrinsicBounds(0, yni.c, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNoNet() {
        MoreRecyclerView rcvPayCourse = ((pnh) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(rcvPayCourse, "rcvPayCourse");
        ViewExtKt.gone(rcvPayCourse);
        TextView stateView = ((pnh) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(stateView, "stateView");
        ViewExtKt.visible(stateView);
        ((pnh) getMBinding()).B.setText(getString(r0j.common_hint_network_unavailable));
        ((pnh) getMBinding()).B.setCompoundDrawablesWithIntrinsicBounds(0, yni.f40347b, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrderClick(int index, OrderInfo orderInfo) {
        List<SkuObject> sku_list = orderInfo.getSku_list();
        if (sku_list.isEmpty()) {
            return;
        }
        sku_list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrderToPay(OrderInfo orderInfo) {
        PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(PaymentManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        PaymentManager.DefaultImpls.intentToRepay$default(payManagerExtKt, fragmentActivityRequireActivity, orderInfo.getOrder_id(), false, false, false, 3, null, null, 220, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(PaymentOrderCourseVipListFragment this$0, PaymentOrderPageListViewModel.OrderPageData orderPageData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[orderPageData.getStatus().ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNull(orderPageData);
            this$0.onDataOK(orderPageData);
        } else if (i == 2) {
            this$0.onError();
        } else if (i == 3) {
            this$0.onNoNet();
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return uui.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((PaymentOrderPageListViewModel) getMViewModel()).getOrderPageList(true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TabFragmentUtilKt.setUpBasicUi(this);
        this.mAdapter = new PaymentOrderCourseListAdapter(new AnonymousClass1(this), new AnonymousClass2(this));
        MoreRecyclerView moreRecyclerView = ((pnh) getMBinding()).A;
        PaymentOrderCourseListAdapter paymentOrderCourseListAdapter = this.mAdapter;
        if (paymentOrderCourseListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            paymentOrderCourseListAdapter = null;
        }
        moreRecyclerView.setAdapter(paymentOrderCourseListAdapter);
        ((pnh) getMBinding()).A.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ((PaymentOrderPageListViewModel) getMViewModel()).getOrderPageData().observe(getViewLifecycleOwner(), new PaymentOrderCourseVipListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: iph
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaymentOrderCourseVipListFragment.onViewCreated$lambda$0(this.f21977a, (PaymentOrderPageListViewModel.OrderPageData) obj);
            }
        }));
        ((pnh) getMBinding()).A.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.pay.order.PaymentOrderCourseVipListFragment.onViewCreated.4
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                PaymentOrderPageListViewModel.getOrderPageList$default(PaymentOrderCourseVipListFragment.access$getMViewModel(PaymentOrderCourseVipListFragment.this), false, true, 1, null);
            }
        });
    }
}

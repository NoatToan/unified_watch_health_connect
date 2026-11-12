package com.xiaomi.fitness.pay.order;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.pay.export.PayManagerExtKt;
import com.xiaomi.fitness.pay.export.PaymentManager;
import com.xiaomi.fitness.pay.export.data.request.SkuObject;
import com.xiaomi.fitness.pay.export.data.response.OrderInfo;
import com.xiaomi.fitness.pay.order.PaymentOrderPageListViewModel;
import com.xiaomi.fitness.pay.order.PaymentOrderWatchFaceListFragment;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import defpackage.uui;
import defpackage.xnh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b%\u0010\u0014J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderWatchFaceListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListViewModel;", "Lxnh;", "", "index", "Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;", TSMAuthContants.PARAM_ORDER_INFO, "", "onOrderClick", "(ILcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", "onOrderToPay", "(Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "()V", LifecycleConstantKt.ON_DESTROY, "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose$delegate", "Lkotlin/Lazy;", "getTrackExpose", "()Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose", "", "orderInfoList", "Ljava/util/List;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListAdapter;", "mAdapter", "Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListAdapter;", "getLayoutId", "()I", "layoutId", "<init>", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PaymentOrderWatchFaceListFragment extends Hilt_PaymentOrderWatchFaceListFragment<PaymentOrderPageListViewModel, xnh> {
    private PaymentOrderPageListAdapter mAdapter;

    /* JADX INFO: renamed from: trackExpose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackExpose = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yph
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentOrderWatchFaceListFragment.trackExpose_delegate$lambda$0();
        }
    });

    @NotNull
    private final List<OrderInfo> orderInfoList = new ArrayList();

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.order.PaymentOrderWatchFaceListFragment$onViewCreated$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Integer, OrderInfo, Unit> {
        public AnonymousClass1(Object obj) {
            super(2, obj, PaymentOrderWatchFaceListFragment.class, "onOrderClick", "onOrderClick(ILcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, OrderInfo orderInfo) {
            invoke(num.intValue(), orderInfo);
            return Unit.INSTANCE;
        }

        public final void invoke(int i, OrderInfo p1) {
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((PaymentOrderWatchFaceListFragment) this.receiver).onOrderClick(i, p1);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.pay.order.PaymentOrderWatchFaceListFragment$onViewCreated$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<OrderInfo, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, PaymentOrderWatchFaceListFragment.class, "onOrderToPay", "onOrderToPay(Lcom/xiaomi/fitness/pay/export/data/response/OrderInfo;)V", 0);
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
            ((PaymentOrderWatchFaceListFragment) this.receiver).onOrderToPay(p0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ PaymentOrderPageListViewModel access$getMViewModel(PaymentOrderWatchFaceListFragment paymentOrderWatchFaceListFragment) {
        return (PaymentOrderPageListViewModel) paymentOrderWatchFaceListFragment.getMViewModel();
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getTrackExpose() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.trackExpose.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrderClick(int index, OrderInfo orderInfo) {
        SkuObject skuObject;
        Integer product_category;
        List<SkuObject> sku_list = orderInfo.getSku_list();
        if (sku_list.isEmpty() || (product_category = (skuObject = sku_list.get(0)).getProduct_category()) == null || product_category.intValue() != 1) {
            return;
        }
        FaceHelperExtKt.getInstance(FaceHelper.INSTANCE).gotoFaceDetail(skuObject.getProduct_type(), skuObject.getProduct_id(), "order_list", index + 1, "user_content", "order_list");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOrderToPay(OrderInfo orderInfo) {
        Bundle bundle = new Bundle();
        bundle.putString("source", "order_list");
        bundle.putString("exposeSource", "order_list");
        bundle.putString("contentSource", "user_content");
        PaymentManager payManagerExtKt = PayManagerExtKt.getInstance(PaymentManager.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        PaymentManager.DefaultImpls.intentToRepay$default(payManagerExtKt, fragmentActivityRequireActivity, orderInfo.getOrder_id(), false, false, false, 0, bundle, null, SportReportBaseParser.ReportType.avgDescentRate, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$1(PaymentOrderWatchFaceListFragment this$0, PaymentOrderPageListViewModel.OrderPageData orderPageData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PaymentOrderPageListAdapter paymentOrderPageListAdapter = null;
        MoreRecyclerView.setStatus$default(((xnh) this$0.getMBinding()).D, orderPageData.getHasNext() ? Status.MORE : Status.DONE, false, 2, null);
        if (orderPageData.getRefresh()) {
            this$0.orderInfoList.clear();
        }
        List<OrderInfo> list = orderPageData.getList();
        if (list != null && !list.isEmpty()) {
            this$0.orderInfoList.addAll(orderPageData.getList());
            PaymentOrderPageListAdapter paymentOrderPageListAdapter2 = this$0.mAdapter;
            if (paymentOrderPageListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                paymentOrderPageListAdapter = paymentOrderPageListAdapter2;
            }
            paymentOrderPageListAdapter.submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) this$0.orderInfoList));
        }
        Group emptyView = ((xnh) this$0.getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
        ViewExtKt.setVisible(emptyView, this$0.orderInfoList.isEmpty());
        MoreRecyclerView orderListRecyc = ((xnh) this$0.getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(orderListRecyc, "orderListRecyc");
        ViewExtKt.setVisible(orderListRecyc, !this$0.orderInfoList.isEmpty());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz trackExpose_delegate$lambda$0() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return uui.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        NestRecyclerViewItemEffectiveExposeBiz trackExpose = getTrackExpose();
        MoreRecyclerView orderListRecyc = ((xnh) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(orderListRecyc, "orderListRecyc");
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(trackExpose, orderListRecyc, 0, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        PaymentOrderPageListViewModel.getOrderPageList$default((PaymentOrderPageListViewModel) getMViewModel(), true, false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        TabFragmentUtilKt.setUpBasicUi(this);
        this.mAdapter = new PaymentOrderPageListAdapter(new AnonymousClass1(this), new AnonymousClass2(this));
        MoreRecyclerView moreRecyclerView = ((xnh) getMBinding()).D;
        PaymentOrderPageListAdapter paymentOrderPageListAdapter = this.mAdapter;
        if (paymentOrderPageListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            paymentOrderPageListAdapter = null;
        }
        moreRecyclerView.setAdapter(paymentOrderPageListAdapter);
        ((xnh) getMBinding()).D.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        NestRecyclerViewItemEffectiveExposeBiz trackExpose = getTrackExpose();
        MoreRecyclerView orderListRecyc = ((xnh) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(orderListRecyc, "orderListRecyc");
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(trackExpose, orderListRecyc, 0, null, 6, null);
        ((PaymentOrderPageListViewModel) getMViewModel()).getOrderPageData().observe(getViewLifecycleOwner(), new PaymentOrderWatchFaceListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zph
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PaymentOrderWatchFaceListFragment.onViewCreated$lambda$1(this.f41551a, (PaymentOrderPageListViewModel.OrderPageData) obj);
            }
        }));
        ((xnh) getMBinding()).D.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.pay.order.PaymentOrderWatchFaceListFragment.onViewCreated.4
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                PaymentOrderPageListViewModel.getOrderPageList$default(PaymentOrderWatchFaceListFragment.access$getMViewModel(PaymentOrderWatchFaceListFragment.this), false, false, 3, null);
            }
        });
    }
}

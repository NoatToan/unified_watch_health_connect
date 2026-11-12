package com.huami.watchfacesstore.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.pay.service.HuamiPayCashierService;
import com.huami.pay.service.HuamiPayService;
import com.huami.pay.service.PayChannel;
import com.huami.pay.service.PayProgress;
import com.huami.pay.service.PayResult;
import com.huami.pay.service.ProductCashierParam;
import com.huami.pay.service.ProductParam;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.analytic.WFAnalyticHelper;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.huami.watchfacesstore.ui.StartPayHolder;
import com.huami.widget.toast.IconToast;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u00104J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J&\u0010\u0010\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J&\u0010\u0011\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\"\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u001c\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\f\u0010\u001a\u001a\u00020\u0019*\u00020\rH\u0002J/\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001cH\u0086\u0002R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010/R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00101¨\u00065"}, d2 = {"Lcom/huami/watchfacesstore/ui/StartPayHolder;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "msg", "", "isSuccess", "", "o", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activityRef", "Lcom/huami/pay/service/ProductCashierParam;", "productParam", "watchfaceId", "l", "m", "Lcom/huami/pay/service/PayResult;", "payResult", "Lcom/huami/pay/service/PayChannel;", "payChannel", "h", "i", "f", "Lcom/huami/pay/service/ProductParam;", GoogleApiAvailabilityLight.b, "activity", "Lkotlin/Function0;", "doSuccessMethod", "invoke", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "a", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "showLoadingDialog", "Lcom/huami/pay/service/HuamiPayCashierService;", "b", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/pay/service/HuamiPayCashierService;", "huamiPayCashierService", "Lcom/huami/pay/service/HuamiPayService;", "c", "e", "()Lcom/huami/pay/service/HuamiPayService;", "huamiPayService", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Lkotlin/jvm/functions/Function0;", "doWhenSuccessMethod", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class StartPayHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog showLoadingDialog;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy huamiPayCashierService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy huamiPayService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Handler handler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> doWhenSuccessMethod;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PayResult.values().length];
            iArr[PayResult.CODE_SUCCESS.ordinal()] = 1;
            iArr[PayResult.CODE_WECHAT_CANCEL.ordinal()] = 2;
            iArr[PayResult.CODE_ALI_CANCEL.ordinal()] = 3;
            iArr[PayResult.CODE_GOOGLE_USER_CANCELED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pay success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start pay cashier";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start google pay";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/pay/service/PayProgress;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<PayProgress, Unit> {
        public final /* synthetic */ WeakReference<Activity> a;
        public final /* synthetic */ StartPayHolder b;
        public final /* synthetic */ String c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ PayProgress a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PayProgress payProgress) {
                super(0);
                this.a = payProgress;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "google pay result " + ((PayProgress.PayEnd) this.a).getPayResult();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WeakReference<Activity> weakReference, StartPayHolder startPayHolder, String str) {
            super(1);
            this.a = weakReference;
            this.b = startPayHolder;
            this.c = str;
        }

        public final void a(@NotNull PayProgress payProgress) {
            Function0 function0;
            if (payProgress instanceof PayProgress.Prepare) {
                ((PayProgress.Prepare) payProgress).getPayChannel();
                Activity activity = this.a.get();
                if (activity == null) {
                    return;
                }
                StartPayHolder.j(this.b, activity, null, 2, null);
                return;
            }
            if (payProgress instanceof PayProgress.Notification) {
                Activity activity2 = this.a.get();
                if (activity2 == null) {
                    return;
                }
                StartPayHolder startPayHolder = this.b;
                if (startPayHolder.showLoadingDialog == null) {
                    StartPayHolder.j(startPayHolder, activity2, null, 2, null);
                    return;
                } else {
                    startPayHolder.f();
                    StartPayHolder.j(startPayHolder, activity2, null, 2, null);
                    return;
                }
            }
            if (!(payProgress instanceof PayProgress.PayEnd)) {
                if (payProgress instanceof PayProgress.Paying) {
                    this.b.f();
                    return;
                }
                return;
            }
            this.b.f();
            Activity activity3 = this.a.get();
            if (activity3 == null) {
                return;
            }
            StartPayHolder startPayHolder2 = this.b;
            String str = this.c;
            HMLog.info(WFConstant.WF_TAG, new a(payProgress));
            PayProgress.PayEnd payEnd = (PayProgress.PayEnd) payProgress;
            String resultMessage = startPayHolder2.d().getResultMessage(payEnd.getPayResult());
            boolean z = payEnd.getPayResult() == PayResult.CODE_SUCCESS;
            if (z && (function0 = startPayHolder2.doWhenSuccessMethod) != null) {
                function0.invoke();
            }
            startPayHolder2.o(activity3, resultMessage, z);
            startPayHolder2.h(payEnd.getPayResult(), null, str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PayProgress payProgress) {
            a(payProgress);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartPayHolder() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.huamiPayCashierService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HuamiPayCashierService>() { // from class: com.huami.watchfacesstore.ui.StartPayHolder$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.pay.service.HuamiPayCashierService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HuamiPayCashierService invoke() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HuamiPayCashierService.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.huamiPayService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HuamiPayService>() { // from class: com.huami.watchfacesstore.ui.StartPayHolder$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [com.huami.pay.service.HuamiPayService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HuamiPayService invoke() {
                Koin koin = GlobalContext.INSTANCE.get();
                return koin.getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(HuamiPayService.class), objArr2, objArr3);
            }
        });
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HuamiPayCashierService d() {
        return (HuamiPayCashierService) this.huamiPayCashierService.getValue();
    }

    private final HuamiPayService e() {
        return (HuamiPayService) this.huamiPayService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.handler.post(new Runnable() { // from class: ye7
            @Override // java.lang.Runnable
            public final void run() {
                StartPayHolder.g(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(StartPayHolder startPayHolder) {
        LoadingDialog loadingDialog;
        LoadingDialog loadingDialog2 = startPayHolder.showLoadingDialog;
        boolean z = false;
        if (loadingDialog2 != null && loadingDialog2.isShowing()) {
            z = true;
        }
        if (!z || (loadingDialog = startPayHolder.showLoadingDialog) == null) {
            return;
        }
        loadingDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(PayResult payResult, PayChannel payChannel, String watchfaceId) {
        if (payChannel == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[payResult.ordinal()];
        if (i == 1) {
            HMLog.info(WFConstant.WF_TAG, a.a);
        } else if (i == 2 || i == 3 || i == 4) {
            WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_PAID_CANCELLED, null, r.mapOf(TuplesKt.to(WFStateEvent.WF_PAYMENT, payChannel.name()), TuplesKt.to("WatchFaceId", watchfaceId)), null, 10, null);
        } else {
            WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_PAID_FAILED, null, r.mapOf(TuplesKt.to(WFStateEvent.WF_PAYMENT, payChannel.name()), TuplesKt.to("WatchFaceId", watchfaceId), TuplesKt.to(WFStateEvent.WF_ERROR_CODE, String.valueOf(payResult.getCode()))), null, 10, null);
        }
    }

    private final void i(final Context context, final String msg) {
        this.handler.post(new Runnable() { // from class: ze7
            @Override // java.lang.Runnable
            public final void run() {
                StartPayHolder.k(this.a, context, msg);
            }
        });
    }

    public static /* synthetic */ void j(StartPayHolder startPayHolder, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        startPayHolder.i(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(StartPayHolder startPayHolder, Context context, String str) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(context);
        if (str != null) {
            loadingDialogShowDialog.setMessage(str);
        }
        loadingDialogShowDialog.setCancelable(false);
        Unit unit = Unit.INSTANCE;
        startPayHolder.showLoadingDialog = loadingDialogShowDialog;
    }

    private final void l(final WeakReference<Activity> activityRef, ProductCashierParam productParam, final String watchfaceId) {
        HMLog.info(WFConstant.WF_TAG, b.a);
        WFAnalyticHelper wFAnalyticHelper = WFAnalyticHelper.INSTANCE;
        WFAnalyticHelper.analyticCount$default(wFAnalyticHelper, WFStateEvent.WF_DETAIL_PAID_C, null, r.mapOf(TuplesKt.to("WatchFaceId", watchfaceId), TuplesKt.to(WFStateEvent.WF_PAYMENT, WFStateEvent.WF_LOCALPAY)), null, 10, null);
        d().setPayProgressListener(new Function1<PayProgress, Unit>() { // from class: com.huami.watchfacesstore.ui.StartPayHolder$startCashierPay$2

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PayResult.values().length];
                    iArr[PayResult.CODE_SUCCESS.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ PayProgress a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(PayProgress payProgress) {
                    super(0);
                    this.a = payProgress;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "cashier pay result " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@NotNull PayProgress payProgress) {
                Activity activity = activityRef.get();
                if (activity != null) {
                    String str = watchfaceId;
                    StartPayHolder startPayHolder = this;
                    if (payProgress instanceof PayProgress.Prepare) {
                        PayProgress.Prepare prepare = (PayProgress.Prepare) payProgress;
                        prepare.getPayChannel();
                        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_PAYMENT_PAID_C, null, r.mapOf(TuplesKt.to(WFStateEvent.WF_PAYMENT, prepare.getPayChannel().name()), TuplesKt.to("WatchFaceId", str)), null, 10, null);
                    } else if (payProgress instanceof PayProgress.PayEnd) {
                        PayProgress.PayEnd payEnd = (PayProgress.PayEnd) payProgress;
                        if (WhenMappings.$EnumSwitchMapping$0[payEnd.getPayResult().ordinal()] == 1) {
                            Function0 function0 = startPayHolder.doWhenSuccessMethod;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        } else {
                            startPayHolder.h(payEnd.getPayResult(), null, str);
                            startPayHolder.o(activity, startPayHolder.d().getResultMessage(payEnd.getPayResult()), false);
                        }
                    }
                }
                HMLog.info(WFConstant.WF_TAG, new a(payProgress));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PayProgress payProgress) {
                a(payProgress);
                return Unit.INSTANCE;
            }
        });
        Activity activity = activityRef.get();
        if (activity == null) {
            return;
        }
        WFAnalyticHelper.analyticCount$default(wFAnalyticHelper, WFStateEvent.WF_PAYMENT_V, null, null, null, 14, null);
        d().payCashier(activity, productParam, Integer.valueOf(R.style.PayCashierDialogTheme));
    }

    private final void m(WeakReference<Activity> activityRef, ProductCashierParam productParam, String watchfaceId) {
        HMLog.info(WFConstant.WF_TAG, c.a);
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_DETAIL_PAID_C, null, r.mapOf(TuplesKt.to("WatchFaceId", watchfaceId), TuplesKt.to(WFStateEvent.WF_PAYMENT, WFStateEvent.WF_PAYTYPE_GP)), null, 10, null);
        e().setPayProgressListener(new d(activityRef, this, watchfaceId));
        Activity activity = activityRef.get();
        if (activity == null) {
            return;
        }
        e().pay(activity, n(productParam));
    }

    private final ProductParam n(ProductCashierParam productCashierParam) {
        return new ProductParam(productCashierParam.getUserId(), productCashierParam.getSupportChannel().get(0), productCashierParam.getDescription(), productCashierParam.getSkus(), productCashierParam.getSkuType(), productCashierParam.getNeedConsume());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(final Context context, final String msg, final boolean isSuccess) {
        this.handler.post(new Runnable() { // from class: af7
            @Override // java.lang.Runnable
            public final void run() {
                StartPayHolder.p(isSuccess, context, msg);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(boolean z, Context context, String str) {
        if (z) {
            IconToast.showSuccess(context, str);
        } else {
            IconToast.showError(context, str);
        }
    }

    public final void invoke(@NotNull Activity activity, @NotNull ProductCashierParam productParam, @NotNull String watchfaceId, @NotNull Function0<Unit> doSuccessMethod) {
        this.doWhenSuccessMethod = doSuccessMethod;
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        if (productParam.getSupportChannel().size() == 1 && productParam.getSupportChannel().get(0) == PayChannel.GOOGLE_PAY) {
            m(weakReference, productParam, watchfaceId);
        } else {
            l(weakReference, productParam, watchfaceId);
        }
    }
}

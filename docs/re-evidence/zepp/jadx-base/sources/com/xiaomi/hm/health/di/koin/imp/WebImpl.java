package com.xiaomi.hm.health.di.koin.imp;

import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleKt;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.account.HMLogoutManager;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.model.JsCashierReq;
import com.huami.network.base.util.HMHttpUtils;
import com.huami.tools.log.HMLog;
import com.huami.web.container.IWeb;
import com.xiaomi.hm.health.cashier.CashierPay;
import com.xiaomi.hm.health.cashier.fragment.CashierDialogFragment;
import com.xiaomi.hm.health.cashier.model.AliPrepaidData;
import com.xiaomi.hm.health.cashier.model.CashierPayResponse;
import com.xiaomi.hm.health.cashier.model.Product;
import com.xiaomi.hm.health.di.koin.imp.WebImpl;
import com.xiaomi.hm.health.discovery.jsbridge.entity.JsCashierErrorRep;
import com.xiaomi.hm.health.discovery.jsbridge.entity.JsCashierSuccessRep;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.manager.HMDownloadManager;
import com.xiaomi.hm.health.manager.RunningManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/imp/WebImpl;", "Lcom/huami/web/container/IWeb;", "", "startRunning", "logoutByExpire", "", "mutexTime", "mutex", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/discovery/bridge/model/JsCashierReq;", "req", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "showCashierDesk", "", "params", "aliPay", AbstractJSONTokenResponse.RESPONSE, "dealWebActivityLoginInvalid", SOAP.XMLNS, "downloadSuccessStrKeeper", "id", "keepDownloadApkId", "name", "downloadManagerPut", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WebImpl implements IWeb {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.imp.WebImpl$aliPay$1", f = "WebImpl.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ FragmentActivity c;
        public final /* synthetic */ JsCallBackFunction d;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.imp.WebImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.di.koin.imp.WebImpl$aliPay$1$1$1", f = "WebImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0896a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ CashierPayResponse b;
            public final /* synthetic */ JsCallBackFunction c;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.di.koin.imp.WebImpl$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0897a extends Lambda implements Function0<String> {
                public final /* synthetic */ CashierPayResponse a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0897a(CashierPayResponse cashierPayResponse) {
                    super(0);
                    this.a = cashierPayResponse;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return this.a.toString();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0896a(CashierPayResponse cashierPayResponse, JsCallBackFunction jsCallBackFunction, Continuation<? super C0896a> continuation) {
                super(2, continuation);
                this.b = cashierPayResponse;
                this.c = jsCallBackFunction;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0896a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0896a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HMLog.info("ali_pay", new C0897a(this.b));
                if (this.b.getResult()) {
                    this.c.onCallBack(JsCashierSuccessRep.get().toString());
                } else {
                    this.c.onCallBack(JsCashierErrorRep.get(this.b.getCode()).toString());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FragmentActivity fragmentActivity, JsCallBackFunction jsCallBackFunction, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = fragmentActivity;
            this.d = jsCallBackFunction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = this.b;
                    FragmentActivity fragmentActivity = this.c;
                    JsCallBackFunction jsCallBackFunction = this.d;
                    Result.Companion companion = Result.Companion;
                    CashierPayResponse cashierPayResponseAliPay = CashierPay.aliPay(fragmentActivity, ((AliPrepaidData) HMHttpUtils.getGson().fromJson(str, AliPrepaidData.class)).getData());
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C0896a c0896a = new C0896a(cashierPayResponseAliPay, jsCallBackFunction, null);
                    this.a = 1;
                    if (BuildersKt.withContext(main, c0896a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ CashierPayResponse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CashierPayResponse cashierPayResponse) {
            super(0);
            this.a = cashierPayResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(JsCallBackFunction jsCallBackFunction, CashierPayResponse cashierPayResponse) {
        HMLog.info("cash_desk", new b(cashierPayResponse));
        if (cashierPayResponse.getResult()) {
            jsCallBackFunction.onCallBack(JsCashierSuccessRep.get().toString());
        } else {
            jsCallBackFunction.onCallBack(JsCashierErrorRep.get(cashierPayResponse.getCode()).toString());
        }
    }

    @Override // com.huami.web.container.IWeb
    public void aliPay(@NotNull FragmentActivity activity, @NotNull String params, @NotNull JsCallBackFunction function) {
        e.f(LifecycleKt.getCoroutineScope(activity.getLifecycle()), Dispatchers.getIO(), null, new a(params, activity, function, null), 2, null);
    }

    @Override // com.huami.web.container.IWeb
    public void dealWebActivityLoginInvalid(@Nullable String response) {
        HMLogoutManager.dealWebActivityLoginInvalid(response);
    }

    @Override // com.huami.web.container.IWeb
    public void downloadManagerPut(long id, @NotNull String name) {
        HMDownloadManager.getInstance().getMap().put(id, name);
    }

    @Override // com.huami.web.container.IWeb
    public void downloadSuccessStrKeeper(@NotNull String s) {
        HMKeeper.setDownloadSuccessStr(s);
    }

    @Override // com.huami.web.container.IWeb
    public void keepDownloadApkId(long id) {
        HMKeeper.keepDownloadApkId(id);
    }

    @Override // com.huami.web.container.IWeb
    public void logoutByExpire() {
        HMLogoutManager.logout(2);
    }

    @Override // com.huami.web.container.IWeb
    public void mutex(long mutexTime) {
        HMLogoutManager.mutex(mutexTime);
    }

    @Override // com.huami.web.container.IWeb
    public void showCashierDesk(@NotNull FragmentActivity activity, @NotNull JsCashierReq req, @NotNull final JsCallBackFunction function) {
        int totalFee = req.getTotalFee();
        List<JsCashierReq.Product> products = req.getProducts();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(products, 10));
        for (JsCashierReq.Product product : products) {
            arrayList.add(new Product(product.mQuantity, product.mSkuId));
        }
        CashierDialogFragment.showCashier(activity, totalFee, arrayList, req.getDescription(), new CashierDialogFragment.IPayCallback() { // from class: wp8
            @Override // com.xiaomi.hm.health.cashier.fragment.CashierDialogFragment.IPayCallback
            public final void accept(CashierPayResponse cashierPayResponse) {
                WebImpl.b(function, cashierPayResponse);
            }
        });
    }

    @Override // com.huami.web.container.IWeb
    public void startRunning() {
        RunningManager.startRunning();
    }
}

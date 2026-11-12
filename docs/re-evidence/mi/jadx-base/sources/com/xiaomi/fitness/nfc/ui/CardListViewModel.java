package com.xiaomi.fitness.nfc.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.BulletinResponseInfo;
import com.miui.tsmclient.entity.CardConfigManager;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.MiPayService;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.sesdk.UncompletedOrderList;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.CardListViewModel;
import defpackage.bg4;
import defpackage.dld;
import defpackage.fmg;
import defpackage.gmg;
import defpackage.jz6;
import defpackage.na4;
import defpackage.o4h;
import defpackage.s3q;
import defpackage.ua1;
import defpackage.vqg;
import defpackage.zl3;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b3\u00104J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J9\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0016\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0016\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001d\u001a\u00020\u00042\u0018\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010&\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "", "tag", "Lkotlin/Function1;", "", "Lcom/miui/tsmclient/entity/BulletinResponseInfo$BulletinInfo;", "success", "loadBulletDialog", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/miui/tsmclient/model/BaseResponse;", "Lkotlin/Function0;", "error", "recharge", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "loadBullet", "Ldld;", "issuer", "updateCard", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Ldld;)V", "callback", "fail", "loadCardList", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "ing1", "ing2", "ing3", "Landroid/widget/TextView;", "textView", "issuerLoading", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCardListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardListViewModel.kt\ncom/xiaomi/fitness/nfc/ui/CardListViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1872#2,3:193\n*S KotlinDebug\n*F\n+ 1 CardListViewModel.kt\ncom/xiaomi/fitness/nfc/ui/CardListViewModel\n*L\n82#1:193,3\n*E\n"})
public final class CardListViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardListViewModel$loadCardList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardListViewModel$loadCardList$1", f = "CardListViewModel.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<? extends CardWrapper>, Unit> $callback;
        final /* synthetic */ Function1<String, Unit> $fail;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.CardListViewModel$loadCardList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.CardListViewModel$loadCardList$1$1", f = "CardListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<? extends CardWrapper>, Unit> $callback;
            final /* synthetic */ Function1<String, Unit> $fail;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06651(Function1<? super List<? extends CardWrapper>, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super C06651> continuation) {
                super(2, continuation);
                this.$callback = function1;
                this.$fail = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06651(this.$callback, this.$fail, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1<List<? extends CardWrapper>, Unit> function1 = this.$callback;
                Function1<String, Unit> function2 = this.$fail;
                for (int i = 0; i < 2; i++) {
                    try {
                        vqg.d("getTransCardList pre");
                        List<SeCard> listP0 = s3q.f0().p0();
                        Intrinsics.checkNotNullExpressionValue(listP0, "getSupportedTransCardCardList(...)");
                        List<UncompletedOrderList.UncompletedOrder> listS0 = s3q.f0().s0(listP0);
                        Intrinsics.checkNotNullExpressionValue(listS0, "getUncompletedOrderListAndAccountList(...)");
                        List<CardWrapper> transit = CardWrapper.parseTransit(listP0, listS0);
                        List<CardWrapper> list = zl3.g().f41420k;
                        Intrinsics.checkNotNull(transit);
                        list.addAll(transit);
                        vqg.d("getSupportedTransCardCardList size:" + transit.size());
                        if (transit.isEmpty()) {
                            function1.invoke2(transit);
                        } else {
                            CardConfigManager.getInstance().getSupportedTransCardMap(true);
                            zl3.g().i.clear();
                            List<CardWrapper> list2 = CardWrapper.parse(new MiPayService().getSupportedCardList(CardCategory.CLOUD_TRANSIT));
                            Intrinsics.checkNotNullExpressionValue(list2, "parse(...)");
                            vqg.d("getSupportedCardList size:" + list2.size());
                            zl3.g().i.addAll(list2);
                            List<CardWrapper> mCloudCardList = zl3.g().i;
                            Intrinsics.checkNotNullExpressionValue(mCloudCardList, "mCloudCardList");
                            transit.addAll(0, mCloudCardList);
                            zl3.g().s(transit);
                            zl3.g().r();
                            List<CardWrapper> mTransCardAllList = zl3.g().d;
                            Intrinsics.checkNotNullExpressionValue(mTransCardAllList, "mTransCardAllList");
                            function1.invoke2(mTransCardAllList);
                        }
                    } catch (Exception e) {
                        String strC = gmg.c(e);
                        Intrinsics.checkNotNullExpressionValue(strC, "getErrorMsg(...)");
                        function2.invoke2(strC);
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super List<? extends CardWrapper>, Unit> function1, Function1<? super String, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = function1;
            this.$fail = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.$fail, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06651 c06651 = new C06651(this.$callback, this.$fail, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06651, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit issuerLoading$lambda$17(Activity activity, TextView textView, String ing1, String ing2, String ing3, Long l) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(textView, "$textView");
        Intrinsics.checkNotNullParameter(ing1, "$ing1");
        Intrinsics.checkNotNullParameter(ing2, "$ing2");
        Intrinsics.checkNotNullParameter(ing3, "$ing3");
        if (activity.isDestroyed() || activity.isFinishing()) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(textView.getText().toString(), ing1)) {
            textView.setText(ing2);
        } else if (Intrinsics.areEqual(textView.getText().toString(), ing2)) {
            textView.setText(ing3);
        } else {
            textView.setText(ing1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void issuerLoading$lambda$18(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit issuerLoading$lambda$19(Throwable th) {
        vqg.c("mStatusIngTv error", th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void issuerLoading$lambda$20(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBullet$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBullet$lambda$11(String tag, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "$tag");
        vqg.c("loadBulletinList err" + tag, th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBullet$lambda$12(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBullet$lambda$9(Function1 success, List list) {
        Intrinsics.checkNotNullParameter(success, "$success");
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            sb.append(((BulletinResponseInfo.BulletinInfo) obj).getContent());
            if (i > 0 && i < list.size() - 1) {
                sb.append(" > ");
            }
            i = i2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        success.invoke2(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBulletDialog$lambda$0(Function1 success, List list) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(list);
        success.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBulletDialog$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadBulletDialog$lambda$2(String tag, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "$tag");
        vqg.c("loadBulletinList err" + tag, th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBulletDialog$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recharge$lambda$4(Function1 success, BaseResponse baseResponse) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNull(baseResponse);
        success.invoke2(baseResponse);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recharge$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recharge$lambda$6(Function0 error, Throwable th) {
        Intrinsics.checkNotNullParameter(error, "$error");
        vqg.c("CardIntroFragment updateCard err ", th);
        ToastUtil.showShortToast(fmg.c(th));
        error.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void recharge$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$13(dld issuer, CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(issuer, "$issuer");
        if (issuer.a(true)) {
            issuer.i();
        } else {
            issuer.o();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$14(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCard$lambda$15(Throwable th) {
        vqg.c("CardIntroFragment updateCard err ", th);
        ToastUtil.showShortToast(fmg.c(th));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCard$lambda$16(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void issuerLoading(@NotNull final Activity activity, @NotNull final String ing1, @NotNull final String ing2, @NotNull final String ing3, @NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ing1, "ing1");
        Intrinsics.checkNotNullParameter(ing2, "ing2");
        Intrinsics.checkNotNullParameter(ing3, "ing3");
        Intrinsics.checkNotNullParameter(textView, "textView");
        na4 na4Var = this.compositeDisposable;
        o4h<Long> o4hVarH = o4h.A(1L, TimeUnit.SECONDS).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: nn3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.issuerLoading$lambda$17(activity, textView, ing1, ing2, ing3, (Long) obj);
            }
        };
        bg4<? super Long> bg4Var = new bg4() { // from class: on3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.issuerLoading$lambda$18(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: pn3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.issuerLoading$lambda$19((Throwable) obj);
            }
        };
        na4Var.a(o4hVarH.O(bg4Var, new bg4() { // from class: qn3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.issuerLoading$lambda$20(function2, obj);
            }
        }));
    }

    public final void loadBullet(@Nullable CardWrapper cardWrapper, @NotNull final String tag, @NotNull final Function1<? super String, Unit> success) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(success, "success");
        o4h<List<BulletinResponseInfo.BulletinInfo>> o4hVarI1 = s3q.f0().i1(cardWrapper, tag);
        final Function1 function1 = new Function1() { // from class: rn3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.loadBullet$lambda$9(success, (List) obj);
            }
        };
        bg4<? super List<BulletinResponseInfo.BulletinInfo>> bg4Var = new bg4() { // from class: sn3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.loadBullet$lambda$10(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: an3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.loadBullet$lambda$11(tag, (Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarI1.O(bg4Var, new bg4() { // from class: bn3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.loadBullet$lambda$12(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }

    public final void loadBulletDialog(@Nullable CardWrapper cardWrapper, @NotNull final String tag, @NotNull final Function1<? super List<? extends BulletinResponseInfo.BulletinInfo>, Unit> success) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(success, "success");
        o4h<List<BulletinResponseInfo.BulletinInfo>> o4hVarI1 = s3q.f0().i1(cardWrapper, tag);
        final Function1 function1 = new Function1() { // from class: cn3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.loadBulletDialog$lambda$0(success, (List) obj);
            }
        };
        bg4<? super List<BulletinResponseInfo.BulletinInfo>> bg4Var = new bg4() { // from class: dn3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.loadBulletDialog$lambda$1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: en3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.loadBulletDialog$lambda$2(tag, (Throwable) obj);
            }
        };
        jz6 jz6VarO = o4hVarI1.O(bg4Var, new bg4() { // from class: fn3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.loadBulletDialog$lambda$3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jz6VarO, "subscribe(...)");
        this.compositeDisposable.a(jz6VarO);
    }

    public final void loadCardList(@NotNull Function1<? super List<? extends CardWrapper>, Unit> callback, @NotNull Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(fail, "fail");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(callback, fail, null), 3, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void recharge(@NotNull CardWrapper cardWrapper, @NotNull final Function1<? super BaseResponse, Unit> success, @NotNull final Function0<Unit> error) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        na4 na4Var = this.compositeDisposable;
        o4h<BaseResponse> o4hVarL1 = s3q.f0().l1(cardWrapper, null);
        final Function1 function1 = new Function1() { // from class: gn3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.recharge$lambda$4(success, (BaseResponse) obj);
            }
        };
        bg4<? super BaseResponse> bg4Var = new bg4() { // from class: hn3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.recharge$lambda$5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: in3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.recharge$lambda$6(error, (Throwable) obj);
            }
        };
        na4Var.a(o4hVarL1.O(bg4Var, new bg4() { // from class: jn3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.recharge$lambda$7(function2, obj);
            }
        }));
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void updateCard(@NotNull CardWrapper cardWrapper, @NotNull final dld issuer) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        na4 na4Var = this.compositeDisposable;
        o4h<CardWrapper> o4hVarZ1 = s3q.f0().z1(cardWrapper);
        final Function1 function1 = new Function1() { // from class: zm3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.updateCard$lambda$13(issuer, (CardWrapper) obj);
            }
        };
        bg4<? super CardWrapper> bg4Var = new bg4() { // from class: kn3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.updateCard$lambda$14(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ln3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListViewModel.updateCard$lambda$15((Throwable) obj);
            }
        };
        na4Var.a(o4hVarZ1.O(bg4Var, new bg4() { // from class: mn3
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                CardListViewModel.updateCard$lambda$16(function2, obj);
            }
        }));
    }
}

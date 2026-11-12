package com.xiaomi.fitness.nfc.ui;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.entity.CardInfo;
import com.service.mi.BankCard;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.ui.Cvn2ViewModel;
import defpackage.na4;
import defpackage.o0j;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b,\u0010-J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JO\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/Cvn2ViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "", "cardNumber", "ownerName", "year", "month", "securityCode", "Lkotlin/Function2;", "", "callBack", "checkCvv2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "cvc2", "Lkotlin/Function0;", "callback", "master", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "validDate", "cnv2", "unionpay", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "Lcom/service/mi/BankCard;", "bankCard$delegate", "Lkotlin/Lazy;", "getBankCard", "()Lcom/service/mi/BankCard;", "bankCard", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class Cvn2ViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: bankCard$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bankCard = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mf5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Cvn2ViewModel.bankCard_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.ui.Cvn2ViewModel$checkCvv2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.Cvn2ViewModel$checkCvv2$1", f = "Cvn2ViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cardNumber;
        final /* synthetic */ String $month;
        final /* synthetic */ String $ownerName;
        final /* synthetic */ String $securityCode;
        final /* synthetic */ String $year;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, String str4, String str5, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ownerName = str;
            this.$cardNumber = str2;
            this.$year = str3;
            this.$month = str4;
            this.$securityCode = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ownerName, this.$cardNumber, this.$year, this.$month, this.$securityCode, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                Cvn2ViewModel$checkCvv2$1$result$1 cvn2ViewModel$checkCvv2$1$result$1 = new Cvn2ViewModel$checkCvv2$1$result$1(this.$ownerName, this.$cardNumber, this.$year, this.$month, this.$securityCode, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, cvn2ViewModel$checkCvv2$1$result$1, this) == coroutine_suspended) {
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
    public static final BankCard bankCard_delegate$lambda$0() {
        return new BankCard();
    }

    private final BankCard getBankCard() {
        return (BankCard) this.bankCard.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void checkCvv2(@NotNull String cardNumber, @NotNull String ownerName, @NotNull String year, @NotNull String month, @NotNull String securityCode, @NotNull Function2<? super Boolean, ? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Intrinsics.checkNotNullParameter(ownerName, "ownerName");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(securityCode, "securityCode");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(ownerName, cardNumber, year, month, securityCode, null), 3, null);
    }

    @NotNull
    public final na4 getCompositeDisposable() {
        return this.compositeDisposable;
    }

    public final void master(@NotNull String cvc2, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(cvc2, "cvc2");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (TextUtils.isEmpty(cvc2)) {
            ToastUtil.showShortToast(o0j.l0);
        } else if (cvc2.length() != 3) {
            ToastUtil.showShortToast(o0j.k0);
        } else {
            callback.invoke();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    public final void setCompositeDisposable(@NotNull na4 na4Var) {
        Intrinsics.checkNotNullParameter(na4Var, "<set-?>");
        this.compositeDisposable = na4Var;
    }

    public final void unionpay(@NotNull String validDate, @NotNull String cnv2, @NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(validDate, "validDate");
        Intrinsics.checkNotNullParameter(cnv2, "cnv2");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (TextUtils.isEmpty(validDate)) {
            ToastUtil.showShortToast(o0j.u0);
            return;
        }
        if (TextUtils.isEmpty(cnv2)) {
            ToastUtil.showShortToast(o0j.j0);
            return;
        }
        if (validDate.length() != 5) {
            ToastUtil.showShortToast(o0j.u0);
        } else if (cnv2.length() != 3) {
            ToastUtil.showShortToast(o0j.k0);
        } else {
            callback.invoke();
        }
    }
}

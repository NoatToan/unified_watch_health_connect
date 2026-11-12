package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.miui.tsmclient.entity.CardInfo;
import com.service.mi.entity.BaseResponse;
import com.service.mi.visa.entity.transactionresp.EncTransactionInfo;
import com.service.mi.visa.entity.transactionresp.VisaTransactionRecords;
import com.service.mi.wallet.entity.tds.GetTransactionsResp;
import com.service.mi.wallet.entity.tds.Transaction;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.ui.issued.MasterTranslationViewModel;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.bg4;
import defpackage.j5h;
import defpackage.na4;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.vqg;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00040\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n\u0012\u0004\u0012\u00020\u00040\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MasterTranslationViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardWrapper", "Lkotlin/Function1;", "", "Lcom/service/mi/wallet/entity/tds/Transaction;", "callBack", "", "fail", "list", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/service/mi/visa/entity/transactionresp/EncTransactionInfo;", "getVisaTransactions", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", "Lna4;", "compositeDisposable", "Lna4;", "getCompositeDisposable", "()Lna4;", "setCompositeDisposable", "(Lna4;)V", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMasterTranslationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MasterTranslationViewModel.kt\ncom/xiaomi/fitness/nfc/ui/issued/MasterTranslationViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1863#2,2:115\n*S KotlinDebug\n*F\n+ 1 MasterTranslationViewModel.kt\ncom/xiaomi/fitness/nfc/ui/issued/MasterTranslationViewModel\n*L\n51#1:115,2\n*E\n"})
public final class MasterTranslationViewModel extends AbsViewModel {

    @NotNull
    private na4 compositeDisposable = new na4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getVisaTransactions$lambda$10(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getVisaTransactions$lambda$6(CardWrapper cardWrapper, v4h it) {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(it, "it");
        BaseResponse baseResponseUpdate = cardWrapper.bankCard.update();
        if (!baseResponseUpdate.isStatusOK()) {
            vqg.d("bankCard.transactions  code:" + baseResponseUpdate.getResultCode() + "  msg:" + baseResponseUpdate.getMsg());
            it.onError(new NfcException(NfcUtils.getMasterErrorMsg(baseResponseUpdate.getResultCode(), baseResponseUpdate.getSpErrors())));
            it.onComplete();
            return;
        }
        BaseResponse transactions = cardWrapper.bankCard.getTransactions();
        vqg.d("bankCard.transactions code:" + transactions.getResultCode() + "  msg:" + transactions.getMsg());
        if (!transactions.isStatusOK()) {
            it.onError(new NfcException(transactions.getMsg()));
            it.onComplete();
        } else {
            Object data = transactions.getData();
            Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.service.mi.visa.entity.transactionresp.VisaTransactionRecords");
            it.onNext(((VisaTransactionRecords) data).getEncTransactionInfoList());
            it.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVisaTransactions$lambda$7(Function1 callBack, List list) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNull(list);
        callBack.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getVisaTransactions$lambda$8(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVisaTransactions$lambda$9(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("MiPayService().cardList ", th);
        fail.invoke2(th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void list$lambda$1(CardWrapper cardWrapper, v4h it) {
        Intrinsics.checkNotNullParameter(cardWrapper, "$cardWrapper");
        Intrinsics.checkNotNullParameter(it, "it");
        BaseResponse baseResponseUpdate = cardWrapper.bankCard.update();
        if (!baseResponseUpdate.isStatusOK()) {
            vqg.d("bankCard.transactions updateCard code:" + baseResponseUpdate.getResultCode() + "  msg:" + baseResponseUpdate.getMsg());
            it.onError(new NfcException(NfcUtils.getMasterErrorMsg(baseResponseUpdate.getResultCode(), baseResponseUpdate.getSpErrors())));
            it.onComplete();
            return;
        }
        BaseResponse transactions = cardWrapper.bankCard.getTransactions();
        vqg.d("bankCard.transactions code:" + transactions.getResultCode() + "  msg:" + transactions.getMsg());
        if (!transactions.isStatusOK()) {
            it.onError(new NfcException(transactions.getMsg()));
            it.onComplete();
            return;
        }
        Object data = transactions.getData();
        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type com.service.mi.wallet.entity.tds.GetTransactionsResp");
        List<Transaction> transactions2 = ((GetTransactionsResp) data).getTransactions();
        ArrayList arrayList = new ArrayList();
        if (transactions2 != null) {
            for (Transaction transaction : transactions2) {
                Intrinsics.checkNotNull(transaction);
                arrayList.add(transaction);
            }
        }
        it.onNext(arrayList);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit list$lambda$2(Function1 callBack, List list) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNull(list);
        callBack.invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void list$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit list$lambda$4(Function1 fail, Throwable th) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        vqg.c("MiPayService().cardList ", th);
        fail.invoke2(th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void list$lambda$5(Function1 tmp0, Object obj) {
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

    public final void getVisaTransactions(@NotNull final CardWrapper cardWrapper, @NotNull final Function1<? super List<EncTransactionInfo>, Unit> callBack, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h o4hVarH = o4h.f(new j5h() { // from class: n7f
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                MasterTranslationViewModel.getVisaTransactions$lambda$6(cardWrapper, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: o7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterTranslationViewModel.getVisaTransactions$lambda$7(callBack, (List) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: p7f
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                MasterTranslationViewModel.getVisaTransactions$lambda$8(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: q7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterTranslationViewModel.getVisaTransactions$lambda$9(fail, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.O(bg4Var, new bg4() { // from class: r7f
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                MasterTranslationViewModel.getVisaTransactions$lambda$10(function2, obj);
            }
        }));
    }

    public final void list(@NotNull final CardWrapper cardWrapper, @NotNull final Function1<? super List<Transaction>, Unit> callBack, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Intrinsics.checkNotNullParameter(fail, "fail");
        o4h o4hVarH = o4h.f(new j5h() { // from class: s7f
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                MasterTranslationViewModel.list$lambda$1(cardWrapper, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c());
        final Function1 function1 = new Function1() { // from class: t7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterTranslationViewModel.list$lambda$2(callBack, (List) obj);
            }
        };
        bg4 bg4Var = new bg4() { // from class: u7f
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                MasterTranslationViewModel.list$lambda$3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: v7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterTranslationViewModel.list$lambda$4(fail, (Throwable) obj);
            }
        };
        this.compositeDisposable.a(o4hVarH.O(bg4Var, new bg4() { // from class: w7f
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                MasterTranslationViewModel.list$lambda$5(function2, obj);
            }
        }));
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
}

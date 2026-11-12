package com.xiaomi.fitness.nfc.ui.issued;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.service.mi.BankCard;
import com.service.mi.visa.entity.transactionresp.EncTransactionInfo;
import com.service.mi.wallet.entity.tds.Transaction;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.MasterTranslationFragment;
import defpackage.bpg;
import defpackage.o0j;
import defpackage.sui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MasterTranslationFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/MasterTranslationViewModel;", "Lbpg;", "", "bindView", "(Lbpg;)V", "", "Lcom/service/mi/wallet/entity/tds/Transaction;", "masterTranslationList", "Ljava/util/List;", "Lcom/xiaomi/fitness/nfc/ui/issued/MasterTranslationAdapter;", "masterTranslationAdapter", "Lcom/xiaomi/fitness/nfc/ui/issued/MasterTranslationAdapter;", "Lcom/service/mi/visa/entity/transactionresp/EncTransactionInfo;", "visaTranslationList", "Lcom/xiaomi/fitness/nfc/ui/issued/VisaTranslationAdapter;", "visaTranslationAdapter", "Lcom/xiaomi/fitness/nfc/ui/issued/VisaTranslationAdapter;", "<init>", "()V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MasterTranslationFragment extends BaseCardFragment<MasterTranslationViewModel, bpg> {

    @Nullable
    private MasterTranslationAdapter masterTranslationAdapter;

    @NotNull
    private List<Transaction> masterTranslationList;

    @Nullable
    private VisaTranslationAdapter visaTranslationAdapter;

    @NotNull
    private List<EncTransactionInfo> visaTranslationList;

    public MasterTranslationFragment() {
        super(sui.S, 0, true);
        this.masterTranslationList = new ArrayList();
        this.visaTranslationList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(Transaction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(EncTransactionInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(MasterTranslationFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        if (it.isEmpty()) {
            PageState.DefaultImpls.showEmpty$default(this$0, o0j.y4, 0, 2, null);
        } else {
            this$0.visaTranslationList.clear();
            this$0.visaTranslationList.addAll(it);
            VisaTranslationAdapter visaTranslationAdapter = this$0.visaTranslationAdapter;
            if (visaTranslationAdapter != null) {
                visaTranslationAdapter.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3(MasterTranslationFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        ToastUtil.showShortToast(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(MasterTranslationFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.dismissDialog();
        if (it.isEmpty()) {
            PageState.DefaultImpls.showEmpty$default(this$0, o0j.y4, 0, 2, null);
        } else {
            this$0.masterTranslationList.clear();
            this$0.masterTranslationList.addAll(it);
            MasterTranslationAdapter masterTranslationAdapter = this$0.masterTranslationAdapter;
            if (masterTranslationAdapter != null) {
                masterTranslationAdapter.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$5(MasterTranslationFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            String string = this$0.getString(o0j.a7);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastExtKt.toastShort(mActivity, string);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull bpg bpgVar) {
        BankCard bankCard;
        BankCard bankCard2;
        Intrinsics.checkNotNullParameter(bpgVar, "<this>");
        setTitle(o0j.Y0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getMActivity());
        linearLayoutManager.setStackFromEnd(true);
        linearLayoutManager.setReverseLayout(true);
        bpgVar.A.setLayoutManager(linearLayoutManager);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.masterTranslationAdapter = new MasterTranslationAdapter(mActivity, this.masterTranslationList, new Function1() { // from class: h7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterTranslationFragment.bindView$lambda$0((Transaction) obj);
            }
        });
        FragmentActivity mActivity2 = getMActivity();
        Intrinsics.checkNotNull(mActivity2);
        this.visaTranslationAdapter = new VisaTranslationAdapter(mActivity2, this.visaTranslationList, new Function1() { // from class: i7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterTranslationFragment.bindView$lambda$1((EncTransactionInfo) obj);
            }
        });
        CardWrapper cardWrapper = getCardWrapper();
        if (cardWrapper == null || (bankCard2 = cardWrapper.bankCard) == null || bankCard2.getCardType() != 2) {
            bpgVar.A.setAdapter(this.masterTranslationAdapter);
        } else {
            bpgVar.A.setAdapter(this.visaTranslationAdapter);
        }
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        CardWrapper cardWrapper2 = getCardWrapper();
        if (cardWrapper2 == null || (bankCard = cardWrapper2.bankCard) == null || bankCard.getCardType() != 2) {
            MasterTranslationViewModel masterTranslationViewModel = (MasterTranslationViewModel) getMViewModel();
            CardWrapper cardWrapper3 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper3);
            masterTranslationViewModel.list(cardWrapper3, new Function1() { // from class: l7f
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MasterTranslationFragment.bindView$lambda$4(this.f24739a, (List) obj);
                }
            }, new Function1() { // from class: m7f
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MasterTranslationFragment.bindView$lambda$5(this.f25839a, (String) obj);
                }
            });
            return;
        }
        MasterTranslationViewModel masterTranslationViewModel2 = (MasterTranslationViewModel) getMViewModel();
        CardWrapper cardWrapper4 = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper4);
        masterTranslationViewModel2.getVisaTransactions(cardWrapper4, new Function1() { // from class: j7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterTranslationFragment.bindView$lambda$2(this.f22487a, (List) obj);
            }
        }, new Function1() { // from class: k7f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterTranslationFragment.bindView$lambda$3(this.f23553a, (String) obj);
            }
        });
    }
}

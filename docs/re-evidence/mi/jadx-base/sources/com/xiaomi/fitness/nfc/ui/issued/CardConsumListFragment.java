package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import com.tsmclient.smartcard.model.TradeLog;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CardConsumListFragment;
import defpackage.hng;
import defpackage.qei;
import defpackage.sui;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardConsumListFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/TransitionCardRecordViewModel;", "Lhng;", "", "loadRecord", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lqei;", "mAdapter", "Lqei;", "getMAdapter", "()Lqei;", "setMAdapter", "(Lqei;)V", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardConsumListFragment extends BaseCardFragment<TransitionCardRecordViewModel, hng> {
    public qei mAdapter;

    public CardConsumListFragment() {
        super(sui.v, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadRecord() {
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        final List<TradeLog> tradeLogs = cardWrapper.getTradeLogs();
        if (tradeLogs == null || tradeLogs.isEmpty()) {
            TransitionCardRecordViewModel transitionCardRecordViewModel = (TransitionCardRecordViewModel) getMViewModel();
            CardWrapper cardWrapper2 = getCardWrapper();
            Intrinsics.checkNotNull(cardWrapper2);
            transitionCardRecordViewModel.updateCard(cardWrapper2, new Function1() { // from class: bm3
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CardConsumListFragment.loadRecord$lambda$0(tradeLogs, this, (CardWrapper) obj);
                }
            });
            return;
        }
        if (tradeLogs.isEmpty()) {
            ((hng) getMBinding()).A.setVisibility(0);
            ((hng) getMBinding()).B.setVisibility(8);
            return;
        }
        getMAdapter().b(tradeLogs);
        if (getMAdapter().getCount() == 0) {
            ((hng) getMBinding()).A.setVisibility(0);
        } else {
            ((hng) getMBinding()).A.setVisibility(8);
        }
        ((hng) getMBinding()).B.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadRecord$lambda$0(List list, CardConsumListFragment this$0, CardWrapper it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (list == null || list.isEmpty()) {
            ((hng) this$0.getMBinding()).A.setVisibility(0);
            ((hng) this$0.getMBinding()).B.setVisibility(8);
        } else {
            ((hng) this$0.getMBinding()).A.setVisibility(8);
            ((hng) this$0.getMBinding()).B.setVisibility(0);
            this$0.getMAdapter().b(list);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final qei getMAdapter() {
        qei qeiVar = this.mAdapter;
        if (qeiVar != null) {
            return qeiVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        setMAdapter(new qei(getMActivity(), true));
        ((hng) getMBinding()).B.setAdapter((ListAdapter) getMAdapter());
        loadRecord();
    }

    public final void setMAdapter(@NotNull qei qeiVar) {
        Intrinsics.checkNotNullParameter(qeiVar, "<set-?>");
        this.mAdapter = qeiVar;
    }
}

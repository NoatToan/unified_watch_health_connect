package com.xiaomi.fitness.nfc.ui.issued;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.miui.tsmclient.sesdk.OrderData;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.CardOrderDetailFragment;
import com.xiaomi.fitness.nfc.ui.issued.CardRechargeListFragment;
import defpackage.gq3;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.tng;
import defpackage.zl3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardRechargeListFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/TransitionCardRecordViewModel;", "Ltng;", "", "loadRecord", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lgq3;", "mAdapter", "Lgq3;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardRechargeListFragment extends BaseCardFragment<TransitionCardRecordViewModel, tng> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int sRequestCode = 10;
    private gq3 mAdapter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardRechargeListFragment$Companion;", "", "<init>", "()V", "sRequestCode", "", "getSRequestCode", "()I", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSRequestCode() {
            return CardRechargeListFragment.sRequestCode;
        }
    }

    public CardRechargeListFragment() {
        super(sui.B, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadRecord() {
        TransitionCardRecordViewModel transitionCardRecordViewModel = (TransitionCardRecordViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        transitionCardRecordViewModel.loadOrderRecorderList(cardWrapper, new Function1() { // from class: eq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardRechargeListFragment.loadRecord$lambda$1(this.f16950a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadRecord$lambda$1(CardRechargeListFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        gq3 gq3Var = this$0.mAdapter;
        if (gq3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            gq3Var = null;
        }
        gq3Var.c(it);
        if (it.isEmpty()) {
            ((tng) this$0.getMBinding()).A.setVisibility(0);
            ((tng) this$0.getMBinding()).C.setVisibility(8);
        } else {
            ((tng) this$0.getMBinding()).A.setVisibility(8);
            ((tng) this$0.getMBinding()).C.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(CardRechargeListFragment this$0, AdapterView adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        gq3 gq3Var = this$0.mAdapter;
        if (gq3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            gq3Var = null;
        }
        OrderData.OrderRecord item = gq3Var.getItem(i);
        if (TextUtils.isEmpty(item.getStatusDesc())) {
            ToastUtil.showLongToast(o0j.m5);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(CardOrderDetailFragment.sIsFromIssue, false);
        bundle.putString(CardOrderDetailFragment.sOrderId, item.getOrderId());
        bundle.putInt(CardOrderDetailFragment.sAmount, item.getAmount());
        zl3.g().l(this$0.getCardWrapper());
        this$0.gotoPageForResult(CardOrderDetailFragment.class, bundle, sRequestCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.e);
        ((tng) getMBinding()).B.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        this.mAdapter = new gq3(getMActivity());
        ListView listView = ((tng) getMBinding()).C;
        gq3 gq3Var = this.mAdapter;
        gq3 gq3Var2 = null;
        if (gq3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            gq3Var = null;
        }
        listView.setAdapter((ListAdapter) gq3Var);
        ((tng) getMBinding()).C.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: fq3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                CardRechargeListFragment.onViewCreated$lambda$0(this.f18076a, adapterView, view2, i, j);
            }
        });
        gq3 gq3Var3 = this.mAdapter;
        if (gq3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            gq3Var2 = gq3Var3;
        }
        if (gq3Var2.getCount() == 0) {
            loadRecord();
        }
    }
}

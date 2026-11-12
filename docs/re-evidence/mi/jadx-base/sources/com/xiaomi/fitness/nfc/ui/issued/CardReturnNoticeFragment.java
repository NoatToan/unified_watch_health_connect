package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.entity.RefundChannelInfo;
import com.miui.tsmclient.sesdk.SeCard;
import com.xiaomi.fitness.baseui.extension.BaseFragmentExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.ui.issued.CardReturnNoticeFragment;
import com.xiaomi.fitness.nfc.ui.issued.auth.ReturnCardFragment;
import com.xiaomi.fitness.nfc.widget.FullyLinearLayoutManager;
import defpackage.jtk;
import defpackage.nrf;
import defpackage.o0j;
import defpackage.pli;
import defpackage.stk;
import defpackage.sui;
import defpackage.zng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00010B\u0007¢\u0006\u0004\b/\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\u0007J#\u0010\u0011\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnNoticeFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/CardReturnNoticeViewModel;", "Lzng;", "Lcom/xiaomi/fitness/nfc/ui/issued/r$a;", "", "loadReasonList", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "Lstk;", "returnReasonEntry", "onItemClick", "(Landroid/view/View;Lstk;)V", "", "isNeedMessageEvent", "()Z", "Lnrf;", "event", "onMessageEvent", "(Lnrf;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "reasonList", "Ljava/util/List;", "Lcom/xiaomi/fitness/nfc/ui/issued/r;", "adapter", "Lcom/xiaomi/fitness/nfc/ui/issued/r;", "getAdapter", "()Lcom/xiaomi/fitness/nfc/ui/issued/r;", "setAdapter", "(Lcom/xiaomi/fitness/nfc/ui/issued/r;)V", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCardReturnNoticeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardReturnNoticeFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/CardReturnNoticeFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1863#2,2:154\n*S KotlinDebug\n*F\n+ 1 CardReturnNoticeFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/CardReturnNoticeFragment\n*L\n65#1:154,2\n*E\n"})
public final class CardReturnNoticeFragment extends BaseCardFragment<CardReturnNoticeViewModel, zng> implements r.a {

    @NotNull
    public static final String PARAM_AUTH_KEY = "ALIPAY_AUTH";

    @Nullable
    private r adapter;

    @NotNull
    private final List<stk> reasonList;
    private static final int sRequestCodeUserInfo = 10;

    public CardReturnNoticeFragment() {
        super(sui.E, 0, true);
        this.reasonList = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadReasonList() {
        CardReturnNoticeViewModel cardReturnNoticeViewModel = (CardReturnNoticeViewModel) getMViewModel();
        CardWrapper cardWrapper = getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        cardReturnNoticeViewModel.getReturnReasons(cardWrapper, new Function1() { // from class: uq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeFragment.loadReasonList$lambda$4(this.f36019a, (List) obj);
            }
        }, new Function1() { // from class: vq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeFragment.loadReasonList$lambda$5((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadReasonList$lambda$4(CardReturnNoticeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(list, "list");
        if (list.isEmpty()) {
            ((zng) this$0.getMBinding()).A.setEnabled(true);
        } else {
            this$0.reasonList.clear();
            this$0.reasonList.addAll(list);
            r rVar = this$0.adapter;
            if (rVar != null) {
                rVar.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadReasonList$lambda$5(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtil.showShortToast(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$3(final CardReturnNoticeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardReturnNoticeViewModel cardReturnNoticeViewModel = (CardReturnNoticeViewModel) this$0.getMViewModel();
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        CardWrapper cardWrapper = this$0.getCardWrapper();
        Intrinsics.checkNotNull(cardWrapper);
        SeCard mSeCard = cardWrapper.mSeCard;
        Intrinsics.checkNotNullExpressionValue(mSeCard, "mSeCard");
        cardReturnNoticeViewModel.refundChannels(mActivity, mSeCard, new Function1() { // from class: sq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeFragment.setListener$lambda$3$lambda$1(this.f33880a, (ArrayList) obj);
            }
        }, new Function1() { // from class: tq3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardReturnNoticeFragment.setListener$lambda$3$lambda$2(this.f34936a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3$lambda$1(CardReturnNoticeFragment this$0, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            RefundChannelInfo refundChannelInfo = null;
            boolean z = false;
            RefundChannelInfo refundChannelInfo2 = null;
            while (it.hasNext()) {
                RefundChannelInfo refundChannelInfo3 = (RefundChannelInfo) it.next();
                if (refundChannelInfo3.getMode() == RefundChannelInfo.ReturnFeeMode.AUTH) {
                    z = true;
                    refundChannelInfo2 = refundChannelInfo3;
                }
            }
            if (z) {
                Bundle bundle = new Bundle();
                Gson gson = new Gson();
                if (refundChannelInfo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("info");
                } else {
                    refundChannelInfo = refundChannelInfo2;
                }
                bundle.putString(PARAM_AUTH_KEY, gson.toJson(refundChannelInfo));
                this$0.gotoPageForResult(ReturnCardFragment.class, bundle, sRequestCodeUserInfo);
            } else {
                this$0.gotoPageForResult(CardReturnUserInfoFragment.class, null, sRequestCodeUserInfo);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3$lambda$2(CardReturnNoticeFragment this$0, String str) {
        FragmentActivity mActivity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str != null && str.length() != 0 && (mActivity = this$0.getMActivity()) != null) {
            ToastExtKt.toastLong(mActivity, str);
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final r getAdapter() {
        return this.adapter;
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedMessageEvent() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == sRequestCodeUserInfo && resultCode == -1) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimensionPixelSize = AppUtil.getApp().getResources().getDimensionPixelSize(pli.n);
        ((zng) getMBinding()).B.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        if (SettingsPropertiesUtil.INSTANCE.isFolded(AppUtil.getApp())) {
            ViewGroup.LayoutParams layoutParams = ((zng) getMBinding()).A.getLayoutParams();
            layoutParams.width = -1;
            ((zng) getMBinding()).A.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = ((zng) getMBinding()).A.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.width = BaseFragmentExtKt.getDimensionPixelOffset(this, pli.common_btn_single_line_width);
            layoutParams3.gravity = 1;
            ((zng) getMBinding()).A.setLayoutParams(layoutParams3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.nfc.ui.issued.r.a
    public void onItemClick(@Nullable View view, @Nullable stk returnReasonEntry) {
        ((zng) getMBinding()).A.setEnabled(true);
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public void onMessageEvent(@NotNull nrf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        if (event instanceof jtk) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.c6);
        r rVar = new r(this.reasonList);
        this.adapter = rVar;
        rVar.o(this);
        ((zng) getMBinding()).C.setAdapter(this.adapter);
        ((zng) getMBinding()).C.setLayoutManager(new FullyLinearLayoutManager(getMActivity()));
        ((zng) getMBinding()).C.setAdapter(this.adapter);
        ((zng) getMBinding()).C.setNestedScrollingEnabled(false);
        ((zng) getMBinding()).A.setEnabled(false);
        loadReasonList();
    }

    public final void setAdapter(@Nullable r rVar) {
        this.adapter = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((zng) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: wq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardReturnNoticeFragment.setListener$lambda$3(this.f38245a, view);
            }
        });
    }
}

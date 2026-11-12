package com.xiaomi.fitness.nfc.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.pay.WebActivity;
import com.xiaomi.fitness.nfc.ui.CardListFragment;
import com.xiaomi.fitness.nfc.ui.issued.TransitCardDetailFragment;
import defpackage.av6;
import defpackage.lng;
import defpackage.m4i;
import defpackage.mri;
import defpackage.nrf;
import defpackage.o0j;
import defpackage.pf4;
import defpackage.sui;
import defpackage.wni;
import defpackage.yhq;
import defpackage.yl3;
import defpackage.zl3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0013\u0010\u0010\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\nR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/CardListFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/CardListViewModel;", "Llng;", "", "onOtherIdDialog", "()V", "loadList", "", "hasLocationPermission", "()Z", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "cardInfo", "startOtherActivity", "(Lcom/xiaomi/fitness/nfc/bean/CardWrapper;)V", "isNeedCardInfo", "bindView", "(Llng;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "isNeedMessageEvent", "Lnrf;", "event", "onMessageEvent", "(Lnrf;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onBackPressed", "Lcom/xiaomi/fitness/nfc/ui/f;", "adapter", "Lcom/xiaomi/fitness/nfc/ui/f;", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CardListFragment extends BaseCardFragment<CardListViewModel, lng> {
    public static final int sRequestCodeCardDetail = 20;
    public static final int sRequestCodeCardintro = 10;

    @Nullable
    private f<CardWrapper> adapter;

    public CardListFragment() {
        super(sui.x, 0, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ lng access$getMBinding(CardListFragment cardListFragment) {
        return (lng) cardListFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, android.widget.PopupWindow] */
    public static final void bindView$lambda$3(final CardListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            View viewInflate = View.inflate(mActivity, sui.E0, null);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new PopupWindow(viewInflate, -2, -2, true);
            viewInflate.findViewById(mri.Q2).setOnClickListener(new View.OnClickListener() { // from class: um3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CardListFragment.bindView$lambda$3$lambda$2$lambda$0(this.f35922a, objectRef, view2);
                }
            });
            viewInflate.findViewById(mri.B1).setOnClickListener(new View.OnClickListener() { // from class: vm3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CardListFragment.bindView$lambda$3$lambda$2$lambda$1(this.f37017a, objectRef, view2);
                }
            });
            ((PopupWindow) objectRef.element).setBackgroundDrawable(new ColorDrawable(0));
            m4i.c((PopupWindow) objectRef.element, view, 0, 0, 80);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$3$lambda$2$lambda$0(CardListFragment this$0, Ref.ObjectRef popupWindow, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(popupWindow, "$popupWindow");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) WebActivity.class);
        if (yhq.c.b()) {
            intent.putExtra(pf4.f30343b, "https://staging2.sf.pay.xiaomi.com/views/refundCard/index.html");
            intent.putExtra(pf4.c, this$0.getString(o0j.i6));
        } else {
            intent.putExtra(pf4.f30343b, "https://sf.pay.xiaomi.com/views/refundCard/index.html");
            intent.putExtra(pf4.c, this$0.getString(o0j.i6));
        }
        this$0.startActivity(intent);
        ((PopupWindow) popupWindow.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$3$lambda$2$lambda$1(CardListFragment this$0, Ref.ObjectRef popupWindow, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(popupWindow, "$popupWindow");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) WebActivity.class);
        intent.putExtra(pf4.f30343b, pf4.h());
        intent.putExtra(pf4.c, this$0.getString(o0j.X0));
        this$0.startActivity(intent);
        ((PopupWindow) popupWindow.element).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(CardListFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardWrapper cardWrapper = zl3.g().d.get(i);
        if ((cardWrapper.hasIssueNoComplete() || cardWrapper.hasTransferInOrder() || cardWrapper.hasTransferOutOrder()) && !TextUtils.isEmpty(cardWrapper.userIdMismatchDesc)) {
            this$0.onOtherIdDialog();
            return;
        }
        if (cardWrapper.hasIssueNoComplete()) {
            String issueStatusDesc = cardWrapper.getIssueStatusDesc();
            int issueStatus = cardWrapper.getIssueStatus();
            ToastUtil.showShortToast(issueStatusDesc);
            if (issueStatus == 4) {
                return;
            }
            ToastUtil.showShortToast(cardWrapper.getRechargeStatusDesc());
            if (cardWrapper.getRechargeStatus() == 4) {
                return;
            }
        }
        this$0.startOtherActivity(cardWrapper);
    }

    private final boolean hasLocationPermission() {
        return !PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.ACCESS_COARSE_LOCATION"});
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadList() {
        showLoading();
        ((CardListViewModel) getMViewModel()).loadCardList(new Function1() { // from class: qm3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListFragment.loadList$lambda$5(this.f31648a, (List) obj);
            }
        }, new Function1() { // from class: rm3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListFragment.loadList$lambda$6(this.f32696a, (String) obj);
            }
        });
        setBulltetTag("cardList");
        ((CardListViewModel) getMViewModel()).loadBulletDialog(null, getBulltetTag(), new Function1() { // from class: sm3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListFragment.loadList$lambda$7(this.f33776a, (List) obj);
            }
        });
        ((CardListViewModel) getMViewModel()).loadBullet(null, "trafficCardListBulletin", new Function1() { // from class: tm3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CardListFragment.loadList$lambda$8(this.f34844a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadList$lambda$5(CardListFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new CardListFragment$loadList$1$1(this$0, it, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadList$lambda$6(CardListFragment this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new CardListFragment$loadList$2$1(this$0, it, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadList$lambda$7(CardListFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new CardListFragment$loadList$3$1(this$0, it, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadList$lambda$8(CardListFragment this$0, String tips) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tips, "tips");
        AnyExtKt.main$default(null, new CardListFragment$loadList$4$1(tips, this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    private final void onOtherIdDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("CardListFragment.card.error").setDialogTitle(o0j.r0).setDialogDescription(o0j.X6).setPositiveText(o0j.u2).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.CardListFragment.onOtherIdDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -1 || dialog == null) {
                    return;
                }
                dialog.dismiss();
            }
        });
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    private final void startOtherActivity(CardWrapper cardInfo) {
        if (cardInfo == null) {
            return;
        }
        zl3.g().l(cardInfo);
        Bundle bundle = new Bundle();
        if (cardInfo.mHasIssue) {
            gotoPageForResult(TransitCardDetailFragment.class, null, 20);
            return;
        }
        Intent intent = new Intent(getMActivity(), (Class<?>) IssuerActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull lng lngVar) {
        Intrinsics.checkNotNullParameter(lngVar, "<this>");
        this.adapter = new f<>(getMActivity(), getChildFragmentManager());
        setTitle(o0j.Z6);
        ((lng) getMBinding()).B.setLayoutManager(new LinearLayoutManager(getActivity()));
        ((lng) getMBinding()).B.setAdapter(this.adapter);
        IActionBar.DefaultImpls.setEndView$default(this, 0, wni.e, getString(o0j.v2), new View.OnClickListener() { // from class: om3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CardListFragment.bindView$lambda$3(this.f29287a, view);
            }
        }, 1, null);
        loadList();
        f<CardWrapper> fVar = this.adapter;
        if (fVar != null) {
            fVar.setItemClickListener(new f.c() { // from class: pm3
                @Override // com.xiaomi.fitness.nfc.ui.f.c
                public final void onItemClick(int i) {
                    CardListFragment.bindView$lambda$4(this.f30533a, i);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedMessageEvent() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 10) {
            if (requestCode == 20 && resultCode == -1) {
                FragmentActivity mActivity = getMActivity();
                if (mActivity != null) {
                    mActivity.setResult(-1);
                }
                finish();
                return;
            }
            return;
        }
        if (resultCode != -1) {
            loadList();
            return;
        }
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            mActivity2.setResult(-1);
        }
        finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.finish();
        }
        return super.onBackPressed();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        f<CardWrapper> fVar = this.adapter;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public void onMessageEvent(@NotNull nrf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        if (event instanceof yl3) {
            loadList();
        }
    }
}

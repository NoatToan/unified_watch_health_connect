package com.xiaomi.fitness.nfc.ui.issued;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardManagerBean;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBean;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoBeanKt;
import com.xiaomi.fitness.nfc.ui.CardManaerListAdapter;
import com.xiaomi.fitness.nfc.ui.issued.YoYoCardListFragment;
import com.xiaomi.fitness.nfc.widget.CardListView;
import com.xiaomi.fitness.nfc.widget.RecyclerViewSpacesItemDecoration;
import defpackage.av6;
import defpackage.nqg;
import defpackage.nrf;
import defpackage.o0j;
import defpackage.sui;
import defpackage.yl3;
import defpackage.zl3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001a\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/YoYoCardListFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/YoYoCardViewModel;", "Lnqg;", "", "loadCardList", "()V", "", "msg", "showLoadErrorDilog", "(Ljava/lang/String;)V", "showDeleteCarDialog", "deleteCarCard", "", "isNeedCardInfo", "()Z", "bindView", "(Lnqg;)V", "isNeedMessageEvent", "Lnrf;", "event", "onMessageEvent", "(Lnrf;)V", "", "mSpanSize", "I", "com/xiaomi/fitness/nfc/ui/issued/YoYoCardListFragment$loop$1", "loop", "Lcom/xiaomi/fitness/nfc/ui/issued/YoYoCardListFragment$loop$1;", "", "Lcom/xiaomi/fitness/nfc/bean/CardManagerBean;", "dataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/nfc/ui/CardManaerListAdapter;", "adapter", "Lcom/xiaomi/fitness/nfc/ui/CardManaerListAdapter;", "cardFace", "Ljava/lang/String;", "<init>", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class YoYoCardListFragment extends BaseCardFragment<YoYoCardViewModel, nqg> {

    @Nullable
    private CardManaerListAdapter adapter;

    @NotNull
    private String cardFace;

    @NotNull
    private List<CardManagerBean> dataList;

    @NotNull
    private YoYoCardListFragment$loop$1 loop;
    private int mSpanSize;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.fitness.nfc.ui.issued.YoYoCardListFragment$loop$1] */
    public YoYoCardListFragment() {
        super(sui.m0, 0, true);
        this.mSpanSize = 1;
        this.loop = new GridLayoutManager.b() { // from class: com.xiaomi.fitness.nfc.ui.issued.YoYoCardListFragment$loop$1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return this.this$0.mSpanSize;
            }
        };
        this.dataList = new ArrayList();
        this.cardFace = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void deleteCarCard() {
        showLoading(o0j.Z2, false);
        ((YoYoCardViewModel) getMViewModel()).removeCard(new Function0() { // from class: nzr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return YoYoCardListFragment.deleteCarCard$lambda$2(this.f28597a);
            }
        }, new Function1() { // from class: ozr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YoYoCardListFragment.deleteCarCard$lambda$3(this.f29853a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCarCard$lambda$2(YoYoCardListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ToastUtil.showShortToast(o0j.i3);
        this$0.dismissDialogForce();
        this$0.loadCardList();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteCarCard$lambda$3(YoYoCardListFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        ToastUtil.showLongToast(msg);
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loadCardList() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        ((YoYoCardViewModel) getMViewModel()).loadCard(new Function1() { // from class: pzr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YoYoCardListFragment.loadCardList$lambda$0(this.f30943a, (CardInfoBean) obj);
            }
        }, new Function1() { // from class: qzr
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return YoYoCardListFragment.loadCardList$lambda$1(this.f32037a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCardList$lambda$0(YoYoCardListFragment this$0, CardInfoBean cardInfoBean) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cardInfoBean, "cardInfoBean");
        List<CardWrapper> list = this$0.dataList.get(0).getList();
        list.clear();
        this$0.cardFace = cardInfoBean.getCardLayout();
        if (Intrinsics.areEqual(cardInfoBean.getCardStatus(), "00") || Intrinsics.areEqual(cardInfoBean.getCardStatus(), CardInfoBeanKt.sStatusDisableCard)) {
            list.add(new CardWrapper(cardInfoBean, Boolean.valueOf(Intrinsics.areEqual(cardInfoBean.getCardStatus(), CardInfoBeanKt.sStatusDisableCard))));
            if (Intrinsics.areEqual(cardInfoBean.getCardStatus(), CardInfoBeanKt.sStatusDisableCard)) {
                this$0.showDeleteCarDialog();
            }
        }
        CardManaerListAdapter cardManaerListAdapter = this$0.adapter;
        if (cardManaerListAdapter != null) {
            cardManaerListAdapter.notifyDataSetChanged();
        }
        this$0.dismissDialogForce();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadCardList$lambda$1(YoYoCardListFragment this$0, String msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this$0.dismissDialogForce();
        this$0.showLoadErrorDilog(msg);
        return Unit.INSTANCE;
    }

    private final void showDeleteCarDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("showDeleteCarDialog").setDialogTitle(o0j.H7).setDialogDescription(o0j.G7).setPositiveText(o0j.m2).setCancelable(false).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.issued.YoYoCardListFragment.showDeleteCarDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -1) {
                    YoYoCardListFragment.this.deleteCarCard();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final void showLoadErrorDilog(String msg) {
        CommonDialog commonDialogCreate = new CommonDialog.c("showLoadErrorList").setDialogTitle(o0j.common_load_fail).setDialogDescriptionString(new DialogParams.DialogDescriptionString(msg)).setNegativeText(o0j.j2).setPositiveText(o0j.z2).setDialogDescriptionString(new DialogParams.DialogDescriptionString(msg)).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.nfc.ui.issued.YoYoCardListFragment.showLoadErrorDilog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    YoYoCardListFragment.this.finish();
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    YoYoCardListFragment.this.loadCardList();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull nqg nqgVar) {
        Intrinsics.checkNotNullParameter(nqgVar, "<this>");
        setTitle(o0j.b4);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.adapter = new CardManaerListAdapter(fragmentActivityRequireActivity, this.dataList, new CardListView.CardListViewListener() { // from class: com.xiaomi.fitness.nfc.ui.issued.YoYoCardListFragment.bindView.1
            @Override // com.xiaomi.fitness.nfc.widget.CardListView.CardListViewListener
            public void onAddViewClicked(int cardCategory) {
                Bundle bundle = new Bundle();
                bundle.putString(YoYoPreIssueFragment.sCardFace, YoYoCardListFragment.this.cardFace);
                YoYoCardListFragment.this.gotoPage(YoYoPreIssueFragment.class, bundle);
            }

            @Override // com.xiaomi.fitness.nfc.widget.CardListView.CardListViewListener
            public void onCardClicked(CardWrapper cardInfo) {
                Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
                zl3.g().l(cardInfo);
                BaseCardFragment.gotoPage$default(YoYoCardListFragment.this, YoYoDetailFragment.class, null, 2, null);
            }
        });
        SettingsPropertiesUtil settingsPropertiesUtil = SettingsPropertiesUtil.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        this.mSpanSize = settingsPropertiesUtil.isFolded(fragmentActivityRequireActivity2) ? 2 : 1;
        this.dataList.clear();
        this.dataList.add(new CardManagerBean(3));
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) requireActivity(), 2, 1, false);
        nqgVar.A.setLayoutManager(gridLayoutManager);
        gridLayoutManager.D(this.loop);
        nqgVar.A.addItemDecoration(new RecyclerViewSpacesItemDecoration(0, 0, 0, 0, 15, null));
        nqgVar.A.setAdapter(this.adapter);
        loadCardList();
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedCardInfo() {
        return false;
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public boolean isNeedMessageEvent() {
        return true;
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public void onMessageEvent(@NotNull nrf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        if (event instanceof yl3) {
            loadCardList();
        }
    }
}

package com.xiaomi.fitness.nfc.ui.issued;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.common.utils.ViewUtil;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.AddCardNumberFragment;
import com.xiaomi.fitness.nfc.ui.SyncEseFragment;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.nrf;
import defpackage.o0j;
import defpackage.pli;
import defpackage.sui;
import defpackage.wni;
import defpackage.yl3;
import defpackage.zl3;
import defpackage.zog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001@B\u0007¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0006J)\u0010'\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010\u0019J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/MasterCardListFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/issued/MasterCardListViewModel;", "Lzog;", "", "checkUserBind", "()V", "loadMasterList", "", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "list", "queryInvalidateCard", "(Ljava/util/List;)V", "updateCardViews", "Landroid/widget/FrameLayout;", "viewGroup", "cardInfo", "", "index", "addCardView", "(Landroid/widget/FrameLayout;Lcom/xiaomi/fitness/nfc/bean/CardWrapper;I)V", "gotoAddCard", "setLayoutManager", "", "isNeedCardInfo", "()Z", "bindView", "(Lzog;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "isNeedMessageEvent", "Lnrf;", "event", "onMessageEvent", "(Lnrf;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/xiaomi/fitness/nfc/ui/issued/MasterCardListAdapter;", "masterCardListAdapter", "Lcom/xiaomi/fitness/nfc/ui/issued/MasterCardListAdapter;", "masterCardListData", "Ljava/util/List;", "cardWidth", "I", "cardHeight", "shouldUpdateCardList", "Z", "getColCountPerRow", "()I", "colCountPerRow", "<init>", "Companion", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMasterCardListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MasterCardListFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/MasterCardListFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,292:1\n54#2,3:293\n24#2:296\n59#2,6:297\n*S KotlinDebug\n*F\n+ 1 MasterCardListFragment.kt\ncom/xiaomi/fitness/nfc/ui/issued/MasterCardListFragment\n*L\n233#1:293,3\n233#1:296\n233#1:297,6\n*E\n"})
public final class MasterCardListFragment extends BaseCardFragment<MasterCardListViewModel, zog> {
    public static final int sRequestCodeDetail = 10;
    private int cardHeight;
    private int cardWidth;

    @Nullable
    private MasterCardListAdapter masterCardListAdapter;

    @NotNull
    private List<CardWrapper> masterCardListData;
    private boolean shouldUpdateCardList;

    public MasterCardListFragment() {
        super(sui.R, 0, true);
        this.masterCardListData = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ zog access$getMBinding(MasterCardListFragment masterCardListFragment) {
        return (zog) masterCardListFragment.getMBinding();
    }

    private final void addCardView(FrameLayout viewGroup, final CardWrapper cardInfo, int index) {
        View childAt = viewGroup.getChildAt(index);
        ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
        if (imageView == null) {
            imageView = new ImageView(getMActivity());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.cardWidth, this.cardHeight);
            layoutParams.topMargin = ExtUtilsKt.getDp(50);
            imageView.setLayoutParams(layoutParams);
            viewGroup.addView(imageView, index, layoutParams);
        }
        String cardFace = cardInfo.getCardFace();
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(cardFace).target(imageView);
        builderTarget.transformations(new RoundedCornersTransformation(DisplayUtil.dip2px(16.0f)));
        imageLoader.enqueue(builderTarget.build());
        imageView.setOnClickListener(new View.OnClickListener() { // from class: u6f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MasterCardListFragment.addCardView$lambda$10(cardInfo, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCardView$lambda$10(CardWrapper cardInfo, MasterCardListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(cardInfo, "$cardInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zl3.g().l(cardInfo);
        this$0.gotoPageForResult(BankCardDetailFragment.class, null, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(MasterCardListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putBoolean("sIsMaster", true);
        this$0.gotoPage(SyncEseFragment.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$3(final MasterCardListFragment this$0, final View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ViewUtil.INSTANCE.isFastClick()) {
            return;
        }
        view.setEnabled(false);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            ToastUtil.showShortToast(o0j.q2);
        } else if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            view.setEnabled(true);
            this$0.gotoAddCard();
        } else {
            this$0.showLoading(o0j.g2, false);
            ((MasterCardListViewModel) this$0.getMViewModel()).blePrepare(new Function0() { // from class: q6f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MasterCardListFragment.bindView$lambda$3$lambda$1(this.f31166a, view);
                }
            }, new Function1() { // from class: r6f
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MasterCardListFragment.bindView$lambda$3$lambda$2(this.f32240a, view, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$1(MasterCardListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        this$0.gotoAddCard();
        view.setEnabled(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$2(MasterCardListFragment this$0, View view, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        ToastUtil.showShortToast(str);
        view.setEnabled(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void checkUserBind() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        if (NfcPreference.INSTANCE.isCheckUserBind()) {
            loadMasterList();
        } else {
            ((MasterCardListViewModel) getMViewModel()).checkPreAccountData(new Function2() { // from class: t6f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MasterCardListFragment.checkUserBind$lambda$5(this.f34371a, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUserBind$lambda$5(MasterCardListFragment this$0, boolean z, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new MasterCardListFragment$checkUserBind$1$1(z, this$0, str, null), 1, null);
        return Unit.INSTANCE;
    }

    private final int getColCountPerRow() {
        Application application;
        if (!SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndNotFolded()) {
            UIUtils uIUtils = UIUtils.INSTANCE;
            if (!uIUtils.isTablet() || (application = ApplicationExtKt.getApplication()) == null || !uIUtils.isLandscape(application)) {
                return 1;
            }
        }
        return 3;
    }

    private final void gotoAddCard() {
        this.shouldUpdateCardList = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("sIsMaster", true);
        gotoPage(AddCardNumberFragment.class, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void loadMasterList() {
        ((MasterCardListViewModel) getMViewModel()).loadList(new Function1() { // from class: o6f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterCardListFragment.loadMasterList$lambda$6(this.f28792a, (List) obj);
            }
        }, new Function0() { // from class: p6f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MasterCardListFragment.loadMasterList$lambda$7(this.f30060a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMasterList$lambda$6(MasterCardListFragment this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        AnyExtKt.main$default(null, new MasterCardListFragment$loadMasterList$1$1(it, this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadMasterList$lambda$7(MasterCardListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnyExtKt.main$default(null, new MasterCardListFragment$loadMasterList$2$1(this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(MasterCardListFragment this$0, CardWrapper it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.shouldUpdateCardList = true;
        zl3.g().l(it);
        this$0.gotoPageForResult(BankCardDetailFragment.class, null, 10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.xiaomi.fitness.nfc.bean.CardWrapper] */
    public final void queryInvalidateCard(List<CardWrapper> list) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (CardWrapper cardWrapper : list) {
            if (cardWrapper.bankCard.getTokenStatus() == 5) {
                objectRef.element = cardWrapper;
                break;
            }
        }
        if (objectRef.element != 0) {
            String string = getString(o0j.f7);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int i = o0j.e7;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, string, i, childFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: x6f
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MasterCardListFragment.queryInvalidateCard$lambda$8(objectRef, (DialogInterface) obj);
                }
            }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit queryInvalidateCard$lambda$8(Ref.ObjectRef needIssuecardWrapper, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(needIssuecardWrapper, "$needIssuecardWrapper");
        zl3.g().l((CardWrapper) needIssuecardWrapper.element);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), getColCountPerRow());
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        ((zog) getMBinding()).B.setLayoutManager(gridLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCardViews(List<CardWrapper> list) {
        this.masterCardListData.clear();
        this.masterCardListData.addAll(list);
        MasterCardListAdapter masterCardListAdapter = this.masterCardListAdapter;
        if (masterCardListAdapter != null) {
            masterCardListAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull zog zogVar) {
        Intrinsics.checkNotNullParameter(zogVar, "<this>");
        setTitle(NfcUtils.INSTANCE.payName());
        int screenWidth = DisplayUtil.getScreenWidth() - (getResources().getDimensionPixelSize(pli.e) * 2);
        this.cardWidth = screenWidth;
        this.cardHeight = (screenWidth * 63) / 100;
        View viewInflate = LayoutInflater.from(getMActivity()).inflate(sui.P0, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        imageView.setImageResource(wni.u);
        imageView.setContentDescription(getString(o0j.L6));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: v6f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MasterCardListFragment.bindView$lambda$0(this.f36541a, view);
            }
        });
        setEndView(imageView);
        ((zog) getMBinding()).A.setOnClickListener(new View.OnClickListener() { // from class: w6f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MasterCardListFragment.bindView$lambda$3(this.f37660a, view);
            }
        });
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
        if (requestCode == 10 && resultCode == -1) {
            loadMasterList();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        setLayoutManager();
    }

    @Override // com.xiaomi.fitness.nfc.base.BaseCardFragment
    public void onMessageEvent(@NotNull nrf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        if (event instanceof yl3) {
            loadMasterList();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.shouldUpdateCardList) {
            loadMasterList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.masterCardListAdapter = new MasterCardListAdapter(mActivity, this.masterCardListData, new Function1() { // from class: s6f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MasterCardListFragment.onViewCreated$lambda$4(this.f33345a, (CardWrapper) obj);
            }
        });
        ((zog) getMBinding()).B.setAdapter(this.masterCardListAdapter);
        setLayoutManager();
        checkUserBind();
    }
}

package com.xiaomi.fitness.nfc.ui.issued;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.nfc.base.BaseCardFragment;
import com.xiaomi.fitness.nfc.ui.CardOrderDetailViewModel;
import com.xiaomi.fitness.nfc.ui.issued.TradeRecordFragment;
import com.xiaomi.fitness.nfc.widget.ScrollingTabContainer;
import defpackage.iaa;
import defpackage.o0j;
import defpackage.sui;
import defpackage.zpg;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/TradeRecordFragment;", "Lcom/xiaomi/fitness/nfc/base/BaseCardFragment;", "Lcom/xiaomi/fitness/nfc/ui/CardOrderDetailViewModel;", "Lzpg;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "()V", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/nfc/widget/ScrollingTabContainer$d;", "mTabsInfo", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/nfc/ui/issued/TradeRecordFragment$TabPagerAdapter;", "mPagerAdapter", "Lcom/xiaomi/fitness/nfc/ui/issued/TradeRecordFragment$TabPagerAdapter;", "<init>", "Companion", "TabPagerAdapter", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TradeRecordFragment extends BaseCardFragment<CardOrderDetailViewModel, zpg> {

    @NotNull
    private static final String KEY_RECORD_TYPE = "record_type";
    private static final int TAB_ITEM_CONSUME = 0;
    private static final int TAB_ITEM_RECHARGE = 1;

    @NotNull
    private static final String TRADE_RECORD_CONSUME = "consume";

    @NotNull
    private static final String TRADE_RECORD_RECHARGE = "recharge";

    @Nullable
    private TabPagerAdapter mPagerAdapter;

    @NotNull
    private final ArrayList<ScrollingTabContainer.d> mTabsInfo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/nfc/ui/issued/TradeRecordFragment$TabPagerAdapter;", "Liaa;", "", "getCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "getItem", "(I)Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Lcom/xiaomi/fitness/nfc/ui/issued/TradeRecordFragment;Landroidx/fragment/app/FragmentManager;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class TabPagerAdapter extends iaa {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TabPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
            Intrinsics.checkNotNull(fragmentManager);
        }

        @Override // defpackage.eih
        public int getCount() {
            return TradeRecordFragment.this.mTabsInfo.size();
        }

        @Override // defpackage.iaa
        @NotNull
        public Fragment getItem(int position) {
            Object obj = TradeRecordFragment.this.mTabsInfo.get(position);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            String mTag = ((ScrollingTabContainer.d) obj).c;
            Intrinsics.checkNotNullExpressionValue(mTag, "mTag");
            return TextUtils.equals(mTag, TradeRecordFragment.TRADE_RECORD_CONSUME) ? new CardConsumListFragment() : new CardRechargeListFragment();
        }
    }

    public TradeRecordFragment() {
        super(sui.f0, 0, true);
        this.mTabsInfo = new ArrayList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ zpg access$getMBinding(TradeRecordFragment tradeRecordFragment) {
        return (zpg) tradeRecordFragment.getMBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$0(TradeRecordFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((zpg) this$0.getMBinding()).B.setCurrentItem(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(o0j.Y0);
        this.mPagerAdapter = new TabPagerAdapter(getFragmentManager());
        ((zpg) getMBinding()).B.setAdapter(this.mPagerAdapter);
        ScrollingTabContainer.d dVar = new ScrollingTabContainer.d();
        dVar.f12675a = 0;
        dVar.f12676b = getString(o0j.R6);
        dVar.c = TRADE_RECORD_CONSUME;
        this.mTabsInfo.add(dVar);
        ScrollingTabContainer.d dVar2 = new ScrollingTabContainer.d();
        dVar2.f12675a = 1;
        dVar2.f12676b = getString(o0j.S6);
        dVar2.c = TRADE_RECORD_RECHARGE;
        this.mTabsInfo.add(dVar2);
        ((zpg) getMBinding()).A.d(this.mTabsInfo, 0);
        TabPagerAdapter tabPagerAdapter = this.mPagerAdapter;
        if (tabPagerAdapter != null) {
            tabPagerAdapter.notifyDataSetChanged();
        }
        ((zpg) getMBinding()).B.setCurrentItem(((zpg) getMBinding()).A.g(TRADE_RECORD_CONSUME));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        ((zpg) getMBinding()).A.setTabClickListener(new ScrollingTabContainer.c() { // from class: qop
            @Override // com.xiaomi.fitness.nfc.widget.ScrollingTabContainer.c
            public final void a(int i) {
                TradeRecordFragment.setListener$lambda$0(this.f31701a, i);
            }
        });
        ((zpg) getMBinding()).B.setOnPageChangeListener(new ViewPager.i() { // from class: com.xiaomi.fitness.nfc.ui.issued.TradeRecordFragment.setListener.2
            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageSelected(int position) {
                TradeRecordFragment.access$getMBinding(TradeRecordFragment.this).A.setTabSelected(position);
            }
        });
    }
}

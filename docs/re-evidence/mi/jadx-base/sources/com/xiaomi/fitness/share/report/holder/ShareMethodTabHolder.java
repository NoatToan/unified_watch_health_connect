package com.xiaomi.fitness.share.report.holder;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.share.report.adapter.ShareMethodAdapter;
import com.xiaomi.fitness.share.report.holder.ShareMethodTabHolder;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import defpackage.dki;
import defpackage.j1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&BQ\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/share/report/holder/ShareMethodTabHolder;", "", "", "initHolder", "()V", "removeOnTabSelectedListener", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "Landroidx/viewpager2/widget/ViewPager2;", "shareViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Landroid/widget/TextView;", "editBtn", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "mViewModel", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "", "longPicBitmapUriStr", "Ljava/lang/String;", "Landroid/view/View;", "shareBtnGroup", "Landroid/view/View;", "", "gpsValueValid", "Z", "Lcom/google/android/material/tabs/TabLayout$d;", "onTabSelectedListener", "Lcom/google/android/material/tabs/TabLayout$d;", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Landroid/widget/TextView;Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;Ljava/lang/String;Landroid/view/View;Z)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareMethodTabHolder {

    @NotNull
    public static final String TAG = "ShareMethodHolder";

    @NotNull
    private final BaseActivity activity;

    @NotNull
    private final TextView editBtn;
    private final boolean gpsValueValid;

    @Nullable
    private final String longPicBitmapUriStr;

    @NotNull
    private final SportReportShareViewModel mViewModel;

    @Nullable
    private TabLayout.d onTabSelectedListener;

    @NotNull
    private final View shareBtnGroup;

    @NotNull
    private final ViewPager2 shareViewPager;

    @NotNull
    private final SportBasicReport sportReport;

    @NotNull
    private final TabLayout tabLayout;

    public ShareMethodTabHolder(@NotNull BaseActivity activity, @NotNull TabLayout tabLayout, @NotNull ViewPager2 shareViewPager, @NotNull SportBasicReport sportReport, @NotNull TextView editBtn, @NotNull SportReportShareViewModel mViewModel, @Nullable String str, @NotNull View shareBtnGroup, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(shareViewPager, "shareViewPager");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(editBtn, "editBtn");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        Intrinsics.checkNotNullParameter(shareBtnGroup, "shareBtnGroup");
        this.activity = activity;
        this.tabLayout = tabLayout;
        this.shareViewPager = shareViewPager;
        this.sportReport = sportReport;
        this.editBtn = editBtn;
        this.mViewModel = mViewModel;
        this.longPicBitmapUriStr = str;
        this.shareBtnGroup = shareBtnGroup;
        this.gpsValueValid = z;
        this.onTabSelectedListener = new ShareMethodTabHolder$onTabSelectedListener$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHolder$lambda$0(TabLayout.g tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.i.setPadding(ExtUtilsKt.getDp(35), ExtUtilsKt.getDp(0), ExtUtilsKt.getDp(35), ExtUtilsKt.getDp(-20));
        if (i == 0) {
            tab.u(j1j.ga);
        } else if (i != 1) {
            tab.u(j1j.i9);
        } else {
            tab.u(j1j.fa);
        }
    }

    public final void initHolder() {
        Bundle bundle = new Bundle();
        bundle.putLong("time_stamp", this.sportReport.getTimeStamp());
        bundle.putSerializable("sport_report", this.sportReport);
        bundle.putInt("sport_type", this.sportReport.getSportType());
        this.mViewModel.initBundleParams(bundle);
        this.mViewModel.createDataList();
        this.shareViewPager.setAdapter(new ShareMethodAdapter(this.activity, this.sportReport, this.gpsValueValid, this.longPicBitmapUriStr));
        this.shareViewPager.setUserInputEnabled(false);
        this.shareViewPager.setOffscreenPageLimit(3);
        this.tabLayout.setTabMode(0);
        this.tabLayout.K(ExtUtilsKt.getColor(dki.J0), ExtUtilsKt.getColor(dki.G0));
        new b(this.tabLayout, this.shareViewPager, new b.InterfaceC0219b() { // from class: y5m
            @Override // com.google.android.material.tabs.b.InterfaceC0219b
            public final void a(TabLayout.g gVar, int i) {
                ShareMethodTabHolder.initHolder$lambda$0(gVar, i);
            }
        }).a();
        this.tabLayout.addOnTabSelectedListener((TabLayout.c) this.onTabSelectedListener);
        int curtTabPosition = this.mViewModel.getCurtTabPosition() == -1 ? 1 : this.mViewModel.getCurtTabPosition();
        TabLayout tabLayout = this.tabLayout;
        tabLayout.F(tabLayout.x(curtTabPosition));
    }

    public final void removeOnTabSelectedListener() {
        this.tabLayout.n();
        this.onTabSelectedListener = null;
    }
}

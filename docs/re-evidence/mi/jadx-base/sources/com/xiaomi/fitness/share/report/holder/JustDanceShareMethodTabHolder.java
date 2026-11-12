package com.xiaomi.fitness.share.report.holder;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongList;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.EditSportReportCustomShareActivity;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.adapter.JustDanceShareMethodAdapter;
import com.xiaomi.fitness.share.report.holder.JustDanceShareMethodTabHolder;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.bsi;
import defpackage.dki;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.s4m;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0013H\u0002J0\u0010!\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0013H\u0002J0\u0010\"\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/share/report/holder/JustDanceShareMethodTabHolder;", "", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "shareViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "editBtn", "Landroid/widget/TextView;", "mViewModel", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "longPicBitmapUriStr", "", "shareBtnGroup", "Landroid/view/View;", "gpsValueValid", "", "switchSongList", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Landroid/widget/TextView;Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;Ljava/lang/String;Landroid/view/View;ZLcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;)V", "initHolder", "", "shareDefault", "downloadBtn", "Landroidx/appcompat/widget/AppCompatTextView;", "wechatBtn", "momentsBtn", "moreBtn", "showWechatShare", "shareSong", "shareCustomer", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JustDanceShareMethodTabHolder {

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

    @NotNull
    private final View shareBtnGroup;

    @NotNull
    private final ViewPager2 shareViewPager;

    @NotNull
    private final SportBasicReport sportReport;

    @Nullable
    private final SwitchSongList switchSongList;

    @NotNull
    private final TabLayout tabLayout;

    public JustDanceShareMethodTabHolder(@NotNull BaseActivity activity, @NotNull TabLayout tabLayout, @NotNull ViewPager2 shareViewPager, @NotNull SportBasicReport sportReport, @NotNull TextView editBtn, @NotNull SportReportShareViewModel mViewModel, @Nullable String str, @NotNull View shareBtnGroup, boolean z, @Nullable SwitchSongList switchSongList) {
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
        this.switchSongList = switchSongList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHolder$lambda$0(JustDanceShareMethodTabHolder this$0, TabLayout.g tab, int i) {
        List<SwitchSongItem> songList;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.i.setPadding(ExtUtilsKt.getDp(35), ExtUtilsKt.getDp(0), ExtUtilsKt.getDp(35), ExtUtilsKt.getDp(-20));
        if (i == 0) {
            tab.u(j1j.ga);
            return;
        }
        if (i != 1) {
            tab.u(j1j.z0);
            return;
        }
        SwitchSongList switchSongList = this$0.switchSongList;
        if (switchSongList == null || ((songList = switchSongList.getSongList()) != null && songList.isEmpty())) {
            tab.u(j1j.z0);
        } else {
            tab.u(j1j.ha);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareCustomer(AppCompatTextView downloadBtn, AppCompatTextView wechatBtn, AppCompatTextView momentsBtn, AppCompatTextView moreBtn, boolean showWechatShare) {
        ViewExtKt.visible(this.editBtn);
        this.editBtn.setText(j1j.q4);
        SportReportShareExtKt.listenOnClickWithPressEffect$default(this.editBtn, false, new Function0() { // from class: xyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareCustomer$lambda$9(this.f39583a);
            }
        }, 1, null);
        final s4m s4mVar = new s4m(this.activity);
        final String string = ResourceExtKt.getString(j1j.q);
        final String string2 = ResourceExtKt.getString(j1j.k2);
        SportReportShareExtKt.listenOnClickWithPressEffect$default(downloadBtn, false, new Function0() { // from class: lyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareCustomer$lambda$10(this.f25552a, s4mVar, string2, string);
            }
        }, 1, null);
        SportReportShareExtKt.listenOnClickWithPressEffect(wechatBtn, showWechatShare, new Function0() { // from class: myd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareCustomer$lambda$11(this.f27344a, s4mVar, string2, string);
            }
        });
        SportReportShareExtKt.listenOnClickWithPressEffect(momentsBtn, showWechatShare, new Function0() { // from class: nyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareCustomer$lambda$12(this.f28564a, s4mVar, string2, string);
            }
        });
        SportReportShareExtKt.listenOnClickWithPressEffect$default(moreBtn, false, new Function0() { // from class: oyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareCustomer$lambda$13(this.f29815a);
            }
        }, 1, null);
        Logger.i("ShareMethodHolder", "tab switch category=自定义分享");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCustomer$lambda$10(JustDanceShareMethodTabHolder this$0, s4m shareComponent, String shareTitle, String sportName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(sportName, "$sportName");
        CardView cardViewFindCurtCardViewInShareViewViewPager = SportReportShareExtKt.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onViewDownload(shareComponent, cardViewFindCurtCardViewInShareViewViewPager, shareTitle, sportName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCustomer$lambda$11(JustDanceShareMethodTabHolder this$0, s4m shareComponent, String shareTitle, String sportName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(sportName, "$sportName");
        CardView cardViewFindCurtCardViewInShareViewViewPager = SportReportShareExtKt.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onViewShareToWechat(shareComponent, cardViewFindCurtCardViewInShareViewViewPager, shareTitle, sportName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCustomer$lambda$12(JustDanceShareMethodTabHolder this$0, s4m shareComponent, String shareTitle, String sportName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(sportName, "$sportName");
        CardView cardViewFindCurtCardViewInShareViewViewPager = SportReportShareExtKt.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onViewShareToMoments(shareComponent, cardViewFindCurtCardViewInShareViewViewPager, shareTitle, sportName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCustomer$lambda$13(JustDanceShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardView cardViewFindCurtCardViewInShareViewViewPager = SportReportShareExtKt.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onViewShareViaMore(this$0.activity, cardViewFindCurtCardViewInShareViewViewPager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCustomer$lambda$9(JustDanceShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0.activity, (Class<?>) EditSportReportCustomShareActivity.class);
        Bundle bundle = new Bundle();
        bundle.putLong("time_stamp", this$0.sportReport.getTimeStamp());
        bundle.putSerializable("sport_report", this$0.sportReport);
        ViewPager2 viewPager2 = (ViewPager2) this$0.shareViewPager.findViewWithTag("customize_share_view_pager");
        if (viewPager2 != null) {
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAM_REPORT_SHARE_CUSTOMIZED_BG_INDEX, viewPager2.getCurrentItem());
        }
        bundle.putInt("sport_type", lp5.a(this$0.sportReport));
        intent.putExtras(bundle);
        this$0.activity.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareDefault(AppCompatTextView downloadBtn, AppCompatTextView wechatBtn, AppCompatTextView momentsBtn, AppCompatTextView moreBtn, boolean showWechatShare) {
        final Bitmap bitmapByUriStr;
        ViewExtKt.gone(this.editBtn);
        String str = this.longPicBitmapUriStr;
        if (str == null || (bitmapByUriStr = SportReportShareExtKt.getBitmapByUriStr(str)) == null) {
            return;
        }
        SportReportShareExtKt.listenOnClickWithPressEffect$default(downloadBtn, false, new Function0() { // from class: pyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareDefault$lambda$1(this.f30895a, bitmapByUriStr);
            }
        }, 1, null);
        SportReportShareExtKt.listenOnClickWithPressEffect(wechatBtn, showWechatShare, new Function0() { // from class: qyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareDefault$lambda$2(this.f31967a, bitmapByUriStr);
            }
        });
        SportReportShareExtKt.listenOnClickWithPressEffect(momentsBtn, showWechatShare, new Function0() { // from class: ryd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareDefault$lambda$3(this.f33059a, bitmapByUriStr);
            }
        });
        SportReportShareExtKt.listenOnClickWithPressEffect$default(moreBtn, false, new Function0() { // from class: syd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareDefault$lambda$4(this.f34101a, bitmapByUriStr);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareDefault$lambda$1(JustDanceShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.onBitmapDownload(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareDefault$lambda$2(JustDanceShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.onBitmapShareToWechat(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareDefault$lambda$3(JustDanceShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.onBitmapShareToMoments(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareDefault$lambda$4(JustDanceShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.onBitmapShareViaMore(this$0.activity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareSong(AppCompatTextView downloadBtn, AppCompatTextView wechatBtn, AppCompatTextView momentsBtn, AppCompatTextView moreBtn, boolean showWechatShare) {
        ViewExtKt.gone(this.editBtn);
        final s4m s4mVar = new s4m(this.activity);
        final String string = ResourceExtKt.getString(j1j.q);
        final String string2 = ResourceExtKt.getString(j1j.k2);
        SportReportShareExtKt.listenOnClickWithPressEffect$default(downloadBtn, false, new Function0() { // from class: tyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareSong$lambda$5(this.f35182a, s4mVar, string2, string);
            }
        }, 1, null);
        SportReportShareExtKt.listenOnClickWithPressEffect(wechatBtn, showWechatShare, new Function0() { // from class: uyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareSong$lambda$6(this.f36275a, s4mVar, string2, string);
            }
        });
        SportReportShareExtKt.listenOnClickWithPressEffect(momentsBtn, showWechatShare, new Function0() { // from class: vyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareSong$lambda$7(this.f37363a, s4mVar, string2, string);
            }
        });
        SportReportShareExtKt.listenOnClickWithPressEffect$default(moreBtn, false, new Function0() { // from class: wyd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JustDanceShareMethodTabHolder.shareSong$lambda$8(this.f38476a);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareSong$lambda$5(JustDanceShareMethodTabHolder this$0, s4m shareComponent, String shareTitle, String sportName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(sportName, "$sportName");
        CardView cardViewFindJustDanceCardViewInShareViewViewPager = SportReportShareExtKt.findJustDanceCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindJustDanceCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onViewDownload(shareComponent, cardViewFindJustDanceCardViewInShareViewViewPager, shareTitle, sportName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareSong$lambda$6(JustDanceShareMethodTabHolder this$0, s4m shareComponent, String shareTitle, String sportName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(sportName, "$sportName");
        CardView cardViewFindJustDanceCardViewInShareViewViewPager = SportReportShareExtKt.findJustDanceCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindJustDanceCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onViewShareToWechat(shareComponent, cardViewFindJustDanceCardViewInShareViewViewPager, shareTitle, sportName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareSong$lambda$7(JustDanceShareMethodTabHolder this$0, s4m shareComponent, String shareTitle, String sportName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(sportName, "$sportName");
        CardView cardViewFindJustDanceCardViewInShareViewViewPager = SportReportShareExtKt.findJustDanceCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindJustDanceCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onViewShareToMoments(shareComponent, cardViewFindJustDanceCardViewInShareViewViewPager, shareTitle, sportName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareSong$lambda$8(JustDanceShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardView cardViewFindJustDanceCardViewInShareViewViewPager = SportReportShareExtKt.findJustDanceCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindJustDanceCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        SportReportShareExtKt.onViewShareViaMore(this$0.activity, cardViewFindJustDanceCardViewInShareViewViewPager);
        return Unit.INSTANCE;
    }

    public final void initHolder() {
        List<SwitchSongItem> songList;
        View viewFindViewById = this.shareBtnGroup.findViewById(bsi.M5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = this.shareBtnGroup.findViewById(bsi.S5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = this.shareBtnGroup.findViewById(bsi.R5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = this.shareBtnGroup.findViewById(bsi.O5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        final AppCompatTextView appCompatTextView4 = (AppCompatTextView) viewFindViewById4;
        final boolean z = !AppUtil.INSTANCE.isPlayChannel();
        Bundle bundle = new Bundle();
        bundle.putLong("time_stamp", this.sportReport.getTimeStamp());
        bundle.putSerializable("sport_report", this.sportReport);
        bundle.putInt("sport_type", this.sportReport.getSportType());
        this.mViewModel.initBundleParams(bundle);
        this.mViewModel.createDataList();
        this.shareViewPager.setAdapter(new JustDanceShareMethodAdapter(this.activity, this.sportReport, this.gpsValueValid, this.longPicBitmapUriStr, this.switchSongList));
        this.shareViewPager.setUserInputEnabled(false);
        this.tabLayout.setTabMode(0);
        this.tabLayout.K(ExtUtilsKt.getColor(dki.J0), ExtUtilsKt.getColor(dki.G0));
        ViewPager2 viewPager2 = this.shareViewPager;
        SwitchSongList switchSongList = this.switchSongList;
        viewPager2.setOffscreenPageLimit((switchSongList == null || ((songList = switchSongList.getSongList()) != null && songList.isEmpty())) ? 2 : 3);
        new b(this.tabLayout, this.shareViewPager, new b.InterfaceC0219b() { // from class: kyd
            @Override // com.google.android.material.tabs.b.InterfaceC0219b
            public final void a(TabLayout.g gVar, int i) {
                JustDanceShareMethodTabHolder.initHolder$lambda$0(this.f24419a, gVar, i);
            }
        }).a();
        this.tabLayout.addOnTabSelectedListener(new TabLayout.d() { // from class: com.xiaomi.fitness.share.report.holder.JustDanceShareMethodTabHolder.initHolder.2
            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabReselected(TabLayout.g tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabSelected(TabLayout.g tab) {
                List<SwitchSongItem> songList2;
                Logger.i("ShareMethodHolder", "addOnTabSelectedListener position=" + (tab != null ? Integer.valueOf(tab.g()) : null));
                JustDanceShareMethodTabHolder.this.mViewModel.setCurtTabPosition(tab != null ? tab.g() : 0);
                Integer numValueOf = tab != null ? Integer.valueOf(tab.g()) : null;
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    JustDanceShareMethodTabHolder.this.shareDefault(appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, z);
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    JustDanceShareMethodTabHolder.this.shareCustomer(appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, z);
                } else if (JustDanceShareMethodTabHolder.this.switchSongList == null || ((songList2 = JustDanceShareMethodTabHolder.this.switchSongList.getSongList()) != null && songList2.isEmpty())) {
                    JustDanceShareMethodTabHolder.this.shareCustomer(appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, z);
                } else {
                    JustDanceShareMethodTabHolder.this.shareSong(appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, z);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabUnselected(TabLayout.g tab) {
            }
        });
        this.mViewModel.setCurtTabPosition(0);
        TabLayout tabLayout = this.tabLayout;
        tabLayout.F(tabLayout.x(0));
        shareDefault(appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, z);
    }
}

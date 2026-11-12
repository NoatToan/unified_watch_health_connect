package com.xiaomi.fitness.share.report;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongList;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.inner.SportDetailJustDanceDataFragmentKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.SportReportShareActivity;
import com.xiaomi.fitness.share.report.holder.JustDanceShareMethodTabHolder;
import com.xiaomi.fitness.share.report.holder.ShareMethodTabHolder;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.wyn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0006R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/share/report/SportReportShareActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "Lwyn;", "", "initParams", "()V", "initTabLayout", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "", "longPicBitmapUriStr", "Ljava/lang/String;", "", "gpsPathValid", "Z", "Lcom/xiaomi/fitness/share/report/holder/ShareMethodTabHolder;", "shareMethodTabHolder", "Lcom/xiaomi/fitness/share/report/holder/ShareMethodTabHolder;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportReportShareActivity extends Hilt_SportReportShareActivity<SportReportShareViewModel, wyn> {

    @NotNull
    public static final String TAG = "SportReportShareActivity";
    private boolean gpsPathValid;

    @Nullable
    private String longPicBitmapUriStr;

    @Nullable
    private SportBasicReport mBasicReport;

    @Nullable
    private ShareMethodTabHolder shareMethodTabHolder;

    private final void initParams() {
        this.mBasicReport = (SportBasicReport) getIntent().getSerializableExtra("sport_report");
        this.longPicBitmapUriStr = getIntent().getStringExtra(SportRecordBundleKey.BUNDLE_PARAM_URI);
        boolean booleanExtra = getIntent().getBooleanExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_GPS_VALID, false);
        this.gpsPathValid = booleanExtra;
        Logger.i("SportReportShareActivity", "initParams bitmapUriStr=" + this.longPicBitmapUriStr + " gpsPathValid=" + booleanExtra);
        SportBasicReport sportBasicReport = this.mBasicReport;
        StringBuilder sb = new StringBuilder();
        sb.append("initParams mBasicReport=");
        sb.append(sportBasicReport);
        Logger.i("SportReportShareActivity", sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTabLayout() {
        SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport == null || sportBasicReport.getSportType() != 812) {
            TabLayout tabLayout = ((wyn) getMBinding()).F;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            ViewPager2 viewPager = ((wyn) getMBinding()).H;
            Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
            SportBasicReport sportBasicReport2 = this.mBasicReport;
            Intrinsics.checkNotNull(sportBasicReport2);
            TextView editContentBtn = ((wyn) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(editContentBtn, "editContentBtn");
            SportReportShareViewModel sportReportShareViewModel = (SportReportShareViewModel) getMViewModel();
            String str = this.longPicBitmapUriStr;
            View view = ((wyn) getMBinding()).C;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.View");
            ShareMethodTabHolder shareMethodTabHolder = new ShareMethodTabHolder(this, tabLayout, viewPager, sportBasicReport2, editContentBtn, sportReportShareViewModel, str, view, this.gpsPathValid);
            this.shareMethodTabHolder = shareMethodTabHolder;
            shareMethodTabHolder.initHolder();
            return;
        }
        TabLayout tabLayout2 = ((wyn) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(tabLayout2, "tabLayout");
        ViewPager2 viewPager2 = ((wyn) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "viewPager");
        SportBasicReport sportBasicReport3 = this.mBasicReport;
        Intrinsics.checkNotNull(sportBasicReport3);
        TextView editContentBtn2 = ((wyn) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editContentBtn2, "editContentBtn");
        SportReportShareViewModel sportReportShareViewModel2 = (SportReportShareViewModel) getMViewModel();
        String str2 = this.longPicBitmapUriStr;
        View view2 = ((wyn) getMBinding()).C;
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.view.View");
        boolean z = this.gpsPathValid;
        Intent intent = getIntent();
        new JustDanceShareMethodTabHolder(this, tabLayout2, viewPager2, sportBasicReport3, editContentBtn2, sportReportShareViewModel2, str2, view2, z, (SwitchSongList) (intent != null ? intent.getSerializableExtra(SportDetailJustDanceDataFragmentKt.BUNDLE_PARAMS_SPORT_DETAIL_JUST_DANCE_LIST) : null)).initHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(SportReportShareActivity this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.C1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.share.report.Hilt_SportReportShareActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        ViewExtKt.clickWithTrigger$default(((wyn) getMBinding()).B, 0L, new Function1() { // from class: vyn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SportReportShareActivity.onCreate$lambda$0(this.f37369a, (ImageView) obj);
            }
        }, 1, null);
        initParams();
        if (this.mBasicReport == null) {
            return;
        }
        setTitle(j1j.Ha);
        initTabLayout();
    }

    @Override // com.xiaomi.fitness.share.report.Hilt_SportReportShareActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ShareMethodTabHolder shareMethodTabHolder = this.shareMethodTabHolder;
        if (shareMethodTabHolder != null) {
            shareMethodTabHolder.removeOnTabSelectedListener();
        }
        super.onDestroy();
    }
}

package com.huami.phn.coach.ui.activity;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.lib.rainbow.widget.SwitchCompat;
import com.huami.phn.coach.R;
import com.huami.phn.coach.ui.GlobalTitleStyle;
import com.huami.phn.coach.ui.activity.PHNDetailPageActivity;
import com.huami.phn.coach.ui.adapter.PHNTrainingLevelAdapter;
import com.huami.phn.coach.ui.adapter.PHNTrainingStatusChartAdapter;
import com.huami.phn.coach.ui.dialog.DeviceDisconnectedDialog;
import com.huami.phn.coach.ui.dialog.MoreEditsDialog;
import com.huami.phn.coach.ui.view.PHNTrainingStatusView;
import com.huami.phn.coach.usecase.PlanDetail;
import com.huami.phn.coach.viewmodel.PHNDetailPageViewModel;
import com.huami.phn.core.model.RecommendState;
import com.huami.phn.logic.PHNStateLogic;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.Calendar;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010'R\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0016\u00104\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0016\u00105\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0016\u00107\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00101R\u0016\u00109\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00101R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00106R\u0016\u0010H\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00106¨\u0006K"}, d2 = {"Lcom/huami/phn/coach/ui/activity/PHNDetailPageActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "G", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "t", "v", "Lcom/huami/phn/coach/usecase/PlanDetail;", "planDetail", "y", SOAP.XMLNS, "", "isShow", "H", "F", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "Lcom/huami/phn/coach/ui/adapter/PHNTrainingStatusChartAdapter;", "x", "Lcom/huami/phn/coach/ui/adapter/PHNTrainingStatusChartAdapter;", "trainStatusChartAdapter", "Lcom/huami/phn/coach/ui/adapter/PHNTrainingLevelAdapter;", "Lcom/huami/phn/coach/ui/adapter/PHNTrainingLevelAdapter;", "trainLevelAdapter", "Lcom/huami/phn/coach/viewmodel/PHNDetailPageViewModel;", "z", "Lkotlin/Lazy;", "B", "()Lcom/huami/phn/coach/viewmodel/PHNDetailPageViewModel;", "phnDetailPageViewModel", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPagerChart", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "includeCardTrainingStatus", "C", "includeTodayPlanData", "Landroid/widget/LinearLayout;", LogUtil.D, "Landroid/widget/LinearLayout;", "includeTodayPlanStatus", "Landroid/widget/TextView;", "E", "Landroid/widget/TextView;", "tvPlanTodayTitle", "tvPlanTodayDesc", "llPlanTodayButtonContent", "tvPlanTodayCardButton", LogUtil.I, "tvCurrentlyUsingDevice", "J", "tvDeviceUpdateTime", "Landroid/widget/ImageView;", "K", "Landroid/widget/ImageView;", "ivPlanCardImage", "", "L", "pageCount", "Lcom/huami/phn/coach/ui/dialog/DeviceDisconnectedDialog;", "M", "Lcom/huami/phn/coach/ui/dialog/DeviceDisconnectedDialog;", "deviceDisconnectedDialog", "N", "alpha40", "O", "alphaFF", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNDetailPageActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private ViewPager2 viewPagerChart;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private ConstraintLayout includeCardTrainingStatus;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private ConstraintLayout includeTodayPlanData;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private LinearLayout includeTodayPlanStatus;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private TextView tvPlanTodayTitle;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private TextView tvPlanTodayDesc;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private LinearLayout llPlanTodayButtonContent;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private TextView tvPlanTodayCardButton;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private TextView tvCurrentlyUsingDevice;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private TextView tvDeviceUpdateTime;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private ImageView ivPlanCardImage;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private int pageCount;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    private DeviceDisconnectedDialog deviceDisconnectedDialog;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private int alpha40;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private int alphaFF;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private PHNTrainingStatusChartAdapter trainStatusChartAdapter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private PHNTrainingLevelAdapter trainLevelAdapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy phnDetailPageViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getOldestStartDateLiveData error! " + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadPlanDetailLiveData error! " + this.a.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PHNDetailPageActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.phn.coach.ui.activity.PHNDetailPageActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.phnDetailPageViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PHNDetailPageViewModel>() { // from class: com.huami.phn.coach.ui.activity.PHNDetailPageActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phn.coach.viewmodel.PHNDetailPageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PHNDetailPageViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PHNDetailPageViewModel.class), function0, objArr);
            }
        });
        this.pageCount = -1;
        this.alpha40 = 102;
        this.alphaFF = 255;
    }

    private final void A() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            B().m3386getOldestStartDateLiveData();
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn("PHNDetailPageActivity", thM3848exceptionOrNullimpl, new a(thM3848exceptionOrNullimpl));
            finish();
        }
    }

    private final PHNDetailPageViewModel B() {
        return (PHNDetailPageViewModel) this.phnDetailPageViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(PHNDetailPageActivity pHNDetailPageActivity, View view) {
        MoreEditsDialog moreEditsDialog = new MoreEditsDialog(pHNDetailPageActivity.getSupportFragmentManager());
        FragmentTransaction fragmentTransactionBeginTransaction = pHNDetailPageActivity.getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.setTransition(4099);
        moreEditsDialog.show(fragmentTransactionBeginTransaction, "phn_dpa");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(PHNDetailPageActivity pHNDetailPageActivity, Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());
        int deltaDayCount = TimeUtils.getDeltaDayCount(calendar, calendar2);
        if (deltaDayCount > 0) {
            int i = (deltaDayCount / 42) + 1;
            pHNDetailPageActivity.pageCount = i;
            pHNDetailPageActivity.trainStatusChartAdapter = new PHNTrainingStatusChartAdapter(pHNDetailPageActivity, i);
            ViewPager2 viewPager2 = pHNDetailPageActivity.viewPagerChart;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            PHNTrainingStatusChartAdapter pHNTrainingStatusChartAdapter = pHNDetailPageActivity.trainStatusChartAdapter;
            if (pHNTrainingStatusChartAdapter == null) {
                pHNTrainingStatusChartAdapter = null;
            }
            viewPager2.setAdapter(pHNTrainingStatusChartAdapter);
            ViewPager2 viewPager3 = pHNDetailPageActivity.viewPagerChart;
            if (viewPager3 == null) {
                viewPager3 = null;
            }
            viewPager3.setCurrentItem(pHNDetailPageActivity.pageCount - 1);
            if (pHNDetailPageActivity.pageCount != -1) {
                ViewPager2 viewPager4 = pHNDetailPageActivity.viewPagerChart;
                if (viewPager4 == null) {
                    viewPager4 = null;
                }
                viewPager4.setVisibility(0);
                ConstraintLayout constraintLayout = pHNDetailPageActivity.includeCardTrainingStatus;
                (constraintLayout != null ? constraintLayout : null).setVisibility(0);
                return;
            }
            ViewPager2 viewPager5 = pHNDetailPageActivity.viewPagerChart;
            if (viewPager5 == null) {
                viewPager5 = null;
            }
            viewPager5.setVisibility(8);
            ConstraintLayout constraintLayout2 = pHNDetailPageActivity.includeCardTrainingStatus;
            (constraintLayout2 != null ? constraintLayout2 : null).setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(PHNDetailPageActivity pHNDetailPageActivity, com.huami.phn.util.Result result) {
        if (result.isSuccess()) {
            pHNDetailPageActivity.G();
        }
    }

    private final void F(PlanDetail planDetail) {
        TextView textView = this.tvCurrentlyUsingDevice;
        if (textView == null) {
            textView = null;
        }
        textView.setText(getString(R.string.phn_currently_using_device, new Object[]{planDetail.getDevice()}));
        TextView textView2 = this.tvDeviceUpdateTime;
        if (textView2 == null) {
            textView2 = null;
        }
        Calendar update = planDetail.getUpdate();
        textView2.setText(update != null ? getString(R.string.phn_device_update_time, new Object[]{TimeUtils.formatShortDateWithShortTime(this, update.getTime())}) : null);
    }

    private final void G() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            PHNDetailPageViewModel.loadPlanDetailLiveData$default(B(), null, 1, null);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn("PHNDetailPageActivity", thM3848exceptionOrNullimpl, new b(thM3848exceptionOrNullimpl));
            finish();
        }
    }

    private final void H(boolean isShow) {
        if (isShow) {
            ConstraintLayout constraintLayout = this.includeTodayPlanData;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            constraintLayout.setVisibility(8);
            LinearLayout linearLayout = this.includeTodayPlanStatus;
            (linearLayout != null ? linearLayout : null).setVisibility(0);
            return;
        }
        ConstraintLayout constraintLayout2 = this.includeTodayPlanData;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        constraintLayout2.setVisibility(0);
        LinearLayout linearLayout2 = this.includeTodayPlanStatus;
        (linearLayout2 != null ? linearLayout2 : null).setVisibility(8);
    }

    private final void initView() {
        G();
        A();
        this.viewPagerChart = (ViewPager2) findViewById(R.id.view_pager_chart);
        getRightImage().setOnClickListener(new View.OnClickListener() { // from class: uo5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PHNDetailPageActivity.C(this.a, view);
            }
        });
        this.includeCardTrainingStatus = (ConstraintLayout) findViewById(R.id.include_card_training_status);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.include_today_plan_status_card);
        this.includeTodayPlanStatus = linearLayout;
        if (linearLayout == null) {
            linearLayout = null;
        }
        this.ivPlanCardImage = (ImageView) linearLayout.findViewById(R.id.iv_plan_card_image);
        LinearLayout linearLayout2 = this.includeTodayPlanStatus;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        this.tvPlanTodayTitle = (TextView) linearLayout2.findViewById(R.id.tv_plan_today_title);
        LinearLayout linearLayout3 = this.includeTodayPlanStatus;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        this.tvPlanTodayDesc = (TextView) linearLayout3.findViewById(R.id.tv_plan_today_desc);
        LinearLayout linearLayout4 = this.includeTodayPlanStatus;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        this.llPlanTodayButtonContent = (LinearLayout) linearLayout4.findViewById(R.id.ll_plan_today_button_content);
        LinearLayout linearLayout5 = this.includeTodayPlanStatus;
        this.tvPlanTodayCardButton = (TextView) (linearLayout5 != null ? linearLayout5 : null).findViewById(R.id.tv_plan_today_card_button);
        this.includeTodayPlanData = (ConstraintLayout) findViewById(R.id.include_today_plan_data_card);
        B().getOldestStartDateLiveData().observe(this, new Observer() { // from class: zo5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PHNDetailPageActivity.D(this.a, (Calendar) obj);
            }
        });
        t();
        v();
        B().getModifyRestDaysLiveData().observe(this, new Observer() { // from class: yo5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PHNDetailPageActivity.E(this.a, (com.huami.phn.util.Result) obj);
            }
        });
    }

    private final void s(PlanDetail planDetail) {
        RecommendState recommend = planDetail.getRecommend();
        if (Intrinsics.areEqual(recommend, RecommendState.Rest.INSTANCE)) {
            H(true);
            ImageView imageView = this.ivPlanCardImage;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageResource(R.drawable.phn_card_today_is_rest);
            TextView textView = this.tvPlanTodayTitle;
            if (textView == null) {
                textView = null;
            }
            textView.setText(getString(R.string.phn_card_today_is_rest));
            TextView textView2 = this.tvPlanTodayDesc;
            (textView2 != null ? textView2 : null).setText(getString(R.string.phn_card_today_is_rest_desc));
            return;
        }
        if (Intrinsics.areEqual(recommend, RecommendState.Tired.INSTANCE)) {
            H(true);
            ImageView imageView2 = this.ivPlanCardImage;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setImageResource(R.drawable.phn_card_suggested_rest);
            TextView textView3 = this.tvPlanTodayTitle;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(getString(R.string.phn_card_suggested_rest));
            TextView textView4 = this.tvPlanTodayDesc;
            (textView4 != null ? textView4 : null).setText(getString(R.string.phn_card_suggested_rest_desc));
            return;
        }
        if (Intrinsics.areEqual(recommend, RecommendState.WeeklyFull.INSTANCE)) {
            H(true);
            ImageView imageView3 = this.ivPlanCardImage;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setImageResource(R.drawable.phn_card_week_plan_completed);
            TextView textView5 = this.tvPlanTodayTitle;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setText(getString(R.string.phn_card_week_plan_completed));
            TextView textView6 = this.tvPlanTodayDesc;
            (textView6 != null ? textView6 : null).setText(getString(R.string.phn_card_week_plan_completed_desc));
            return;
        }
        if (!Intrinsics.areEqual(recommend, RecommendState.DailyFull.INSTANCE)) {
            if (Intrinsics.areEqual(recommend, RecommendState.DailyGo.INSTANCE)) {
                H(false);
                return;
            }
            return;
        }
        H(true);
        ImageView imageView4 = this.ivPlanCardImage;
        if (imageView4 == null) {
            imageView4 = null;
        }
        imageView4.setImageResource(R.drawable.phn_card_plan_completed);
        TextView textView7 = this.tvPlanTodayTitle;
        if (textView7 == null) {
            textView7 = null;
        }
        textView7.setText(getString(R.string.phn_card_today_plan_completed));
        TextView textView8 = this.tvPlanTodayDesc;
        (textView8 != null ? textView8 : null).setText(getString(R.string.phn_card_today_plan_completed_desc));
    }

    private final void t() {
        ConstraintLayout constraintLayout = this.includeCardTrainingStatus;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        SwitchCompat switchCompat = (SwitchCompat) constraintLayout.findViewById(R.id.switch_training_status);
        ConstraintLayout constraintLayout2 = this.includeCardTrainingStatus;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        final TextView textView = (TextView) constraintLayout2.findViewById(R.id.tv_fatigue_level);
        ConstraintLayout constraintLayout3 = this.includeCardTrainingStatus;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        final TextView textView2 = (TextView) constraintLayout3.findViewById(R.id.tv_fitness_level);
        final Drawable drawable = getResources().getDrawable(R.drawable.phn_shape_dot_oval_s51);
        final Drawable drawable2 = getResources().getDrawable(R.drawable.phn_shape_dot_oval_s15);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        ConstraintLayout constraintLayout4 = this.includeCardTrainingStatus;
        final PHNTrainingStatusView pHNTrainingStatusView = (PHNTrainingStatusView) (constraintLayout4 != null ? constraintLayout4 : null).findViewById(R.id.training_status_view);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wo5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                PHNDetailPageActivity.u(pHNTrainingStatusView, drawable, this, drawable2, textView, textView2, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(PHNTrainingStatusView pHNTrainingStatusView, Drawable drawable, PHNDetailPageActivity pHNDetailPageActivity, Drawable drawable2, TextView textView, TextView textView2, CompoundButton compoundButton, boolean z) {
        if (z) {
            pHNTrainingStatusView.setVisibility(0);
            drawable.setAlpha(pHNDetailPageActivity.alpha40);
            drawable2.setAlpha(pHNDetailPageActivity.alpha40);
        } else {
            pHNTrainingStatusView.setVisibility(8);
            drawable.setAlpha(pHNDetailPageActivity.alphaFF);
            drawable2.setAlpha(pHNDetailPageActivity.alphaFF);
        }
        textView.setCompoundDrawables(drawable, null, null, null);
        textView2.setCompoundDrawables(drawable2, null, null, null);
        pHNDetailPageActivity.B().showTrainingStatus(z);
    }

    private final void v() {
        ConstraintLayout constraintLayout = this.includeTodayPlanData;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        final TextView textView = (TextView) constraintLayout.findViewById(R.id.tv_card_plan_today_date);
        ConstraintLayout constraintLayout2 = this.includeTodayPlanData;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        ((TextView) constraintLayout2.findViewById(R.id.tv_card_plan_today_title)).setOnClickListener(new View.OnClickListener() { // from class: vo5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PHNDetailPageActivity.x(this.a, view);
            }
        });
        this.tvCurrentlyUsingDevice = (TextView) findViewById(R.id.tv_currently_using_device);
        this.tvDeviceUpdateTime = (TextView) findViewById(R.id.tv_device_update_time);
        ConstraintLayout constraintLayout3 = this.includeTodayPlanData;
        final RecyclerView recyclerView = (RecyclerView) (constraintLayout3 != null ? constraintLayout3 : null).findViewById(R.id.rv_training_level);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setNestedScrollingEnabled(false);
        this.trainLevelAdapter = new PHNTrainingLevelAdapter(this);
        B().getPlanDetailLiveData().observe(this, new Observer() { // from class: xo5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PHNDetailPageActivity.w(textView, this, recyclerView, (PlanDetail) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(TextView textView, PHNDetailPageActivity pHNDetailPageActivity, RecyclerView recyclerView, PlanDetail planDetail) {
        Calendar date;
        Date time;
        PlanDetail.DailyPlan plan = planDetail.getPlan();
        textView.setText((plan == null || (date = plan.getDate()) == null || (time = date.getTime()) == null) ? null : TimeUtils.formatDate_no_y((Context) pHNDetailPageActivity, time, true));
        PHNTrainingLevelAdapter pHNTrainingLevelAdapter = pHNDetailPageActivity.trainLevelAdapter;
        if (pHNTrainingLevelAdapter == null) {
            pHNTrainingLevelAdapter = null;
        }
        pHNTrainingLevelAdapter.initDailyPlan(planDetail);
        PHNTrainingLevelAdapter pHNTrainingLevelAdapter2 = pHNDetailPageActivity.trainLevelAdapter;
        recyclerView.setAdapter(pHNTrainingLevelAdapter2 != null ? pHNTrainingLevelAdapter2 : null);
        pHNDetailPageActivity.y(planDetail);
        pHNDetailPageActivity.F(planDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(PHNDetailPageActivity pHNDetailPageActivity, View view) {
        PHNNounExplainActivity.INSTANCE.start(pHNDetailPageActivity, NounType.PLAN_TODAY.ordinal());
    }

    private final void y(PlanDetail planDetail) {
        PlanDetail.State state = planDetail.getState();
        if (Intrinsics.areEqual(state, PlanDetail.State.ToBeStart.INSTANCE)) {
            H(true);
            ImageView imageView = this.ivPlanCardImage;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageResource(R.drawable.phn_card_plan_not_started);
            TextView textView = this.tvPlanTodayTitle;
            if (textView == null) {
                textView = null;
            }
            textView.setText(getString(R.string.phn_plan_not_started));
            TextView textView2 = this.tvPlanTodayDesc;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(getString(R.string.phn_plan_starting_time, new Object[]{TimeUtils.formatDateWithWeek(this, planDetail.getStart().getTime())}));
            LinearLayout linearLayout = this.llPlanTodayButtonContent;
            (linearLayout != null ? linearLayout : null).setVisibility(8);
            getRightImage().setVisibility(0);
            return;
        }
        if (Intrinsics.areEqual(state, PlanDetail.State.OnGoing.INSTANCE)) {
            s(planDetail);
            getRightImage().setVisibility(0);
            return;
        }
        if (Intrinsics.areEqual(state, PlanDetail.State.End.INSTANCE)) {
            H(true);
            ImageView imageView2 = this.ivPlanCardImage;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setImageResource(R.drawable.phn_coach_today_plan_img);
            TextView textView3 = this.tvPlanTodayTitle;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(getString(R.string.phn_no_plan));
            TextView textView4 = this.tvPlanTodayDesc;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setText(getString(R.string.phn_plan_terminated_desc_modify));
            LinearLayout linearLayout2 = this.llPlanTodayButtonContent;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(0);
            TextView textView5 = this.tvPlanTodayCardButton;
            (textView5 != null ? textView5 : null).setOnClickListener(new View.OnClickListener() { // from class: to5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PHNDetailPageActivity.z(this.a, view);
                }
            });
            getRightImage().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(PHNDetailPageActivity pHNDetailPageActivity, View view) {
        boolean z = false;
        if (PHNStateLogic.INSTANCE.gotoSettingOrDetailPage(view.getContext(), false)) {
            return;
        }
        DeviceDisconnectedDialog deviceDisconnectedDialog = pHNDetailPageActivity.deviceDisconnectedDialog;
        if (deviceDisconnectedDialog != null && deviceDisconnectedDialog.isVisible()) {
            z = true;
        }
        if (z) {
            return;
        }
        if (pHNDetailPageActivity.deviceDisconnectedDialog == null) {
            pHNDetailPageActivity.deviceDisconnectedDialog = new DeviceDisconnectedDialog();
        }
        DeviceDisconnectedDialog deviceDisconnectedDialog2 = pHNDetailPageActivity.deviceDisconnectedDialog;
        if (deviceDisconnectedDialog2 == null) {
            return;
        }
        deviceDisconnectedDialog2.showAllowingStateLoss(pHNDetailPageActivity.getSupportFragmentManager(), "PHNDetailPageActivity");
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phn_activity_detail_page);
        GlobalTitleStyle.setUnifyTitleStyle$default(this, true, getString(R.string.phn_common_title), null, null, 12, null);
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        G();
    }
}

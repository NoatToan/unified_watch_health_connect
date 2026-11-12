package com.xiaomi.fitness.training_plan.report;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.report.TrainPlanShareMethodTabHolder;
import defpackage.csi;
import defpackage.eki;
import defpackage.k1j;
import defpackage.nuf;
import defpackage.o3r;
import defpackage.s4m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 A2\u00020\u0001:\u0001ABK\u0012\u0006\u0010'\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\b\u00108\u001a\u0004\u0018\u00010\f\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\u0006\u0010=\u001a\u00020\u0011¢\u0006\u0004\b?\u0010@J7\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0015\u001a\u00020\t*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ/\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ/\u0010 \u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010+R\u0014\u0010'\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u0004\u0018\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanShareMethodTabHolder;", "", "Landroidx/appcompat/widget/AppCompatTextView;", "downloadBtn", "wechatBtn", "momentsBtn", "moreBtn", "", "showWechatShare", "", "shareDefault", "(Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Z)V", "", "bitmapUriStr", "Landroid/graphics/Bitmap;", "getBitmapByUriStr", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "Landroid/view/View;", "show", "Lkotlin/Function0;", "callback", "listenOnClickWithPressEffect", "(Landroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "shareCustomer", "Ls4m;", "shareComponent", "view", "title", "des", "onViewDownload", "(Ls4m;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", "onViewShareToWechat", "onViewShareToMoments", "Landroidx/viewpager2/widget/ViewPager2;", "shareViewPager", "Landroidx/cardview/widget/CardView;", "findCurtCardViewInShareViewViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)Landroidx/cardview/widget/CardView;", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "onViewShareViaMore", "(Landroid/app/Activity;Landroid/view/View;)V", "initHolder", "()V", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "Landroidx/viewpager2/widget/ViewPager2;", "Landroid/widget/TextView;", "editBtn", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;", "mViewModel", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;", "longPicBitmapUriStr", "Ljava/lang/String;", "Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "mCustomerSharePlanReport", "Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "shareBtnGroup", "Landroid/view/View;", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Landroid/widget/TextView;Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;Ljava/lang/String;Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;Landroid/view/View;)V", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrainPlanShareMethodTabHolder {

    @NotNull
    public static final String TAG = "ShareMethodHolder";

    @NotNull
    private final BaseActivity activity;

    @NotNull
    private final TextView editBtn;

    @Nullable
    private final String longPicBitmapUriStr;

    @Nullable
    private final CustomerSharePlanReport mCustomerSharePlanReport;

    @NotNull
    private final TrainPlanReportShareViewModel mViewModel;

    @NotNull
    private final View shareBtnGroup;

    @NotNull
    private final ViewPager2 shareViewPager;

    @NotNull
    private final TabLayout tabLayout;

    public TrainPlanShareMethodTabHolder(@NotNull BaseActivity activity, @NotNull TabLayout tabLayout, @NotNull ViewPager2 shareViewPager, @NotNull TextView editBtn, @NotNull TrainPlanReportShareViewModel mViewModel, @Nullable String str, @Nullable CustomerSharePlanReport customerSharePlanReport, @NotNull View shareBtnGroup) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(shareViewPager, "shareViewPager");
        Intrinsics.checkNotNullParameter(editBtn, "editBtn");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        Intrinsics.checkNotNullParameter(shareBtnGroup, "shareBtnGroup");
        this.activity = activity;
        this.tabLayout = tabLayout;
        this.shareViewPager = shareViewPager;
        this.editBtn = editBtn;
        this.mViewModel = mViewModel;
        this.longPicBitmapUriStr = str;
        this.mCustomerSharePlanReport = customerSharePlanReport;
        this.shareBtnGroup = shareBtnGroup;
    }

    private final CardView findCurtCardViewInShareViewViewPager(ViewPager2 shareViewPager) {
        ViewPager2 viewPager2 = (ViewPager2) shareViewPager.findViewWithTag("customize_share_view_pager");
        if (viewPager2 != null) {
            return (CardView) viewPager2.findViewWithTag(Integer.valueOf(viewPager2.getCurrentItem()));
        }
        return null;
    }

    private final Bitmap getBitmapByUriStr(String bitmapUriStr) {
        try {
            Uri uri = Uri.parse(bitmapUriStr);
            String path = uri.getPath();
            Logger.i("ShareMethodHolder", "onViewCreated uri=" + uri + " uriPath=" + path);
            return BitmapFactory.decodeFile(path);
        } catch (Exception e) {
            Logger.i("ShareMethodHolder", "getBitmapByUriStr failed. exception=" + e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHolder$lambda$0(TabLayout.g tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        tab.i.setPadding(ExtUtilsKt.getDp(35), ExtUtilsKt.getDp(0), ExtUtilsKt.getDp(35), ExtUtilsKt.getDp(-20));
        if (i == 0) {
            tab.u(k1j.A1);
        }
    }

    private final void listenOnClickWithPressEffect(View view, boolean z, final Function0<Unit> function0) {
        if (z) {
            nuf.f(view);
            ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: wsp
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return TrainPlanShareMethodTabHolder.listenOnClickWithPressEffect$lambda$6(function0, (View) obj);
                }
            }, 1, null);
        }
    }

    public static /* synthetic */ void listenOnClickWithPressEffect$default(TrainPlanShareMethodTabHolder trainPlanShareMethodTabHolder, View view, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        trainPlanShareMethodTabHolder.listenOnClickWithPressEffect(view, z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenOnClickWithPressEffect$lambda$6(Function0 callback, View it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke();
        return Unit.INSTANCE;
    }

    private final void onViewDownload(s4m shareComponent, View view, String title, String des) {
        shareComponent.e(title, des, view);
    }

    private final void onViewShareToMoments(s4m shareComponent, View view, String title, String des) {
        shareComponent.v(title, des, view);
    }

    private final void onViewShareToWechat(s4m shareComponent, View view, String title, String des) {
        shareComponent.u(title, des, view);
    }

    private final void onViewShareViaMore(Activity activity, View view) {
        Bitmap bitmapLoadBitmapFromView$default = ShareUtil.loadBitmapFromView$default(view, 0, 0, 6, null);
        ShareUtil shareUtil = ShareUtil.INSTANCE;
        shareUtil.shareBitmapViaMore(new WeakReference<>(activity), shareUtil.getRoundedCornerBitmap(bitmapLoadBitmapFromView$default, ExtUtilsKt.getDp(16)));
    }

    private final void shareCustomer(AppCompatTextView downloadBtn, AppCompatTextView wechatBtn, AppCompatTextView momentsBtn, AppCompatTextView moreBtn, boolean showWechatShare) {
        ViewExtKt.gone(this.editBtn);
        final s4m s4mVar = new s4m(this.activity);
        final String string = ResourceExtKt.getString(k1j.J1);
        listenOnClickWithPressEffect$default(this, downloadBtn, false, new Function0() { // from class: nsp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainPlanShareMethodTabHolder.shareCustomer$lambda$7(this.f28334a, s4mVar, string);
            }
        }, 1, null);
        listenOnClickWithPressEffect(wechatBtn, showWechatShare, new Function0() { // from class: osp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainPlanShareMethodTabHolder.shareCustomer$lambda$8(this.f29654a, s4mVar, string);
            }
        });
        listenOnClickWithPressEffect(momentsBtn, showWechatShare, new Function0() { // from class: psp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainPlanShareMethodTabHolder.shareCustomer$lambda$9(this.f30714a, s4mVar, string);
            }
        });
        listenOnClickWithPressEffect$default(this, moreBtn, false, new Function0() { // from class: qsp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainPlanShareMethodTabHolder.shareCustomer$lambda$10(this.f31811a);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCustomer$lambda$10(TrainPlanShareMethodTabHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CardView cardViewFindCurtCardViewInShareViewViewPager = this$0.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        this$0.onViewShareViaMore(this$0.activity, cardViewFindCurtCardViewInShareViewViewPager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCustomer$lambda$7(TrainPlanShareMethodTabHolder this$0, s4m shareComponent, String shareTitle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        CardView cardViewFindCurtCardViewInShareViewViewPager = this$0.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        this$0.onViewDownload(shareComponent, cardViewFindCurtCardViewInShareViewViewPager, shareTitle, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCustomer$lambda$8(TrainPlanShareMethodTabHolder this$0, s4m shareComponent, String shareTitle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        CardView cardViewFindCurtCardViewInShareViewViewPager = this$0.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        this$0.onViewShareToWechat(shareComponent, cardViewFindCurtCardViewInShareViewViewPager, shareTitle, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareCustomer$lambda$9(TrainPlanShareMethodTabHolder this$0, s4m shareComponent, String shareTitle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        CardView cardViewFindCurtCardViewInShareViewViewPager = this$0.findCurtCardViewInShareViewViewPager(this$0.shareViewPager);
        if (cardViewFindCurtCardViewInShareViewViewPager == null) {
            return Unit.INSTANCE;
        }
        this$0.onViewShareToMoments(shareComponent, cardViewFindCurtCardViewInShareViewViewPager, shareTitle, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareDefault(AppCompatTextView downloadBtn, AppCompatTextView wechatBtn, AppCompatTextView momentsBtn, AppCompatTextView moreBtn, boolean showWechatShare) {
        final Bitmap bitmapByUriStr;
        ViewExtKt.gone(this.editBtn);
        String str = this.longPicBitmapUriStr;
        if (str == null || (bitmapByUriStr = getBitmapByUriStr(str)) == null) {
            return;
        }
        listenOnClickWithPressEffect$default(this, downloadBtn, false, new Function0() { // from class: rsp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainPlanShareMethodTabHolder.shareDefault$lambda$1(this.f32870a, bitmapByUriStr);
            }
        }, 1, null);
        listenOnClickWithPressEffect(wechatBtn, showWechatShare, new Function0() { // from class: ssp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainPlanShareMethodTabHolder.shareDefault$lambda$2(this.f33955a, bitmapByUriStr);
            }
        });
        listenOnClickWithPressEffect(momentsBtn, showWechatShare, new Function0() { // from class: tsp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainPlanShareMethodTabHolder.shareDefault$lambda$3(this.f35004a, bitmapByUriStr);
            }
        });
        listenOnClickWithPressEffect$default(this, moreBtn, false, new Function0() { // from class: usp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrainPlanShareMethodTabHolder.shareDefault$lambda$4(this.f36095a, bitmapByUriStr);
            }
        }, 1, null);
        ViewExtKt.gone(moreBtn);
        ViewParent parent = momentsBtn.getParent();
        LinearLayout linearLayout = parent instanceof LinearLayout ? (LinearLayout) parent : null;
        if (linearLayout != null) {
            linearLayout.setWeightSum(-1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareDefault$lambda$1(TrainPlanShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseActivity baseActivity = this$0.activity;
        Intrinsics.checkNotNull(baseActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        ShareUtil.saveImageToGallery(baseActivity, bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareDefault$lambda$2(TrainPlanShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o3r.i().v(this$0.activity, bitmap, "title", "des", o3r.j());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareDefault$lambda$3(TrainPlanShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o3r.i().v(this$0.activity, bitmap, "title", "des", o3r.k());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareDefault$lambda$4(TrainPlanShareMethodTabHolder this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ShareUtil.INSTANCE.shareBitmapViaMore(new WeakReference<>(this$0.activity), bitmap);
        return Unit.INSTANCE;
    }

    public final void initHolder() {
        View viewFindViewById = this.shareBtnGroup.findViewById(csi.G2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = this.shareBtnGroup.findViewById(csi.J2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = this.shareBtnGroup.findViewById(csi.I2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final AppCompatTextView appCompatTextView3 = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = this.shareBtnGroup.findViewById(csi.H2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        final AppCompatTextView appCompatTextView4 = (AppCompatTextView) viewFindViewById4;
        final boolean z = !AppUtil.INSTANCE.isPlayChannel();
        this.shareViewPager.setAdapter(new TrainPlanShareMethodAdapter(this.activity, this.longPicBitmapUriStr, this.mCustomerSharePlanReport));
        this.shareViewPager.setUserInputEnabled(false);
        this.tabLayout.setTabMode(0);
        this.tabLayout.K(ExtUtilsKt.getColor(eki.g), ExtUtilsKt.getColor(eki.d));
        this.shareViewPager.setOffscreenPageLimit(1);
        new b(this.tabLayout, this.shareViewPager, new b.InterfaceC0219b() { // from class: vsp
            @Override // com.google.android.material.tabs.b.InterfaceC0219b
            public final void a(TabLayout.g gVar, int i) {
                TrainPlanShareMethodTabHolder.initHolder$lambda$0(gVar, i);
            }
        }).a();
        this.tabLayout.addOnTabSelectedListener(new TabLayout.d() { // from class: com.xiaomi.fitness.training_plan.report.TrainPlanShareMethodTabHolder.initHolder.2
            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabReselected(TabLayout.g tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabSelected(TabLayout.g tab) {
                TrainPlanShareMethodTabHolder.this.mViewModel.setCurtTabPosition(tab != null ? tab.g() : 0);
                Integer numValueOf = tab != null ? Integer.valueOf(tab.g()) : null;
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    TrainPlanShareMethodTabHolder.this.shareDefault(appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, z);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabUnselected(TabLayout.g tab) {
            }
        });
        this.mViewModel.setCurtTabPosition(0);
        TabLayout tabLayout = this.tabLayout;
        tabLayout.F(tabLayout.x(0));
        ViewExtKt.gone(this.tabLayout);
        shareDefault(appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, z);
    }
}

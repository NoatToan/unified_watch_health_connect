package com.xiaomi.fitness.share.report.holder;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.b;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.view.SportShareEditView;
import com.xiaomi.fitness.detail.view.StickerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.adapter.EditCustomRatioAdapter;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import defpackage.bsi;
import defpackage.dki;
import defpackage.gpp;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.lp5;
import defpackage.s4m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u0000 p2\u00020\u0001:\u0001pBy\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010D\u001a\u00020\r\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020\u0002\u0012\b\u0010Q\u001a\u0004\u0018\u00010F\u0012\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bn\u0010oJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0011¢\u0006\u0004\b&\u0010\u0019J\u0015\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\r¢\u0006\u0004\b(\u0010\u0010J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\r¢\u0006\u0004\b*\u0010\u0010J\u0015\u0010+\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\r¢\u0006\u0004\b+\u0010\u0010J+\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c2\u0006\u0010'\u001a\u00020\r¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u0004\u0018\u00010F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010HR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010_\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010^R\u0016\u0010`\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010ER\u0016\u0010a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010ER\u0016\u0010b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010YR\u0016\u0010c\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010YR\u0016\u0010d\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010YR\u001c\u0010e\u001a\b\u0012\u0004\u0012\u00020\\0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001c\u0010g\u001a\b\u0012\u0004\u0012\u00020\\0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0016\u0010h\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010ER\u0016\u0010i\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010ER\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010l¨\u0006q"}, d2 = {"Lcom/xiaomi/fitness/share/report/holder/EditCustomTabLayoutHolder;", "", "Landroid/view/View;", "target", "", "expand", "", "translateByOffset", "(Landroid/view/View;Z)V", "refreshBg", "()V", "initTabLayout", "initHolder", "", "stickerViewPosition", "setStickerView", "(I)V", "", "sloganTxt", "timeTxt", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "dataModel", "showSloganView", "(Ljava/lang/String;Ljava/lang/String;Lcom/xiaomi/fitness/detail/data/BasicItemInfo;)V", "updateSloganTxt", "(Ljava/lang/String;)V", "updateSportTxt", "(Lcom/xiaomi/fitness/detail/data/BasicItemInfo;)V", "", "dataList", "showDataList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountCoreInfo", "isCommonSport", "setDataViewUserInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;Z)V", "sportName", "updateSportName", "chartType", "changeLineChartType", "position", "refreshRectangleBg", "refreshSquareBg", "show", "showWhiteBottomTab", "(ZLjava/util/List;I)V", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lgpp;", "mBinding", "Lgpp;", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "mViewModel", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "Landroid/widget/ImageView;", "tabBg", "Landroid/widget/ImageView;", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "bgPositionInPreviewList", "I", "Landroid/widget/TextView;", "rightUpperBtn", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/detail/view/SportShareEditView;", "editPanel", "Lcom/xiaomi/fitness/detail/view/SportShareEditView;", "Landroidx/recyclerview/widget/RecyclerView;", "bottomWindowRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "sharePanel", "Landroid/view/View;", "doneBtnTv", "Landroidx/constraintlayout/widget/ConstraintLayout;", "viewPagerContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter;", "customRatioAdapter", "Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter;", "sportNameTxt", "Ljava/lang/String;", "isOriginalSize", "Z", "Lcom/xiaomi/fitness/detail/view/StickerView;", "editStickerView", "Lcom/xiaomi/fitness/detail/view/StickerView;", "editSquareStickerView", "currentBgPosition", "editType", "valueTypeTxt", "valueTxt", "unitTxt", "sportShareEditViewList", "Ljava/util/List;", "sportShareEditViewSquareList", "originalCardWidth", "originalCardHeight", "", "offsetX", "F", "offsetY", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Lgpp;Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;Landroid/widget/ImageView;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;ILandroid/widget/TextView;Lcom/xiaomi/fitness/detail/view/SportShareEditView;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EditCustomTabLayoutHolder {
    public static final int EDIT_DATA = 1;
    public static final int EDIT_SLOGAN = 3;
    public static final int EDIT_STICK = 2;

    @NotNull
    public static final String PROPERTY_NAME_TRANSLATION_X = "translationX";

    @NotNull
    public static final String PROPERTY_NAME_TRANSLATION_Y = "translationY";
    public static final float SCALING_FACTOR = 1.07f;

    @NotNull
    public static final String TAG = "EditCustomTabLayoutHolder";

    @NotNull
    private final BaseActivity activity;
    private final int bgPositionInPreviewList;

    @NotNull
    private final RecyclerView bottomWindowRecycler;
    private int currentBgPosition;

    @Nullable
    private EditCustomRatioAdapter customRatioAdapter;

    @Nullable
    private final TextView doneBtnTv;

    @NotNull
    private final SportShareEditView editPanel;

    @Nullable
    private StickerView editSquareStickerView;

    @Nullable
    private StickerView editStickerView;
    private int editType;
    private boolean isOriginalSize;

    @NotNull
    private final gpp mBinding;

    @NotNull
    private final SportReportShareViewModel mViewModel;
    private float offsetX;
    private float offsetY;
    private int originalCardHeight;
    private int originalCardWidth;

    @NotNull
    private final TextView rightUpperBtn;

    @NotNull
    private final View sharePanel;

    @NotNull
    private String sportNameTxt;

    @NotNull
    private final SportBasicReport sportReport;

    @NotNull
    private List<? extends StickerView> sportShareEditViewList;

    @NotNull
    private List<? extends StickerView> sportShareEditViewSquareList;

    @NotNull
    private final ImageView tabBg;

    @NotNull
    private final TabLayout tabLayout;

    @NotNull
    private String unitTxt;

    @NotNull
    private String valueTxt;

    @NotNull
    private String valueTypeTxt;

    @NotNull
    private final ViewPager2 viewPager;

    @NotNull
    private final ConstraintLayout viewPagerContainer;

    public EditCustomTabLayoutHolder(@NotNull BaseActivity activity, @NotNull gpp mBinding, @NotNull SportReportShareViewModel mViewModel, @NotNull ImageView tabBg, @NotNull TabLayout tabLayout, @NotNull ViewPager2 viewPager, @NotNull SportBasicReport sportReport, int i, @NotNull TextView rightUpperBtn, @NotNull SportShareEditView editPanel, @NotNull RecyclerView bottomWindowRecycler, @NotNull View sharePanel, @Nullable TextView textView, @NotNull ConstraintLayout viewPagerContainer) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        Intrinsics.checkNotNullParameter(tabBg, "tabBg");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(rightUpperBtn, "rightUpperBtn");
        Intrinsics.checkNotNullParameter(editPanel, "editPanel");
        Intrinsics.checkNotNullParameter(bottomWindowRecycler, "bottomWindowRecycler");
        Intrinsics.checkNotNullParameter(sharePanel, "sharePanel");
        Intrinsics.checkNotNullParameter(viewPagerContainer, "viewPagerContainer");
        this.activity = activity;
        this.mBinding = mBinding;
        this.mViewModel = mViewModel;
        this.tabBg = tabBg;
        this.tabLayout = tabLayout;
        this.viewPager = viewPager;
        this.sportReport = sportReport;
        this.bgPositionInPreviewList = i;
        this.rightUpperBtn = rightUpperBtn;
        this.editPanel = editPanel;
        this.bottomWindowRecycler = bottomWindowRecycler;
        this.sharePanel = sharePanel;
        this.doneBtnTv = textView;
        this.viewPagerContainer = viewPagerContainer;
        this.sportNameTxt = "";
        this.isOriginalSize = true;
        this.currentBgPosition = SportReportShareExtKt.getIndexByPosition(i) + 1;
        this.editType = 1;
        this.valueTypeTxt = "";
        this.valueTxt = "";
        this.unitTxt = "";
        this.sportShareEditViewList = new ArrayList();
        this.sportShareEditViewSquareList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHolder$lambda$0(EditCustomTabLayoutHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UIUtils uIUtils = UIUtils.INSTANCE;
        Context context = this$0.tabBg.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float f = 2;
        this$0.offsetX = ((uIUtils.getScreenWidth(context) / f) - this$0.mBinding.J.getX()) - (this$0.mBinding.J.getWidth() / f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHolder$lambda$1(EditCustomTabLayoutHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.offsetY = (-this$0.mBinding.A.getHeight()) - ExtUtilsKt.getDp(50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17(final EditCustomTabLayoutHolder this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String str = EditCustomRatioAdapter.TAG_RECTANGLE_CARD_VIEW;
        if (num != null && num.intValue() == 0) {
            ViewExtKt.visible(this$0.editPanel);
            ViewGroup.LayoutParams layoutParams = this$0.viewPagerContainer.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = ExtUtilsKt.getDp(246);
            this$0.viewPagerContainer.setLayoutParams(marginLayoutParams);
            ViewExtKt.visible(this$0.tabBg);
            ViewExtKt.gone(this$0.sharePanel);
            ViewExtKt.visible(this$0.tabLayout);
            ViewExtKt.visible(this$0.rightUpperBtn);
            this$0.rightUpperBtn.setText(ResourceExtKt.getString(j1j.O1));
            this$0.rightUpperBtn.setBackground(null);
            ViewExtKt.clickWithTrigger$default(this$0.rightUpperBtn, 0L, new Function1() { // from class: n18
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$2(this.f27434a, (TextView) obj);
                }
            }, 1, null);
            TextView textView = this$0.doneBtnTv;
            if (textView != null) {
                SportReportShareExtKt.listenOnClickWithPressEffect$default(textView, false, new Function0() { // from class: o18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$3(this.f28638a);
                    }
                }, 1, null);
            }
            if (Intrinsics.areEqual(this$0.mViewModel.getEditRatioTypeIsSquareLiveData().getValue(), Boolean.TRUE)) {
                str = EditCustomRatioAdapter.TAG_SQUARE_CARD_VIEW;
            }
            CardView cardView = (CardView) this$0.viewPager.findViewWithTag(str);
            if (cardView != null) {
                ViewGroup.LayoutParams layoutParams2 = cardView.getLayoutParams();
                if (!this$0.isOriginalSize) {
                    layoutParams2.width = this$0.originalCardWidth;
                    layoutParams2.height = this$0.originalCardHeight;
                    cardView.setLayoutParams(layoutParams2);
                    this$0.isOriginalSize = true;
                    if (UIUtils.INSTANCE.getScreenState() == 0) {
                        this$0.translateByOffset(this$0.viewPager, false);
                    }
                }
            }
        } else {
            ViewExtKt.gone(this$0.editPanel);
            ViewExtKt.gone(this$0.tabBg);
            ViewExtKt.visible(this$0.sharePanel);
            ViewExtKt.gone(this$0.tabLayout);
            ViewExtKt.visible(this$0.rightUpperBtn);
            this$0.rightUpperBtn.setBackground(null);
            this$0.rightUpperBtn.setText(ResourceExtKt.getString(j1j.common_edit));
            ViewGroup.LayoutParams layoutParams3 = this$0.viewPagerContainer.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams2.bottomMargin = ExtUtilsKt.getDp(150);
            this$0.viewPagerContainer.setLayoutParams(marginLayoutParams2);
            if (Intrinsics.areEqual(this$0.mViewModel.getEditRatioTypeIsSquareLiveData().getValue(), Boolean.TRUE)) {
                str = EditCustomRatioAdapter.TAG_SQUARE_CARD_VIEW;
            }
            final CardView cardView2 = (CardView) this$0.viewPager.findViewWithTag(str);
            if (cardView2 != null) {
                ViewGroup.LayoutParams layoutParams4 = cardView2.getLayoutParams();
                if (this$0.isOriginalSize) {
                    this$0.originalCardWidth = cardView2.getWidth();
                    this$0.originalCardHeight = cardView2.getHeight();
                    layoutParams4.width = (int) (cardView2.getWidth() * 1.07f);
                    layoutParams4.height = (int) (cardView2.getHeight() * 1.07f);
                    cardView2.setLayoutParams(layoutParams4);
                    this$0.isOriginalSize = false;
                    if (UIUtils.INSTANCE.getScreenState() == 0) {
                        this$0.translateByOffset(this$0.viewPager, true);
                    }
                }
            }
            ViewExtKt.clickWithTrigger$default(this$0.rightUpperBtn, 0L, new Function1() { // from class: p18
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$6(this.f29903a, (TextView) obj);
                }
            }, 1, null);
            View viewFindViewById = this$0.sharePanel.findViewById(bsi.M5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            AppCompatTextView appCompatTextView = (AppCompatTextView) viewFindViewById;
            View viewFindViewById2 = this$0.sharePanel.findViewById(bsi.S5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewFindViewById2;
            View viewFindViewById3 = this$0.sharePanel.findViewById(bsi.R5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) viewFindViewById3;
            View viewFindViewById4 = this$0.sharePanel.findViewById(bsi.O5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            ViewExtKt.gone(this$0.bottomWindowRecycler);
            final s4m s4mVar = new s4m(this$0.activity);
            final String string = ResourceExtKt.getString(j1j.N);
            final String strC = lp5.c(this$0.sportReport.getSportType());
            SportReportShareExtKt.listenOnClickWithPressEffect$default(appCompatTextView, false, new Function0() { // from class: q18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$9(cardView2, this$0, s4mVar, string, strC);
                }
            }, 1, null);
            SportReportShareExtKt.listenOnClickWithPressEffect$default(appCompatTextView2, false, new Function0() { // from class: r18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$11(cardView2, s4mVar, string, strC);
                }
            }, 1, null);
            SportReportShareExtKt.listenOnClickWithPressEffect$default(appCompatTextView3, false, new Function0() { // from class: s18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$13(cardView2, s4mVar, string, strC);
                }
            }, 1, null);
            SportReportShareExtKt.listenOnClickWithPressEffect$default((AppCompatTextView) viewFindViewById4, false, new Function0() { // from class: t18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$16(this.f34198a, cardView2);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$11(final CardView cardView, final s4m shareComponent, final String title, final String str) {
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(title, "$title");
        SportReportShareExtKt.checkCardViewExistAndShareIfNeed(cardView, new Function0() { // from class: u18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$11$lambda$10(shareComponent, title, str, cardView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$11$lambda$10(s4m shareComponent, String title, String str, CardView cardView) {
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(title, "$title");
        shareComponent.u(title, str, cardView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$13(final CardView cardView, final s4m shareComponent, final String title, final String str) {
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(title, "$title");
        SportReportShareExtKt.checkCardViewExistAndShareIfNeed(cardView, new Function0() { // from class: i18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$13$lambda$12(shareComponent, title, str, cardView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$13$lambda$12(s4m shareComponent, String title, String str, CardView cardView) {
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(title, "$title");
        shareComponent.v(title, str, cardView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$16(final EditCustomTabLayoutHolder this$0, final CardView cardView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.checkExternalStoragePermissionIfNeed(this$0.activity, new Function0() { // from class: m18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$16$lambda$15(cardView, this$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$16$lambda$15(final CardView cardView, final EditCustomTabLayoutHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportReportShareExtKt.checkCardViewExistAndShareIfNeed(cardView, new Function0() { // from class: e18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$16$lambda$15$lambda$14(cardView, this$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$16$lambda$15$lambda$14(CardView cardView, EditCustomTabLayoutHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(cardView);
        ShareUtil.INSTANCE.shareBitmapViaMore(new WeakReference<>(this$0.activity), ShareUtil.loadBitmapFromView$default(cardView, 0, 0, 6, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$2(EditCustomTabLayoutHolder this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mViewModel.getEditModeLiveData().setValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$3(EditCustomTabLayoutHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mViewModel.getEditModeLiveData().setValue(1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$6(EditCustomTabLayoutHolder this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mViewModel.getEditModeLiveData().setValue(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$9(final CardView cardView, final EditCustomTabLayoutHolder this$0, final s4m shareComponent, final String title, final String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(title, "$title");
        SportReportShareExtKt.checkCardViewExistAndShareIfNeed(cardView, new Function0() { // from class: j18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$9$lambda$8(this.f22324a, shareComponent, title, str, cardView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$9$lambda$8(EditCustomTabLayoutHolder this$0, final s4m shareComponent, final String title, final String str, final CardView cardView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(title, "$title");
        SportReportShareExtKt.checkSaveImageToGalleryPermission(this$0.activity, new Function0() { // from class: h18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditCustomTabLayoutHolder.initHolder$lambda$17$lambda$9$lambda$8$lambda$7(shareComponent, title, str, cardView);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$17$lambda$9$lambda$8$lambda$7(s4m shareComponent, String title, String str, CardView cardView) {
        Intrinsics.checkNotNullParameter(shareComponent, "$shareComponent");
        Intrinsics.checkNotNullParameter(title, "$title");
        shareComponent.e(title, str, cardView);
        return Unit.INSTANCE;
    }

    private final void initTabLayout() {
        this.tabLayout.addOnTabSelectedListener(new TabLayout.d() { // from class: com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder.initTabLayout.1
            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabReselected(TabLayout.g tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabSelected(TabLayout.g tab) {
                View viewE;
                EditCustomRatioAdapter editCustomRatioAdapter;
                TextView textView = null;
                Integer numValueOf = tab != null ? Integer.valueOf(tab.g()) : null;
                Logger.i(EditCustomTabLayoutHolder.TAG, "addOnTabSelectedListener onTabSelected position=" + numValueOf + " currentBgPosition=" + EditCustomTabLayoutHolder.this.currentBgPosition);
                int iG = tab != null ? tab.g() : 0;
                EditCustomTabLayoutHolder.this.mViewModel.getEditRatioTypeIsSquareLiveData().setValue(Boolean.valueOf(iG == 1));
                if (EditCustomTabLayoutHolder.this.editStickerView != null && EditCustomTabLayoutHolder.this.editType == 2) {
                    if (iG == 0) {
                        EditCustomRatioAdapter editCustomRatioAdapter2 = EditCustomTabLayoutHolder.this.customRatioAdapter;
                        if (editCustomRatioAdapter2 != null) {
                            StickerView stickerView = EditCustomTabLayoutHolder.this.editStickerView;
                            Intrinsics.checkNotNull(stickerView);
                            editCustomRatioAdapter2.setRectangleStickerView(stickerView);
                        }
                    } else if (EditCustomTabLayoutHolder.this.editSquareStickerView != null && (editCustomRatioAdapter = EditCustomTabLayoutHolder.this.customRatioAdapter) != null) {
                        StickerView stickerView2 = EditCustomTabLayoutHolder.this.editSquareStickerView;
                        Intrinsics.checkNotNull(stickerView2);
                        editCustomRatioAdapter.setSquareStickerView(stickerView2);
                    }
                }
                EditCustomTabLayoutHolder.this.refreshBg();
                if (tab != null && (viewE = tab.e()) != null) {
                    textView = (TextView) viewE.findViewById(bsi.p7);
                }
                if (textView != null) {
                    textView.setTextColor(ExtUtilsKt.getColor(dki.f2));
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.c
            public void onTabUnselected(TabLayout.g tab) {
                View viewE;
                TextView textView = (tab == null || (viewE = tab.e()) == null) ? null : (TextView) viewE.findViewById(bsi.p7);
                if (textView != null) {
                    textView.setTextColor(ExtUtilsKt.getColor(dki.k2));
                }
            }
        });
        EditCustomRatioAdapter editCustomRatioAdapter = new EditCustomRatioAdapter(this.sportReport, this.bgPositionInPreviewList, this.activity, this.mViewModel);
        this.customRatioAdapter = editCustomRatioAdapter;
        Integer currentEditType = this.mViewModel.getCurrentEditType();
        editCustomRatioAdapter.setShowEditType(currentEditType != null ? currentEditType.intValue() : 1);
        this.viewPager.setAdapter(this.customRatioAdapter);
        this.viewPager.setUserInputEnabled(false);
        this.viewPager.k(0, false);
        this.viewPager.setOffscreenPageLimit(2);
        this.viewPager.setClipChildren(false);
        this.viewPager.setPageTransformer(new b(ExtUtilsKt.getDp(Float.valueOf(13.0f))));
        new com.google.android.material.tabs.b(this.tabLayout, this.viewPager, new com.google.android.material.tabs.b.InterfaceC0219b() { // from class: k18
            @Override // com.google.android.material.tabs.b.InterfaceC0219b
            public final void a(TabLayout.g gVar, int i) {
                EditCustomTabLayoutHolder.initTabLayout$lambda$18(gVar, i);
            }
        }).a();
        int i = this.bgPositionInPreviewList < 3 ? 0 : 1;
        TabLayout tabLayout = this.tabLayout;
        tabLayout.F(tabLayout.x(i));
        this.tabLayout.post(new Runnable() { // from class: l18
            @Override // java.lang.Runnable
            public final void run() {
                EditCustomTabLayoutHolder.initTabLayout$lambda$19(this.f24504a);
            }
        });
        this.sportNameTxt = lp5.c(lp5.a(this.sportReport));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTabLayout$lambda$18(TabLayout.g tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (i != 0) {
            tab.u(j1j.P1);
            return;
        }
        tab.n(ResourceExtKt.getString(j1j.R1));
        tab.i.setContentDescription(ResourceExtKt.getString(j1j.R1));
        tab.o(ivi.o1);
        View viewE = tab.e();
        TextView textView = viewE != null ? (TextView) viewE.findViewById(bsi.p7) : null;
        if (textView != null) {
            textView.setText(j1j.Q1);
        }
        if (textView != null) {
            textView.setImportantForAccessibility(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTabLayout$lambda$19(EditCustomTabLayoutHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshBg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshBg() {
        Integer currentEditBgPosition = this.mViewModel.getCurrentEditBgPosition();
        int iIntValue = (currentEditBgPosition != null ? currentEditBgPosition.intValue() : 0) + 1;
        if (iIntValue == 0) {
            return;
        }
        if (Intrinsics.areEqual(this.mViewModel.getEditRatioTypeIsSquareLiveData().getValue(), Boolean.FALSE)) {
            EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
            if (editCustomRatioAdapter != null) {
                editCustomRatioAdapter.replaceRectangleBgOrCustomizeBg(iIntValue);
                return;
            }
            return;
        }
        EditCustomRatioAdapter editCustomRatioAdapter2 = this.customRatioAdapter;
        if (editCustomRatioAdapter2 != null) {
            editCustomRatioAdapter2.replaceSquareBgOrCustomizeBg(iIntValue);
        }
    }

    private final void translateByOffset(View target, boolean expand) {
        float f = expand ? 0.0f : this.offsetX;
        float f2 = expand ? this.offsetX : 0.0f;
        float f3 = expand ? 0.0f : this.offsetY;
        float f4 = expand ? this.offsetY : 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(target, PROPERTY_NAME_TRANSLATION_X, f, f2);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(target, PROPERTY_NAME_TRANSLATION_Y, f3, f4);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat2, "ofFloat(...)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.start();
    }

    public final void changeLineChartType(int chartType) {
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.changeLineChartType(chartType);
        }
    }

    public final void initHolder() {
        this.sportShareEditViewList = SportReportShareExtKt.getStickerListToShow(this.activity, this.sportReport);
        this.sportShareEditViewSquareList = SportReportShareExtKt.getStickerListToShow(this.activity, this.sportReport);
        if (UIUtils.INSTANCE.getScreenState() == 0) {
            this.mBinding.J.post(new Runnable() { // from class: v18
                @Override // java.lang.Runnable
                public final void run() {
                    EditCustomTabLayoutHolder.initHolder$lambda$0(this.f36372a);
                }
            });
            this.mBinding.A.post(new Runnable() { // from class: f18
                @Override // java.lang.Runnable
                public final void run() {
                    EditCustomTabLayoutHolder.initHolder$lambda$1(this.f17285a);
                }
            });
        }
        initTabLayout();
        this.mViewModel.getEditModeLiveData().observe(this.activity, new EditCustomTabLayoutHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g18
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditCustomTabLayoutHolder.initHolder$lambda$17(this.f18458a, (Integer) obj);
            }
        }));
    }

    public final void refreshRectangleBg(int position) {
        this.currentBgPosition = position;
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.replaceRectangleBgOrCustomizeBg(position);
        }
    }

    public final void refreshSquareBg(int position) {
        this.currentBgPosition = position;
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.replaceSquareBgOrCustomizeBg(position);
        }
    }

    public final void setDataViewUserInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.setDataViewUserInfo(accountCoreInfo, isCommonSport);
        }
    }

    public final void setStickerView(int stickerViewPosition) {
        EditCustomRatioAdapter editCustomRatioAdapter;
        StickerView stickerView;
        this.editType = 2;
        EditCustomRatioAdapter editCustomRatioAdapter2 = this.customRatioAdapter;
        if (editCustomRatioAdapter2 != null) {
            editCustomRatioAdapter2.updateShowView(2);
        }
        this.editStickerView = this.sportShareEditViewList.get(stickerViewPosition);
        this.editSquareStickerView = this.sportShareEditViewSquareList.get(stickerViewPosition);
        if (this.tabLayout.getSelectedTabPosition() == 0 && (stickerView = this.editStickerView) != null) {
            EditCustomRatioAdapter editCustomRatioAdapter3 = this.customRatioAdapter;
            if (editCustomRatioAdapter3 != null) {
                Intrinsics.checkNotNull(stickerView);
                editCustomRatioAdapter3.setRectangleStickerView(stickerView);
                return;
            }
            return;
        }
        StickerView stickerView2 = this.editSquareStickerView;
        if (stickerView2 == null || (editCustomRatioAdapter = this.customRatioAdapter) == null) {
            return;
        }
        Intrinsics.checkNotNull(stickerView2);
        editCustomRatioAdapter.setSquareStickerView(stickerView2);
    }

    public final void showDataList(@NotNull List<BasicItemInfo> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.editType = 1;
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.updateShowView(1);
        }
        EditCustomRatioAdapter editCustomRatioAdapter2 = this.customRatioAdapter;
        if (editCustomRatioAdapter2 != null) {
            editCustomRatioAdapter2.showDataList(dataList);
        }
    }

    public final void showSloganView(@NotNull String sloganTxt, @NotNull String timeTxt, @NotNull BasicItemInfo dataModel) {
        String string;
        Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
        Intrinsics.checkNotNullParameter(timeTxt, "timeTxt");
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        this.editType = 3;
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.updateShowView(3);
        }
        String pluralTitle = dataModel.getPluralTitle();
        if (pluralTitle == null || pluralTitle.length() == 0) {
            string = AppUtil.getApp().getString(dataModel.getTitle());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = dataModel.getPluralTitle();
        }
        String string2 = AppUtil.getApp().getString(j1j.M0, this.sportNameTxt, string, dataModel.getData(), dataModel.getUnit());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        EditCustomRatioAdapter editCustomRatioAdapter2 = this.customRatioAdapter;
        if (editCustomRatioAdapter2 != null) {
            editCustomRatioAdapter2.showSloganView(sloganTxt, timeTxt, string2);
        }
    }

    public final void showWhiteBottomTab(boolean show, @NotNull List<BasicItemInfo> dataList, int chartType) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.showWhiteBottomTag(show, dataList, chartType);
        }
    }

    public final void updateSloganTxt(@NotNull String sloganTxt) {
        Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.updateSloganTxt(sloganTxt);
        }
    }

    public final void updateSportName(@NotNull String sportName) {
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        this.sportNameTxt = sportName;
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.updateSportNameTxt(sportName);
        }
        EditCustomRatioAdapter editCustomRatioAdapter2 = this.customRatioAdapter;
        if (editCustomRatioAdapter2 != null) {
            editCustomRatioAdapter2.updateWhiteBottomSportName(this.sportNameTxt);
        }
        EditCustomRatioAdapter editCustomRatioAdapter3 = this.customRatioAdapter;
        if (editCustomRatioAdapter3 != null) {
            editCustomRatioAdapter3.notifyDataSetChanged();
        }
    }

    public final void updateSportTxt(@NotNull BasicItemInfo dataModel) {
        String string;
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        String pluralTitle = dataModel.getPluralTitle();
        if (pluralTitle == null || pluralTitle.length() == 0) {
            string = AppUtil.getApp().getString(dataModel.getTitle());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = dataModel.getPluralTitle();
        }
        this.valueTypeTxt = string;
        this.valueTxt = dataModel.getData();
        this.unitTxt = dataModel.getUnit();
        String string2 = AppUtil.getApp().getString(j1j.M0, this.sportNameTxt, this.valueTypeTxt, this.valueTxt, this.unitTxt);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        EditCustomRatioAdapter editCustomRatioAdapter = this.customRatioAdapter;
        if (editCustomRatioAdapter != null) {
            editCustomRatioAdapter.updateSportTxt(string2);
        }
    }
}

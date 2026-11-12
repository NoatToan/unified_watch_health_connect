package com.xiaomi.fitness.homepage.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.health.threetarget.RainbowExKt;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.weight.util.TextTypefaceSpan;
import com.xiaomi.fitness.homepage.ShareCaloConsumActivity;
import com.xiaomi.fitness.homepage.util.HealthDataUtil;
import com.xiaomi.fitness.homepage.view.DataHeaderV2View;
import com.xiaomi.fitness.util.CalorieUtils;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.fitness.widget.view.HomeHeaderView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.ili;
import defpackage.jui;
import defpackage.lpi;
import defpackage.nuf;
import defpackage.pni;
import defpackage.qxi;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 m2\u00020\u0001:\u0001mB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0014J\b\u0010S\u001a\u00020PH\u0014J\u0010\u0010T\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020LH\u0002J\b\u0010V\u001a\u00020PH\u0002J\u000e\u0010W\u001a\u0004\u0018\u00010X*\u00020\u0003H\u0002J\u000e\u0010Y\u001a\u00020P2\u0006\u0010Z\u001a\u00020CJ\u000e\u0010[\u001a\u00020P2\u0006\u0010\\\u001a\u00020]J\u0018\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020aH\u0002J\u0006\u0010c\u001a\u00020PJ\u000e\u0010d\u001a\u00020P2\u0006\u0010\\\u001a\u00020;J\u001a\u0010e\u001a\u00020P2\b\u0010f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010g\u001a\u00020LH\u0002J\u0010\u0010h\u001a\u00020P2\u0006\u0010i\u001a\u00020LH\u0002J\u0018\u0010j\u001a\u00020a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010k\u001a\u00020lH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001c\u0010+\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0010\u0010@\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010D\u001a\u00020EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010F\"\u0004\bG\u0010HR\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020LX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"Lcom/xiaomi/fitness/homepage/view/DataHeaderV2View;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "root", "Landroid/view/ViewGroup;", "targetContainnerView", "Landroid/view/View;", "getTargetContainnerView", "()Landroid/view/View;", "setTargetContainnerView", "(Landroid/view/View;)V", "item1View", "Lcom/xiaomi/fitness/homepage/view/DataHeaderTargetItemV2View;", "getItem1View", "()Lcom/xiaomi/fitness/homepage/view/DataHeaderTargetItemV2View;", "setItem1View", "(Lcom/xiaomi/fitness/homepage/view/DataHeaderTargetItemV2View;)V", "item2View", "getItem2View", "setItem2View", "item3View", "getItem3View", "setItem3View", "standIconView", "Landroid/widget/ImageView;", "getStandIconView", "()Landroid/widget/ImageView;", "setStandIconView", "(Landroid/widget/ImageView;)V", "standLableView", "Landroid/widget/TextView;", "getStandLableView", "()Landroid/widget/TextView;", "setStandLableView", "(Landroid/widget/TextView;)V", "thingView", "getThingView", "setThingView", "thingNumView", "getThingNumView", "setThingNumView", "targetView", "Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "getTargetView", "()Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;", "setTargetView", "(Lcom/xiaomi/fitness/health/threetarget/model/ThreeTargetView;)V", "homeHeaderView", "Lcom/xiaomi/fitness/widget/view/HomeHeaderView;", "getHomeHeaderView", "()Lcom/xiaomi/fitness/widget/view/HomeHeaderView;", "setHomeHeaderView", "(Lcom/xiaomi/fitness/widget/view/HomeHeaderView;)V", "goalReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "getGoalReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "setGoalReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;)V", "otherViewGroup", "reflectionView", "mAddClickListener", "Landroid/view/View$OnClickListener;", "isFemale", "", "()Z", "setFemale", "(Z)V", "rainbowFoodCard", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rainbowFoodType", "", "rainbowFoodCount", "targetParent", "onConfigurationChanged", "", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "onFinishInflate", "createContentView", TSMAuthContants.PARAM_RESOURCE, "setCalorieFoodPaddingEnd", "getFragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "setAddDevListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "bindOtherGoalReport", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "getSpannableStr", "Landroid/text/SpannableString;", "targetString", "", "wholeStr", "refreshAnimation", "bindGoalReport", "onItemClickListener", "view", "type", "bindCalo", "achievedValue", "getUnitAvStr", "item", "Lcom/xiaomi/fit/fitness/export/data/aggregation/GoalItem;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataHeaderV2View.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataHeaderV2View.kt\ncom/xiaomi/fitness/homepage/view/DataHeaderV2View\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,401:1\n1872#2,3:402\n1#3:405\n*S KotlinDebug\n*F\n+ 1 DataHeaderV2View.kt\ncom/xiaomi/fitness/homepage/view/DataHeaderV2View\n*L\n262#1:402,3\n*E\n"})
public final class DataHeaderV2View extends RelativeLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "DataHeaderV2View";

    @Nullable
    private DailyGoalReport goalReport;

    @Nullable
    private HomeHeaderView homeHeaderView;
    private boolean isFemale;

    @Nullable
    private DataHeaderTargetItemV2View item1View;

    @Nullable
    private DataHeaderTargetItemV2View item2View;

    @Nullable
    private DataHeaderTargetItemV2View item3View;

    @Nullable
    private View.OnClickListener mAddClickListener;

    @Nullable
    private View otherViewGroup;

    @Nullable
    private ConstraintLayout rainbowFoodCard;
    private int rainbowFoodCount;
    private int rainbowFoodType;

    @Nullable
    private ImageView reflectionView;

    @NotNull
    private ViewGroup root;

    @Nullable
    private ImageView standIconView;

    @Nullable
    private TextView standLableView;

    @Nullable
    private View targetContainnerView;

    @Nullable
    private ConstraintLayout targetParent;

    @Nullable
    private ThreeTargetView targetView;

    @Nullable
    private TextView thingNumView;

    @Nullable
    private ImageView thingView;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/homepage/view/DataHeaderV2View$Companion;", "", "<init>", "()V", "TAG", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DataHeaderV2View(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewInflate = LayoutInflater.from(context).inflate(jui.X3, this);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.root = (ViewGroup) viewInflate;
        this.isFemale = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isFemale();
    }

    private final void bindCalo(int achievedValue) {
        String quantityString;
        CalorieUtils calorieUtils = CalorieUtils.INSTANCE;
        Pair<String, Integer> numAndSmallImageRes = calorieUtils.getNumAndSmallImageRes(achievedValue);
        String strComponent1 = numAndSmallImageRes.component1();
        int iIntValue = numAndSmallImageRes.component2().intValue();
        TextView textView = this.thingNumView;
        if (textView != null) {
            textView.setText(strComponent1);
        }
        Pair<Integer, Integer> pairCalo2things = calorieUtils.calo2things(achievedValue);
        this.rainbowFoodCount = pairCalo2things.getFirst().intValue();
        int iIntValue2 = pairCalo2things.getSecond().intValue();
        this.rainbowFoodType = iIntValue2;
        HealthTabOneTrackExtKt.oneTrackRainbowFoodExpose(iIntValue2, this.rainbowFoodCount);
        ImageView imageView = this.thingView;
        if (imageView != null) {
            imageView.setBackgroundResource(iIntValue);
        }
        int i = this.rainbowFoodType;
        if (i == 0) {
            Resources resources = getContext().getResources();
            int i2 = qxi.f31940k;
            int i3 = this.rainbowFoodCount;
            quantityString = resources.getQuantityString(i2, i3, Integer.valueOf(i3));
            Intrinsics.checkNotNull(quantityString);
        } else if (i == 1) {
            Resources resources2 = getContext().getResources();
            int i4 = qxi.m;
            int i5 = this.rainbowFoodCount;
            quantityString = resources2.getQuantityString(i4, i5, Integer.valueOf(i5));
            Intrinsics.checkNotNull(quantityString);
        } else if (i != 2) {
            quantityString = "";
        } else {
            Resources resources3 = getContext().getResources();
            int i6 = qxi.l;
            int i7 = this.rainbowFoodCount;
            quantityString = resources3.getQuantityString(i6, i7, Integer.valueOf(i7));
            Intrinsics.checkNotNull(quantityString);
        }
        ConstraintLayout constraintLayout = this.rainbowFoodCard;
        if (constraintLayout != null) {
            constraintLayout.setContentDescription(quantityString);
        }
    }

    private final View createContentView(int resource) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(resource, this.root, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        this.targetContainnerView = viewInflate.findViewById(eri.di);
        this.thingView = (ImageView) viewInflate.findViewById(eri.Pi);
        this.thingNumView = (TextView) viewInflate.findViewById(eri.Oi);
        this.targetView = (ThreeTargetView) viewInflate.findViewById(eri.ni);
        this.item1View = (DataHeaderTargetItemV2View) viewInflate.findViewById(eri.g8);
        this.item2View = (DataHeaderTargetItemV2View) viewInflate.findViewById(eri.h8);
        this.item3View = (DataHeaderTargetItemV2View) viewInflate.findViewById(eri.i8);
        this.standIconView = (ImageView) viewInflate.findViewById(eri.dh);
        this.standLableView = (TextView) viewInflate.findViewById(eri.eh);
        this.otherViewGroup = viewInflate.findViewById(eri.rc);
        this.rainbowFoodCard = (ConstraintLayout) viewInflate.findViewById(eri.Ye);
        this.targetParent = (ConstraintLayout) viewInflate.findViewById(eri.ti);
        final ThreeTargetView threeTargetView = this.targetView;
        if (threeTargetView != null) {
            nuf.e(threeTargetView);
            threeTargetView.setOnClickListener(new View.OnClickListener() { // from class: pl5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    DataHeaderV2View.createContentView$lambda$1$lambda$0(threeTargetView, this, view);
                }
            });
            threeTargetView.setContentDescription(ResourceExtKt.getString(c0j.jm));
        }
        final ImageView imageView = (ImageView) viewInflate.findViewById(eri.Sd);
        this.reflectionView = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ql5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    DataHeaderV2View.createContentView$lambda$3$lambda$2(imageView, view);
                }
            });
            imageView.setContentDescription(ResourceExtKt.getString(c0j.jm));
        }
        setCalorieFoodPaddingEnd();
        ConstraintLayout constraintLayout = this.rainbowFoodCard;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: rl5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataHeaderV2View.createContentView$lambda$5(this.f32663a, view);
                }
            });
        }
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createContentView$lambda$1$lambda$0(ThreeTargetView this_apply, DataHeaderV2View this$0, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HealthDataUtil.INSTANCE.intentSportTarget(this_apply.getContext(), null);
        HealthTabOneTrackExtKt.oneTrackRainbowOnClick(this$0.goalReport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createContentView$lambda$3$lambda$2(ImageView this_apply, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        HealthDataUtil.INSTANCE.intentSportTarget(this_apply.getContext(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createContentView$lambda$5(final DataHeaderV2View this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HealthTabOneTrackExtKt.oneTrackOnClickRainbowFood(this$0.rainbowFoodType, this$0.rainbowFoodCount);
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FragmentActivity fragmentActivity = this$0.getFragmentActivity(context);
        if (fragmentActivity != null) {
            CalorieUtils calorieUtils = CalorieUtils.INSTANCE;
            boolean zCheckFoodShareBgResourcesExist = calorieUtils.checkFoodShareBgResourcesExist();
            Logger.d(TAG, "rainbowFoodCard exist=" + zCheckFoodShareBgResourcesExist);
            if (zCheckFoodShareBgResourcesExist) {
                this$0.getContext().startActivity(new Intent(this$0.getContext(), (Class<?>) ShareCaloConsumActivity.class));
                return;
            }
            final CommonDialog commonDialogCreate = new CommonDialog.c("download bg").setCustomLayoutId(jui.o).create();
            commonDialogCreate.showIfNeed(fragmentActivity.getSupportFragmentManager());
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
            mutableLiveData.observe(fragmentActivity, new DataHeaderV2View$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sl5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DataHeaderV2View.createContentView$lambda$5$lambda$4(commonDialogCreate, this$0, (Boolean) obj);
                }
            }));
            calorieUtils.downloadShareFoodBg(mutableLiveData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createContentView$lambda$5$lambda$4(CommonDialog commonDialog, DataHeaderV2View this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (commonDialog.isShowing()) {
            commonDialog.dismiss();
        }
        if (bool == null) {
            Context context = this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ToastExtKt.toastShort(context, c0j.common_download_fail);
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            this$0.getContext().startActivity(new Intent(this$0.getContext(), (Class<?>) ShareCaloConsumActivity.class));
        }
        return Unit.INSTANCE;
    }

    private final FragmentActivity getFragmentActivity(Context context) {
        Context baseContext;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
            return null;
        }
        return getFragmentActivity(baseContext);
    }

    private final SpannableString getSpannableStr(String targetString, String wholeStr) {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) wholeStr, targetString, 0, false, 6, (Object) null);
        int length = targetString.length() + iIndexOf$default;
        SpannableString spannableString = new SpannableString(wholeStr);
        Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(AppUtil.getApp(), lpi.c);
        Intrinsics.checkNotNull(typefaceAsResourceId);
        try {
            spannableString.setSpan(new TextTypefaceSpan(typefaceAsResourceId), iIndexOf$default, length, 17);
            spannableString.toString();
            return spannableString;
        } catch (Exception unused) {
            return new SpannableString(getResources().getString(c0j.t7));
        }
    }

    private final String getUnitAvStr(Context context, GoalItem item) {
        int type = item.getType();
        if (type == 1) {
            String quantityString = context.getResources().getQuantityString(qxi.v, item.getGoalValue(), Integer.valueOf(item.getGoalValue()));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        if (type == 2) {
            String quantityString2 = context.getResources().getQuantityString(qxi.f31941r, item.getGoalValue(), Integer.valueOf(item.getGoalValue()));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            return quantityString2;
        }
        if (type == 3) {
            String quantityString3 = context.getResources().getQuantityString(qxi.d1, item.getGoalValue(), Integer.valueOf(item.getGoalValue()));
            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
            return quantityString3;
        }
        if (type != 4) {
            return "";
        }
        String quantityString4 = context.getResources().getQuantityString(qxi.y1, item.getGoalValue(), Integer.valueOf(item.getGoalValue()));
        Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
        return quantityString4;
    }

    private final void onItemClickListener(View view, final int type) {
        final Integer num;
        if (view == null) {
            return;
        }
        if (type == 1) {
            num = 3;
        } else if (type == 2) {
            num = 2;
        } else if (type != 3) {
            num = type != 4 ? null : 15;
        } else {
            num = 5;
        }
        if (num != null) {
            final Bundle bundle = new Bundle();
            bundle.putInt("sport_type", num.intValue());
            view.setOnClickListener(new View.OnClickListener() { // from class: tl5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Throwable {
                    DataHeaderV2View.onItemClickListener$lambda$8(this.f34808a, num, bundle, type, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onItemClickListener$lambda$8(DataHeaderV2View this$0, Integer num, Bundle bundle, int i, View view) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        DailyGoalReport dailyGoalReport = this$0.goalReport;
        if (dailyGoalReport != null) {
            HealthTabOneTrackExtKt.oneTrackOnClickRainbowFood(dailyGoalReport, i);
        }
        HealthUtil healthUtil = HealthUtil.INSTANCE;
        if (healthUtil.needCheckUserInfo(num.intValue())) {
            healthUtil.goDataPageCheckUserInfo(this$0.getContext(), num.intValue(), bundle, null, HealthUtil.ORIGIN_HOME_CARD);
        } else {
            healthUtil.goDataPage(null, this$0.getContext(), num.intValue(), bundle, null, HealthUtil.ORIGIN_HOME_CARD);
        }
    }

    private final void setCalorieFoodPaddingEnd() {
        int dp;
        int screenState = UIUtils.INSTANCE.getScreenState();
        if (screenState != 0) {
            dp = (screenState == 1 || screenState == 2) ? ExtUtilsKt.getDp(16) : 0;
        } else {
            dp = ExtUtilsKt.getDp(44);
        }
        Logger.d(TAG, "setCalorieFoodPaddingEnd uiState=" + screenState);
        if (AppUtil.isRTLDirection()) {
            ConstraintLayout constraintLayout = this.rainbowFoodCard;
            if (constraintLayout != null) {
                constraintLayout.setPadding(dp, 0, 0, 0);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = this.rainbowFoodCard;
        if (constraintLayout2 != null) {
            constraintLayout2.setPadding(0, 0, dp, 0);
        }
    }

    public final void bindGoalReport(@NotNull DailyGoalReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        DailyGoalReport dailyGoalReport = this.goalReport;
        if (dailyGoalReport == null || !Intrinsics.areEqual(report, dailyGoalReport)) {
            this.goalReport = report;
        }
        Logger.d(TAG, report.toString());
        if (report.containsStanding()) {
            ImageView imageView = this.reflectionView;
            if (imageView != null) {
                imageView.setImageResource(pni.K0);
            }
        } else {
            ImageView imageView2 = this.reflectionView;
            if (imageView2 != null) {
                imageView2.setImageResource(pni.L0);
            }
        }
        ThreeTargetView threeTargetView = this.targetView;
        if (threeTargetView != null) {
            threeTargetView.x(report, true);
        }
        int i = 0;
        for (Object obj : report.goalList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            GoalItem goalItem = (GoalItem) obj;
            if (i == 0) {
                DataHeaderTargetItemV2View dataHeaderTargetItemV2View = this.item1View;
                if (dataHeaderTargetItemV2View != null) {
                    int targetImg = RainbowExKt.getTargetImg(goalItem);
                    String strValueOf = String.valueOf(goalItem.getAchievedValue());
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    String unitAvStr = getUnitAvStr(context, goalItem);
                    Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    dataHeaderTargetItemV2View.a(targetImg, strValueOf, unitAvStr, RainbowExKt.getTargetOnlyName$default(goalItem, context2, false, 2, null));
                }
                onItemClickListener(this.item1View, goalItem.getType());
            } else if (i == 1) {
                DataHeaderTargetItemV2View dataHeaderTargetItemV2View2 = this.item2View;
                if (dataHeaderTargetItemV2View2 != null) {
                    int targetImg2 = RainbowExKt.getTargetImg(goalItem);
                    String strValueOf2 = String.valueOf(goalItem.getAchievedValue());
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    String unitAvStr2 = getUnitAvStr(context3, goalItem);
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    dataHeaderTargetItemV2View2.a(targetImg2, strValueOf2, unitAvStr2, RainbowExKt.getTargetOnlyName$default(goalItem, context4, false, 2, null));
                }
                onItemClickListener(this.item2View, goalItem.getType());
            } else if (i == 2) {
                DataHeaderTargetItemV2View dataHeaderTargetItemV2View3 = this.item3View;
                if (dataHeaderTargetItemV2View3 != null) {
                    int targetImg3 = RainbowExKt.getTargetImg(goalItem);
                    String strValueOf3 = String.valueOf(goalItem.getAchievedValue());
                    Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                    String unitAvStr3 = getUnitAvStr(context5, goalItem);
                    Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                    dataHeaderTargetItemV2View3.a(targetImg3, strValueOf3, unitAvStr3, RainbowExKt.getTargetOnlyName(goalItem, context6, true));
                }
                onItemClickListener(this.item3View, goalItem.getType());
            }
            this.root.setTag(HealthTabOneTrackExtKt.oneTrackRainbowOnExpose(report));
            if (goalItem.getType() == 2) {
                bindCalo(goalItem.getAchievedValue());
            }
            i = i2;
        }
    }

    public final void bindOtherGoalReport(@NotNull DailyBasicReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        if (report instanceof DailyMHStrengthReport) {
            ImageView imageView = this.standIconView;
            if (imageView != null) {
                imageView.setImageResource(pni.A1);
            }
            int duration = ((DailyMHStrengthReport) report).getDuration();
            String quantityString = getResources().getQuantityString(qxi.Z, duration, Integer.valueOf(duration));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%1d", Arrays.copyOf(new Object[]{Integer.valueOf(duration)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            TextView textView = this.standLableView;
            if (textView != null) {
                textView.setText(getSpannableStr(str, quantityString));
            }
            onItemClickListener(this.otherViewGroup, 4);
            return;
        }
        DailyStandReport dailyStandReport = (DailyStandReport) report;
        ImageView imageView2 = this.standIconView;
        if (imageView2 != null) {
            imageView2.setImageResource(pni.L3);
        }
        int standCount = dailyStandReport.getStandCount();
        String quantityString2 = getResources().getQuantityString(qxi.A1, standCount, Integer.valueOf(standCount));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "%1d", Arrays.copyOf(new Object[]{Integer.valueOf(standCount)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        TextView textView2 = this.standLableView;
        if (textView2 != null) {
            textView2.setText(getSpannableStr(str2, quantityString2));
        }
        onItemClickListener(this.otherViewGroup, 3);
    }

    @Nullable
    public final DailyGoalReport getGoalReport() {
        return this.goalReport;
    }

    @Nullable
    public final HomeHeaderView getHomeHeaderView() {
        return this.homeHeaderView;
    }

    @Nullable
    public final DataHeaderTargetItemV2View getItem1View() {
        return this.item1View;
    }

    @Nullable
    public final DataHeaderTargetItemV2View getItem2View() {
        return this.item2View;
    }

    @Nullable
    public final DataHeaderTargetItemV2View getItem3View() {
        return this.item3View;
    }

    @Nullable
    public final ImageView getStandIconView() {
        return this.standIconView;
    }

    @Nullable
    public final TextView getStandLableView() {
        return this.standLableView;
    }

    @Nullable
    public final View getTargetContainnerView() {
        return this.targetContainnerView;
    }

    @Nullable
    public final ThreeTargetView getTargetView() {
        return this.targetView;
    }

    @Nullable
    public final TextView getThingNumView() {
        return this.thingNumView;
    }

    @Nullable
    public final ImageView getThingView() {
        return this.thingView;
    }

    /* JADX INFO: renamed from: isFemale, reason: from getter */
    public final boolean getIsFemale() {
        return this.isFemale;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        int dimension = ExtUtilKt.getDimension(ili.j);
        Logger.i(TAG, "onConfigurationChanged running margin=" + dimension);
        ConstraintLayout constraintLayout = this.targetParent;
        if (constraintLayout != null) {
            constraintLayout.setPadding(dimension, 0, dimension, 0);
        }
        ThreeTargetView threeTargetView = this.targetView;
        if (threeTargetView != null) {
            threeTargetView.invalidate();
        }
        setCalorieFoodPaddingEnd();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.root.addView(createContentView(jui.U4));
    }

    public final void refreshAnimation() {
        ThreeTargetView threeTargetView = this.targetView;
        if (threeTargetView != null) {
            threeTargetView.g();
        }
        ThreeTargetView threeTargetView2 = this.targetView;
        if (threeTargetView2 != null) {
            threeTargetView2.k();
        }
    }

    public final void setAddDevListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mAddClickListener = listener;
        HomeHeaderView homeHeaderView = this.homeHeaderView;
        if (homeHeaderView != null) {
            homeHeaderView.setMenuClickListener(listener);
        }
    }

    public final void setFemale(boolean z) {
        this.isFemale = z;
    }

    public final void setGoalReport(@Nullable DailyGoalReport dailyGoalReport) {
        this.goalReport = dailyGoalReport;
    }

    public final void setHomeHeaderView(@Nullable HomeHeaderView homeHeaderView) {
        this.homeHeaderView = homeHeaderView;
    }

    public final void setItem1View(@Nullable DataHeaderTargetItemV2View dataHeaderTargetItemV2View) {
        this.item1View = dataHeaderTargetItemV2View;
    }

    public final void setItem2View(@Nullable DataHeaderTargetItemV2View dataHeaderTargetItemV2View) {
        this.item2View = dataHeaderTargetItemV2View;
    }

    public final void setItem3View(@Nullable DataHeaderTargetItemV2View dataHeaderTargetItemV2View) {
        this.item3View = dataHeaderTargetItemV2View;
    }

    public final void setStandIconView(@Nullable ImageView imageView) {
        this.standIconView = imageView;
    }

    public final void setStandLableView(@Nullable TextView textView) {
        this.standLableView = textView;
    }

    public final void setTargetContainnerView(@Nullable View view) {
        this.targetContainnerView = view;
    }

    public final void setTargetView(@Nullable ThreeTargetView threeTargetView) {
        this.targetView = threeTargetView;
    }

    public final void setThingNumView(@Nullable TextView textView) {
        this.thingNumView = textView;
    }

    public final void setThingView(@Nullable ImageView imageView) {
        this.thingView = imageView;
    }
}

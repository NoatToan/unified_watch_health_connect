package com.xiaomi.hm.health.play.card.health;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.loc.z;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bodyfat.activity.OneFootDetailActivity;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.OneFootUtils;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.databinding.LayoutToolScaleBalanceBinding;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.health.ScaleBalanceRender;
import com.xiaomi.hm.health.play.health.HealthViewModel;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/play/card/health/ScaleBalanceRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolScaleBalanceBinding;", "", AnimatorViewWrapper.TOP_MARGIN, "", "o", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "m", "", "isDeviceActive", GoogleApiAvailabilityLight.b, "", z.j, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "onCardClick", "setUiData", "Lcom/xiaomi/hm/health/play/health/HealthViewModel;", "g", "Lkotlin/Lazy;", hl.k, "()Lcom/xiaomi/hm/health/play/health/HealthViewModel;", "healthViewModel", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "h", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightInfo", "", "i", LogUtil.I, "mUserAge", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ScaleBalanceRender extends AbstractCardRender<LayoutToolScaleBalanceBinding> {
    private static final float j = 18.0f;
    private static final float k = 24.0f;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private WeightInfos weightInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mUserAge;

    /* JADX WARN: Multi-variable type inference failed */
    public ScaleBalanceRender(@NotNull LifecycleOwner lifecycleOwner) {
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.health.ScaleBalanceRender$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.healthViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HealthViewModel>() { // from class: com.xiaomi.hm.health.play.card.health.ScaleBalanceRender$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.health.HealthViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final HealthViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(HealthViewModel.class), function0, objArr);
            }
        });
        k().getScaleBalanceWeightInfo().observe(lifecycleOwner, new Observer() { // from class: jh6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ScaleBalanceRender.h(this.a, (WeightInfos) obj);
            }
        });
        k().getUserAge().observe(lifecycleOwner, new Observer() { // from class: kh6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ScaleBalanceRender.i(this.a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ScaleBalanceRender scaleBalanceRender, WeightInfos weightInfos) {
        scaleBalanceRender.weightInfo = weightInfos;
        scaleBalanceRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ScaleBalanceRender scaleBalanceRender, Integer num) {
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (scaleBalanceRender.mUserAge == 0) {
            scaleBalanceRender.mUserAge = iIntValue;
        }
        if (scaleBalanceRender.mUserAge != iIntValue) {
            scaleBalanceRender.mUserAge = iIntValue;
            scaleBalanceRender.updateUi();
        }
    }

    private final int[] j(Context context) {
        return new int[]{ContextCompat.getColor(context, R.color.play_very_low_color), ContextCompat.getColor(context, R.color.play_low_color), ContextCompat.getColor(context, R.color.play_normal_color), ContextCompat.getColor(context, R.color.play_high_color), ContextCompat.getColor(context, R.color.play_very_high_color)};
    }

    private final HealthViewModel k() {
        return (HealthViewModel) this.healthViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) OneFootDetailActivity.class));
    }

    private final void m(Context context) {
        int length;
        int i;
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        int age = HMPersonInfo.getInstance().getUserInfo().getAge();
        if (age < 20 || age > 69) {
            getBinding().toolScaleBalanceGradeTitle.setVisibility(8);
            getBinding().toolScaleBalanceGrade.setVisibility(8);
            o(j);
            return;
        }
        float[] maxTimeArray = OneFootUtils.getMaxTimeArray(age, userInfo.getGender());
        String[] oneFootFigureLables = HMWeightUtils.getOneFootFigureLables(context);
        int[] iArrJ = j(context);
        WeightInfos weightInfos = this.weightInfo;
        if (weightInfos != null && (length = maxTimeArray.length) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (weightInfos.getOfmt().floatValue() < maxTimeArray[i2] && (i = i2 - 1) >= 0) {
                    getBinding().toolScaleBalanceGrade.setText(oneFootFigureLables[i]);
                    getBinding().toolScaleBalanceGrade.setTextColor(iArrJ[i]);
                    break;
                } else if (i3 >= length) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        getBinding().toolScaleBalanceGradeTitle.setVisibility(0);
        getBinding().toolScaleBalanceGrade.setVisibility(0);
        o(24.0f);
    }

    private final void n(boolean isDeviceActive) {
        if (isDeviceActive) {
            getBinding().toolScaleBalanceImage.setAlpha(1.0f);
            getBinding().toolScaleBalance.setAlpha(1.0f);
            getBinding().toolScaleDeviceStatus.setVisibility(8);
            getBinding().toolScaleBalanceCheck.setVisibility(0);
            getBinding().toolScaleBalanceNotCheck.setVisibility(0);
            getBinding().toolScaleBalanceLayout.setVisibility(0);
            return;
        }
        getBinding().toolScaleBalanceImage.setAlpha(0.4f);
        getBinding().toolScaleBalance.setAlpha(0.4f);
        getBinding().toolScaleDeviceStatus.setAlpha(0.4f);
        getBinding().toolScaleDeviceStatus.setVisibility(0);
        getBinding().toolScaleBalanceCheck.setVisibility(8);
        getBinding().toolScaleBalanceNotCheck.setVisibility(8);
        getBinding().toolScaleBalanceLayout.setVisibility(8);
    }

    private final void o(float topMargin) {
        ViewGroup.LayoutParams layoutParams = getBinding().toolScaleBalanceCheck.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) ViewUtils.dp2px(BraceletApp.getContext(), topMargin);
        getBinding().toolScaleBalanceCheck.setLayoutParams(layoutParams2);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
        if (uiParams.getPlayTool().isDeviceActive()) {
            super.onCardClick(context, uiParams);
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull final Context context, @NotNull CardUiData uiParams) {
        PlayTool playTool;
        CardUiData mUiParam = getMUiParam();
        boolean zIsDeviceActive = (mUiParam == null || (playTool = mUiParam.getPlayTool()) == null) ? false : playTool.isDeviceActive();
        n(zIsDeviceActive);
        if (zIsDeviceActive) {
            getBinding().toolScaleBalanceCheck.setOnClickListener(new View.OnClickListener() { // from class: ih6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScaleBalanceRender.l(context, view);
                }
            });
            WeightInfos weightInfos = this.weightInfo;
            if (weightInfos != null) {
                getBinding().toolScaleBalanceTime.setText(String.valueOf(weightInfos.getOfmt()));
                getBinding().toolScaleBalanceTimeUnit.setText(context.getResources().getQuantityString(R.plurals.play_tool_scale_second_unit, (int) weightInfos.getOfmt().floatValue(), Integer.valueOf((int) weightInfos.getOfmt().floatValue())));
            }
            LayoutToolScaleBalanceBinding binding = getBinding();
            if (this.weightInfo == null) {
                binding.toolScaleBalanceNotCheck.setVisibility(0);
                binding.toolScaleBalanceLayout.setVisibility(8);
                o(j);
            } else {
                binding.toolScaleBalanceNotCheck.setVisibility(8);
                binding.toolScaleBalanceLayout.setVisibility(0);
                m(context);
            }
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolScaleBalanceBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolScaleBalanceBinding.inflate(inflater, rootView, true);
    }
}

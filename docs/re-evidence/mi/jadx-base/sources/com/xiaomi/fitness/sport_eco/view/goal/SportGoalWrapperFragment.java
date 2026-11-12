package com.xiaomi.fitness.sport_eco.view.goal;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.sport_eco.baseui.SportGoalBaseFragment;
import com.xiaomi.fitness.sport_eco.baseui.TitleBar;
import com.xiaomi.fitness.sport_eco.view.goal.SportGoalWrapperFragment;
import defpackage.cki;
import defpackage.e1j;
import defpackage.fvi;
import defpackage.zri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/goal/SportGoalWrapperFragment;", "Lcom/xiaomi/fitness/sport_eco/baseui/SportGoalBaseFragment;", "<init>", "()V", "radioDistance", "Landroid/widget/RadioButton;", "getRadioDistance", "()Landroid/widget/RadioButton;", "setRadioDistance", "(Landroid/widget/RadioButton;)V", "radioMinute", "getRadioMinute", "setRadioMinute", "radioCalories", "getRadioCalories", "setRadioCalories", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "setLayoutResourceId", "", "initView", "", "view", "Landroid/view/View;", "initTab", "getTitleBar", "Lcom/xiaomi/fitness/sport_eco/baseui/TitleBar;", "initPager", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportGoalWrapperFragment extends SportGoalBaseFragment {

    @Nullable
    private RadioButton radioCalories;

    @Nullable
    private RadioButton radioDistance;

    @Nullable
    private RadioButton radioMinute;
    public ViewPager2 viewPager;

    private final void initPager() {
        getViewPager().setOffscreenPageLimit(2);
        getViewPager().setAdapter(new SportGoalWrapperAdapter(this, this.sportType, this.deviceType));
        getViewPager().k(0, false);
        getViewPager().setUserInputEnabled(false);
    }

    private final void initTab() {
        int i = this.sportType;
        if (i != 3 || this.deviceType != 0) {
            if (i == 14 && this.deviceType == 1) {
                RadioButton radioButton = this.radioDistance;
                Intrinsics.checkNotNull(radioButton);
                radioButton.setText(getString(e1j.y3));
                return;
            }
            return;
        }
        RadioButton radioButton2 = this.radioDistance;
        Intrinsics.checkNotNull(radioButton2);
        radioButton2.setVisibility(8);
        RadioButton radioButton3 = this.radioDistance;
        Intrinsics.checkNotNull(radioButton3);
        radioButton3.setChecked(false);
        RadioButton radioButton4 = this.radioMinute;
        Intrinsics.checkNotNull(radioButton4);
        radioButton4.setChecked(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(SportGoalWrapperFragment this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == zri.z1) {
            this$0.getViewPager().k(0, false);
            return;
        }
        int i2 = 1;
        if (i != zri.B1) {
            if (i == zri.y1) {
                ViewPager2 viewPager = this$0.getViewPager();
                int i3 = this$0.sportType;
                viewPager.k(((i3 == 3 || i3 == 7) && this$0.deviceType == 0) ? 1 : 2, false);
                return;
            }
            return;
        }
        ViewPager2 viewPager2 = this$0.getViewPager();
        int i4 = this$0.sportType;
        if ((i4 == 3 || i4 == 7) && this$0.deviceType == 0) {
            i2 = 0;
        }
        viewPager2.k(i2, false);
    }

    @Nullable
    public final RadioButton getRadioCalories() {
        return this.radioCalories;
    }

    @Nullable
    public final RadioButton getRadioDistance() {
        return this.radioDistance;
    }

    @Nullable
    public final RadioButton getRadioMinute() {
        return this.radioMinute;
    }

    @NotNull
    public final ViewPager2 getViewPager() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        return null;
    }

    @Override // com.xiaomi.fitness.sport_eco.baseui.SportGoalBaseFragment
    public void initView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TitleBar titleBar = (TitleBar) view.findViewById(zri.W2);
        Intrinsics.checkNotNull(titleBar);
        titleBar.getTitleView().setText(getString(e1j.g4));
        titleBar.getTitleView().setTextColor(ExtUtilsKt.getColor(cki.p));
        this.radioDistance = (RadioButton) view.findViewById(zri.z1);
        this.radioMinute = (RadioButton) view.findViewById(zri.B1);
        this.radioCalories = (RadioButton) view.findViewById(zri.y1);
        setViewPager((ViewPager2) view.findViewById(zri.B3));
        View viewFindViewById = view.findViewById(zri.A1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RadioGroup radioGroup = (RadioGroup) viewFindViewById;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.deviceType = arguments.getInt("DEVICE_TYPE", 0);
            this.sportType = arguments.getInt("KEY_SPORT_TYPE", 1);
        }
        initTab();
        initPager();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: vnn
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i) {
                SportGoalWrapperFragment.initView$lambda$1(this.f37069a, radioGroup2, i);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_eco.baseui.SportGoalBaseFragment
    public int setLayoutResourceId() {
        return fvi.T;
    }

    public final void setRadioCalories(@Nullable RadioButton radioButton) {
        this.radioCalories = radioButton;
    }

    public final void setRadioDistance(@Nullable RadioButton radioButton) {
        this.radioDistance = radioButton;
    }

    public final void setRadioMinute(@Nullable RadioButton radioButton) {
        this.radioMinute = radioButton;
    }

    public final void setViewPager(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<set-?>");
        this.viewPager = viewPager2;
    }

    @Override // com.xiaomi.fitness.sport_eco.baseui.SportGoalBaseFragment
    @Nullable
    public TitleBar getTitleBar() {
        View view = getView();
        if (view != null) {
            return (TitleBar) view.findViewById(zri.W2);
        }
        return null;
    }
}
